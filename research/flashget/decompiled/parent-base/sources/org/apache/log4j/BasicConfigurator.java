package org.apache.log4j;

/* loaded from: classes3.dex */
public class BasicConfigurator {
    protected BasicConfigurator() {
    }

    public static void configure() {
        Logger.getRootLogger().addAppender(new ConsoleAppender(new PatternLayout("%r [%t] %p %c %x - %m%n")));
    }

    public static void resetConfiguration() {
        LogManager.resetConfiguration();
    }

    public static void configure(Appender appender) {
        Logger.getRootLogger().addAppender(appender);
    }
}
