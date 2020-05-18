package com.charon.exchange.service;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author by sl
 * @ todo TODO
 * @ date 2020/4/21 2:04 下午
 */
@Api(tags = "委托单管理")
@FeignClient("CHARON-USER")
@RestController
public interface TransactionOrderService {

    @ApiOperation("创建委托单")
    @GetMapping("/test")
    void test();
}
