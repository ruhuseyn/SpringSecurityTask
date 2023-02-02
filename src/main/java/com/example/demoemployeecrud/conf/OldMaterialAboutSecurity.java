package com.example.demoemployeecrud.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class OldMaterialAboutSecurity {
//    @Bean
//    public BCryptPasswordEncoder getBCryptPasswordEncoder(){
//        return new BCryptPasswordEncoder();
//    }
//    @Bean
//    public UserDetailsService userDetailsService() {
//        return new UserDetailsService() {
//            @Override
//            public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//                return null;
//            }
//        };
//    }
//        return username -> {
//            return accountDataRepo.findByUsername(username).map(account -> User.builder()
//                    .username(account.getUsername())
//                    .password(account.getPassword())
//                    .roles("ADMIN")
//                    .build()).orElseThrow(() -> new UsernameNotFoundException("Not found"));
};

//    @Bean
//    public UserDetailsService users(BCryptPasswordEncoder bCryptPasswordEncoder) {
//        UserDetails user = User.builder()
//                .username("user")
//                .password(bCryptPasswordEncoder.encode("123456"))
//                .roles("USER")
//                .build();
//        UserDetails admin = User.builder()
//                .username("admin")
//                .password(bCryptPasswordEncoder.encode("123456"))
//                .roles("USER", "ADMIN")
//                .build();
//        return new InMemoryUserDetailsManager(user, admin);
//    }

//@Bean
//public WebSecurityCustomizer webSecurityCustomizer() {
//        return (web) -> web.ignoring().requestMatchers("/api/v1/employees/free");
//        }

