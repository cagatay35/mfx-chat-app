package com.mfx.internal.chatapi.rest.controller;

import com.mfx.internal.chatapi.data.entity.Message;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

/**
 * TTCGOKCEL
 **/
@RestController
@RequestMapping(value = "/message")
public class MessageController {

    @GetMapping(value = "/dummy")
    public @ResponseBody
    ResponseEntity<String> dummy() {
        return new ResponseEntity<>("DUMMY MESSAGE", HttpStatus.OK);
    }

    @GetMapping(value = "/chats/stream", produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
    public Flux<Message> streamMessages(@RequestParam String channelId){
        return Flux.just(new Message());
    }
}
