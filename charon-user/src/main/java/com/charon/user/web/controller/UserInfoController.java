package com.charon.user.web.controller;

import com.charon.common.model.vo.ResultVo;
import com.charon.common.utils.ResultVoUtil;
import com.charon.user.model.dto.RegisterDto;
import com.charon.user.service.UserInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @author by sl
 * @ todo TODO
 * @ date 2020/3/31 3:06 下午
 */
@RestController
@RequestMapping("/user")
@Api(tags = "用户管理")
public class UserInfoController {

    private final UserInfoService userInfoService;

    public UserInfoController(UserInfoService userInfoService) {
        this.userInfoService = userInfoService;
    }

    @PostMapping("/register")
    @ApiOperation("注册")
    public Mono<ResultVo<Void>> register(@RequestBody RegisterDto registerDto) {
        int count = userInfoService.register(registerDto);
        return Mono.just(ResultVoUtil.success());
    }
}
