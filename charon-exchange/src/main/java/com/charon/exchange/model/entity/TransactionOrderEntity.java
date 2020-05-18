package com.charon.exchange.model.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * @author by sl
 * @ todo TODO
 * @ date 2020/4/14 4:38 下午
 */
@Data
public class TransactionOrderEntity {

    /**
     * 交易ID
     */
    @TableId
    private Long transactionId;

    /**
     * 用户ID
     */
    private Long userId;
}
