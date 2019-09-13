package mockqq.model

import javax.validation.constraints.{Email, NotBlank}
import lombok.Data
import org.springframework.context.annotation.Bean

import scala.beans.BeanProperty

class NewUser {
  @NotBlank @Email
  var email: String = _
  @NotBlank
  var password: String = _
}
