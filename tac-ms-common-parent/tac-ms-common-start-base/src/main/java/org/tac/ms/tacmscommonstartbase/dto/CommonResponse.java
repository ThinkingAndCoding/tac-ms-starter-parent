package org.tac.ms.tacmscommonstartbase.dto;

import java.io.Serializable;

/**
 * 返回的json数据
 * @author zhangdong
 *
 */
public class CommonResponse<T extends Serializable> implements Serializable {

    private String message;
    private Integer code;
    private T data;
    public CommonResponse(){}
    public CommonResponse(Integer code, String message){
        this.message = message;
        this.code = code;
    }
    /**
     * Construction Method
     * @param code
     * @param message
     */
    public CommonResponse(Integer code, String message, T data){
        this.message = message;
        this.code = code;
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}