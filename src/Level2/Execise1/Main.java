package Level2.Execise1;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashSet<Restaurant> restaurants = new HashSet<>();

        System.out.println("Add your favourite TOP 3 restaurants!");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the name of the restaurant:");
            String name = scanner.nextLine();
            System.out.println("Enter the rating of the restaurant:");
            int rating = scanner.nextInt();
            scanner.nextLine();

            Restaurant newRestaurant = new Restaurant(name, rating);

            boolean alreadyExists = restaurants.stream().anyMatch(r -> r.name.equals(name) && r.rating == rating);

            if (!alreadyExists) {
                restaurants.add(newRestaurant);
            } else {
                System.out.println("This restaurant is already in your list!");
                i--;
            }
        }

        System.out.println("Your favourite restaurants are:");
        for (Restaurant restaurant : restaurants) {
            restaurant.display();
        }
    }
}
