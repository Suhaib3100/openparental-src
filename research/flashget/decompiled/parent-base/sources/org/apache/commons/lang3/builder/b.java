package org.apache.commons.lang3.builder;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.Comparator;
import java.util.Objects;

/* compiled from: CompareToBuilder.java */
/* loaded from: classes6.dex */
public class b implements a<Integer> {

    /* renamed from: b, reason: collision with root package name */
    private int f85666b = 0;

    public static int A(Object obj, Object obj2, Collection<String> collection) {
        return C(obj, obj2, false, null, p.x0(collection));
    }

    public static int B(Object obj, Object obj2, boolean z4) {
        return C(obj, obj2, z4, null, new String[0]);
    }

    public static int C(Object obj, Object obj2, boolean z4, Class<?> cls, String... strArr) {
        if (obj == obj2) {
            return 0;
        }
        Objects.requireNonNull(obj, "lhs");
        Objects.requireNonNull(obj2, "rhs");
        Class<?> cls2 = obj.getClass();
        if (!cls2.isInstance(obj2)) {
            throw new ClassCastException();
        }
        b bVar = new b();
        y(obj, obj2, cls2, bVar, z4, strArr);
        while (cls2.getSuperclass() != null && cls2 != cls) {
            cls2 = cls2.getSuperclass();
            y(obj, obj2, cls2, bVar, z4, strArr);
        }
        return bVar.f85666b;
    }

    public static int D(Object obj, Object obj2, String... strArr) {
        return C(obj, obj2, false, null, strArr);
    }

    private void v(Object obj, Object obj2, Comparator<?> comparator) {
        if (obj instanceof long[]) {
            q((long[]) obj, (long[]) obj2);
            return;
        }
        if (obj instanceof int[]) {
            p((int[]) obj, (int[]) obj2);
            return;
        }
        if (obj instanceof short[]) {
            t((short[]) obj, (short[]) obj2);
            return;
        }
        if (obj instanceof char[]) {
            m((char[]) obj, (char[]) obj2);
            return;
        }
        if (obj instanceof byte[]) {
            l((byte[]) obj, (byte[]) obj2);
            return;
        }
        if (obj instanceof double[]) {
            n((double[]) obj, (double[]) obj2);
            return;
        }
        if (obj instanceof float[]) {
            o((float[]) obj, (float[]) obj2);
        } else if (obj instanceof boolean[]) {
            u((boolean[]) obj, (boolean[]) obj2);
        } else {
            s((Object[]) obj, (Object[]) obj2, comparator);
        }
    }

    private static void y(Object obj, Object obj2, Class<?> cls, b bVar, boolean z4, String[] strArr) {
        Field[] declaredFields = cls.getDeclaredFields();
        AccessibleObject.setAccessible(declaredFields, true);
        for (int i4 = 0; i4 < declaredFields.length && bVar.f85666b == 0; i4++) {
            Field field = declaredFields[i4];
            if (!org.apache.commons.lang3.e.b0(strArr, field.getName()) && !field.getName().contains("$") && ((z4 || !Modifier.isTransient(field.getModifiers())) && !Modifier.isStatic(field.getModifiers()))) {
                try {
                    bVar.h(field.get(obj), field.get(obj2));
                } catch (IllegalAccessException unused) {
                    throw new InternalError("Unexpected IllegalAccessException");
                }
            }
        }
    }

    public static int z(Object obj, Object obj2) {
        return C(obj, obj2, false, null, new String[0]);
    }

    public int E() {
        return this.f85666b;
    }

    public b b(byte b5, byte b6) {
        if (this.f85666b != 0) {
            return this;
        }
        this.f85666b = Byte.compare(b5, b6);
        return this;
    }

    public b c(char c5, char c6) {
        if (this.f85666b != 0) {
            return this;
        }
        this.f85666b = Character.compare(c5, c6);
        return this;
    }

    public b d(double d5, double d6) {
        if (this.f85666b != 0) {
            return this;
        }
        this.f85666b = Double.compare(d5, d6);
        return this;
    }

    public b e(float f4, float f5) {
        if (this.f85666b != 0) {
            return this;
        }
        this.f85666b = Float.compare(f4, f5);
        return this;
    }

    public b f(int i4, int i5) {
        if (this.f85666b != 0) {
            return this;
        }
        this.f85666b = Integer.compare(i4, i5);
        return this;
    }

    public b g(long j4, long j5) {
        if (this.f85666b != 0) {
            return this;
        }
        this.f85666b = Long.compare(j4, j5);
        return this;
    }

    public b h(Object obj, Object obj2) {
        return i(obj, obj2, null);
    }

    public b i(Object obj, Object obj2, Comparator<?> comparator) {
        if (this.f85666b != 0) {
            return this;
        }
        if (obj == obj2) {
            return this;
        }
        if (obj == null) {
            this.f85666b = -1;
            return this;
        }
        if (obj2 == null) {
            this.f85666b = 1;
            return this;
        }
        if (obj.getClass().isArray()) {
            v(obj, obj2, comparator);
        } else if (comparator == null) {
            this.f85666b = ((Comparable) obj).compareTo(obj2);
        } else {
            this.f85666b = comparator.compare(obj, obj2);
        }
        return this;
    }

    public b j(short s4, short s5) {
        if (this.f85666b != 0) {
            return this;
        }
        this.f85666b = Short.compare(s4, s5);
        return this;
    }

    public b k(boolean z4, boolean z5) {
        if (this.f85666b != 0) {
            return this;
        }
        if (z4 == z5) {
            return this;
        }
        if (z4) {
            this.f85666b = 1;
        } else {
            this.f85666b = -1;
        }
        return this;
    }

    public b l(byte[] bArr, byte[] bArr2) {
        if (this.f85666b != 0) {
            return this;
        }
        if (bArr == bArr2) {
            return this;
        }
        if (bArr == null) {
            this.f85666b = -1;
            return this;
        }
        if (bArr2 == null) {
            this.f85666b = 1;
            return this;
        }
        if (bArr.length != bArr2.length) {
            this.f85666b = bArr.length >= bArr2.length ? 1 : -1;
            return this;
        }
        for (int i4 = 0; i4 < bArr.length && this.f85666b == 0; i4++) {
            b(bArr[i4], bArr2[i4]);
        }
        return this;
    }

    public b m(char[] cArr, char[] cArr2) {
        if (this.f85666b != 0) {
            return this;
        }
        if (cArr == cArr2) {
            return this;
        }
        if (cArr == null) {
            this.f85666b = -1;
            return this;
        }
        if (cArr2 == null) {
            this.f85666b = 1;
            return this;
        }
        if (cArr.length != cArr2.length) {
            this.f85666b = cArr.length >= cArr2.length ? 1 : -1;
            return this;
        }
        for (int i4 = 0; i4 < cArr.length && this.f85666b == 0; i4++) {
            c(cArr[i4], cArr2[i4]);
        }
        return this;
    }

    public b n(double[] dArr, double[] dArr2) {
        if (this.f85666b != 0) {
            return this;
        }
        if (dArr == dArr2) {
            return this;
        }
        if (dArr == null) {
            this.f85666b = -1;
            return this;
        }
        if (dArr2 == null) {
            this.f85666b = 1;
            return this;
        }
        if (dArr.length != dArr2.length) {
            this.f85666b = dArr.length >= dArr2.length ? 1 : -1;
            return this;
        }
        for (int i4 = 0; i4 < dArr.length && this.f85666b == 0; i4++) {
            d(dArr[i4], dArr2[i4]);
        }
        return this;
    }

    public b o(float[] fArr, float[] fArr2) {
        if (this.f85666b != 0) {
            return this;
        }
        if (fArr == fArr2) {
            return this;
        }
        if (fArr == null) {
            this.f85666b = -1;
            return this;
        }
        if (fArr2 == null) {
            this.f85666b = 1;
            return this;
        }
        if (fArr.length != fArr2.length) {
            this.f85666b = fArr.length >= fArr2.length ? 1 : -1;
            return this;
        }
        for (int i4 = 0; i4 < fArr.length && this.f85666b == 0; i4++) {
            e(fArr[i4], fArr2[i4]);
        }
        return this;
    }

    public b p(int[] iArr, int[] iArr2) {
        if (this.f85666b != 0) {
            return this;
        }
        if (iArr == iArr2) {
            return this;
        }
        if (iArr == null) {
            this.f85666b = -1;
            return this;
        }
        if (iArr2 == null) {
            this.f85666b = 1;
            return this;
        }
        if (iArr.length != iArr2.length) {
            this.f85666b = iArr.length >= iArr2.length ? 1 : -1;
            return this;
        }
        for (int i4 = 0; i4 < iArr.length && this.f85666b == 0; i4++) {
            f(iArr[i4], iArr2[i4]);
        }
        return this;
    }

    public b q(long[] jArr, long[] jArr2) {
        if (this.f85666b != 0) {
            return this;
        }
        if (jArr == jArr2) {
            return this;
        }
        if (jArr == null) {
            this.f85666b = -1;
            return this;
        }
        if (jArr2 == null) {
            this.f85666b = 1;
            return this;
        }
        if (jArr.length != jArr2.length) {
            this.f85666b = jArr.length >= jArr2.length ? 1 : -1;
            return this;
        }
        for (int i4 = 0; i4 < jArr.length && this.f85666b == 0; i4++) {
            g(jArr[i4], jArr2[i4]);
        }
        return this;
    }

    public b r(Object[] objArr, Object[] objArr2) {
        return s(objArr, objArr2, null);
    }

    public b s(Object[] objArr, Object[] objArr2, Comparator<?> comparator) {
        if (this.f85666b != 0) {
            return this;
        }
        if (objArr == objArr2) {
            return this;
        }
        if (objArr == null) {
            this.f85666b = -1;
            return this;
        }
        if (objArr2 == null) {
            this.f85666b = 1;
            return this;
        }
        if (objArr.length != objArr2.length) {
            this.f85666b = objArr.length >= objArr2.length ? 1 : -1;
            return this;
        }
        for (int i4 = 0; i4 < objArr.length && this.f85666b == 0; i4++) {
            i(objArr[i4], objArr2[i4], comparator);
        }
        return this;
    }

    public b t(short[] sArr, short[] sArr2) {
        if (this.f85666b != 0) {
            return this;
        }
        if (sArr == sArr2) {
            return this;
        }
        if (sArr == null) {
            this.f85666b = -1;
            return this;
        }
        if (sArr2 == null) {
            this.f85666b = 1;
            return this;
        }
        if (sArr.length != sArr2.length) {
            this.f85666b = sArr.length >= sArr2.length ? 1 : -1;
            return this;
        }
        for (int i4 = 0; i4 < sArr.length && this.f85666b == 0; i4++) {
            j(sArr[i4], sArr2[i4]);
        }
        return this;
    }

    public b u(boolean[] zArr, boolean[] zArr2) {
        if (this.f85666b != 0) {
            return this;
        }
        if (zArr == zArr2) {
            return this;
        }
        if (zArr == null) {
            this.f85666b = -1;
            return this;
        }
        if (zArr2 == null) {
            this.f85666b = 1;
            return this;
        }
        if (zArr.length != zArr2.length) {
            this.f85666b = zArr.length >= zArr2.length ? 1 : -1;
            return this;
        }
        for (int i4 = 0; i4 < zArr.length && this.f85666b == 0; i4++) {
            k(zArr[i4], zArr2[i4]);
        }
        return this;
    }

    public b w(int i4) {
        if (this.f85666b != 0) {
            return this;
        }
        this.f85666b = i4;
        return this;
    }

    @Override // org.apache.commons.lang3.builder.a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public Integer a() {
        return Integer.valueOf(E());
    }
}
