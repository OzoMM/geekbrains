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

    public static ArrayList checkArray(ArrayList arrayList) throws FourIntException {
        int lastPosition = -1;
        ArrayList<Integer> newList = new ArrayList<>();
        try {
            for (int i = 0; i < arrayList.size(); i++) {
                if ((Integer)arrayList.get(i) == 4){
                    lastPosition = i;
                }
            }
            if (lastPosition == -1) {
                throw new FourIntException();
            }
            else {
                for (int i = lastPosition + 1; i < arrayList.size(); i++) {
                    newList.add((Integer) arrayList.get(i));
                }
            }
        } catch (FourIntException e){
            System.out.println("Нет ни одной четверки");
        }

        return newList;
    }

    public static class FourIntException extends Exception {

    }
}
