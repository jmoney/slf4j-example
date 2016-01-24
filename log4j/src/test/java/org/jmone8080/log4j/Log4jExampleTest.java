package org.jmone8080.log4j;

import org.jmoney8080.log4j.Log4jExample;
import org.junit.Test;

/**
 * @author J$
 */
public class Log4jExampleTest {

    @Test
    public void showLogging() {
        final Log4jExample log4jExample = new Log4jExample();
        log4jExample.log("This is a test for log4j!!!!");
    }
}
