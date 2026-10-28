package org.apache.commons.lang3.builder;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: EqualsBuilder.java */
/* loaded from: classes6.dex */
public class g implements a<Boolean> {

    /* renamed from: h, reason: collision with root package name */
    private static final ThreadLocal<Set<org.apache.commons.lang3.tuple.e<l, l>>> f85753h = new ThreadLocal<>();

    /* renamed from: e, reason: collision with root package name */
    private List<Class<?>> f85757e;

    /* renamed from: b, reason: collision with root package name */
    private boolean f85754b = true;

    /* renamed from: c, reason: collision with root package name */
    private boolean f85755c = false;

    /* renamed from: d, reason: collision with root package name */
    private boolean f85756d = false;

    /* renamed from: f, reason: collision with root package name */
    private Class<?> f85758f = null;

    /* renamed from: g, reason: collision with root package name */
    private String[] f85759g = null;

    public g() {
        ArrayList arrayList = new ArrayList();
        this.f85757e = arrayList;
        arrayList.add(String.class);
    }

    private void B(Object obj, Object obj2, Class<?> cls) {
        if (z(obj, obj2)) {
            return;
        }
        try {
            H(obj, obj2);
            Field[] declaredFields = cls.getDeclaredFields();
            AccessibleObject.setAccessible(declaredFields, true);
            for (int i4 = 0; i4 < declaredFields.length && this.f85754b; i4++) {
                Field field = declaredFields[i4];
                if (!org.apache.commons.lang3.e.b0(this.f85759g, field.getName())) {
                    if (field.getName().contains("$")) {
                        continue;
                    } else {
                        if (!this.f85755c && Modifier.isTransient(field.getModifiers())) {
                        }
                        if (!Modifier.isStatic(field.getModifiers()) && !field.isAnnotationPresent(h.class)) {
                            try {
                                h(field.get(obj), field.get(obj2));
                            } catch (IllegalAccessException unused) {
                                throw new InternalError("Unexpected IllegalAccessException");
                            }
                        }
                    }
                }
            }
            P(obj, obj2);
        } catch (Throwable th) {
            P(obj, obj2);
            throw th;
        }
    }

    public static boolean C(Object obj, Object obj2, Collection<String> collection) {
        return G(obj, obj2, p.x0(collection));
    }

    public static boolean D(Object obj, Object obj2, boolean z4) {
        return E(obj, obj2, z4, null, false, new String[0]);
    }

    public static boolean E(Object obj, Object obj2, boolean z4, Class<?> cls, boolean z5, String... strArr) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        g gVar = new g();
        gVar.f85759g = strArr;
        gVar.f85758f = cls;
        gVar.f85755c = z4;
        gVar.f85756d = z5;
        return gVar.A(obj, obj2).y();
    }

    public static boolean F(Object obj, Object obj2, boolean z4, Class<?> cls, String... strArr) {
        return E(obj, obj2, z4, cls, false, strArr);
    }

    public static boolean G(Object obj, Object obj2, String... strArr) {
        return E(obj, obj2, false, null, false, strArr);
    }

    private static void H(Object obj, Object obj2) {
        Set<org.apache.commons.lang3.tuple.e<l, l>> x4 = x();
        if (x4 == null) {
            x4 = new HashSet<>();
            f85753h.set(x4);
        }
        x4.add(w(obj, obj2));
    }

    private static void P(Object obj, Object obj2) {
        Set<org.apache.commons.lang3.tuple.e<l, l>> x4 = x();
        if (x4 != null) {
            x4.remove(w(obj, obj2));
            if (x4.isEmpty()) {
                f85753h.remove();
            }
        }
    }

    private void t(Object obj, Object obj2) {
        if (obj.getClass() != obj2.getClass()) {
            K(false);
            return;
        }
        if (obj instanceof long[]) {
            p((long[]) obj, (long[]) obj2);
            return;
        }
        if (obj instanceof int[]) {
            o((int[]) obj, (int[]) obj2);
            return;
        }
        if (obj instanceof short[]) {
            r((short[]) obj, (short[]) obj2);
            return;
        }
        if (obj instanceof char[]) {
            l((char[]) obj, (char[]) obj2);
            return;
        }
        if (obj instanceof byte[]) {
            k((byte[]) obj, (byte[]) obj2);
            return;
        }
        if (obj instanceof double[]) {
            m((double[]) obj, (double[]) obj2);
            return;
        }
        if (obj instanceof float[]) {
            n((float[]) obj, (float[]) obj2);
        } else if (obj instanceof boolean[]) {
            s((boolean[]) obj, (boolean[]) obj2);
        } else {
            q((Object[]) obj, (Object[]) obj2);
        }
    }

    static org.apache.commons.lang3.tuple.e<l, l> w(Object obj, Object obj2) {
        return org.apache.commons.lang3.tuple.e.e(new l(obj), new l(obj2));
    }

    static Set<org.apache.commons.lang3.tuple.e<l, l>> x() {
        return f85753h.get();
    }

    static boolean z(Object obj, Object obj2) {
        Set<org.apache.commons.lang3.tuple.e<l, l>> x4 = x();
        org.apache.commons.lang3.tuple.e<l, l> w4 = w(obj, obj2);
        return x4 != null && (x4.contains(w4) || x4.contains(org.apache.commons.lang3.tuple.a.k(w4.d(), w4.c())));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0020, code lost:
    
        if (r2.isInstance(r6) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        r3 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0031, code lost:
    
        r3 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x002d, code lost:
    
        if (r1.isInstance(r7) == false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.apache.commons.lang3.builder.g A(java.lang.Object r6, java.lang.Object r7) {
        /*
            r5 = this;
            boolean r0 = r5.f85754b
            if (r0 != 0) goto L5
            return r5
        L5:
            if (r6 != r7) goto L8
            return r5
        L8:
            r0 = 0
            if (r6 == 0) goto L71
            if (r7 != 0) goto Le
            goto L71
        Le:
            java.lang.Class r1 = r6.getClass()
            java.lang.Class r2 = r7.getClass()
            boolean r3 = r1.isInstance(r7)
            if (r3 == 0) goto L23
            boolean r3 = r2.isInstance(r6)
            if (r3 != 0) goto L2f
            goto L31
        L23:
            boolean r3 = r2.isInstance(r6)
            if (r3 == 0) goto L6e
            boolean r3 = r1.isInstance(r7)
            if (r3 != 0) goto L31
        L2f:
            r3 = r1
            goto L32
        L31:
            r3 = r2
        L32:
            boolean r4 = r3.isArray()     // Catch: java.lang.IllegalArgumentException -> L6b
            if (r4 == 0) goto L3c
            r5.h(r6, r7)     // Catch: java.lang.IllegalArgumentException -> L6b
            goto L6a
        L3c:
            java.util.List<java.lang.Class<?>> r4 = r5.f85757e     // Catch: java.lang.IllegalArgumentException -> L6b
            if (r4 == 0) goto L55
            boolean r1 = r4.contains(r1)     // Catch: java.lang.IllegalArgumentException -> L6b
            if (r1 != 0) goto L4e
            java.util.List<java.lang.Class<?>> r1 = r5.f85757e     // Catch: java.lang.IllegalArgumentException -> L6b
            boolean r1 = r1.contains(r2)     // Catch: java.lang.IllegalArgumentException -> L6b
            if (r1 == 0) goto L55
        L4e:
            boolean r6 = r6.equals(r7)     // Catch: java.lang.IllegalArgumentException -> L6b
            r5.f85754b = r6     // Catch: java.lang.IllegalArgumentException -> L6b
            goto L6a
        L55:
            r5.B(r6, r7, r3)     // Catch: java.lang.IllegalArgumentException -> L6b
        L58:
            java.lang.Class r1 = r3.getSuperclass()     // Catch: java.lang.IllegalArgumentException -> L6b
            if (r1 == 0) goto L6a
            java.lang.Class<?> r1 = r5.f85758f     // Catch: java.lang.IllegalArgumentException -> L6b
            if (r3 == r1) goto L6a
            java.lang.Class r3 = r3.getSuperclass()     // Catch: java.lang.IllegalArgumentException -> L6b
            r5.B(r6, r7, r3)     // Catch: java.lang.IllegalArgumentException -> L6b
            goto L58
        L6a:
            return r5
        L6b:
            r5.f85754b = r0
            return r5
        L6e:
            r5.f85754b = r0
            return r5
        L71:
            r5.f85754b = r0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.lang3.builder.g.A(java.lang.Object, java.lang.Object):org.apache.commons.lang3.builder.g");
    }

    public void I() {
        this.f85754b = true;
    }

    public g J(List<Class<?>> list) {
        this.f85757e = list;
        return this;
    }

    protected void K(boolean z4) {
        this.f85754b = z4;
    }

    public g L(String... strArr) {
        this.f85759g = strArr;
        return this;
    }

    public g M(Class<?> cls) {
        this.f85758f = cls;
        return this;
    }

    public g N(boolean z4) {
        this.f85756d = z4;
        return this;
    }

    public g O(boolean z4) {
        this.f85755c = z4;
        return this;
    }

    public g b(byte b5, byte b6) {
        if (!this.f85754b) {
            return this;
        }
        this.f85754b = b5 == b6;
        return this;
    }

    public g c(char c5, char c6) {
        if (!this.f85754b) {
            return this;
        }
        this.f85754b = c5 == c6;
        return this;
    }

    public g d(double d5, double d6) {
        return !this.f85754b ? this : g(Double.doubleToLongBits(d5), Double.doubleToLongBits(d6));
    }

    public g e(float f4, float f5) {
        return !this.f85754b ? this : f(Float.floatToIntBits(f4), Float.floatToIntBits(f5));
    }

    public g f(int i4, int i5) {
        if (!this.f85754b) {
            return this;
        }
        this.f85754b = i4 == i5;
        return this;
    }

    public g g(long j4, long j5) {
        if (!this.f85754b) {
            return this;
        }
        this.f85754b = j4 == j5;
        return this;
    }

    public g h(Object obj, Object obj2) {
        if (!this.f85754b) {
            return this;
        }
        if (obj == obj2) {
            return this;
        }
        if (obj == null || obj2 == null) {
            K(false);
            return this;
        }
        Class<?> cls = obj.getClass();
        if (cls.isArray()) {
            t(obj, obj2);
        } else if (!this.f85756d || org.apache.commons.lang3.s.U(cls)) {
            this.f85754b = obj.equals(obj2);
        } else {
            A(obj, obj2);
        }
        return this;
    }

    public g i(short s4, short s5) {
        if (!this.f85754b) {
            return this;
        }
        this.f85754b = s4 == s5;
        return this;
    }

    public g j(boolean z4, boolean z5) {
        if (!this.f85754b) {
            return this;
        }
        this.f85754b = z4 == z5;
        return this;
    }

    public g k(byte[] bArr, byte[] bArr2) {
        if (!this.f85754b) {
            return this;
        }
        if (bArr == bArr2) {
            return this;
        }
        if (bArr == null || bArr2 == null) {
            K(false);
            return this;
        }
        if (bArr.length != bArr2.length) {
            K(false);
            return this;
        }
        for (int i4 = 0; i4 < bArr.length && this.f85754b; i4++) {
            b(bArr[i4], bArr2[i4]);
        }
        return this;
    }

    public g l(char[] cArr, char[] cArr2) {
        if (!this.f85754b) {
            return this;
        }
        if (cArr == cArr2) {
            return this;
        }
        if (cArr == null || cArr2 == null) {
            K(false);
            return this;
        }
        if (cArr.length != cArr2.length) {
            K(false);
            return this;
        }
        for (int i4 = 0; i4 < cArr.length && this.f85754b; i4++) {
            c(cArr[i4], cArr2[i4]);
        }
        return this;
    }

    public g m(double[] dArr, double[] dArr2) {
        if (!this.f85754b) {
            return this;
        }
        if (dArr == dArr2) {
            return this;
        }
        if (dArr == null || dArr2 == null) {
            K(false);
            return this;
        }
        if (dArr.length != dArr2.length) {
            K(false);
            return this;
        }
        for (int i4 = 0; i4 < dArr.length && this.f85754b; i4++) {
            d(dArr[i4], dArr2[i4]);
        }
        return this;
    }

    public g n(float[] fArr, float[] fArr2) {
        if (!this.f85754b) {
            return this;
        }
        if (fArr == fArr2) {
            return this;
        }
        if (fArr == null || fArr2 == null) {
            K(false);
            return this;
        }
        if (fArr.length != fArr2.length) {
            K(false);
            return this;
        }
        for (int i4 = 0; i4 < fArr.length && this.f85754b; i4++) {
            e(fArr[i4], fArr2[i4]);
        }
        return this;
    }

    public g o(int[] iArr, int[] iArr2) {
        if (!this.f85754b) {
            return this;
        }
        if (iArr == iArr2) {
            return this;
        }
        if (iArr == null || iArr2 == null) {
            K(false);
            return this;
        }
        if (iArr.length != iArr2.length) {
            K(false);
            return this;
        }
        for (int i4 = 0; i4 < iArr.length && this.f85754b; i4++) {
            f(iArr[i4], iArr2[i4]);
        }
        return this;
    }

    public g p(long[] jArr, long[] jArr2) {
        if (!this.f85754b) {
            return this;
        }
        if (jArr == jArr2) {
            return this;
        }
        if (jArr == null || jArr2 == null) {
            K(false);
            return this;
        }
        if (jArr.length != jArr2.length) {
            K(false);
            return this;
        }
        for (int i4 = 0; i4 < jArr.length && this.f85754b; i4++) {
            g(jArr[i4], jArr2[i4]);
        }
        return this;
    }

    public g q(Object[] objArr, Object[] objArr2) {
        if (!this.f85754b) {
            return this;
        }
        if (objArr == objArr2) {
            return this;
        }
        if (objArr == null || objArr2 == null) {
            K(false);
            return this;
        }
        if (objArr.length != objArr2.length) {
            K(false);
            return this;
        }
        for (int i4 = 0; i4 < objArr.length && this.f85754b; i4++) {
            h(objArr[i4], objArr2[i4]);
        }
        return this;
    }

    public g r(short[] sArr, short[] sArr2) {
        if (!this.f85754b) {
            return this;
        }
        if (sArr == sArr2) {
            return this;
        }
        if (sArr == null || sArr2 == null) {
            K(false);
            return this;
        }
        if (sArr.length != sArr2.length) {
            K(false);
            return this;
        }
        for (int i4 = 0; i4 < sArr.length && this.f85754b; i4++) {
            i(sArr[i4], sArr2[i4]);
        }
        return this;
    }

    public g s(boolean[] zArr, boolean[] zArr2) {
        if (!this.f85754b) {
            return this;
        }
        if (zArr == zArr2) {
            return this;
        }
        if (zArr == null || zArr2 == null) {
            K(false);
            return this;
        }
        if (zArr.length != zArr2.length) {
            K(false);
            return this;
        }
        for (int i4 = 0; i4 < zArr.length && this.f85754b; i4++) {
            j(zArr[i4], zArr2[i4]);
        }
        return this;
    }

    public g u(boolean z4) {
        if (!this.f85754b) {
            return this;
        }
        this.f85754b = z4;
        return this;
    }

    @Override // org.apache.commons.lang3.builder.a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public Boolean a() {
        return Boolean.valueOf(y());
    }

    public boolean y() {
        return this.f85754b;
    }
}
