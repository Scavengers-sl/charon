package com.charon.common.utils;

import com.charon.common.constant.ResultStateCode;
import com.charon.common.model.vo.ResultVo;

/**
 * @author by sl
 * @ todo TODO
 * @ date 2020/4/16 3:41 下午
 */
public class ResultVoUtil {

    /**
     * 请求成功
     *
     * @param <T> t
     * @return void
     */
    public static <T> ResultVo<T> success() {
        return new ResultVo<>();
    }

    /**
     * 请求成功并饭回数据
     *
     * @param data data
     * @param <T>  data
     * @return ResultVo
     */
    public static <T> ResultVo<T> success(T data) {
        return new ResultVo<>(data);
    }

    /**
     * 请求失败
     *
     * @param data data
     * @param <T>  data
     * @return ResultVo
     */
    public static <T> ResultVo<T> failure(T data) {
        return new ResultVo<>(data);
    }

    /**
     * 请求失败
     *
     * @param stateCode stateCode
     * @param <T>       data
     * @return ResultVo
     */
    public static <T> ResultVo<T> failure(ResultStateCode stateCode) {
        return new ResultVo<>(stateCode);
    }
}
