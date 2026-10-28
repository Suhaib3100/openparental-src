package org.apache.log4j.rewrite;

import org.apache.log4j.spi.LoggingEvent;

/* loaded from: classes5.dex */
public interface RewritePolicy {
    LoggingEvent rewrite(LoggingEvent loggingEvent);
}
