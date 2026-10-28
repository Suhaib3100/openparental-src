package com.google.common.math;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.math.BigInteger;
import java.math.RoundingMode;

/* compiled from: MathPreconditions.java */
@e
@f9.a
@d9.b
/* loaded from: classes6.dex */
final class i {
    private i() {
    }

    static void a(boolean z4, double d5, RoundingMode roundingMode) {
        if (z4) {
            return;
        }
        String valueOf = String.valueOf(roundingMode);
        StringBuilder sb = new StringBuilder(valueOf.length() + 83);
        sb.append(ProtectedSandApp.s("\uf70e"));
        sb.append(d5);
        sb.append(ProtectedSandApp.s("\uf70f"));
        sb.append(valueOf);
        throw new ArithmeticException(sb.toString());
    }

    static void b(boolean z4, String str, int i4, int i5) {
        if (z4) {
            return;
        }
        StringBuilder sb = new StringBuilder(com.google.android.gms.common.internal.b.a(str, 36));
        sb.append(ProtectedSandApp.s("\uf710"));
        sb.append(str);
        sb.append(ProtectedSandApp.s("\uf711"));
        sb.append(i4);
        sb.append(ProtectedSandApp.s("\uf712"));
        sb.append(i5);
        sb.append(ProtectedSandApp.s("\uf713"));
        throw new ArithmeticException(sb.toString());
    }

    static void c(boolean z4, String str, long j4, long j5) {
        if (z4) {
            return;
        }
        StringBuilder sb = new StringBuilder(com.google.android.gms.common.internal.b.a(str, 54));
        sb.append(ProtectedSandApp.s("\uf710"));
        sb.append(str);
        sb.append(ProtectedSandApp.s("\uf711"));
        sb.append(j4);
        sb.append(ProtectedSandApp.s("\uf712"));
        sb.append(j5);
        sb.append(ProtectedSandApp.s("\uf713"));
        throw new ArithmeticException(sb.toString());
    }

    static double d(String str, double d5) {
        if (d5 >= com.google.firebase.remoteconfig.p.f60679p) {
            return d5;
        }
        StringBuilder sb = new StringBuilder(com.google.android.gms.common.internal.b.a(str, 40));
        sb.append(str);
        sb.append(ProtectedSandApp.s("\uf714"));
        sb.append(d5);
        sb.append(ProtectedSandApp.s("\uf715"));
        throw new IllegalArgumentException(sb.toString());
    }

    static int e(String str, int i4) {
        if (i4 >= 0) {
            return i4;
        }
        StringBuilder sb = new StringBuilder(com.google.android.gms.common.internal.b.a(str, 27));
        sb.append(str);
        sb.append(ProtectedSandApp.s("\uf714"));
        sb.append(i4);
        sb.append(ProtectedSandApp.s("\uf715"));
        throw new IllegalArgumentException(sb.toString());
    }

    static long f(String str, long j4) {
        if (j4 >= 0) {
            return j4;
        }
        StringBuilder sb = new StringBuilder(com.google.android.gms.common.internal.b.a(str, 36));
        sb.append(str);
        sb.append(ProtectedSandApp.s("\uf714"));
        sb.append(j4);
        sb.append(ProtectedSandApp.s("\uf715"));
        throw new IllegalArgumentException(sb.toString());
    }

    static BigInteger g(String str, BigInteger bigInteger) {
        if (bigInteger.signum() >= 0) {
            return bigInteger;
        }
        String valueOf = String.valueOf(bigInteger);
        throw new IllegalArgumentException(com.google.common.base.e.a(valueOf.length() + com.google.android.gms.common.internal.b.a(str, 16), str, ProtectedSandApp.s("\uf714"), valueOf, ProtectedSandApp.s("\uf715")));
    }

    static int h(String str, int i4) {
        if (i4 > 0) {
            return i4;
        }
        StringBuilder sb = new StringBuilder(com.google.android.gms.common.internal.b.a(str, 26));
        sb.append(str);
        sb.append(ProtectedSandApp.s("\uf714"));
        sb.append(i4);
        sb.append(ProtectedSandApp.s("\uf716"));
        throw new IllegalArgumentException(sb.toString());
    }

    static long i(String str, long j4) {
        if (j4 > 0) {
            return j4;
        }
        StringBuilder sb = new StringBuilder(com.google.android.gms.common.internal.b.a(str, 35));
        sb.append(str);
        sb.append(ProtectedSandApp.s("\uf714"));
        sb.append(j4);
        sb.append(ProtectedSandApp.s("\uf716"));
        throw new IllegalArgumentException(sb.toString());
    }

    static BigInteger j(String str, BigInteger bigInteger) {
        if (bigInteger.signum() > 0) {
            return bigInteger;
        }
        String valueOf = String.valueOf(bigInteger);
        throw new IllegalArgumentException(com.google.common.base.e.a(valueOf.length() + com.google.android.gms.common.internal.b.a(str, 15), str, ProtectedSandApp.s("\uf714"), valueOf, ProtectedSandApp.s("\uf716")));
    }

    static void k(boolean z4) {
        if (!z4) {
            throw new ArithmeticException(ProtectedSandApp.s("\uf717"));
        }
    }
}
