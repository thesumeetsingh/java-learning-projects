package com.sumeet.SpringSecurity.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity){

//        httpSecurity.csrf(customizer->customizer.disable());      ->disables csrf token, hence no csrf token needed for state change calls
//        httpSecurity.authorizeHttpRequests(request-> request.anyRequest().authenticated());  ->enables authorization required in custom security filter chain
//        httpSecurity.formLogin(Customizer.withDefaults());                 -> enables form login in browser, disable this to work with session creation policy so that new login is not required each time
//        httpSecurity.httpBasic(Customizer.withDefaults());                -> enables working in api calls using postman etc
//        httpSecurity.sessionManagement(session-> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));   ->enables stateless

        //builder pattern
        httpSecurity
                .csrf(customizer->customizer.disable())
                .authorizeHttpRequests(request-> request.anyRequest().authenticated())
                .httpBasic(Customizer.withDefaults())
                .sessionManagement(
                        session-> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
//        httpSecurity.formLogin(Customizer.withDefaults());

        return httpSecurity.build();
    }
}
