package org.apache.log4j.config;

import android.support.v4.media.d;
import androidx.appcompat.view.g;
import androidx.core.database.c;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.InterruptedIOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Properties;
import org.apache.log4j.Appender;
import org.apache.log4j.Level;
import org.apache.log4j.Priority;
import org.apache.log4j.helpers.LogLog;
import org.apache.log4j.helpers.OptionConverter;
import org.apache.log4j.spi.ErrorHandler;
import org.apache.log4j.spi.OptionHandler;

/* loaded from: classes3.dex */
public class PropertySetter {
    protected Object obj;
    protected PropertyDescriptor[] props;

    public PropertySetter(Object obj) {
        this.obj = obj;
    }

    public static void setProperties(Object obj, Properties properties, String str) {
        new PropertySetter(obj).setProperties(properties, str);
    }

    public void activate() {
        Object obj = this.obj;
        if (obj instanceof OptionHandler) {
            ((OptionHandler) obj).activateOptions();
        }
    }

    protected Object convertArg(String str, Class cls) {
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if (String.class.isAssignableFrom(cls)) {
            return str;
        }
        if (Integer.TYPE.isAssignableFrom(cls)) {
            return new Integer(trim);
        }
        if (Long.TYPE.isAssignableFrom(cls)) {
            return new Long(trim);
        }
        if (Boolean.TYPE.isAssignableFrom(cls)) {
            if ("true".equalsIgnoreCase(trim)) {
                return Boolean.TRUE;
            }
            if ("false".equalsIgnoreCase(trim)) {
                return Boolean.FALSE;
            }
        } else {
            if (Priority.class.isAssignableFrom(cls)) {
                return OptionConverter.toLevel(trim, Level.DEBUG);
            }
            if (ErrorHandler.class.isAssignableFrom(cls)) {
                return OptionConverter.instantiateByClassName(trim, ErrorHandler.class, null);
            }
        }
        return null;
    }

    protected PropertyDescriptor getPropertyDescriptor(String str) {
        if (this.props == null) {
            introspect();
        }
        int i4 = 0;
        while (true) {
            PropertyDescriptor[] propertyDescriptorArr = this.props;
            if (i4 >= propertyDescriptorArr.length) {
                return null;
            }
            if (str.equals(propertyDescriptorArr[i4].getName())) {
                return this.props[i4];
            }
            i4++;
        }
    }

    protected void introspect() {
        try {
            this.props = Introspector.getBeanInfo(this.obj.getClass()).getPropertyDescriptors();
        } catch (IntrospectionException e4) {
            LogLog.error("Failed to introspect " + this.obj + ": " + e4.getMessage());
            this.props = new PropertyDescriptor[0];
        }
    }

    public void setProperty(String str, String str2) {
        if (str2 == null) {
            return;
        }
        String decapitalize = Introspector.decapitalize(str);
        PropertyDescriptor propertyDescriptor = getPropertyDescriptor(decapitalize);
        if (propertyDescriptor == null) {
            StringBuilder a5 = g.a("No such property [", decapitalize, "] in ");
            a5.append(this.obj.getClass().getName());
            a5.append(".");
            LogLog.warn(a5.toString());
            return;
        }
        try {
            setProperty(propertyDescriptor, decapitalize, str2);
        } catch (PropertySetterException e4) {
            LogLog.warn(c.a("Failed to set property [", decapitalize, "] to value \"", str2, "\". "), e4.rootCause);
        }
    }

    public void setProperties(Properties properties, String str) {
        int length = str.length();
        Enumeration<?> propertyNames = properties.propertyNames();
        while (propertyNames.hasMoreElements()) {
            String str2 = (String) propertyNames.nextElement();
            if (str2.startsWith(str) && str2.indexOf(46, length + 1) <= 0) {
                String findAndSubst = OptionConverter.findAndSubst(str2, properties);
                String substring = str2.substring(length);
                if ((!"layout".equals(substring) && !"errorhandler".equals(substring)) || !(this.obj instanceof Appender)) {
                    PropertyDescriptor propertyDescriptor = getPropertyDescriptor(Introspector.decapitalize(substring));
                    if (propertyDescriptor == null || !OptionHandler.class.isAssignableFrom(propertyDescriptor.getPropertyType()) || propertyDescriptor.getWriteMethod() == null) {
                        setProperty(substring, findAndSubst);
                    } else {
                        OptionHandler optionHandler = (OptionHandler) OptionConverter.instantiateByKey(properties, androidx.constraintlayout.core.motion.key.c.a(str, substring), propertyDescriptor.getPropertyType(), null);
                        new PropertySetter(optionHandler).setProperties(properties, str + substring + ".");
                        try {
                            propertyDescriptor.getWriteMethod().invoke(this.obj, optionHandler);
                        } catch (IllegalAccessException e4) {
                            LogLog.warn(c.a("Failed to set property [", substring, "] to value \"", findAndSubst, "\". "), e4);
                        } catch (RuntimeException e5) {
                            LogLog.warn(c.a("Failed to set property [", substring, "] to value \"", findAndSubst, "\". "), e5);
                        } catch (InvocationTargetException e6) {
                            if ((e6.getTargetException() instanceof InterruptedException) || (e6.getTargetException() instanceof InterruptedIOException)) {
                                Thread.currentThread().interrupt();
                            }
                            LogLog.warn(c.a("Failed to set property [", substring, "] to value \"", findAndSubst, "\". "), e6);
                        }
                    }
                }
            }
        }
        activate();
    }

    public void setProperty(PropertyDescriptor propertyDescriptor, String str, String str2) throws PropertySetterException {
        Method writeMethod = propertyDescriptor.getWriteMethod();
        if (writeMethod != null) {
            Class<?>[] parameterTypes = writeMethod.getParameterTypes();
            if (parameterTypes.length == 1) {
                try {
                    Object convertArg = convertArg(str2, parameterTypes[0]);
                    if (convertArg != null) {
                        LogLog.debug("Setting property [" + str + "] to [" + convertArg + "].");
                        try {
                            writeMethod.invoke(this.obj, convertArg);
                            return;
                        } catch (IllegalAccessException e4) {
                            throw new PropertySetterException(e4);
                        } catch (RuntimeException e5) {
                            throw new PropertySetterException(e5);
                        } catch (InvocationTargetException e6) {
                            if ((e6.getTargetException() instanceof InterruptedException) || (e6.getTargetException() instanceof InterruptedIOException)) {
                                Thread.currentThread().interrupt();
                            }
                            throw new PropertySetterException(e6);
                        }
                    }
                    throw new PropertySetterException("Conversion to type [" + parameterTypes[0] + "] failed.");
                } catch (Throwable th) {
                    throw new PropertySetterException("Conversion to type [" + parameterTypes[0] + "] failed. Reason: " + th);
                }
            }
            throw new PropertySetterException("#params for setter != 1");
        }
        throw new PropertySetterException(d.a("No setter for property [", str, "]."));
    }
}
