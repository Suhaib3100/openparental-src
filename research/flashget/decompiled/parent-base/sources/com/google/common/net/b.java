package com.google.common.net;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.f0;
import com.google.common.base.l0;
import java.io.Serializable;
import java.util.Arrays;

/* compiled from: HostAndPort.java */
@a
@f9.j
@d9.b
/* loaded from: classes6.dex */
public final class b implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    private static final int f57254e = -1;

    /* renamed from: f, reason: collision with root package name */
    private static final long f57255f = 0;

    /* renamed from: b, reason: collision with root package name */
    private final String f57256b;

    /* renamed from: c, reason: collision with root package name */
    private final int f57257c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f57258d;

    private b(String str, int i4, boolean z4) {
        this.f57256b = str;
        this.f57257c = i4;
        this.f57258d = z4;
    }

    public static b a(String str) {
        b c5 = c(str);
        l0.u(!c5.h(), ProtectedSandApp.s("\uf728"), str);
        return c5;
    }

    public static b b(String str, int i4) {
        l0.k(i(i4), ProtectedSandApp.s("\uf729"), i4);
        b c5 = c(str);
        l0.u(!c5.h(), ProtectedSandApp.s("\uf728"), str);
        return new b(c5.f57256b, i4, c5.f57258d);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0046  */
    @f9.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.common.net.b c(java.lang.String r8) {
        /*
            r8.getClass()
            java.lang.String r0 = "\uf72a"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            boolean r0 = r8.startsWith(r0)
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L1d
            java.lang.String[] r0 = e(r8)
            r4 = r0[r3]
            r0 = r0[r2]
        L1a:
            r5 = r4
            r4 = r3
            goto L40
        L1d:
            r0 = 58
            int r4 = r8.indexOf(r0)
            if (r4 < 0) goto L36
            int r5 = r4 + 1
            int r0 = r8.indexOf(r0, r5)
            if (r0 != r1) goto L36
            java.lang.String r4 = r8.substring(r3, r4)
            java.lang.String r0 = r8.substring(r5)
            goto L1a
        L36:
            if (r4 < 0) goto L3a
            r0 = r2
            goto L3b
        L3a:
            r0 = r3
        L3b:
            r4 = 0
            r5 = r8
            r7 = r4
            r4 = r0
            r0 = r7
        L40:
            boolean r6 = com.google.common.base.t0.d(r0)
            if (r6 != 0) goto L95
            java.lang.String r1 = "\uf72b"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
            boolean r1 = r0.startsWith(r1)
            if (r1 != 0) goto L5d
            com.google.common.base.f r1 = com.google.common.base.f.f()
            boolean r1 = r1.C(r0)
            if (r1 == 0) goto L5d
            goto L5e
        L5d:
            r2 = r3
        L5e:
            java.lang.String r1 = "\uf72c"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
            com.google.common.base.l0.u(r2, r1, r8)
            int r1 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L79
            boolean r0 = i(r1)
            java.lang.String r2 = "\uf72d"
            java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)
            com.google.common.base.l0.u(r0, r2, r8)
            goto L95
        L79:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r8.length()
            java.lang.String r2 = "\uf72e"
            java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)
            if (r1 == 0) goto L8c
            java.lang.String r8 = r2.concat(r8)
            goto L91
        L8c:
            java.lang.String r8 = new java.lang.String
            r8.<init>(r2)
        L91:
            r0.<init>(r8)
            throw r0
        L95:
            com.google.common.net.b r8 = new com.google.common.net.b
            r8.<init>(r5, r1, r4)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.net.b.c(java.lang.String):com.google.common.net.b");
    }

    private static String[] e(String str) {
        l0.u(str.charAt(0) == '[', ProtectedSandApp.s("\uf72f"), str);
        int indexOf = str.indexOf(58);
        int lastIndexOf = str.lastIndexOf(93);
        l0.u(indexOf > -1 && lastIndexOf > indexOf, ProtectedSandApp.s("\uf730"), str);
        String substring = str.substring(1, lastIndexOf);
        int i4 = lastIndexOf + 1;
        if (i4 == str.length()) {
            return new String[]{substring, ""};
        }
        l0.u(str.charAt(i4) == ':', ProtectedSandApp.s("\uf731"), str);
        int i5 = lastIndexOf + 2;
        for (int i6 = i5; i6 < str.length(); i6++) {
            l0.u(Character.isDigit(str.charAt(i6)), ProtectedSandApp.s("\uf732"), str);
        }
        return new String[]{substring, str.substring(i5)};
    }

    private static boolean i(int i4) {
        return i4 >= 0 && i4 <= 65535;
    }

    public String d() {
        return this.f57256b;
    }

    public boolean equals(@zc.a Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return f0.a(this.f57256b, bVar.f57256b) && this.f57257c == bVar.f57257c;
    }

    public int f() {
        l0.g0(h());
        return this.f57257c;
    }

    public int g(int i4) {
        return h() ? this.f57257c : i4;
    }

    public boolean h() {
        return this.f57257c >= 0;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f57256b, Integer.valueOf(this.f57257c)});
    }

    @f9.a
    public b j() {
        l0.u(!this.f57258d, ProtectedSandApp.s("\uf733"), this.f57256b);
        return this;
    }

    public b k(int i4) {
        l0.d(i(i4));
        return h() ? this : new b(this.f57256b, i4, this.f57258d);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(this.f57256b.length() + 8);
        if (this.f57256b.indexOf(58) >= 0) {
            sb.append('[');
            sb.append(this.f57256b);
            sb.append(']');
        } else {
            sb.append(this.f57256b);
        }
        if (h()) {
            sb.append(':');
            sb.append(this.f57257c);
        }
        return sb.toString();
    }
}
