package org.apache.log4j.pattern;

import org.apache.log4j.spi.LoggingEvent;

/* loaded from: classes3.dex */
public class RelativeTimePatternConverter extends LoggingEventPatternConverter {
    private CachedTimestamp lastTimestamp;

    private static final class CachedTimestamp {
        private final String formatted;
        private final long timestamp;

        public CachedTimestamp(long j4, String str) {
            this.timestamp = j4;
            this.formatted = str;
        }

        public boolean format(long j4, StringBuffer stringBuffer) {
            if (j4 != this.timestamp) {
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
        long j4 = loggingEvent.timeStamp;
        if (this.lastTimestamp.format(j4, stringBuffer)) {
            return;
        }
        String l4 = Long.toString(j4 - LoggingEvent.getStartTime());
        stringBuffer.append(l4);
        this.lastTimestamp = new CachedTimestamp(j4, l4);
    }
}
