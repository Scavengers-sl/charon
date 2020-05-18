package com.charon.auth.utils;

/**
 * webflux response util
 *
 * @author sl
 */
//@Slf4j
//public class ServerHttpResponseUtil {
//
//    /**
//     * JSON输出形式输出对象
//     *
//     * @param response response
//     * @param object object
//     * @return Void
//     */
//    public static Mono<Void> writeObjectAsJson(ServerHttpResponse response, Object object) {
//        return response.writeWith(Flux.create(sink -> {
//            ObjectMapper objectMapper = new ObjectMapper();
//            NettyDataBufferFactory nettyDataBufferFactory = new NettyDataBufferFactory(new UnpooledByteBufAllocator(false));
//            try {
//                DataBuffer dataBuffer = nettyDataBufferFactory.wrap(objectMapper.writeValueAsString(object).getBytes());
//                sink.next(dataBuffer);
//            } catch (JsonProcessingException e) {
//                log.error("response 响应转换错误==================>",e);
//            }
//            sink.complete();
//        }));
//    }
//}

