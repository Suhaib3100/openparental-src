package org.apache.commons.lang3.builder;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import org.apache.commons.lang3.k1;

/* compiled from: HashCodeBuilder.java */
/* loaded from: classes6.dex */
public class j implements a<Integer> {

    /* renamed from: d, reason: collision with root package name */
    private static final int f85760d = 17;

    /* renamed from: e, reason: collision with root package name */
    private static final int f85761e = 37;

    /* renamed from: f, reason: collision with root package name */
    private static final ThreadLocal<Set<l>> f85762f = new ThreadLocal<>();

    /* renamed from: b, reason: collision with root package name */
    private final int f85763b;

    /* renamed from: c, reason: collision with root package name */
    private int f85764c;

    public j() {
        this.f85763b = 37;
        this.f85764c = 17;
    }

    public static int A(int i4, int i5, Object obj, boolean z4) {
        return B(i4, i5, obj, z4, null, new String[0]);
    }

    public static <T> int B(int i4, int i5, T t4, boolean z4, Class<? super T> cls, String... strArr) {
        k1.b0(t4, "The object to build a hash code for must not be null", new Object[0]);
        j jVar = new j(i4, i5);
        Class<?> cls2 = t4.getClass();
        y(t4, cls2, jVar, z4, strArr);
        while (cls2.getSuperclass() != null && cls2 != cls) {
            cls2 = cls2.getSuperclass();
            y(t4, cls2, jVar, z4, strArr);
        }
        return jVar.f85764c;
    }

    public static int C(Object obj, Collection<String> collection) {
        return E(obj, p.x0(collection));
    }

    public static int D(Object obj, boolean z4) {
        return B(17, 37, obj, z4, null, new String[0]);
    }

    public static int E(Object obj, String... strArr) {
        return B(17, 37, obj, false, null, strArr);
    }

    private static void F(Object obj) {
        Set<l> w4 = w();
        if (w4 == null) {
            w4 = new HashSet<>();
            f85762f.set(w4);
        }
        w4.add(new l(obj));
    }

    private static void H(Object obj) {
        Set<l> w4 = w();
        if (w4 != null) {
            w4.remove(new l(obj));
            if (w4.isEmpty()) {
                f85762f.remove();
            }
        }
    }

    private void t(Object obj) {
        if (obj instanceof long[]) {
            p((long[]) obj);
            return;
        }
        if (obj instanceof int[]) {
            o((int[]) obj);
            return;
        }
        if (obj instanceof short[]) {
            r((short[]) obj);
            return;
        }
        if (obj instanceof char[]) {
            l((char[]) obj);
            return;
        }
        if (obj instanceof byte[]) {
            k((byte[]) obj);
            return;
        }
        if (obj instanceof double[]) {
            m((double[]) obj);
            return;
        }
        if (obj instanceof float[]) {
            n((float[]) obj);
        } else if (obj instanceof boolean[]) {
            s((boolean[]) obj);
        } else {
            q((Object[]) obj);
        }
    }

    static Set<l> w() {
        return f85762f.get();
    }

    static boolean x(Object obj) {
        Set<l> w4 = w();
        return w4 != null && w4.contains(new l(obj));
    }

    private static void y(Object obj, Class<?> cls, j jVar, boolean z4, String[] strArr) {
        if (x(obj)) {
            return;
        }
        try {
            F(obj);
            Field[] declaredFields = cls.getDeclaredFields();
            Arrays.sort(declaredFields, Comparator.comparing(new i()));
            AccessibleObject.setAccessible(declaredFields, true);
            for (Field field : declaredFields) {
                if (!org.apache.commons.lang3.e.b0(strArr, field.getName())) {
                    if (field.getName().contains("$")) {
                        continue;
                    } else {
                        if (!z4 && Modifier.isTransient(field.getModifiers())) {
                        }
                        if (!Modifier.isStatic(field.getModifiers()) && !field.isAnnotationPresent(k.class)) {
                            try {
                                jVar.h(field.get(obj));
                            } catch (IllegalAccessException unused) {
                                throw new InternalError("Unexpected IllegalAccessException");
                            }
                        }
                    }
                }
            }
            H(obj);
        } catch (Throwable th) {
            H(obj);
            throw th;
        }
    }

    public static int z(int i4, int i5, Object obj) {
        return B(i4, i5, obj, false, null, new String[0]);
    }

    public int G() {
        return this.f85764c;
    }

    public j b(byte b5) {
        this.f85764c = (this.f85764c * this.f85763b) + b5;
        return this;
    }

    public j c(char c5) {
        this.f85764c = (this.f85764c * this.f85763b) + c5;
        return this;
    }

    public j d(double d5) {
        return g(Double.doubleToLongBits(d5));
    }

    public j e(float f4) {
        this.f85764c = Float.floatToIntBits(f4) + (this.f85764c * this.f85763b);
        return this;
    }

    public j f(int i4) {
        this.f85764c = (this.f85764c * this.f85763b) + i4;
        return this;
    }

    public j g(long j4) {
        this.f85764c = (this.f85764c * this.f85763b) + ((int) (j4 ^ (j4 >> 32)));
        return this;
    }

    public j h(Object obj) {
        if (obj == null) {
            this.f85764c *= this.f85763b;
        } else if (obj.getClass().isArray()) {
            t(obj);
        } else {
            this.f85764c = obj.hashCode() + (this.f85764c * this.f85763b);
        }
        return this;
    }

    public int hashCode() {
        return G();
    }

    public j i(short s4) {
        this.f85764c = (this.f85764c * this.f85763b) + s4;
        return this;
    }

    public j j(boolean z4) {
        this.f85764c = (this.f85764c * this.f85763b) + (!z4 ? 1 : 0);
        return this;
    }

    public j k(byte[] bArr) {
        if (bArr == null) {
            this.f85764c *= this.f85763b;
        } else {
            for (byte b5 : bArr) {
                b(b5);
            }
        }
        return this;
    }

    public j l(char[] cArr) {
        if (cArr == null) {
            this.f85764c *= this.f85763b;
        } else {
            for (char c5 : cArr) {
                c(c5);
            }
        }
        return this;
    }

    public j m(double[] dArr) {
        if (dArr == null) {
            this.f85764c *= this.f85763b;
        } else {
            for (double d5 : dArr) {
                d(d5);
            }
        }
        return this;
    }

    public j n(float[] fArr) {
        if (fArr == null) {
            this.f85764c *= this.f85763b;
        } else {
            for (float f4 : fArr) {
                e(f4);
            }
        }
        return this;
    }

    public j o(int[] iArr) {
        if (iArr == null) {
            this.f85764c *= this.f85763b;
        } else {
            for (int i4 : iArr) {
                f(i4);
            }
        }
        return this;
    }

    public j p(long[] jArr) {
        if (jArr == null) {
            this.f85764c *= this.f85763b;
        } else {
            for (long j4 : jArr) {
                g(j4);
            }
        }
        return this;
    }

    public j q(Object[] objArr) {
        if (objArr == null) {
            this.f85764c *= this.f85763b;
        } else {
            for (Object obj : objArr) {
                h(obj);
            }
        }
        return this;
    }

    public j r(short[] sArr) {
        if (sArr == null) {
            this.f85764c *= this.f85763b;
        } else {
            for (short s4 : sArr) {
                i(s4);
            }
        }
        return this;
    }

    public j s(boolean[] zArr) {
        if (zArr == null) {
            this.f85764c *= this.f85763b;
        } else {
            for (boolean z4 : zArr) {
                j(z4);
            }
        }
        return this;
    }

    public j u(int i4) {
        this.f85764c = (this.f85764c * this.f85763b) + i4;
        return this;
    }

    @Override // org.apache.commons.lang3.builder.a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public Integer a() {
        return Integer.valueOf(G());
    }

    public j(int i4, int i5) {
        this.f85764c = 0;
        k1.B(i4 % 2 != 0, "HashCodeBuilder requires an odd initial value", new Object[0]);
        k1.B(i5 % 2 != 0, "HashCodeBuilder requires an odd multiplier", new Object[0]);
        this.f85763b = i5;
        this.f85764c = i4;
    }
}
