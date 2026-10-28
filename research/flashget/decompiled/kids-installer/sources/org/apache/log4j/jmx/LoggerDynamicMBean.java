package org.apache.log4j.jmx;

import androidx.appcompat.view.g;
import androidx.concurrent.futures.a;
import java.beans.IntrospectionException;
import java.util.Enumeration;
import java.util.Vector;
import javax.management.Attribute;
import javax.management.AttributeNotFoundException;
import javax.management.InvalidAttributeValueException;
import javax.management.JMException;
import javax.management.MBeanAttributeInfo;
import javax.management.MBeanConstructorInfo;
import javax.management.MBeanException;
import javax.management.MBeanInfo;
import javax.management.MBeanNotificationInfo;
import javax.management.MBeanOperationInfo;
import javax.management.MBeanParameterInfo;
import javax.management.MalformedObjectNameException;
import javax.management.Notification;
import javax.management.NotificationListener;
import javax.management.ObjectName;
import javax.management.ReflectionException;
import javax.management.RuntimeOperationsException;
import org.apache.log4j.Appender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.helpers.OptionConverter;

/* loaded from: classes6.dex */
public class LoggerDynamicMBean extends AbstractDynamicMBean implements NotificationListener {
    private static Logger cat = Logger.getLogger(LoggerDynamicMBean.class);
    private Logger logger;
    private MBeanConstructorInfo[] dConstructors = new MBeanConstructorInfo[1];
    private MBeanOperationInfo[] dOperations = new MBeanOperationInfo[1];
    private Vector dAttributes = new Vector();
    private String dClassName = getClass().getName();
    private String dDescription = "This MBean acts as a management facade for a org.apache.log4j.Logger instance.";

    public LoggerDynamicMBean(Logger logger) {
        this.logger = logger;
        buildDynamicMBeanInfo();
    }

    private void buildDynamicMBeanInfo() {
        this.dConstructors[0] = new MBeanConstructorInfo("HierarchyDynamicMBean(): Constructs a HierarchyDynamicMBean instance", getClass().getConstructors()[0]);
        this.dAttributes.add(new MBeanAttributeInfo("name", "java.lang.String", "The name of this Logger.", true, false, false));
        this.dAttributes.add(new MBeanAttributeInfo("priority", "java.lang.String", "The priority of this logger.", true, true, false));
        this.dOperations[0] = new MBeanOperationInfo("addAppender", "addAppender(): add an appender", new MBeanParameterInfo[]{new MBeanParameterInfo("class name", "java.lang.String", "add an appender to this logger"), new MBeanParameterInfo("appender name", "java.lang.String", "name of the appender")}, "void", 1);
    }

    void addAppender(String str, String str2) {
        cat.debug("addAppender called with " + str + ", " + str2);
        Appender appender = (Appender) OptionConverter.instantiateByClassName(str, Appender.class, null);
        appender.setName(str2);
        this.logger.addAppender(appender);
    }

    void appenderMBeanRegistration() {
        Enumeration allAppenders = this.logger.getAllAppenders();
        while (allAppenders.hasMoreElements()) {
            registerAppenderMBean((Appender) allAppenders.nextElement());
        }
    }

    public Object getAttribute(String str) throws AttributeNotFoundException, MBeanException, ReflectionException {
        if (str == null) {
            throw new RuntimeOperationsException(new IllegalArgumentException("Attribute name cannot be null"), a.a(new StringBuilder("Cannot invoke a getter of "), this.dClassName, " with null attribute name"));
        }
        if (str.equals("name")) {
            return this.logger.getName();
        }
        if (str.equals("priority")) {
            Level level = this.logger.getLevel();
            if (level == null) {
                return null;
            }
            return level.toString();
        }
        if (str.startsWith("appender=")) {
            try {
                return new ObjectName("log4j:".concat(str));
            } catch (RuntimeException unused) {
                cat.error("Could not create ObjectName".concat(str));
            } catch (MalformedObjectNameException unused2) {
                cat.error("Could not create ObjectName".concat(str));
            }
        }
        StringBuilder a6 = g.a("Cannot find ", str, " attribute in ");
        a6.append(this.dClassName);
        throw new AttributeNotFoundException(a6.toString());
    }

    @Override // org.apache.log4j.jmx.AbstractDynamicMBean
    protected Logger getLogger() {
        return this.logger;
    }

    public MBeanInfo getMBeanInfo() {
        MBeanAttributeInfo[] mBeanAttributeInfoArr = new MBeanAttributeInfo[this.dAttributes.size()];
        this.dAttributes.toArray(mBeanAttributeInfoArr);
        return new MBeanInfo(this.dClassName, this.dDescription, mBeanAttributeInfoArr, this.dConstructors, this.dOperations, new MBeanNotificationInfo[0]);
    }

    public void handleNotification(Notification notification, Object obj) {
        cat.debug("Received notification: " + notification.getType());
        registerAppenderMBean((Appender) notification.getUserData());
    }

    public Object invoke(String str, Object[] objArr, String[] strArr) throws MBeanException, ReflectionException {
        if (!str.equals("addAppender")) {
            return null;
        }
        addAppender((String) objArr[0], (String) objArr[1]);
        return "Hello world.";
    }

    @Override // org.apache.log4j.jmx.AbstractDynamicMBean
    public void postRegister(Boolean bool) {
        appenderMBeanRegistration();
    }

    void registerAppenderMBean(Appender appender) {
        String appenderName = AbstractDynamicMBean.getAppenderName(appender);
        cat.debug("Adding AppenderMBean for appender named " + appenderName);
        try {
            AppenderDynamicMBean appenderDynamicMBean = new AppenderDynamicMBean(appender);
            ObjectName objectName = new ObjectName("log4j", "appender", appenderName);
            if (this.server.isRegistered(objectName)) {
                return;
            }
            registerMBean(appenderDynamicMBean, objectName);
            this.dAttributes.add(new MBeanAttributeInfo("appender=" + appenderName, "javax.management.ObjectName", "The " + appenderName + " appender.", true, true, false));
        } catch (IntrospectionException e6) {
            cat.error("Could not add appenderMBean for [" + appenderName + "].", e6);
        } catch (RuntimeException e7) {
            cat.error("Could not add appenderMBean for [" + appenderName + "].", e7);
        } catch (JMException e8) {
            cat.error("Could not add appenderMBean for [" + appenderName + "].", e8);
        }
    }

    public void setAttribute(Attribute attribute) throws AttributeNotFoundException, InvalidAttributeValueException, MBeanException, ReflectionException {
        if (attribute == null) {
            throw new RuntimeOperationsException(new IllegalArgumentException("Attribute cannot be null"), a.a(new StringBuilder("Cannot invoke a setter of "), this.dClassName, " with null attribute"));
        }
        String name = attribute.getName();
        Object value = attribute.getValue();
        if (name == null) {
            throw new RuntimeOperationsException(new IllegalArgumentException("Attribute name cannot be null"), a.a(new StringBuilder("Cannot invoke the setter of "), this.dClassName, " with null attribute name"));
        }
        if (!name.equals("priority")) {
            StringBuilder a6 = g.a("Attribute ", name, " not found in ");
            a6.append(getClass().getName());
            throw new AttributeNotFoundException(a6.toString());
        }
        if (value instanceof String) {
            String str = (String) value;
            this.logger.setLevel(str.equalsIgnoreCase("NULL") ? null : OptionConverter.toLevel(str, this.logger.getLevel()));
        }
    }
}
