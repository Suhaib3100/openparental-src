package org.apache.log4j.pattern;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Date;
import java.util.TimeZone;

/* loaded from: classes3.dex */
public final class CachedDateFormat extends DateFormat {
    private static final int MAGIC1 = 654;
    private static final int MAGIC2 = 987;
    public static final int NO_MILLISECONDS = -2;
    public static final int UNRECOGNIZED_MILLISECONDS = -1;
    private static final long serialVersionUID = 1;
    private final int expiration;
    private final DateFormat formatter;
    private int millisecondStart;
    private long previousTime;
    private long slotBegin;
    private static final String MAGICSTRING1 = "654";
    private static final String MAGICSTRING2 = "987";
    private static final String DIGITS = "0123456789";
    private static final String ZERO_STRING = "000";
    private StringBuffer cache = new StringBuffer(50);
    private final Date tmpDate = new Date(0);

    public CachedDateFormat(DateFormat dateFormat, int i4) {
        if (dateFormat == null) {
            throw new IllegalArgumentException("dateFormat cannot be null");
        }
        if (i4 < 0) {
            throw new IllegalArgumentException("expiration must be non-negative");
        }
        this.formatter = dateFormat;
        this.expiration = i4;
        this.millisecondStart = 0;
        this.previousTime = Long.MIN_VALUE;
        this.slotBegin = Long.MIN_VALUE;
    }

    public static int findMillisecondStart(long j4, String str, DateFormat dateFormat) {
        String str2;
        long j5 = (j4 / 1000) * 1000;
        if (j5 > j4) {
            j5 -= 1000;
        }
        int i4 = (int) (j4 - j5);
        int i5 = MAGIC1;
        if (i4 == MAGIC1) {
            i5 = MAGIC2;
            str2 = "987";
        } else {
            str2 = "654";
        }
        String format = dateFormat.format(new Date(i5 + j5));
        if (format.length() != str.length()) {
            return -1;
        }
        for (int i6 = 0; i6 < str.length(); i6++) {
            if (str.charAt(i6) != format.charAt(i6)) {
                StringBuffer stringBuffer = new StringBuffer("ABC");
                millisecondFormat(i4, stringBuffer, 0);
                String format2 = dateFormat.format(new Date(j5));
                if (format2.length() == str.length() && str2.regionMatches(0, format, i6, str2.length()) && stringBuffer.toString().regionMatches(0, str, i6, str2.length()) && "000".regionMatches(0, format2, i6, 3)) {
                    return i6;
                }
                return -1;
            }
        }
        return -2;
    }

    public static int getMaximumCacheValidity(String str) {
        int indexOf = str.indexOf(83);
        return (indexOf < 0 || indexOf == str.lastIndexOf("SSS")) ? 1000 : 1;
    }

    private static void millisecondFormat(int i4, StringBuffer stringBuffer, int i5) {
        stringBuffer.setCharAt(i5, "0123456789".charAt(i4 / 100));
        stringBuffer.setCharAt(i5 + 1, "0123456789".charAt((i4 / 10) % 10));
        stringBuffer.setCharAt(i5 + 2, "0123456789".charAt(i4 % 10));
    }

    @Override // java.text.DateFormat
    public StringBuffer format(Date date, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        format(date.getTime(), stringBuffer);
        return stringBuffer;
    }

    @Override // java.text.DateFormat
    public NumberFormat getNumberFormat() {
        return this.formatter.getNumberFormat();
    }

    @Override // java.text.DateFormat
    public Date parse(String str, ParsePosition parsePosition) {
        return this.formatter.parse(str, parsePosition);
    }

    @Override // java.text.DateFormat
    public void setTimeZone(TimeZone timeZone) {
        this.formatter.setTimeZone(timeZone);
        this.previousTime = Long.MIN_VALUE;
        this.slotBegin = Long.MIN_VALUE;
    }

    public StringBuffer format(long j4, StringBuffer stringBuffer) {
        if (j4 == this.previousTime) {
            stringBuffer.append(this.cache);
            return stringBuffer;
        }
        int i4 = this.millisecondStart;
        if (i4 != -1) {
            long j5 = this.slotBegin;
            if (j4 < this.expiration + j5 && j4 >= j5 && j4 < j5 + 1000) {
                if (i4 >= 0) {
                    millisecondFormat((int) (j4 - j5), this.cache, i4);
                }
                this.previousTime = j4;
                stringBuffer.append(this.cache);
                return stringBuffer;
            }
        }
        this.cache.setLength(0);
        this.tmpDate.setTime(j4);
        this.cache.append(this.formatter.format(this.tmpDate));
        stringBuffer.append(this.cache);
        this.previousTime = j4;
        long j6 = (j4 / 1000) * 1000;
        this.slotBegin = j6;
        if (j6 > j4) {
            this.slotBegin = j6 - 1000;
        }
        if (this.millisecondStart >= 0) {
            this.millisecondStart = findMillisecondStart(j4, this.cache.toString(), this.formatter);
        }
        return stringBuffer;
    }
}
