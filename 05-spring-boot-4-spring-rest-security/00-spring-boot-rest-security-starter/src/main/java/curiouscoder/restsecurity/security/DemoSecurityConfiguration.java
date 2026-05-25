package curiouscoder.restsecurity.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class DemoSecurityConfiguration {

    @Bean
    public InMemoryUserDetailsManager getUserDetailsManager() {
        UserDetails avi = User.builder()
                .username("avi")
                .password("{noop}test123")
                .roles("ADMIN", "MANAGER")
                .build();

        UserDetails shubh = User.builder()
                .username("shubh")
                .password("{noop}test123")
                .roles("EMPLOYEE")
                .build();

        UserDetails mahi = User.builder()
                .username("mahi")
                .password("{noop}test123")
                .roles("EMPLOYEE")
                .build();

        return new InMemoryUserDetailsManager(avi, shubh, mahi);
    }

//     @Bean
//     public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//         http.authorizeHttpRequests(configurer -> configurer
//                 .requestMatchers(HttpMethod.GET, "/api/employees/**").hasRole("EMPLOYEE")
//                 .requestMatchers(HttpMethod.POST, "/api/employees").hasRole("MANAGER")
//                 .requestMatchers(HttpMethod.PUT, "/api/employee").hasRole("MANAGER")
//                 .requestMatchers(HttpMethod.GET, "/api/employees/**").hasRole("ADMIN")
//                 .requestMatchers(HttpMethod.PUT, "/api/employees").hasRole("ADMIN")
//                 .requestMatchers(HttpMethod.POST, "/api/employees").hasRole("ADMIN")
//                 .requestMatchers(HttpMethod.DELETE, "/api/employees/**").hasRole("ADMIN")
//         ).httpBasic(Customizer.withDefaults());
//         return http.build();
//     }
}
