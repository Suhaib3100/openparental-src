package kotlin.comparisons;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.l0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _ComparisonsJvm.kt */
@Metadata(d1 = {"\u0000F\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0005\n\u0002\u0010\u0012\n\u0002\u0010\u0006\n\u0002\u0010\u0013\n\u0002\u0010\u0007\n\u0002\u0010\u0014\n\u0002\u0010\b\n\u0002\u0010\u0015\n\u0002\u0010\t\n\u0002\u0010\u0016\n\u0002\u0010\n\n\u0002\u0010\u0017\n\u0002\b\u0002\u001a-\u0010\u0000\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u0002H\u00012\u0006\u0010\u0004\u001a\u0002H\u0001H\u0007¢\u0006\u0002\u0010\u0005\u001a5\u0010\u0000\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u0002H\u00012\u0006\u0010\u0004\u001a\u0002H\u00012\u0006\u0010\u0006\u001a\u0002H\u0001H\u0007¢\u0006\u0002\u0010\u0007\u001a9\u0010\u0000\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u0002H\u00012\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00010\t\"\u0002H\u0001H\u0007¢\u0006\u0002\u0010\n\u001a\u0019\u0010\u0000\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000bH\u0087\b\u001a!\u0010\u0000\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u000bH\u0087\b\u001a\u001c\u0010\u0000\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b2\n\u0010\b\u001a\u00020\f\"\u00020\u000bH\u0007\u001a\u0019\u0010\u0000\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\rH\u0087\b\u001a!\u0010\u0000\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\rH\u0087\b\u001a\u001c\u0010\u0000\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r2\n\u0010\b\u001a\u00020\u000e\"\u00020\rH\u0007\u001a\u0019\u0010\u0000\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u000fH\u0087\b\u001a!\u0010\u0000\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u000fH\u0087\b\u001a\u001c\u0010\u0000\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f2\n\u0010\b\u001a\u00020\u0010\"\u00020\u000fH\u0007\u001a\u0019\u0010\u0000\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0011H\u0087\b\u001a!\u0010\u0000\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0011H\u0087\b\u001a\u001c\u0010\u0000\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00112\n\u0010\b\u001a\u00020\u0012\"\u00020\u0011H\u0007\u001a\u0019\u0010\u0000\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0013H\u0087\b\u001a!\u0010\u0000\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u0013H\u0087\b\u001a\u001c\u0010\u0000\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00132\n\u0010\b\u001a\u00020\u0014\"\u00020\u0013H\u0007\u001a\u0019\u0010\u0000\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u0015H\u0087\b\u001a!\u0010\u0000\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u0015H\u0087\b\u001a\u001c\u0010\u0000\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00152\n\u0010\b\u001a\u00020\u0016\"\u00020\u0015H\u0007\u001a-\u0010\u0017\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u0002H\u00012\u0006\u0010\u0004\u001a\u0002H\u0001H\u0007¢\u0006\u0002\u0010\u0005\u001a5\u0010\u0017\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u0002H\u00012\u0006\u0010\u0004\u001a\u0002H\u00012\u0006\u0010\u0006\u001a\u0002H\u0001H\u0007¢\u0006\u0002\u0010\u0007\u001a9\u0010\u0017\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u0002H\u00012\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00010\t\"\u0002H\u0001H\u0007¢\u0006\u0002\u0010\n\u001a\u0019\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000bH\u0087\b\u001a!\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u000bH\u0087\b\u001a\u001c\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b2\n\u0010\b\u001a\u00020\f\"\u00020\u000bH\u0007\u001a\u0019\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\rH\u0087\b\u001a!\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\rH\u0087\b\u001a\u001c\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r2\n\u0010\b\u001a\u00020\u000e\"\u00020\rH\u0007\u001a\u0019\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u000fH\u0087\b\u001a!\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u000fH\u0087\b\u001a\u001c\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f2\n\u0010\b\u001a\u00020\u0010\"\u00020\u000fH\u0007\u001a\u0019\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0011H\u0087\b\u001a!\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0011H\u0087\b\u001a\u001c\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00112\n\u0010\b\u001a\u00020\u0012\"\u00020\u0011H\u0007\u001a\u0019\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0013H\u0087\b\u001a!\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u0013H\u0087\b\u001a\u001c\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00132\n\u0010\b\u001a\u00020\u0014\"\u00020\u0013H\u0007\u001a\u0019\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u0015H\u0087\b\u001a!\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u0015H\u0087\b\u001a\u001c\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00152\n\u0010\b\u001a\u00020\u0016\"\u00020\u0015H\u0007¨\u0006\u0018"}, d2 = {"maxOf", "T", "", "a", "b", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "c", "(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "other", "", "(Ljava/lang/Comparable;[Ljava/lang/Comparable;)Ljava/lang/Comparable;", "", "", "", "", "", "", "", "", "", "", "", "", "minOf", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/comparisons/ComparisonsKt")
/* loaded from: classes5.dex */
public class h extends g {
    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte I(byte b6, byte b7) {
        return (byte) Math.max((int) b6, (int) b7);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte J(byte b6, byte b7, byte b8) {
        return (byte) Math.max((int) b6, Math.max((int) b7, (int) b8));
    }

    @SinceKotlin(version = "1.4")
    public static final byte K(byte b6, @d5.d byte... bArr) {
        l0.p(bArr, ProtectedSandApp.s("㹆"));
        for (byte b7 : bArr) {
            b6 = (byte) Math.max((int) b6, (int) b7);
        }
        return b6;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final double L(double d6, double d7) {
        return Math.max(d6, d7);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final double M(double d6, double d7, double d8) {
        return Math.max(d6, Math.max(d7, d8));
    }

    @SinceKotlin(version = "1.4")
    public static final double N(double d6, @d5.d double... dArr) {
        l0.p(dArr, ProtectedSandApp.s("㹇"));
        for (double d7 : dArr) {
            d6 = Math.max(d6, d7);
        }
        return d6;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final float O(float f6, float f7) {
        return Math.max(f6, f7);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final float P(float f6, float f7, float f8) {
        return Math.max(f6, Math.max(f7, f8));
    }

    @SinceKotlin(version = "1.4")
    public static final float Q(float f6, @d5.d float... fArr) {
        l0.p(fArr, ProtectedSandApp.s("㹈"));
        for (float f7 : fArr) {
            f6 = Math.max(f6, f7);
        }
        return f6;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final int R(int i5, int i6) {
        return Math.max(i5, i6);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final int S(int i5, int i6, int i7) {
        return Math.max(i5, Math.max(i6, i7));
    }

    @SinceKotlin(version = "1.4")
    public static final int T(int i5, @d5.d int... iArr) {
        l0.p(iArr, ProtectedSandApp.s("㹉"));
        for (int i6 : iArr) {
            i5 = Math.max(i5, i6);
        }
        return i5;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final long U(long j5, long j6) {
        return Math.max(j5, j6);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final long V(long j5, long j6, long j7) {
        return Math.max(j5, Math.max(j6, j7));
    }

    @SinceKotlin(version = "1.4")
    public static final long W(long j5, @d5.d long... jArr) {
        l0.p(jArr, ProtectedSandApp.s("㹊"));
        for (long j6 : jArr) {
            j5 = Math.max(j5, j6);
        }
        return j5;
    }

    @SinceKotlin(version = "1.1")
    @d5.d
    public static <T extends Comparable<? super T>> T X(@d5.d T t5, @d5.d T t6) {
        l0.p(t5, ProtectedSandApp.s("㹋"));
        l0.p(t6, ProtectedSandApp.s("㹌"));
        return t5.compareTo(t6) >= 0 ? t5 : t6;
    }

    @SinceKotlin(version = "1.1")
    @d5.d
    public static final <T extends Comparable<? super T>> T Y(@d5.d T t5, @d5.d T t6, @d5.d T t7) {
        l0.p(t5, ProtectedSandApp.s("㹍"));
        l0.p(t6, ProtectedSandApp.s("㹎"));
        l0.p(t7, ProtectedSandApp.s("㹏"));
        return (T) X(t5, X(t6, t7));
    }

    @SinceKotlin(version = "1.4")
    @d5.d
    public static final <T extends Comparable<? super T>> T Z(@d5.d T t5, @d5.d T... tArr) {
        l0.p(t5, ProtectedSandApp.s("㹐"));
        l0.p(tArr, ProtectedSandApp.s("㹑"));
        for (T t6 : tArr) {
            t5 = (T) X(t5, t6);
        }
        return t5;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short a0(short s5, short s6) {
        return (short) Math.max((int) s5, (int) s6);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short b0(short s5, short s6, short s7) {
        return (short) Math.max((int) s5, Math.max((int) s6, (int) s7));
    }

    @SinceKotlin(version = "1.4")
    public static final short c0(short s5, @d5.d short... sArr) {
        l0.p(sArr, ProtectedSandApp.s("㹒"));
        for (short s6 : sArr) {
            s5 = (short) Math.max((int) s5, (int) s6);
        }
        return s5;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte d0(byte b6, byte b7) {
        return (byte) Math.min((int) b6, (int) b7);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte e0(byte b6, byte b7, byte b8) {
        return (byte) Math.min((int) b6, Math.min((int) b7, (int) b8));
    }

    @SinceKotlin(version = "1.4")
    public static final byte f0(byte b6, @d5.d byte... bArr) {
        l0.p(bArr, ProtectedSandApp.s("㹓"));
        for (byte b7 : bArr) {
            b6 = (byte) Math.min((int) b6, (int) b7);
        }
        return b6;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final double g0(double d6, double d7) {
        return Math.min(d6, d7);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final double h0(double d6, double d7, double d8) {
        return Math.min(d6, Math.min(d7, d8));
    }

    @SinceKotlin(version = "1.4")
    public static final double i0(double d6, @d5.d double... dArr) {
        l0.p(dArr, ProtectedSandApp.s("㹔"));
        for (double d7 : dArr) {
            d6 = Math.min(d6, d7);
        }
        return d6;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final float j0(float f6, float f7) {
        return Math.min(f6, f7);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final float k0(float f6, float f7, float f8) {
        return Math.min(f6, Math.min(f7, f8));
    }

    @SinceKotlin(version = "1.4")
    public static final float l0(float f6, @d5.d float... fArr) {
        l0.p(fArr, ProtectedSandApp.s("㹕"));
        for (float f7 : fArr) {
            f6 = Math.min(f6, f7);
        }
        return f6;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final int m0(int i5, int i6) {
        return Math.min(i5, i6);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final int n0(int i5, int i6, int i7) {
        return Math.min(i5, Math.min(i6, i7));
    }

    @SinceKotlin(version = "1.4")
    public static final int o0(int i5, @d5.d int... iArr) {
        l0.p(iArr, ProtectedSandApp.s("㹖"));
        for (int i6 : iArr) {
            i5 = Math.min(i5, i6);
        }
        return i5;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final long p0(long j5, long j6) {
        return Math.min(j5, j6);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final long q0(long j5, long j6, long j7) {
        return Math.min(j5, Math.min(j6, j7));
    }

    @SinceKotlin(version = "1.4")
    public static final long r0(long j5, @d5.d long... jArr) {
        l0.p(jArr, ProtectedSandApp.s("㹗"));
        for (long j6 : jArr) {
            j5 = Math.min(j5, j6);
        }
        return j5;
    }

    @SinceKotlin(version = "1.1")
    @d5.d
    public static final <T extends Comparable<? super T>> T s0(@d5.d T t5, @d5.d T t6) {
        l0.p(t5, ProtectedSandApp.s("㹘"));
        l0.p(t6, ProtectedSandApp.s("㹙"));
        return t5.compareTo(t6) <= 0 ? t5 : t6;
    }

    @SinceKotlin(version = "1.1")
    @d5.d
    public static final <T extends Comparable<? super T>> T t0(@d5.d T t5, @d5.d T t6, @d5.d T t7) {
        l0.p(t5, ProtectedSandApp.s("㹚"));
        l0.p(t6, ProtectedSandApp.s("㹛"));
        l0.p(t7, ProtectedSandApp.s("㹜"));
        return (T) s0(t5, s0(t6, t7));
    }

    @SinceKotlin(version = "1.4")
    @d5.d
    public static final <T extends Comparable<? super T>> T u0(@d5.d T t5, @d5.d T... tArr) {
        l0.p(t5, ProtectedSandApp.s("㹝"));
        l0.p(tArr, ProtectedSandApp.s("㹞"));
        for (T t6 : tArr) {
            t5 = (T) s0(t5, t6);
        }
        return t5;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short v0(short s5, short s6) {
        return (short) Math.min((int) s5, (int) s6);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short w0(short s5, short s6, short s7) {
        return (short) Math.min((int) s5, Math.min((int) s6, (int) s7));
    }

    @SinceKotlin(version = "1.4")
    public static final short x0(short s5, @d5.d short... sArr) {
        l0.p(sArr, ProtectedSandApp.s("㹟"));
        for (short s6 : sArr) {
            s5 = (short) Math.min((int) s5, (int) s6);
        }
        return s5;
    }
}
