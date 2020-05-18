package com.charon.common.model.vo;

import com.charon.common.constant.ResultStateCode;
import lombok.Data;

/**
 * @author by sl
 * @ todo TODO
 * @ date 2020/4/16 3:40 下午
 */
@Data
public class ResultVo<T> {

    /**
     * 响应code码
     */
    private int code = 200;

    /**
     * 响应消息
     */
    private String msg = "success";

    /**
     * 响应数据
     */
    private T data = null;

    public ResultVo() {
    }

    public ResultVo(T data) {
        this.data = data;
    }


    public ResultVo(ResultStateCode stateCode) {
        this.code = stateCode.getCode();
        this.msg = stateCode.getMsg();
    }
}
