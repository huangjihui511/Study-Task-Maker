package taskmanager.booksmanager;

import java.util.HashMap;
import java.util.Scanner;

public class Book {
    private BooksChapterTypes booksChapterTypes;
    private int chapteramount;
    private String chaptername;
    private HashMap<Integer,Chapter> finished;
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
                    chapteramount = Integer.valueOf(split[1]);
                    break;
                case "finished:":
                    for (int i = 1;i < split.length;i++) {
                        Chapter chapter =
                                new Chapter(Integer.valueOf(split[i]));
                        finished.put(chapter.getNum(),chapter);
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

    private boolean checkamount(int chapternum) {
        if (chapternum >= chapteramount) {
            System.out.println("sorry! the largest chapter number of the " +
                    "book " + bookname + " is " + chapteramount);
            return true;
        }
        return false;
    }

    public void dochapterpart1(int chapternum) {
        if (checkamount(chapternum)) {
            return;
        }
        else {
            if (!finished.containsKey(chapternum)) {
                Chapter chapter = new Chapter(-chapternum);
                finished.put(chapternum,chapter);
            }
            else {
                finished.get(chapternum).dopart1();
            }
        }
    }

    public void dochapterpart2(int chapternum) {
        if (checkamount(chapternum)) {
            return;
        }
        else {
            if (!finished.containsKey(chapternum)) {
                Chapter chapter = new Chapter(-chapternum);
                finished.put(chapternum,chapter);
            }
            else {
                finished.get(chapternum).dopart2();
            }
        }
    }

    public void dochapter(int chapternum) {
        dochapterpart1(chapternum);
        dochapterpart2(chapternum);
    }

    public String toStringChapters(int chapternum,BooksChapterTypes booksChapterTypes) {
        String s = "";
        switch (booksChapterTypes) {
            case FIRST:
                s = "first part";
                break;
            case SECOND:
                s = "second part";
                break;
            case ALL:
                break;
        }
        return chaptername + " " + chapternum + " " + s;
    }
}
