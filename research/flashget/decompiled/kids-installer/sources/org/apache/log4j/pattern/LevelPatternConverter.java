package org.apache.log4j.pattern;

import org.apache.log4j.spi.LoggingEvent;

/* loaded from: classes6.dex */
public final class LevelPatternConverter extends LoggingEventPatternConverter {
    private static final LevelPatternConverter INSTANCE = new LevelPatternConverter();
    private static final int TRACE_INT = 5000;

    private LevelPatternConverter() {
        super("Level", "level");
    }

    public static LevelPatternConverter newInstance(String[] strArr) {
        return INSTANCE;
    }

    @Override // org.apache.log4j.pattern.LoggingEventPatternConverter
    public void format(LoggingEvent loggingEvent, StringBuffer stringBuffer) {
        stringBuffer.append(loggingEvent.getLevel().toString());
    }

    @Override // org.apache.log4j.pattern.PatternConverter
    public String getStyleClass(Object obj) {
        if (!(obj instanceof LoggingEvent)) {
            return "level";
        }
        LoggingEvent loggingEvent = (LoggingEvent) obj;
        int i5 = loggingEvent.getLevel().toInt();
        if (i5 == 5000) {
            return "level trace";
        }
        if (i5 == 10000) {
            return "level debug";
        }
        if (i5 == 20000) {
            return "level info";
        }
        if (i5 == 30000) {
            return "level warn";
        }
        if (i5 == 40000) {
            return "level error";
        }
        if (i5 == 50000) {
            return "level fatal";
        }
        return "level " + loggingEvent.getLevel().toString();
    }
}
