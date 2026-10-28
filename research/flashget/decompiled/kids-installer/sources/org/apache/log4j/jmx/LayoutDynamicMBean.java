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
import org.apache.log4j.spi.OptionHandler;

/* loaded from: classes6.dex */
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
        int i5 = 0;
        this.dConstructors[0] = new MBeanConstructorInfo("LayoutDynamicMBean(): Constructs a LayoutDynamicMBean instance", getClass().getConstructors()[0]);
        PropertyDescriptor[] propertyDescriptors = Introspector.getBeanInfo(this.layout.getClass()).getPropertyDescriptors();
        int length = propertyDescriptors.length;
        int i6 = 0;
        while (i6 < length) {
            String name = propertyDescriptors[i6].getName();
            Method readMethod = propertyDescriptors[i6].getReadMethod();
            Method writeMethod = propertyDescriptors[i6].getWriteMethod();
            if (readMethod != null) {
                Class<?> returnType = readMethod.getReturnType();
                if (isSupportedType(returnType)) {
                    this.dAttributes.add(new MBeanAttributeInfo(name, returnType.isAssignableFrom(Level.class) ? "java.lang.String" : returnType.getName(), "Dynamic", true, writeMethod != null ? 1 : i5, false));
                    this.dynamicProps.put(name, new MethodUnion(readMethod, writeMethod));
                }
            }
            i6++;
            i5 = 0;
        }
        this.dOperations[i5] = new MBeanOperationInfo("activateOptions", "activateOptions(): add an layout", new MBeanParameterInfo[i5], "void", 1);
    }

    private boolean isSupportedType(Class cls) {
        return cls.isPrimitive() || cls == String.class || cls.isAssignableFrom(Level.class);
    }

    public Object getAttribute(String str) throws AttributeNotFoundException, MBeanException, ReflectionException {
        Method method;
        if (str == null) {
            throw new RuntimeOperationsException(new IllegalArgumentException("Attribute name cannot be null"), a.a(new StringBuilder("Cannot invoke a getter of "), this.dClassName, " with null attribute name"));
        }
        MethodUnion methodUnion = (MethodUnion) this.dynamicProps.get(str);
        cat.debug("----name=" + str + ", mu=" + methodUnion);
        if (methodUnion == null || (method = methodUnion.readMethod) == null) {
            StringBuilder a6 = g.a("Cannot find ", str, " attribute in ");
            a6.append(this.dClassName);
            throw new AttributeNotFoundException(a6.toString());
        }
        try {
            return method.invoke(this.layout, null);
        } catch (IllegalAccessException | RuntimeException unused) {
            return null;
        } catch (InvocationTargetException e6) {
            if ((e6.getTargetException() instanceof InterruptedException) || (e6.getTargetException() instanceof InterruptedIOException)) {
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
        if (!str.equals("activateOptions")) {
            return null;
        }
        Layout layout = this.layout;
        if (!(layout instanceof OptionHandler)) {
            return null;
        }
        layout.activateOptions();
        return "Options activated.";
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
            methodUnion.writeMethod.invoke(this.layout, objArr);
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
