package multipliers;


import java.math.BigInteger;

public class BigIntMultiplier implements Multiply {

    @Override
    public String multiply(String number1, String number2) {
        BigInteger firstBigInteger = new BigInteger(number1);
        BigInteger secondBigInteger = new BigInteger(number2);
        return (firstBigInteger.multiply(secondBigInteger)).toString();
    }
}
