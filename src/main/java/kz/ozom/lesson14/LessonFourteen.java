package kz.ozom.lesson14;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LessonFourteen {

    private static final Logger LOGGER = LogManager.getLogger(LessonFourteen.class);

    public static void main(String[] args) {

        LOGGER.debug("Debug");
        LOGGER.info("Info");
        LOGGER.warn("Warn");
        LOGGER.error("Error");
        LOGGER.fatal("Fatal");
        LOGGER.info("String: {}.", "Hello, World");

    }
}
