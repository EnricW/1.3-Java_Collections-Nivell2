package Level2.Execise2;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Restaurant> restaurants = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add your favourite TOP 5 restaurants!");

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the name of the restaurant:");
            String name = scanner.nextLine().trim();
            while (name.isEmpty()) {
                System.out.print("Name cannot be empty. Please, enter the name of the restaurant: ");
                name = scanner.nextLine().trim();
            }

            System.out.println("Enter the rating of the restaurant (1-10): ");
            int rating = 0;
            while (true) {
                try {
                    rating = Integer.parseInt(scanner.nextLine().trim());
                    if (rating >= 1 && rating <= 10) break;
                    System.out.print("Invalid rating! Please enter a number between 1 and 10: ");
                } catch (NumberFormatException e) {
                    System.out.print("Invalid input. Please enter a valid number between 1 and 10: ");
                }
            }

            Restaurant newRestaurant = new Restaurant(name, rating);
            if(restaurants.add(newRestaurant)){
                System.out.println("Restaurant added!");
            }else{
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