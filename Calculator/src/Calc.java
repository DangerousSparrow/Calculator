import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {

        String[] numRim = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        String[] numArab = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

        Scanner scan = new Scanner(System.in);

        String number1 = scan.next();
        String opera = scan.next();
        String number2 = scan.next();

        int num1rim, num2rim, num1a, num2a,  result;

        boolean chRimPr1 = Test.useLoop(numRim, number1);
        boolean chRimPr2 = Test.useLoop(numRim, number2);

        boolean chArabPr1 = Test.useLoop(numArab, number1);
        boolean chArabPr2 = Test.useLoop(numArab, number2);

        boolean chRim = chRimPr1 && chRimPr2;
        boolean chArab = chArabPr1 && chArabPr2;

        if((chRimPr1 == true && chArabPr2 == true) || (chRimPr2 == true && chArabPr1 == true)){
            System.out.println("Нельзя использовать одновроменно Арабские и Римские числа!");
            System.exit(0);
        }

        else{
            if(chRim == true || chRimPr1 == true || chRimPr2 == true){
                num1rim = Arabic.toArabic(number1);
                num2rim = Arabic.toArabic(number2);
                result = Calculate.calc(num1rim,num2rim,opera);
                System.out.println(Rim.intToRoman(result));
            }

            if (chArab == true || chArabPr1 == true || chArabPr2 == true){
                num1a = Rus.toRus(number1);
                num2a = Rus.toRus(number2);
                result = Calculate.calc(num1a,num2a,opera);
                System.out.println(result);
            }
        }
    }
}
