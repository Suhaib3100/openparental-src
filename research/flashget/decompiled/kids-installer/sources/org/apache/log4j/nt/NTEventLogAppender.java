package org.apache.log4j.nt;

import org.apache.log4j.AppenderSkeleton;
import org.apache.log4j.Layout;
import org.apache.log4j.TTCCLayout;
import org.apache.log4j.helpers.LogLog;
import org.apache.log4j.spi.LoggingEvent;

/* loaded from: classes6.dex */
public class NTEventLogAppender extends AppenderSkeleton {
    private int _handle;
    private String server;
    private String source;

    static {
        String[] strArr;
        boolean z5 = false;
        try {
            strArr = new String[]{System.getProperty("os.arch")};
        } catch (SecurityException unused) {
            strArr = new String[]{"amd64", "ia64", "x86"};
        }
        int i5 = 0;
        while (true) {
            if (i5 >= strArr.length) {
                break;
            }
            try {
                System.loadLibrary("NTEventLogAppender." + strArr[i5]);
                z5 = true;
                break;
            } catch (UnsatisfiedLinkError unused2) {
                i5++;
            }
        }
        if (z5) {
            return;
        }
        System.loadLibrary("NTEventLogAppender");
    }

    public NTEventLogAppender() {
        this(null, null, null);
    }

    private native void deregisterEventSource(int i5);

    private native int registerEventSource(String str, String str2);

    private native void reportEvent(int i5, String str, int i6);

    @Override // org.apache.log4j.AppenderSkeleton, org.apache.log4j.spi.OptionHandler
    public void activateOptions() {
        String str = this.source;
        if (str != null) {
            try {
                this._handle = registerEventSource(this.server, str);
            } catch (Exception e6) {
                LogLog.error("Could not register event source.", e6);
                this._handle = 0;
            }
        }
    }

    @Override // org.apache.log4j.AppenderSkeleton
    public void append(LoggingEvent loggingEvent) {
        String[] throwableStrRep;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.layout.format(loggingEvent));
        if (this.layout.ignoresThrowable() && (throwableStrRep = loggingEvent.getThrowableStrRep()) != null) {
            for (String str : throwableStrRep) {
                stringBuffer.append(str);
            }
        }
        reportEvent(this._handle, stringBuffer.toString(), loggingEvent.getLevel().toInt());
    }

    @Override // org.apache.log4j.Appender
    public void close() {
    }

    @Override // org.apache.log4j.AppenderSkeleton
    public void finalize() {
        deregisterEventSource(this._handle);
        this._handle = 0;
    }

    public String getSource() {
        return this.source;
    }

    @Override // org.apache.log4j.Appender
    public boolean requiresLayout() {
        return true;
    }

    public void setSource(String str) {
        this.source = str.trim();
    }

    public NTEventLogAppender(String str) {
        this(null, str, null);
    }

    public NTEventLogAppender(String str, String str2) {
        this(str, str2, null);
    }

    public NTEventLogAppender(Layout layout) {
        this(null, null, layout);
    }

    public NTEventLogAppender(String str, Layout layout) {
        this(null, str, layout);
    }

    public NTEventLogAppender(String str, String str2, Layout layout) {
        this._handle = 0;
        this.source = null;
        this.server = null;
        str2 = str2 == null ? "Log4j" : str2;
        if (layout == null) {
            this.layout = new TTCCLayout();
        } else {
            this.layout = layout;
        }
        try {
            this._handle = registerEventSource(str, str2);
        } catch (Exception e6) {
            e6.printStackTrace();
            this._handle = 0;
        }
    }
}
