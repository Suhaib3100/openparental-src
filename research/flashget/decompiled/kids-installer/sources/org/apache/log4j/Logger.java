package org.apache.log4j;

import org.apache.log4j.spi.LoggerFactory;

/* loaded from: classes6.dex */
public class Logger extends Category {
    private static final String FQCN = "org.apache.log4j.Logger";

    protected Logger(String str) {
        super(str);
    }

    public static Logger getLogger(String str) {
        return LogManager.getLogger(str);
    }

    public static Logger getRootLogger() {
        return LogManager.getRootLogger();
    }

    public boolean isTraceEnabled() {
        if (this.repository.isDisabled(Level.TRACE_INT)) {
            return false;
        }
        return Level.TRACE.isGreaterOrEqual(getEffectiveLevel());
    }

    public void trace(Object obj) {
        if (this.repository.isDisabled(Level.TRACE_INT)) {
            return;
        }
        Level level = Level.TRACE;
        if (level.isGreaterOrEqual(getEffectiveLevel())) {
            forcedLog(FQCN, level, obj, null);
        }
    }

    public static Logger getLogger(Class cls) {
        return LogManager.getLogger(cls.getName());
    }

    public static Logger getLogger(String str, LoggerFactory loggerFactory) {
        return LogManager.getLogger(str, loggerFactory);
    }

    public void trace(Object obj, Throwable th) {
        if (this.repository.isDisabled(Level.TRACE_INT)) {
            return;
        }
        Level level = Level.TRACE;
        if (level.isGreaterOrEqual(getEffectiveLevel())) {
            forcedLog(FQCN, level, obj, th);
        }
    }
}
