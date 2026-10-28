package org.apache.log4j.jmx;

import android.support.v4.media.c;
import androidx.appcompat.view.g;
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
import javax.management.MBeanAttributeInfo;
import javax.management.MBeanConstructorInfo;
import javax.management.MBeanException;
import javax.management.MBeanInfo;
import javax.management.MBeanNotificationInfo;
import javax.management.MBeanOperationInfo;
import javax.management.MBeanParameterInfo;
import javax.management.ReflectionException;
import javax.management.RuntimeOperationsException;
import org.apache.log4j.Layout;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.Priority;
import org.apache.log4j.helpers.OptionConverter;

/* loaded from: classes3.dex */
public class LayoutDynamicMBean extends AbstractDynamicMBean {
    private static Logger cat = Logger.getLogger(LayoutDynamicMBean.class);
    private Layout layout;
    private MBeanConstructorInfo[] dConstructors = new MBeanConstructorInfo[1];
    private Vector dAttributes = new Vector();
    private String dClassName = getClass().getName();
    private Hashtable dynamicProps = new Hashtable(5);
    private MBeanOperationInfo[] dOperations = new MBeanOperationInfo[1];
    private String dDescription = "This MBean acts as a management facade for log4j layouts.";

    public LayoutDynamicMBean(Layout layout) throws IntrospectionException {
        this.layout = layout;
        buildDynamicMBeanInfo();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void buildDynamicMBeanInfo() throws IntrospectionException {
        int i4 = 0;
        this.dConstructors[0] = new MBeanConstructorInfo("LayoutDynamicMBean(): Constructs a LayoutDynamicMBean instance", getClass().getConstructors()[0]);
        PropertyDescriptor[] propertyDescriptors = Introspector.getBeanInfo(this.layout.getClass()).getPropertyDescriptors();
        int length = propertyDescriptors.length;
        int i5 = 0;
        while (i5 < length) {
            String name = propertyDescriptors[i5].getName();
            Method readMethod = propertyDescriptors[i5].getReadMethod();
            Method writeMethod = propertyDescriptors[i5].getWriteMethod();
            if (readMethod != null) {
                Class<?> returnType = readMethod.getReturnType();
                if (isSupportedType(returnType)) {
                    this.dAttributes.add(new MBeanAttributeInfo(name, returnType.isAssignableFrom(Level.class) ? "java.lang.String" : returnType.getName(), "Dynamic", true, writeMethod != null ? 1 : i4, false));
                    this.dynamicProps.put(name, new MethodUnion(readMethod, writeMethod));
                }
            }
            i5++;
            i4 = 0;
        }
        this.dOperations[i4] = new MBeanOperationInfo("activateOptions", "activateOptions(): add an layout", new MBeanParameterInfo[i4], "void", 1);
    }

    private boolean isSupportedType(Class cls) {
        return cls.isPrimitive() || cls == String.class || cls.isAssignableFrom(Level.class);
    }

    public Object getAttribute(String str) throws AttributeNotFoundException, MBeanException, ReflectionException {
        Method method;
        if (str == null) {
            throw new RuntimeOperationsException(new IllegalArgumentException("Attribute name cannot be null"), c.a(new StringBuilder("Cannot invoke a getter of "), this.dClassName, " with null attribute name"));
        }
        MethodUnion methodUnion = (MethodUnion) this.dynamicProps.get(str);
        cat.debug("----name=" + str + ", mu=" + methodUnion);
        if (methodUnion == null || (method = methodUnion.readMethod) == null) {
            StringBuilder a5 = g.a("Cannot find ", str, " attribute in ");
            a5.append(this.dClassName);
            throw new AttributeNotFoundException(a5.toString());
        }
        try {
            return method.invoke(this.layout, null);
        } catch (IllegalAccessException | RuntimeException unused) {
            return null;
        } catch (InvocationTargetException e4) {
            if ((e4.getTargetException() instanceof InterruptedException) || (e4.getTargetException() instanceof InterruptedIOException)) {
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
        if (!str.equals("activateOptions") || this.layout == null) {
            return null;
        }
        this.layout.activateOptions();
        return "Options activated.";
    }

    public void setAttribute(Attribute attribute) throws AttributeNotFoundException, InvalidAttributeValueException, MBeanException, ReflectionException {
        Method method;
        if (attribute == null) {
            throw new RuntimeOperationsException(new IllegalArgumentException("Attribute cannot be null"), c.a(new StringBuilder("Cannot invoke a setter of "), this.dClassName, " with null attribute"));
        }
        String name = attribute.getName();
        Object value = attribute.getValue();
        if (name == null) {
            throw new RuntimeOperationsException(new IllegalArgumentException("Attribute name cannot be null"), c.a(new StringBuilder("Cannot invoke the setter of "), this.dClassName, " with null attribute name"));
        }
        MethodUnion methodUnion = (MethodUnion) this.dynamicProps.get(name);
        if (methodUnion == null || (method = methodUnion.writeMethod) == null) {
            StringBuilder a5 = g.a("Attribute ", name, " not found in ");
            a5.append(getClass().getName());
            throw new AttributeNotFoundException(a5.toString());
        }
        if (method.getParameterTypes()[0] == Priority.class) {
            value = OptionConverter.toLevel((String) value, (Level) getAttribute(name));
        }
        try {
            methodUnion.writeMethod.invoke(this.layout, value);
        } catch (IllegalAccessException e4) {
            cat.error("FIXME", e4);
        } catch (RuntimeException e5) {
            cat.error("FIXME", e5);
        } catch (InvocationTargetException e6) {
            if ((e6.getTargetException() instanceof InterruptedException) || (e6.getTargetException() instanceof InterruptedIOException)) {
                Thread.currentThread().interrupt();
            }
            cat.error("FIXME", e6);
        }
    }
}
