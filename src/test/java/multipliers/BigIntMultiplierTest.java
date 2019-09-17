package multipliers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BigIntMultiplierTest {

    private static final String NUMBER_1 = "1531511313515351";
    private static final String NUMBER_2 = "7885151543135318486";
    private static final String RESULT = "12076198797094768484073361635078586";

    private BigIntMultiplier bigIntMultiplier;

    @Before
    public void initialize() {
        bigIntMultiplier = new BigIntMultiplier();
    }

    @Test
    public void multiply() {
        assertEquals(RESULT, bigIntMultiplier.multiply(NUMBER_1, NUMBER_2));
    }
}