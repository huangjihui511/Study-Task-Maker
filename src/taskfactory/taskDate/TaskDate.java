package taskfactory.taskDate;

import java.util.Date;

public class TaskDate {
    private Date date;
    private int year;
    private String month;
    private int day;

    public TaskDate() {
        this.date = new Date();
        String string = date.toString();
        String[] split = string.split(" ");
        this.month =  split[1];
        this.year = Integer.getInteger(split[5]);
        this.day = Integer.getInteger(split[2]);
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public String getMonth() {
        return month;
    }

    @Override
    public String toString() {
        return year + ' ' + month + day;
    }
}
