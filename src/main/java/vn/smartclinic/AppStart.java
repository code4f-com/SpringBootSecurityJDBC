package vn.smartclinic;

import com.tuanpla.utils.config.PublicConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppStart {
// https://github.com/spring-projects/spring-boot/wiki/Spring-Boot-3.2-Release-Notes

    private static final Logger logger = LoggerFactory.getLogger(AppStart.class);

    public static void main(String[] args) {
        PublicConfig.PROJECT_NAME = "Spring Boot SecurityJDBC";
//        try {
        SpringApplication.run(AppStart.class, args);
        logger.debug("Debug log message");
        logger.info("Info log message");
        logger.error("Error log message");
        logger.warn("Warn log message");
        logger.trace("Trace log message");
        logger.debug("Không thay đổi khi thêm code HighlightingCompositeConverterEx không được nạp lại");
//        } catch (Exception e) {
//            System.out.println("Can not start server.");
//            logger.error(e.getLocalizedMessage());
//            e.printStackTrace();
//        }
    }

}
