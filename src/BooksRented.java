import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BooksRented extends Books {
    public BooksRented(String bookName, String author, String pages, String publisher, String copies) {
        super(bookName, author, pages, publisher, copies);
    }

    public BooksRented() {
    }

    public String BooksRented1() throws FileNotFoundException {
        File fileName = new File("BooksRented.txt");
        Scanner sc = new Scanner(fileName);

        StringBuilder myStrings = new StringBuilder();
        while (sc.hasNext()) {
            myStrings.append(sc.nextLine());
        }

        sc.close();
        return String.format("%s\\n",myStrings);
    }
}