package Nokia;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;


public class ConvertTest {

    @Test
    public void should_check_if_word_is_encoded_to_number() throws MyCustomException {
        //given
        String word = "KOT";
        Convert convert = new Convert();
        //when
        String  result =  convert.encodeWithReduce(word);
        //then

        assertEquals("556668", result);
    }

    @Test
    public void should_check_if_throws_my_custom_exception_when_null_provided() throws MyCustomException {
        //given
        String word = null;
        Convert convert = new Convert();

        //then
        assertThatThrownBy(() -> convert.encodeWithReduce(word))
                .isInstanceOf(MyCustomException.class)
                .hasMessageContaining("You cannot use this word!");

    }

}