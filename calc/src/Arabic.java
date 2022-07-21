import java.util.Arrays;

public class Arabic {

    public static int toArabic(String s) {
        int[] values = {1000, 500, 100, 50, 10, 5, 1};
        String[] romanLetters = {"M", "D", "C", "L", "X", "V", "I"};
        String[] split = s.split("(?!^)");
        int sum = 0;
        int s2 = -1;
        for (int i = split.length - 1; i >= 0; i--) {
            for (int j = 0; j < romanLetters.length; j++) {
                if (split[i].equals(romanLetters[j])) {
                    int s1 = values[j];
                    if (s2 > s1) {
                        sum -= values[j];
                        s2 = values[j];
                        break;
                    } else {
                        sum += values[j];
                        s2 = values[j];
                        break;
                    }
                }
            }
        }
        return sum;
    }

    public static int itArabicCalculate(int x, int y, String separator){
        int result = 0;
        switch (separator){
            case "+":
               result = Arif.Addition.action(x,y);
               break;
            case "-":
                result = Arif.Subtraction.action(x,y);
                break;
            case "*":
                result = Arif.Multiplication.action(x,y);
                break;
            case "/":
                result = Arif.Division.action(x,y);
                break;
        }
        return result;
    }
}
