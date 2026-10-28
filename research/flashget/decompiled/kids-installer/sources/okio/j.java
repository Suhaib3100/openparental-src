package okio;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.UShort;

/* compiled from: -Util.kt */
@p3.i(name = "-Util")
@Metadata(d1 = {"\u0000:\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\b\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0000\u001a\f\u0010\u0007\u001a\u00020\u0006*\u00020\u0006H\u0000\u001a\f\u0010\t\u001a\u00020\b*\u00020\bH\u0000\u001a\f\u0010\n\u001a\u00020\u0000*\u00020\u0000H\u0000\u001a\u0015\u0010\r\u001a\u00020\b*\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH\u0080\f\u001a\u0015\u0010\u000e\u001a\u00020\b*\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH\u0080\f\u001a\u0015\u0010\u000f\u001a\u00020\b*\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH\u0080\f\u001a\u0015\u0010\u0010\u001a\u00020\u0000*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0000H\u0080\f\u001a\u0015\u0010\u0011\u001a\u00020\u0000*\u00020\b2\u0006\u0010\f\u001a\u00020\u0000H\u0080\f\u001a\u0019\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\bH\u0080\b\u001a\u0019\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0000H\u0080\b\u001a0\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\bH\u0000\u001a\f\u0010\u001a\u001a\u00020\u0019*\u00020\u000bH\u0000\u001a\f\u0010\u001b\u001a\u00020\u0019*\u00020\bH\u0000\u001a\f\u0010\u001c\u001a\u00020\u0019*\u00020\u0000H\u0000¨\u0006\u001d"}, d2 = {"", "size", "offset", "byteCount", "Lkotlin/m2;", "e", "", "j", "", "h", "i", "", "other", "l", "k", "a", "b", "c", "g", "f", "", "aOffset", "bOffset", "", "d", "", "m", "n", "o", "okio"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class j {
    public static final int a(byte b6, int i5) {
        return b6 & i5;
    }

    public static final long b(byte b6, long j5) {
        return b6 & j5;
    }

    public static final long c(int i5, long j5) {
        return i5 & j5;
    }

    public static final boolean d(@d5.d byte[] bArr, int i5, @d5.d byte[] bArr2, int i6, int i7) {
        kotlin.jvm.internal.l0.p(bArr, ProtectedSandApp.s("桄"));
        kotlin.jvm.internal.l0.p(bArr2, ProtectedSandApp.s("桅"));
        for (int i8 = 0; i8 < i7; i8++) {
            if (bArr[i8 + i5] != bArr2[i8 + i6]) {
                return false;
            }
        }
        return true;
    }

    public static final void e(long j5, long j6, long j7) {
        if ((j6 | j7) < 0 || j6 > j5 || j5 - j6 < j7) {
            throw new ArrayIndexOutOfBoundsException(ProtectedSandApp.s("框") + j5 + ProtectedSandApp.s("桇") + j6 + ProtectedSandApp.s("案") + j7);
        }
    }

    public static final long f(int i5, long j5) {
        return Math.min(i5, j5);
    }

    public static final long g(long j5, int i5) {
        return Math.min(j5, i5);
    }

    public static final int h(int i5) {
        return ((i5 & 255) << 24) | (((-16777216) & i5) >>> 24) | ((16711680 & i5) >>> 8) | ((65280 & i5) << 8);
    }

    public static final long i(long j5) {
        return ((j5 & 255) << 56) | (((-72057594037927936L) & j5) >>> 56) | ((71776119061217280L & j5) >>> 40) | ((280375465082880L & j5) >>> 24) | ((1095216660480L & j5) >>> 8) | ((4278190080L & j5) << 8) | ((16711680 & j5) << 24) | ((65280 & j5) << 40);
    }

    public static final short j(short s5) {
        int i5 = s5 & UShort.f23340r;
        return (short) (((i5 & 255) << 8) | ((65280 & i5) >>> 8));
    }

    public static final int k(byte b6, int i5) {
        return b6 << i5;
    }

    public static final int l(byte b6, int i5) {
        return b6 >> i5;
    }

    @d5.d
    public static final String m(byte b6) {
        return new String(new char[]{v4.b.I()[(b6 >> 4) & 15], v4.b.I()[b6 & 15]});
    }

    @d5.d
    public static final String n(int i5) {
        if (i5 == 0) {
            return ProtectedSandApp.s("桉");
        }
        int i6 = 0;
        char[] cArr = {v4.b.I()[(i5 >> 28) & 15], v4.b.I()[(i5 >> 24) & 15], v4.b.I()[(i5 >> 20) & 15], v4.b.I()[(i5 >> 16) & 15], v4.b.I()[(i5 >> 12) & 15], v4.b.I()[(i5 >> 8) & 15], v4.b.I()[(i5 >> 4) & 15], v4.b.I()[i5 & 15]};
        while (i6 < 8 && cArr[i6] == '0') {
            i6++;
        }
        return new String(cArr, i6, 8 - i6);
    }

    @d5.d
    public static final String o(long j5) {
        if (j5 == 0) {
            return ProtectedSandApp.s("桊");
        }
        int i5 = 0;
        char[] cArr = {v4.b.I()[(int) ((j5 >> 60) & 15)], v4.b.I()[(int) ((j5 >> 56) & 15)], v4.b.I()[(int) ((j5 >> 52) & 15)], v4.b.I()[(int) ((j5 >> 48) & 15)], v4.b.I()[(int) ((j5 >> 44) & 15)], v4.b.I()[(int) ((j5 >> 40) & 15)], v4.b.I()[(int) ((j5 >> 36) & 15)], v4.b.I()[(int) ((j5 >> 32) & 15)], v4.b.I()[(int) ((j5 >> 28) & 15)], v4.b.I()[(int) ((j5 >> 24) & 15)], v4.b.I()[(int) ((j5 >> 20) & 15)], v4.b.I()[(int) ((j5 >> 16) & 15)], v4.b.I()[(int) ((j5 >> 12) & 15)], v4.b.I()[(int) ((j5 >> 8) & 15)], v4.b.I()[(int) ((j5 >> 4) & 15)], v4.b.I()[(int) (j5 & 15)]};
        while (i5 < 16 && cArr[i5] == '0') {
            i5++;
        }
        return new String(cArr, i5, 16 - i5);
    }
}
