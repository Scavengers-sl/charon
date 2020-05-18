package com.charon.exchange.disruptor.factory;

import com.charon.exchange.disruptor.event.TransactionOrderEvent;
import com.lmax.disruptor.EventFactory;

/**
 * @author by sl
 * @ todo TODO
 * @ date 2020/4/14 4:34 下午
 */
public class TransactionOrderEventFactory implements EventFactory<TransactionOrderEvent> {
    @Override
    public TransactionOrderEvent newInstance() {
        return new TransactionOrderEvent();
    }
}
