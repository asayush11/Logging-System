package src;

import com.github.weisj.jsvg.C;

import java.util.ArrayList;
import java.util.List;

public class ConsoleAppender implements LogAppender{

    private final static List<LogMessage> logMessages = new ArrayList<>();

    private static ConsoleAppender soInstance;

    private ConsoleAppender() {
    }

    public static synchronized ConsoleAppender getInstance(){
        if(soInstance == null){
            soInstance = new ConsoleAppender();
        }
        return soInstance;
    }

    @Override
    public void append(LogMessage logMessage) {
        logMessages.add(logMessage);
        System.out.println("Added a log in Console");
    }

    @Override
    public void displayLogs() {
        System.out.println("Displaying all logs in Console");
        logMessages
                .forEach(logMessage -> System.out.println(logMessage.getLogID() + " " + logMessage.getLogLevel() + " " + logMessage.getMessage() + " " + logMessage.getDate()));
    }
}
