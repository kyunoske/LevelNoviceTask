import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LevelNoviceTest {

        @Test
        void biggerThanZeroTest() {
            //given
            String name = "Happy Gilmore";

            //when
            String actual = LevelNovice.biggerThanZero(name);

            //then
            assertEquals("The length of Happy Gilmore is greater than 0", actual);
        }

        @Test
        void squareOfNumberTest() {
            //given
            int number = 10;

            //when
            int actual = LevelNovice.squareOfNumber(number);

            //then
            assertEquals(100, actual);
        }

}
