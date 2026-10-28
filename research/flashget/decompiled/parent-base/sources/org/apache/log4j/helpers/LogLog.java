package org.apache.log4j.helpers;

import java.io.PrintStream;

/* loaded from: classes3.dex */
public class LogLog {
    protected static boolean debugEnabled;
    private static boolean quietMode;
    private static final String ERR_PREFIX = "log4j:ERROR ";
    private static final String PREFIX = "log4j: ";
    private static final String WARN_PREFIX = "log4j:WARN ";
    public static final String DEBUG_KEY = "log4j.debug";
    public static final String CONFIG_DEBUG_KEY = "log4j.configDebug";

    static {
        String systemProperty = OptionConverter.getSystemProperty("log4j.debug", null);
        if (systemProperty == null) {
            systemProperty = OptionConverter.getSystemProperty("log4j.configDebug", null);
        }
        if (systemProperty != null) {
            debugEnabled = OptionConverter.toBoolean(systemProperty, true);
        }
    }

    public static void debug(String str) {
        if (!debugEnabled || quietMode) {
            return;
        }
        System.out.println("log4j: " + str);
    }

    public static void error(String str) {
        if (quietMode) {
            return;
        }
        System.err.println("log4j:ERROR " + str);
    }

    public static void setInternalDebugging(boolean z4) {
        debugEnabled = z4;
    }

    public static void setQuietMode(boolean z4) {
        quietMode = z4;
    }

    public static void warn(String str) {
        if (quietMode) {
            return;
        }
        System.err.println("log4j:WARN " + str);
    }

    public static void debug(String str, Throwable th) {
        if (!debugEnabled || quietMode) {
            return;
        }
        PrintStream printStream = System.out;
        printStream.println("log4j: " + str);
        if (th != null) {
            th.printStackTrace(printStream);
        }
    }

    public static void error(String str, Throwable th) {
        if (quietMode) {
            return;
        }
        System.err.println("log4j:ERROR " + str);
        if (th != null) {
            th.printStackTrace();
        }
    }

    public static void warn(String str, Throwable th) {
        if (quietMode) {
            return;
        }
        System.err.println("log4j:WARN " + str);
        if (th != null) {
            th.printStackTrace();
        }
    }
}
