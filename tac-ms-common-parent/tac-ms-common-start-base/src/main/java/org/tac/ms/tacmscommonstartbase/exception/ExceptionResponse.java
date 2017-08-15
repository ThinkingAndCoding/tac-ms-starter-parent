package org.tac.ms.tacmscommonstartbase.exception;

import java.io.Serializable;

/**
 * 返回的json数据
 * @author zhangdong
 *
 */
public class ExceptionResponse implements Serializable {

    private String message;
    private Integer code;

    /**
     * Construction Method
     * @param code
     * @param message
     */
    public ExceptionResponse(Integer code, String message){
        this.message = message;
        this.code = code;
    }

    public static ExceptionResponse create(Integer code, String message){
        return new ExceptionResponse(code, message);
    }

    public Integer getCode() {
        return code;
    }
    public String getMessage() {
        return message;
    }

}