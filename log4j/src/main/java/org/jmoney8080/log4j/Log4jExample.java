package org.jmoney8080.log4j;

import org.apache.log4j.Logger;

/**
 * @author J$
 */
public class Log4jExample {

    private static final Logger LOGGER = Logger.getLogger(Log4jExample.class);

    public void log(String phrase) {
        LOGGER.info(phrase);
    }
}
