package com.mfx.internal.chatapi.socket.command;

import com.mfx.internal.chatapi.socket.request.BaseSocketRequest;
import lombok.Getter;
import lombok.Setter;

/**
 * TTCGOKCEL
 **/
@Getter
@Setter
public abstract class AbstractCommand implements ICommand {

    protected String name;

    @Override
    public void preProcess(BaseSocketRequest socketRequest) {

    }

    @Override
    public void postProcess(BaseSocketRequest socketRequest) {

    }

}
