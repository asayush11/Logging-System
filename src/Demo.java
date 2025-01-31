package src;

public class Demo {
    public static void main(String[] args) {
        LoggingSystem loggingSystem = LoggingSystem.getInstance();

        loggingSystem.displayLog(new ConsoleAppender());

        loggingSystem.addLog("Log 1", LogLevel.DEBUG);
        loggingSystem.addLog("Log 2", LogLevel.FATAL);

        loggingSystem.setLogAppender(new FileAppender());

        loggingSystem.addLog("Log 3", LogLevel.DEBUG);
        loggingSystem.addLog("Log 4", LogLevel.INFO);

        loggingSystem.setLogAppender(new ElasticSearchAppender());

        loggingSystem.addLog("Log 5", LogLevel.ERROR);
        loggingSystem.addLog("Log 6", LogLevel.WARNING);

        loggingSystem.setLogAppender(new FileAppender());
        loggingSystem.setLogLevel(LogLevel.WARNING);

        loggingSystem.addLog("Log 7", LogLevel.DEBUG);
        loggingSystem.addLog("Log 7", LogLevel.INFO);
        loggingSystem.addLog("Log 7", LogLevel.ERROR);

        loggingSystem.displayLog(new ConsoleAppender());
        loggingSystem.displayLog(new FileAppender());
        loggingSystem.displayLog(new ElasticSearchAppender());

    }

}
