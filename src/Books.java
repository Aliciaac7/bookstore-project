import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Books {
    private String bookName;
    private String author;
    private String pages;
    private String publisher;
    private String copies;

    public Books(String bookName, String author, String pages, String publisher, String copies) {
        this.bookName = bookName;
        this.author = author;
        this.pages = pages;
        this.publisher = publisher;
        this.copies = copies;

    }

    public Books() {
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getCopies() {
        return copies;
    }

    public void setCopies(String copies) {
        this.copies = copies;
    }

    public String BooksFile() throws FileNotFoundException {
        File fileName = new File("Books.txt");
        Scanner sc = new Scanner(fileName);

        StringBuilder books = new StringBuilder();

        while (sc.hasNextLine()) {
            books.append(sc.nextLine());

        }
        sc.close();

        return String.format("%s\\n",books);
    }
}
