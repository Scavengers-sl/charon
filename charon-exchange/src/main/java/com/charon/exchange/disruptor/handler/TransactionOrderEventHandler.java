package com.charon.exchange.disruptor.handler;

import com.charon.exchange.disruptor.event.TransactionOrderEvent;
import com.lmax.disruptor.EventHandler;

/**
 * @author by sl
 * @ todo TODO
 * @ date 2020/4/14 4:37 下午
 */
public class TransactionOrderEventHandler implements EventHandler<TransactionOrderEvent> {
    @Override
    public void onEvent(TransactionOrderEvent event, long sequence, boolean endOfBatch) {
        System.out.println(event.getCreateOrderDto());
    }
}
