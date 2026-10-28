package com.google.android.gms.common.util;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@VisibleForTesting
@KeepForSdk
/* loaded from: classes2.dex */
public final class ArrayUtils {
    private ArrayUtils() {
    }

    @o0
    @KeepForSdk
    public static <T> T[] concat(@o0 T[]... tArr) {
        if (tArr.length == 0) {
            return (T[]) ((Object[]) Array.newInstance(tArr.getClass(), 0));
        }
        int i5 = 0;
        for (T[] tArr2 : tArr) {
            i5 += tArr2.length;
        }
        T[] tArr3 = (T[]) Arrays.copyOf(tArr[0], i5);
        int length = tArr[0].length;
        for (int i6 = 1; i6 < tArr.length; i6++) {
            T[] tArr4 = tArr[i6];
            int length2 = tArr4.length;
            System.arraycopy(tArr4, 0, tArr3, length, length2);
            length += length2;
        }
        return tArr3;
    }

    @o0
    @KeepForSdk
    public static byte[] concatByteArrays(@o0 byte[]... bArr) {
        if (bArr.length == 0) {
            return new byte[0];
        }
        int i5 = 0;
        for (byte[] bArr2 : bArr) {
            i5 += bArr2.length;
        }
        byte[] copyOf = Arrays.copyOf(bArr[0], i5);
        int length = bArr[0].length;
        for (int i6 = 1; i6 < bArr.length; i6++) {
            byte[] bArr3 = bArr[i6];
            int length2 = bArr3.length;
            System.arraycopy(bArr3, 0, copyOf, length, length2);
            length += length2;
        }
        return copyOf;
    }

    @KeepForSdk
    public static boolean contains(@o0 int[] iArr, int i5) {
        if (iArr == null) {
            return false;
        }
        for (int i6 : iArr) {
            if (i6 == i5) {
                return true;
            }
        }
        return false;
    }

    @o0
    @KeepForSdk
    public static <T> ArrayList<T> newArrayList() {
        return new ArrayList<>();
    }

    @q0
    @KeepForSdk
    public static <T> T[] removeAll(@o0 T[] tArr, @o0 T... tArr2) {
        int length;
        int i5;
        if (tArr == null) {
            return null;
        }
        if (tArr2 == null || (length = tArr2.length) == 0) {
            return (T[]) Arrays.copyOf(tArr, tArr.length);
        }
        T[] tArr3 = (T[]) ((Object[]) Array.newInstance(tArr2.getClass().getComponentType(), tArr.length));
        if (length == 1) {
            i5 = 0;
            for (T t5 : tArr) {
                if (!Objects.equal(tArr2[0], t5)) {
                    tArr3[i5] = t5;
                    i5++;
                }
            }
        } else {
            int i6 = 0;
            for (T t6 : tArr) {
                if (!contains(tArr2, t6)) {
                    tArr3[i6] = t6;
                    i6++;
                }
            }
            i5 = i6;
        }
        if (tArr3 == null) {
            return null;
        }
        return i5 == tArr3.length ? tArr3 : (T[]) Arrays.copyOf(tArr3, i5);
    }

    @o0
    @KeepForSdk
    public static <T> ArrayList<T> toArrayList(@o0 T[] tArr) {
        ArrayList<T> arrayList = new ArrayList<>(tArr.length);
        for (T t5 : tArr) {
            arrayList.add(t5);
        }
        return arrayList;
    }

    @o0
    @KeepForSdk
    public static int[] toPrimitiveArray(@o0 Collection<Integer> collection) {
        int i5 = 0;
        if (collection == null || collection.isEmpty()) {
            return new int[0];
        }
        int[] iArr = new int[collection.size()];
        Iterator<Integer> it = collection.iterator();
        while (it.hasNext()) {
            iArr[i5] = it.next().intValue();
            i5++;
        }
        return iArr;
    }

    @q0
    @KeepForSdk
    public static Integer[] toWrapperArray(@o0 int[] iArr) {
        if (iArr == null) {
            return null;
        }
        int length = iArr.length;
        Integer[] numArr = new Integer[length];
        for (int i5 = 0; i5 < length; i5++) {
            numArr[i5] = Integer.valueOf(iArr[i5]);
        }
        return numArr;
    }

    @KeepForSdk
    public static void writeArray(@o0 StringBuilder sb, @o0 double[] dArr) {
        int length = dArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            if (i5 != 0) {
                sb.append(ProtectedSandApp.s("ళ"));
            }
            sb.append(Double.toString(dArr[i5]));
        }
    }

    @KeepForSdk
    public static void writeStringArray(@o0 StringBuilder sb, @o0 String[] strArr) {
        int length = strArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            if (i5 != 0) {
                sb.append(ProtectedSandApp.s("హ"));
            }
            String s5 = ProtectedSandApp.s("\u0c3a");
            sb.append(s5);
            sb.append(strArr[i5]);
            sb.append(s5);
        }
    }

    @KeepForSdk
    public static <T> boolean contains(@o0 T[] tArr, @o0 T t5) {
        int length = tArr != null ? tArr.length : 0;
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                break;
            }
            if (!Objects.equal(tArr[i5], t5)) {
                i5++;
            } else if (i5 >= 0) {
                return true;
            }
        }
        return false;
    }

    @KeepForSdk
    public static void writeArray(@o0 StringBuilder sb, @o0 float[] fArr) {
        int length = fArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            if (i5 != 0) {
                sb.append(ProtectedSandApp.s("ఴ"));
            }
            sb.append(Float.toString(fArr[i5]));
        }
    }

    @KeepForSdk
    public static void writeArray(@o0 StringBuilder sb, @o0 int[] iArr) {
        int length = iArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            if (i5 != 0) {
                sb.append(ProtectedSandApp.s("వ"));
            }
            sb.append(Integer.toString(iArr[i5]));
        }
    }

    @KeepForSdk
    public static void writeArray(@o0 StringBuilder sb, @o0 long[] jArr) {
        int length = jArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            if (i5 != 0) {
                sb.append(ProtectedSandApp.s("శ"));
            }
            sb.append(Long.toString(jArr[i5]));
        }
    }

    @KeepForSdk
    public static <T> void writeArray(@o0 StringBuilder sb, @o0 T[] tArr) {
        int length = tArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            if (i5 != 0) {
                sb.append(ProtectedSandApp.s("ష"));
            }
            sb.append(tArr[i5]);
        }
    }

    @KeepForSdk
    public static void writeArray(@o0 StringBuilder sb, @o0 boolean[] zArr) {
        int length = zArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            if (i5 != 0) {
                sb.append(ProtectedSandApp.s("స"));
            }
            sb.append(Boolean.toString(zArr[i5]));
        }
    }
}
