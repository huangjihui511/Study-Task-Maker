package taskfactory.taskind;

import taskfactory.taskDate.TaskDate;

import java.util.HashMap;
import java.util.Objects;

public class FundamentalTask {
    private int id;
    private String taskname;
    private String helpinfo;
    private TaskDate date;
    private boolean iscompleted;
    private HashMap<String,FundamentalTask> subtasks;
    private SingleTask content;

    FundamentalTask(String taskname,String helpinfo,SingleTask content) {
        this.taskname = taskname;
        this.helpinfo = helpinfo;
        this.date = new TaskDate();
        this.id = Objects.hash(taskname.hashCode(), helpinfo.hashCode(),
                date.toString());
        this.iscompleted = false;
        this.subtasks = new HashMap<>();
        this.content = content;
    }

    public String getDateString() {
        return date.toString();
    }

    @Override
    public String toString() {
        return taskname + " : " + content.toString();
    }
}
