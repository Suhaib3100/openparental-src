package org.apache.log4j.net;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import org.apache.log4j.helpers.LogLog;

/* loaded from: classes3.dex */
public class ZeroConfSupport {
    private static Object jmDNS = initializeJMDNS();
    private static Class jmDNSClass;
    private static Class serviceInfoClass;
    Object serviceInfo;

    public ZeroConfSupport(String str, int i4, String str2, Map map) {
        try {
            jmDNSClass.getMethod("create", null);
            LogLog.debug("using JmDNS version 3 to construct serviceInfo instance");
            this.serviceInfo = buildServiceInfoVersion3(str, i4, str2, map);
        } catch (NoSuchMethodException unused) {
            LogLog.debug("using JmDNS version 1.0 to construct serviceInfo instance");
            this.serviceInfo = buildServiceInfoVersion1(str, i4, str2, map);
        }
    }

    private Object buildServiceInfoVersion1(String str, int i4, String str2, Map map) {
        Hashtable hashtable = new Hashtable(map);
        try {
            Class cls = Integer.TYPE;
            Object newInstance = serviceInfoClass.getConstructor(String.class, String.class, cls, cls, cls, Hashtable.class).newInstance(str, str2, new Integer(i4), new Integer(0), new Integer(0), hashtable);
            LogLog.debug("created serviceinfo: " + newInstance);
            return newInstance;
        } catch (IllegalAccessException e4) {
            LogLog.warn("Unable to construct ServiceInfo instance", e4);
            return null;
        } catch (InstantiationException e5) {
            LogLog.warn("Unable to construct ServiceInfo instance", e5);
            return null;
        } catch (NoSuchMethodException e6) {
            LogLog.warn("Unable to get ServiceInfo constructor", e6);
            return null;
        } catch (InvocationTargetException e7) {
            LogLog.warn("Unable to construct ServiceInfo instance", e7);
            return null;
        }
    }

    private Object buildServiceInfoVersion3(String str, int i4, String str2, Map map) {
        try {
            Class cls = Integer.TYPE;
            Object invoke = serviceInfoClass.getMethod("create", String.class, String.class, cls, cls, cls, Map.class).invoke(null, str, str2, new Integer(i4), new Integer(0), new Integer(0), map);
            LogLog.debug("created serviceinfo: " + invoke);
            return invoke;
        } catch (IllegalAccessException e4) {
            LogLog.warn("Unable to invoke create method", e4);
            return null;
        } catch (NoSuchMethodException e5) {
            LogLog.warn("Unable to find create method", e5);
            return null;
        } catch (InvocationTargetException e6) {
            LogLog.warn("Unable to invoke create method", e6);
            return null;
        }
    }

    private static Object createJmDNSVersion1() {
        try {
            return jmDNSClass.newInstance();
        } catch (IllegalAccessException e4) {
            LogLog.warn("Unable to instantiate JMDNS", e4);
            return null;
        } catch (InstantiationException e5) {
            LogLog.warn("Unable to instantiate JMDNS", e5);
            return null;
        }
    }

    private static Object createJmDNSVersion3() {
        try {
            return jmDNSClass.getMethod("create", null).invoke(null, null);
        } catch (IllegalAccessException e4) {
            LogLog.warn("Unable to instantiate jmdns class", e4);
            return null;
        } catch (NoSuchMethodException e5) {
            LogLog.warn("Unable to access constructor", e5);
            return null;
        } catch (InvocationTargetException e6) {
            LogLog.warn("Unable to call constructor", e6);
            return null;
        }
    }

    public static Object getJMDNSInstance() {
        return jmDNS;
    }

    private static Object initializeJMDNS() {
        try {
            jmDNSClass = Class.forName("javax.jmdns.JmDNS");
            serviceInfoClass = Class.forName("javax.jmdns.ServiceInfo");
        } catch (ClassNotFoundException e4) {
            LogLog.warn("JmDNS or serviceInfo class not found", e4);
        }
        try {
            jmDNSClass.getMethod("create", null);
            return createJmDNSVersion3();
        } catch (NoSuchMethodException unused) {
            return createJmDNSVersion1();
        }
    }

    public void advertise() {
        try {
            jmDNSClass.getMethod("registerService", serviceInfoClass).invoke(jmDNS, this.serviceInfo);
            LogLog.debug("registered serviceInfo: " + this.serviceInfo);
        } catch (IllegalAccessException e4) {
            LogLog.warn("Unable to invoke registerService method", e4);
        } catch (NoSuchMethodException e5) {
            LogLog.warn("No registerService method", e5);
        } catch (InvocationTargetException e6) {
            LogLog.warn("Unable to invoke registerService method", e6);
        }
    }

    public void unadvertise() {
        try {
            jmDNSClass.getMethod("unregisterService", serviceInfoClass).invoke(jmDNS, this.serviceInfo);
            LogLog.debug("unregistered serviceInfo: " + this.serviceInfo);
        } catch (IllegalAccessException e4) {
            LogLog.warn("Unable to invoke unregisterService method", e4);
        } catch (NoSuchMethodException e5) {
            LogLog.warn("No unregisterService method", e5);
        } catch (InvocationTargetException e6) {
            LogLog.warn("Unable to invoke unregisterService method", e6);
        }
    }

    public ZeroConfSupport(String str, int i4, String str2) {
        this(str, i4, str2, new HashMap());
    }
}
