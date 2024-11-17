package assignmentPortal.example.GrowthX.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable()) // Disable CSRF protection
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/register", "/login").permitAll() // Public endpoints
                        .requestMatchers("/upload", "/assignments/**").authenticated() // Secured endpoints
                )
                .httpBasic(httpBasic -> {}); // Explicit configuration for HTTP Basic Authentication

        return http.build();
    }
}
