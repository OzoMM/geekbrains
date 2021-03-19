package kz.ozom.lesson14;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

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

    public static void checkArray(ArrayList arrayList) throws FourIntException {
        int lastPosition = 0;
        try {
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i).equals(4)){
                    lastPosition = i;
                }
                if (lastPosition == 0) {
                    throw new FourIntException();
                }
            }
        } catch (FourIntException e){
            System.out.println("Нет ни одной четверки");
        }
    }

    public static class FourIntException extends Exception {

    }
}
