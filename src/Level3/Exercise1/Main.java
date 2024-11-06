package Level3.Exercise1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    private static final String DATA_FILE_PATH = "src/Level3/Exercise1/resources/data.csv";

    private final ArrayList<Person> persons;
    private final Scanner scanner;

    public Main() {
        this.persons = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.loadList();
        main.menu();
    }

    private void loadList() {
        try (BufferedReader br = new BufferedReader(new FileReader(DATA_FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 3) {
                    String name = parts[0];
                    String lastName = parts[1];
                    String dni = parts[2];
                    persons.add(new Person(name, lastName, dni));
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    private void menu(){
        int option;
        do{
            System.out.println("1. Add person");
            System.out.println("2. Sort by name (A-Z)");
            System.out.println("3. Sort by name (Z-A)");
            System.out.println("4. Sort by last names (A-Z)");
            System.out.println("5. Sort by last names (Z-A)");
            System.out.println("6. Sort by DNI (1-9)");
            System.out.println("7. Sort by DNI (9-1)");
            System.out.println("8. Exit");

            option = scanner.nextInt();
            scanner.nextLine();

            switch(option) {
                case 1 -> addPerson();
                case 2 -> sortByNameAsc();
                case 3 -> sortByNameDesc();
                case 4 -> sortByLastNameAsc();
                case 5 -> sortByLastNameDesc();
                case 6 -> sortByDniAsc();
                case 7 -> sortByDniDesc();
                case 8 -> System.out.println("Bye!");
                default -> System.out.println("Invalid option");
            }
        } while (option != 8);
    }

    private void addPerson() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter last names: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter DNI: ");
        String dni = scanner.nextLine();

        persons.add(new Person(name, lastName, dni));
        System.out.println("Person added.");
    }

    private void printList() {
        System.out.println("___Nom___ ____Cognoms___ __NIF__");
        for (Person person : persons) {
            System.out.println(person.getName() + " " + person.getLastName() + " " + person.getDni());
        }
    }

    private void sortByNameAsc() {
        persons.sort(Comparator.comparing(Person::getName));
        printList();
    }

    private void sortByNameDesc() {
        persons.sort(Comparator.comparing(Person::getName).reversed());
        printList();
    }

    private void sortByLastNameAsc() {
        persons.sort(Comparator.comparing(Person::getLastName));
        printList();
    }

    private void sortByLastNameDesc() {
        persons.sort(Comparator.comparing(Person::getLastName).reversed());
        printList();
    }

    private void sortByDniAsc() {
        persons.sort(Comparator.comparing(Person::getDni));
        printList();
    }

    private void sortByDniDesc() {
        persons.sort(Comparator.comparing(Person::getDni).reversed());
        printList();
    }
}
