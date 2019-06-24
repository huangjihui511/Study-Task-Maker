package taskfactory.taskKind;

import taskmanager.booksmanager.Book;
import taskmanager.booksmanager.BooksChapterTypes;

public class SingleTask {
    private String bookname;
    private int chapternum;
    private BooksChapterTypes booksChapterTypes;
    private boolean isfinished;
    private Book book;

    SingleTask(String bookname, int chapternum,
               BooksChapterTypes booksChapterTypes, Book book) {
        this.isfinished = false;
        this.bookname = bookname;
        this.chapternum = chapternum;
        this.booksChapterTypes = booksChapterTypes;
        this.book = book;
    }
    public boolean isfinished() {
        return isfinished;
    }
    public String toString() {
        return bookname + " " + book.toStringChapters(chapternum,
                booksChapterTypes);
    }
    public void finishTask() {
        isfinished = true;
    }
    public void unfinishTask() {
        isfinished = false;
    }
}
