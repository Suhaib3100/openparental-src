package org.apache.log4j.spi;

/* loaded from: classes6.dex */
public abstract class Filter implements OptionHandler {
    public static final int ACCEPT = 1;
    public static final int DENY = -1;
    public static final int NEUTRAL = 0;
    public Filter next;

    @Override // org.apache.log4j.spi.OptionHandler
    public void activateOptions() {
    }

    public abstract int decide(LoggingEvent loggingEvent);

    public Filter getNext() {
        return this.next;
    }

    public void setNext(Filter filter) {
        this.next = filter;
    }
}
