package org.apache.commons.lang3;

import androidx.collection.r2;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;
import java.util.function.Supplier;
import org.apache.commons.lang3.exception.CloneFailedException;

/* compiled from: ObjectUtils.java */
/* loaded from: classes6.dex */
public class p0 {

    /* renamed from: a, reason: collision with root package name */
    private static final char f86071a = '@';

    /* renamed from: b, reason: collision with root package name */
    public static final a f86072b = new a();

    /* compiled from: ObjectUtils.java */
    public static class a implements Serializable {

        /* renamed from: b, reason: collision with root package name */
        private static final long f86073b = 7092611880189329093L;

        a() {
        }

        private Object a() {
            return p0.f86072b;
        }
    }

    public static String A(Object obj) {
        if (obj == null) {
            return null;
        }
        String name = obj.getClass().getName();
        String hexString = Integer.toHexString(System.identityHashCode(obj));
        StringBuilder sb = new StringBuilder(hexString.length() + name.length() + 1);
        sb.append(name);
        sb.append(f86071a);
        sb.append(hexString);
        return sb.toString();
    }

    public static void B(Appendable appendable, Object obj) throws IOException {
        k1.b0(obj, "Cannot get the toString of a null object", new Object[0]);
        appendable.append(obj.getClass().getName()).append(f86071a).append(Integer.toHexString(System.identityHashCode(obj)));
    }

    public static void C(StringBuffer stringBuffer, Object obj) {
        k1.b0(obj, "Cannot get the toString of a null object", new Object[0]);
        String name = obj.getClass().getName();
        String hexString = Integer.toHexString(System.identityHashCode(obj));
        stringBuffer.ensureCapacity(hexString.length() + com.google.android.gms.common.stats.a.a(name, stringBuffer.length(), 1));
        stringBuffer.append(name);
        stringBuffer.append(f86071a);
        stringBuffer.append(hexString);
    }

    public static void D(StringBuilder sb, Object obj) {
        k1.b0(obj, "Cannot get the toString of a null object", new Object[0]);
        String name = obj.getClass().getName();
        String hexString = Integer.toHexString(System.identityHashCode(obj));
        sb.ensureCapacity(hexString.length() + com.google.android.gms.common.stats.a.a(name, sb.length(), 1));
        sb.append(name);
        sb.append(f86071a);
        sb.append(hexString);
    }

    @Deprecated
    public static void E(org.apache.commons.lang3.text.e eVar, Object obj) {
        k1.b0(obj, "Cannot get the toString of a null object", new Object[0]);
        String name = obj.getClass().getName();
        String hexString = Integer.toHexString(System.identityHashCode(obj));
        eVar.F0(hexString.length() + com.google.android.gms.common.stats.a.a(name, eVar.length(), 1));
        eVar.m(name).append(f86071a).m(hexString);
    }

    public static boolean F(Object obj) {
        if (obj == null) {
            return true;
        }
        if (obj instanceof CharSequence) {
            return ((CharSequence) obj).length() == 0;
        }
        if (obj.getClass().isArray()) {
            return Array.getLength(obj) == 0;
        }
        if (obj instanceof Collection) {
            return ((Collection) obj).isEmpty();
        }
        if (obj instanceof Map) {
            return ((Map) obj).isEmpty();
        }
        return false;
    }

    public static boolean G(Object obj) {
        return !F(obj);
    }

    @SafeVarargs
    public static <T extends Comparable<? super T>> T H(T... tArr) {
        T t4 = null;
        if (tArr != null) {
            for (T t5 : tArr) {
                if (s(t5, t4, false) > 0) {
                    t4 = t5;
                }
            }
        }
        return t4;
    }

    @SafeVarargs
    public static <T extends Comparable<? super T>> T I(T... tArr) {
        k1.W(tArr);
        k1.M(tArr);
        TreeSet treeSet = new TreeSet();
        Collections.addAll(treeSet, tArr);
        return (T) treeSet.toArray()[(treeSet.size() - 1) / 2];
    }

    @SafeVarargs
    public static <T> T J(Comparator<T> comparator, T... tArr) {
        k1.X(tArr, "null/empty items", new Object[0]);
        k1.M(tArr);
        k1.b0(comparator, "null comparator", new Object[0]);
        TreeSet treeSet = new TreeSet(comparator);
        Collections.addAll(treeSet, tArr);
        return (T) treeSet.toArray()[(treeSet.size() - 1) / 2];
    }

    @SafeVarargs
    public static <T extends Comparable<? super T>> T K(T... tArr) {
        T t4 = null;
        if (tArr != null) {
            for (T t5 : tArr) {
                if (s(t5, t4, true) < 0) {
                    t4 = t5;
                }
            }
        }
        return t4;
    }

    @SafeVarargs
    public static <T> T L(T... tArr) {
        if (!e.x1(tArr)) {
            return null;
        }
        HashMap hashMap = new HashMap(tArr.length);
        int i4 = 0;
        for (T t4 : tArr) {
            ze.f fVar = (ze.f) hashMap.get(t4);
            if (fVar == null) {
                hashMap.put(t4, new ze.f(1));
            } else {
                fVar.m();
            }
        }
        while (true) {
            T t5 = null;
            for (Map.Entry entry : hashMap.entrySet()) {
                int intValue = ((ze.f) entry.getValue()).intValue();
                if (intValue == i4) {
                    break;
                }
                if (intValue > i4) {
                    t5 = (T) entry.getKey();
                    i4 = intValue;
                }
            }
            return t5;
        }
    }

    public static boolean M(Object obj, Object obj2) {
        return !u(obj, obj2);
    }

    @Deprecated
    public static String N(Object obj) {
        return obj == null ? "" : obj.toString();
    }

    @Deprecated
    public static String O(Object obj, String str) {
        return obj == null ? str : obj.toString();
    }

    public static String P(Object obj, Supplier<String> supplier) {
        if (obj != null) {
            return obj.toString();
        }
        if (supplier == null) {
            return null;
        }
        return supplier.get();
    }

    public static byte a(byte b5) {
        return b5;
    }

    public static char b(char c5) {
        return c5;
    }

    public static double c(double d5) {
        return d5;
    }

    public static float d(float f4) {
        return f4;
    }

    public static int e(int i4) {
        return i4;
    }

    public static long f(long j4) {
        return j4;
    }

    public static <T> T g(T t4) {
        return t4;
    }

    public static short h(short s4) {
        return s4;
    }

    public static boolean i(boolean z4) {
        return z4;
    }

    public static byte j(int i4) {
        if (i4 < -128 || i4 > 127) {
            throw new IllegalArgumentException(r2.a("Supplied value must be a valid byte literal between -128 and 127: [", i4, "]"));
        }
        return (byte) i4;
    }

    public static short k(int i4) {
        if (i4 < -32768 || i4 > 32767) {
            throw new IllegalArgumentException(r2.a("Supplied value must be a valid byte literal between -32768 and 32767: [", i4, "]"));
        }
        return (short) i4;
    }

    public static boolean l(Object... objArr) {
        if (objArr == null) {
            return false;
        }
        for (Object obj : objArr) {
            if (obj == null) {
                return false;
            }
        }
        return true;
    }

    public static boolean m(Object... objArr) {
        return !n(objArr);
    }

    public static boolean n(Object... objArr) {
        return v(objArr) != null;
    }

    public static boolean o(Object... objArr) {
        return !l(objArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T p(T t4) {
        if (!(t4 instanceof Cloneable)) {
            return null;
        }
        if (!t4.getClass().isArray()) {
            try {
                return (T) t4.getClass().getMethod("clone", null).invoke(t4, null);
            } catch (IllegalAccessException e4) {
                throw new CloneFailedException("Cannot clone Cloneable type ".concat(t4.getClass().getName()), e4);
            } catch (NoSuchMethodException e5) {
                throw new CloneFailedException("Cloneable type " + t4.getClass().getName() + " has no clone method", e5);
            } catch (InvocationTargetException e6) {
                throw new CloneFailedException("Exception cloning Cloneable type ".concat(t4.getClass().getName()), e6.getCause());
            }
        }
        Class<?> componentType = t4.getClass().getComponentType();
        if (!componentType.isPrimitive()) {
            return (T) ((Object[]) t4).clone();
        }
        int length = Array.getLength(t4);
        T t5 = (T) Array.newInstance(componentType, length);
        while (true) {
            int i4 = length - 1;
            if (length <= 0) {
                return t5;
            }
            Array.set(t5, i4, Array.get(t4, i4));
            length = i4;
        }
    }

    public static <T> T q(T t4) {
        T t5 = (T) p(t4);
        return t5 == null ? t4 : t5;
    }

    public static <T extends Comparable<? super T>> int r(T t4, T t5) {
        return s(t4, t5, false);
    }

    public static <T extends Comparable<? super T>> int s(T t4, T t5, boolean z4) {
        if (t4 == t5) {
            return 0;
        }
        return t4 == null ? z4 ? 1 : -1 : t5 == null ? z4 ? -1 : 1 : t4.compareTo(t5);
    }

    public static <T> T t(T t4, T t5) {
        return t4 != null ? t4 : t5;
    }

    @Deprecated
    public static boolean u(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    @SafeVarargs
    public static <T> T v(T... tArr) {
        if (tArr == null) {
            return null;
        }
        for (T t4 : tArr) {
            if (t4 != null) {
                return t4;
            }
        }
        return null;
    }

    @SafeVarargs
    public static <T> T w(Supplier<T>... supplierArr) {
        T t4;
        if (supplierArr == null) {
            return null;
        }
        for (Supplier<T> supplier : supplierArr) {
            if (supplier != null && (t4 = supplier.get()) != null) {
                return t4;
            }
        }
        return null;
    }

    public static <T> T x(T t4, Supplier<T> supplier) {
        if (t4 != null) {
            return t4;
        }
        if (supplier == null) {
            return null;
        }
        return supplier.get();
    }

    @Deprecated
    public static int y(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @Deprecated
    public static int z(Object... objArr) {
        int i4 = 1;
        if (objArr != null) {
            for (Object obj : objArr) {
                i4 = (i4 * 31) + y(obj);
            }
        }
        return i4;
    }
}
