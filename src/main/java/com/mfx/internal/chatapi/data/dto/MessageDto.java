package com.mfx.internal.chatapi.data.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * TTCGOKCEL
 **/
@Getter
@Setter
public class MessageDto {
    private String id;
    private String message;
    private String senderUserId;
    private String receiverUserId;
}
