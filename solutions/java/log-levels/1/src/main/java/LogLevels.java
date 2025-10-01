public class LogLevels {

   
    public static String message(String logLine) {
        int startIndex = logLine.indexOf(':')+1;
        int endIndex = logLine.length();
       
        if(startIndex > 0 && startIndex < endIndex){
            return logLine.substring(startIndex, endIndex).trim();
        } else {
            return "";
        }
    }

    public static String logLevel(String logLine) {
        int startIndex = logLine.indexOf('[')+1;
        int endIndex = logLine.indexOf(']');
       
        if(startIndex > 0 && startIndex < endIndex){
            return logLine.substring(startIndex, endIndex).toLowerCase();
        } else {
            return "";
        }
    }

    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}
