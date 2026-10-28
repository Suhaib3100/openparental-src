package org.apache.log4j.rewrite;

import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.util.HashMap;
import org.apache.log4j.Logger;
import org.apache.log4j.helpers.LogLog;
import org.apache.log4j.spi.LoggingEvent;

/* loaded from: classes3.dex */
public class ReflectionRewritePolicy implements RewritePolicy {
    @Override // org.apache.log4j.rewrite.RewritePolicy
    public LoggingEvent rewrite(LoggingEvent loggingEvent) {
        Object message = loggingEvent.getMessage();
        if (!(message instanceof String)) {
            HashMap hashMap = new HashMap(loggingEvent.getProperties());
            try {
                PropertyDescriptor[] propertyDescriptors = Introspector.getBeanInfo(message.getClass(), Object.class).getPropertyDescriptors();
                if (propertyDescriptors.length > 0) {
                    Object obj = message;
                    for (int i4 = 0; i4 < propertyDescriptors.length; i4++) {
                        try {
                            Object invoke = propertyDescriptors[i4].getReadMethod().invoke(message, null);
                            if ("message".equalsIgnoreCase(propertyDescriptors[i4].getName())) {
                                obj = invoke;
                            } else {
                                hashMap.put(propertyDescriptors[i4].getName(), invoke);
                            }
                        } catch (Exception e4) {
                            LogLog.warn("Unable to evaluate property " + propertyDescriptors[i4].getName(), e4);
                        }
                    }
                    return new LoggingEvent(loggingEvent.getFQNOfLoggerClass(), loggingEvent.getLogger() != null ? loggingEvent.getLogger() : Logger.getLogger(loggingEvent.getLoggerName()), loggingEvent.getTimeStamp(), loggingEvent.getLevel(), obj, loggingEvent.getThreadName(), loggingEvent.getThrowableInformation(), loggingEvent.getNDC(), loggingEvent.getLocationInformation(), hashMap);
                }
            } catch (Exception e5) {
                LogLog.warn("Unable to get property descriptors", e5);
            }
        }
        return loggingEvent;
    }
}
