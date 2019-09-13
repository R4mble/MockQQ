package mockqq.config

import org.springframework.context.annotation.Configuration
import org.springframework.messaging.simp.config.MessageBrokerRegistry
import org.springframework.web.socket.config.annotation.{EnableWebSocketMessageBroker, StompEndpointRegistry, WebSocketMessageBrokerConfigurer}

@Configuration
@EnableWebSocketMessageBroker
class WebSocketStompConfig extends WebSocketMessageBrokerConfigurer {

  override def registerStompEndpoints(registry: StompEndpointRegistry): Unit =
    registry.addEndpoint("endpoint").setAllowedOrigins("*").withSockJS()

  override def configureMessageBroker(registry: MessageBrokerRegistry): Unit = {
    registry.enableSimpleBroker("/topic", "/queue")
    registry.setApplicationDestinationPrefixes("/app")
  }

}
