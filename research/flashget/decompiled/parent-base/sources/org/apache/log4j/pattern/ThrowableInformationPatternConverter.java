package org.apache.log4j.pattern;

import org.apache.log4j.spi.LoggingEvent;
import org.apache.log4j.spi.ThrowableInformation;

/* loaded from: classes3.dex */
public class ThrowableInformationPatternConverter extends LoggingEventPatternConverter {
    private int maxLines;

    private ThrowableInformationPatternConverter(String[] strArr) {
        super("Throwable", "throwable");
        this.maxLines = Integer.MAX_VALUE;
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        if ("none".equals(strArr[0])) {
            this.maxLines = 0;
        } else if ("short".equals(strArr[0])) {
            this.maxLines = 1;
        } else {
            try {
                this.maxLines = Integer.parseInt(strArr[0]);
            } catch (NumberFormatException unused) {
            }
        }
    }

    public static ThrowableInformationPatternConverter newInstance(String[] strArr) {
        return new ThrowableInformationPatternConverter(strArr);
    }

    @Override // org.apache.log4j.pattern.LoggingEventPatternConverter
    public void format(LoggingEvent loggingEvent, StringBuffer stringBuffer) {
        ThrowableInformation throwableInformation;
        if (this.maxLines == 0 || (throwableInformation = loggingEvent.getThrowableInformation()) == null) {
            return;
        }
        String[] throwableStrRep = throwableInformation.getThrowableStrRep();
        int length = throwableStrRep.length;
        int i4 = this.maxLines;
        if (i4 < 0) {
            length += i4;
        } else if (length > i4) {
            length = i4;
        }
        for (int i5 = 0; i5 < length; i5++) {
            stringBuffer.append(throwableStrRep[i5]);
            stringBuffer.append("\n");
        }
    }

    @Override // org.apache.log4j.pattern.LoggingEventPatternConverter
    public boolean handlesThrowable() {
        return true;
    }
}
