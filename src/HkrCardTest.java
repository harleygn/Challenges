import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;

public class HkrCardTest {
    @Test
    public void reverseTest () {
        String input = "9795526789839145";
        String expected = "5419389876255979";
        String actual = HkrCard.reverse(input);

        assertEquals(expected, actual);
    }
    @Test
    public void oddSumTest () {
        String input = "9795526789839145";
        String expected = "58";
        String actual = HkrCard.oddSum(input);

        assertEquals(expected, actual);
    }
    @Test
    public void evenPosListTest () {
        String input = "9795526789839145";
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(7);
        expected.add(5);
        expected.add(2);
        expected.add(7);
        expected.add(9);
        expected.add(3);
        expected.add(1);
        expected.add(5);
        ArrayList actual = HkrCard.evenPosList(input);

        assertEquals(expected, actual);
    }
    @Test
    public void evenListMultiplyTest () {
        ArrayList<Integer> input = new ArrayList<>();
        input.add(7);
        input.add(5);
        input.add(2);
        input.add(7);
        input.add(9);
        input.add(3);
        input.add(1);
        input.add(5);
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(14);
        expected.add(10);
        expected.add(4);
        expected.add(14);
        expected.add(18);
        expected.add(6);
        expected.add(2);
        expected.add(10);
        ArrayList actual = HkrCard.evenListMultiply(input);

        assertEquals(expected, actual);
    }

    @Test
    public void doubleDigitsSumTest () {
        ArrayList<Integer> input = new ArrayList<>();
        input.add(14);
        input.add(10);
        input.add(4);
        input.add(14);
        input.add(18);
        input.add(6);
        input.add(2);
        input.add(10);
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(5);
        expected.add(1);
        expected.add(4);
        expected.add(5);
        expected.add(9);
        expected.add(6);
        expected.add(2);
        expected.add(1);
        ArrayList<Integer> actual = HkrCard.evenListMultiply(input);

        assertEquals(expected, actual);
    }
}