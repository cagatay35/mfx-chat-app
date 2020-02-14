package com.mfx.internal.chatapi.socket.command.impl;

import com.mfx.internal.chatapi.socket.command.AbstractCommand;
import com.mfx.internal.chatapi.socket.command.ICommand;
import com.mfx.internal.chatapi.socket.request.BaseSocketRequest;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * TTCGOKCEL
 **/
@Getter
@Setter
@Slf4j
public class SendMessageCommand extends AbstractCommand implements ICommand {

    public SendMessageCommand() {
        this.name = "sendMessageCommand";
    }


    @Override
    public void process(BaseSocketRequest socketRequest) {

    }


}
