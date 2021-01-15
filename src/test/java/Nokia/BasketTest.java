package Nokia;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BasketTest {

    @Test
    public void should_check_if_summarize_all_purchase(){
        //given
        Basket basket = new Basket();
        Item bike = new Item("random bike", 20);
        Item lamp = new Item("lamp", 9);
        basket.addItem(bike, lamp);

        //when
        int result = basket.purchaseSummary();

        //then
        assertEquals(29, result);
    }


}