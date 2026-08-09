package com.sumeet.SpringSecurity.config;


import com.sumeet.SpringSecurity.service.MyUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private JWTFilter jwtFilter;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity){

//        httpSecurity.csrf(customizer->customizer.disable());      ->disables csrf token, hence no csrf token needed for state change calls
//        httpSecurity.authorizeHttpRequests(request-> request.anyRequest().authenticated());  ->enables authorization required in custom security filter chain
//        httpSecurity.formLogin(Customizer.withDefaults());
//        httpSecurity.httpBasic(Customizer.withDefaults());                -> enables working in api calls using postman etc
//        httpSecurity.sessionManagement(session-> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));   ->enables stateless

        //formlogin used to authenticate once and keep user logged in using http session,
        // but stateless session creation policy enables keeping no session,
        // hence after succesfull form login there is nowhere to store
        // the session id hence formlogin and stateless session cration policy
        // should not be used together

        //builder pattern
        return httpSecurity
                .csrf(customizer->customizer.disable())
                .authorizeHttpRequests(request-> request
                        .requestMatchers("/register", "/login")
                        .permitAll()
                        .anyRequest().authenticated())
                .httpBasic(Customizer.withDefaults())
                .sessionManagement(
                        session-> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class)
                .build();
//        httpSecurity.formLogin(Customizer.withDefaults());


    }

//    @Bean
//    public UserDetailsService userDetailsService(){
//
//        UserDetails user1= User
//                .withDefaultPasswordEncoder()
//                .username("thesumeetsingh")
//                .password("sumeet@123")
//                .roles("ADMIN")
//                .build();
//        UserDetails user2= User
//                .withDefaultPasswordEncoder()
//                .username("rahul")
//                .password("rahul@123")
//                .roles("TEACHER")
//                .build();
//        UserDetails user3= User
//                .withDefaultPasswordEncoder()
//                .username("peterparker")
//                .password("peter@123")
//                .roles("STUDENT")
//                .build();
//
//
//        return new InMemoryUserDetailsManager(user1, user2, user3);
//    }

    @Bean
    public AuthenticationProvider authenticationProvider(UserDetailsService userDetailsService){
        DaoAuthenticationProvider provider= new DaoAuthenticationProvider(userDetailsService);

//        provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());  //user this when password is not hashed
        provider.setPasswordEncoder(new BCryptPasswordEncoder(12));
//        provider.setUserDetailsService(userDetailsService()); //depricated

        return provider;
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception{
        return config.getAuthenticationManager();
    }
}
