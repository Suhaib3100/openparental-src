package com.tencent.qcloud.core.logger;

/* loaded from: classes7.dex */
public enum LogLevel {
    VERBOSE(1),
    DEBUG(2),
    INFO(3),
    WARN(4),
    ERROR(5);

    private final int priority;

    LogLevel(int i4) {
        this.priority = i4;
    }

    public int getPriority() {
        return this.priority;
    }

    public boolean isLoggable(LogLevel logLevel) {
        return logLevel == null || this.priority >= logLevel.priority;
    }
}
