package org.apache.log4j.helpers;

import java.io.InterruptedIOException;
import org.apache.log4j.Appender;
import org.apache.log4j.Logger;
import org.apache.log4j.spi.ErrorHandler;
import org.apache.log4j.spi.LoggingEvent;

/* loaded from: classes6.dex */
public class OnlyOnceErrorHandler implements ErrorHandler {
    final String WARN_PREFIX = "log4j warning: ";
    final String ERROR_PREFIX = "log4j error: ";
    boolean firstTime = true;

    @Override // org.apache.log4j.spi.OptionHandler
    public void activateOptions() {
    }

    @Override // org.apache.log4j.spi.ErrorHandler
    public void error(String str, Exception exc, int i5) {
        error(str, exc, i5, null);
    }

    @Override // org.apache.log4j.spi.ErrorHandler
    public void setAppender(Appender appender) {
    }

    @Override // org.apache.log4j.spi.ErrorHandler
    public void setBackupAppender(Appender appender) {
    }

    @Override // org.apache.log4j.spi.ErrorHandler
    public void setLogger(Logger logger) {
    }

    @Override // org.apache.log4j.spi.ErrorHandler
    public void error(String str, Exception exc, int i5, LoggingEvent loggingEvent) {
        if ((exc instanceof InterruptedIOException) || (exc instanceof InterruptedException)) {
            Thread.currentThread().interrupt();
        }
        if (this.firstTime) {
            LogLog.error(str, exc);
            this.firstTime = false;
        }
    }

    @Override // org.apache.log4j.spi.ErrorHandler
    public void error(String str) {
        if (this.firstTime) {
            LogLog.error(str);
            this.firstTime = false;
        }
    }
}
