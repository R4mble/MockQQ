package mockqq.controller

import org.springframework.web.bind.annotation.{PostMapping, RequestMapping, RestController}

@RestController
@RequestMapping(Array("/user"))
class UserController {

  @PostMapping(Array("/register"))
  def register(): String = {
    ""
  }

  @PostMapping(Array("/login"))
  def login(): String = {
    ""
  }

  @PostMapping(Array("/active"))
  def active(): String = {
    ""
  }
}
