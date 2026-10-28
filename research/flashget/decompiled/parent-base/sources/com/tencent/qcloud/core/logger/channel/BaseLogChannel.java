package com.tencent.qcloud.core.logger.channel;

import com.tencent.qcloud.core.logger.LogEntity;
import com.tencent.qcloud.core.logger.LogLevel;

/* loaded from: classes7.dex */
public abstract class BaseLogChannel {
    private boolean enabled = true;
    private LogLevel minLevel = null;

    public LogLevel getMinLevel() {
        return this.minLevel;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public abstract void log(LogEntity logEntity);

    public void setEnabled(boolean z4) {
        this.enabled = z4;
    }

    public void setMinLevel(LogLevel logLevel) {
        this.minLevel = logLevel;
    }
}
