package mockqq

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.{GetMapping, RestController}

@SpringBootApplication
@RestController
class Application {
  @GetMapping(Array("/"))
  def hello(): String = {
     "Hello, Scala"
  }
}

object Application extends App {
  SpringApplication.run(classOf[Application])
}
