package org.apache.log4j.pattern;

import java.util.ArrayList;
import java.util.Iterator;
import org.apache.log4j.spi.LoggingEvent;

/* loaded from: classes3.dex */
public final class BridgePatternConverter extends org.apache.log4j.helpers.PatternConverter {
    private boolean handlesExceptions;
    private LoggingEventPatternConverter[] patternConverters;
    private FormattingInfo[] patternFields;

    public BridgePatternConverter(String str) {
        this.next = null;
        int i4 = 0;
        this.handlesExceptions = false;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        PatternParser.parse(str, arrayList, arrayList2, null, PatternParser.getPatternLayoutRules());
        this.patternConverters = new LoggingEventPatternConverter[arrayList.size()];
        this.patternFields = new FormattingInfo[arrayList.size()];
        Iterator it = arrayList.iterator();
        Iterator it2 = arrayList2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof LoggingEventPatternConverter) {
                LoggingEventPatternConverter loggingEventPatternConverter = (LoggingEventPatternConverter) next;
                this.patternConverters[i4] = loggingEventPatternConverter;
                this.handlesExceptions = loggingEventPatternConverter.handlesThrowable() | this.handlesExceptions;
            } else {
                this.patternConverters[i4] = new LiteralPatternConverter("");
            }
            if (it2.hasNext()) {
                this.patternFields[i4] = (FormattingInfo) it2.next();
            } else {
                this.patternFields[i4] = FormattingInfo.getDefault();
            }
            i4++;
        }
    }

    @Override // org.apache.log4j.helpers.PatternConverter
    protected String convert(LoggingEvent loggingEvent) {
        StringBuffer stringBuffer = new StringBuffer();
        format(stringBuffer, loggingEvent);
        return stringBuffer.toString();
    }

    @Override // org.apache.log4j.helpers.PatternConverter
    public void format(StringBuffer stringBuffer, LoggingEvent loggingEvent) {
        for (int i4 = 0; i4 < this.patternConverters.length; i4++) {
            int length = stringBuffer.length();
            this.patternConverters[i4].format(loggingEvent, stringBuffer);
            this.patternFields[i4].format(length, stringBuffer);
        }
    }

    public boolean ignoresThrowable() {
        return !this.handlesExceptions;
    }
}
