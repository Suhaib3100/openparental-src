package okio;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: -Util.kt */
@kd.i(name = "-Util")
@Metadata(d1 = {"\u0000@\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\f\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u001a'\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\r\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001c\u0010\u0011\u001a\u00020\n*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\nH\u0080\f¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001c\u0010\u0013\u001a\u00020\n*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\nH\u0080\f¢\u0006\u0004\b\u0013\u0010\u0012\u001a\u001c\u0010\u0014\u001a\u00020\n*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\nH\u0080\f¢\u0006\u0004\b\u0014\u0010\u0012\u001a\u001c\u0010\u0015\u001a\u00020\u0000*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0000H\u0080\f¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001c\u0010\u0017\u001a\u00020\u0000*\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0000H\u0080\f¢\u0006\u0004\b\u0017\u0010\u0018\u001a \u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\nH\u0080\b¢\u0006\u0004\b\u0019\u0010\u001a\u001a \u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0000H\u0080\b¢\u0006\u0004\b\u001b\u0010\u0018\u001a7\u0010 \u001a\u00020\u001f2\u0006\u0010\u0014\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\nH\u0000¢\u0006\u0004\b \u0010!\u001a\u0013\u0010#\u001a\u00020\"*\u00020\u000fH\u0000¢\u0006\u0004\b#\u0010$\u001a\u0013\u0010%\u001a\u00020\"*\u00020\nH\u0000¢\u0006\u0004\b%\u0010&\u001a\u0013\u0010'\u001a\u00020\"*\u00020\u0000H\u0000¢\u0006\u0004\b'\u0010(¨\u0006)"}, d2 = {"", "size", "offset", "byteCount", "Lkotlin/k2;", "e", "(JJJ)V", "", "j", "(S)S", "", "h", "(I)I", "i", "(J)J", "", "other", "l", "(BI)I", "k", "a", "b", "(BJ)J", "c", "(IJ)J", "g", "(JI)J", "f", "", "aOffset", "bOffset", "", "d", "([BI[BII)Z", "", "m", "(B)Ljava/lang/String;", "n", "(I)Ljava/lang/String;", "o", "(J)Ljava/lang/String;", "okio"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class j {
    public static final int a(byte b5, int i4) {
        return b5 & i4;
    }

    public static final long b(byte b5, long j4) {
        return b5 & j4;
    }

    public static final long c(int i4, long j4) {
        return i4 & j4;
    }

    public static final boolean d(@fg.l byte[] bArr, int i4, @fg.l byte[] bArr2, int i5, int i6) {
        kotlin.jvm.internal.l0.p(bArr, ProtectedSandApp.s("ή"));
        kotlin.jvm.internal.l0.p(bArr2, ProtectedSandApp.s("ὶ"));
        for (int i7 = 0; i7 < i6; i7++) {
            if (bArr[i7 + i4] != bArr2[i7 + i5]) {
                return false;
            }
        }
        return true;
    }

    public static final void e(long j4, long j5, long j6) {
        if ((j5 | j6) < 0 || j5 > j4 || j4 - j5 < j6) {
            StringBuilder a5 = androidx.compose.runtime.snapshots.f0.a(ProtectedSandApp.s("ί"), j4, ProtectedSandApp.s("ὸ"));
            a5.append(j5);
            a5.append(ProtectedSandApp.s("ό"));
            a5.append(j6);
            throw new ArrayIndexOutOfBoundsException(a5.toString());
        }
    }

    public static final long f(int i4, long j4) {
        return Math.min(i4, j4);
    }

    public static final long g(long j4, int i4) {
        return Math.min(j4, i4);
    }

    public static final int h(int i4) {
        return ((i4 & 255) << 24) | (((-16777216) & i4) >>> 24) | ((16711680 & i4) >>> 8) | ((65280 & i4) << 8);
    }

    public static final long i(long j4) {
        return ((j4 & 255) << 56) | (((-72057594037927936L) & j4) >>> 56) | ((71776119061217280L & j4) >>> 40) | ((280375465082880L & j4) >>> 24) | ((1095216660480L & j4) >>> 8) | ((4278190080L & j4) << 8) | ((16711680 & j4) << 24) | ((65280 & j4) << 40);
    }

    public static final short j(short s4) {
        return (short) (((s4 & 255) << 8) | ((65280 & s4) >>> 8));
    }

    public static final int k(byte b5, int i4) {
        return b5 << i4;
    }

    public static final int l(byte b5, int i4) {
        return b5 >> i4;
    }

    @fg.l
    public static final String m(byte b5) {
        return new String(new char[]{ve.b.I()[(b5 >> 4) & 15], ve.b.I()[b5 & com.google.common.base.c.f54871q]});
    }

    @fg.l
    public static final String n(int i4) {
        int i5 = 0;
        if (i4 == 0) {
            return ProtectedSandApp.s("ὺ");
        }
        char[] cArr = {ve.b.I()[(i4 >> 28) & 15], ve.b.I()[(i4 >> 24) & 15], ve.b.I()[(i4 >> 20) & 15], ve.b.I()[(i4 >> 16) & 15], ve.b.I()[(i4 >> 12) & 15], ve.b.I()[(i4 >> 8) & 15], ve.b.I()[(i4 >> 4) & 15], ve.b.I()[i4 & 15]};
        while (i5 < 8 && cArr[i5] == '0') {
            i5++;
        }
        return new String(cArr, i5, 8 - i5);
    }

    @fg.l
    public static final String o(long j4) {
        if (j4 == 0) {
            return ProtectedSandApp.s("ὺ");
        }
        char[] cArr = {ve.b.I()[(int) ((j4 >> 60) & 15)], ve.b.I()[(int) ((j4 >> 56) & 15)], ve.b.I()[(int) ((j4 >> 52) & 15)], ve.b.I()[(int) ((j4 >> 48) & 15)], ve.b.I()[(int) ((j4 >> 44) & 15)], ve.b.I()[(int) ((j4 >> 40) & 15)], ve.b.I()[(int) ((j4 >> 36) & 15)], ve.b.I()[(int) ((j4 >> 32) & 15)], ve.b.I()[(int) ((j4 >> 28) & 15)], ve.b.I()[(int) ((j4 >> 24) & 15)], ve.b.I()[(int) ((j4 >> 20) & 15)], ve.b.I()[(int) ((j4 >> 16) & 15)], ve.b.I()[(int) ((j4 >> 12) & 15)], ve.b.I()[(int) ((j4 >> 8) & 15)], ve.b.I()[(int) ((j4 >> 4) & 15)], ve.b.I()[(int) (j4 & 15)]};
        int i4 = 0;
        while (i4 < 16 && cArr[i4] == '0') {
            i4++;
        }
        return new String(cArr, i4, 16 - i4);
    }
}
