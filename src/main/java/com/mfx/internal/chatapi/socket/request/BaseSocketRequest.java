package com.mfx.internal.chatapi.socket.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Map;

/**
 * TTCGOKCEL
 **/
@ToString
@Getter
@Setter
public class BaseSocketRequest implements Serializable {
    protected Map<String, Object> inputMap;
}
