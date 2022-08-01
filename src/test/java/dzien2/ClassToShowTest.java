package dzien2;

import dzien2.dobrePraktyki.ClassToShow;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ClassToShowTest {

    @Test
    void shouldSumNumbers() {

        //given
        int firstNumber = 3;
        int secondNumber = 33;
        int expected = 36;

        int actual = ClassToShow.sumNumber(firstNumber, secondNumber, "asdfgsaa");


        Assertions.assertEquals(expected, actual);
    }
}