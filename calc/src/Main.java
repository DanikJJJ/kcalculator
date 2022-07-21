import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
       System.out.println(calc("input"));
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNextLine()){
//            String s = sc.nextLine();
//            System.out.println(Logic.checked(s));
//        }
    }
    public static String calc(String input) throws Exception {
        return Logic.checked(input);
    }
}
