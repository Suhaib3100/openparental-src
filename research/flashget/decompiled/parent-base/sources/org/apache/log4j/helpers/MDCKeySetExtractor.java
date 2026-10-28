package org.apache.log4j.helpers;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Method;
import java.util.Set;
import org.apache.log4j.pattern.LogEvent;
import org.apache.log4j.spi.LoggingEvent;

/* loaded from: classes3.dex */
public final class MDCKeySetExtractor {
    public static final MDCKeySetExtractor INSTANCE = new MDCKeySetExtractor();
    private final Method getKeySetMethod;

    private MDCKeySetExtractor() {
        Method method = null;
        try {
            method = LoggingEvent.class.getMethod("getPropertyKeySet", null);
        } catch (Exception unused) {
        }
        this.getKeySetMethod = method;
    }

    public Set getPropertyKeySet(LoggingEvent loggingEvent) throws Exception {
        Method method = this.getKeySetMethod;
        if (method != null) {
            return (Set) method.invoke(loggingEvent, null);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(loggingEvent);
        objectOutputStream.close();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        String name = LogEvent.class.getName();
        if (byteArray[6] != 0 && byteArray[7] != name.length()) {
            return null;
        }
        for (int i4 = 0; i4 < name.length(); i4++) {
            byteArray[i4 + 8] = (byte) name.charAt(i4);
        }
        ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(byteArray));
        Object readObject = objectInputStream.readObject();
        Set propertyKeySet = readObject instanceof LogEvent ? ((LogEvent) readObject).getPropertyKeySet() : null;
        objectInputStream.close();
        return propertyKeySet;
    }
}
