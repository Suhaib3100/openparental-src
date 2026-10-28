package org.apache.log4j.pattern;

import org.apache.log4j.spi.LoggingEvent;

/* loaded from: classes6.dex */
public class RelativeTimePatternConverter extends LoggingEventPatternConverter {
    private CachedTimestamp lastTimestamp;

    /* loaded from: classes5.dex */
    private static final class CachedTimestamp {
        private final String formatted;
        private final long timestamp;

        public CachedTimestamp(long j5, String str) {
            this.timestamp = j5;
            this.formatted = str;
        }

        public boolean format(long j5, StringBuffer stringBuffer) {
            if (j5 != this.timestamp) {
                return false;
            }
            stringBuffer.append(this.formatted);
            return true;
        }
    }

    public RelativeTimePatternConverter() {
        super("Time", "time");
        this.lastTimestamp = new CachedTimestamp(0L, "");
    }

    public static RelativeTimePatternConverter newInstance(String[] strArr) {
        return new RelativeTimePatternConverter();
    }

    @Override // org.apache.log4j.pattern.LoggingEventPatternConverter
    public void format(LoggingEvent loggingEvent, StringBuffer stringBuffer) {
        long j5 = loggingEvent.timeStamp;
        if (this.lastTimestamp.format(j5, stringBuffer)) {
            return;
        }
        String l5 = Long.toString(j5 - LoggingEvent.getStartTime());
        stringBuffer.append(l5);
        this.lastTimestamp = new CachedTimestamp(j5, l5);
    }
}
