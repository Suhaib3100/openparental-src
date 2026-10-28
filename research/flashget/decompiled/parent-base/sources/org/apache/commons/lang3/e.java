package org.apache.commons.lang3;

import androidx.collection.r2;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* compiled from: ArrayUtils.java */
/* loaded from: classes6.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean[] f85949a = new boolean[0];

    /* renamed from: b, reason: collision with root package name */
    public static final Boolean[] f85950b = new Boolean[0];

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f85951c = new byte[0];

    /* renamed from: d, reason: collision with root package name */
    public static final Byte[] f85952d = new Byte[0];

    /* renamed from: e, reason: collision with root package name */
    public static final char[] f85953e = new char[0];

    /* renamed from: f, reason: collision with root package name */
    public static final Character[] f85954f = new Character[0];

    /* renamed from: g, reason: collision with root package name */
    public static final Class<?>[] f85955g = new Class[0];

    /* renamed from: h, reason: collision with root package name */
    public static final double[] f85956h = new double[0];

    /* renamed from: i, reason: collision with root package name */
    public static final Double[] f85957i = new Double[0];

    /* renamed from: j, reason: collision with root package name */
    public static final Field[] f85958j = new Field[0];

    /* renamed from: k, reason: collision with root package name */
    public static final float[] f85959k = new float[0];

    /* renamed from: l, reason: collision with root package name */
    public static final Float[] f85960l = new Float[0];

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f85961m = new int[0];

    /* renamed from: n, reason: collision with root package name */
    public static final Integer[] f85962n = new Integer[0];

    /* renamed from: o, reason: collision with root package name */
    public static final long[] f85963o = new long[0];

    /* renamed from: p, reason: collision with root package name */
    public static final Long[] f85964p = new Long[0];

    /* renamed from: q, reason: collision with root package name */
    public static final Method[] f85965q = new Method[0];

    /* renamed from: r, reason: collision with root package name */
    public static final Object[] f85966r = new Object[0];

    /* renamed from: s, reason: collision with root package name */
    public static final short[] f85967s = new short[0];

    /* renamed from: t, reason: collision with root package name */
    public static final Short[] f85968t = new Short[0];

    /* renamed from: u, reason: collision with root package name */
    public static final String[] f85969u = new String[0];

    /* renamed from: v, reason: collision with root package name */
    public static final Throwable[] f85970v = new Throwable[0];

    /* renamed from: w, reason: collision with root package name */
    public static final Type[] f85971w = new Type[0];

    /* renamed from: x, reason: collision with root package name */
    public static final int f85972x = -1;

    public static short[] A(short[] sArr, short... sArr2) {
        if (sArr == null) {
            return S(sArr2);
        }
        if (sArr2 == null) {
            return S(sArr);
        }
        short[] sArr3 = new short[sArr.length + sArr2.length];
        System.arraycopy(sArr, 0, sArr3, 0, sArr.length);
        System.arraycopy(sArr2, 0, sArr3, sArr.length, sArr2.length);
        return sArr3;
    }

    public static int A0(short[] sArr, short s4, int i4) {
        if (sArr == null) {
            return -1;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        while (i4 < sArr.length) {
            if (s4 == sArr[i4]) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    public static boolean A1(Object obj, Object obj2) {
        return h0(obj) == h0(obj2);
    }

    public static Float[] A2(Float[] fArr) {
        return n1(fArr) ? f85960l : fArr;
    }

    public static int[] A3(int[] iArr, int i4) {
        int u02 = u0(iArr, i4, 0);
        return u02 == -1 ? P(iArr) : (int[]) J2(iArr, u02);
    }

    public static void A4(char[] cArr) {
        B4(cArr, new Random());
    }

    public static Short[] A5(short[] sArr) {
        if (sArr == null) {
            return null;
        }
        if (sArr.length == 0) {
            return f85968t;
        }
        Short[] shArr = new Short[sArr.length];
        for (int i4 = 0; i4 < sArr.length; i4++) {
            shArr[i4] = Short.valueOf(sArr[i4]);
        }
        return shArr;
    }

    public static boolean[] B(boolean[] zArr, boolean... zArr2) {
        if (zArr == null) {
            return T(zArr2);
        }
        if (zArr2 == null) {
            return T(zArr);
        }
        boolean[] zArr3 = new boolean[zArr.length + zArr2.length];
        System.arraycopy(zArr, 0, zArr3, 0, zArr.length);
        System.arraycopy(zArr2, 0, zArr3, zArr.length, zArr2.length);
        return zArr3;
    }

    public static int B0(boolean[] zArr, boolean z4) {
        return C0(zArr, z4, 0);
    }

    public static boolean B1(byte[] bArr, byte[] bArr2) {
        return h0(bArr) == h0(bArr2);
    }

    public static Integer[] B2(Integer[] numArr) {
        return n1(numArr) ? f85962n : numArr;
    }

    public static long[] B3(long[] jArr, long j4) {
        int w02 = w0(jArr, j4, 0);
        return w02 == -1 ? Q(jArr) : (long[]) J2(jArr, w02);
    }

    public static void B4(char[] cArr, Random random) {
        for (int length = cArr.length; length > 1; length--) {
            c5(cArr, length - 1, random.nextInt(length), 1);
        }
    }

    public static Object B5(Object obj) {
        if (obj == null) {
            return null;
        }
        Class<?> d02 = s.d0(obj.getClass().getComponentType());
        return Integer.TYPE.equals(d02) ? K5((Integer[]) obj) : Long.TYPE.equals(d02) ? M5((Long[]) obj) : Short.TYPE.equals(d02) ? O5((Short[]) obj) : Double.TYPE.equals(d02) ? G5((Double[]) obj) : Float.TYPE.equals(d02) ? I5((Float[]) obj) : obj;
    }

    public static byte[] C(byte[] bArr, byte b5) {
        return bArr == null ? b(bArr, b5) : X0(0, bArr, b5);
    }

    public static int C0(boolean[] zArr, boolean z4, int i4) {
        if (p1(zArr)) {
            return -1;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        while (i4 < zArr.length) {
            if (z4 == zArr[i4]) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    public static boolean C1(char[] cArr, char[] cArr2) {
        return h0(cArr) == h0(cArr2);
    }

    public static Long[] C2(Long[] lArr) {
        return n1(lArr) ? f85964p : lArr;
    }

    public static <T> T[] C3(T[] tArr, Object obj) {
        int y02 = y0(tArr, obj, 0);
        return y02 == -1 ? (T[]) R(tArr) : (T[]) ((Object[]) J2(tArr, y02));
    }

    public static void C4(double[] dArr) {
        D4(dArr, new Random());
    }

    public static byte[] C5(Byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return f85951c;
        }
        byte[] bArr2 = new byte[bArr.length];
        for (int i4 = 0; i4 < bArr.length; i4++) {
            bArr2[i4] = bArr[i4].byteValue();
        }
        return bArr2;
    }

    public static char[] D(char[] cArr, char c5) {
        return cArr == null ? d(cArr, c5) : Y0(0, cArr, c5);
    }

    public static BitSet D0(byte[] bArr, byte b5) {
        return E0(bArr, b5, 0);
    }

    public static boolean D1(double[] dArr, double[] dArr2) {
        return h0(dArr) == h0(dArr2);
    }

    public static Object[] D2(Object[] objArr) {
        return n1(objArr) ? f85966r : objArr;
    }

    public static short[] D3(short[] sArr, short s4) {
        int A0 = A0(sArr, s4, 0);
        return A0 == -1 ? S(sArr) : (short[]) J2(sArr, A0);
    }

    public static void D4(double[] dArr, Random random) {
        for (int length = dArr.length; length > 1; length--) {
            e5(dArr, length - 1, random.nextInt(length), 1);
        }
    }

    public static byte[] D5(Byte[] bArr, byte b5) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return f85951c;
        }
        byte[] bArr2 = new byte[bArr.length];
        for (int i4 = 0; i4 < bArr.length; i4++) {
            Byte b6 = bArr[i4];
            bArr2[i4] = b6 == null ? b5 : b6.byteValue();
        }
        return bArr2;
    }

    public static double[] E(double[] dArr, double d5) {
        return dArr == null ? f(dArr, d5) : Z0(0, dArr, d5);
    }

    public static BitSet E0(byte[] bArr, byte b5, int i4) {
        int k02;
        BitSet bitSet = new BitSet();
        if (bArr == null) {
            return bitSet;
        }
        while (i4 < bArr.length && (k02 = k0(bArr, b5, i4)) != -1) {
            bitSet.set(k02);
            i4 = k02 + 1;
        }
        return bitSet;
    }

    public static boolean E1(float[] fArr, float[] fArr2) {
        return h0(fArr) == h0(fArr2);
    }

    public static <T> T[] E2(T[] tArr, Class<T[]> cls) {
        if (cls != null) {
            return tArr == null ? cls.cast(Array.newInstance(cls.getComponentType(), 0)) : tArr;
        }
        throw new IllegalArgumentException("The type must not be null");
    }

    public static boolean[] E3(boolean[] zArr, boolean z4) {
        int C0 = C0(zArr, z4, 0);
        return C0 == -1 ? T(zArr) : (boolean[]) J2(zArr, C0);
    }

    public static void E4(float[] fArr) {
        F4(fArr, new Random());
    }

    public static char[] E5(Character[] chArr) {
        if (chArr == null) {
            return null;
        }
        if (chArr.length == 0) {
            return f85953e;
        }
        char[] cArr = new char[chArr.length];
        for (int i4 = 0; i4 < chArr.length; i4++) {
            cArr[i4] = chArr[i4].charValue();
        }
        return cArr;
    }

    public static float[] F(float[] fArr, float f4) {
        return fArr == null ? h(fArr, f4) : a1(0, fArr, f4);
    }

    public static BitSet F0(char[] cArr, char c5) {
        return G0(cArr, c5, 0);
    }

    public static boolean F1(int[] iArr, int[] iArr2) {
        return h0(iArr) == h0(iArr2);
    }

    public static Short[] F2(Short[] shArr) {
        return n1(shArr) ? f85968t : shArr;
    }

    public static byte[] F3(byte[] bArr, byte... bArr2) {
        if (h1(bArr) || h1(bArr2)) {
            return L(bArr);
        }
        HashMap hashMap = new HashMap(bArr2.length);
        for (byte b5 : bArr2) {
            Byte valueOf = Byte.valueOf(b5);
            ze.f fVar = (ze.f) hashMap.get(valueOf);
            if (fVar == null) {
                hashMap.put(valueOf, new ze.f(1));
            } else {
                fVar.m();
            }
        }
        BitSet bitSet = new BitSet();
        for (int i4 = 0; i4 < bArr.length; i4++) {
            byte b6 = bArr[i4];
            ze.f fVar2 = (ze.f) hashMap.get(Byte.valueOf(b6));
            if (fVar2 != null) {
                if (fVar2.g() == 0) {
                    hashMap.remove(Byte.valueOf(b6));
                }
                bitSet.set(i4);
            }
        }
        return (byte[]) T2(bArr, bitSet);
    }

    public static void F4(float[] fArr, Random random) {
        for (int length = fArr.length; length > 1; length--) {
            g5(fArr, length - 1, random.nextInt(length), 1);
        }
    }

    public static char[] F5(Character[] chArr, char c5) {
        if (chArr == null) {
            return null;
        }
        if (chArr.length == 0) {
            return f85953e;
        }
        char[] cArr = new char[chArr.length];
        for (int i4 = 0; i4 < chArr.length; i4++) {
            Character ch = chArr[i4];
            cArr[i4] = ch == null ? c5 : ch.charValue();
        }
        return cArr;
    }

    public static int[] G(int[] iArr, int i4) {
        return iArr == null ? j(iArr, i4) : b1(0, iArr, i4);
    }

    public static BitSet G0(char[] cArr, char c5, int i4) {
        int m02;
        BitSet bitSet = new BitSet();
        if (cArr == null) {
            return bitSet;
        }
        while (i4 < cArr.length && (m02 = m0(cArr, c5, i4)) != -1) {
            bitSet.set(m02);
            i4 = m02 + 1;
        }
        return bitSet;
    }

    public static boolean G1(long[] jArr, long[] jArr2) {
        return h0(jArr) == h0(jArr2);
    }

    public static String[] G2(String[] strArr) {
        return n1(strArr) ? f85969u : strArr;
    }

    public static char[] G3(char[] cArr, char... cArr2) {
        if (i1(cArr) || i1(cArr2)) {
            return M(cArr);
        }
        HashMap hashMap = new HashMap(cArr2.length);
        for (char c5 : cArr2) {
            Character valueOf = Character.valueOf(c5);
            ze.f fVar = (ze.f) hashMap.get(valueOf);
            if (fVar == null) {
                hashMap.put(valueOf, new ze.f(1));
            } else {
                fVar.m();
            }
        }
        BitSet bitSet = new BitSet();
        for (int i4 = 0; i4 < cArr.length; i4++) {
            char c6 = cArr[i4];
            ze.f fVar2 = (ze.f) hashMap.get(Character.valueOf(c6));
            if (fVar2 != null) {
                if (fVar2.g() == 0) {
                    hashMap.remove(Character.valueOf(c6));
                }
                bitSet.set(i4);
            }
        }
        return (char[]) T2(cArr, bitSet);
    }

    public static void G4(int[] iArr) {
        H4(iArr, new Random());
    }

    public static double[] G5(Double[] dArr) {
        if (dArr == null) {
            return null;
        }
        if (dArr.length == 0) {
            return f85956h;
        }
        double[] dArr2 = new double[dArr.length];
        for (int i4 = 0; i4 < dArr.length; i4++) {
            dArr2[i4] = dArr[i4].doubleValue();
        }
        return dArr2;
    }

    public static long[] H(long[] jArr, long j4) {
        return jArr == null ? m(jArr, j4) : c1(0, jArr, j4);
    }

    public static BitSet H0(double[] dArr, double d5) {
        return J0(dArr, d5, 0);
    }

    public static boolean H1(Object[] objArr, Object[] objArr2) {
        return h0(objArr) == h0(objArr2);
    }

    public static short[] H2(short[] sArr) {
        return o1(sArr) ? f85967s : sArr;
    }

    public static double[] H3(double[] dArr, double... dArr2) {
        if (j1(dArr) || j1(dArr2)) {
            return N(dArr);
        }
        HashMap hashMap = new HashMap(dArr2.length);
        for (double d5 : dArr2) {
            Double valueOf = Double.valueOf(d5);
            ze.f fVar = (ze.f) hashMap.get(valueOf);
            if (fVar == null) {
                hashMap.put(valueOf, new ze.f(1));
            } else {
                fVar.m();
            }
        }
        BitSet bitSet = new BitSet();
        for (int i4 = 0; i4 < dArr.length; i4++) {
            double d6 = dArr[i4];
            ze.f fVar2 = (ze.f) hashMap.get(Double.valueOf(d6));
            if (fVar2 != null) {
                if (fVar2.g() == 0) {
                    hashMap.remove(Double.valueOf(d6));
                }
                bitSet.set(i4);
            }
        }
        return (double[]) T2(dArr, bitSet);
    }

    public static void H4(int[] iArr, Random random) {
        for (int length = iArr.length; length > 1; length--) {
            i5(iArr, length - 1, random.nextInt(length), 1);
        }
    }

    public static double[] H5(Double[] dArr, double d5) {
        if (dArr == null) {
            return null;
        }
        if (dArr.length == 0) {
            return f85956h;
        }
        double[] dArr2 = new double[dArr.length];
        for (int i4 = 0; i4 < dArr.length; i4++) {
            Double d6 = dArr[i4];
            dArr2[i4] = d6 == null ? d5 : d6.doubleValue();
        }
        return dArr2;
    }

    public static <T> T[] I(T[] tArr, T t4) {
        return tArr == null ? (T[]) o(tArr, t4) : (T[]) d1(0, tArr, t4);
    }

    public static BitSet I0(double[] dArr, double d5, double d6) {
        return K0(dArr, d5, 0, d6);
    }

    public static boolean I1(short[] sArr, short[] sArr2) {
        return h0(sArr) == h0(sArr2);
    }

    public static boolean[] I2(boolean[] zArr) {
        return p1(zArr) ? f85949a : zArr;
    }

    public static float[] I3(float[] fArr, float... fArr2) {
        if (k1(fArr) || k1(fArr2)) {
            return O(fArr);
        }
        HashMap hashMap = new HashMap(fArr2.length);
        for (float f4 : fArr2) {
            Float valueOf = Float.valueOf(f4);
            ze.f fVar = (ze.f) hashMap.get(valueOf);
            if (fVar == null) {
                hashMap.put(valueOf, new ze.f(1));
            } else {
                fVar.m();
            }
        }
        BitSet bitSet = new BitSet();
        for (int i4 = 0; i4 < fArr.length; i4++) {
            float f5 = fArr[i4];
            ze.f fVar2 = (ze.f) hashMap.get(Float.valueOf(f5));
            if (fVar2 != null) {
                if (fVar2.g() == 0) {
                    hashMap.remove(Float.valueOf(f5));
                }
                bitSet.set(i4);
            }
        }
        return (float[]) T2(fArr, bitSet);
    }

    public static void I4(long[] jArr) {
        J4(jArr, new Random());
    }

    public static float[] I5(Float[] fArr) {
        if (fArr == null) {
            return null;
        }
        if (fArr.length == 0) {
            return f85959k;
        }
        float[] fArr2 = new float[fArr.length];
        for (int i4 = 0; i4 < fArr.length; i4++) {
            fArr2[i4] = fArr[i4].floatValue();
        }
        return fArr2;
    }

    public static short[] J(short[] sArr, short s4) {
        return sArr == null ? q(sArr, s4) : e1(0, sArr, s4);
    }

    public static BitSet J0(double[] dArr, double d5, int i4) {
        int p02;
        BitSet bitSet = new BitSet();
        if (dArr == null) {
            return bitSet;
        }
        while (i4 < dArr.length && (p02 = p0(dArr, d5, i4)) != -1) {
            bitSet.set(p02);
            i4 = p02 + 1;
        }
        return bitSet;
    }

    public static boolean J1(boolean[] zArr, boolean[] zArr2) {
        return h0(zArr) == h0(zArr2);
    }

    private static Object J2(Object obj, int i4) {
        int h02 = h0(obj);
        if (i4 < 0 || i4 >= h02) {
            throw new IndexOutOfBoundsException(androidx.compose.foundation.text.q.a("Index: ", i4, ", Length: ", h02));
        }
        int i5 = h02 - 1;
        Object newInstance = Array.newInstance(obj.getClass().getComponentType(), i5);
        System.arraycopy(obj, 0, newInstance, 0, i4);
        if (i4 < i5) {
            System.arraycopy(obj, i4 + 1, newInstance, i4, (h02 - i4) - 1);
        }
        return newInstance;
    }

    public static int[] J3(int[] iArr, int... iArr2) {
        if (l1(iArr) || l1(iArr2)) {
            return P(iArr);
        }
        HashMap hashMap = new HashMap(iArr2.length);
        for (int i4 : iArr2) {
            Integer valueOf = Integer.valueOf(i4);
            ze.f fVar = (ze.f) hashMap.get(valueOf);
            if (fVar == null) {
                hashMap.put(valueOf, new ze.f(1));
            } else {
                fVar.m();
            }
        }
        BitSet bitSet = new BitSet();
        for (int i5 = 0; i5 < iArr.length; i5++) {
            int i6 = iArr[i5];
            ze.f fVar2 = (ze.f) hashMap.get(Integer.valueOf(i6));
            if (fVar2 != null) {
                if (fVar2.g() == 0) {
                    hashMap.remove(Integer.valueOf(i6));
                }
                bitSet.set(i5);
            }
        }
        return (int[]) T2(iArr, bitSet);
    }

    public static void J4(long[] jArr, Random random) {
        for (int length = jArr.length; length > 1; length--) {
            k5(jArr, length - 1, random.nextInt(length), 1);
        }
    }

    public static float[] J5(Float[] fArr, float f4) {
        if (fArr == null) {
            return null;
        }
        if (fArr.length == 0) {
            return f85959k;
        }
        float[] fArr2 = new float[fArr.length];
        for (int i4 = 0; i4 < fArr.length; i4++) {
            Float f5 = fArr[i4];
            fArr2[i4] = f5 == null ? f4 : f5.floatValue();
        }
        return fArr2;
    }

    public static boolean[] K(boolean[] zArr, boolean z4) {
        return zArr == null ? s(zArr, z4) : f1(0, zArr, z4);
    }

    public static BitSet K0(double[] dArr, double d5, int i4, double d6) {
        int q02;
        BitSet bitSet = new BitSet();
        if (dArr == null) {
            return bitSet;
        }
        int i5 = i4;
        while (i5 < dArr.length && (q02 = q0(dArr, d5, i5, d6)) != -1) {
            bitSet.set(q02);
            i5 = q02 + 1;
        }
        return bitSet;
    }

    public static boolean K1(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            throw new IllegalArgumentException("The Array must not be null");
        }
        return obj.getClass().getName().equals(obj2.getClass().getName());
    }

    public static byte[] K2(byte[] bArr, int i4) {
        return (byte[]) J2(bArr, i4);
    }

    public static long[] K3(long[] jArr, long... jArr2) {
        if (m1(jArr) || m1(jArr2)) {
            return Q(jArr);
        }
        HashMap hashMap = new HashMap(jArr2.length);
        for (long j4 : jArr2) {
            Long valueOf = Long.valueOf(j4);
            ze.f fVar = (ze.f) hashMap.get(valueOf);
            if (fVar == null) {
                hashMap.put(valueOf, new ze.f(1));
            } else {
                fVar.m();
            }
        }
        BitSet bitSet = new BitSet();
        for (int i4 = 0; i4 < jArr.length; i4++) {
            long j5 = jArr[i4];
            ze.f fVar2 = (ze.f) hashMap.get(Long.valueOf(j5));
            if (fVar2 != null) {
                if (fVar2.g() == 0) {
                    hashMap.remove(Long.valueOf(j5));
                }
                bitSet.set(i4);
            }
        }
        return (long[]) T2(jArr, bitSet);
    }

    public static void K4(Object[] objArr) {
        L4(objArr, new Random());
    }

    public static int[] K5(Integer[] numArr) {
        if (numArr == null) {
            return null;
        }
        if (numArr.length == 0) {
            return f85961m;
        }
        int[] iArr = new int[numArr.length];
        for (int i4 = 0; i4 < numArr.length; i4++) {
            iArr[i4] = numArr[i4].intValue();
        }
        return iArr;
    }

    public static byte[] L(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    public static BitSet L0(float[] fArr, float f4) {
        return M0(fArr, f4, 0);
    }

    public static boolean L1(byte[] bArr) {
        if (bArr != null && bArr.length >= 2) {
            byte b5 = bArr[0];
            int length = bArr.length;
            int i4 = 1;
            while (i4 < length) {
                byte b6 = bArr[i4];
                if (ye.c.a(b5, b6) > 0) {
                    return false;
                }
                i4++;
                b5 = b6;
            }
        }
        return true;
    }

    public static char[] L2(char[] cArr, int i4) {
        return (char[]) J2(cArr, i4);
    }

    @SafeVarargs
    public static <T> T[] L3(T[] tArr, T... tArr2) {
        if (n1(tArr) || n1(tArr2)) {
            return (T[]) R(tArr);
        }
        HashMap hashMap = new HashMap(tArr2.length);
        for (T t4 : tArr2) {
            ze.f fVar = (ze.f) hashMap.get(t4);
            if (fVar == null) {
                hashMap.put(t4, new ze.f(1));
            } else {
                fVar.m();
            }
        }
        BitSet bitSet = new BitSet();
        for (int i4 = 0; i4 < tArr.length; i4++) {
            T t5 = tArr[i4];
            ze.f fVar2 = (ze.f) hashMap.get(t5);
            if (fVar2 != null) {
                if (fVar2.g() == 0) {
                    hashMap.remove(t5);
                }
                bitSet.set(i4);
            }
        }
        return (T[]) ((Object[]) T2(tArr, bitSet));
    }

    public static void L4(Object[] objArr, Random random) {
        for (int length = objArr.length; length > 1; length--) {
            m5(objArr, length - 1, random.nextInt(length), 1);
        }
    }

    public static int[] L5(Integer[] numArr, int i4) {
        if (numArr == null) {
            return null;
        }
        if (numArr.length == 0) {
            return f85961m;
        }
        int[] iArr = new int[numArr.length];
        for (int i5 = 0; i5 < numArr.length; i5++) {
            Integer num = numArr[i5];
            iArr[i5] = num == null ? i4 : num.intValue();
        }
        return iArr;
    }

    public static char[] M(char[] cArr) {
        if (cArr == null) {
            return null;
        }
        return (char[]) cArr.clone();
    }

    public static BitSet M0(float[] fArr, float f4, int i4) {
        int s02;
        BitSet bitSet = new BitSet();
        if (fArr == null) {
            return bitSet;
        }
        while (i4 < fArr.length && (s02 = s0(fArr, f4, i4)) != -1) {
            bitSet.set(s02);
            i4 = s02 + 1;
        }
        return bitSet;
    }

    public static boolean M1(char[] cArr) {
        if (cArr != null && cArr.length >= 2) {
            char c5 = cArr[0];
            int length = cArr.length;
            int i4 = 1;
            while (i4 < length) {
                char c6 = cArr[i4];
                if (m.a(c5, c6) > 0) {
                    return false;
                }
                i4++;
                c5 = c6;
            }
        }
        return true;
    }

    public static double[] M2(double[] dArr, int i4) {
        return (double[]) J2(dArr, i4);
    }

    public static short[] M3(short[] sArr, short... sArr2) {
        if (o1(sArr) || o1(sArr2)) {
            return S(sArr);
        }
        HashMap hashMap = new HashMap(sArr2.length);
        for (short s4 : sArr2) {
            Short valueOf = Short.valueOf(s4);
            ze.f fVar = (ze.f) hashMap.get(valueOf);
            if (fVar == null) {
                hashMap.put(valueOf, new ze.f(1));
            } else {
                fVar.m();
            }
        }
        BitSet bitSet = new BitSet();
        for (int i4 = 0; i4 < sArr.length; i4++) {
            short s5 = sArr[i4];
            ze.f fVar2 = (ze.f) hashMap.get(Short.valueOf(s5));
            if (fVar2 != null) {
                if (fVar2.g() == 0) {
                    hashMap.remove(Short.valueOf(s5));
                }
                bitSet.set(i4);
            }
        }
        return (short[]) T2(sArr, bitSet);
    }

    public static void M4(short[] sArr) {
        N4(sArr, new Random());
    }

    public static long[] M5(Long[] lArr) {
        if (lArr == null) {
            return null;
        }
        if (lArr.length == 0) {
            return f85963o;
        }
        long[] jArr = new long[lArr.length];
        for (int i4 = 0; i4 < lArr.length; i4++) {
            jArr[i4] = lArr[i4].longValue();
        }
        return jArr;
    }

    public static double[] N(double[] dArr) {
        if (dArr == null) {
            return null;
        }
        return (double[]) dArr.clone();
    }

    public static BitSet N0(int[] iArr, int i4) {
        return O0(iArr, i4, 0);
    }

    public static boolean N1(double[] dArr) {
        if (dArr != null && dArr.length >= 2) {
            double d5 = dArr[0];
            int length = dArr.length;
            int i4 = 1;
            while (i4 < length) {
                double d6 = dArr[i4];
                if (Double.compare(d5, d6) > 0) {
                    return false;
                }
                i4++;
                d5 = d6;
            }
        }
        return true;
    }

    public static float[] N2(float[] fArr, int i4) {
        return (float[]) J2(fArr, i4);
    }

    public static boolean[] N3(boolean[] zArr, boolean... zArr2) {
        if (p1(zArr) || p1(zArr2)) {
            return T(zArr);
        }
        HashMap hashMap = new HashMap(2);
        for (boolean z4 : zArr2) {
            Boolean valueOf = Boolean.valueOf(z4);
            ze.f fVar = (ze.f) hashMap.get(valueOf);
            if (fVar == null) {
                hashMap.put(valueOf, new ze.f(1));
            } else {
                fVar.m();
            }
        }
        BitSet bitSet = new BitSet();
        for (int i4 = 0; i4 < zArr.length; i4++) {
            boolean z5 = zArr[i4];
            ze.f fVar2 = (ze.f) hashMap.get(Boolean.valueOf(z5));
            if (fVar2 != null) {
                if (fVar2.g() == 0) {
                    hashMap.remove(Boolean.valueOf(z5));
                }
                bitSet.set(i4);
            }
        }
        return (boolean[]) T2(zArr, bitSet);
    }

    public static void N4(short[] sArr, Random random) {
        for (int length = sArr.length; length > 1; length--) {
            o5(sArr, length - 1, random.nextInt(length), 1);
        }
    }

    public static long[] N5(Long[] lArr, long j4) {
        if (lArr == null) {
            return null;
        }
        if (lArr.length == 0) {
            return f85963o;
        }
        long[] jArr = new long[lArr.length];
        for (int i4 = 0; i4 < lArr.length; i4++) {
            Long l4 = lArr[i4];
            jArr[i4] = l4 == null ? j4 : l4.longValue();
        }
        return jArr;
    }

    public static float[] O(float[] fArr) {
        if (fArr == null) {
            return null;
        }
        return (float[]) fArr.clone();
    }

    public static BitSet O0(int[] iArr, int i4, int i5) {
        int u02;
        BitSet bitSet = new BitSet();
        if (iArr == null) {
            return bitSet;
        }
        while (i5 < iArr.length && (u02 = u0(iArr, i4, i5)) != -1) {
            bitSet.set(u02);
            i5 = u02 + 1;
        }
        return bitSet;
    }

    public static boolean O1(float[] fArr) {
        if (fArr != null && fArr.length >= 2) {
            float f4 = fArr[0];
            int length = fArr.length;
            int i4 = 1;
            while (i4 < length) {
                float f5 = fArr[i4];
                if (Float.compare(f4, f5) > 0) {
                    return false;
                }
                i4++;
                f4 = f5;
            }
        }
        return true;
    }

    public static int[] O2(int[] iArr, int i4) {
        return (int[]) J2(iArr, i4);
    }

    public static void O3(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        P3(bArr, 0, bArr.length);
    }

    public static void O4(boolean[] zArr) {
        P4(zArr, new Random());
    }

    public static short[] O5(Short[] shArr) {
        if (shArr == null) {
            return null;
        }
        if (shArr.length == 0) {
            return f85967s;
        }
        short[] sArr = new short[shArr.length];
        for (int i4 = 0; i4 < shArr.length; i4++) {
            sArr[i4] = shArr[i4].shortValue();
        }
        return sArr;
    }

    public static int[] P(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        return (int[]) iArr.clone();
    }

    public static BitSet P0(long[] jArr, long j4) {
        return Q0(jArr, j4, 0);
    }

    public static boolean P1(int[] iArr) {
        if (iArr != null && iArr.length >= 2) {
            int i4 = iArr[0];
            int length = iArr.length;
            int i5 = 1;
            while (i5 < length) {
                int i6 = iArr[i5];
                if (ye.c.b(i4, i6) > 0) {
                    return false;
                }
                i5++;
                i4 = i6;
            }
        }
        return true;
    }

    public static long[] P2(long[] jArr, int i4) {
        return (long[]) J2(jArr, i4);
    }

    public static void P3(byte[] bArr, int i4, int i5) {
        if (bArr == null) {
            return;
        }
        int min = Math.min(bArr.length, i5) - 1;
        for (int max = Math.max(i4, 0); min > max; max++) {
            byte b5 = bArr[min];
            bArr[min] = bArr[max];
            bArr[max] = b5;
            min--;
        }
    }

    public static void P4(boolean[] zArr, Random random) {
        for (int length = zArr.length; length > 1; length--) {
            q5(zArr, length - 1, random.nextInt(length), 1);
        }
    }

    public static short[] P5(Short[] shArr, short s4) {
        if (shArr == null) {
            return null;
        }
        if (shArr.length == 0) {
            return f85967s;
        }
        short[] sArr = new short[shArr.length];
        for (int i4 = 0; i4 < shArr.length; i4++) {
            Short sh = shArr[i4];
            sArr[i4] = sh == null ? s4 : sh.shortValue();
        }
        return sArr;
    }

    public static long[] Q(long[] jArr) {
        if (jArr == null) {
            return null;
        }
        return (long[]) jArr.clone();
    }

    public static BitSet Q0(long[] jArr, long j4, int i4) {
        int w02;
        BitSet bitSet = new BitSet();
        if (jArr == null) {
            return bitSet;
        }
        while (i4 < jArr.length && (w02 = w0(jArr, j4, i4)) != -1) {
            bitSet.set(w02);
            i4 = w02 + 1;
        }
        return bitSet;
    }

    public static boolean Q1(long[] jArr) {
        if (jArr != null && jArr.length >= 2) {
            long j4 = jArr[0];
            int length = jArr.length;
            int i4 = 1;
            while (i4 < length) {
                long j5 = jArr[i4];
                if (ye.c.c(j4, j5) > 0) {
                    return false;
                }
                i4++;
                j4 = j5;
            }
        }
        return true;
    }

    public static <T> T[] Q2(T[] tArr, int i4) {
        return (T[]) ((Object[]) J2(tArr, i4));
    }

    public static void Q3(char[] cArr) {
        if (cArr == null) {
            return;
        }
        R3(cArr, 0, cArr.length);
    }

    public static byte[] Q4(byte[] bArr, int i4, int i5) {
        if (bArr == null) {
            return null;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        if (i5 > bArr.length) {
            i5 = bArr.length;
        }
        int i6 = i5 - i4;
        if (i6 <= 0) {
            return f85951c;
        }
        byte[] bArr2 = new byte[i6];
        System.arraycopy(bArr, i4, bArr2, 0, i6);
        return bArr2;
    }

    public static boolean[] Q5(Boolean[] boolArr) {
        if (boolArr == null) {
            return null;
        }
        if (boolArr.length == 0) {
            return f85949a;
        }
        boolean[] zArr = new boolean[boolArr.length];
        for (int i4 = 0; i4 < boolArr.length; i4++) {
            zArr[i4] = boolArr[i4].booleanValue();
        }
        return zArr;
    }

    public static <T> T[] R(T[] tArr) {
        if (tArr == null) {
            return null;
        }
        return (T[]) ((Object[]) tArr.clone());
    }

    public static BitSet R0(Object[] objArr, Object obj) {
        return S0(objArr, obj, 0);
    }

    public static <T extends Comparable<? super T>> boolean R1(T[] tArr) {
        return S1(tArr, new d());
    }

    public static short[] R2(short[] sArr, int i4) {
        return (short[]) J2(sArr, i4);
    }

    public static void R3(char[] cArr, int i4, int i5) {
        if (cArr == null) {
            return;
        }
        int min = Math.min(cArr.length, i5) - 1;
        for (int max = Math.max(i4, 0); min > max; max++) {
            char c5 = cArr[min];
            cArr[min] = cArr[max];
            cArr[max] = c5;
            min--;
        }
    }

    public static char[] R4(char[] cArr, int i4, int i5) {
        if (cArr == null) {
            return null;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        if (i5 > cArr.length) {
            i5 = cArr.length;
        }
        int i6 = i5 - i4;
        if (i6 <= 0) {
            return f85953e;
        }
        char[] cArr2 = new char[i6];
        System.arraycopy(cArr, i4, cArr2, 0, i6);
        return cArr2;
    }

    public static boolean[] R5(Boolean[] boolArr, boolean z4) {
        if (boolArr == null) {
            return null;
        }
        if (boolArr.length == 0) {
            return f85949a;
        }
        boolean[] zArr = new boolean[boolArr.length];
        for (int i4 = 0; i4 < boolArr.length; i4++) {
            Boolean bool = boolArr[i4];
            zArr[i4] = bool == null ? z4 : bool.booleanValue();
        }
        return zArr;
    }

    public static short[] S(short[] sArr) {
        if (sArr == null) {
            return null;
        }
        return (short[]) sArr.clone();
    }

    public static BitSet S0(Object[] objArr, Object obj, int i4) {
        int y02;
        BitSet bitSet = new BitSet();
        if (objArr == null) {
            return bitSet;
        }
        while (i4 < objArr.length && (y02 = y0(objArr, obj, i4)) != -1) {
            bitSet.set(y02);
            i4 = y02 + 1;
        }
        return bitSet;
    }

    public static <T> boolean S1(T[] tArr, Comparator<T> comparator) {
        if (comparator == null) {
            throw new IllegalArgumentException("Comparator should not be null.");
        }
        if (tArr != null && tArr.length >= 2) {
            T t4 = tArr[0];
            int length = tArr.length;
            int i4 = 1;
            while (i4 < length) {
                T t5 = tArr[i4];
                if (comparator.compare(t4, t5) > 0) {
                    return false;
                }
                i4++;
                t4 = t5;
            }
        }
        return true;
    }

    public static boolean[] S2(boolean[] zArr, int i4) {
        return (boolean[]) J2(zArr, i4);
    }

    public static void S3(double[] dArr) {
        if (dArr == null) {
            return;
        }
        T3(dArr, 0, dArr.length);
    }

    public static double[] S4(double[] dArr, int i4, int i5) {
        if (dArr == null) {
            return null;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        if (i5 > dArr.length) {
            i5 = dArr.length;
        }
        int i6 = i5 - i4;
        if (i6 <= 0) {
            return f85956h;
        }
        double[] dArr2 = new double[i6];
        System.arraycopy(dArr, i4, dArr2, 0, i6);
        return dArr2;
    }

    public static String S5(Object obj) {
        return T5(obj, "{}");
    }

    public static boolean[] T(boolean[] zArr) {
        if (zArr == null) {
            return null;
        }
        return (boolean[]) zArr.clone();
    }

    public static BitSet T0(short[] sArr, short s4) {
        return U0(sArr, s4, 0);
    }

    public static boolean T1(short[] sArr) {
        if (sArr != null && sArr.length >= 2) {
            short s4 = sArr[0];
            int length = sArr.length;
            int i4 = 1;
            while (i4 < length) {
                short s5 = sArr[i4];
                if (ye.c.d(s4, s5) > 0) {
                    return false;
                }
                i4++;
                s4 = s5;
            }
        }
        return true;
    }

    static Object T2(Object obj, BitSet bitSet) {
        if (obj == null) {
            return null;
        }
        int h02 = h0(obj);
        Object newInstance = Array.newInstance(obj.getClass().getComponentType(), h02 - bitSet.cardinality());
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int nextSetBit = bitSet.nextSetBit(i4);
            if (nextSetBit == -1) {
                break;
            }
            int i6 = nextSetBit - i4;
            if (i6 > 0) {
                System.arraycopy(obj, i4, newInstance, i5, i6);
                i5 += i6;
            }
            i4 = bitSet.nextClearBit(nextSetBit);
        }
        int i7 = h02 - i4;
        if (i7 > 0) {
            System.arraycopy(obj, i4, newInstance, i5, i7);
        }
        return newInstance;
    }

    public static void T3(double[] dArr, int i4, int i5) {
        if (dArr == null) {
            return;
        }
        int min = Math.min(dArr.length, i5) - 1;
        for (int max = Math.max(i4, 0); min > max; max++) {
            double d5 = dArr[min];
            dArr[min] = dArr[max];
            dArr[max] = d5;
            min--;
        }
    }

    public static float[] T4(float[] fArr, int i4, int i5) {
        if (fArr == null) {
            return null;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        if (i5 > fArr.length) {
            i5 = fArr.length;
        }
        int i6 = i5 - i4;
        if (i6 <= 0) {
            return f85959k;
        }
        float[] fArr2 = new float[i6];
        System.arraycopy(fArr, i4, fArr2, 0, i6);
        return fArr2;
    }

    public static String T5(Object obj, String str) {
        return obj == null ? str : new org.apache.commons.lang3.builder.r(obj, org.apache.commons.lang3.builder.t.A, null).h(obj).toString();
    }

    public static boolean U(byte[] bArr, byte b5) {
        return k0(bArr, b5, 0) != -1;
    }

    public static BitSet U0(short[] sArr, short s4, int i4) {
        int A0;
        BitSet bitSet = new BitSet();
        if (sArr == null) {
            return bitSet;
        }
        while (i4 < sArr.length && (A0 = A0(sArr, s4, i4)) != -1) {
            bitSet.set(A0);
            i4 = A0 + 1;
        }
        return bitSet;
    }

    public static boolean U1(boolean[] zArr) {
        if (zArr != null && zArr.length >= 2) {
            boolean z4 = zArr[0];
            int length = zArr.length;
            int i4 = 1;
            while (i4 < length) {
                boolean z5 = zArr[i4];
                if (g.c(z4, z5) > 0) {
                    return false;
                }
                i4++;
                z4 = z5;
            }
        }
        return true;
    }

    static Object U2(Object obj, int... iArr) {
        int i4;
        int i5;
        int h02 = h0(obj);
        int[] P = P(iArr);
        Arrays.sort(P);
        if (v1(P)) {
            int length = P.length;
            int i6 = h02;
            i4 = 0;
            while (true) {
                length--;
                if (length < 0) {
                    break;
                }
                i5 = P[length];
                if (i5 < 0 || i5 >= h02) {
                    break;
                }
                if (i5 < i6) {
                    i4++;
                    i6 = i5;
                }
            }
            throw new IndexOutOfBoundsException(androidx.compose.foundation.text.q.a("Index: ", i5, ", Length: ", h02));
        }
        i4 = 0;
        int i7 = h02 - i4;
        Object newInstance = Array.newInstance(obj.getClass().getComponentType(), i7);
        if (i4 < h02) {
            int length2 = P.length - 1;
            while (length2 >= 0) {
                int i10 = P[length2];
                int i11 = h02 - i10;
                if (i11 > 1) {
                    int i12 = i11 - 1;
                    i7 -= i12;
                    System.arraycopy(obj, i10 + 1, newInstance, i7, i12);
                }
                length2--;
                h02 = i10;
            }
            if (h02 > 0) {
                System.arraycopy(obj, 0, newInstance, 0, h02);
            }
        }
        return newInstance;
    }

    public static void U3(float[] fArr) {
        if (fArr == null) {
            return;
        }
        V3(fArr, 0, fArr.length);
    }

    public static int[] U4(int[] iArr, int i4, int i5) {
        if (iArr == null) {
            return null;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        if (i5 > iArr.length) {
            i5 = iArr.length;
        }
        int i6 = i5 - i4;
        if (i6 <= 0) {
            return f85961m;
        }
        int[] iArr2 = new int[i6];
        System.arraycopy(iArr, i4, iArr2, 0, i6);
        return iArr2;
    }

    public static String[] U5(Object[] objArr) {
        if (objArr == null) {
            return null;
        }
        if (objArr.length == 0) {
            return f85969u;
        }
        String[] strArr = new String[objArr.length];
        for (int i4 = 0; i4 < objArr.length; i4++) {
            strArr[i4] = objArr[i4].toString();
        }
        return strArr;
    }

    public static boolean V(char[] cArr, char c5) {
        return m0(cArr, c5, 0) != -1;
    }

    public static BitSet V0(boolean[] zArr, boolean z4) {
        return W0(zArr, z4, 0);
    }

    public static int V1(byte[] bArr, byte b5) {
        return W1(bArr, b5, Integer.MAX_VALUE);
    }

    public static byte[] V2(byte[] bArr, int... iArr) {
        return (byte[]) U2(bArr, iArr);
    }

    public static void V3(float[] fArr, int i4, int i5) {
        if (fArr == null) {
            return;
        }
        int min = Math.min(fArr.length, i5) - 1;
        for (int max = Math.max(i4, 0); min > max; max++) {
            float f4 = fArr[min];
            fArr[min] = fArr[max];
            fArr[max] = f4;
            min--;
        }
    }

    public static long[] V4(long[] jArr, int i4, int i5) {
        if (jArr == null) {
            return null;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        if (i5 > jArr.length) {
            i5 = jArr.length;
        }
        int i6 = i5 - i4;
        if (i6 <= 0) {
            return f85963o;
        }
        long[] jArr2 = new long[i6];
        System.arraycopy(jArr, i4, jArr2, 0, i6);
        return jArr2;
    }

    public static String[] V5(Object[] objArr, String str) {
        if (objArr == null) {
            return null;
        }
        if (objArr.length == 0) {
            return f85969u;
        }
        String[] strArr = new String[objArr.length];
        for (int i4 = 0; i4 < objArr.length; i4++) {
            Object obj = objArr[i4];
            strArr[i4] = obj == null ? str : obj.toString();
        }
        return strArr;
    }

    public static boolean W(double[] dArr, double d5) {
        return p0(dArr, d5, 0) != -1;
    }

    public static BitSet W0(boolean[] zArr, boolean z4, int i4) {
        int C0;
        BitSet bitSet = new BitSet();
        if (zArr == null) {
            return bitSet;
        }
        while (i4 < zArr.length && (C0 = C0(zArr, z4, i4)) != -1) {
            bitSet.set(C0);
            i4 = C0 + 1;
        }
        return bitSet;
    }

    public static int W1(byte[] bArr, byte b5, int i4) {
        if (bArr == null || i4 < 0) {
            return -1;
        }
        if (i4 >= bArr.length) {
            i4 = bArr.length - 1;
        }
        while (i4 >= 0) {
            if (b5 == bArr[i4]) {
                return i4;
            }
            i4--;
        }
        return -1;
    }

    public static char[] W2(char[] cArr, int... iArr) {
        return (char[]) U2(cArr, iArr);
    }

    public static void W3(int[] iArr) {
        if (iArr == null) {
            return;
        }
        X3(iArr, 0, iArr.length);
    }

    public static <T> T[] W4(T[] tArr, int i4, int i5) {
        if (tArr == null) {
            return null;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        if (i5 > tArr.length) {
            i5 = tArr.length;
        }
        int i6 = i5 - i4;
        Class<?> componentType = tArr.getClass().getComponentType();
        if (i6 <= 0) {
            return (T[]) ((Object[]) Array.newInstance(componentType, 0));
        }
        T[] tArr2 = (T[]) ((Object[]) Array.newInstance(componentType, i6));
        System.arraycopy(tArr, i4, tArr2, 0, i6);
        return tArr2;
    }

    public static boolean X(double[] dArr, double d5, double d6) {
        return q0(dArr, d5, 0, d6) != -1;
    }

    public static byte[] X0(int i4, byte[] bArr, byte... bArr2) {
        if (bArr == null) {
            return null;
        }
        if (h1(bArr2)) {
            return L(bArr);
        }
        if (i4 < 0 || i4 > bArr.length) {
            StringBuilder a5 = androidx.collection.s.a("Index: ", i4, ", Length: ");
            a5.append(bArr.length);
            throw new IndexOutOfBoundsException(a5.toString());
        }
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr2, 0, bArr3, i4, bArr2.length);
        if (i4 > 0) {
            System.arraycopy(bArr, 0, bArr3, 0, i4);
        }
        if (i4 < bArr.length) {
            System.arraycopy(bArr, i4, bArr3, bArr2.length + i4, bArr.length - i4);
        }
        return bArr3;
    }

    public static int X1(char[] cArr, char c5) {
        return Y1(cArr, c5, Integer.MAX_VALUE);
    }

    public static double[] X2(double[] dArr, int... iArr) {
        return (double[]) U2(dArr, iArr);
    }

    public static void X3(int[] iArr, int i4, int i5) {
        if (iArr == null) {
            return;
        }
        int min = Math.min(iArr.length, i5) - 1;
        for (int max = Math.max(i4, 0); min > max; max++) {
            int i6 = iArr[min];
            iArr[min] = iArr[max];
            iArr[max] = i6;
            min--;
        }
    }

    public static short[] X4(short[] sArr, int i4, int i5) {
        if (sArr == null) {
            return null;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        if (i5 > sArr.length) {
            i5 = sArr.length;
        }
        int i6 = i5 - i4;
        if (i6 <= 0) {
            return f85967s;
        }
        short[] sArr2 = new short[i6];
        System.arraycopy(sArr, i4, sArr2, 0, i6);
        return sArr2;
    }

    public static boolean Y(float[] fArr, float f4) {
        return s0(fArr, f4, 0) != -1;
    }

    public static char[] Y0(int i4, char[] cArr, char... cArr2) {
        if (cArr == null) {
            return null;
        }
        if (i1(cArr2)) {
            return M(cArr);
        }
        if (i4 < 0 || i4 > cArr.length) {
            StringBuilder a5 = androidx.collection.s.a("Index: ", i4, ", Length: ");
            a5.append(cArr.length);
            throw new IndexOutOfBoundsException(a5.toString());
        }
        char[] cArr3 = new char[cArr.length + cArr2.length];
        System.arraycopy(cArr2, 0, cArr3, i4, cArr2.length);
        if (i4 > 0) {
            System.arraycopy(cArr, 0, cArr3, 0, i4);
        }
        if (i4 < cArr.length) {
            System.arraycopy(cArr, i4, cArr3, cArr2.length + i4, cArr.length - i4);
        }
        return cArr3;
    }

    public static int Y1(char[] cArr, char c5, int i4) {
        if (cArr == null || i4 < 0) {
            return -1;
        }
        if (i4 >= cArr.length) {
            i4 = cArr.length - 1;
        }
        while (i4 >= 0) {
            if (c5 == cArr[i4]) {
                return i4;
            }
            i4--;
        }
        return -1;
    }

    public static float[] Y2(float[] fArr, int... iArr) {
        return (float[]) U2(fArr, iArr);
    }

    public static void Y3(long[] jArr) {
        if (jArr == null) {
            return;
        }
        Z3(jArr, 0, jArr.length);
    }

    public static boolean[] Y4(boolean[] zArr, int i4, int i5) {
        if (zArr == null) {
            return null;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        if (i5 > zArr.length) {
            i5 = zArr.length;
        }
        int i6 = i5 - i4;
        if (i6 <= 0) {
            return f85949a;
        }
        boolean[] zArr2 = new boolean[i6];
        System.arraycopy(zArr, i4, zArr2, 0, i6);
        return zArr2;
    }

    public static boolean Z(int[] iArr, int i4) {
        return u0(iArr, i4, 0) != -1;
    }

    public static double[] Z0(int i4, double[] dArr, double... dArr2) {
        if (dArr == null) {
            return null;
        }
        if (j1(dArr2)) {
            return N(dArr);
        }
        if (i4 < 0 || i4 > dArr.length) {
            StringBuilder a5 = androidx.collection.s.a("Index: ", i4, ", Length: ");
            a5.append(dArr.length);
            throw new IndexOutOfBoundsException(a5.toString());
        }
        double[] dArr3 = new double[dArr.length + dArr2.length];
        System.arraycopy(dArr2, 0, dArr3, i4, dArr2.length);
        if (i4 > 0) {
            System.arraycopy(dArr, 0, dArr3, 0, i4);
        }
        if (i4 < dArr.length) {
            System.arraycopy(dArr, i4, dArr3, dArr2.length + i4, dArr.length - i4);
        }
        return dArr3;
    }

    public static int Z1(double[] dArr, double d5) {
        return b2(dArr, d5, Integer.MAX_VALUE);
    }

    public static int[] Z2(int[] iArr, int... iArr2) {
        return (int[]) U2(iArr, iArr2);
    }

    public static void Z3(long[] jArr, int i4, int i5) {
        if (jArr == null) {
            return;
        }
        int min = Math.min(jArr.length, i5) - 1;
        for (int max = Math.max(i4, 0); min > max; max++) {
            long j4 = jArr[min];
            jArr[min] = jArr[max];
            jArr[max] = j4;
            min--;
        }
    }

    public static void Z4(byte[] bArr, int i4, int i5) {
        if (h1(bArr)) {
            return;
        }
        a5(bArr, i4, i5, 1);
    }

    private static Object a(Object obj, int i4, Object obj2, Class<?> cls) {
        if (obj == null) {
            if (i4 != 0) {
                throw new IndexOutOfBoundsException(r2.a("Index: ", i4, ", Length: 0"));
            }
            Object newInstance = Array.newInstance(cls, 1);
            Array.set(newInstance, 0, obj2);
            return newInstance;
        }
        int length = Array.getLength(obj);
        if (i4 > length || i4 < 0) {
            throw new IndexOutOfBoundsException(androidx.compose.foundation.text.q.a("Index: ", i4, ", Length: ", length));
        }
        Object newInstance2 = Array.newInstance(cls, length + 1);
        System.arraycopy(obj, 0, newInstance2, 0, i4);
        Array.set(newInstance2, i4, obj2);
        if (i4 < length) {
            System.arraycopy(obj, i4, newInstance2, i4 + 1, length - i4);
        }
        return newInstance2;
    }

    public static boolean a0(long[] jArr, long j4) {
        return w0(jArr, j4, 0) != -1;
    }

    public static float[] a1(int i4, float[] fArr, float... fArr2) {
        if (fArr == null) {
            return null;
        }
        if (k1(fArr2)) {
            return O(fArr);
        }
        if (i4 < 0 || i4 > fArr.length) {
            StringBuilder a5 = androidx.collection.s.a("Index: ", i4, ", Length: ");
            a5.append(fArr.length);
            throw new IndexOutOfBoundsException(a5.toString());
        }
        float[] fArr3 = new float[fArr.length + fArr2.length];
        System.arraycopy(fArr2, 0, fArr3, i4, fArr2.length);
        if (i4 > 0) {
            System.arraycopy(fArr, 0, fArr3, 0, i4);
        }
        if (i4 < fArr.length) {
            System.arraycopy(fArr, i4, fArr3, fArr2.length + i4, fArr.length - i4);
        }
        return fArr3;
    }

    public static int a2(double[] dArr, double d5, double d6) {
        return c2(dArr, d5, Integer.MAX_VALUE, d6);
    }

    public static long[] a3(long[] jArr, int... iArr) {
        return (long[]) U2(jArr, iArr);
    }

    public static void a4(Object[] objArr) {
        if (objArr == null) {
            return;
        }
        b4(objArr, 0, objArr.length);
    }

    public static void a5(byte[] bArr, int i4, int i5, int i6) {
        if (h1(bArr) || i4 >= bArr.length || i5 >= bArr.length) {
            return;
        }
        int i7 = 0;
        if (i4 < 0) {
            i4 = 0;
        }
        if (i5 < 0) {
            i5 = 0;
        }
        int min = Math.min(Math.min(i6, bArr.length - i4), bArr.length - i5);
        while (i7 < min) {
            byte b5 = bArr[i4];
            bArr[i4] = bArr[i5];
            bArr[i5] = b5;
            i7++;
            i4++;
            i5++;
        }
    }

    public static byte[] b(byte[] bArr, byte b5) {
        byte[] bArr2 = (byte[]) e0(bArr, Byte.TYPE);
        bArr2[bArr2.length - 1] = b5;
        return bArr2;
    }

    public static boolean b0(Object[] objArr, Object obj) {
        return y0(objArr, obj, 0) != -1;
    }

    public static int[] b1(int i4, int[] iArr, int... iArr2) {
        if (iArr == null) {
            return null;
        }
        if (l1(iArr2)) {
            return P(iArr);
        }
        if (i4 < 0 || i4 > iArr.length) {
            StringBuilder a5 = androidx.collection.s.a("Index: ", i4, ", Length: ");
            a5.append(iArr.length);
            throw new IndexOutOfBoundsException(a5.toString());
        }
        int[] iArr3 = new int[iArr.length + iArr2.length];
        System.arraycopy(iArr2, 0, iArr3, i4, iArr2.length);
        if (i4 > 0) {
            System.arraycopy(iArr, 0, iArr3, 0, i4);
        }
        if (i4 < iArr.length) {
            System.arraycopy(iArr, i4, iArr3, iArr2.length + i4, iArr.length - i4);
        }
        return iArr3;
    }

    public static int b2(double[] dArr, double d5, int i4) {
        if (j1(dArr) || i4 < 0) {
            return -1;
        }
        if (i4 >= dArr.length) {
            i4 = dArr.length - 1;
        }
        while (i4 >= 0) {
            if (d5 == dArr[i4]) {
                return i4;
            }
            i4--;
        }
        return -1;
    }

    public static <T> T[] b3(T[] tArr, int... iArr) {
        return (T[]) ((Object[]) U2(tArr, iArr));
    }

    public static void b4(Object[] objArr, int i4, int i5) {
        if (objArr == null) {
            return;
        }
        int min = Math.min(objArr.length, i5) - 1;
        for (int max = Math.max(i4, 0); min > max; max++) {
            Object obj = objArr[min];
            objArr[min] = objArr[max];
            objArr[max] = obj;
            min--;
        }
    }

    public static void b5(char[] cArr, int i4, int i5) {
        if (i1(cArr)) {
            return;
        }
        c5(cArr, i4, i5, 1);
    }

    @Deprecated
    public static byte[] c(byte[] bArr, int i4, byte b5) {
        return (byte[]) a(bArr, i4, Byte.valueOf(b5), Byte.TYPE);
    }

    public static boolean c0(short[] sArr, short s4) {
        return A0(sArr, s4, 0) != -1;
    }

    public static long[] c1(int i4, long[] jArr, long... jArr2) {
        if (jArr == null) {
            return null;
        }
        if (m1(jArr2)) {
            return Q(jArr);
        }
        if (i4 < 0 || i4 > jArr.length) {
            StringBuilder a5 = androidx.collection.s.a("Index: ", i4, ", Length: ");
            a5.append(jArr.length);
            throw new IndexOutOfBoundsException(a5.toString());
        }
        long[] jArr3 = new long[jArr.length + jArr2.length];
        System.arraycopy(jArr2, 0, jArr3, i4, jArr2.length);
        if (i4 > 0) {
            System.arraycopy(jArr, 0, jArr3, 0, i4);
        }
        if (i4 < jArr.length) {
            System.arraycopy(jArr, i4, jArr3, jArr2.length + i4, jArr.length - i4);
        }
        return jArr3;
    }

    public static int c2(double[] dArr, double d5, int i4, double d6) {
        if (j1(dArr) || i4 < 0) {
            return -1;
        }
        if (i4 >= dArr.length) {
            i4 = dArr.length - 1;
        }
        double d7 = d5 - d6;
        double d10 = d5 + d6;
        while (i4 >= 0) {
            double d11 = dArr[i4];
            if (d11 >= d7 && d11 <= d10) {
                return i4;
            }
            i4--;
        }
        return -1;
    }

    public static short[] c3(short[] sArr, int... iArr) {
        return (short[]) U2(sArr, iArr);
    }

    public static void c4(short[] sArr) {
        if (sArr == null) {
            return;
        }
        d4(sArr, 0, sArr.length);
    }

    public static void c5(char[] cArr, int i4, int i5, int i6) {
        if (i1(cArr) || i4 >= cArr.length || i5 >= cArr.length) {
            return;
        }
        int i7 = 0;
        if (i4 < 0) {
            i4 = 0;
        }
        if (i5 < 0) {
            i5 = 0;
        }
        int min = Math.min(Math.min(i6, cArr.length - i4), cArr.length - i5);
        while (i7 < min) {
            char c5 = cArr[i4];
            cArr[i4] = cArr[i5];
            cArr[i5] = c5;
            i7++;
            i4++;
            i5++;
        }
    }

    public static char[] d(char[] cArr, char c5) {
        char[] cArr2 = (char[]) e0(cArr, Character.TYPE);
        cArr2[cArr2.length - 1] = c5;
        return cArr2;
    }

    public static boolean d0(boolean[] zArr, boolean z4) {
        return C0(zArr, z4, 0) != -1;
    }

    @SafeVarargs
    public static <T> T[] d1(int i4, T[] tArr, T... tArr2) {
        if (tArr == null) {
            return null;
        }
        if (n1(tArr2)) {
            return (T[]) R(tArr);
        }
        if (i4 < 0 || i4 > tArr.length) {
            StringBuilder a5 = androidx.collection.s.a("Index: ", i4, ", Length: ");
            a5.append(tArr.length);
            throw new IndexOutOfBoundsException(a5.toString());
        }
        T[] tArr3 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), tArr.length + tArr2.length));
        System.arraycopy(tArr2, 0, tArr3, i4, tArr2.length);
        if (i4 > 0) {
            System.arraycopy(tArr, 0, tArr3, 0, i4);
        }
        if (i4 < tArr.length) {
            System.arraycopy(tArr, i4, tArr3, tArr2.length + i4, tArr.length - i4);
        }
        return tArr3;
    }

    public static int d2(float[] fArr, float f4) {
        return e2(fArr, f4, Integer.MAX_VALUE);
    }

    public static boolean[] d3(boolean[] zArr, int... iArr) {
        return (boolean[]) U2(zArr, iArr);
    }

    public static void d4(short[] sArr, int i4, int i5) {
        if (sArr == null) {
            return;
        }
        int min = Math.min(sArr.length, i5) - 1;
        for (int max = Math.max(i4, 0); min > max; max++) {
            short s4 = sArr[min];
            sArr[min] = sArr[max];
            sArr[max] = s4;
            min--;
        }
    }

    public static void d5(double[] dArr, int i4, int i5) {
        if (j1(dArr)) {
            return;
        }
        e5(dArr, i4, i5, 1);
    }

    @Deprecated
    public static char[] e(char[] cArr, int i4, char c5) {
        return (char[]) a(cArr, i4, Character.valueOf(c5), Character.TYPE);
    }

    private static Object e0(Object obj, Class<?> cls) {
        if (obj == null) {
            return Array.newInstance(cls, 1);
        }
        int length = Array.getLength(obj);
        Object newInstance = Array.newInstance(obj.getClass().getComponentType(), length + 1);
        System.arraycopy(obj, 0, newInstance, 0, length);
        return newInstance;
    }

    public static short[] e1(int i4, short[] sArr, short... sArr2) {
        if (sArr == null) {
            return null;
        }
        if (o1(sArr2)) {
            return S(sArr);
        }
        if (i4 < 0 || i4 > sArr.length) {
            StringBuilder a5 = androidx.collection.s.a("Index: ", i4, ", Length: ");
            a5.append(sArr.length);
            throw new IndexOutOfBoundsException(a5.toString());
        }
        short[] sArr3 = new short[sArr.length + sArr2.length];
        System.arraycopy(sArr2, 0, sArr3, i4, sArr2.length);
        if (i4 > 0) {
            System.arraycopy(sArr, 0, sArr3, 0, i4);
        }
        if (i4 < sArr.length) {
            System.arraycopy(sArr, i4, sArr3, sArr2.length + i4, sArr.length - i4);
        }
        return sArr3;
    }

    public static int e2(float[] fArr, float f4, int i4) {
        if (k1(fArr) || i4 < 0) {
            return -1;
        }
        if (i4 >= fArr.length) {
            i4 = fArr.length - 1;
        }
        while (i4 >= 0) {
            if (f4 == fArr[i4]) {
                return i4;
            }
            i4--;
        }
        return -1;
    }

    @Deprecated
    public static byte[] e3(byte[] bArr, byte b5) {
        return (byte[]) T2(bArr, E0(bArr, b5, 0));
    }

    public static void e4(boolean[] zArr) {
        if (zArr == null) {
            return;
        }
        f4(zArr, 0, zArr.length);
    }

    public static void e5(double[] dArr, int i4, int i5, int i6) {
        if (j1(dArr) || i4 >= dArr.length || i5 >= dArr.length) {
            return;
        }
        int i7 = 0;
        if (i4 < 0) {
            i4 = 0;
        }
        if (i5 < 0) {
            i5 = 0;
        }
        int min = Math.min(Math.min(i6, dArr.length - i4), dArr.length - i5);
        while (i7 < min) {
            double d5 = dArr[i4];
            dArr[i4] = dArr[i5];
            dArr[i5] = d5;
            i7++;
            i4++;
            i5++;
        }
    }

    public static double[] f(double[] dArr, double d5) {
        double[] dArr2 = (double[]) e0(dArr, Double.TYPE);
        dArr2[dArr2.length - 1] = d5;
        return dArr2;
    }

    public static <T> T f0(T[] tArr, int i4) {
        return (T) g0(tArr, i4, null);
    }

    public static boolean[] f1(int i4, boolean[] zArr, boolean... zArr2) {
        if (zArr == null) {
            return null;
        }
        if (p1(zArr2)) {
            return T(zArr);
        }
        if (i4 < 0 || i4 > zArr.length) {
            StringBuilder a5 = androidx.collection.s.a("Index: ", i4, ", Length: ");
            a5.append(zArr.length);
            throw new IndexOutOfBoundsException(a5.toString());
        }
        boolean[] zArr3 = new boolean[zArr.length + zArr2.length];
        System.arraycopy(zArr2, 0, zArr3, i4, zArr2.length);
        if (i4 > 0) {
            System.arraycopy(zArr, 0, zArr3, 0, i4);
        }
        if (i4 < zArr.length) {
            System.arraycopy(zArr, i4, zArr3, zArr2.length + i4, zArr.length - i4);
        }
        return zArr3;
    }

    public static int f2(int[] iArr, int i4) {
        return g2(iArr, i4, Integer.MAX_VALUE);
    }

    @Deprecated
    public static char[] f3(char[] cArr, char c5) {
        return (char[]) T2(cArr, G0(cArr, c5, 0));
    }

    public static void f4(boolean[] zArr, int i4, int i5) {
        if (zArr == null) {
            return;
        }
        int min = Math.min(zArr.length, i5) - 1;
        for (int max = Math.max(i4, 0); min > max; max++) {
            boolean z4 = zArr[min];
            zArr[min] = zArr[max];
            zArr[max] = z4;
            min--;
        }
    }

    public static void f5(float[] fArr, int i4, int i5) {
        if (k1(fArr)) {
            return;
        }
        g5(fArr, i4, i5, 1);
    }

    @Deprecated
    public static double[] g(double[] dArr, int i4, double d5) {
        return (double[]) a(dArr, i4, Double.valueOf(d5), Double.TYPE);
    }

    public static <T> T g0(T[] tArr, int i4, T t4) {
        return g1(tArr, i4) ? tArr[i4] : t4;
    }

    public static <T> boolean g1(T[] tArr, int i4) {
        return i4 >= 0 && h0(tArr) > i4;
    }

    public static int g2(int[] iArr, int i4, int i5) {
        if (iArr == null || i5 < 0) {
            return -1;
        }
        if (i5 >= iArr.length) {
            i5 = iArr.length - 1;
        }
        while (i5 >= 0) {
            if (i4 == iArr[i5]) {
                return i5;
            }
            i5--;
        }
        return -1;
    }

    @Deprecated
    public static double[] g3(double[] dArr, double d5) {
        return (double[]) T2(dArr, J0(dArr, d5, 0));
    }

    public static void g4(byte[] bArr, int i4) {
        if (bArr == null) {
            return;
        }
        h4(bArr, 0, bArr.length, i4);
    }

    public static void g5(float[] fArr, int i4, int i5, int i6) {
        if (k1(fArr) || i4 >= fArr.length || i5 >= fArr.length) {
            return;
        }
        int i7 = 0;
        if (i4 < 0) {
            i4 = 0;
        }
        if (i5 < 0) {
            i5 = 0;
        }
        int min = Math.min(Math.min(i6, fArr.length - i4), fArr.length - i5);
        while (i7 < min) {
            float f4 = fArr[i4];
            fArr[i4] = fArr[i5];
            fArr[i5] = f4;
            i7++;
            i4++;
            i5++;
        }
    }

    public static float[] h(float[] fArr, float f4) {
        float[] fArr2 = (float[]) e0(fArr, Float.TYPE);
        fArr2[fArr2.length - 1] = f4;
        return fArr2;
    }

    public static int h0(Object obj) {
        if (obj == null) {
            return 0;
        }
        return Array.getLength(obj);
    }

    public static boolean h1(byte[] bArr) {
        return h0(bArr) == 0;
    }

    public static int h2(long[] jArr, long j4) {
        return i2(jArr, j4, Integer.MAX_VALUE);
    }

    @Deprecated
    public static float[] h3(float[] fArr, float f4) {
        return (float[]) T2(fArr, M0(fArr, f4, 0));
    }

    public static void h4(byte[] bArr, int i4, int i5, int i6) {
        if (bArr != null && i4 < bArr.length - 1 && i5 > 0) {
            if (i4 < 0) {
                i4 = 0;
            }
            if (i5 >= bArr.length) {
                i5 = bArr.length;
            }
            int i7 = i5 - i4;
            if (i7 <= 1) {
                return;
            }
            int i10 = i6 % i7;
            if (i10 < 0) {
                i10 += i7;
            }
            while (i7 > 1 && i10 > 0) {
                int i11 = i7 - i10;
                if (i10 > i11) {
                    a5(bArr, i4, (i7 + i4) - i11, i11);
                    int i12 = i10;
                    i10 -= i11;
                    i7 = i12;
                } else if (i10 >= i11) {
                    a5(bArr, i4, i11 + i4, i10);
                    return;
                } else {
                    a5(bArr, i4, i4 + i11, i10);
                    i4 += i10;
                    i7 = i11;
                }
            }
        }
    }

    public static void h5(int[] iArr, int i4, int i5) {
        if (l1(iArr)) {
            return;
        }
        i5(iArr, i4, i5, 1);
    }

    @Deprecated
    public static float[] i(float[] fArr, int i4, float f4) {
        return (float[]) a(fArr, i4, Float.valueOf(f4), Float.TYPE);
    }

    public static int i0(Object obj) {
        return new org.apache.commons.lang3.builder.j().h(obj).G();
    }

    public static boolean i1(char[] cArr) {
        return h0(cArr) == 0;
    }

    public static int i2(long[] jArr, long j4, int i4) {
        if (jArr == null || i4 < 0) {
            return -1;
        }
        if (i4 >= jArr.length) {
            i4 = jArr.length - 1;
        }
        while (i4 >= 0) {
            if (j4 == jArr[i4]) {
                return i4;
            }
            i4--;
        }
        return -1;
    }

    @Deprecated
    public static int[] i3(int[] iArr, int i4) {
        return (int[]) T2(iArr, O0(iArr, i4, 0));
    }

    public static void i4(char[] cArr, int i4) {
        if (cArr == null) {
            return;
        }
        j4(cArr, 0, cArr.length, i4);
    }

    public static void i5(int[] iArr, int i4, int i5, int i6) {
        if (l1(iArr) || i4 >= iArr.length || i5 >= iArr.length) {
            return;
        }
        int i7 = 0;
        if (i4 < 0) {
            i4 = 0;
        }
        if (i5 < 0) {
            i5 = 0;
        }
        int min = Math.min(Math.min(i6, iArr.length - i4), iArr.length - i5);
        while (i7 < min) {
            int i10 = iArr[i4];
            iArr[i4] = iArr[i5];
            iArr[i5] = i10;
            i7++;
            i4++;
            i5++;
        }
    }

    public static int[] j(int[] iArr, int i4) {
        int[] iArr2 = (int[]) e0(iArr, Integer.TYPE);
        iArr2[iArr2.length - 1] = i4;
        return iArr2;
    }

    public static int j0(byte[] bArr, byte b5) {
        return k0(bArr, b5, 0);
    }

    public static boolean j1(double[] dArr) {
        return h0(dArr) == 0;
    }

    public static int j2(Object[] objArr, Object obj) {
        return k2(objArr, obj, Integer.MAX_VALUE);
    }

    @Deprecated
    public static long[] j3(long[] jArr, long j4) {
        return (long[]) T2(jArr, Q0(jArr, j4, 0));
    }

    public static void j4(char[] cArr, int i4, int i5, int i6) {
        if (cArr != null && i4 < cArr.length - 1 && i5 > 0) {
            if (i4 < 0) {
                i4 = 0;
            }
            if (i5 >= cArr.length) {
                i5 = cArr.length;
            }
            int i7 = i5 - i4;
            if (i7 <= 1) {
                return;
            }
            int i10 = i6 % i7;
            if (i10 < 0) {
                i10 += i7;
            }
            while (i7 > 1 && i10 > 0) {
                int i11 = i7 - i10;
                if (i10 > i11) {
                    c5(cArr, i4, (i7 + i4) - i11, i11);
                    int i12 = i10;
                    i10 -= i11;
                    i7 = i12;
                } else if (i10 >= i11) {
                    c5(cArr, i4, i11 + i4, i10);
                    return;
                } else {
                    c5(cArr, i4, i4 + i11, i10);
                    i4 += i10;
                    i7 = i11;
                }
            }
        }
    }

    public static void j5(long[] jArr, int i4, int i5) {
        if (m1(jArr)) {
            return;
        }
        k5(jArr, i4, i5, 1);
    }

    @Deprecated
    public static int[] k(int[] iArr, int i4, int i5) {
        return (int[]) a(iArr, i4, Integer.valueOf(i5), Integer.TYPE);
    }

    public static int k0(byte[] bArr, byte b5, int i4) {
        if (bArr == null) {
            return -1;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        while (i4 < bArr.length) {
            if (b5 == bArr[i4]) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    public static boolean k1(float[] fArr) {
        return h0(fArr) == 0;
    }

    public static int k2(Object[] objArr, Object obj, int i4) {
        if (objArr == null || i4 < 0) {
            return -1;
        }
        if (i4 >= objArr.length) {
            i4 = objArr.length - 1;
        }
        if (obj == null) {
            while (i4 >= 0) {
                if (objArr[i4] == null) {
                    return i4;
                }
                i4--;
            }
        } else if (objArr.getClass().getComponentType().isInstance(obj)) {
            while (i4 >= 0) {
                if (obj.equals(objArr[i4])) {
                    return i4;
                }
                i4--;
            }
        }
        return -1;
    }

    @Deprecated
    public static <T> T[] k3(T[] tArr, T t4) {
        return (T[]) ((Object[]) T2(tArr, S0(tArr, t4, 0)));
    }

    public static void k4(double[] dArr, int i4) {
        if (dArr == null) {
            return;
        }
        l4(dArr, 0, dArr.length, i4);
    }

    public static void k5(long[] jArr, int i4, int i5, int i6) {
        if (m1(jArr) || i4 >= jArr.length || i5 >= jArr.length) {
            return;
        }
        int i7 = 0;
        if (i4 < 0) {
            i4 = 0;
        }
        if (i5 < 0) {
            i5 = 0;
        }
        int min = Math.min(Math.min(i6, jArr.length - i4), jArr.length - i5);
        while (i7 < min) {
            long j4 = jArr[i4];
            jArr[i4] = jArr[i5];
            jArr[i5] = j4;
            i7++;
            i4++;
            i5++;
        }
    }

    @Deprecated
    public static long[] l(long[] jArr, int i4, long j4) {
        return (long[]) a(jArr, i4, Long.valueOf(j4), Long.TYPE);
    }

    public static int l0(char[] cArr, char c5) {
        return m0(cArr, c5, 0);
    }

    public static boolean l1(int[] iArr) {
        return h0(iArr) == 0;
    }

    public static int l2(short[] sArr, short s4) {
        return m2(sArr, s4, Integer.MAX_VALUE);
    }

    @Deprecated
    public static short[] l3(short[] sArr, short s4) {
        return (short[]) T2(sArr, U0(sArr, s4, 0));
    }

    public static void l4(double[] dArr, int i4, int i5, int i6) {
        if (dArr != null && i4 < dArr.length - 1 && i5 > 0) {
            if (i4 < 0) {
                i4 = 0;
            }
            if (i5 >= dArr.length) {
                i5 = dArr.length;
            }
            int i7 = i5 - i4;
            if (i7 <= 1) {
                return;
            }
            int i10 = i6 % i7;
            if (i10 < 0) {
                i10 += i7;
            }
            while (i7 > 1 && i10 > 0) {
                int i11 = i7 - i10;
                if (i10 > i11) {
                    e5(dArr, i4, (i7 + i4) - i11, i11);
                    int i12 = i10;
                    i10 -= i11;
                    i7 = i12;
                } else if (i10 >= i11) {
                    e5(dArr, i4, i11 + i4, i10);
                    return;
                } else {
                    e5(dArr, i4, i4 + i11, i10);
                    i4 += i10;
                    i7 = i11;
                }
            }
        }
    }

    public static void l5(Object[] objArr, int i4, int i5) {
        if (n1(objArr)) {
            return;
        }
        m5(objArr, i4, i5, 1);
    }

    public static long[] m(long[] jArr, long j4) {
        long[] jArr2 = (long[]) e0(jArr, Long.TYPE);
        jArr2[jArr2.length - 1] = j4;
        return jArr2;
    }

    public static int m0(char[] cArr, char c5, int i4) {
        if (cArr == null) {
            return -1;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        while (i4 < cArr.length) {
            if (c5 == cArr[i4]) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    public static boolean m1(long[] jArr) {
        return h0(jArr) == 0;
    }

    public static int m2(short[] sArr, short s4, int i4) {
        if (sArr == null || i4 < 0) {
            return -1;
        }
        if (i4 >= sArr.length) {
            i4 = sArr.length - 1;
        }
        while (i4 >= 0) {
            if (s4 == sArr[i4]) {
                return i4;
            }
            i4--;
        }
        return -1;
    }

    @Deprecated
    public static boolean[] m3(boolean[] zArr, boolean z4) {
        return (boolean[]) T2(zArr, W0(zArr, z4, 0));
    }

    public static void m4(float[] fArr, int i4) {
        if (fArr == null) {
            return;
        }
        n4(fArr, 0, fArr.length, i4);
    }

    public static void m5(Object[] objArr, int i4, int i5, int i6) {
        if (n1(objArr) || i4 >= objArr.length || i5 >= objArr.length) {
            return;
        }
        int i7 = 0;
        if (i4 < 0) {
            i4 = 0;
        }
        if (i5 < 0) {
            i5 = 0;
        }
        int min = Math.min(Math.min(i6, objArr.length - i4), objArr.length - i5);
        while (i7 < min) {
            Object obj = objArr[i4];
            objArr[i4] = objArr[i5];
            objArr[i5] = obj;
            i7++;
            i4++;
            i5++;
        }
    }

    @Deprecated
    public static <T> T[] n(T[] tArr, int i4, T t4) {
        Class<?> cls;
        if (tArr != null) {
            cls = tArr.getClass().getComponentType();
        } else {
            if (t4 == null) {
                throw new IllegalArgumentException("Array and element cannot both be null");
            }
            cls = t4.getClass();
        }
        return (T[]) ((Object[]) a(tArr, i4, t4, cls));
    }

    public static int n0(double[] dArr, double d5) {
        return p0(dArr, d5, 0);
    }

    public static boolean n1(Object[] objArr) {
        return h0(objArr) == 0;
    }

    public static int n2(boolean[] zArr, boolean z4) {
        return o2(zArr, z4, Integer.MAX_VALUE);
    }

    public static byte[] n3(byte[] bArr, byte b5) {
        return (byte[]) T2(bArr, E0(bArr, b5, 0));
    }

    public static void n4(float[] fArr, int i4, int i5, int i6) {
        if (fArr != null && i4 < fArr.length - 1 && i5 > 0) {
            if (i4 < 0) {
                i4 = 0;
            }
            if (i5 >= fArr.length) {
                i5 = fArr.length;
            }
            int i7 = i5 - i4;
            if (i7 <= 1) {
                return;
            }
            int i10 = i6 % i7;
            if (i10 < 0) {
                i10 += i7;
            }
            while (i7 > 1 && i10 > 0) {
                int i11 = i7 - i10;
                if (i10 > i11) {
                    g5(fArr, i4, (i7 + i4) - i11, i11);
                    int i12 = i10;
                    i10 -= i11;
                    i7 = i12;
                } else if (i10 >= i11) {
                    g5(fArr, i4, i11 + i4, i10);
                    return;
                } else {
                    g5(fArr, i4, i4 + i11, i10);
                    i4 += i10;
                    i7 = i11;
                }
            }
        }
    }

    public static void n5(short[] sArr, int i4, int i5) {
        if (o1(sArr)) {
            return;
        }
        o5(sArr, i4, i5, 1);
    }

    public static <T> T[] o(T[] tArr, T t4) {
        Class<?> cls;
        if (tArr != null) {
            cls = tArr.getClass().getComponentType();
        } else {
            if (t4 == null) {
                throw new IllegalArgumentException("Arguments cannot both be null");
            }
            cls = t4.getClass();
        }
        T[] tArr2 = (T[]) ((Object[]) e0(tArr, cls));
        tArr2[tArr2.length - 1] = t4;
        return tArr2;
    }

    public static int o0(double[] dArr, double d5, double d6) {
        return q0(dArr, d5, 0, d6);
    }

    public static boolean o1(short[] sArr) {
        return h0(sArr) == 0;
    }

    public static int o2(boolean[] zArr, boolean z4, int i4) {
        if (p1(zArr) || i4 < 0) {
            return -1;
        }
        if (i4 >= zArr.length) {
            i4 = zArr.length - 1;
        }
        while (i4 >= 0) {
            if (z4 == zArr[i4]) {
                return i4;
            }
            i4--;
        }
        return -1;
    }

    public static char[] o3(char[] cArr, char c5) {
        return (char[]) T2(cArr, G0(cArr, c5, 0));
    }

    public static void o4(int[] iArr, int i4) {
        if (iArr == null) {
            return;
        }
        p4(iArr, 0, iArr.length, i4);
    }

    public static void o5(short[] sArr, int i4, int i5, int i6) {
        if (o1(sArr) || i4 >= sArr.length || i5 >= sArr.length) {
            return;
        }
        int i7 = 0;
        if (i4 < 0) {
            i4 = 0;
        }
        if (i5 < 0) {
            i5 = 0;
        }
        if (i4 == i5) {
            return;
        }
        int min = Math.min(Math.min(i6, sArr.length - i4), sArr.length - i5);
        while (i7 < min) {
            short s4 = sArr[i4];
            sArr[i4] = sArr[i5];
            sArr[i5] = s4;
            i7++;
            i4++;
            i5++;
        }
    }

    @Deprecated
    public static short[] p(short[] sArr, int i4, short s4) {
        return (short[]) a(sArr, i4, Short.valueOf(s4), Short.TYPE);
    }

    public static int p0(double[] dArr, double d5, int i4) {
        if (j1(dArr)) {
            return -1;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        while (i4 < dArr.length) {
            if (d5 == dArr[i4]) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    public static boolean p1(boolean[] zArr) {
        return h0(zArr) == 0;
    }

    public static byte[] p2(byte[] bArr) {
        return h1(bArr) ? f85951c : bArr;
    }

    public static double[] p3(double[] dArr, double d5) {
        return (double[]) T2(dArr, J0(dArr, d5, 0));
    }

    public static void p4(int[] iArr, int i4, int i5, int i6) {
        if (iArr != null && i4 < iArr.length - 1 && i5 > 0) {
            if (i4 < 0) {
                i4 = 0;
            }
            if (i5 >= iArr.length) {
                i5 = iArr.length;
            }
            int i7 = i5 - i4;
            if (i7 <= 1) {
                return;
            }
            int i10 = i6 % i7;
            if (i10 < 0) {
                i10 += i7;
            }
            while (i7 > 1 && i10 > 0) {
                int i11 = i7 - i10;
                if (i10 > i11) {
                    i5(iArr, i4, (i7 + i4) - i11, i11);
                    int i12 = i10;
                    i10 -= i11;
                    i7 = i12;
                } else if (i10 >= i11) {
                    i5(iArr, i4, i11 + i4, i10);
                    return;
                } else {
                    i5(iArr, i4, i4 + i11, i10);
                    i4 += i10;
                    i7 = i11;
                }
            }
        }
    }

    public static void p5(boolean[] zArr, int i4, int i5) {
        if (p1(zArr)) {
            return;
        }
        q5(zArr, i4, i5, 1);
    }

    public static short[] q(short[] sArr, short s4) {
        short[] sArr2 = (short[]) e0(sArr, Short.TYPE);
        sArr2[sArr2.length - 1] = s4;
        return sArr2;
    }

    public static int q0(double[] dArr, double d5, int i4, double d6) {
        if (j1(dArr)) {
            return -1;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        double d7 = d5 - d6;
        double d10 = d5 + d6;
        while (i4 < dArr.length) {
            double d11 = dArr[i4];
            if (d11 >= d7 && d11 <= d10) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    @Deprecated
    public static boolean q1(Object obj, Object obj2) {
        return new org.apache.commons.lang3.builder.g().h(obj, obj2).y();
    }

    public static char[] q2(char[] cArr) {
        return i1(cArr) ? f85953e : cArr;
    }

    public static float[] q3(float[] fArr, float f4) {
        return (float[]) T2(fArr, M0(fArr, f4, 0));
    }

    public static void q4(long[] jArr, int i4) {
        if (jArr == null) {
            return;
        }
        r4(jArr, 0, jArr.length, i4);
    }

    public static void q5(boolean[] zArr, int i4, int i5, int i6) {
        if (p1(zArr) || i4 >= zArr.length || i5 >= zArr.length) {
            return;
        }
        int i7 = 0;
        if (i4 < 0) {
            i4 = 0;
        }
        if (i5 < 0) {
            i5 = 0;
        }
        int min = Math.min(Math.min(i6, zArr.length - i4), zArr.length - i5);
        while (i7 < min) {
            boolean z4 = zArr[i4];
            zArr[i4] = zArr[i5];
            zArr[i5] = z4;
            i7++;
            i4++;
            i5++;
        }
    }

    @Deprecated
    public static boolean[] r(boolean[] zArr, int i4, boolean z4) {
        return (boolean[]) a(zArr, i4, Boolean.valueOf(z4), Boolean.TYPE);
    }

    public static int r0(float[] fArr, float f4) {
        return s0(fArr, f4, 0);
    }

    public static boolean r1(byte[] bArr) {
        return !h1(bArr);
    }

    public static double[] r2(double[] dArr) {
        return j1(dArr) ? f85956h : dArr;
    }

    public static int[] r3(int[] iArr, int i4) {
        return (int[]) T2(iArr, O0(iArr, i4, 0));
    }

    public static void r4(long[] jArr, int i4, int i5, int i6) {
        if (jArr != null && i4 < jArr.length - 1 && i5 > 0) {
            if (i4 < 0) {
                i4 = 0;
            }
            if (i5 >= jArr.length) {
                i5 = jArr.length;
            }
            int i7 = i5 - i4;
            if (i7 <= 1) {
                return;
            }
            int i10 = i6 % i7;
            if (i10 < 0) {
                i10 += i7;
            }
            while (i7 > 1 && i10 > 0) {
                int i11 = i7 - i10;
                if (i10 > i11) {
                    k5(jArr, i4, (i7 + i4) - i11, i11);
                    int i12 = i10;
                    i10 -= i11;
                    i7 = i12;
                } else if (i10 >= i11) {
                    k5(jArr, i4, i11 + i4, i10);
                    return;
                } else {
                    k5(jArr, i4, i4 + i11, i10);
                    i4 += i10;
                    i7 = i11;
                }
            }
        }
    }

    public static <T> T[] r5(T... tArr) {
        return tArr;
    }

    public static boolean[] s(boolean[] zArr, boolean z4) {
        boolean[] zArr2 = (boolean[]) e0(zArr, Boolean.TYPE);
        zArr2[zArr2.length - 1] = z4;
        return zArr2;
    }

    public static int s0(float[] fArr, float f4, int i4) {
        if (k1(fArr)) {
            return -1;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        while (i4 < fArr.length) {
            if (f4 == fArr[i4]) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    public static boolean s1(char[] cArr) {
        return !i1(cArr);
    }

    public static float[] s2(float[] fArr) {
        return k1(fArr) ? f85959k : fArr;
    }

    public static long[] s3(long[] jArr, long j4) {
        return (long[]) T2(jArr, Q0(jArr, j4, 0));
    }

    public static void s4(Object[] objArr, int i4) {
        if (objArr == null) {
            return;
        }
        t4(objArr, 0, objArr.length, i4);
    }

    public static Map<Object, Object> s5(Object[] objArr) {
        if (objArr == null) {
            return null;
        }
        HashMap hashMap = new HashMap((int) (objArr.length * 1.5d));
        for (int i4 = 0; i4 < objArr.length; i4++) {
            Object obj = objArr[i4];
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                hashMap.put(entry.getKey(), entry.getValue());
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalArgumentException("Array element " + i4 + ", '" + obj + "', is neither of type Map.Entry nor an Array");
                }
                Object[] objArr2 = (Object[]) obj;
                if (objArr2.length < 2) {
                    throw new IllegalArgumentException("Array element " + i4 + ", '" + obj + "', has a length less than 2");
                }
                hashMap.put(objArr2[0], objArr2[1]);
            }
        }
        return hashMap;
    }

    public static byte[] t(byte[] bArr, byte... bArr2) {
        if (bArr == null) {
            return L(bArr2);
        }
        if (bArr2 == null) {
            return L(bArr);
        }
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public static int t0(int[] iArr, int i4) {
        return u0(iArr, i4, 0);
    }

    public static boolean t1(double[] dArr) {
        return !j1(dArr);
    }

    public static int[] t2(int[] iArr) {
        return l1(iArr) ? f85961m : iArr;
    }

    public static <T> T[] t3(T[] tArr, T t4) {
        return (T[]) ((Object[]) T2(tArr, S0(tArr, t4, 0)));
    }

    public static void t4(Object[] objArr, int i4, int i5, int i6) {
        if (objArr != null && i4 < objArr.length - 1 && i5 > 0) {
            if (i4 < 0) {
                i4 = 0;
            }
            if (i5 >= objArr.length) {
                i5 = objArr.length;
            }
            int i7 = i5 - i4;
            if (i7 <= 1) {
                return;
            }
            int i10 = i6 % i7;
            if (i10 < 0) {
                i10 += i7;
            }
            while (i7 > 1 && i10 > 0) {
                int i11 = i7 - i10;
                if (i10 > i11) {
                    m5(objArr, i4, (i7 + i4) - i11, i11);
                    int i12 = i10;
                    i10 -= i11;
                    i7 = i12;
                } else if (i10 >= i11) {
                    m5(objArr, i4, i11 + i4, i10);
                    return;
                } else {
                    m5(objArr, i4, i4 + i11, i10);
                    i4 += i10;
                    i7 = i11;
                }
            }
        }
    }

    public static Boolean[] t5(boolean[] zArr) {
        if (zArr == null) {
            return null;
        }
        if (zArr.length == 0) {
            return f85950b;
        }
        Boolean[] boolArr = new Boolean[zArr.length];
        for (int i4 = 0; i4 < zArr.length; i4++) {
            boolArr[i4] = zArr[i4] ? Boolean.TRUE : Boolean.FALSE;
        }
        return boolArr;
    }

    public static char[] u(char[] cArr, char... cArr2) {
        if (cArr == null) {
            return M(cArr2);
        }
        if (cArr2 == null) {
            return M(cArr);
        }
        char[] cArr3 = new char[cArr.length + cArr2.length];
        System.arraycopy(cArr, 0, cArr3, 0, cArr.length);
        System.arraycopy(cArr2, 0, cArr3, cArr.length, cArr2.length);
        return cArr3;
    }

    public static int u0(int[] iArr, int i4, int i5) {
        if (iArr == null) {
            return -1;
        }
        if (i5 < 0) {
            i5 = 0;
        }
        while (i5 < iArr.length) {
            if (i4 == iArr[i5]) {
                return i5;
            }
            i5++;
        }
        return -1;
    }

    public static boolean u1(float[] fArr) {
        return !k1(fArr);
    }

    public static long[] u2(long[] jArr) {
        return m1(jArr) ? f85963o : jArr;
    }

    public static short[] u3(short[] sArr, short s4) {
        return (short[]) T2(sArr, U0(sArr, s4, 0));
    }

    public static void u4(short[] sArr, int i4) {
        if (sArr == null) {
            return;
        }
        v4(sArr, 0, sArr.length, i4);
    }

    public static Byte[] u5(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return f85952d;
        }
        Byte[] bArr2 = new Byte[bArr.length];
        for (int i4 = 0; i4 < bArr.length; i4++) {
            bArr2[i4] = Byte.valueOf(bArr[i4]);
        }
        return bArr2;
    }

    public static double[] v(double[] dArr, double... dArr2) {
        if (dArr == null) {
            return N(dArr2);
        }
        if (dArr2 == null) {
            return N(dArr);
        }
        double[] dArr3 = new double[dArr.length + dArr2.length];
        System.arraycopy(dArr, 0, dArr3, 0, dArr.length);
        System.arraycopy(dArr2, 0, dArr3, dArr.length, dArr2.length);
        return dArr3;
    }

    public static int v0(long[] jArr, long j4) {
        return w0(jArr, j4, 0);
    }

    public static boolean v1(int[] iArr) {
        return !l1(iArr);
    }

    public static Boolean[] v2(Boolean[] boolArr) {
        return n1(boolArr) ? f85950b : boolArr;
    }

    public static boolean[] v3(boolean[] zArr, boolean z4) {
        return (boolean[]) T2(zArr, W0(zArr, z4, 0));
    }

    public static void v4(short[] sArr, int i4, int i5, int i6) {
        if (sArr != null && i4 < sArr.length - 1 && i5 > 0) {
            if (i4 < 0) {
                i4 = 0;
            }
            if (i5 >= sArr.length) {
                i5 = sArr.length;
            }
            int i7 = i5 - i4;
            if (i7 <= 1) {
                return;
            }
            int i10 = i6 % i7;
            if (i10 < 0) {
                i10 += i7;
            }
            while (i7 > 1 && i10 > 0) {
                int i11 = i7 - i10;
                if (i10 > i11) {
                    o5(sArr, i4, (i7 + i4) - i11, i11);
                    int i12 = i10;
                    i10 -= i11;
                    i7 = i12;
                } else if (i10 >= i11) {
                    o5(sArr, i4, i11 + i4, i10);
                    return;
                } else {
                    o5(sArr, i4, i4 + i11, i10);
                    i4 += i10;
                    i7 = i11;
                }
            }
        }
    }

    public static Character[] v5(char[] cArr) {
        if (cArr == null) {
            return null;
        }
        if (cArr.length == 0) {
            return f85954f;
        }
        Character[] chArr = new Character[cArr.length];
        for (int i4 = 0; i4 < cArr.length; i4++) {
            chArr[i4] = Character.valueOf(cArr[i4]);
        }
        return chArr;
    }

    public static float[] w(float[] fArr, float... fArr2) {
        if (fArr == null) {
            return O(fArr2);
        }
        if (fArr2 == null) {
            return O(fArr);
        }
        float[] fArr3 = new float[fArr.length + fArr2.length];
        System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
        System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
        return fArr3;
    }

    public static int w0(long[] jArr, long j4, int i4) {
        if (jArr == null) {
            return -1;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        while (i4 < jArr.length) {
            if (j4 == jArr[i4]) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    public static boolean w1(long[] jArr) {
        return !m1(jArr);
    }

    public static Byte[] w2(Byte[] bArr) {
        return n1(bArr) ? f85952d : bArr;
    }

    public static byte[] w3(byte[] bArr, byte b5) {
        int k02 = k0(bArr, b5, 0);
        return k02 == -1 ? L(bArr) : (byte[]) J2(bArr, k02);
    }

    public static void w4(boolean[] zArr, int i4) {
        if (zArr == null) {
            return;
        }
        x4(zArr, 0, zArr.length, i4);
    }

    public static Double[] w5(double[] dArr) {
        if (dArr == null) {
            return null;
        }
        if (dArr.length == 0) {
            return f85957i;
        }
        Double[] dArr2 = new Double[dArr.length];
        for (int i4 = 0; i4 < dArr.length; i4++) {
            dArr2[i4] = Double.valueOf(dArr[i4]);
        }
        return dArr2;
    }

    public static int[] x(int[] iArr, int... iArr2) {
        if (iArr == null) {
            return P(iArr2);
        }
        if (iArr2 == null) {
            return P(iArr);
        }
        int[] iArr3 = new int[iArr.length + iArr2.length];
        System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
        return iArr3;
    }

    public static int x0(Object[] objArr, Object obj) {
        return y0(objArr, obj, 0);
    }

    public static <T> boolean x1(T[] tArr) {
        return !n1(tArr);
    }

    public static Character[] x2(Character[] chArr) {
        return n1(chArr) ? f85954f : chArr;
    }

    public static char[] x3(char[] cArr, char c5) {
        int m02 = m0(cArr, c5, 0);
        return m02 == -1 ? M(cArr) : (char[]) J2(cArr, m02);
    }

    public static void x4(boolean[] zArr, int i4, int i5, int i6) {
        if (zArr != null && i4 < zArr.length - 1 && i5 > 0) {
            if (i4 < 0) {
                i4 = 0;
            }
            if (i5 >= zArr.length) {
                i5 = zArr.length;
            }
            int i7 = i5 - i4;
            if (i7 <= 1) {
                return;
            }
            int i10 = i6 % i7;
            if (i10 < 0) {
                i10 += i7;
            }
            while (i7 > 1 && i10 > 0) {
                int i11 = i7 - i10;
                if (i10 > i11) {
                    q5(zArr, i4, (i7 + i4) - i11, i11);
                    int i12 = i10;
                    i10 -= i11;
                    i7 = i12;
                } else if (i10 >= i11) {
                    q5(zArr, i4, i11 + i4, i10);
                    return;
                } else {
                    q5(zArr, i4, i4 + i11, i10);
                    i4 += i10;
                    i7 = i11;
                }
            }
        }
    }

    public static Float[] x5(float[] fArr) {
        if (fArr == null) {
            return null;
        }
        if (fArr.length == 0) {
            return f85960l;
        }
        Float[] fArr2 = new Float[fArr.length];
        for (int i4 = 0; i4 < fArr.length; i4++) {
            fArr2[i4] = Float.valueOf(fArr[i4]);
        }
        return fArr2;
    }

    public static long[] y(long[] jArr, long... jArr2) {
        if (jArr == null) {
            return Q(jArr2);
        }
        if (jArr2 == null) {
            return Q(jArr);
        }
        long[] jArr3 = new long[jArr.length + jArr2.length];
        System.arraycopy(jArr, 0, jArr3, 0, jArr.length);
        System.arraycopy(jArr2, 0, jArr3, jArr.length, jArr2.length);
        return jArr3;
    }

    public static int y0(Object[] objArr, Object obj, int i4) {
        if (objArr == null) {
            return -1;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        if (obj == null) {
            while (i4 < objArr.length) {
                if (objArr[i4] == null) {
                    return i4;
                }
                i4++;
            }
        } else {
            while (i4 < objArr.length) {
                if (obj.equals(objArr[i4])) {
                    return i4;
                }
                i4++;
            }
        }
        return -1;
    }

    public static boolean y1(short[] sArr) {
        return !o1(sArr);
    }

    public static Class<?>[] y2(Class<?>[] clsArr) {
        return n1(clsArr) ? f85955g : clsArr;
    }

    public static double[] y3(double[] dArr, double d5) {
        int p02 = p0(dArr, d5, 0);
        return p02 == -1 ? N(dArr) : (double[]) J2(dArr, p02);
    }

    public static void y4(byte[] bArr) {
        z4(bArr, new Random());
    }

    public static Integer[] y5(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        if (iArr.length == 0) {
            return f85962n;
        }
        Integer[] numArr = new Integer[iArr.length];
        for (int i4 = 0; i4 < iArr.length; i4++) {
            numArr[i4] = Integer.valueOf(iArr[i4]);
        }
        return numArr;
    }

    public static <T> T[] z(T[] tArr, T... tArr2) {
        if (tArr == null) {
            return (T[]) R(tArr2);
        }
        if (tArr2 == null) {
            return (T[]) R(tArr);
        }
        Class<?> componentType = tArr.getClass().getComponentType();
        T[] tArr3 = (T[]) ((Object[]) Array.newInstance(componentType, tArr.length + tArr2.length));
        System.arraycopy(tArr, 0, tArr3, 0, tArr.length);
        try {
            System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
            return tArr3;
        } catch (ArrayStoreException e4) {
            Class<?> componentType2 = tArr2.getClass().getComponentType();
            if (componentType.isAssignableFrom(componentType2)) {
                throw e4;
            }
            throw new IllegalArgumentException("Cannot store " + componentType2.getName() + " in an array of " + componentType.getName(), e4);
        }
    }

    public static int z0(short[] sArr, short s4) {
        return A0(sArr, s4, 0);
    }

    public static boolean z1(boolean[] zArr) {
        return !p1(zArr);
    }

    public static Double[] z2(Double[] dArr) {
        return n1(dArr) ? f85957i : dArr;
    }

    public static float[] z3(float[] fArr, float f4) {
        int s02 = s0(fArr, f4, 0);
        return s02 == -1 ? O(fArr) : (float[]) J2(fArr, s02);
    }

    public static void z4(byte[] bArr, Random random) {
        for (int length = bArr.length; length > 1; length--) {
            a5(bArr, length - 1, random.nextInt(length), 1);
        }
    }

    public static Long[] z5(long[] jArr) {
        if (jArr == null) {
            return null;
        }
        if (jArr.length == 0) {
            return f85964p;
        }
        Long[] lArr = new Long[jArr.length];
        for (int i4 = 0; i4 < jArr.length; i4++) {
            lArr[i4] = Long.valueOf(jArr[i4]);
        }
        return lArr;
    }
}
