package baseball;

public class CheckValidation {

    public static boolean sizeCheck(String inputNo) {
        if(inputNo.length() != 3){
            return false;
        }
        return true;
    }

    public static boolean isNumeric(String inputNo) {
        try {
            Double.parseDouble(inputNo);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
