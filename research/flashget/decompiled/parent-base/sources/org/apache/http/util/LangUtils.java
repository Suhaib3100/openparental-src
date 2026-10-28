package org.apache.http.util;

/* loaded from: classes3.dex */
public final class LangUtils {
    public static final int HASH_OFFSET = 37;
    public static final int HASH_SEED = 17;

    private LangUtils() {
    }

    public static boolean equals(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static int hashCode(int i4, int i5) {
        return (i4 * 37) + i5;
    }

    public static boolean equals(Object[] objArr, Object[] objArr2) {
        if (objArr == null) {
            return objArr2 == null;
        }
        if (objArr2 == null || objArr.length != objArr2.length) {
            return false;
        }
        for (int i4 = 0; i4 < objArr.length; i4++) {
            if (!equals(objArr[i4], objArr2[i4])) {
                return false;
            }
        }
        return true;
    }

    public static int hashCode(int i4, boolean z4) {
        return hashCode(i4, z4 ? 1 : 0);
    }

    public static int hashCode(int i4, Object obj) {
        return hashCode(i4, obj != null ? obj.hashCode() : 0);
    }
}
