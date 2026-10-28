package org.apache.log4j.jmx;

import java.io.InterruptedIOException;
import java.lang.reflect.InvocationTargetException;
import javax.management.JMException;
import javax.management.MBeanServer;
import javax.management.MBeanServerFactory;
import javax.management.ObjectName;
import org.apache.log4j.Logger;

/* loaded from: classes5.dex */
public class Agent {
    static Logger log = Logger.getLogger(Agent.class);

    private static Object createServer() {
        try {
            return Class.forName("com.sun.jdmk.comm.HtmlAdapterServer").newInstance();
        } catch (ClassNotFoundException e6) {
            throw new RuntimeException(e6.toString());
        } catch (IllegalAccessException e7) {
            throw new RuntimeException(e7.toString());
        } catch (InstantiationException e8) {
            throw new RuntimeException(e8.toString());
        }
    }

    private static void startServer(Object obj) {
        try {
            obj.getClass().getMethod("start", new Class[0]).invoke(obj, new Object[0]);
        } catch (IllegalAccessException e6) {
            throw new RuntimeException(e6.toString());
        } catch (NoSuchMethodException e7) {
            throw new RuntimeException(e7.toString());
        } catch (InvocationTargetException e8) {
            Throwable targetException = e8.getTargetException();
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
        } catch (RuntimeException e6) {
            log.error("Problem while registering MBeans instances.", e6);
        } catch (JMException e7) {
            log.error("Problem while registering MBeans instances.", e7);
        }
    }
}
