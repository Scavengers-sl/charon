package com.charon.common.enums;

import com.charon.common.constant.ResultStateCode;

/**
 * @author by sl
 * @ todo TODO
 * @ date 2020/4/29 10:47
 */
public enum CommonStateCodeEnum implements ResultStateCode {

    /**
     * 服务异常
     */
    SERVER_ERROR(5000, "服务异常");

    private int code;

    private String msg;

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getMsg() {
        return msg;
    }

    CommonStateCodeEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
