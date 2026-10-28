package org.apache.log4j;

import org.apache.log4j.spi.LoggingEvent;

/* loaded from: classes3.dex */
public class SimpleLayout extends Layout {
    StringBuffer sbuf = new StringBuffer(128);

    @Override // org.apache.log4j.spi.OptionHandler
    public void activateOptions() {
    }

    @Override // org.apache.log4j.Layout
    public String format(LoggingEvent loggingEvent) {
        this.sbuf.setLength(0);
        this.sbuf.append(loggingEvent.getLevel().toString());
        this.sbuf.append(" - ");
        this.sbuf.append(loggingEvent.getRenderedMessage());
        this.sbuf.append(Layout.LINE_SEP);
        return this.sbuf.toString();
    }

    @Override // org.apache.log4j.Layout
    public boolean ignoresThrowable() {
        return true;
    }
}
