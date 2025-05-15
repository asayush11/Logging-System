package src;

import java.util.ArrayList;
import java.util.List;

public class ElasticSearchAppender implements LogAppender{
    private final static List<LogMessage> logMessages = new ArrayList<>();

    private static ElasticSearchAppender soInstance;

    private ElasticSearchAppender() {
    }

    public static synchronized ElasticSearchAppender getInstance(){
        if(soInstance == null){
            soInstance = new ElasticSearchAppender();
        }
        return soInstance;
    }

    @Override
    public void append(LogMessage logMessage) {
        logMessages.add(logMessage);
        System.out.println("Added a log in ELK");
    }

    @Override
    public void displayLogs() {
        System.out.println("Displaying all logs in ELK");
        logMessages
                .forEach(logMessage -> System.out.println(logMessage.getLogID() + " " + logMessage.getLogLevel() + " " + logMessage.getMessage() + " " + logMessage.getDate()));
    }
}
