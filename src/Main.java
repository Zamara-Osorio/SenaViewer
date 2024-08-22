import edu.misena.senaviewer.Megazine;
import edu.misena.senaviewer.Movie;
import edu.misena.senaviewer.Serie;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static List<Movie> movies = new ArrayList<>();
    private static List<Serie> series = new ArrayList<>();
    private static List<Book> books = new ArrayList<>();
    private static List<Megazine> magazines = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            displayMainMenu();
            option = getValidIntegerInput(scanner);

            switch (option) {
                case 1:
                    showMoviesMenu(scanner);
                    break;
                case 2:
                    showSeriesMenu(scanner);
                    break;
                case 3:
                    showBooksMenu(scanner);
                    break;
                case 4:
                    showMagazinesMenu(scanner);
                    break;
                case 5:
                    generateGeneralReport();
                    break;
                case 6:
                    generateTodayReport();
                    break;
                case 7:
                    System.out.println("Exiting application...");
                    break;
                default:
                    System.out.println("Invalid option. Please select a number between 1 and 7.");
            }
        } while (option != 7);
    }

    private static void displayMainMenu() {
        System.out.println("Sena Viewer Main Menu:");
        System.out.println("1. Movies");
        System.out.println("2. Series");
        System.out.println("3. Books");
        System.out.println("4. Magazines");
        System.out.println("5. Report");
        System.out.println("6. Report Today");
        System.out.println("7. Exit");
        System.out.print("Select an option: ");
    }

    private static void showMoviesMenu(Scanner scanner) {
        System.out.println("Movies Menu:");
        System.out.println("Displaying list of movies...");

    }

    private static void showSeriesMenu(Scanner scanner) {
        System.out.println("Series Menu:");
        System.out.println("Displaying list of series...");

    }

    private static void showBooksMenu(Scanner scanner) {
        System.out.println("Books Menu:");
        System.out.println("Displaying list of books...");

    }

    private static void showMagazinesMenu(Scanner scanner) {
        System.out.println("Magazines Menu:");

        System.out.println("Displaying list of magazines...");

    }

    private static void generateGeneralReport() {
        System.out.println("Generating general report...");

    }

    private static void generateTodayReport() {
        System.out.println("Generating today's report...");

    }

    private static int getValidIntegerInput(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Please enter a number: ");
            scanner.next();
        }
        return scanner.nextInt();
    }
}


