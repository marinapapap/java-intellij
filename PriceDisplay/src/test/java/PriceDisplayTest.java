import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
public class PriceDisplayTest {

    @Test public void testDisplaysItemWithPrice() {
        PriceDisplay priceDisplay = new PriceDisplay();
        assertEquals("The price for item: Coffee is 15.99", priceDisplay.getPriceLabel("Coffee", 15.99));
    }
}
