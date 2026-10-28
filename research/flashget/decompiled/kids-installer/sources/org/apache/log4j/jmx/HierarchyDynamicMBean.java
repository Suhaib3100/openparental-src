package org.apache.log4j.jmx;

import androidx.appcompat.view.g;
import androidx.concurrent.futures.a;
import java.util.Vector;
import javax.management.Attribute;
import javax.management.AttributeNotFoundException;
import javax.management.InvalidAttributeValueException;
import javax.management.JMException;
import javax.management.ListenerNotFoundException;
import javax.management.MBeanAttributeInfo;
import javax.management.MBeanConstructorInfo;
import javax.management.MBeanException;
import javax.management.MBeanInfo;
import javax.management.MBeanNotificationInfo;
import javax.management.MBeanOperationInfo;
import javax.management.MBeanParameterInfo;
import javax.management.Notification;
import javax.management.NotificationBroadcaster;
import javax.management.NotificationBroadcasterSupport;
import javax.management.NotificationFilter;
import javax.management.NotificationFilterSupport;
import javax.management.NotificationListener;
import javax.management.ObjectName;
import javax.management.ReflectionException;
import javax.management.RuntimeOperationsException;
import org.apache.log4j.Appender;
import org.apache.log4j.Category;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.helpers.OptionConverter;
import org.apache.log4j.spi.HierarchyEventListener;
import org.apache.log4j.spi.LoggerRepository;

/* loaded from: classes6.dex */
public class HierarchyDynamicMBean extends AbstractDynamicMBean implements HierarchyEventListener, NotificationBroadcaster {
    static final String ADD_APPENDER = "addAppender.";
    static final String THRESHOLD = "threshold";
    private static Logger log = Logger.getLogger(HierarchyDynamicMBean.class);
    private MBeanConstructorInfo[] dConstructors = new MBeanConstructorInfo[1];
    private MBeanOperationInfo[] dOperations = new MBeanOperationInfo[1];
    private Vector vAttributes = new Vector();
    private String dClassName = getClass().getName();
    private String dDescription = "This MBean acts as a management facade for org.apache.log4j.Hierarchy.";
    private NotificationBroadcasterSupport nbs = new NotificationBroadcasterSupport();
    private LoggerRepository hierarchy = LogManager.getLoggerRepository();

    public HierarchyDynamicMBean() {
        buildDynamicMBeanInfo();
    }

    private void buildDynamicMBeanInfo() {
        this.dConstructors[0] = new MBeanConstructorInfo("HierarchyDynamicMBean(): Constructs a HierarchyDynamicMBean instance", getClass().getConstructors()[0]);
        this.vAttributes.add(new MBeanAttributeInfo("threshold", "java.lang.String", "The \"threshold\" state of the hiearchy.", true, true, false));
        this.dOperations[0] = new MBeanOperationInfo("addLoggerMBean", "addLoggerMBean(): add a loggerMBean", new MBeanParameterInfo[]{new MBeanParameterInfo("name", "java.lang.String", "Create a logger MBean")}, "javax.management.ObjectName", 1);
    }

    @Override // org.apache.log4j.spi.HierarchyEventListener
    public void addAppenderEvent(Category category, Appender appender) {
        log.debug("addAppenderEvent called: logger=" + category.getName() + ", appender=" + appender.getName());
        StringBuilder sb = new StringBuilder("addAppender.");
        sb.append(category.getName());
        Notification notification = new Notification(sb.toString(), this, 0L);
        notification.setUserData(appender);
        log.debug("sending notification.");
        this.nbs.sendNotification(notification);
    }

    public ObjectName addLoggerMBean(String str) {
        Logger exists = LogManager.exists(str);
        if (exists != null) {
            return addLoggerMBean(exists);
        }
        return null;
    }

    public void addNotificationListener(NotificationListener notificationListener, NotificationFilter notificationFilter, Object obj) {
        this.nbs.addNotificationListener(notificationListener, notificationFilter, obj);
    }

    public Object getAttribute(String str) throws AttributeNotFoundException, MBeanException, ReflectionException {
        String str2;
        if (str == null) {
            throw new RuntimeOperationsException(new IllegalArgumentException("Attribute name cannot be null"), a.a(new StringBuilder("Cannot invoke a getter of "), this.dClassName, " with null attribute name"));
        }
        log.debug("Called getAttribute with [" + str + "].");
        if (str.equals("threshold")) {
            return this.hierarchy.getThreshold();
        }
        if (str.startsWith("logger")) {
            int indexOf = str.indexOf("%3D");
            if (indexOf > 0) {
                str2 = String.valueOf(str.substring(0, indexOf)) + '=' + str.substring(indexOf + 3);
            } else {
                str2 = str;
            }
            try {
                return new ObjectName("log4j:" + str2);
            } catch (JMException unused) {
                log.error("Could not create ObjectName" + str2);
            } catch (RuntimeException unused2) {
                log.error("Could not create ObjectName" + str2);
            }
        }
        StringBuilder a6 = g.a("Cannot find ", str, " attribute in ");
        a6.append(this.dClassName);
        throw new AttributeNotFoundException(a6.toString());
    }

    @Override // org.apache.log4j.jmx.AbstractDynamicMBean
    protected Logger getLogger() {
        return log;
    }

    public MBeanInfo getMBeanInfo() {
        MBeanAttributeInfo[] mBeanAttributeInfoArr = new MBeanAttributeInfo[this.vAttributes.size()];
        this.vAttributes.toArray(mBeanAttributeInfoArr);
        return new MBeanInfo(this.dClassName, this.dDescription, mBeanAttributeInfoArr, this.dConstructors, this.dOperations, new MBeanNotificationInfo[0]);
    }

    public MBeanNotificationInfo[] getNotificationInfo() {
        return this.nbs.getNotificationInfo();
    }

    public Object invoke(String str, Object[] objArr, String[] strArr) throws MBeanException, ReflectionException {
        if (str == null) {
            throw new RuntimeOperationsException(new IllegalArgumentException("Operation name cannot be null"), "Cannot invoke a null operation in " + this.dClassName);
        }
        if (str.equals("addLoggerMBean")) {
            return addLoggerMBean((String) objArr[0]);
        }
        NoSuchMethodException noSuchMethodException = new NoSuchMethodException(str);
        StringBuilder a6 = g.a("Cannot find the operation ", str, " in ");
        a6.append(this.dClassName);
        throw new ReflectionException(noSuchMethodException, a6.toString());
    }

    @Override // org.apache.log4j.jmx.AbstractDynamicMBean
    public void postRegister(Boolean bool) {
        log.debug("postRegister is called.");
        this.hierarchy.addHierarchyEventListener(this);
        addLoggerMBean(this.hierarchy.getRootLogger());
    }

    @Override // org.apache.log4j.spi.HierarchyEventListener
    public void removeAppenderEvent(Category category, Appender appender) {
        log.debug("removeAppenderCalled: logger=" + category.getName() + ", appender=" + appender.getName());
    }

    public void removeNotificationListener(NotificationListener notificationListener) throws ListenerNotFoundException {
        this.nbs.removeNotificationListener(notificationListener);
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
        if (name.equals("threshold")) {
            this.hierarchy.setThreshold(OptionConverter.toLevel((String) value, this.hierarchy.getThreshold()));
        }
    }

    ObjectName addLoggerMBean(Logger logger) {
        LoggerDynamicMBean loggerDynamicMBean;
        ObjectName objectName;
        String name = logger.getName();
        ObjectName objectName2 = null;
        try {
            loggerDynamicMBean = new LoggerDynamicMBean(logger);
            objectName = new ObjectName("log4j", "logger", name);
        } catch (RuntimeException e6) {
            e = e6;
        } catch (JMException e7) {
            e = e7;
        }
        try {
            if (this.server.isRegistered(objectName)) {
                return objectName;
            }
            registerMBean(loggerDynamicMBean, objectName);
            NotificationFilterSupport notificationFilterSupport = new NotificationFilterSupport();
            notificationFilterSupport.enableType("addAppender." + logger.getName());
            log.debug("---Adding logger [" + name + "] as listener.");
            this.nbs.addNotificationListener(loggerDynamicMBean, notificationFilterSupport, (Object) null);
            this.vAttributes.add(new MBeanAttributeInfo("logger=" + name, "javax.management.ObjectName", "The " + name + " logger.", true, true, false));
            return objectName;
        } catch (JMException e8) {
            e = e8;
            objectName2 = objectName;
            log.error("Could not add loggerMBean for [" + name + "].", e);
            return objectName2;
        } catch (RuntimeException e9) {
            e = e9;
            objectName2 = objectName;
            log.error("Could not add loggerMBean for [" + name + "].", e);
            return objectName2;
        }
    }
}
