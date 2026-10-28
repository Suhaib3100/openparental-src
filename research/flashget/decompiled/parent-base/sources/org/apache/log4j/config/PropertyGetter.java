package org.apache.log4j.config;

import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.InterruptedIOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.apache.log4j.Priority;
import org.apache.log4j.helpers.LogLog;

/* loaded from: classes3.dex */
public class PropertyGetter {
    protected static final Object[] NULL_ARG = new Object[0];
    protected Object obj;
    protected PropertyDescriptor[] props;

    public interface PropertyCallback {
        void foundProperty(Object obj, String str, String str2, Object obj2);
    }

    public PropertyGetter(Object obj) throws IntrospectionException {
        this.props = Introspector.getBeanInfo(obj.getClass()).getPropertyDescriptors();
        this.obj = obj;
    }

    public static void getProperties(Object obj, PropertyCallback propertyCallback, String str) {
        try {
            new PropertyGetter(obj).getProperties(propertyCallback, str);
        } catch (IntrospectionException e4) {
            LogLog.error("Failed to introspect object " + obj, e4);
        }
    }

    protected boolean isHandledType(Class cls) {
        return String.class.isAssignableFrom(cls) || Integer.TYPE.isAssignableFrom(cls) || Long.TYPE.isAssignableFrom(cls) || Boolean.TYPE.isAssignableFrom(cls) || Priority.class.isAssignableFrom(cls);
    }

    public void getProperties(PropertyCallback propertyCallback, String str) {
        int i4 = 0;
        while (true) {
            PropertyDescriptor[] propertyDescriptorArr = this.props;
            if (i4 >= propertyDescriptorArr.length) {
                return;
            }
            Method readMethod = propertyDescriptorArr[i4].getReadMethod();
            if (readMethod != null && isHandledType(readMethod.getReturnType())) {
                String name = this.props[i4].getName();
                try {
                    Object invoke = readMethod.invoke(this.obj, NULL_ARG);
                    if (invoke != null) {
                        propertyCallback.foundProperty(this.obj, str, name, invoke);
                    }
                } catch (IllegalAccessException unused) {
                    LogLog.warn("Failed to get value of property " + name);
                } catch (RuntimeException unused2) {
                    LogLog.warn("Failed to get value of property " + name);
                } catch (InvocationTargetException e4) {
                    if ((e4.getTargetException() instanceof InterruptedException) || (e4.getTargetException() instanceof InterruptedIOException)) {
                        Thread.currentThread().interrupt();
                    }
                    LogLog.warn("Failed to get value of property " + name);
                }
            }
            i4++;
        }
    }
}
