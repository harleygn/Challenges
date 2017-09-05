import java.util.ArrayList;

public class HkrCard {

    public static void main(String[] args) {
        String cardTest = "99447398617";
        // StringBuilder cardNum = new StringBuilder(cardTest);
        // String cardNumRev = cardNum.reverse().toString();
        System.out.print(evenPosList(cardTest));
    }

    public static String reverse (String stringToReverse) {
        StringBuilder sb = new StringBuilder(stringToReverse);
        return sb.reverse().toString();
    }
    public static String oddSum (String cardTest) {
        int total = 0;
        for (int i = 0; i < cardTest.length(); i += 2) {
            char character = cardTest.charAt(i);
            int value = Character.getNumericValue(character);
            total += value;
        }
        return String.valueOf(total);
    }
    public static ArrayList<Integer> evenPosList (String cardTest) {
        ArrayList evenList = new ArrayList<Integer>();
        for (int i = 1; i < cardTest.length(); i += 2) {
            evenList.add(Character.getNumericValue(cardTest.charAt(i)));
        }
        return evenList;
    }
    public static ArrayList<Integer> evenListMultiply (ArrayList<Integer> listToMultiply) {
        ArrayList<Integer> multipliedList = new ArrayList<>();
        for (Integer valueToMultiply : listToMultiply) {
            multipliedList.add(valueToMultiply * 2);
        }
        return multipliedList;
    }


}
