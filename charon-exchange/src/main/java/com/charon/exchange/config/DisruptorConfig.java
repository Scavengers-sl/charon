package com.charon.exchange.config;

import com.charon.exchange.disruptor.event.TransactionOrderEvent;
import com.lmax.disruptor.RingBuffer;
import com.lmax.disruptor.YieldingWaitStrategy;
import com.lmax.disruptor.dsl.Disruptor;
import com.lmax.disruptor.dsl.ProducerType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.Executors;

/**
 * @author by sl
 * @ todo TODO
 * @ date 2020/4/14 4:56 下午
 */
@Configuration
public class DisruptorConfig {

    @Bean
    public RingBuffer<TransactionOrderEvent> disruptor() {
        Disruptor<TransactionOrderEvent> disruptor = new Disruptor<>(
                TransactionOrderEvent::new,
                1024 * 1024,
                Executors.defaultThreadFactory(),
                ProducerType.SINGLE,
                new YieldingWaitStrategy()
        );
        // Connect the handler
        disruptor.handleEventsWith((event, sequence, endOfBatch) -> System.out.println("Event: " + event));
        // Start the Disruptor, starts all threads running
        disruptor.start();
        // Get the ring buffer from the Disruptor to be used for publishing.
        return disruptor.getRingBuffer();
    }
}
