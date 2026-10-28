package org.apache.log4j.jmx;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
import javax.management.Attribute;
import javax.management.AttributeList;
import javax.management.DynamicMBean;
import javax.management.InstanceAlreadyExistsException;
import javax.management.InstanceNotFoundException;
import javax.management.JMException;
import javax.management.MBeanRegistration;
import javax.management.MBeanRegistrationException;
import javax.management.MBeanServer;
import javax.management.NotCompliantMBeanException;
import javax.management.ObjectName;
import javax.management.RuntimeOperationsException;
import org.apache.log4j.Appender;
import org.apache.log4j.Logger;

/* loaded from: classes3.dex */
public abstract class AbstractDynamicMBean implements DynamicMBean, MBeanRegistration {
    String dClassName;
    private final Vector mbeanList = new Vector();
    MBeanServer server;

    protected static String getAppenderName(Appender appender) {
        String name = appender.getName();
        return (name == null || name.trim().length() == 0) ? appender.toString() : name;
    }

    public AttributeList getAttributes(String[] strArr) {
        if (strArr == null) {
            throw new RuntimeOperationsException(new IllegalArgumentException("attributeNames[] cannot be null"), "Cannot invoke a getter of " + this.dClassName);
        }
        AttributeList attributeList = new AttributeList();
        if (strArr.length == 0) {
            return attributeList;
        }
        for (int i4 = 0; i4 < strArr.length; i4++) {
            try {
                attributeList.add(new Attribute(strArr[i4], getAttribute(strArr[i4])));
            } catch (JMException e4) {
                e4.printStackTrace();
            } catch (RuntimeException e5) {
                e5.printStackTrace();
            }
        }
        return attributeList;
    }

    protected abstract Logger getLogger();

    public void postDeregister() {
        getLogger().debug("postDeregister is called.");
    }

    public void postRegister(Boolean bool) {
    }

    public void preDeregister() {
        getLogger().debug("preDeregister called.");
        Enumeration elements = this.mbeanList.elements();
        while (elements.hasMoreElements()) {
            ObjectName objectName = (ObjectName) elements.nextElement();
            try {
                this.server.unregisterMBean(objectName);
            } catch (MBeanRegistrationException unused) {
                getLogger().warn("Failed unregistering " + objectName.getCanonicalName());
            } catch (InstanceNotFoundException unused2) {
                getLogger().warn("Missing MBean " + objectName.getCanonicalName());
            }
        }
    }

    public ObjectName preRegister(MBeanServer mBeanServer, ObjectName objectName) {
        getLogger().debug("preRegister called. Server=" + mBeanServer + ", name=" + objectName);
        this.server = mBeanServer;
        return objectName;
    }

    protected void registerMBean(Object obj, ObjectName objectName) throws InstanceAlreadyExistsException, MBeanRegistrationException, NotCompliantMBeanException {
        this.server.registerMBean(obj, objectName);
        this.mbeanList.add(objectName);
    }

    public AttributeList setAttributes(AttributeList attributeList) {
        if (attributeList == null) {
            throw new RuntimeOperationsException(new IllegalArgumentException("AttributeList attributes cannot be null"), "Cannot invoke a setter of " + this.dClassName);
        }
        AttributeList attributeList2 = new AttributeList();
        if (attributeList.isEmpty()) {
            return attributeList2;
        }
        Iterator it = attributeList.iterator();
        while (it.hasNext()) {
            Attribute attribute = (Attribute) it.next();
            try {
                setAttribute(attribute);
                String name = attribute.getName();
                attributeList2.add(new Attribute(name, getAttribute(name)));
            } catch (JMException e4) {
                e4.printStackTrace();
            } catch (RuntimeException e5) {
                e5.printStackTrace();
            }
        }
        return attributeList2;
    }
}
