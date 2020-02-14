package com.mfx.internal.chatapi.data.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

/**
 * TTCGOKCEL
 **/
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Message {
    @Id
    private String id;
    private String message;
    private String senderUserId;
    private String receiverUserId;



}
