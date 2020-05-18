package com.charon.exchange.model.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * @author by sl
 * @ todo TODO
 * @ date 2020/4/17 1:56 下午
 */
@Data
public class CreateOrderDto {

    @ApiModelProperty("币ID")
    @NotNull(message = "币种不能为空")
    private Short coinId;

    @ApiModelProperty("交易币ID")
    @NotNull(message = "交易币种不能为空")
    private Short tradeCoinId;

    @ApiModelProperty("数量")
    @NotNull(message = "交易数量不能为空")
    private BigDecimal amount;

    @ApiModelProperty("价格")
    @NotNull(message = "交易价格不能为空")
    private BigDecimal price;

    @ApiModelProperty("交易类型（1买2卖）")
    @NotNull(message = "交易类型不能为空")
    private Short tradeType;

}
