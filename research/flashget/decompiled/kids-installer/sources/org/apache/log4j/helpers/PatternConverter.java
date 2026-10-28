package org.apache.log4j.helpers;

import org.apache.log4j.spi.LoggingEvent;

/* loaded from: classes5.dex */
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
            int i5 = this.min;
            if (i5 > 0) {
                spacePad(stringBuffer, i5);
                return;
            }
            return;
        }
        int length = convert.length();
        int i6 = this.max;
        if (length > i6) {
            stringBuffer.append(convert.substring(length - i6));
            return;
        }
        int i7 = this.min;
        if (length >= i7) {
            stringBuffer.append(convert);
        } else if (this.leftAlign) {
            stringBuffer.append(convert);
            spacePad(stringBuffer, this.min - length);
        } else {
            spacePad(stringBuffer, i7 - length);
            stringBuffer.append(convert);
        }
    }

    public void spacePad(StringBuffer stringBuffer, int i5) {
        while (i5 >= 32) {
            stringBuffer.append(SPACES[5]);
            i5 -= 32;
        }
        for (int i6 = 4; i6 >= 0; i6--) {
            if (((1 << i6) & i5) != 0) {
                stringBuffer.append(SPACES[i6]);
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
