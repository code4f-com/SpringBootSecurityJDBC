/*
 * Copyright 2022 by Tuanpla
 * https://tuanpla.com
 */
package vn.smartclinic;

import java.util.HashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 *
 * @author tuanpla
 */
@Component
public class AppReady implements ApplicationListener<ApplicationReadyEvent> {

    private static final Logger logger = LoggerFactory.getLogger(AppStart.class);

    @Autowired
    private Environment env;
    public static String rootDir;
    public static final HashMap<String, HashMap<String, String>> ALL_LANG = new HashMap<>();

    /**
     * This event is executed as late as conceivably possible to indicate that
     * the application is ready to service requests.
     *
     * @param event
     */
    @Override
    public void onApplicationEvent(final ApplicationReadyEvent event) {
//        LogUtils.debug("ApplicationReadyEvent:" + event.getApplicationContext().getEnvironment());
        logger.info("Call init funtion when app start finish here");

    }

}
