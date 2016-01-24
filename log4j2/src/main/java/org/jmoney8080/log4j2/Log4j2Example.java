package org.jmoney8080.log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author J$
 */
public class Log4j2Example {

    private static final Logger LOGGER = LogManager.getLogger(Log4j2Example.class);

    public void log(String phrase) {
        LOGGER.info(phrase);
    }
}
