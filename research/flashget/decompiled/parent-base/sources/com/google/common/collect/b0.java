package com.google.common.collect;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: CollectPreconditions.java */
@w0
@d9.b
/* loaded from: classes6.dex */
final class b0 {
    b0() {
    }

    static void a(Object obj, Object obj2) {
        if (obj == null) {
            String valueOf = String.valueOf(obj2);
            throw new NullPointerException(com.google.common.base.i.a(valueOf.length() + 24, ProtectedSandApp.s("\uf456"), valueOf));
        }
        if (obj2 != null) {
            return;
        }
        String valueOf2 = String.valueOf(obj);
        throw new NullPointerException(com.google.common.base.h.a(valueOf2.length() + 26, ProtectedSandApp.s("\uf454"), valueOf2, ProtectedSandApp.s("\uf455")));
    }

    @f9.a
    static int b(int i4, String str) {
        if (i4 >= 0) {
            return i4;
        }
        StringBuilder sb = new StringBuilder(com.google.android.gms.common.internal.b.a(str, 40));
        sb.append(str);
        sb.append(ProtectedSandApp.s("\uf457"));
        sb.append(i4);
        throw new IllegalArgumentException(sb.toString());
    }

    @f9.a
    static long c(long j4, String str) {
        if (j4 >= 0) {
            return j4;
        }
        StringBuilder sb = new StringBuilder(com.google.android.gms.common.internal.b.a(str, 49));
        sb.append(str);
        sb.append(ProtectedSandApp.s("\uf457"));
        sb.append(j4);
        throw new IllegalArgumentException(sb.toString());
    }

    static void d(int i4, String str) {
        if (i4 > 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(com.google.android.gms.common.internal.b.a(str, 38));
        sb.append(str);
        sb.append(ProtectedSandApp.s("\uf458"));
        sb.append(i4);
        throw new IllegalArgumentException(sb.toString());
    }

    static void e(boolean z4) {
        com.google.common.base.l0.h0(z4, ProtectedSandApp.s("\uf459"));
    }
}
