package com.charon.auth.enums;

import com.charon.common.constant.ResultStateCode;

/**
 * @author by sl
 * @ todo TODO
 * @ date 2020/4/28 11:50
 */
public enum AuthStateCodeEnum implements ResultStateCode {

    /**
     * 用户不存在
     */
    USER_NOT_EXIST(2001, "用户不存在"),

    /**
     * 用户名或密码错误
     */
    USER_PASSWORD_ERROR(2002, "用户名或密码错误"),

    /**
     * 用户被锁定
     */
    USER_IS_LOCK(2003, "用户被锁定"),

    /**
     * 用户被禁用
     */
    USER_IS_DISABLE(2004, "用户被禁用"),

    /**
     * 用户已过期
     */
    USER_IS_EXPIRED(2005, "用户已过期"),
    ;

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

    AuthStateCodeEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }


}
