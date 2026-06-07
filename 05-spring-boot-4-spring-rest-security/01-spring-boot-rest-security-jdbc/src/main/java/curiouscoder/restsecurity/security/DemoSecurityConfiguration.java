package curiouscoder.restsecurity.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;

@Configuration
public class DemoSecurityConfiguration {

    //  add support for JDBC ... no more hardcoded users

    @Bean
    public UserDetailsManager getUserDetailsManager(DataSource dataSource) {
        return new JdbcUserDetailsManager(dataSource);
    }

//    @Bean
//    public InMemoryUserDetailsManager getUserDetailsManager() {
//        UserDetails avi = User.builder()
//                .username("avi")
//                .password("{noop}test123")
//                .roles("ADMIN", "MANAGER", "EMPLOYEE")
//                .build();
//
//        UserDetails shubh = User.builder()
//                .username("shubh")
//                .password("{noop}test123")
//                .roles("MANAGER", "EMPLOYEE")
//                .build();
//
//        UserDetails mahi = User.builder()
//                .username("mahi")
//                .password("{noop}test123")
//                .roles("EMPLOYEE")
//                .build();
//
//        return new InMemoryUserDetailsManager(avi, shubh, mahi);
//    }

     @Bean
     public SecurityFilterChain filterChain(HttpSecurity http) {
         http.authorizeHttpRequests(configurer -> configurer
                 .requestMatchers(HttpMethod.GET, "/api/employees/**").hasRole("EMPLOYEE")

                 .requestMatchers(HttpMethod.POST, "/api/employees").hasRole("MANAGER")
                 .requestMatchers(HttpMethod.PUT, "/api/employees").hasRole("MANAGER")

                 .requestMatchers(HttpMethod.PATCH, "/api/employees/**").hasRole("ADMIN")
                 .requestMatchers(HttpMethod.DELETE, "/api/employees/**").hasRole("ADMIN")
         );

         //Use HTTP Basic Authentication
         http.httpBasic(Customizer.withDefaults());

         //Disable Cross-Site Request Forgery
         // in General, Not required for stateless REST APIs, That Uses POST, PUT, DELETE, PATCH
         http.csrf(csrf -> csrf.disable());
         return http.build();
     }
}
