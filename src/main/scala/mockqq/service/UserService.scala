package mockqq.service

import mockqq.mapper.UserMapper
import mockqq.model.NewUser
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserService @Autowired()(private val userMapper: UserMapper) {

  def save(user: NewUser): Boolean = {
    userMapper.save(user)
  }


}
