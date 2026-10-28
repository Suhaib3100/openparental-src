package com.google.common.net;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.d0;
import com.google.common.base.l0;
import com.google.common.hash.s;
import java.math.BigInteger;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import kotlin.g2;

/* compiled from: InetAddresses.java */
@com.google.common.net.a
@d9.c
/* loaded from: classes6.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final int f57346a = 4;

    /* renamed from: b, reason: collision with root package name */
    private static final int f57347b = 8;

    /* renamed from: c, reason: collision with root package name */
    private static final char f57348c = '.';

    /* renamed from: e, reason: collision with root package name */
    private static final com.google.common.base.f f57350e = com.google.common.base.f.q('.');

    /* renamed from: d, reason: collision with root package name */
    private static final char f57349d = ':';

    /* renamed from: f, reason: collision with root package name */
    private static final com.google.common.base.f f57351f = com.google.common.base.f.q(f57349d);

    /* renamed from: g, reason: collision with root package name */
    private static final Inet4Address f57352g = (Inet4Address) g(ProtectedSandApp.s("\uf7d7"));

    /* renamed from: h, reason: collision with root package name */
    private static final Inet4Address f57353h = (Inet4Address) g(ProtectedSandApp.s("\uf7d8"));

    /* compiled from: InetAddresses.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Inet4Address f57354a;

        /* renamed from: b, reason: collision with root package name */
        private final Inet4Address f57355b;

        /* renamed from: c, reason: collision with root package name */
        private final int f57356c;

        /* renamed from: d, reason: collision with root package name */
        private final int f57357d;

        public a(@zc.a Inet4Address inet4Address, @zc.a Inet4Address inet4Address2, int i4, int i5) {
            boolean z4 = false;
            l0.k(i4 >= 0 && i4 <= 65535, ProtectedSandApp.s("\uf7d5"), i4);
            if (i5 >= 0 && i5 <= 65535) {
                z4 = true;
            }
            l0.k(z4, ProtectedSandApp.s("\uf7d6"), i5);
            this.f57354a = (Inet4Address) d0.a(inet4Address, e.f57353h);
            this.f57355b = (Inet4Address) d0.a(inet4Address2, e.f57353h);
            this.f57356c = i4;
            this.f57357d = i5;
        }

        public Inet4Address a() {
            return this.f57355b;
        }

        public int b() {
            return this.f57357d;
        }

        public int c() {
            return this.f57356c;
        }

        public Inet4Address d() {
            return this.f57354a;
        }
    }

    private e() {
    }

    public static boolean A(Inet6Address inet6Address) {
        byte[] address = inet6Address.getAddress();
        return address[0] == 32 && address[1] == 2;
    }

    public static boolean B(Inet6Address inet6Address) {
        byte b5;
        if (!inet6Address.isIPv4CompatibleAddress()) {
            return false;
        }
        byte[] address = inet6Address.getAddress();
        return (address[12] == 0 && address[13] == 0 && address[14] == 0 && ((b5 = address[15]) == 0 || b5 == 1)) ? false : true;
    }

    public static boolean C(String str) {
        return z(str) != null;
    }

    public static boolean D(Inet6Address inet6Address) {
        if (G(inet6Address)) {
            return false;
        }
        byte[] address = inet6Address.getAddress();
        return (address[8] | 3) == 3 && address[9] == 0 && address[10] == 94 && address[11] == -2;
    }

    public static boolean E(String str) {
        byte[] z4 = z(str);
        if (z4 == null || z4.length != 16) {
            return false;
        }
        int i4 = 0;
        while (true) {
            if (i4 >= 10) {
                for (int i5 = 10; i5 < 12; i5++) {
                    if (z4[i5] != -1) {
                        return false;
                    }
                }
                return true;
            }
            if (z4[i4] != 0) {
                return false;
            }
            i4++;
        }
    }

    public static boolean F(InetAddress inetAddress) {
        for (byte b5 : inetAddress.getAddress()) {
            if (b5 != -1) {
                return false;
            }
        }
        return true;
    }

    public static boolean G(Inet6Address inet6Address) {
        byte[] address = inet6Address.getAddress();
        return address[0] == 32 && address[1] == 1 && address[2] == 0 && address[3] == 0;
    }

    public static boolean H(String str) {
        return i(str) != null;
    }

    private static short I(String str, int i4, int i5) {
        int i6 = i5 - i4;
        if (i6 <= 0 || i6 > 4) {
            throw new NumberFormatException();
        }
        int i7 = 0;
        while (i4 < i5) {
            i7 = (i7 << 4) | Character.digit(str.charAt(i4), 16);
            i4++;
        }
        return (short) i7;
    }

    private static byte J(String str, int i4, int i5) {
        int i6 = i5 - i4;
        if (i6 <= 0 || i6 > 3) {
            throw new NumberFormatException();
        }
        if (i6 > 1 && str.charAt(i4) == '0') {
            throw new NumberFormatException();
        }
        int i7 = 0;
        while (i4 < i5) {
            int i10 = i7 * 10;
            int digit = Character.digit(str.charAt(i4), 10);
            if (digit < 0) {
                throw new NumberFormatException();
            }
            i7 = i10 + digit;
            i4++;
        }
        if (i7 <= 255) {
            return (byte) i7;
        }
        throw new NumberFormatException();
    }

    @zc.a
    private static byte[] K(String str) {
        if (f57350e.i(str) + 1 != 4) {
            return null;
        }
        byte[] bArr = new byte[4];
        int i4 = 0;
        for (int i5 = 0; i5 < 4; i5++) {
            int indexOf = str.indexOf(46, i4);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            try {
                bArr[i5] = J(str, i4, indexOf);
                i4 = indexOf + 1;
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return bArr;
    }

    @zc.a
    private static byte[] L(String str) {
        int i4 = f57351f.i(str);
        if (i4 >= 2 && i4 <= 8) {
            int i5 = 1;
            int i6 = i4 + 1;
            int i7 = 8 - i6;
            boolean z4 = false;
            for (int i10 = 0; i10 < str.length() - 1; i10++) {
                if (str.charAt(i10) == ':' && str.charAt(i10 + 1) == ':') {
                    if (z4) {
                        return null;
                    }
                    int i11 = i7 + 1;
                    if (i10 == 0) {
                        i11 = i7 + 2;
                    }
                    if (i10 == str.length() - 2) {
                        i11++;
                    }
                    i7 = i11;
                    z4 = true;
                }
            }
            if (str.charAt(0) == ':' && str.charAt(1) != ':') {
                return null;
            }
            if (str.charAt(str.length() - 1) == ':' && str.charAt(str.length() - 2) != ':') {
                return null;
            }
            if (z4 && i7 <= 0) {
                return null;
            }
            if (!z4 && i6 != 8) {
                return null;
            }
            ByteBuffer allocate = ByteBuffer.allocate(16);
            try {
                if (str.charAt(0) != ':') {
                    i5 = 0;
                }
                while (i5 < str.length()) {
                    int indexOf = str.indexOf(58, i5);
                    if (indexOf == -1) {
                        indexOf = str.length();
                    }
                    if (str.charAt(i5) == ':') {
                        for (int i12 = 0; i12 < i7; i12++) {
                            allocate.putShort((short) 0);
                        }
                    } else {
                        allocate.putShort(I(str, i5, indexOf));
                    }
                    i5 = indexOf + 1;
                }
                return allocate.array();
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public static String M(InetAddress inetAddress) {
        inetAddress.getClass();
        if (inetAddress instanceof Inet4Address) {
            return inetAddress.getHostAddress();
        }
        l0.d(inetAddress instanceof Inet6Address);
        byte[] address = inetAddress.getAddress();
        int[] iArr = new int[8];
        for (int i4 = 0; i4 < 8; i4++) {
            int i5 = i4 * 2;
            iArr[i4] = com.google.common.primitives.l.k((byte) 0, (byte) 0, address[i5], address[i5 + 1]);
        }
        d(iArr);
        return x(iArr);
    }

    public static BigInteger N(InetAddress inetAddress) {
        return new BigInteger(1, inetAddress.getAddress());
    }

    public static String O(InetAddress inetAddress) {
        if (!(inetAddress instanceof Inet6Address)) {
            return M(inetAddress);
        }
        String M = M(inetAddress);
        return com.google.common.base.h.a(com.google.android.gms.common.internal.b.a(M, 2), ProtectedSandApp.s("\uf7d9"), M, ProtectedSandApp.s("\uf7da"));
    }

    private static InetAddress b(byte[] bArr) {
        try {
            return InetAddress.getByAddress(bArr);
        } catch (UnknownHostException e4) {
            throw new AssertionError(e4);
        }
    }

    public static int c(InetAddress inetAddress) {
        return com.google.common.io.g.h(q(inetAddress).getAddress()).readInt();
    }

    private static void d(int[] iArr) {
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        for (int i7 = 0; i7 < iArr.length + 1; i7++) {
            if (i7 >= iArr.length || iArr[i7] != 0) {
                if (i6 >= 0) {
                    int i10 = i7 - i6;
                    if (i10 > i4) {
                        i5 = i6;
                        i4 = i10;
                    }
                    i6 = -1;
                }
            } else if (i6 < 0) {
                i6 = i7;
            }
        }
        if (i4 >= 2) {
            Arrays.fill(iArr, i5, i4 + i5, -1);
        }
    }

    @zc.a
    private static String e(String str) {
        int lastIndexOf = str.lastIndexOf(58) + 1;
        String substring = str.substring(0, lastIndexOf);
        byte[] K = K(str.substring(lastIndexOf));
        if (K == null) {
            return null;
        }
        String hexString = Integer.toHexString(((K[0] & 255) << 8) | (K[1] & 255));
        String hexString2 = Integer.toHexString((K[3] & 255) | ((K[2] & 255) << 8));
        return com.google.common.base.e.a(com.google.android.gms.common.internal.b.a(hexString2, com.google.android.gms.common.internal.b.a(hexString, com.google.android.gms.common.internal.b.a(substring, 1))), substring, hexString, ProtectedSandApp.s("\uf7db"), hexString2);
    }

    public static InetAddress f(InetAddress inetAddress) {
        byte[] address = inetAddress.getAddress();
        int length = address.length - 1;
        while (length >= 0 && address[length] == 0) {
            address[length] = -1;
            length--;
        }
        l0.u(length >= 0, ProtectedSandApp.s("\uf7dc"), inetAddress);
        address[length] = (byte) (address[length] - 1);
        return b(address);
    }

    @f9.a
    public static InetAddress g(String str) {
        byte[] z4 = z(str);
        if (z4 != null) {
            return b(z4);
        }
        throw j(ProtectedSandApp.s("\uf7dd"), str);
    }

    public static InetAddress h(String str) {
        InetAddress i4 = i(str);
        if (i4 != null) {
            return i4;
        }
        throw j(ProtectedSandApp.s("\uf7de"), str);
    }

    @zc.a
    private static InetAddress i(String str) {
        int i4;
        str.getClass();
        if (str.startsWith(ProtectedSandApp.s("\uf7d9")) && str.endsWith(ProtectedSandApp.s("\uf7da"))) {
            str = androidx.core.content.f.a(str, 1, 1);
            i4 = 16;
        } else {
            i4 = 4;
        }
        byte[] z4 = z(str);
        if (z4 == null || z4.length != i4) {
            return null;
        }
        return b(z4);
    }

    private static IllegalArgumentException j(String str, Object... objArr) {
        return new IllegalArgumentException(String.format(Locale.ROOT, str, objArr));
    }

    private static InetAddress k(BigInteger bigInteger, boolean z4) {
        l0.e(bigInteger.signum() >= 0, ProtectedSandApp.s("\uf7df"));
        int i4 = z4 ? 16 : 4;
        byte[] byteArray = bigInteger.toByteArray();
        byte[] bArr = new byte[i4];
        int max = Math.max(0, byteArray.length - i4);
        int length = byteArray.length - max;
        int i5 = i4 - length;
        for (int i6 = 0; i6 < max; i6++) {
            if (byteArray[i6] != 0) {
                throw j(ProtectedSandApp.s("\uf7e0"), Integer.valueOf(i4), bigInteger);
            }
        }
        System.arraycopy(byteArray, max, bArr, i5, length);
        try {
            return InetAddress.getByAddress(bArr);
        } catch (UnknownHostException e4) {
            throw new AssertionError(e4);
        }
    }

    public static Inet4Address l(BigInteger bigInteger) {
        return (Inet4Address) k(bigInteger, false);
    }

    public static Inet6Address m(BigInteger bigInteger) {
        return (Inet6Address) k(bigInteger, true);
    }

    public static Inet4Address n(int i4) {
        return t(com.google.common.primitives.l.C(i4));
    }

    public static InetAddress o(byte[] bArr) throws UnknownHostException {
        byte[] bArr2 = new byte[bArr.length];
        for (int i4 = 0; i4 < bArr.length; i4++) {
            bArr2[i4] = bArr[(bArr.length - i4) - 1];
        }
        return InetAddress.getByAddress(bArr2);
    }

    public static Inet4Address p(Inet6Address inet6Address) {
        l0.u(A(inet6Address), ProtectedSandApp.s("\uf7e1"), M(inet6Address));
        return t(Arrays.copyOfRange(inet6Address.getAddress(), 2, 6));
    }

    public static Inet4Address q(InetAddress inetAddress) {
        boolean z4;
        if (inetAddress instanceof Inet4Address) {
            return (Inet4Address) inetAddress;
        }
        byte[] address = inetAddress.getAddress();
        int i4 = 0;
        while (true) {
            if (i4 >= 15) {
                z4 = true;
                break;
            }
            if (address[i4] != 0) {
                z4 = false;
                break;
            }
            i4++;
        }
        if (z4 && address[15] == 1) {
            return f57352g;
        }
        if (z4 && address[15] == 0) {
            return f57353h;
        }
        Inet6Address inet6Address = (Inet6Address) inetAddress;
        int b5 = s.B().j(w(inet6Address) ? s(inet6Address).hashCode() : ByteBuffer.wrap(inet6Address.getAddress(), 0, 8).getLong()).b() | (-536870912);
        if (b5 == -1) {
            b5 = -2;
        }
        return t(com.google.common.primitives.l.C(b5));
    }

    public static Inet4Address r(Inet6Address inet6Address) {
        l0.u(B(inet6Address), ProtectedSandApp.s("\uf7e2"), M(inet6Address));
        return t(Arrays.copyOfRange(inet6Address.getAddress(), 12, 16));
    }

    public static Inet4Address s(Inet6Address inet6Address) {
        if (B(inet6Address)) {
            return r(inet6Address);
        }
        if (A(inet6Address)) {
            return p(inet6Address);
        }
        if (G(inet6Address)) {
            return v(inet6Address).a();
        }
        throw j(ProtectedSandApp.s("\uf7e3"), M(inet6Address));
    }

    private static Inet4Address t(byte[] bArr) {
        l0.k(bArr.length == 4, ProtectedSandApp.s("\uf7e4"), bArr.length);
        return (Inet4Address) b(bArr);
    }

    public static Inet4Address u(Inet6Address inet6Address) {
        l0.u(D(inet6Address), ProtectedSandApp.s("\uf7e5"), M(inet6Address));
        return t(Arrays.copyOfRange(inet6Address.getAddress(), 12, 16));
    }

    public static a v(Inet6Address inet6Address) {
        l0.u(G(inet6Address), ProtectedSandApp.s("\uf7e6"), M(inet6Address));
        byte[] address = inet6Address.getAddress();
        Inet4Address t4 = t(Arrays.copyOfRange(address, 4, 8));
        int readShort = com.google.common.io.g.i(address, 8).readShort() & g2.f75095e;
        int i4 = 65535 & (~com.google.common.io.g.i(address, 10).readShort());
        byte[] copyOfRange = Arrays.copyOfRange(address, 12, 16);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) (~copyOfRange[i5]);
        }
        return new a(t4, t(copyOfRange), i4, readShort);
    }

    public static boolean w(Inet6Address inet6Address) {
        return B(inet6Address) || A(inet6Address) || G(inet6Address);
    }

    private static String x(int[] iArr) {
        StringBuilder sb = new StringBuilder(39);
        int i4 = 0;
        boolean z4 = false;
        while (i4 < iArr.length) {
            boolean z5 = iArr[i4] >= 0;
            if (z5) {
                if (z4) {
                    sb.append(f57349d);
                }
                sb.append(Integer.toHexString(iArr[i4]));
            } else if (i4 == 0 || z4) {
                sb.append(ProtectedSandApp.s("\uf7e7"));
            }
            i4++;
            z4 = z5;
        }
        return sb.toString();
    }

    public static InetAddress y(InetAddress inetAddress) {
        byte[] address = inetAddress.getAddress();
        int length = address.length - 1;
        while (true) {
            if (length < 0 || address[length] != -1) {
                break;
            }
            address[length] = 0;
            length--;
        }
        l0.u(length >= 0, ProtectedSandApp.s("\uf7e8"), inetAddress);
        address[length] = (byte) (address[length] + 1);
        return b(address);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0032, code lost:
    
        if (r3 == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0034, code lost:
    
        if (r2 == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0036, code lost:
    
        r9 = e(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003a, code lost:
    
        if (r9 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x003c, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x003d, code lost:
    
        if (r1 == (-1)) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x003f, code lost:
    
        r9 = r9.substring(0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0047, code lost:
    
        return L(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0048, code lost:
    
        if (r2 == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004a, code lost:
    
        if (r1 == (-1)) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x004c, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0051, code lost:
    
        return K(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0052, code lost:
    
        return null;
     */
    @zc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static byte[] z(java.lang.String r9) {
        /*
            r0 = 0
            r1 = r0
            r2 = r1
            r3 = r2
        L4:
            int r4 = r9.length()
            r5 = 0
            r6 = -1
            if (r1 >= r4) goto L31
            char r4 = r9.charAt(r1)
            r7 = 46
            r8 = 1
            if (r4 != r7) goto L17
            r2 = r8
            goto L2e
        L17:
            r7 = 58
            if (r4 != r7) goto L20
            if (r2 == 0) goto L1e
            return r5
        L1e:
            r3 = r8
            goto L2e
        L20:
            r7 = 37
            if (r4 != r7) goto L25
            goto L32
        L25:
            r7 = 16
            int r4 = java.lang.Character.digit(r4, r7)
            if (r4 != r6) goto L2e
            return r5
        L2e:
            int r1 = r1 + 1
            goto L4
        L31:
            r1 = r6
        L32:
            if (r3 == 0) goto L48
            if (r2 == 0) goto L3d
            java.lang.String r9 = e(r9)
            if (r9 != 0) goto L3d
            return r5
        L3d:
            if (r1 == r6) goto L43
            java.lang.String r9 = r9.substring(r0, r1)
        L43:
            byte[] r9 = L(r9)
            return r9
        L48:
            if (r2 == 0) goto L52
            if (r1 == r6) goto L4d
            return r5
        L4d:
            byte[] r9 = K(r9)
            return r9
        L52:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.net.e.z(java.lang.String):byte[]");
    }
}
