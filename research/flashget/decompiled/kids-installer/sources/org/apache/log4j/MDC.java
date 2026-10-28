package org.apache.log4j;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Hashtable;
import org.apache.log4j.helpers.Loader;
import org.apache.log4j.helpers.ThreadLocalMap;

/* loaded from: classes5.dex */
public class MDC {
    static final int HT_SIZE = 7;
    static final MDC mdc = new MDC();
    boolean java1;
    private Method removeMethod;
    Object tlm;

    private MDC() {
        boolean isJava1 = Loader.isJava1();
        this.java1 = isJava1;
        if (!isJava1) {
            this.tlm = new ThreadLocalMap();
        }
        try {
            this.removeMethod = ThreadLocal.class.getMethod("remove", null);
        } catch (NoSuchMethodException unused) {
        }
    }

    public static void clear() {
        MDC mdc2 = mdc;
        if (mdc2 != null) {
            mdc2.clear0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void clear0() {
        Object obj;
        if (this.java1 || (obj = this.tlm) == null) {
            return;
        }
        Hashtable hashtable = (Hashtable) ((ThreadLocalMap) obj).get();
        if (hashtable != null) {
            hashtable.clear();
        }
        Method method = this.removeMethod;
        if (method != null) {
            try {
                method.invoke(this.tlm, null);
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }

    public static Object get(String str) {
        MDC mdc2 = mdc;
        if (mdc2 != null) {
            return mdc2.get0(str);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object get0(String str) {
        Object obj;
        Hashtable hashtable;
        if (this.java1 || (obj = this.tlm) == null || (hashtable = (Hashtable) ((ThreadLocalMap) obj).get()) == null || str == null) {
            return null;
        }
        return hashtable.get(str);
    }

    public static Hashtable getContext() {
        MDC mdc2 = mdc;
        if (mdc2 != null) {
            return mdc2.getContext0();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Hashtable getContext0() {
        Object obj;
        if (this.java1 || (obj = this.tlm) == null) {
            return null;
        }
        return (Hashtable) ((ThreadLocalMap) obj).get();
    }

    public static void put(String str, Object obj) {
        MDC mdc2 = mdc;
        if (mdc2 != null) {
            mdc2.put0(str, obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void put0(String str, Object obj) {
        Object obj2;
        if (this.java1 || (obj2 = this.tlm) == null) {
            return;
        }
        Hashtable hashtable = (Hashtable) ((ThreadLocalMap) obj2).get();
        if (hashtable == null) {
            hashtable = new Hashtable(7);
            ((ThreadLocalMap) this.tlm).set(hashtable);
        }
        hashtable.put(str, obj);
    }

    public static void remove(String str) {
        MDC mdc2 = mdc;
        if (mdc2 != null) {
            mdc2.remove0(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void remove0(String str) {
        Object obj;
        Hashtable hashtable;
        if (this.java1 || (obj = this.tlm) == null || (hashtable = (Hashtable) ((ThreadLocalMap) obj).get()) == null) {
            return;
        }
        hashtable.remove(str);
        if (hashtable.isEmpty()) {
            clear0();
        }
    }
}
