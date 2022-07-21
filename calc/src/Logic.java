import java.io.IOException;

public class Logic {

    public static String checked(String s) throws Exception {
        String[] split = s.split(" ");
        if (split.length != 3){
            throw new IOException("Формат математической операции не удовлетворяет условие, - два операнда и один оператор (+, -, /, *)\n" +
                    "Значения необходимо вводить через пробел");
        }
        if (!(split[1].equals("+") || split[1].equals("-") || split[1].equals("*") || split[1].equals("/"))){  /// ПРОВЕРКА НА ОПЕРАТОРА
            throw new Exception("Невернный ввод оператора, список возможных операторов: (+, -, /, *)");
        }
        String separator = split[1];
        try{
            int first = Integer.parseInt(split[0]);
            int two = Integer.parseInt(split[2]);
            if(first > 10 || two > 10){
                throw new Exception("На ввод принимаются числа не больше 10");
            }
            return String.valueOf(Arabic.itArabicCalculate(first,two,separator));
        }
        catch (Exception e){
            try {
                Integer.parseInt(split[0]);
                throw new Exception("Использование одновременно разных систем счисления невозможно, выберите одну");
            }
            catch (NumberFormatException r){
                try {
                    Integer.parseInt(split[2]);
                    throw new Exception("Использование одновременно разных систем счисления невозможно, выберите одну");
                }
                catch (NumberFormatException ett){
                    String s1 = split[0];
                    int x = Arabic.toArabic(s1);
                    if (x > 10){
                        throw new Exception("На ввод принимаются числа не больше 10");
                    }
                    String s2 = split[2];
                    int y = Arabic.toArabic(s2);
                    if (y > 10){
                        throw new Exception("На ввод принимаются числа не больше 10");
                    }
                    return Roman.itRomanCalculate(x,y,separator);
                }
            }
        }
    }
}

