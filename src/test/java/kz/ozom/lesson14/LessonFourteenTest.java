package kz.ozom.lesson14;

import java.util.ArrayList;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class LessonFourteenTest {

    @org.junit.jupiter.api.Test
    void checkArray() throws LessonFourteen.FourIntException {
        LessonFourteen lessonFourteen = new LessonFourteen();
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            arrayList.add(random.nextInt(9));
        }
        System.out.println(arrayList);
        System.out.println(lessonFourteen.checkArray(arrayList));
    }
}