package multipliers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManualMultiplierTest {

    private static final String NUMBER_1 = "1531511313515351";
    private static final String NUMBER_2 = "7885151543135318486";
    private static final String RESULT = "12076198797094768484073361635078586";

    private ManualMultiplier manualMultiplier;

    @Before
    public void initialize() {
        manualMultiplier = new ManualMultiplier();
    }

    @Test
    public void multiply() {
        assertEquals(RESULT, manualMultiplier.multiply(NUMBER_1, NUMBER_2));
    }
}