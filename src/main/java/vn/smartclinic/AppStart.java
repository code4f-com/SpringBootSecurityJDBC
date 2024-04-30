package vn.smartclinic;

import com.tuanpla.utils.config.PublicConfig;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppStart {
// https://github.com/spring-projects/spring-boot/wiki/Spring-Boot-3.2-Release-Notes

    private static final Logger logger = LogManager.getLogger();
    static final String FILE_LOCK = "instance/smartclinic.be.running";

    public static void main(String[] args) {
        PublicConfig.PROJECT_NAME = "Spring Boot SecurityJDBC";
//        try {
//            if (!DFSUtils.lockFile((new File(FILE_LOCK)))) {
//                logger.debug("File: " + file_lock + " was locked => Module cannot start");
//                return;
//            } else {
//                logger.debug("File: " + file_lock + " locked => Start module");
//            }
//            SpringApplication.run(AppStart.class, args);
//        } catch (Exception e) {
//            // TODO Auto-generated catch block
//            logger.error(e.getLocalizedMessage());
//            e.printStackTrace();
//            System.out.println("Can not start server.");
//        }
        SpringApplication.run(AppStart.class, args);
    }

}
