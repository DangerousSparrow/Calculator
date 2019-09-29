public class Test extends Calc {

    public static boolean useLoop(String[] numRim, String num) {
        for (String s: numRim) {
            if (s.equals(num))
                return true;
        }
        return false;
    }
}
