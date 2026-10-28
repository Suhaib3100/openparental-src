package org.apache.log4j.pattern;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import org.apache.log4j.helpers.LogLog;
import org.apache.log4j.spi.LoggingEvent;

/* loaded from: classes3.dex */
public final class DatePatternConverter extends LoggingEventPatternConverter {

    /* renamed from: df, reason: collision with root package name */
    private final CachedDateFormat f86722df;
    private static final String DATE_AND_TIME_FORMAT = "DATE";
    private static final String DATE_AND_TIME_PATTERN = "dd MMM yyyy HH:mm:ss,SSS";
    private static final String ISO8601_PATTERN = "yyyy-MM-dd HH:mm:ss,SSS";
    private static final String ISO8601_FORMAT = "ISO8601";
    private static final String ABSOLUTE_TIME_PATTERN = "HH:mm:ss,SSS";
    private static final String ABSOLUTE_FORMAT = "ABSOLUTE";

    private static class DefaultZoneDateFormat extends DateFormat {
        private static final long serialVersionUID = 1;
        private final DateFormat dateFormat;

        public DefaultZoneDateFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override // java.text.DateFormat
        public StringBuffer format(Date date, StringBuffer stringBuffer, FieldPosition fieldPosition) {
            this.dateFormat.setTimeZone(TimeZone.getDefault());
            return this.dateFormat.format(date, stringBuffer, fieldPosition);
        }

        @Override // java.text.DateFormat
        public Date parse(String str, ParsePosition parsePosition) {
            this.dateFormat.setTimeZone(TimeZone.getDefault());
            return this.dateFormat.parse(str, parsePosition);
        }
    }

    private DatePatternConverter(String[] strArr) {
        super("Date", "date");
        DateFormat simpleDateFormat;
        int i4;
        String str = (strArr == null || strArr.length == 0) ? null : strArr[0];
        String str2 = (str == null || str.equalsIgnoreCase("ISO8601")) ? "yyyy-MM-dd HH:mm:ss,SSS" : str.equalsIgnoreCase("ABSOLUTE") ? "HH:mm:ss,SSS" : str.equalsIgnoreCase("DATE") ? "dd MMM yyyy HH:mm:ss,SSS" : str;
        try {
            simpleDateFormat = new SimpleDateFormat(str2);
            i4 = CachedDateFormat.getMaximumCacheValidity(str2);
        } catch (IllegalArgumentException e4) {
            LogLog.warn("Could not instantiate SimpleDateFormat with pattern " + str, e4);
            simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss,SSS");
            i4 = 1000;
        }
        if (strArr == null || strArr.length <= 1) {
            simpleDateFormat = new DefaultZoneDateFormat(simpleDateFormat);
        } else {
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone(strArr[1]));
        }
        this.f86722df = new CachedDateFormat(simpleDateFormat, i4);
    }

    public static DatePatternConverter newInstance(String[] strArr) {
        return new DatePatternConverter(strArr);
    }

    @Override // org.apache.log4j.pattern.LoggingEventPatternConverter
    public void format(LoggingEvent loggingEvent, StringBuffer stringBuffer) {
        synchronized (this) {
            this.f86722df.format(loggingEvent.timeStamp, stringBuffer);
        }
    }

    @Override // org.apache.log4j.pattern.LoggingEventPatternConverter, org.apache.log4j.pattern.PatternConverter
    public void format(Object obj, StringBuffer stringBuffer) {
        if (obj instanceof Date) {
            format((Date) obj, stringBuffer);
        }
        super.format(obj, stringBuffer);
    }

    public void format(Date date, StringBuffer stringBuffer) {
        synchronized (this) {
            this.f86722df.format(date.getTime(), stringBuffer);
        }
    }
}
