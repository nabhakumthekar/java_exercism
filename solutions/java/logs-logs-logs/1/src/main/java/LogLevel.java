public enum LogLevel {
    TRACE("TRC", 1),
    DEBUG("DBG", 2),
    INFO("INF", 4),
    WARNING("WRN", 5),
    ERROR("ERR", 6),
    FATAL("FTL", 42),
    UNKNOWN("UNK", 0);

    private final String code;
    private final int encoded;

    LogLevel(String code, int encoded) {
        this.code = code;
        this.encoded = encoded;
    }

    public String getCode() {
        return code;
    }

    public int getEncoded() {
        return encoded;
    }

    // Convert from string code to enum
    public static LogLevel fromCode(String code) {
        for (LogLevel level : values()) {
            if (level.code.equals(code)) {
                return level;
            }
        }
        return LogLevel.UNKNOWN;
    }
}
