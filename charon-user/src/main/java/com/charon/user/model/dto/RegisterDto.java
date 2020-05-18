package com.charon.user.model.dto;

import com.charon.common.utils.RegexpUtil;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * @author by sl
 * @ todo TODO
 * @ date 2020/4/24 3:05 下午
 */
@Data
public class RegisterDto {

    @ApiModelProperty("手机号")
    @Pattern(regexp = RegexpUtil.REGEX_MOBILE, message = "请输入正确的手机号")
    private String telephone;

    @ApiModelProperty("密码")
    @NotNull(message = "请输入密码")
    @Pattern(regexp = RegexpUtil.REGEX_PASSWORD, message = "8-20位字符 不能为纯数字")
    private String password;

    @ApiModelProperty("昵称")
    private String username;

    @ApiModelProperty("邮箱")
    @Pattern(regexp = RegexpUtil.REGEX_EMAIL, message = "请输入正确的邮箱")
    private String email;

    @ApiModelProperty("验证码")
    @NotNull(message = "请输入短信验证码")
    private String code;

    @ApiModelProperty("国籍")
    @NotNull(message = "请选择国籍")
    private String nationality;

    @ApiModelProperty("国家码")
    @NotNull(message = "请选择注册国家")
    private String countryCode;

}
