package mockqq.controller

import javax.validation.Valid
import mockqq.model.NewUser
import mockqq.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{PostMapping, RequestBody, RequestMapping, RestController}

@RestController
@RequestMapping(Array("/user"))
class UserController @Autowired()(private val userService: UserService){

  @PostMapping(Array("/register"))
  def register(@Valid @RequestBody user: NewUser): Boolean = {
    userService.save(user)
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
