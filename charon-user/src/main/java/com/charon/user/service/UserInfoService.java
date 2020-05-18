package com.charon.user.service;

import com.charon.user.model.dto.RegisterDto;

/**
 * @author by sl
 * @ todo TODO
 * @ date 2020/5/14 16:03
 */
public interface UserInfoService {

    /**
     * 用户注册
     *
     * @param registerDto registerDto
     * @return int
     */
    int register(RegisterDto registerDto);
}
