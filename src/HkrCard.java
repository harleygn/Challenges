import java.util.ArrayList;

public class HkrCard {

    public static void main(String[] args) {
        String cardTest = "9795526789839145";
        System.out.print(doubleDigitsSum(evenListMultiply(evenPosList(cardTest))));
    }

    public static String reverse (String stringToReverse) {
        StringBuilder sb = new StringBuilder(stringToReverse);
        return sb.reverse().toString();
    }
    public static String oddSum (String stringToSum) {
        int total = 0;
        for (int i = 0; i < stringToSum.length(); i += 2) {
            char character = stringToSum.charAt(i);
            int value = Character.getNumericValue(character);
            total += value;
        }
        return String.valueOf(total);
    }
    public static ArrayList<Integer> evenPosList (String cardTest) {
        ArrayList<Integer> evenList = new ArrayList<>();
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
    public static ArrayList<Integer> doubleDigitsSum (ArrayList<Integer> listOfDigitsToSum) {
        ArrayList<Integer> summedDigits = new ArrayList<>();
        for (Integer digitsToSum : listOfDigitsToSum) {
            if (String.valueOf(digitsToSum).length() == 2 ) {
                digitsToSum = ((digitsToSum / 10) + (digitsToSum % 10));
            }
            summedDigits.add(digitsToSum);
        }
        return summedDigits;
    }
    public static String listSum (ArrayList<Integer> evenList) {
        int total = 0;
        for (int value : evenList) {
            total += value;
        }
        return Integer.toString(total);
    }


}
