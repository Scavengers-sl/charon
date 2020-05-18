package com.charon.auth.config;

import com.charon.auth.security.UserDetailsServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author by sl
 * @ todo TODO
 * @ date 2020/3/28 6:57 下午
 */
/*
@EnableWebFluxSecurity
public class WebSecurityConfig {

    private final DefaultLoginFailureHandle loginFailureHandle;

    private final DefaultLoginSuccessHandle loginSuccessHandle;

    public WebSecurityConfig(DefaultLoginFailureHandle loginFailureHandle, DefaultLoginSuccessHandle loginSuccessHandle) {
        this.loginFailureHandle = loginFailureHandle;
        this.loginSuccessHandle = loginSuccessHandle;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityWebFilterChain securityFilterChain(ServerHttpSecurity httpSecurity) {
        return httpSecurity
                .csrf().disable()
                .authorizeExchange()
                .pathMatchers(HttpMethod.OPTIONS, "/login")
                .permitAll()
                .anyExchange()
                .authenticated()
                .and()
                .formLogin()
                .loginPage("/login")
                .authenticationSuccessHandler(loginSuccessHandle)
                .authenticationFailureHandler(loginFailureHandle)
                .authenticationEntryPoint((swe, e) -> Mono.fromRunnable(() ->
                        swe.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED)))
                .and()
                .exceptionHandling()
                .accessDeniedHandler((swe, e) -> Mono.fromRunnable(() ->
                        swe.getResponse().setStatusCode(HttpStatus.FORBIDDEN)))
                .and()
                .oauth2Client()
                .and()
                .build();
    }
}
*/

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    private final UserDetailsServiceImpl userDetailsService;

    public WebSecurityConfig(UserDetailsServiceImpl userDetailsService) {
        this.userDetailsService = userDetailsService;
    }


    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
        super.configure(auth);
    }

    @Override
    @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf()
                .disable()
                .authorizeRequests()
                .antMatchers(HttpMethod.OPTIONS, "/login")
                .permitAll()
                .and()
                .formLogin()
                .permitAll();
    }


}


