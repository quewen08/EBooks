package com.njcc.ebooks.bean;

/**
 * Created by Trover on 2016/6/21.
 * 响应实体类
 */
public class NetResponse {

    private int mCode;       // 错误码
    private Object mMessage; // 错误详情

    public NetResponse(int code, Object message) {
        mCode = code;
        mMessage = message;
    }

    public int getCode() {
        return mCode;
    }

    public void setCode(int code) {
        mCode = code;
    }

    public Object getMessage() {
        return mMessage;
    }

    public void setMessage(Object message) {
        mMessage = message;
    }
}