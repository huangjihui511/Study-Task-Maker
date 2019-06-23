package taskmanager.booksmanager;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

public class BooksManager {
    private HashMap<String,Book> books;
    private String bookspath;

    public BooksManager(String bookspath) throws FileNotFoundException {
        this.bookspath = "/Volumes/文档/新东方/GRE学习资料/Study-Task_Maker/lib" +
                "/textbooks";
        books = new HashMap<>();
        File superfile = new File(this.bookspath);
        if (superfile.exists()) {
            for (File file:superfile.listFiles()) {
                Scanner scanner =
                        new Scanner(new BufferedReader(new FileReader(file.getAbsolutePath())));
                Book book = new Book(scanner);
                books.put(book.getBookname(),book);
            }
        }
        else {
            System.out.println("Error bookspath");
            System.exit(1);
        }
    }
}
