package org.apache.log4j;

import java.util.ResourceBundle;
import org.apache.log4j.spi.LoggingEvent;

/* loaded from: classes6.dex */
public final class LogSF extends LogXF {
    private static final String FQCN = "org.apache.log4j.LogSF";

    private LogSF() {
    }

    public static void debug(Logger logger, String str, Object[] objArr) {
        if (logger.isDebugEnabled()) {
            forcedLog(logger, Level.DEBUG, format(str, objArr));
        }
    }

    public static void error(Logger logger, String str, Object[] objArr) {
        Level level = Level.ERROR;
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, objArr));
        }
    }

    public static void fatal(Logger logger, String str, Object[] objArr) {
        Level level = Level.FATAL;
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, objArr));
        }
    }

    private static void forcedLog(Logger logger, Level level, String str) {
        logger.callAppenders(new LoggingEvent(FQCN, logger, level, str, null));
    }

    private static String format(String str, Object[] objArr) {
        String concat;
        int i5;
        int i6;
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf("{");
        int i7 = 0;
        String str2 = "";
        int i8 = 0;
        while (indexOf >= 0) {
            if (indexOf != 0) {
                int i9 = indexOf - 1;
                if (str.charAt(i9) == '\\') {
                    i6 = indexOf + 1;
                    str2 = String.valueOf(str2) + str.substring(i7, i9) + "{";
                    i7 = i6;
                    indexOf = str.indexOf("{", i7);
                }
            }
            String str3 = String.valueOf(str2) + str.substring(i7, indexOf);
            int i10 = indexOf + 1;
            if (i10 >= str.length() || str.charAt(i10) != '}') {
                String concat2 = String.valueOf(str3).concat("{");
                i7 = i10;
                str2 = concat2;
                indexOf = str.indexOf("{", i7);
            } else {
                if (objArr == null || i8 >= objArr.length) {
                    int i11 = i8;
                    concat = String.valueOf(str3).concat("{}");
                    i5 = i11;
                } else {
                    StringBuilder sb = new StringBuilder(String.valueOf(str3));
                    i5 = i8 + 1;
                    sb.append(objArr[i8]);
                    concat = sb.toString();
                }
                i6 = indexOf + 2;
                str2 = concat;
                i8 = i5;
                i7 = i6;
                indexOf = str.indexOf("{", i7);
            }
        }
        return String.valueOf(str2) + str.substring(i7);
    }

    public static void info(Logger logger, String str, Object[] objArr) {
        if (logger.isInfoEnabled()) {
            forcedLog(logger, Level.INFO, format(str, objArr));
        }
    }

    public static void log(Logger logger, Level level, String str, Object[] objArr) {
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, objArr));
        }
    }

    public static void logrb(Logger logger, Level level, String str, String str2, Object[] objArr) {
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, str2, objArr));
        }
    }

    public static void trace(Logger logger, String str, Object[] objArr) {
        Level level = LogXF.TRACE;
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, objArr));
        }
    }

    public static void warn(Logger logger, String str, Object[] objArr) {
        Level level = Level.WARN;
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, objArr));
        }
    }

    private static void forcedLog(Logger logger, Level level, String str, Throwable th) {
        logger.callAppenders(new LoggingEvent(FQCN, logger, level, str, th));
    }

    public static void debug(Logger logger, Throwable th, String str, Object[] objArr) {
        if (logger.isDebugEnabled()) {
            forcedLog(logger, Level.DEBUG, format(str, objArr), th);
        }
    }

    public static void error(Logger logger, Throwable th, String str, Object[] objArr) {
        Level level = Level.ERROR;
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, objArr), th);
        }
    }

    public static void fatal(Logger logger, Throwable th, String str, Object[] objArr) {
        Level level = Level.FATAL;
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, objArr), th);
        }
    }

    public static void info(Logger logger, Throwable th, String str, Object[] objArr) {
        if (logger.isInfoEnabled()) {
            forcedLog(logger, Level.INFO, format(str, objArr), th);
        }
    }

    public static void trace(Logger logger, Throwable th, String str, Object[] objArr) {
        Level level = LogXF.TRACE;
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, objArr), th);
        }
    }

    public static void warn(Logger logger, Throwable th, String str, Object[] objArr) {
        Level level = Level.WARN;
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, objArr), th);
        }
    }

    public static void log(Logger logger, Level level, Throwable th, String str, Object[] objArr) {
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, objArr), th);
        }
    }

    public static void logrb(Logger logger, Level level, Throwable th, String str, String str2, Object[] objArr) {
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, str2, objArr), th);
        }
    }

    public static void debug(Logger logger, String str, boolean z5) {
        if (logger.isDebugEnabled()) {
            forcedLog(logger, Level.DEBUG, format(str, LogXF.valueOf(z5)));
        }
    }

    public static void info(Logger logger, String str, boolean z5) {
        if (logger.isInfoEnabled()) {
            forcedLog(logger, Level.INFO, format(str, LogXF.valueOf(z5)));
        }
    }

    public static void trace(Logger logger, String str, boolean z5) {
        Level level = LogXF.TRACE;
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, LogXF.valueOf(z5)));
        }
    }

    public static void warn(Logger logger, String str, boolean z5) {
        Level level = Level.WARN;
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, LogXF.valueOf(z5)));
        }
    }

    public static void debug(Logger logger, String str, char c6) {
        if (logger.isDebugEnabled()) {
            forcedLog(logger, Level.DEBUG, format(str, LogXF.valueOf(c6)));
        }
    }

    public static void info(Logger logger, String str, char c6) {
        if (logger.isInfoEnabled()) {
            forcedLog(logger, Level.INFO, format(str, LogXF.valueOf(c6)));
        }
    }

    public static void log(Logger logger, Level level, String str, Object obj) {
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, LogXF.toArray(obj)));
        }
    }

    public static void logrb(Logger logger, Level level, String str, String str2, Object obj) {
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, str2, LogXF.toArray(obj)));
        }
    }

    public static void trace(Logger logger, String str, char c6) {
        Level level = LogXF.TRACE;
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, LogXF.valueOf(c6)));
        }
    }

    public static void warn(Logger logger, String str, char c6) {
        Level level = Level.WARN;
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, LogXF.valueOf(c6)));
        }
    }

    public static void debug(Logger logger, String str, byte b6) {
        if (logger.isDebugEnabled()) {
            forcedLog(logger, Level.DEBUG, format(str, LogXF.valueOf(b6)));
        }
    }

    public static void info(Logger logger, String str, byte b6) {
        if (logger.isInfoEnabled()) {
            forcedLog(logger, Level.INFO, format(str, LogXF.valueOf(b6)));
        }
    }

    public static void trace(Logger logger, String str, byte b6) {
        Level level = LogXF.TRACE;
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, LogXF.valueOf(b6)));
        }
    }

    public static void warn(Logger logger, String str, byte b6) {
        Level level = Level.WARN;
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, LogXF.valueOf(b6)));
        }
    }

    public static void log(Logger logger, Level level, String str, boolean z5) {
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, LogXF.toArray(LogXF.valueOf(z5))));
        }
    }

    public static void logrb(Logger logger, Level level, String str, String str2, boolean z5) {
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, str2, LogXF.toArray(LogXF.valueOf(z5))));
        }
    }

    public static void debug(Logger logger, String str, short s5) {
        if (logger.isDebugEnabled()) {
            forcedLog(logger, Level.DEBUG, format(str, LogXF.valueOf(s5)));
        }
    }

    public static void info(Logger logger, String str, short s5) {
        if (logger.isInfoEnabled()) {
            forcedLog(logger, Level.INFO, format(str, LogXF.valueOf(s5)));
        }
    }

    public static void trace(Logger logger, String str, short s5) {
        Level level = LogXF.TRACE;
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, LogXF.valueOf(s5)));
        }
    }

    public static void warn(Logger logger, String str, short s5) {
        Level level = Level.WARN;
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, LogXF.valueOf(s5)));
        }
    }

    private static String format(String str, Object obj) {
        if (str == null) {
            return str;
        }
        if (str.indexOf("\\{") >= 0) {
            return format(str, new Object[]{obj});
        }
        int indexOf = str.indexOf("{}");
        if (indexOf < 0) {
            return str;
        }
        return String.valueOf(str.substring(0, indexOf)) + obj + str.substring(indexOf + 2);
    }

    public static void debug(Logger logger, String str, int i5) {
        if (logger.isDebugEnabled()) {
            forcedLog(logger, Level.DEBUG, format(str, LogXF.valueOf(i5)));
        }
    }

    public static void info(Logger logger, String str, int i5) {
        if (logger.isInfoEnabled()) {
            forcedLog(logger, Level.INFO, format(str, LogXF.valueOf(i5)));
        }
    }

    public static void log(Logger logger, Level level, String str, byte b6) {
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, LogXF.toArray(LogXF.valueOf(b6))));
        }
    }

    public static void logrb(Logger logger, Level level, String str, String str2, char c6) {
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, str2, LogXF.toArray(LogXF.valueOf(c6))));
        }
    }

    public static void trace(Logger logger, String str, int i5) {
        Level level = LogXF.TRACE;
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, LogXF.valueOf(i5)));
        }
    }

    public static void warn(Logger logger, String str, int i5) {
        Level level = Level.WARN;
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, LogXF.valueOf(i5)));
        }
    }

    public static void debug(Logger logger, String str, long j5) {
        if (logger.isDebugEnabled()) {
            forcedLog(logger, Level.DEBUG, format(str, LogXF.valueOf(j5)));
        }
    }

    public static void info(Logger logger, String str, long j5) {
        if (logger.isInfoEnabled()) {
            forcedLog(logger, Level.INFO, format(str, LogXF.valueOf(j5)));
        }
    }

    public static void trace(Logger logger, String str, long j5) {
        Level level = LogXF.TRACE;
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, LogXF.valueOf(j5)));
        }
    }

    public static void warn(Logger logger, String str, long j5) {
        Level level = Level.WARN;
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, LogXF.valueOf(j5)));
        }
    }

    private static String format(String str, String str2, Object[] objArr) {
        if (str != null) {
            try {
                str2 = ResourceBundle.getBundle(str).getString(str2);
            } catch (Exception unused) {
            }
        }
        return format(str2, objArr);
    }

    public static void log(Logger logger, Level level, String str, char c6) {
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, LogXF.toArray(LogXF.valueOf(c6))));
        }
    }

    public static void logrb(Logger logger, Level level, String str, String str2, byte b6) {
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, str2, LogXF.toArray(LogXF.valueOf(b6))));
        }
    }

    public static void debug(Logger logger, String str, float f6) {
        if (logger.isDebugEnabled()) {
            forcedLog(logger, Level.DEBUG, format(str, LogXF.valueOf(f6)));
        }
    }

    public static void info(Logger logger, String str, float f6) {
        if (logger.isInfoEnabled()) {
            forcedLog(logger, Level.INFO, format(str, LogXF.valueOf(f6)));
        }
    }

    public static void trace(Logger logger, String str, float f6) {
        Level level = LogXF.TRACE;
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, LogXF.valueOf(f6)));
        }
    }

    public static void warn(Logger logger, String str, float f6) {
        Level level = Level.WARN;
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, LogXF.valueOf(f6)));
        }
    }

    public static void debug(Logger logger, String str, double d6) {
        if (logger.isDebugEnabled()) {
            forcedLog(logger, Level.DEBUG, format(str, LogXF.valueOf(d6)));
        }
    }

    public static void info(Logger logger, String str, double d6) {
        if (logger.isInfoEnabled()) {
            forcedLog(logger, Level.INFO, format(str, LogXF.valueOf(d6)));
        }
    }

    public static void log(Logger logger, Level level, String str, short s5) {
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, LogXF.toArray(LogXF.valueOf(s5))));
        }
    }

    public static void logrb(Logger logger, Level level, String str, String str2, short s5) {
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, str2, LogXF.toArray(LogXF.valueOf(s5))));
        }
    }

    public static void trace(Logger logger, String str, double d6) {
        Level level = LogXF.TRACE;
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, LogXF.valueOf(d6)));
        }
    }

    public static void warn(Logger logger, String str, double d6) {
        Level level = Level.WARN;
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, LogXF.valueOf(d6)));
        }
    }

    public static void debug(Logger logger, String str, Object obj) {
        if (logger.isDebugEnabled()) {
            forcedLog(logger, Level.DEBUG, format(str, obj));
        }
    }

    public static void info(Logger logger, String str, Object obj) {
        if (logger.isInfoEnabled()) {
            forcedLog(logger, Level.INFO, format(str, obj));
        }
    }

    public static void trace(Logger logger, String str, Object obj) {
        Level level = LogXF.TRACE;
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, obj));
        }
    }

    public static void warn(Logger logger, String str, Object obj) {
        Level level = Level.WARN;
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, obj));
        }
    }

    public static void log(Logger logger, Level level, String str, int i5) {
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, LogXF.toArray(LogXF.valueOf(i5))));
        }
    }

    public static void logrb(Logger logger, Level level, String str, String str2, int i5) {
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, str2, LogXF.toArray(LogXF.valueOf(i5))));
        }
    }

    public static void debug(Logger logger, String str, Object obj, Object obj2) {
        if (logger.isDebugEnabled()) {
            forcedLog(logger, Level.DEBUG, format(str, LogXF.toArray(obj, obj2)));
        }
    }

    public static void info(Logger logger, String str, Object obj, Object obj2) {
        if (logger.isInfoEnabled()) {
            forcedLog(logger, Level.INFO, format(str, LogXF.toArray(obj, obj2)));
        }
    }

    public static void trace(Logger logger, String str, Object obj, Object obj2) {
        Level level = LogXF.TRACE;
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, LogXF.toArray(obj, obj2)));
        }
    }

    public static void warn(Logger logger, String str, Object obj, Object obj2) {
        Level level = Level.WARN;
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, LogXF.toArray(obj, obj2)));
        }
    }

    public static void info(Logger logger, String str, Object obj, Object obj2, Object obj3) {
        if (logger.isInfoEnabled()) {
            forcedLog(logger, Level.INFO, format(str, LogXF.toArray(obj, obj2, obj3)));
        }
    }

    public static void log(Logger logger, Level level, String str, long j5) {
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, LogXF.toArray(LogXF.valueOf(j5))));
        }
    }

    public static void logrb(Logger logger, Level level, String str, String str2, long j5) {
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, str2, LogXF.toArray(LogXF.valueOf(j5))));
        }
    }

    public static void trace(Logger logger, String str, Object obj, Object obj2, Object obj3) {
        Level level = LogXF.TRACE;
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, LogXF.toArray(obj, obj2, obj3)));
        }
    }

    public static void warn(Logger logger, String str, Object obj, Object obj2, Object obj3) {
        Level level = Level.WARN;
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, LogXF.toArray(obj, obj2, obj3)));
        }
    }

    public static void debug(Logger logger, String str, Object obj, Object obj2, Object obj3) {
        if (logger.isDebugEnabled()) {
            forcedLog(logger, Level.DEBUG, format(str, LogXF.toArray(obj, obj2, obj3)));
        }
    }

    public static void log(Logger logger, Level level, String str, float f6) {
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, LogXF.toArray(LogXF.valueOf(f6))));
        }
    }

    public static void logrb(Logger logger, Level level, String str, String str2, float f6) {
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, str2, LogXF.toArray(LogXF.valueOf(f6))));
        }
    }

    public static void info(Logger logger, String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (logger.isInfoEnabled()) {
            forcedLog(logger, Level.INFO, format(str, LogXF.toArray(obj, obj2, obj3, obj4)));
        }
    }

    public static void trace(Logger logger, String str, Object obj, Object obj2, Object obj3, Object obj4) {
        Level level = LogXF.TRACE;
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, LogXF.toArray(obj, obj2, obj3, obj4)));
        }
    }

    public static void warn(Logger logger, String str, Object obj, Object obj2, Object obj3, Object obj4) {
        Level level = Level.WARN;
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, LogXF.toArray(obj, obj2, obj3, obj4)));
        }
    }

    public static void debug(Logger logger, String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (logger.isDebugEnabled()) {
            forcedLog(logger, Level.DEBUG, format(str, LogXF.toArray(obj, obj2, obj3, obj4)));
        }
    }

    public static void log(Logger logger, Level level, String str, double d6) {
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, LogXF.toArray(LogXF.valueOf(d6))));
        }
    }

    public static void logrb(Logger logger, Level level, String str, String str2, double d6) {
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, str2, LogXF.toArray(LogXF.valueOf(d6))));
        }
    }

    public static void log(Logger logger, Level level, String str, Object obj, Object obj2) {
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, LogXF.toArray(obj, obj2)));
        }
    }

    public static void logrb(Logger logger, Level level, String str, String str2, Object obj, Object obj2) {
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, str2, LogXF.toArray(obj, obj2)));
        }
    }

    public static void log(Logger logger, Level level, String str, Object obj, Object obj2, Object obj3) {
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, LogXF.toArray(obj, obj2, obj3)));
        }
    }

    public static void logrb(Logger logger, Level level, String str, String str2, Object obj, Object obj2, Object obj3) {
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, str2, LogXF.toArray(obj, obj2, obj3)));
        }
    }

    public static void log(Logger logger, Level level, String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, LogXF.toArray(obj, obj2, obj3, obj4)));
        }
    }

    public static void logrb(Logger logger, Level level, String str, String str2, Object obj, Object obj2, Object obj3, Object obj4) {
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, str2, LogXF.toArray(obj, obj2, obj3, obj4)));
        }
    }
}
