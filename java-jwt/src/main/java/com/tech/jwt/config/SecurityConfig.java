package com.tech.jwt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
public class SecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests()
                .anyRequest()
                .authenticated()
//                .and()//and untuk penambahan kebutuhan
//                .formLogin()//digunakan untuk generate formLogin, kalau di comment bentuknya seperti modal saja
                .and()
                .httpBasic();
        return http.build();
    }
}
