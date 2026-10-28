package org.apache.log4j.rewrite;

import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.util.HashMap;
import org.apache.log4j.Logger;
import org.apache.log4j.helpers.LogLog;
import org.apache.log4j.spi.LoggingEvent;

/* loaded from: classes6.dex */
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
                    for (int i5 = 0; i5 < propertyDescriptors.length; i5++) {
                        try {
                            Object invoke = propertyDescriptors[i5].getReadMethod().invoke(message, null);
                            if ("message".equalsIgnoreCase(propertyDescriptors[i5].getName())) {
                                obj = invoke;
                            } else {
                                hashMap.put(propertyDescriptors[i5].getName(), invoke);
                            }
                        } catch (Exception e6) {
                            LogLog.warn("Unable to evaluate property " + propertyDescriptors[i5].getName(), e6);
                        }
                    }
                    return new LoggingEvent(loggingEvent.getFQNOfLoggerClass(), loggingEvent.getLogger() != null ? loggingEvent.getLogger() : Logger.getLogger(loggingEvent.getLoggerName()), loggingEvent.getTimeStamp(), loggingEvent.getLevel(), obj, loggingEvent.getThreadName(), loggingEvent.getThrowableInformation(), loggingEvent.getNDC(), loggingEvent.getLocationInformation(), hashMap);
                }
            } catch (Exception e7) {
                LogLog.warn("Unable to get property descriptors", e7);
            }
        }
        return loggingEvent;
    }
}
