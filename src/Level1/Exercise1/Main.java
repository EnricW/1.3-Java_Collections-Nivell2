package Level1.Exercise1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Month> year = new ArrayList<Month>();

        year.add(new Month("January"));
        year.add(new Month("February"));
        year.add(new Month("March"));
        year.add(new Month("April"));
        year.add(new Month("May"));
        year.add(new Month("June"));
        year.add(new Month("July"));
        year.add(new Month("September"));
        year.add(new Month("October"));
        year.add(new Month("November"));
        year.add(new Month("December"));

        printMonths(year);

        year.add(7, new Month("August"));

        printMonths(year);

        HashSet<Month> newYear = new HashSet<>(year);

        newYear.add(new Month("August"));

        Iterator<Month> it = newYear.iterator();
        System.out.println("The new year has " + newYear.size() + " months:");
        while (it.hasNext()) {
            Month month = it.next();
            System.out.println(month.getName());
        }
    }

    private static void printMonths(ArrayList<Month> months) {
        System.out.println("The year has " + months.size() + " months:");
        for (Month month : months) {
            System.out.println(month.getName() + " as month number " + (months.indexOf(month) + 1));
        }
        System.out.println();
    }
}
