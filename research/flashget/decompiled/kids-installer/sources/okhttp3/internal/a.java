package okhttp3.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.text.h0;
import okio.m;

/* compiled from: hostnames.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\u001a\f\u0010\u0001\u001a\u0004\u0018\u00010\u0000*\u00020\u0000\u001a\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0000H\u0002\u001a\"\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002\u001a0\u0010\r\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0005H\u0002\u001a\u0010\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0002¨\u0006\u000f"}, d2 = {"", "e", "", "a", "input", "", "pos", "limit", "Ljava/net/InetAddress;", "c", "", "address", "addressOffset", "b", "d", "okhttp"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class a {
    private static final boolean a(String str) {
        int o32;
        int length = str.length();
        for (int i5 = 0; i5 < length; i5++) {
            char charAt = str.charAt(i5);
            if (l0.t(charAt, 31) <= 0 || l0.t(charAt, 127) >= 0) {
                return true;
            }
            o32 = h0.o3(ProtectedSandApp.s("惃"), charAt, 0, false, 6, null);
            if (o32 != -1) {
                return true;
            }
        }
        return false;
    }

    private static final boolean b(String str, int i5, int i6, byte[] bArr, int i7) {
        int i8 = i7;
        while (i5 < i6) {
            if (i8 == bArr.length) {
                return false;
            }
            if (i8 != i7) {
                if (str.charAt(i5) != '.') {
                    return false;
                }
                i5++;
            }
            int i9 = i5;
            int i10 = 0;
            while (i9 < i6) {
                char charAt = str.charAt(i9);
                if (l0.t(charAt, 48) < 0 || l0.t(charAt, 57) > 0) {
                    break;
                }
                if ((i10 == 0 && i5 != i9) || (i10 = ((i10 * 10) + charAt) - 48) > 255) {
                    return false;
                }
                i9++;
            }
            if (i9 - i5 == 0) {
                return false;
            }
            bArr[i8] = (byte) i10;
            i8++;
            i5 = i9;
        }
        return i8 == i7 + 4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a2, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.net.InetAddress c(java.lang.String r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 187
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.a.c(java.lang.String, int, int):java.net.InetAddress");
    }

    private static final String d(byte[] bArr) {
        int i5 = -1;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i7 < bArr.length) {
            int i9 = i7;
            while (i9 < 16 && bArr[i9] == 0 && bArr[i9 + 1] == 0) {
                i9 += 2;
            }
            int i10 = i9 - i7;
            if (i10 > i8 && i10 >= 4) {
                i5 = i7;
                i8 = i10;
            }
            i7 = i9 + 2;
        }
        m mVar = new m();
        while (i6 < bArr.length) {
            if (i6 == i5) {
                mVar.writeByte(58);
                i6 += i8;
                if (i6 == 16) {
                    mVar.writeByte(58);
                }
            } else {
                if (i6 > 0) {
                    mVar.writeByte(58);
                }
                mVar.w0((d.b(bArr[i6], 255) << 8) | (255 & bArr[i6 + 1]));
                i6 += 2;
            }
        }
        return mVar.L0();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0045  */
    @d5.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String e(@d5.d java.lang.String r5) {
        /*
            java.lang.String r0 = "惇"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r5, r0)
            java.lang.String r0 = "惈"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            r1 = 0
            r2 = 2
            r3 = 0
            boolean r0 = kotlin.text.v.T2(r5, r0, r1, r2, r3)
            r4 = 1
            if (r0 == 0) goto L83
            java.lang.String r0 = "惉"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            boolean r0 = kotlin.text.v.s2(r5, r0, r1, r2, r3)
            if (r0 == 0) goto L3b
            java.lang.String r0 = "惊"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            boolean r0 = kotlin.text.v.J1(r5, r0, r1, r2, r3)
            if (r0 == 0) goto L3b
            int r0 = r5.length()
            int r0 = r0 - r4
            java.net.InetAddress r0 = c(r5, r4, r0)
            goto L43
        L3b:
            int r0 = r5.length()
            java.net.InetAddress r0 = c(r5, r1, r0)
        L43:
            if (r0 == 0) goto L82
            byte[] r1 = r0.getAddress()
            int r2 = r1.length
            r3 = 16
            if (r2 != r3) goto L5c
            java.lang.String r5 = "惋"
            java.lang.String r5 = com.flashget.kidsdownloader.ProtectedSandApp.s(r5)
            kotlin.jvm.internal.l0.o(r1, r5)
            java.lang.String r5 = d(r1)
            return r5
        L5c:
            int r1 = r1.length
            r2 = 4
            if (r1 != r2) goto L65
            java.lang.String r5 = r0.getHostAddress()
            return r5
        L65:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "惌"
            java.lang.String r2 = com.flashget.kidsdownloader.ProtectedSandApp.s(r2)
            r1.<init>(r2)
            r1.append(r5)
            r5 = 39
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        L82:
            return r3
        L83:
            java.lang.String r5 = java.net.IDN.toASCII(r5)     // Catch: java.lang.IllegalArgumentException -> Lc9
            java.lang.String r0 = "惍"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)     // Catch: java.lang.IllegalArgumentException -> Lc9
            kotlin.jvm.internal.l0.o(r5, r0)     // Catch: java.lang.IllegalArgumentException -> Lc9
            java.util.Locale r0 = java.util.Locale.US     // Catch: java.lang.IllegalArgumentException -> Lc9
            java.lang.String r2 = "惎"
            java.lang.String r2 = com.flashget.kidsdownloader.ProtectedSandApp.s(r2)     // Catch: java.lang.IllegalArgumentException -> Lc9
            kotlin.jvm.internal.l0.o(r0, r2)     // Catch: java.lang.IllegalArgumentException -> Lc9
            if (r5 == 0) goto Lbd
            java.lang.String r5 = r5.toLowerCase(r0)     // Catch: java.lang.IllegalArgumentException -> Lc9
            java.lang.String r0 = "惏"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)     // Catch: java.lang.IllegalArgumentException -> Lc9
            kotlin.jvm.internal.l0.o(r5, r0)     // Catch: java.lang.IllegalArgumentException -> Lc9
            int r0 = r5.length()     // Catch: java.lang.IllegalArgumentException -> Lc9
            if (r0 != 0) goto Lb1
            r1 = r4
        Lb1:
            if (r1 == 0) goto Lb4
            return r3
        Lb4:
            boolean r0 = a(r5)     // Catch: java.lang.IllegalArgumentException -> Lc9
            if (r0 == 0) goto Lbb
            goto Lbc
        Lbb:
            r3 = r5
        Lbc:
            return r3
        Lbd:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException     // Catch: java.lang.IllegalArgumentException -> Lc9
            java.lang.String r0 = "惐"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)     // Catch: java.lang.IllegalArgumentException -> Lc9
            r5.<init>(r0)     // Catch: java.lang.IllegalArgumentException -> Lc9
            throw r5     // Catch: java.lang.IllegalArgumentException -> Lc9
        Lc9:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.a.e(java.lang.String):java.lang.String");
    }
}
