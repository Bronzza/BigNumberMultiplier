package util;

import lombok.NoArgsConstructor;
import lombok.Setter;
import multipliers.BigIntMultiplier;
import multipliers.ManualMultiplier;
import multipliers.Multiply;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

@Setter
@NoArgsConstructor
public class MultiplierUserInput {

    private Multiply multiplier;

    public String muliplyBigNumbersFromConsole() {
        System.out.println("Enter number of algorithm and two numbers to multiply. Separated by spaces");
        List<String> inputList = Collections.list(new StringTokenizer(new Scanner(System.in).nextLine(), " "))
                .stream()
                .map(token -> (String) token)
                .map(String::trim)
                .collect(Collectors.toList());
        return multiplyNumbers(inputList);
    }

    String multiplyNumbers(List<String> inputList) {
        switch (checkNumberOfAlgorithm(inputList.get(0))) {
            case "Algorithm1":
                multiplier = new BigIntMultiplier();
                return multiplier.multiply(inputList.get(1), inputList.get(2));
            case "Algorithm2":
                multiplier = new ManualMultiplier();
                return multiplier.multiply(inputList.get(1), inputList.get(2));
            case "Wrong":
            default:
                System.out.println("Incorrect input of algorithm number");
                return null;
        }
    }

    String checkNumberOfAlgorithm(String nameOfAlgorithm) {
        if ((nameOfAlgorithm.contains(Character.toString('1'))
                && nameOfAlgorithm.contains(Character.toString('2')))) {
            System.out.println("Incorrect input of algorithm number");
            return "Wrong";
        }
        if ((nameOfAlgorithm.contains(Character.toString('1')))) {
            return "Algorithm1";
        }
        if (nameOfAlgorithm.contains(Character.toString('2'))) {
            return "Algorithm2";
        } else {
            System.out.println("Incorrect input of algorithm number");
            return "Wrong";
        }
    }
}
