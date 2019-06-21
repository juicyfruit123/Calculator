import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class ArabicCalculator{
    /**
     * В этой функции вычисляется результат операции над арабскими числами
     * @param expression
     * @return
     */
    public int getResult(String expression) {
            String operator = expression.replaceAll("[^+\\-*/]","");
            String newOperator = String.format("\\%s", operator);
            String [] arr = expression.split(newOperator.trim());
            int a = Integer.parseInt((arr[0]).trim());
            int b = Integer.parseInt((arr[1]).trim());

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

return result;        }


    }

