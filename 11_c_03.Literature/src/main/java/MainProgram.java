
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("Input the name of the book, empty stops: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.println("Input the age recommendation: ");
            int age = Integer.parseInt(scanner.nextLine());
            Book book = new Book(title, age);
            books.add(book);
        }

        Collections.sort(books);

        System.out.println(books.size() + " books in total.");
        System.out.println();
        System.out.println("Books: ");

        for (Book book : books) {
            System.out.println(book.toString());
        }

    }
}
