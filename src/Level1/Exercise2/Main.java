package Level1.Exercise2;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
            System.out.println(numbers.get(numbers.size() - 1));
        }

        ArrayList<Integer> countdown = new ArrayList<Integer>();

        ListIterator<Integer> iterator = numbers.listIterator(numbers.size());
        while (iterator.hasPrevious()) {
            countdown.add(iterator.previous());
        }

        for (int number : countdown) {
            System.out.println(number);
        }
    }
}
