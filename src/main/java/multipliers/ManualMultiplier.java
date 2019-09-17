package multipliers;

public class ManualMultiplier implements Multiply {

    @Override
    public String multiply(String numb1, String numb2) {
        int[] resultMuliplDigits = new int[numb1.length() + numb2.length()];

        myltiplyDigitsOfNumbers(numb1, numb2, resultMuliplDigits);
        StringBuilder sb = calculateEachDigit(resultMuliplDigits);
        return format(sb);
    }

    private String format(StringBuilder sb) {
        while (sb.charAt(0) == '0' && sb.length() > 1) {
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }

    private StringBuilder calculateEachDigit(int[] resultMuliplDigits) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < resultMuliplDigits.length; i++) {
            int mod = resultMuliplDigits[i] % 10;
            int carry = resultMuliplDigits[i] / 10;
            if (i + 1 < resultMuliplDigits.length) {
                resultMuliplDigits[i + 1] += carry;
            }
            result.insert(0, mod);
        }
        return result;
    }

    private void myltiplyDigitsOfNumbers(String numb1, String numb2, int[] digitsMultiply) {
        String number1 = new StringBuilder(numb1).reverse().toString();
        String number2 = new StringBuilder(numb2).reverse().toString();

        for (int i = 0; i < number1.length(); i++) {
            for (int j = 0; j < number2.length(); j++) {
                digitsMultiply[i + j] += (number1.charAt(i) - '0') * (number2.charAt(j) - '0');
            }
        }
    }
}
