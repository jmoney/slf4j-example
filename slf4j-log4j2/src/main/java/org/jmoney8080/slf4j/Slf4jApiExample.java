package org.jmoney8080.slf4j;

import org.jmoney8080.log4j.Log4jExample;
import org.jmoney8080.log4j2.Log4j2Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author J$
 */
public class Slf4jApiExample {

    private static final Logger LOGGER = LoggerFactory.getLogger(Slf4jApiExample.class);
    private static final String PHRASE = "Hello World!!!";

    public static void main(String[] args) {
        final Log4jExample log4jExample = new Log4jExample();
        final Log4j2Example log4j2Example = new Log4j2Example();

        log4jExample.log(PHRASE);
        log4j2Example.log(PHRASE);
        LOGGER.info(PHRASE);
    }
}
