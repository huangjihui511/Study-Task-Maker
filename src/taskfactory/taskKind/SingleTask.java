package taskfactory.taskind;

public interface SingleTask {
    public boolean isfinished();
    public String toString();
    public void finishTask();
    public void unfinishTask();
}