package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

//@Configuration
//@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true)
public class AppSecurityConfig {

//    @Bean
//    public PasswordEncoder encoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//    /*@Bean
//    public InMemoryUserDetailsManager userDetailsManager() {
//        UserDetails userDetails = User.builder()
//                .username("monjur")
//                .password("$2y$10$LqPYTOcJhvhV7oSWXG5L2OkVMdQ4F0IbBxCP1Eyh2eqD7n8qgRhU6")
//                .authorities("ROLE_USER", "ROLE_ADMIN")
//                .build();
//        return new InMemoryUserDetailsManager(userDetails);
//    }*/
//
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http
//                .csrf().disable()
//                .cors().disable()
//                .authorizeRequests()
//                .antMatchers("/api/**")
//                .access("hasRole('ROLE_ADMIN')")
//                .antMatchers("/leaveTypes/**")
//                .access("hasRole('ROLE_USER')")
//                .and()
//                .rememberMe()
//                .and()
//                .formLogin(Customizer.withDefaults())
//                .logout()
//                .permitAll();
//        return http.build();
//    }
}
