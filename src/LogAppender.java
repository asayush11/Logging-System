package src;

public interface LogAppender {
    public void append(LogMessage logMessage);

    void displayLogs();
}
