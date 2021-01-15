package Nokia;

import org.junit.Before;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RangeTest {




    @Test
    public void should_check_if_12_is_between_the_range(){
        //given
        Range range = new Range(10, 20);
        int number = 12;

        //then
        assertTrue(range.isInRange(number));
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_throw_illegal_argument_exception_when_lower_number_is_higher_than_upper(){
        new Range(20,10);

    }

}