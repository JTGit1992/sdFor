package com.jt.sdfor.framework.core.security;

import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.List;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeRequests(authorizeRequests ->
                        authorizeRequests
                                .requestMatchers(PathRequest.toStaticResources().atCommonLocations()).permitAll() // 정적 리소스는 인증 없이 접근 가능
                                .requestMatchers("/public/**", "/login", "/signup").permitAll() // 특정 URL 패턴은 인증 없이 접근 가능
//                                .anyRequest().authenticated() // 그 외 모든 요청은 인증 필요
                                .anyRequest().permitAll() // 모든 요청을 인증 없이 허용
                )
//                .formLogin(formLogin ->
//                        formLogin
//                                .loginPage("/login") // 커스텀 로그인 페이지 설정 (없으면 기본 로그인 페이지 사용)
//                                .permitAll() // 로그인 페이지는 인증 없이 접근 가능
//                )
//                .logout(logout ->
//                        logout
//                                .logoutUrl("/logout")
//                                .permitAll() // 로그아웃 페이지는 인증 없이 접근 가능
//                )
                .csrf(csrf -> csrf.disable()) // CSRF 보호 비활성화 (개발 중에만, 실제로는 활성화 필요)
                .cors(withDefaults()) // CORS 설정 적용
        ;
        return http.build();
    }

    @Bean
    public CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration configuration = new CorsConfiguration();
        configuration.setAllowedOrigins(List.of("http://localhost:3000"));
        configuration.setAllowedMethods(List.of("GET", "POST", "PUT", "DELETE"));
        configuration.setAllowedHeaders(List.of("Authorization", "Cache-Control", "Content-Type"));

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration);
        return source;
    }
}
