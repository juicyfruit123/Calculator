import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//
        ArabicCalculator arabicCalculator = new ArabicCalculator();
        RomanCalculator romanCalculator = new RomanCalculator();
        String  str;
        try {
            while ((str = reader.readLine()) != null && !str.equals("")){//ввод арифметической операции пользователем
                Matcher matcher1 = Pattern.compile("[0-9]").matcher(str);
                Matcher matcher2 = Pattern.compile("[A-Z]").matcher(str);
                Matcher matcher3 = Pattern.compile("[+\\-*/]").matcher(str);
                /*
                 *поиск ошибки при выполнении операции с арабскими и римскими цифрами в одном выражении
                 */
                if (matcher1.find()&&matcher2.find()){
                    throw  new Exception("Ошибка при выполнении операции с римскими и арабскими цифрами в одном выражении.");
                }
                /* //поиск ошибки при выполнении другой арифметической операции*/
                if (!matcher3.find()){
                    throw new Exception("Не допустимая арифметическая операция.");
                }

                Matcher matcher = Pattern.compile("M|CM|D|CD|C|XC|L|XL|X|IX|V|IV|I").matcher(str);

                if (matcher.find()) {
                    System.out.println( romanCalculator.getResult(str));
                } else {
                    System.out.println( arabicCalculator.getResult(str));}

                }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
