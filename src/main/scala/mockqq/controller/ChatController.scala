package mockqq.controller

import org.springframework.messaging.handler.annotation.{MessageMapping, SendTo}
import org.springframework.stereotype.Controller

@Controller
class ChatController {

  @MessageMapping(Array("/chat"))
  @SendTo(Array("/topic/chat"))
  def chat(msg: String): String = {
    println("收到: " + msg)
    "chat"
  }
}
