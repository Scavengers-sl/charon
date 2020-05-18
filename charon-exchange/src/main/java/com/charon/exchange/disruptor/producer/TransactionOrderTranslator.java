package com.charon.exchange.disruptor.producer;

import com.charon.exchange.disruptor.event.TransactionOrderEvent;
import com.charon.exchange.model.dto.CreateOrderDto;
import com.lmax.disruptor.EventTranslatorOneArg;

/**
 * @author by sl
 * @ todo TODO
 * @ date 2020/4/14 5:31 下午
 */
public class TransactionOrderTranslator implements EventTranslatorOneArg<TransactionOrderEvent, CreateOrderDto> {

    @Override
    public void translateTo(TransactionOrderEvent event, long sequence, CreateOrderDto data) {
        event.setCreateOrderDto(data);
    }
}
