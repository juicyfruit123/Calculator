import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RomanCalculator {


    /**
     * В этой функции вычисляется результат операции над римскими цифрами.
     * @param expression
     * @return
     */
    public String getResult(String expression) {
            String operator = expression.replaceAll("[^+\\-*/]","");
            String newOperator = String.format("\\%s", operator);
            String [] arr = expression.split(newOperator);
            int a = RomanToInteger.romanToInteger(arr[0].trim());
            int b = RomanToInteger.romanToInteger(arr[1].trim());

        int result = 0;

        switch (operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
        }

        return IntegerToRoman.toRoman(result);        }



}
