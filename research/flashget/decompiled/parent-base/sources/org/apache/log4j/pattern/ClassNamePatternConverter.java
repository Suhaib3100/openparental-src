package org.apache.log4j.pattern;

import org.apache.log4j.spi.LocationInfo;
import org.apache.log4j.spi.LoggingEvent;

/* loaded from: classes3.dex */
public final class ClassNamePatternConverter extends NamePatternConverter {
    private ClassNamePatternConverter(String[] strArr) {
        super("Class Name", "class name", strArr);
    }

    public static ClassNamePatternConverter newInstance(String[] strArr) {
        return new ClassNamePatternConverter(strArr);
    }

    @Override // org.apache.log4j.pattern.LoggingEventPatternConverter
    public void format(LoggingEvent loggingEvent, StringBuffer stringBuffer) {
        int length = stringBuffer.length();
        LocationInfo locationInformation = loggingEvent.getLocationInformation();
        if (locationInformation == null) {
            stringBuffer.append("?");
        } else {
            stringBuffer.append(locationInformation.getClassName());
        }
        abbreviate(length, stringBuffer);
    }
}
