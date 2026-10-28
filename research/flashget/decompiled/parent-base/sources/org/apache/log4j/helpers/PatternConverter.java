package org.apache.log4j.helpers;

import org.apache.log4j.spi.LoggingEvent;

/* loaded from: classes3.dex */
public abstract class PatternConverter {
    static String[] SPACES = {" ", "  ", "    ", "        ", "                ", "                                "};
    boolean leftAlign;
    int max;
    int min;
    public PatternConverter next;

    protected PatternConverter() {
        this.min = -1;
        this.max = Integer.MAX_VALUE;
        this.leftAlign = false;
    }

    protected abstract String convert(LoggingEvent loggingEvent);

    public void format(StringBuffer stringBuffer, LoggingEvent loggingEvent) {
        String convert = convert(loggingEvent);
        if (convert == null) {
            int i4 = this.min;
            if (i4 > 0) {
                spacePad(stringBuffer, i4);
                return;
            }
            return;
        }
        int length = convert.length();
        int i5 = this.max;
        if (length > i5) {
            stringBuffer.append(convert.substring(length - i5));
            return;
        }
        int i6 = this.min;
        if (length >= i6) {
            stringBuffer.append(convert);
        } else if (this.leftAlign) {
            stringBuffer.append(convert);
            spacePad(stringBuffer, this.min - length);
        } else {
            spacePad(stringBuffer, i6 - length);
            stringBuffer.append(convert);
        }
    }

    public void spacePad(StringBuffer stringBuffer, int i4) {
        while (i4 >= 32) {
            stringBuffer.append(SPACES[5]);
            i4 -= 32;
        }
        for (int i5 = 4; i5 >= 0; i5--) {
            if (((1 << i5) & i4) != 0) {
                stringBuffer.append(SPACES[i5]);
            }
        }
    }

    protected PatternConverter(FormattingInfo formattingInfo) {
        this.min = -1;
        this.max = Integer.MAX_VALUE;
        this.leftAlign = false;
        this.min = formattingInfo.min;
        this.max = formattingInfo.max;
        this.leftAlign = formattingInfo.leftAlign;
    }
}
