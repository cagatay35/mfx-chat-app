package com.mfx.internal.chatapi.service;

import com.mfx.internal.chatapi.data.dto.MessageDto;
import com.mfx.internal.chatapi.data.entity.Message;
import com.mfx.internal.chatapi.data.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * TTCGOKCEL
 **/
@Service
@Transactional
public class MessagingService {

    @Autowired
    protected MessageRepository messageRepository;


    public void create(String senderUserId, String receiverUserId, String messageContent) {
        Message message = new Message();
        message.setMessage(messageContent);
        message.setSenderUserId(senderUserId);
        message.setReceiverUserId(receiverUserId);
        messageRepository.save(message);
    }


}
