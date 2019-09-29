public class Rus extends Calc {
    public static int toRus(String value){
        int num;
        switch (value){
            case "1":
                num = 1;
                break;
            case "2":
                num = 2;
                break;
            case "3":
                num = 3;
                break;
            case "4":
                num = 4;
                break;
            case "5":
                num = 5;
                break;
            case "6":
                num = 6;
                break;
            case "7":
                num = 7;
                break;
            case "8":
                num = 8;
                break;
            case "9":
                num = 9;
                break;
            case "10":
                num = 10;
                break;
            default:
                num = -101;
        }
        if (num == -101){
            System.out.println("Error #101: Разрешены числа только от 1 до 10");
            System.exit(0);
        }
        return num;
    }
}
