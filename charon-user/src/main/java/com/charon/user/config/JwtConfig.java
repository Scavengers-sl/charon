package com.charon.user.config;

/**
 * @author zgrj
 */
//@Configuration
//public class JwtConfig {
//
//    public final JwtAccessTokenConverter jwtAccessTokenConverter;
//
//    public JwtConfig(JwtAccessTokenConverter jwtAccessTokenConverter) {
//        this.jwtAccessTokenConverter = jwtAccessTokenConverter;
//    }
//
//    @Bean
//    @Qualifier("tokenStore")
//    public TokenStore tokenStore() {
//        return new JwtTokenStore(jwtAccessTokenConverter);
//    }
//
//    @Bean
//    public JwtAccessTokenConverter jwtTokenEnhancer() {
//        JwtAccessTokenConverter converter = new JwtAccessTokenConverter();
//        Resource resource = new ClassPathResource("public.cert");
//        String publicKey;
//        try {
//            publicKey = new String(FileCopyUtils.copyToByteArray(resource.getInputStream()));
//        } catch (IOException e) {
//            throw new RuntimeException();
//        }
//        converter.setVerifierKey(publicKey);
//        return converter;
//    }
//
//}