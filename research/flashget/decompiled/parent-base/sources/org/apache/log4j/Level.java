package org.apache.log4j;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;

/* loaded from: classes3.dex */
public class Level extends Priority implements Serializable {
    public static final int TRACE_INT = 5000;
    static final long serialVersionUID = 3491141966387921974L;
    public static final Level OFF = new Level(Integer.MAX_VALUE, "OFF", 0);
    public static final Level FATAL = new Level(Priority.FATAL_INT, "FATAL", 0);
    public static final Level ERROR = new Level(Priority.ERROR_INT, "ERROR", 3);
    public static final Level WARN = new Level(Priority.WARN_INT, "WARN", 4);
    public static final Level INFO = new Level(20000, "INFO", 6);
    public static final Level DEBUG = new Level(10000, "DEBUG", 7);
    public static final Level TRACE = new Level(5000, "TRACE", 7);
    public static final Level ALL = new Level(Integer.MIN_VALUE, "ALL", 7);

    protected Level(int i4, String str, int i5) {
        super(i4, str, i5);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.level = objectInputStream.readInt();
        this.syslogEquivalent = objectInputStream.readInt();
        String readUTF = objectInputStream.readUTF();
        this.levelStr = readUTF;
        if (readUTF == null) {
            this.levelStr = "";
        }
    }

    private Object readResolve() throws ObjectStreamException {
        return getClass() == Level.class ? toLevel(this.level) : this;
    }

    public static Level toLevel(String str) {
        return toLevel(str, DEBUG);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.level);
        objectOutputStream.writeInt(this.syslogEquivalent);
        objectOutputStream.writeUTF(this.levelStr);
    }

    public static Level toLevel(int i4) {
        return toLevel(i4, DEBUG);
    }

    public static Level toLevel(int i4, Level level) {
        if (i4 == Integer.MIN_VALUE) {
            return ALL;
        }
        if (i4 == 5000) {
            return TRACE;
        }
        if (i4 == 10000) {
            return DEBUG;
        }
        if (i4 == 20000) {
            return INFO;
        }
        if (i4 == 30000) {
            return WARN;
        }
        if (i4 == 40000) {
            return ERROR;
        }
        if (i4 != 50000) {
            return i4 != Integer.MAX_VALUE ? level : OFF;
        }
        return FATAL;
    }

    public static Level toLevel(String str, Level level) {
        if (str == null) {
            return level;
        }
        String upperCase = str.toUpperCase();
        return upperCase.equals("ALL") ? ALL : upperCase.equals("DEBUG") ? DEBUG : upperCase.equals("INFO") ? INFO : upperCase.equals("WARN") ? WARN : upperCase.equals("ERROR") ? ERROR : upperCase.equals("FATAL") ? FATAL : upperCase.equals("OFF") ? OFF : upperCase.equals("TRACE") ? TRACE : upperCase.equals("İNFO") ? INFO : level;
    }
}
