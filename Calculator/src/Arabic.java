public class Arabic extends Calc{
    public static int toArabic(String value){
        int num;
        switch (value){
            case "I":
                num = 1;
                break;
            case "II":
                num = 2;
                break;
            case "III":
                num = 3;
                break;
            case "IV":
                num = 4;
                break;
            case "V":
                num = 5;
                break;
            case "VI":
                num = 6;
                break;
            case "VII":
                num = 7;
                break;
            case "VIII":
                num = 8;
                break;
            case "IX":
                num = 9;
                break;
            case "X":
                num = 10;
                break;
            default:
                num = -102;
        }
        if (num == -102){
            System.out.println("Error #102: Разрешены числа только от I до X");
            System.exit(0);
        }
        return num;
    }
}
