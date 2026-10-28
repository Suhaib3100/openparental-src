package org.apache.log4j;

import java.util.ResourceBundle;
import org.apache.log4j.spi.LoggingEvent;

/* loaded from: classes3.dex */
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
        int i4;
        int i5;
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf("{");
        int i6 = 0;
        String str2 = "";
        int i7 = 0;
        while (indexOf >= 0) {
            if (indexOf != 0) {
                int i10 = indexOf - 1;
                if (str.charAt(i10) == '\\') {
                    i5 = indexOf + 1;
                    str2 = String.valueOf(str2) + str.substring(i6, i10) + "{";
                    i6 = i5;
                    indexOf = str.indexOf("{", i6);
                }
            }
            String str3 = String.valueOf(str2) + str.substring(i6, indexOf);
            int i11 = indexOf + 1;
            if (i11 >= str.length() || str.charAt(i11) != '}') {
                String concat2 = String.valueOf(str3).concat("{");
                i6 = i11;
                str2 = concat2;
                indexOf = str.indexOf("{", i6);
            } else {
                if (objArr == null || i7 >= objArr.length) {
                    int i12 = i7;
                    concat = String.valueOf(str3).concat("{}");
                    i4 = i12;
                } else {
                    StringBuilder sb = new StringBuilder(String.valueOf(str3));
                    i4 = i7 + 1;
                    sb.append(objArr[i7]);
                    concat = sb.toString();
                }
                i5 = indexOf + 2;
                str2 = concat;
                i7 = i4;
                i6 = i5;
                indexOf = str.indexOf("{", i6);
            }
        }
        return String.valueOf(str2) + str.substring(i6);
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

    public static void debug(Logger logger, String str, boolean z4) {
        if (logger.isDebugEnabled()) {
            forcedLog(logger, Level.DEBUG, format(str, LogXF.valueOf(z4)));
        }
    }

    public static void info(Logger logger, String str, boolean z4) {
        if (logger.isInfoEnabled()) {
            forcedLog(logger, Level.INFO, format(str, LogXF.valueOf(z4)));
        }
    }

    public static void trace(Logger logger, String str, boolean z4) {
        Level level = LogXF.TRACE;
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, LogXF.valueOf(z4)));
        }
    }

    public static void warn(Logger logger, String str, boolean z4) {
        Level level = Level.WARN;
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, LogXF.valueOf(z4)));
        }
    }

    public static void debug(Logger logger, String str, char c5) {
        if (logger.isDebugEnabled()) {
            forcedLog(logger, Level.DEBUG, format(str, LogXF.valueOf(c5)));
        }
    }

    public static void info(Logger logger, String str, char c5) {
        if (logger.isInfoEnabled()) {
            forcedLog(logger, Level.INFO, format(str, LogXF.valueOf(c5)));
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

    public static void trace(Logger logger, String str, char c5) {
        Level level = LogXF.TRACE;
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, LogXF.valueOf(c5)));
        }
    }

    public static void warn(Logger logger, String str, char c5) {
        Level level = Level.WARN;
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, LogXF.valueOf(c5)));
        }
    }

    public static void debug(Logger logger, String str, byte b5) {
        if (logger.isDebugEnabled()) {
            forcedLog(logger, Level.DEBUG, format(str, LogXF.valueOf(b5)));
        }
    }

    public static void info(Logger logger, String str, byte b5) {
        if (logger.isInfoEnabled()) {
            forcedLog(logger, Level.INFO, format(str, LogXF.valueOf(b5)));
        }
    }

    public static void trace(Logger logger, String str, byte b5) {
        Level level = LogXF.TRACE;
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, LogXF.valueOf(b5)));
        }
    }

    public static void warn(Logger logger, String str, byte b5) {
        Level level = Level.WARN;
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, LogXF.valueOf(b5)));
        }
    }

    public static void log(Logger logger, Level level, String str, boolean z4) {
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, LogXF.toArray(LogXF.valueOf(z4))));
        }
    }

    public static void logrb(Logger logger, Level level, String str, String str2, boolean z4) {
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, str2, LogXF.toArray(LogXF.valueOf(z4))));
        }
    }

    public static void debug(Logger logger, String str, short s4) {
        if (logger.isDebugEnabled()) {
            forcedLog(logger, Level.DEBUG, format(str, LogXF.valueOf(s4)));
        }
    }

    public static void info(Logger logger, String str, short s4) {
        if (logger.isInfoEnabled()) {
            forcedLog(logger, Level.INFO, format(str, LogXF.valueOf(s4)));
        }
    }

    public static void trace(Logger logger, String str, short s4) {
        Level level = LogXF.TRACE;
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, LogXF.valueOf(s4)));
        }
    }

    public static void warn(Logger logger, String str, short s4) {
        Level level = Level.WARN;
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, LogXF.valueOf(s4)));
        }
    }

    public static void debug(Logger logger, String str, int i4) {
        if (logger.isDebugEnabled()) {
            forcedLog(logger, Level.DEBUG, format(str, LogXF.valueOf(i4)));
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

    public static void info(Logger logger, String str, int i4) {
        if (logger.isInfoEnabled()) {
            forcedLog(logger, Level.INFO, format(str, LogXF.valueOf(i4)));
        }
    }

    public static void log(Logger logger, Level level, String str, byte b5) {
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, LogXF.toArray(LogXF.valueOf(b5))));
        }
    }

    public static void logrb(Logger logger, Level level, String str, String str2, char c5) {
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, str2, LogXF.toArray(LogXF.valueOf(c5))));
        }
    }

    public static void trace(Logger logger, String str, int i4) {
        Level level = LogXF.TRACE;
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, LogXF.valueOf(i4)));
        }
    }

    public static void warn(Logger logger, String str, int i4) {
        Level level = Level.WARN;
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, LogXF.valueOf(i4)));
        }
    }

    public static void debug(Logger logger, String str, long j4) {
        if (logger.isDebugEnabled()) {
            forcedLog(logger, Level.DEBUG, format(str, LogXF.valueOf(j4)));
        }
    }

    public static void info(Logger logger, String str, long j4) {
        if (logger.isInfoEnabled()) {
            forcedLog(logger, Level.INFO, format(str, LogXF.valueOf(j4)));
        }
    }

    public static void trace(Logger logger, String str, long j4) {
        Level level = LogXF.TRACE;
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, LogXF.valueOf(j4)));
        }
    }

    public static void warn(Logger logger, String str, long j4) {
        Level level = Level.WARN;
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, LogXF.valueOf(j4)));
        }
    }

    public static void log(Logger logger, Level level, String str, char c5) {
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, LogXF.toArray(LogXF.valueOf(c5))));
        }
    }

    public static void logrb(Logger logger, Level level, String str, String str2, byte b5) {
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, str2, LogXF.toArray(LogXF.valueOf(b5))));
        }
    }

    public static void debug(Logger logger, String str, float f4) {
        if (logger.isDebugEnabled()) {
            forcedLog(logger, Level.DEBUG, format(str, LogXF.valueOf(f4)));
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

    public static void info(Logger logger, String str, float f4) {
        if (logger.isInfoEnabled()) {
            forcedLog(logger, Level.INFO, format(str, LogXF.valueOf(f4)));
        }
    }

    public static void trace(Logger logger, String str, float f4) {
        Level level = LogXF.TRACE;
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, LogXF.valueOf(f4)));
        }
    }

    public static void warn(Logger logger, String str, float f4) {
        Level level = Level.WARN;
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, LogXF.valueOf(f4)));
        }
    }

    public static void debug(Logger logger, String str, double d5) {
        if (logger.isDebugEnabled()) {
            forcedLog(logger, Level.DEBUG, format(str, LogXF.valueOf(d5)));
        }
    }

    public static void info(Logger logger, String str, double d5) {
        if (logger.isInfoEnabled()) {
            forcedLog(logger, Level.INFO, format(str, LogXF.valueOf(d5)));
        }
    }

    public static void log(Logger logger, Level level, String str, short s4) {
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, LogXF.toArray(LogXF.valueOf(s4))));
        }
    }

    public static void logrb(Logger logger, Level level, String str, String str2, short s4) {
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, str2, LogXF.toArray(LogXF.valueOf(s4))));
        }
    }

    public static void trace(Logger logger, String str, double d5) {
        Level level = LogXF.TRACE;
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, LogXF.valueOf(d5)));
        }
    }

    public static void warn(Logger logger, String str, double d5) {
        Level level = Level.WARN;
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, LogXF.valueOf(d5)));
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

    public static void log(Logger logger, Level level, String str, int i4) {
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, LogXF.toArray(LogXF.valueOf(i4))));
        }
    }

    public static void logrb(Logger logger, Level level, String str, String str2, int i4) {
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, str2, LogXF.toArray(LogXF.valueOf(i4))));
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

    public static void log(Logger logger, Level level, String str, long j4) {
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, LogXF.toArray(LogXF.valueOf(j4))));
        }
    }

    public static void logrb(Logger logger, Level level, String str, String str2, long j4) {
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, str2, LogXF.toArray(LogXF.valueOf(j4))));
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

    public static void log(Logger logger, Level level, String str, float f4) {
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, LogXF.toArray(LogXF.valueOf(f4))));
        }
    }

    public static void logrb(Logger logger, Level level, String str, String str2, float f4) {
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, str2, LogXF.toArray(LogXF.valueOf(f4))));
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

    public static void log(Logger logger, Level level, String str, double d5) {
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, LogXF.toArray(LogXF.valueOf(d5))));
        }
    }

    public static void logrb(Logger logger, Level level, String str, String str2, double d5) {
        if (logger.isEnabledFor(level)) {
            forcedLog(logger, level, format(str, str2, LogXF.toArray(LogXF.valueOf(d5))));
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
