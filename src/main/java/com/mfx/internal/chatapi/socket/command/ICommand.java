package com.mfx.internal.chatapi.socket.command;

import com.mfx.internal.chatapi.socket.request.BaseSocketRequest;

public interface ICommand {
    void preProcess(BaseSocketRequest socketRequest);
    void process(BaseSocketRequest socketRequest);
    void postProcess(BaseSocketRequest socketRequest);
    default void execute(BaseSocketRequest socketRequest){
        preProcess(socketRequest);
        process(socketRequest);
        postProcess(socketRequest);
    }
}
