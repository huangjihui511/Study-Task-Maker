package test;

import taskmanager.booksmanager.BooksManager;

import java.io.FileNotFoundException;

public class TestBooksManager {
    public static void main(String args[]) {
        try {
            BooksManager b = new BooksManager("s");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
