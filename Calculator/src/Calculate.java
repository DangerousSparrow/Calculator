public class Calculate extends Calc {

    public static int calc(int num1, int num2, String operation){
        int result;
        switch (operation){
            case "+":
                result = num1+num2;
                break;
            case "-":
                result = num1-num2;
                break;
            case "*":
                result = num1*num2;
                break;
            case "/":
                result = num1/num2;
                break;
            default:
                result = -103;
        }
        if (result == -103){
            System.out.println("Error #103: Недопустимая операция! Разрешены только '+' '-' '*' '/' !!!");
            System.exit(0);
        }
        return result;
    }
}
