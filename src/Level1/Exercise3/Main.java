package Level1.Exercise3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> countriesMap = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader("src/Level1/Exercise3/resources/countries.txt"))) {
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
            return;
        }

        System.out.println("Countries and their capitals:");
        for (String country : countriesMap.keySet()) {
            String capital = countriesMap.get(country);
            System.out.println(country + " - " + capital);
        }
    }
}
