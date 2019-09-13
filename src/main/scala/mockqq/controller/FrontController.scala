package mockqq.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.{GetMapping, RequestMapping}

@Controller
class FrontController {

  @RequestMapping(Array("/home"))
  def home(): String = {
    "index"
  }
}
