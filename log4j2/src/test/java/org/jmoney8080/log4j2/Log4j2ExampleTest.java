package org.jmoney8080.log4j2;

import org.junit.Test;

/**
 * @author J$
 */
public class Log4j2ExampleTest {

    @Test
    public void showLogging() {
        final Log4j2Example log4jExample = new Log4j2Example();
        log4jExample.log("This is a test for log4J2!!!!");
    }
}
