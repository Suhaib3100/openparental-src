package org.apache.log4j;

import androidx.concurrent.futures.a;
import androidx.fragment.app.e0;
import org.apache.log4j.spi.LoggingEvent;

/* loaded from: classes5.dex */
public abstract class LogXF {
    protected static final Level TRACE = new Level(Level.TRACE_INT, "TRACE", 7);
    private static final String FQCN = LogXF.class.getName();

    protected LogXF() {
    }

    public static void entering(Logger logger, String str, String str2) {
        if (logger.isDebugEnabled()) {
            logger.callAppenders(new LoggingEvent(FQCN, logger, Level.DEBUG, e0.a(new StringBuilder(String.valueOf(str)), ".", str2, " ENTRY"), null));
        }
    }

    public static void exiting(Logger logger, String str, String str2) {
        if (logger.isDebugEnabled()) {
            logger.callAppenders(new LoggingEvent(FQCN, logger, Level.DEBUG, e0.a(new StringBuilder(String.valueOf(str)), ".", str2, " RETURN"), null));
        }
    }

    public static void throwing(Logger logger, String str, String str2, Throwable th) {
        if (logger.isDebugEnabled()) {
            logger.callAppenders(new LoggingEvent(FQCN, logger, Level.DEBUG, e0.a(new StringBuilder(String.valueOf(str)), ".", str2, " THROW"), th));
        }
    }

    protected static Object[] toArray(Object obj) {
        return new Object[]{obj};
    }

    protected static Boolean valueOf(boolean z5) {
        return z5 ? Boolean.TRUE : Boolean.FALSE;
    }

    protected static Object[] toArray(Object obj, Object obj2) {
        return new Object[]{obj, obj2};
    }

    protected static Object[] toArray(Object obj, Object obj2, Object obj3) {
        return new Object[]{obj, obj2, obj3};
    }

    protected static Character valueOf(char c6) {
        return new Character(c6);
    }

    protected static Object[] toArray(Object obj, Object obj2, Object obj3, Object obj4) {
        return new Object[]{obj, obj2, obj3, obj4};
    }

    protected static Byte valueOf(byte b6) {
        return new Byte(b6);
    }

    protected static Short valueOf(short s5) {
        return new Short(s5);
    }

    protected static Integer valueOf(int i5) {
        return new Integer(i5);
    }

    protected static Long valueOf(long j5) {
        return new Long(j5);
    }

    protected static Float valueOf(float f6) {
        return new Float(f6);
    }

    protected static Double valueOf(double d6) {
        return new Double(d6);
    }

    public static void entering(Logger logger, String str, String str2, String str3) {
        if (logger.isDebugEnabled()) {
            logger.callAppenders(new LoggingEvent(FQCN, logger, Level.DEBUG, String.valueOf(str) + "." + str2 + " ENTRY " + str3, null));
        }
    }

    public static void exiting(Logger logger, String str, String str2, String str3) {
        if (logger.isDebugEnabled()) {
            logger.callAppenders(new LoggingEvent(FQCN, logger, Level.DEBUG, String.valueOf(str) + "." + str2 + " RETURN " + str3, null));
        }
    }

    public static void exiting(Logger logger, String str, String str2, Object obj) {
        String concat;
        if (logger.isDebugEnabled()) {
            String a6 = e0.a(new StringBuilder(String.valueOf(str)), ".", str2, " RETURN ");
            if (obj == null) {
                concat = String.valueOf(a6).concat("null");
            } else {
                try {
                    concat = String.valueOf(a6) + obj;
                } catch (Throwable unused) {
                    concat = String.valueOf(a6).concat("?");
                }
            }
            logger.callAppenders(new LoggingEvent(FQCN, logger, Level.DEBUG, concat, null));
        }
    }

    public static void entering(Logger logger, String str, String str2, Object obj) {
        String concat;
        if (logger.isDebugEnabled()) {
            String a6 = e0.a(new StringBuilder(String.valueOf(str)), ".", str2, " ENTRY ");
            if (obj == null) {
                concat = String.valueOf(a6).concat("null");
            } else {
                try {
                    concat = String.valueOf(a6) + obj;
                } catch (Throwable unused) {
                    concat = String.valueOf(a6).concat("?");
                }
            }
            logger.callAppenders(new LoggingEvent(FQCN, logger, Level.DEBUG, concat, null));
        }
    }

    public static void entering(Logger logger, String str, String str2, Object[] objArr) {
        String concat;
        if (logger.isDebugEnabled()) {
            String a6 = e0.a(new StringBuilder(String.valueOf(str)), ".", str2, " ENTRY ");
            if (objArr != null && objArr.length > 0) {
                String str3 = "{";
                int i5 = 0;
                while (i5 < objArr.length) {
                    try {
                        a6 = String.valueOf(a6) + str3 + objArr[i5];
                    } catch (Throwable unused) {
                        a6 = a.a(new StringBuilder(String.valueOf(a6)), str3, "?");
                    }
                    i5++;
                    str3 = ",";
                }
                concat = String.valueOf(a6).concat("}");
            } else {
                concat = String.valueOf(a6).concat("{}");
            }
            logger.callAppenders(new LoggingEvent(FQCN, logger, Level.DEBUG, concat, null));
        }
    }
}
