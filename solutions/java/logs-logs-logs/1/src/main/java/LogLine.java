public class LogLine {

    private final String line;
    
    public LogLine(String logLine) {
       this.line = logLine;
    }

    public LogLevel getLogLevel() {
       String code = line.substring(1, 4);
        
        return LogLevel.fromCode(code);
    }

    public String getMessage() {
        return line.substring(line.indexOf(":") + 2);
    }

    public String getOutputForShortLog() {
         LogLevel level = getLogLevel();
        return level.getEncoded() + ":" + getMessage();

    }
}
