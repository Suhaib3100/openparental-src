package org.apache.log4j.varia;

import java.io.InterruptedIOException;
import java.util.Vector;
import org.apache.log4j.Appender;
import org.apache.log4j.Logger;
import org.apache.log4j.helpers.LogLog;
import org.apache.log4j.spi.ErrorHandler;
import org.apache.log4j.spi.LoggingEvent;

/* loaded from: classes6.dex */
public class FallbackErrorHandler implements ErrorHandler {
    Appender backup;
    Vector loggers;
    Appender primary;

    @Override // org.apache.log4j.spi.OptionHandler
    public void activateOptions() {
    }

    @Override // org.apache.log4j.spi.ErrorHandler
    public void error(String str) {
    }

    @Override // org.apache.log4j.spi.ErrorHandler
    public void setAppender(Appender appender) {
        LogLog.debug("FB: Setting primary appender to [" + appender.getName() + "].");
        this.primary = appender;
    }

    @Override // org.apache.log4j.spi.ErrorHandler
    public void setBackupAppender(Appender appender) {
        LogLog.debug("FB: Setting backup appender to [" + appender.getName() + "].");
        this.backup = appender;
    }

    @Override // org.apache.log4j.spi.ErrorHandler
    public void setLogger(Logger logger) {
        LogLog.debug("FB: Adding logger [" + logger.getName() + "].");
        if (this.loggers == null) {
            this.loggers = new Vector();
        }
        this.loggers.addElement(logger);
    }

    @Override // org.apache.log4j.spi.ErrorHandler
    public void error(String str, Exception exc, int i5) {
        error(str, exc, i5, null);
    }

    @Override // org.apache.log4j.spi.ErrorHandler
    public void error(String str, Exception exc, int i5, LoggingEvent loggingEvent) {
        if (exc instanceof InterruptedIOException) {
            Thread.currentThread().interrupt();
        }
        LogLog.debug("FB: The following error reported: " + str, exc);
        LogLog.debug("FB: INITIATING FALLBACK PROCEDURE.");
        if (this.loggers != null) {
            for (int i6 = 0; i6 < this.loggers.size(); i6++) {
                Logger logger = (Logger) this.loggers.elementAt(i6);
                LogLog.debug("FB: Searching for [" + this.primary.getName() + "] in logger [" + logger.getName() + "].");
                LogLog.debug("FB: Replacing [" + this.primary.getName() + "] by [" + this.backup.getName() + "] in logger [" + logger.getName() + "].");
                logger.removeAppender(this.primary);
                StringBuilder sb = new StringBuilder("FB: Adding appender [");
                sb.append(this.backup.getName());
                sb.append("] to logger ");
                sb.append(logger.getName());
                LogLog.debug(sb.toString());
                logger.addAppender(this.backup);
            }
        }
    }
}
