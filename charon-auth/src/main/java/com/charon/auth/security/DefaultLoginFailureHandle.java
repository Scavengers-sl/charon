package com.charon.auth.security;

/**
 * @author by sl
 * @ todo TODO
 * @ date 2020/4/28 11:30
 */
//@Component
//@Slf4j
//public class DefaultLoginFailureHandle implements ServerAuthenticationFailureHandler {
//    /**
//     * 登陆失败处理
//     * @param webFilterExchange webFilterExchange
//     * @param exception exception
//     * @return result
//     */
//    @Override
//    public Mono<Void> onAuthenticationFailure(WebFilterExchange webFilterExchange, AuthenticationException exception) {
//        log.error("登陆异常=================>{}",exception.getMessage());
//        ResultVo<Void> resultVo;
//        //密码错误
//        if (exception instanceof BadCredentialsException) {
//            resultVo = ResultVoUtil.failure(AuthStateCodeEnum.USER_PASSWORD_ERROR);
//        } else if (exception instanceof LockedException) {
//            //账户被锁
//            resultVo = ResultVoUtil.failure(AuthStateCodeEnum.USER_IS_LOCK);
//        } else if (exception instanceof DisabledException) {
//            //账户未启用
//            resultVo = ResultVoUtil.failure(AuthStateCodeEnum.USER_IS_DISABLE);
//        } else if (exception instanceof CredentialsExpiredException) {
//            //账户过期
//            resultVo = ResultVoUtil.failure(AuthStateCodeEnum.USER_IS_EXPIRED);
//        } else if (exception instanceof UsernameNotFoundException) {
//            //账户不存在
//            resultVo = ResultVoUtil.failure(AuthStateCodeEnum.USER_NOT_EXIST);
//        } else {
//            //其他情况
//            resultVo = ResultVoUtil.failure(CommonStateCodeEnum.SERVER_ERROR);
//        }
//        ServerHttpResponse response = webFilterExchange.getExchange().getResponse();
//        return ServerHttpResponseUtil.writeObjectAsJson(response,resultVo);
//    }
//}
