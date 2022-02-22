package io.security.corespringsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.jdbc.config.annotation.web.http.EnableJdbcHttpSession;

@SpringBootApplication
@EnableJdbcHttpSession
public class CorespringsecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(CorespringsecurityApplication.class, args);
    }

}
