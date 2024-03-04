import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.FileNotFoundException;
import java.util.ArrayList;

class BookStoreTester implements ActionListener{
    BookStoreTester(){

    }
    static JTextArea display = new JTextArea();
    static ArrayList<Books> Books = new ArrayList<>();

    public static void main(String[] args){
        GUI();

    }
    public static void GUI() {
        JFrame frame = new JFrame("BookStore");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
        frame.setSize(2500, 800);
        createBookStore(frame);
        frame.setVisible(true);
    }
    public static void createBookStore(JFrame frame){
        BookStoreTester sc = new BookStoreTester();

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        JButton BooksList, SearchBook, RentBook, CostumerList, SearchCostumer, Return;

        BooksList = new JButton("List of books in store");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 40;
        c.gridwidth = 2;
        c.gridx = 0;
        c.gridy = 1;
        panel.add(BooksList, c);

        CostumerList = new JButton("List of costumers");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridwidth = 2;
        c.gridx = 1;
        c.gridy = 2;
        panel.add(CostumerList, c);

        SearchBook = new JButton("Search book by title");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridwidth = 2;
        c.gridx = 2;
        c.gridy = 1;
        panel.add(SearchBook, c);

        RentBook = new JButton("Rent a book");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridwidth = 2;
        c.gridx = 4;
        c.gridy = 1;
        panel.add(RentBook, c);

        SearchCostumer = new JButton("Search costumer by name");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridwidth = 2;
        c.gridx = 3;
        c.gridy = 2;
        panel.add(SearchCostumer, c);

        Return = new JButton("Return");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridwidth = 1;
        c.gridx = 5;
        c.gridy = 2;
        panel.add(Return, c);

        frame.add(panel);

        BooksList.addActionListener(sc);
        SearchBook.addActionListener(sc);
        RentBook.addActionListener(sc);
        CostumerList.addActionListener(sc);
        SearchCostumer.addActionListener(sc);
        Return.addActionListener(sc);

        display = new JTextArea();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 100;
        c.gridwidth = 6;
        c.gridx = 0;
        c.gridy = 0;
        display.setEditable(false);
        display.setBackground(new Color(255,255,150));
        panel.add(display, c);

    }

    Books b = new Books();
    Customers c = new Customers();
    BooksRented br = new BooksRented();

    @Override
    public void actionPerformed(ActionEvent e) {
        String displayText = e.getActionCommand();

        if(displayText.equals("List of books in store")) {
            try {
                display.setText(displayText + "\n" + b.BooksFile());
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }
        }
        else if(displayText.equals("List of costumers")){
            try {
                display.setText(displayText +"\n" + c.Customers1());
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }
        }
        else if(displayText.equals("Search book by title")){
            display.setText("Search book by title: \n");
        }
        else if(displayText.equals("Rent a book")){
            display.setText("What book do you want to rent?");
            try {
                display.setText(br.BooksRented1());
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }
        }
        else if(displayText.equals("Search costumer by name")) {
            display.setText(displayText + "\nEnter name of costumer: ");
        }
        else if(displayText.equals("Return")) {
            display.removeAll();
            display.setText("Go back!");
        }
    }
}
