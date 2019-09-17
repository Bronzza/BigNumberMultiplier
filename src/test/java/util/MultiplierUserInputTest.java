package util;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MultiplierUserInputTest {


    private static final String NUMBER_1 = "1531511313515351";
    private static final String NUMBER_2 = "7885151543135318486";
    private static final String RESULT = "12076198797094768484073361635078586";
    private static final String ALGORITHM_1 = "alg1";
    private static final String ALGORITHM_2 = "al2";
    private static final String WRONG_INPUT_1 = "al21";
    private static final String WRONG_INPUT_2 = "abc";

    private MultiplierUserInput multiplierUserInput;

    private List<String> inputList;

    @Before
    public void initialize() {
        multiplierUserInput = new MultiplierUserInput();
        inputList = new ArrayList<>();
        inputList.add(ALGORITHM_1);
        inputList.add(NUMBER_1);
        inputList.add(NUMBER_2);
    }

    @Test
    public void multiplyNumbers() {
        assertEquals(RESULT, multiplierUserInput.multiplyNumbers(inputList));
        inputList.set(0, ALGORITHM_2);
        assertEquals(RESULT, multiplierUserInput.multiplyNumbers(inputList));
    }

    @Test
    public void checkNumberOfAlgorithm() {
        assertEquals("Algorithm1", multiplierUserInput.checkNumberOfAlgorithm(ALGORITHM_1));
        assertEquals("Algorithm2", multiplierUserInput.checkNumberOfAlgorithm(ALGORITHM_2));
        assertEquals("Wrong", multiplierUserInput.checkNumberOfAlgorithm(WRONG_INPUT_1));
        assertEquals("Wrong", multiplierUserInput.checkNumberOfAlgorithm(WRONG_INPUT_2));
    }
}