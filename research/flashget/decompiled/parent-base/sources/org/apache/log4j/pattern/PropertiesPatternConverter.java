package org.apache.log4j.pattern;

import android.support.v4.media.c;
import java.util.Set;
import org.apache.log4j.helpers.LogLog;
import org.apache.log4j.helpers.MDCKeySetExtractor;
import org.apache.log4j.spi.LoggingEvent;

/* loaded from: classes3.dex */
public final class PropertiesPatternConverter extends LoggingEventPatternConverter {
    private final String option;

    private PropertiesPatternConverter(String[] strArr) {
        super((strArr == null || strArr.length <= 0) ? "Properties" : c.a(new StringBuilder("Property{"), strArr[0], "}"), "property");
        if (strArr == null || strArr.length <= 0) {
            this.option = null;
        } else {
            this.option = strArr[0];
        }
    }

    public static PropertiesPatternConverter newInstance(String[] strArr) {
        return new PropertiesPatternConverter(strArr);
    }

    @Override // org.apache.log4j.pattern.LoggingEventPatternConverter
    public void format(LoggingEvent loggingEvent, StringBuffer stringBuffer) {
        String str = this.option;
        if (str != null) {
            Object mdc = loggingEvent.getMDC(str);
            if (mdc != null) {
                stringBuffer.append(mdc);
                return;
            }
            return;
        }
        stringBuffer.append("{");
        try {
            Set propertyKeySet = MDCKeySetExtractor.INSTANCE.getPropertyKeySet(loggingEvent);
            if (propertyKeySet != null) {
                for (Object obj : propertyKeySet) {
                    Object mdc2 = loggingEvent.getMDC(obj.toString());
                    stringBuffer.append("{");
                    stringBuffer.append(obj);
                    stringBuffer.append(",");
                    stringBuffer.append(mdc2);
                    stringBuffer.append("}");
                }
            }
        } catch (Exception e4) {
            LogLog.error("Unexpected exception while extracting MDC keys", e4);
        }
        stringBuffer.append("}");
    }
}
