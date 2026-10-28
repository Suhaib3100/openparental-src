package org.apache.log4j;

/* loaded from: classes5.dex */
public class Priority {
    public static final int ALL_INT = Integer.MIN_VALUE;
    public static final int DEBUG_INT = 10000;
    public static final int OFF_INT = Integer.MAX_VALUE;
    transient int level;
    transient String levelStr;
    transient int syslogEquivalent;
    public static final int FATAL_INT = 50000;
    public static final Priority FATAL = new Level(FATAL_INT, "FATAL", 0);
    public static final int ERROR_INT = 40000;
    public static final Priority ERROR = new Level(ERROR_INT, "ERROR", 3);
    public static final int WARN_INT = 30000;
    public static final Priority WARN = new Level(WARN_INT, "WARN", 4);
    public static final int INFO_INT = 20000;
    public static final Priority INFO = new Level(INFO_INT, "INFO", 6);
    public static final Priority DEBUG = new Level(10000, "DEBUG", 7);

    protected Priority() {
        this.level = 10000;
        this.levelStr = "DEBUG";
        this.syslogEquivalent = 7;
    }

    public static Priority[] getAllPossiblePriorities() {
        return new Priority[]{FATAL, ERROR, Level.WARN, INFO, DEBUG};
    }

    public static Priority toPriority(String str) {
        return Level.toLevel(str);
    }

    public boolean equals(Object obj) {
        return (obj instanceof Priority) && this.level == ((Priority) obj).level;
    }

    public final int getSyslogEquivalent() {
        return this.syslogEquivalent;
    }

    public boolean isGreaterOrEqual(Priority priority) {
        return this.level >= priority.level;
    }

    public final int toInt() {
        return this.level;
    }

    public final String toString() {
        return this.levelStr;
    }

    public static Priority toPriority(int i5) {
        return toPriority(i5, DEBUG);
    }

    public static Priority toPriority(int i5, Priority priority) {
        return Level.toLevel(i5, (Level) priority);
    }

    public static Priority toPriority(String str, Priority priority) {
        return Level.toLevel(str, (Level) priority);
    }

    protected Priority(int i5, String str, int i6) {
        this.level = i5;
        this.levelStr = str;
        this.syslogEquivalent = i6;
    }
}
