package org.apache.log4j.jmx;

import java.io.InterruptedIOException;
import java.lang.reflect.InvocationTargetException;
import javax.management.JMException;
import javax.management.MBeanServer;
import javax.management.MBeanServerFactory;
import javax.management.ObjectName;
import org.apache.log4j.Logger;

/* loaded from: classes3.dex */
public class Agent {
    static Logger log = Logger.getLogger(Agent.class);

    private static Object createServer() {
        try {
            return Class.forName("com.sun.jdmk.comm.HtmlAdapterServer").newInstance();
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException(e4.toString());
        } catch (IllegalAccessException e5) {
            throw new RuntimeException(e5.toString());
        } catch (InstantiationException e6) {
            throw new RuntimeException(e6.toString());
        }
    }

    private static void startServer(Object obj) {
        try {
            obj.getClass().getMethod("start", null).invoke(obj, null);
        } catch (IllegalAccessException e4) {
            throw new RuntimeException(e4.toString());
        } catch (NoSuchMethodException e5) {
            throw new RuntimeException(e5.toString());
        } catch (InvocationTargetException e6) {
            Throwable targetException = e6.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            if (targetException == null) {
                throw new RuntimeException();
            }
            if ((targetException instanceof InterruptedException) || (targetException instanceof InterruptedIOException)) {
                Thread.currentThread().interrupt();
            }
            throw new RuntimeException(targetException.toString());
        }
    }

    public void start() {
        MBeanServer createMBeanServer = MBeanServerFactory.createMBeanServer();
        Object createServer = createServer();
        try {
            log.info("Registering HtmlAdaptorServer instance.");
            createMBeanServer.registerMBean(createServer, new ObjectName("Adaptor:name=html,port=8082"));
            log.info("Registering HierarchyDynamicMBean instance.");
            createMBeanServer.registerMBean(new HierarchyDynamicMBean(), new ObjectName("log4j:hiearchy=default"));
            startServer(createServer);
        } catch (RuntimeException e4) {
            log.error("Problem while registering MBeans instances.", e4);
        } catch (JMException e5) {
            log.error("Problem while registering MBeans instances.", e5);
        }
    }
}
