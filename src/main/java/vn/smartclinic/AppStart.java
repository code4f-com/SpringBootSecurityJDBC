package vn.smartclinic;

import com.tuanpla.utils.config.PublicConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppStart {
// https://github.com/spring-projects/spring-boot/wiki/Spring-Boot-3.2-Release-Notes
    public static void main(String[] args) {
        PublicConfig.PROJECT_NAME = "Spring Boot SecurityJDBC";
        SpringApplication.run(AppStart.class, args);
    }

}
