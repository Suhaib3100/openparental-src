package androidx.collection;

import java.lang.reflect.Array;

/* compiled from: ArraySetJvmUtil.java */
/* loaded from: classes.dex */
class e {
    private e() {
    }

    static <T> T[] a(T[] tArr, int i4) {
        if (tArr.length < i4) {
            return (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i4));
        }
        if (tArr.length > i4) {
            tArr[i4] = null;
        }
        return tArr;
    }
}
