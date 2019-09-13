package mockqq.mapper

import mockqq.entity.ChatUser
import mockqq.model.NewUser
import org.apache.ibatis.annotations.{Delete, Insert, Select}


trait UserMapper {

  @Insert(Array("insert into chat_user(email, password) values(#{email}, #{password})"))
  def save(user: NewUser): Boolean

  @Delete(Array("delete from chat_user where id = #{id}"))
  def delete(id: Long): Boolean

  @Select(Array("select * from chat_user where id = #{id}"))
  def get(id: Long): Boolean

  def update(user: ChatUser): Boolean
}
