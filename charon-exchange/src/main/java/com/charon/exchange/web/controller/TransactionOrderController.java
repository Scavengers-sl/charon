package com.charon.exchange.web.controller;

import com.charon.common.model.vo.ResultVo;
import com.charon.exchange.disruptor.event.TransactionOrderEvent;
import com.charon.exchange.model.dto.CreateOrderDto;
import com.charon.exchange.service.TransactionOrderService;
import com.lmax.disruptor.RingBuffer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.nio.ByteBuffer;

/**
 * @author by sl
 * @ todo TODO
 * @ date 2020/4/14 5:27 下午
 */

@RestController
@RequestMapping("/exchange/transaction")
//@Api(tags = "委托单管理")
public class TransactionOrderController {

    private final TransactionOrderService transactionOrderService;

    private final RingBuffer<TransactionOrderEvent> ringBuffer;

    public TransactionOrderController(RingBuffer<TransactionOrderEvent> ringBuffer, TransactionOrderService transactionOrderService) {
        this.ringBuffer = ringBuffer;
        this.transactionOrderService = transactionOrderService;
    }

    @PostMapping("/create")
//    @ApiOperation("创建委托单")
    public Mono<ResultVo<Void>> create(@RequestBody CreateOrderDto createOrderDto) {
        // 校验是否可以发布
        ByteBuffer bb = ByteBuffer.allocate(8);
        ringBuffer.publishEvent((event, sequence, buffer) -> event.setCreateOrderDto(createOrderDto), bb);
        return Mono.empty();
    }

}
