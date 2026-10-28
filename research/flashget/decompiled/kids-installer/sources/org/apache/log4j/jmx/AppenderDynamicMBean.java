package org.apache.log4j.jmx;

import androidx.appcompat.view.g;
import androidx.concurrent.futures.a;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.InterruptedIOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Hashtable;
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
import javax.management.MBeanServer;
import javax.management.MalformedObjectNameException;
import javax.management.ObjectName;
import javax.management.ReflectionException;
import javax.management.RuntimeOperationsException;
import org.apache.log4j.Appender;
import org.apache.log4j.Layout;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.Priority;
import org.apache.log4j.helpers.OptionConverter;
import org.apache.log4j.spi.OptionHandler;

/* loaded from: classes6.dex */
public class AppenderDynamicMBean extends AbstractDynamicMBean {
    private static Logger cat = Logger.getLogger(AppenderDynamicMBean.class);
    private Appender appender;
    private MBeanConstructorInfo[] dConstructors = new MBeanConstructorInfo[1];
    private Vector dAttributes = new Vector();
    private String dClassName = getClass().getName();
    private Hashtable dynamicProps = new Hashtable(5);
    private MBeanOperationInfo[] dOperations = new MBeanOperationInfo[2];
    private String dDescription = "This MBean acts as a management facade for log4j appenders.";

    public AppenderDynamicMBean(Appender appender) throws IntrospectionException {
        this.appender = appender;
        buildDynamicMBeanInfo();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void buildDynamicMBeanInfo() throws IntrospectionException {
        int i5 = 0;
        this.dConstructors[0] = new MBeanConstructorInfo("AppenderDynamicMBean(): Constructs a AppenderDynamicMBean instance", getClass().getConstructors()[0]);
        PropertyDescriptor[] propertyDescriptors = Introspector.getBeanInfo(this.appender.getClass()).getPropertyDescriptors();
        int length = propertyDescriptors.length;
        int i6 = 0;
        while (true) {
            if (i6 >= length) {
                this.dOperations[i5] = new MBeanOperationInfo("activateOptions", "activateOptions(): add an appender", new MBeanParameterInfo[i5], "void", 1);
                MBeanParameterInfo[] mBeanParameterInfoArr = new MBeanParameterInfo[1];
                mBeanParameterInfoArr[i5] = new MBeanParameterInfo("layout class", "java.lang.String", "layout class");
                this.dOperations[1] = new MBeanOperationInfo("setLayout", "setLayout(): add a layout", mBeanParameterInfoArr, "void", 1);
                return;
            }
            String name = propertyDescriptors[i6].getName();
            Method readMethod = propertyDescriptors[i6].getReadMethod();
            Method writeMethod = propertyDescriptors[i6].getWriteMethod();
            if (readMethod != null) {
                Class<?> returnType = readMethod.getReturnType();
                if (isSupportedType(returnType)) {
                    this.dAttributes.add(new MBeanAttributeInfo(name, returnType.isAssignableFrom(Priority.class) ? "java.lang.String" : returnType.getName(), "Dynamic", true, writeMethod == null ? i5 : 1, false));
                    this.dynamicProps.put(name, new MethodUnion(readMethod, writeMethod));
                }
            }
            i6++;
            i5 = 0;
        }
    }

    private boolean isSupportedType(Class cls) {
        return cls.isPrimitive() || cls == String.class || cls.isAssignableFrom(Priority.class);
    }

    public Object getAttribute(String str) throws AttributeNotFoundException, MBeanException, ReflectionException {
        Method method;
        if (str == null) {
            throw new RuntimeOperationsException(new IllegalArgumentException("Attribute name cannot be null"), a.a(new StringBuilder("Cannot invoke a getter of "), this.dClassName, " with null attribute name"));
        }
        cat.debug("getAttribute called with [" + str + "].");
        if (str.startsWith("appender=" + this.appender.getName() + ",layout")) {
            try {
                return new ObjectName("log4j:".concat(str));
            } catch (RuntimeException e6) {
                cat.error("attributeName", e6);
            } catch (MalformedObjectNameException e7) {
                cat.error("attributeName", e7);
            }
        }
        MethodUnion methodUnion = (MethodUnion) this.dynamicProps.get(str);
        if (methodUnion == null || (method = methodUnion.readMethod) == null) {
            StringBuilder a6 = g.a("Cannot find ", str, " attribute in ");
            a6.append(this.dClassName);
            throw new AttributeNotFoundException(a6.toString());
        }
        try {
            return method.invoke(this.appender, null);
        } catch (IllegalAccessException unused) {
            return null;
        } catch (RuntimeException unused2) {
            return null;
        } catch (InvocationTargetException e8) {
            if ((e8.getTargetException() instanceof InterruptedException) || (e8.getTargetException() instanceof InterruptedIOException)) {
                Thread.currentThread().interrupt();
            }
            return null;
        }
    }

    @Override // org.apache.log4j.jmx.AbstractDynamicMBean
    protected Logger getLogger() {
        return cat;
    }

    public MBeanInfo getMBeanInfo() {
        cat.debug("getMBeanInfo called.");
        MBeanAttributeInfo[] mBeanAttributeInfoArr = new MBeanAttributeInfo[this.dAttributes.size()];
        this.dAttributes.toArray(mBeanAttributeInfoArr);
        return new MBeanInfo(this.dClassName, this.dDescription, mBeanAttributeInfoArr, this.dConstructors, this.dOperations, new MBeanNotificationInfo[0]);
    }

    public Object invoke(String str, Object[] objArr, String[] strArr) throws MBeanException, ReflectionException {
        if (str.equals("activateOptions")) {
            Appender appender = this.appender;
            if (appender instanceof OptionHandler) {
                ((OptionHandler) appender).activateOptions();
                return "Options activated.";
            }
        }
        if (str.equals("setLayout")) {
            Layout layout = (Layout) OptionConverter.instantiateByClassName((String) objArr[0], Layout.class, null);
            this.appender.setLayout(layout);
            registerLayoutMBean(layout);
        }
        return null;
    }

    @Override // org.apache.log4j.jmx.AbstractDynamicMBean
    public ObjectName preRegister(MBeanServer mBeanServer, ObjectName objectName) {
        cat.debug("preRegister called. Server=" + mBeanServer + ", name=" + objectName);
        this.server = mBeanServer;
        registerLayoutMBean(this.appender.getLayout());
        return objectName;
    }

    void registerLayoutMBean(Layout layout) {
        if (layout == null) {
            return;
        }
        String str = String.valueOf(AbstractDynamicMBean.getAppenderName(this.appender)) + ",layout=" + layout.getClass().getName();
        cat.debug("Adding LayoutMBean:" + str);
        try {
            LayoutDynamicMBean layoutDynamicMBean = new LayoutDynamicMBean(layout);
            ObjectName objectName = new ObjectName("log4j:appender=" + str);
            if (this.server.isRegistered(objectName)) {
                return;
            }
            registerMBean(layoutDynamicMBean, objectName);
            this.dAttributes.add(new MBeanAttributeInfo("appender=" + str, "javax.management.ObjectName", "The " + str + " layout.", true, true, false));
        } catch (JMException e6) {
            cat.error("Could not add DynamicLayoutMBean for [" + str + "].", e6);
        } catch (IntrospectionException e7) {
            cat.error("Could not add DynamicLayoutMBean for [" + str + "].", e7);
        } catch (RuntimeException e8) {
            cat.error("Could not add DynamicLayoutMBean for [" + str + "].", e8);
        }
    }

    public void setAttribute(Attribute attribute) throws AttributeNotFoundException, InvalidAttributeValueException, MBeanException, ReflectionException {
        Method method;
        if (attribute == null) {
            throw new RuntimeOperationsException(new IllegalArgumentException("Attribute cannot be null"), a.a(new StringBuilder("Cannot invoke a setter of "), this.dClassName, " with null attribute"));
        }
        String name = attribute.getName();
        Object value = attribute.getValue();
        if (name == null) {
            throw new RuntimeOperationsException(new IllegalArgumentException("Attribute name cannot be null"), a.a(new StringBuilder("Cannot invoke the setter of "), this.dClassName, " with null attribute name"));
        }
        MethodUnion methodUnion = (MethodUnion) this.dynamicProps.get(name);
        if (methodUnion == null || (method = methodUnion.writeMethod) == null) {
            if (name.endsWith(".layout")) {
                return;
            }
            StringBuilder a6 = g.a("Attribute ", name, " not found in ");
            a6.append(getClass().getName());
            throw new AttributeNotFoundException(a6.toString());
        }
        Object[] objArr = new Object[1];
        if (method.getParameterTypes()[0] == Priority.class) {
            value = OptionConverter.toLevel((String) value, (Level) getAttribute(name));
        }
        objArr[0] = value;
        try {
            methodUnion.writeMethod.invoke(this.appender, objArr);
        } catch (IllegalAccessException e6) {
            cat.error("FIXME", e6);
        } catch (RuntimeException e7) {
            cat.error("FIXME", e7);
        } catch (InvocationTargetException e8) {
            if ((e8.getTargetException() instanceof InterruptedException) || (e8.getTargetException() instanceof InterruptedIOException)) {
                Thread.currentThread().interrupt();
            }
            cat.error("FIXME", e8);
        }
    }
}
