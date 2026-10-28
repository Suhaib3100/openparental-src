package androidx.core.content.res;

import java.lang.reflect.Array;

/* compiled from: GrowingArrayUtils.java */
/* loaded from: classes.dex */
final class h {
    private h() {
    }

    public static int[] a(int[] iArr, int i5, int i6) {
        if (i5 + 1 > iArr.length) {
            int[] iArr2 = new int[e(i5)];
            System.arraycopy(iArr, 0, iArr2, 0, i5);
            iArr = iArr2;
        }
        iArr[i5] = i6;
        return iArr;
    }

    public static long[] b(long[] jArr, int i5, long j5) {
        if (i5 + 1 > jArr.length) {
            long[] jArr2 = new long[e(i5)];
            System.arraycopy(jArr, 0, jArr2, 0, i5);
            jArr = jArr2;
        }
        jArr[i5] = j5;
        return jArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.lang.Object[]] */
    public static <T> T[] c(T[] tArr, int i5, T t5) {
        if (i5 + 1 > tArr.length) {
            ?? r02 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), e(i5));
            System.arraycopy(tArr, 0, r02, 0, i5);
            tArr = r02;
        }
        tArr[i5] = t5;
        return tArr;
    }

    public static boolean[] d(boolean[] zArr, int i5, boolean z5) {
        if (i5 + 1 > zArr.length) {
            boolean[] zArr2 = new boolean[e(i5)];
            System.arraycopy(zArr, 0, zArr2, 0, i5);
            zArr = zArr2;
        }
        zArr[i5] = z5;
        return zArr;
    }

    public static int e(int i5) {
        if (i5 <= 4) {
            return 8;
        }
        return i5 * 2;
    }

    public static int[] f(int[] iArr, int i5, int i6, int i7) {
        if (i5 + 1 <= iArr.length) {
            System.arraycopy(iArr, i6, iArr, i6 + 1, i5 - i6);
            iArr[i6] = i7;
            return iArr;
        }
        int[] iArr2 = new int[e(i5)];
        System.arraycopy(iArr, 0, iArr2, 0, i6);
        iArr2[i6] = i7;
        System.arraycopy(iArr, i6, iArr2, i6 + 1, iArr.length - i6);
        return iArr2;
    }

    public static long[] g(long[] jArr, int i5, int i6, long j5) {
        if (i5 + 1 <= jArr.length) {
            System.arraycopy(jArr, i6, jArr, i6 + 1, i5 - i6);
            jArr[i6] = j5;
            return jArr;
        }
        long[] jArr2 = new long[e(i5)];
        System.arraycopy(jArr, 0, jArr2, 0, i6);
        jArr2[i6] = j5;
        System.arraycopy(jArr, i6, jArr2, i6 + 1, jArr.length - i6);
        return jArr2;
    }

    public static <T> T[] h(T[] tArr, int i5, int i6, T t5) {
        if (i5 + 1 <= tArr.length) {
            System.arraycopy(tArr, i6, tArr, i6 + 1, i5 - i6);
            tArr[i6] = t5;
            return tArr;
        }
        T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), e(i5)));
        System.arraycopy(tArr, 0, tArr2, 0, i6);
        tArr2[i6] = t5;
        System.arraycopy(tArr, i6, tArr2, i6 + 1, tArr.length - i6);
        return tArr2;
    }

    public static boolean[] i(boolean[] zArr, int i5, int i6, boolean z5) {
        if (i5 + 1 <= zArr.length) {
            System.arraycopy(zArr, i6, zArr, i6 + 1, i5 - i6);
            zArr[i6] = z5;
            return zArr;
        }
        boolean[] zArr2 = new boolean[e(i5)];
        System.arraycopy(zArr, 0, zArr2, 0, i6);
        zArr2[i6] = z5;
        System.arraycopy(zArr, i6, zArr2, i6 + 1, zArr.length - i6);
        return zArr2;
    }
}
