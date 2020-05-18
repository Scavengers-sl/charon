package com.charon.exchange.disruptor.event;

import com.charon.exchange.model.dto.CreateOrderDto;
import lombok.Data;

/**
 * @author by sl
 * @ todo TODO
 * @ date 2020/4/14 4:32 下午
 */
@Data
public class TransactionOrderEvent {

    private CreateOrderDto createOrderDto;

}
