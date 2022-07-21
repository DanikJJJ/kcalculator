public class Roman {
    public static String toRoman(Integer s1) {
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romanLetters = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder sb = new StringBuilder();
        int qwe = s1;
        while(!(qwe==0)){
            for (int i = 0; i < values.length; i++) {
                if (values[i] <= qwe){
                    qwe -= values[i];
                    sb.append(romanLetters[i]);
                    break;
                }
            }
        }
        return sb.toString();
    }

    public static String itRomanCalculate(int x, int y, String separator) throws Exception {
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
        if (result <= 0){
            throw new Exception("В римской системе нет отрицательных чисел");
        }
        return toRoman(result);
    }

}
