package org.apache.log4j;

import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import org.apache.log4j.spi.LoggingEvent;

/* loaded from: classes6.dex */
public final class LogMF extends LogXF {
    private static final String FQCN = "org.apache.log4j.LogMF";
    private static DateFormat dateFormat;
    private static Locale dateLocale;
    private static NumberFormat numberFormat;
    private static Locale numberLocale;

    private LogMF() {
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
        if (str == null) {
            return null;
        }
        if (!isSimple(str)) {
            try {
                return MessageFormat.format(str, objArr);
            } catch (IllegalArgumentException unused) {
                return str;
            }
        }
        String[] strArr = new String[10];
        int indexOf = str.indexOf(123);
        int i5 = 0;
        String str2 = "";
        while (indexOf >= 0) {
            int i6 = indexOf + 2;
            if (i6 < str.length() && str.charAt(i6) == '}') {
                int i7 = indexOf + 1;
                if (str.charAt(i7) >= '0' && str.charAt(i7) <= '9') {
                    int charAt = str.charAt(i7) - '0';
                    String str3 = String.valueOf(str2) + str.substring(i5, indexOf);
                    if (strArr[charAt] == null) {
                        if (objArr == null || charAt >= objArr.length) {
                            strArr[charAt] = str.substring(indexOf, indexOf + 3);
                        } else {
                            strArr[charAt] = formatObject(objArr[charAt]);
                        }
                    }
                    str2 = String.valueOf(str3) + strArr[charAt];
                    i5 = indexOf + 3;
                    indexOf = str.indexOf(123, i5);
                }
            }
            indexOf = str.indexOf(123, indexOf + 1);
        }
        return String.valueOf(str2) + str.substring(i5);
    }

    private static synchronized String formatDate(Object obj) {
        String format;
        synchronized (LogMF.class) {
            Locale locale = Locale.getDefault();
            if (locale != dateLocale || dateFormat == null) {
                dateLocale = locale;
                dateFormat = DateFormat.getDateTimeInstance(3, 3, locale);
            }
            format = dateFormat.format(obj);
        }
        return format;
    }

    private static synchronized String formatNumber(Object obj) {
        String format;
        synchronized (LogMF.class) {
            Locale locale = Locale.getDefault();
            if (locale != numberLocale || numberFormat == null) {
                numberLocale = locale;
                numberFormat = NumberFormat.getInstance(locale);
            }
            format = numberFormat.format(obj);
        }
        return format;
    }

    private static String formatObject(Object obj) {
        return obj instanceof String ? obj.toString() : ((obj instanceof Double) || (obj instanceof Float)) ? formatNumber(obj) : obj instanceof Date ? formatDate(obj) : String.valueOf(obj);
    }

    public static void info(Logger logger, String str, Object[] objArr) {
        if (logger.isInfoEnabled()) {
            forcedLog(logger, Level.INFO, format(str, objArr));
        }
    }

    private static boolean isSimple(String str) {
        if (str.indexOf(39) != -1) {
            return false;
        }
        int indexOf = str.indexOf(123);
        while (indexOf != -1) {
            int i5 = indexOf + 2;
            if (i5 < str.length() && str.charAt(i5) == '}') {
                int i6 = indexOf + 1;
                if (str.charAt(i6) >= '0' && str.charAt(i6) <= '9') {
                    indexOf = str.indexOf(123, i6);
                }
            }
            return false;
        }
        return true;
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

    private static String format(String str, Object obj) {
        String str2;
        String str3 = null;
        if (str == null) {
            return null;
        }
        int i5 = 0;
        if (isSimple(str)) {
            int indexOf = str.indexOf(123);
            String str4 = "";
            while (indexOf >= 0) {
                int i6 = indexOf + 2;
                if (i6 < str.length() && str.charAt(i6) == '}') {
                    int i7 = indexOf + 1;
                    if (str.charAt(i7) >= '0' && str.charAt(i7) <= '9') {
                        int charAt = str.charAt(i7) - '0';
                        String str5 = String.valueOf(str4) + str.substring(i5, indexOf);
                        if (charAt != 0) {
                            str2 = String.valueOf(str5) + str.substring(indexOf, indexOf + 3);
                        } else {
                            if (str3 == null) {
                                str3 = formatObject(obj);
                            }
                            str2 = String.valueOf(str5) + str3;
                        }
                        str4 = str2;
                        i5 = indexOf + 3;
                        indexOf = str.indexOf(123, i5);
                    }
                }
                indexOf = str.indexOf(123, indexOf + 1);
            }
            return String.valueOf(str4) + str.substring(i5);
        }
        try {
            return MessageFormat.format(str, obj);
        } catch (IllegalArgumentException unused) {
            return str;
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

    private static String format(String str, String str2, Object[] objArr) {
        if (str != null) {
            try {
                str2 = ResourceBundle.getBundle(str).getString(str2);
            } catch (Exception unused) {
            }
        }
        return format(str2, objArr);
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
