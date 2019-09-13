package mockqq.model

import javax.validation.constraints.{Email, NotNull}

case class NewUser(@NotNull @Email email: String,
                   @NotNull password: String)
