package com.study.board.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableWebSecurity // 해당 파일로 Security 활성화
@Configuration // IOC 등록
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    public BCryptPasswordEncoder encoder(){
        // DB 패스워드 암호화
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // super.configure(http); // 기존 Security가 가진 모든 기능 비활성화
        http.csrf().disable(); // csrf 토큰 비활성화

        http.authorizeRequests()
                .antMatchers("/").authenticated() // 이 주소로 시작시 인증필요
                .anyRequest().permitAll() // 다른 주소는 인증x
                .and()
                .formLogin()
                .loginPage("/signin") // 로그인 페이지 입력
                .loginProcessingUrl("/signin") // 로그인 자동실행
                .defaultSuccessUrl("/board/list") // 로그인 성공시 이동 페이지 입력
                .permitAll();
    }
}
