package src;

import java.util.UUID;

public class LoggingSystem {
    private static LoggingSystem instance;
    private LogAppender logAppender;
    private LogLevel logLevel;
    private LoggingSystem() {
        logAppender = new ConsoleAppender();
        logLevel = LogLevel.DEBUG;
        System.out.println("Initially logs are appended to Console and root level is DEBUG");
    }

    public static synchronized LoggingSystem getInstance() {
        if(instance == null) {
            instance = new LoggingSystem();
        }
        return instance;
    }

    public void setLogAppender(LogAppender logAppender) {
        this.logAppender = logAppender;
        System.out.println("Logger Appender is updated to " + logAppender.toString());
    }

    public void addLog(String message, LogLevel logLevel) {
        if(logLevel.ordinal() < this.logLevel.ordinal()) {
            System.out.println("Root logging level " + this.logLevel + " is higher than you log level");
            return;
        }
        String logID = logLevel.toString().charAt(0) + UUID.randomUUID().toString().substring(0,8);
        logAppender.append(new LogMessage(logLevel, logID, message));
    }

    public void setLogLevel(LogLevel logLevel) {
        this.logLevel = logLevel;
        System.out.println("Root log level set to " + logLevel);
    }

    public void displayLog(LogAppender logAppender) {
        logAppender.displayLogs();
    }
}
