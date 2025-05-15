package src;

import java.time.LocalDateTime;

public class LogMessage {
    private final LogLevel logLevel;
    private final String logID;
    private final String message;
    private final LocalDateTime date;

    public LogMessage(LogLevel logLevel, String logID, String message) {
        this.logLevel = logLevel;
        this.logID = logID;
        this.message = message;
        this.date = LocalDateTime.now();
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

    public LocalDateTime getDate() {
        return date;
    }
}
