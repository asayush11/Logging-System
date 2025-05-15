package src;

import java.util.ArrayList;
import java.util.List;

public class FileAppender implements LogAppender{

    private final List<LogMessage> logMessages  = new ArrayList<>();
    private static FileAppender soInstance;

    private FileAppender() {
    }

    public static synchronized FileAppender getInstance(){
        if(soInstance == null){
            soInstance = new FileAppender();
        }
        return soInstance;
    }

    @Override
    public void append(LogMessage logMessage) {
        logMessages.add(logMessage);
        System.out.println("Added a log in File");
    }

    @Override
    public void displayLogs() {
        System.out.println("Displaying all logs in File");
        logMessages
                .forEach(logMessage -> System.out.println(logMessage.getLogID() + " " + logMessage.getLogLevel() + " " + logMessage.getMessage() + " " + logMessage.getDate()));
    }
}
