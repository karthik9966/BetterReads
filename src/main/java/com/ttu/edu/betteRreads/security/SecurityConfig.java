package com.ttu.edu.betterReads.security;

import static org.springframework.security.config.Customizer.*;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig{
    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception
    {
        return httpSecurity
                .authorizeHttpRequests((authorize) ->
                {
                    authorize.requestMatchers("/", "/error").permitAll()
                            .anyRequest().authenticated();
                })
                .oauth2Login(withDefaults()).build();
    }
}
