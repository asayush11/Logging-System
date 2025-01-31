package src;

import java.util.Date;

public class LogMessage {
    private final LogLevel logLevel;
    private final String logID;
    private final String message;
    private final Date date;

    public LogMessage(LogLevel logLevel, String logID, String message) {
        this.logLevel = logLevel;
        this.logID = logID;
        this.message = message;
        this.date = new Date();
    }

    public LogLevel getLogLevel() {
        return logLevel;
    }

    public String getLogID() {
        return logID;
    }

    public String getMessage() {
        return message;
    }

    public Date getDate() {
        return date;
    }
}
