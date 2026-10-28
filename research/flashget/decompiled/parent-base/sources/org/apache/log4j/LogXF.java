package org.apache.log4j;

import androidx.fragment.app.c;
import androidx.fragment.app.k0;
import org.apache.log4j.spi.LoggingEvent;

/* loaded from: classes3.dex */
public abstract class LogXF {
    protected static final Level TRACE = new Level(5000, "TRACE", 7);
    private static final String FQCN = LogXF.class.getName();

    protected LogXF() {
    }

    public static void entering(Logger logger, String str, String str2) {
        if (logger.isDebugEnabled()) {
            logger.callAppenders(new LoggingEvent(FQCN, logger, Level.DEBUG, k0.a(new StringBuilder(String.valueOf(str)), ".", str2, " ENTRY"), null));
        }
    }

    public static void exiting(Logger logger, String str, String str2) {
        if (logger.isDebugEnabled()) {
            logger.callAppenders(new LoggingEvent(FQCN, logger, Level.DEBUG, k0.a(new StringBuilder(String.valueOf(str)), ".", str2, " RETURN"), null));
        }
    }

    public static void throwing(Logger logger, String str, String str2, Throwable th) {
        if (logger.isDebugEnabled()) {
            logger.callAppenders(new LoggingEvent(FQCN, logger, Level.DEBUG, k0.a(new StringBuilder(String.valueOf(str)), ".", str2, " THROW"), th));
        }
    }

    protected static Object[] toArray(Object obj) {
        return new Object[]{obj};
    }

    protected static Boolean valueOf(boolean z4) {
        return z4 ? Boolean.TRUE : Boolean.FALSE;
    }

    protected static Object[] toArray(Object obj, Object obj2) {
        return new Object[]{obj, obj2};
    }

    protected static Object[] toArray(Object obj, Object obj2, Object obj3) {
        return new Object[]{obj, obj2, obj3};
    }

    protected static Character valueOf(char c5) {
        return new Character(c5);
    }

    protected static Object[] toArray(Object obj, Object obj2, Object obj3, Object obj4) {
        return new Object[]{obj, obj2, obj3, obj4};
    }

    protected static Byte valueOf(byte b5) {
        return new Byte(b5);
    }

    protected static Short valueOf(short s4) {
        return new Short(s4);
    }

    protected static Integer valueOf(int i4) {
        return new Integer(i4);
    }

    protected static Long valueOf(long j4) {
        return new Long(j4);
    }

    protected static Float valueOf(float f4) {
        return new Float(f4);
    }

    protected static Double valueOf(double d5) {
        return new Double(d5);
    }

    public static void entering(Logger logger, String str, String str2, String str3) {
        if (logger.isDebugEnabled()) {
            logger.callAppenders(new LoggingEvent(FQCN, logger, Level.DEBUG, c.a(new StringBuilder(String.valueOf(str)), ".", str2, " ENTRY ", str3), null));
        }
    }

    public static void exiting(Logger logger, String str, String str2, String str3) {
        if (logger.isDebugEnabled()) {
            logger.callAppenders(new LoggingEvent(FQCN, logger, Level.DEBUG, c.a(new StringBuilder(String.valueOf(str)), ".", str2, " RETURN ", str3), null));
        }
    }

    public static void entering(Logger logger, String str, String str2, Object obj) {
        String concat;
        if (logger.isDebugEnabled()) {
            String a5 = k0.a(new StringBuilder(String.valueOf(str)), ".", str2, " ENTRY ");
            if (obj == null) {
                concat = String.valueOf(a5).concat("null");
            } else {
                try {
                    concat = String.valueOf(a5) + obj;
                } catch (Throwable unused) {
                    concat = String.valueOf(a5).concat("?");
                }
            }
            logger.callAppenders(new LoggingEvent(FQCN, logger, Level.DEBUG, concat, null));
        }
    }

    public static void exiting(Logger logger, String str, String str2, Object obj) {
        String concat;
        if (logger.isDebugEnabled()) {
            String a5 = k0.a(new StringBuilder(String.valueOf(str)), ".", str2, " RETURN ");
            if (obj == null) {
                concat = String.valueOf(a5).concat("null");
            } else {
                try {
                    concat = String.valueOf(a5) + obj;
                } catch (Throwable unused) {
                    concat = String.valueOf(a5).concat("?");
                }
            }
            logger.callAppenders(new LoggingEvent(FQCN, logger, Level.DEBUG, concat, null));
        }
    }

    public static void entering(Logger logger, String str, String str2, Object[] objArr) {
        String concat;
        if (logger.isDebugEnabled()) {
            String a5 = k0.a(new StringBuilder(String.valueOf(str)), ".", str2, " ENTRY ");
            if (objArr != null && objArr.length > 0) {
                String str3 = "{";
                int i4 = 0;
                while (i4 < objArr.length) {
                    try {
                        a5 = String.valueOf(a5) + str3 + objArr[i4];
                    } catch (Throwable unused) {
                        a5 = android.support.v4.media.c.a(new StringBuilder(String.valueOf(a5)), str3, "?");
                    }
                    i4++;
                    str3 = ",";
                }
                concat = String.valueOf(a5).concat("}");
            } else {
                concat = String.valueOf(a5).concat("{}");
            }
            logger.callAppenders(new LoggingEvent(FQCN, logger, Level.DEBUG, concat, null));
        }
    }
}
