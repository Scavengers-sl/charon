package com.charon.user.service.impl;

import com.charon.user.dao.UserInfoDao;
import com.charon.user.model.dto.RegisterDto;
import com.charon.user.service.UserInfoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author by sl
 * @ todo TODO
 * @ date 2020/5/14 16:04
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    private final UserInfoDao userInfoDao;

    public UserInfoServiceImpl(UserInfoDao userInfoDao) {
        this.userInfoDao = userInfoDao;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public int register(RegisterDto registerDto) {
        return 0;
    }
}
