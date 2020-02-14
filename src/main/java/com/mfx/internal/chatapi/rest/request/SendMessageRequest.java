package com.mfx.internal.chatapi.rest.request;

import lombok.Getter;
import lombok.Setter;

/**
 * TTCGOKCEL
 **/
@Getter
@Setter
public class SendMessageRequest {
    private String message;
    private String receiverUserId;
    private String conversationId;
}
