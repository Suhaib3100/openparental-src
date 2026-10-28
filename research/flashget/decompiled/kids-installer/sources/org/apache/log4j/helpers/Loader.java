package org.apache.log4j.helpers;

import java.io.InterruptedIOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;

/* loaded from: classes5.dex */
public class Loader {
    static final String TSTR = "Caught Exception while in Loader.getResource. This may be innocuous.";
    private static boolean ignoreTCL = false;
    private static boolean java1 = true;

    static {
        int indexOf;
        String systemProperty = OptionConverter.getSystemProperty("java.version", null);
        if (systemProperty != null && (indexOf = systemProperty.indexOf(46)) != -1 && systemProperty.charAt(indexOf + 1) != '1') {
            java1 = false;
        }
        String systemProperty2 = OptionConverter.getSystemProperty("log4j.ignoreTCL", null);
        if (systemProperty2 != null) {
            ignoreTCL = OptionConverter.toBoolean(systemProperty2, true);
        }
    }

    public static URL getResource(String str, Class cls) {
        return getResource(str);
    }

    private static ClassLoader getTCL() throws IllegalAccessException, InvocationTargetException {
        try {
            return (ClassLoader) Thread.class.getMethod("getContextClassLoader", null).invoke(Thread.currentThread(), null);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static boolean isJava1() {
        return java1;
    }

    public static Class loadClass(String str) throws ClassNotFoundException {
        if (java1 || ignoreTCL) {
            return Class.forName(str);
        }
        try {
            return getTCL().loadClass(str);
        } catch (InvocationTargetException e6) {
            if ((e6.getTargetException() instanceof InterruptedException) || (e6.getTargetException() instanceof InterruptedIOException)) {
                Thread.currentThread().interrupt();
            }
            return Class.forName(str);
        } catch (Throwable unused) {
            return Class.forName(str);
        }
    }

    public static URL getResource(String str) {
        ClassLoader tcl;
        try {
            if (!java1 && !ignoreTCL && (tcl = getTCL()) != null) {
                LogLog.debug("Trying to find [" + str + "] using context classloader " + tcl + ".");
                URL resource = tcl.getResource(str);
                if (resource != null) {
                    return resource;
                }
            }
            ClassLoader classLoader = Loader.class.getClassLoader();
            if (classLoader != null) {
                LogLog.debug("Trying to find [" + str + "] using " + classLoader + " class loader.");
                URL resource2 = classLoader.getResource(str);
                if (resource2 != null) {
                    return resource2;
                }
            }
        } catch (IllegalAccessException e6) {
            LogLog.warn("Caught Exception while in Loader.getResource. This may be innocuous.", e6);
        } catch (InvocationTargetException e7) {
            if ((e7.getTargetException() instanceof InterruptedException) || (e7.getTargetException() instanceof InterruptedIOException)) {
                Thread.currentThread().interrupt();
            }
            LogLog.warn("Caught Exception while in Loader.getResource. This may be innocuous.", e7);
        } catch (Throwable th) {
            LogLog.warn("Caught Exception while in Loader.getResource. This may be innocuous.", th);
        }
        LogLog.debug("Trying to find [" + str + "] using ClassLoader.getSystemResource().");
        return ClassLoader.getSystemResource(str);
    }
}
