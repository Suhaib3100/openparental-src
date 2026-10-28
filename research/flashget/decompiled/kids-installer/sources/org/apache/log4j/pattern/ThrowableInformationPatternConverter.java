package org.apache.log4j.pattern;

import org.apache.log4j.spi.LoggingEvent;
import org.apache.log4j.spi.ThrowableInformation;

/* loaded from: classes6.dex */
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
        int i5 = this.maxLines;
        if (i5 < 0) {
            length += i5;
        } else if (length > i5) {
            length = i5;
        }
        for (int i6 = 0; i6 < length; i6++) {
            stringBuffer.append(throwableStrRep[i6]);
            stringBuffer.append("\n");
        }
    }

    @Override // org.apache.log4j.pattern.LoggingEventPatternConverter
    public boolean handlesThrowable() {
        return true;
    }
}
