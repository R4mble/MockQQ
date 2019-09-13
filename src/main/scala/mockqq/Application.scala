package mockqq

import org.mybatis.spring.annotation.MapperScan
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
@EntityScan(Array("mockqq.entity"))
@MapperScan(Array("mockqq.mapper"))
class Application

object Application extends App {
  SpringApplication.run(classOf[Application])
}
