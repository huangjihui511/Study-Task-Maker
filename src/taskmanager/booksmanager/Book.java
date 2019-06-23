package taskmanager.booksmanager;

import java.util.ArrayList;
import java.util.Scanner;

public class Book {
    private BooksChapterTypes booksChapterTypes;
    private int chapternum;
    private String chaptername;
    private ArrayList<Integer> finished;
    private String bookname;

    Book(Scanner scanner) {
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] split = line.split(" ");
            switch (split[0]) {
                case "bookname:":
                    bookname = split[1];
                    break;
                case  "catalogue:":
                    chapternum = Integer.valueOf(split[1]);
                    break;
                case  "chapterkind:" :
                    switch (split[1]) {
                        case "single":
                            booksChapterTypes = BooksChapterTypes.SINGLE;
                            break;
                        case "double":
                            booksChapterTypes = BooksChapterTypes.DOUBLE;
                            break;
                        case "half":
                            booksChapterTypes = BooksChapterTypes.HALF;
                            break;
                        default:
                    }
                    break;
                case "finished:":
                    for (int i = 1;i < split.length;i++) {
                        finished.add(Integer.valueOf(split[i]));
                    }
                    break;
                case "chaptername:":
                    chaptername = split[1];
                    break;
                default:
            }
        }
    }

    public String getBookname() {
        return bookname;
    }
}
