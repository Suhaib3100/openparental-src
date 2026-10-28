package de.mindpipe.android.logging.log4j;

import android.util.Log;
import com.flashget.kidsdownloader.ProtectedSandApp;
import org.apache.log4j.AppenderSkeleton;
import org.apache.log4j.Layout;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.spi.LoggingEvent;

/* loaded from: classes6.dex */
public class LogCatAppender extends AppenderSkeleton {
    protected Layout tagLayout;

    public LogCatAppender(Layout layout, Layout layout2) {
        this.tagLayout = layout2;
        setLayout(layout);
    }

    @Override // org.apache.log4j.AppenderSkeleton
    protected void append(LoggingEvent loggingEvent) {
        int i5 = loggingEvent.getLevel().toInt();
        if (i5 == 5000) {
            if (loggingEvent.getThrowableInformation() == null) {
                getTagLayout().format(loggingEvent);
                getLayout().format(loggingEvent);
                return;
            } else {
                getTagLayout().format(loggingEvent);
                getLayout().format(loggingEvent);
                loggingEvent.getThrowableInformation().getThrowable();
                return;
            }
        }
        if (i5 == 10000) {
            if (loggingEvent.getThrowableInformation() == null) {
                getTagLayout().format(loggingEvent);
                getLayout().format(loggingEvent);
                return;
            } else {
                getTagLayout().format(loggingEvent);
                getLayout().format(loggingEvent);
                loggingEvent.getThrowableInformation().getThrowable();
                return;
            }
        }
        if (i5 == 20000) {
            if (loggingEvent.getThrowableInformation() == null) {
                getTagLayout().format(loggingEvent);
                getLayout().format(loggingEvent);
                return;
            } else {
                getTagLayout().format(loggingEvent);
                getLayout().format(loggingEvent);
                loggingEvent.getThrowableInformation().getThrowable();
                return;
            }
        }
        if (i5 == 30000) {
            if (loggingEvent.getThrowableInformation() == null) {
                getTagLayout().format(loggingEvent);
                getLayout().format(loggingEvent);
                return;
            } else {
                getTagLayout().format(loggingEvent);
                getLayout().format(loggingEvent);
                loggingEvent.getThrowableInformation().getThrowable();
                return;
            }
        }
        if (i5 != 40000) {
            if (i5 != 50000) {
                return;
            }
            if (loggingEvent.getThrowableInformation() != null) {
                Log.wtf(getTagLayout().format(loggingEvent), getLayout().format(loggingEvent), loggingEvent.getThrowableInformation().getThrowable());
                return;
            } else {
                Log.wtf(getTagLayout().format(loggingEvent), getLayout().format(loggingEvent));
                return;
            }
        }
        if (loggingEvent.getThrowableInformation() == null) {
            getTagLayout().format(loggingEvent);
            getLayout().format(loggingEvent);
        } else {
            getTagLayout().format(loggingEvent);
            getLayout().format(loggingEvent);
            loggingEvent.getThrowableInformation().getThrowable();
        }
    }

    @Override // org.apache.log4j.Appender
    public void close() {
    }

    public Layout getTagLayout() {
        return this.tagLayout;
    }

    @Override // org.apache.log4j.Appender
    public boolean requiresLayout() {
        return true;
    }

    public void setTagLayout(Layout layout) {
        this.tagLayout = layout;
    }

    public LogCatAppender(Layout layout) {
        this(layout, new PatternLayout(ProtectedSandApp.s("殃")));
    }

    public LogCatAppender() {
        this(new PatternLayout(ProtectedSandApp.s("殂")));
    }
}
