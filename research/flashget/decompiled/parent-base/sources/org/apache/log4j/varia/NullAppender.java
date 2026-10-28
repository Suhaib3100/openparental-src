package org.apache.log4j.varia;

import org.apache.log4j.AppenderSkeleton;
import org.apache.log4j.spi.LoggingEvent;

/* loaded from: classes3.dex */
public class NullAppender extends AppenderSkeleton {
    private static NullAppender instance = new NullAppender();

    public static NullAppender getNullAppender() {
        return instance;
    }

    @Override // org.apache.log4j.AppenderSkeleton, org.apache.log4j.spi.OptionHandler
    public void activateOptions() {
    }

    @Override // org.apache.log4j.AppenderSkeleton
    protected void append(LoggingEvent loggingEvent) {
    }

    @Override // org.apache.log4j.Appender
    public void close() {
    }

    @Override // org.apache.log4j.AppenderSkeleton, org.apache.log4j.Appender
    public void doAppend(LoggingEvent loggingEvent) {
    }

    public NullAppender getInstance() {
        return instance;
    }

    @Override // org.apache.log4j.Appender
    public boolean requiresLayout() {
        return false;
    }
}
