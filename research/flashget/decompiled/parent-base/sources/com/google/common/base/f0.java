package com.google.common.base;

import java.util.Arrays;

/* compiled from: Objects.java */
@o
@d9.b
/* loaded from: classes6.dex */
public final class f0 extends r {
    private f0() {
    }

    public static boolean a(@zc.a Object obj, @zc.a Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int b(@zc.a Object... objArr) {
        return Arrays.hashCode(objArr);
    }
}
