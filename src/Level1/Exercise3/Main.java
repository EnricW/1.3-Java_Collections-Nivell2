package Level1.Exercise3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Main {
    private static final String COUNTRIES_FILE_PATH = "src/Level1/Exercise3/resources/countries.txt";
    private static final String SCOREBOARD_FILE_PATH = "src/Level1/Exercise3/resources/scoreboard.txt";

    private final HashMap<String, String> countriesMap;
    private final Scanner scanner;

    public Main() {
        this.countriesMap = new HashMap<>();
        this.scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Main game = new Main();
        game.loadCountries();
        String playerName = game.getPlayerName();
        int score = game.startGame();
        game.saveScore(playerName, score);
        game.closeScanner();
    }

    private void loadCountries() {
        try (BufferedReader br = new BufferedReader(new FileReader(COUNTRIES_FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ", 2);
                if (parts.length >= 2) {
                    String country = parts[0];
                    String capital = parts[1];
                    countriesMap.put(country, capital);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    private String getPlayerName() {
    System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        while (name.isEmpty()) {
            System.out.print("Name cannot be empty. Please, enter your name: ");
            name = scanner.nextLine();
        }
        return name;
    }

    private int startGame() {
        int score = 0;
        List<String> countries = new ArrayList<>(countriesMap.keySet());
        Collections.shuffle(countries);

        for (int i = 0; i < 10; i++) {
            String randomCountry = countries.get(i);
            String correctCapital = countriesMap.get(randomCountry);

            System.out.print("What is the capital of " + randomCountry + "? ");
            String userAnswer = scanner.nextLine();

            if (userAnswer.equalsIgnoreCase(correctCapital)) {
                System.out.println("That's CORRECT!");
                score++;
            } else {
                System.out.println("Wrong answer. The capital is " + correctCapital + ".");
            }
        }
        return score;
    }

    private void saveScore(String userName, int score){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(SCOREBOARD_FILE_PATH, true))) {
            bw.write(userName + ": " + score + " points\n");
            System.out.println("Score saved!");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    private void closeScanner() {
        scanner.close();
    }
}