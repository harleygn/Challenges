import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class HkrCardTest {
    @Test
    public void reverseTest () {
        String input = "1234567890";
        String expected = "0987654321";
        String actual = HkrCard.reverse(input);

        assertEquals(expected, actual);
    }
    @Test
    public void oddSumTest () {
        String input = "1234567890";
        String expected = "25";
        String actual = HkrCard.oddSum(input);

        assertEquals(expected, actual);
    }
    @Test
    public void evenPosListTest () {
        String input = "1234567890";
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(4);
        expected.add(6);
        expected.add(8);
        expected.add(0);
        ArrayList actual = HkrCard.evenPosList(input);

        assertEquals(expected, actual);
    }
    @Test
    public void evenListMultiplyTest () {
        ArrayList<Integer> input = new ArrayList<>();
        input.add(2);
        input.add(4);
        input.add(6);
        input.add(8);
        input.add(0);
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(4);
        expected.add(8);
        expected.add(3);
        expected.add(7);
        expected.add(0);
        ArrayList actual = HkrCard.evenListMultiply(input);

        assertEquals(expected, actual);


    }
}