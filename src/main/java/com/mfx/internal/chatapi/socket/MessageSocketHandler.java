package com.mfx.internal.chatapi.socket;

import com.mfx.internal.chatapi.service.ConversationService;
import com.mfx.internal.chatapi.service.MessagingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

/**
 * TTCGOKCEL
 **/
@Slf4j
@Component
public class MessageSocketHandler  implements org.springframework.web.reactive.socket.WebSocketHandler {

    @Autowired
    private MessagingService messagingService;

    @Autowired
    private ConversationService conversationService;


    @Override
    public Mono<Void> handle(org.springframework.web.reactive.socket.WebSocketSession webSocketSession) {
        return webSocketSession
                .send(webSocketSession.receive()
                        .map(msg -> "RECEIVED ON SERVER :: " + msg.getPayloadAsText())
                        .map(webSocketSession::textMessage)
                );
    }
}
