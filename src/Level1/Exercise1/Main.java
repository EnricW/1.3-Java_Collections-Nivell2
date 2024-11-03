package Level1.Exercise1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Month> year = new ArrayList<Month>();

        System.out.println("Adding months to the year...");
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

        System.out.println("Adding August...");
        year.add(7, new Month("August"));

        printMonths(year);

        HashSet<Month> newYear = new HashSet<>(year);

        System.out.println("Trying to add August again...");
        newYear.add(new Month("August"));

        System.out.println("The new year has " + newYear.size() + " months.");
        System.out.println("The months are:");
        for (Month month : newYear) {
            System.out.println(month.getName());
        }
    }

    private static void printMonths(ArrayList<Month> months) {
        System.out.println("The year has " + months.size() + " months.");
        System.out.println("The months are:");
        for (Month month : months) {
            System.out.println(month.getName() + " as month number " + (months.indexOf(month) + 1));
        }
        System.out.println();
    }
}
