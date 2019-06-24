package taskmanager.booksmanager;

import java.util.Objects;

public class Chapter {
    private boolean isfinished1;
    private boolean isfinished2;
    private int num;

    Chapter(int num) {
        isfinished1 = isfinished2 = true;
        if (num < 0) {
            this.num = - num;
            isfinished2 = false;
        }
        else {
            this.num = num;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(num);
    }

    public int getNum() {
        return num;
    }

    public void dopart1() {
        isfinished1 = true;
    }

    public void dopart2() {
        isfinished2 = true;
    }

    public void doall() {
        dopart1();
        dopart2();
    }

}
