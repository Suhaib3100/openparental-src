package org.apache.log4j;

import java.util.TimeZone;
import org.apache.log4j.helpers.DateLayout;
import org.apache.log4j.spi.LoggingEvent;

/* loaded from: classes3.dex */
public class TTCCLayout extends DateLayout {
    private boolean threadPrinting = true;
    private boolean categoryPrefixing = true;
    private boolean contextPrinting = true;
    protected final StringBuffer buf = new StringBuffer(256);

    public TTCCLayout() {
        setDateFormat("RELATIVE", (TimeZone) null);
    }

    @Override // org.apache.log4j.Layout
    public String format(LoggingEvent loggingEvent) {
        String ndc;
        this.buf.setLength(0);
        dateFormat(this.buf, loggingEvent);
        if (this.threadPrinting) {
            this.buf.append('[');
            this.buf.append(loggingEvent.getThreadName());
            this.buf.append("] ");
        }
        this.buf.append(loggingEvent.getLevel().toString());
        this.buf.append(' ');
        if (this.categoryPrefixing) {
            this.buf.append(loggingEvent.getLoggerName());
            this.buf.append(' ');
        }
        if (this.contextPrinting && (ndc = loggingEvent.getNDC()) != null) {
            this.buf.append(ndc);
            this.buf.append(' ');
        }
        this.buf.append("- ");
        this.buf.append(loggingEvent.getRenderedMessage());
        this.buf.append(Layout.LINE_SEP);
        return this.buf.toString();
    }

    public boolean getCategoryPrefixing() {
        return this.categoryPrefixing;
    }

    public boolean getContextPrinting() {
        return this.contextPrinting;
    }

    public boolean getThreadPrinting() {
        return this.threadPrinting;
    }

    @Override // org.apache.log4j.Layout
    public boolean ignoresThrowable() {
        return true;
    }

    public void setCategoryPrefixing(boolean z4) {
        this.categoryPrefixing = z4;
    }

    public void setContextPrinting(boolean z4) {
        this.contextPrinting = z4;
    }

    public void setThreadPrinting(boolean z4) {
        this.threadPrinting = z4;
    }

    public TTCCLayout(String str) {
        setDateFormat(str);
    }
}
