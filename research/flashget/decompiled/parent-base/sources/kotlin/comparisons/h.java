package kotlin.comparisons;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.c1;
import kotlin.jvm.internal.l0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _ComparisonsJvm.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0010\u000f\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0017\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0013\n\u0002\b\u0018\u001a/\u0010\u0004\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0087\b¢\u0006\u0004\b\u0007\u0010\b\u001a \u0010\n\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\tH\u0087\b¢\u0006\u0004\b\n\u0010\u000b\u001a \u0010\r\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\fH\u0087\b¢\u0006\u0004\b\r\u0010\u000e\u001a \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000fH\u0087\b¢\u0006\u0004\b\u0010\u0010\u0011\u001a \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0012H\u0087\b¢\u0006\u0004\b\u0013\u0010\u0014\u001a \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0015H\u0087\b¢\u0006\u0004\b\u0016\u0010\u0017\u001a7\u0010\u0019\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001a(\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006H\u0087\b¢\u0006\u0004\b\u001b\u0010\u001c\u001a(\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0087\b¢\u0006\u0004\b\u001d\u0010\u001e\u001a(\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\fH\u0087\b¢\u0006\u0004\b\u001f\u0010 \u001a(\u0010!\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000fH\u0087\b¢\u0006\u0004\b!\u0010\"\u001a(\u0010#\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0012H\u0087\b¢\u0006\u0004\b#\u0010$\u001a(\u0010%\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0015H\u0087\b¢\u0006\u0004\b%\u0010&\u001a;\u0010)\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0012\u0010(\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000'\"\u00028\u0000H\u0007¢\u0006\u0004\b)\u0010*\u001a#\u0010,\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\n\u0010(\u001a\u00020+\"\u00020\u0006H\u0007¢\u0006\u0004\b,\u0010-\u001a#\u0010/\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\n\u0010(\u001a\u00020.\"\u00020\tH\u0007¢\u0006\u0004\b/\u00100\u001a#\u0010\u0001\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\f2\n\u0010(\u001a\u000201\"\u00020\fH\u0007¢\u0006\u0004\b\u0001\u00102\u001a#\u00104\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u000f2\n\u0010(\u001a\u000203\"\u00020\u000fH\u0007¢\u0006\u0004\b4\u00105\u001a#\u00107\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00122\n\u0010(\u001a\u000206\"\u00020\u0012H\u0007¢\u0006\u0004\b7\u00108\u001a#\u0010:\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00152\n\u0010(\u001a\u000209\"\u00020\u0015H\u0007¢\u0006\u0004\b:\u0010;\u001a/\u0010<\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0000H\u0007¢\u0006\u0004\b<\u0010\u0005\u001a \u0010=\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0087\b¢\u0006\u0004\b=\u0010\b\u001a \u0010>\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\tH\u0087\b¢\u0006\u0004\b>\u0010\u000b\u001a \u0010?\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\fH\u0087\b¢\u0006\u0004\b?\u0010\u000e\u001a \u0010@\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000fH\u0087\b¢\u0006\u0004\b@\u0010\u0011\u001a \u0010A\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0012H\u0087\b¢\u0006\u0004\bA\u0010\u0014\u001a \u0010B\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0015H\u0087\b¢\u0006\u0004\bB\u0010\u0017\u001a7\u0010C\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00028\u0000H\u0007¢\u0006\u0004\bC\u0010\u001a\u001a(\u0010D\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006H\u0087\b¢\u0006\u0004\bD\u0010\u001c\u001a(\u0010E\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0087\b¢\u0006\u0004\bE\u0010\u001e\u001a(\u0010F\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\fH\u0087\b¢\u0006\u0004\bF\u0010 \u001a(\u0010G\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000fH\u0087\b¢\u0006\u0004\bG\u0010\"\u001a(\u0010H\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0012H\u0087\b¢\u0006\u0004\bH\u0010$\u001a(\u0010I\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0015H\u0087\b¢\u0006\u0004\bI\u0010&\u001a;\u0010J\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0012\u0010(\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000'\"\u00028\u0000H\u0007¢\u0006\u0004\bJ\u0010*\u001a#\u0010K\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\n\u0010(\u001a\u00020+\"\u00020\u0006H\u0007¢\u0006\u0004\bK\u0010-\u001a#\u0010L\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\n\u0010(\u001a\u00020.\"\u00020\tH\u0007¢\u0006\u0004\bL\u00100\u001a#\u0010M\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\f2\n\u0010(\u001a\u000201\"\u00020\fH\u0007¢\u0006\u0004\bM\u00102\u001a#\u0010N\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u000f2\n\u0010(\u001a\u000203\"\u00020\u000fH\u0007¢\u0006\u0004\bN\u00105\u001a#\u0010O\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00122\n\u0010(\u001a\u000206\"\u00020\u0012H\u0007¢\u0006\u0004\bO\u00108\u001a#\u0010P\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00152\n\u0010(\u001a\u000209\"\u00020\u0015H\u0007¢\u0006\u0004\bP\u0010;¨\u0006Q"}, d2 = {"", "T", "a", "b", "X", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "", "I", "(BB)B", "", "a0", "(SS)S", "", "R", "(II)I", "", "U", "(JJ)J", "", "O", "(FF)F", "", "L", "(DD)D", "c", "Y", "(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "J", "(BBB)B", "b0", "(SSS)S", "S", "(III)I", "V", "(JJJ)J", "P", "(FFF)F", "M", "(DDD)D", "", "other", "Z", "(Ljava/lang/Comparable;[Ljava/lang/Comparable;)Ljava/lang/Comparable;", "", "K", "(B[B)B", "", "c0", "(S[S)S", "", "(I[I)I", "", "W", "(J[J)J", "", "Q", "(F[F)F", "", "N", "(D[D)D", "s0", "d0", "v0", "m0", "p0", "j0", "g0", "t0", "e0", "w0", "n0", "q0", "k0", "h0", "u0", "f0", "x0", "o0", "r0", "l0", "i0", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/comparisons/ComparisonsKt")
/* loaded from: classes7.dex */
public class h extends g {
    @c1(version = "1.1")
    @kotlin.internal.f
    private static final byte I(byte b5, byte b6) {
        return (byte) Math.max((int) b5, (int) b6);
    }

    @c1(version = "1.1")
    @kotlin.internal.f
    private static final byte J(byte b5, byte b6, byte b7) {
        return (byte) Math.max((int) b5, Math.max((int) b6, (int) b7));
    }

    @c1(version = "1.4")
    public static final byte K(byte b5, @fg.l byte... bArr) {
        l0.p(bArr, ProtectedSandApp.s("拙\u0001"));
        for (byte b6 : bArr) {
            b5 = (byte) Math.max((int) b5, (int) b6);
        }
        return b5;
    }

    @c1(version = "1.1")
    @kotlin.internal.f
    private static final double L(double d5, double d6) {
        return Math.max(d5, d6);
    }

    @c1(version = "1.1")
    @kotlin.internal.f
    private static final double M(double d5, double d6, double d7) {
        return Math.max(d5, Math.max(d6, d7));
    }

    @c1(version = "1.4")
    public static final double N(double d5, @fg.l double... dArr) {
        l0.p(dArr, ProtectedSandApp.s("拙\u0001"));
        for (double d6 : dArr) {
            d5 = Math.max(d5, d6);
        }
        return d5;
    }

    @c1(version = "1.1")
    @kotlin.internal.f
    private static final float O(float f4, float f5) {
        return Math.max(f4, f5);
    }

    @c1(version = "1.1")
    @kotlin.internal.f
    private static final float P(float f4, float f5, float f6) {
        return Math.max(f4, Math.max(f5, f6));
    }

    @c1(version = "1.4")
    public static float Q(float f4, @fg.l float... fArr) {
        l0.p(fArr, ProtectedSandApp.s("拙\u0001"));
        for (float f5 : fArr) {
            f4 = Math.max(f4, f5);
        }
        return f4;
    }

    @c1(version = "1.1")
    @kotlin.internal.f
    private static final int R(int i4, int i5) {
        return Math.max(i4, i5);
    }

    @c1(version = "1.1")
    @kotlin.internal.f
    private static final int S(int i4, int i5, int i6) {
        return Math.max(i4, Math.max(i5, i6));
    }

    @c1(version = "1.4")
    public static int T(int i4, @fg.l int... iArr) {
        l0.p(iArr, ProtectedSandApp.s("拙\u0001"));
        for (int i5 : iArr) {
            i4 = Math.max(i4, i5);
        }
        return i4;
    }

    @c1(version = "1.1")
    @kotlin.internal.f
    private static final long U(long j4, long j5) {
        return Math.max(j4, j5);
    }

    @c1(version = "1.1")
    @kotlin.internal.f
    private static final long V(long j4, long j5, long j6) {
        return Math.max(j4, Math.max(j5, j6));
    }

    @c1(version = "1.4")
    public static final long W(long j4, @fg.l long... jArr) {
        l0.p(jArr, ProtectedSandApp.s("拙\u0001"));
        for (long j5 : jArr) {
            j4 = Math.max(j4, j5);
        }
        return j4;
    }

    @fg.l
    @c1(version = "1.1")
    public static <T extends Comparable<? super T>> T X(@fg.l T t4, @fg.l T t5) {
        l0.p(t4, ProtectedSandApp.s("拚\u0001"));
        l0.p(t5, ProtectedSandApp.s("招\u0001"));
        return t4.compareTo(t5) >= 0 ? t4 : t5;
    }

    @fg.l
    @c1(version = "1.1")
    public static final <T extends Comparable<? super T>> T Y(@fg.l T t4, @fg.l T t5, @fg.l T t6) {
        l0.p(t4, ProtectedSandApp.s("拚\u0001"));
        l0.p(t5, ProtectedSandApp.s("招\u0001"));
        l0.p(t6, ProtectedSandApp.s("拜\u0001"));
        return (T) X(t4, X(t5, t6));
    }

    @fg.l
    @c1(version = "1.4")
    public static final <T extends Comparable<? super T>> T Z(@fg.l T t4, @fg.l T... tArr) {
        l0.p(t4, ProtectedSandApp.s("拚\u0001"));
        l0.p(tArr, ProtectedSandApp.s("拙\u0001"));
        for (T t5 : tArr) {
            t4 = (T) X(t4, t5);
        }
        return t4;
    }

    @c1(version = "1.1")
    @kotlin.internal.f
    private static final short a0(short s4, short s5) {
        return (short) Math.max((int) s4, (int) s5);
    }

    @c1(version = "1.1")
    @kotlin.internal.f
    private static final short b0(short s4, short s5, short s6) {
        return (short) Math.max((int) s4, Math.max((int) s5, (int) s6));
    }

    @c1(version = "1.4")
    public static final short c0(short s4, @fg.l short... sArr) {
        l0.p(sArr, ProtectedSandApp.s("拙\u0001"));
        for (short s5 : sArr) {
            s4 = (short) Math.max((int) s4, (int) s5);
        }
        return s4;
    }

    @c1(version = "1.1")
    @kotlin.internal.f
    private static final byte d0(byte b5, byte b6) {
        return (byte) Math.min((int) b5, (int) b6);
    }

    @c1(version = "1.1")
    @kotlin.internal.f
    private static final byte e0(byte b5, byte b6, byte b7) {
        return (byte) Math.min((int) b5, Math.min((int) b6, (int) b7));
    }

    @c1(version = "1.4")
    public static final byte f0(byte b5, @fg.l byte... bArr) {
        l0.p(bArr, ProtectedSandApp.s("拙\u0001"));
        for (byte b6 : bArr) {
            b5 = (byte) Math.min((int) b5, (int) b6);
        }
        return b5;
    }

    @c1(version = "1.1")
    @kotlin.internal.f
    private static final double g0(double d5, double d6) {
        return Math.min(d5, d6);
    }

    @c1(version = "1.1")
    @kotlin.internal.f
    private static final double h0(double d5, double d6, double d7) {
        return Math.min(d5, Math.min(d6, d7));
    }

    @c1(version = "1.4")
    public static final double i0(double d5, @fg.l double... dArr) {
        l0.p(dArr, ProtectedSandApp.s("拙\u0001"));
        for (double d6 : dArr) {
            d5 = Math.min(d5, d6);
        }
        return d5;
    }

    @c1(version = "1.1")
    @kotlin.internal.f
    private static final float j0(float f4, float f5) {
        return Math.min(f4, f5);
    }

    @c1(version = "1.1")
    @kotlin.internal.f
    private static final float k0(float f4, float f5, float f6) {
        return Math.min(f4, Math.min(f5, f6));
    }

    @c1(version = "1.4")
    public static float l0(float f4, @fg.l float... fArr) {
        l0.p(fArr, ProtectedSandApp.s("拙\u0001"));
        for (float f5 : fArr) {
            f4 = Math.min(f4, f5);
        }
        return f4;
    }

    @c1(version = "1.1")
    @kotlin.internal.f
    private static final int m0(int i4, int i5) {
        return Math.min(i4, i5);
    }

    @c1(version = "1.1")
    @kotlin.internal.f
    private static final int n0(int i4, int i5, int i6) {
        return Math.min(i4, Math.min(i5, i6));
    }

    @c1(version = "1.4")
    public static final int o0(int i4, @fg.l int... iArr) {
        l0.p(iArr, ProtectedSandApp.s("拙\u0001"));
        for (int i5 : iArr) {
            i4 = Math.min(i4, i5);
        }
        return i4;
    }

    @c1(version = "1.1")
    @kotlin.internal.f
    private static final long p0(long j4, long j5) {
        return Math.min(j4, j5);
    }

    @c1(version = "1.1")
    @kotlin.internal.f
    private static final long q0(long j4, long j5, long j6) {
        return Math.min(j4, Math.min(j5, j6));
    }

    @c1(version = "1.4")
    public static final long r0(long j4, @fg.l long... jArr) {
        l0.p(jArr, ProtectedSandApp.s("拙\u0001"));
        for (long j5 : jArr) {
            j4 = Math.min(j4, j5);
        }
        return j4;
    }

    @fg.l
    @c1(version = "1.1")
    public static final <T extends Comparable<? super T>> T s0(@fg.l T t4, @fg.l T t5) {
        l0.p(t4, ProtectedSandApp.s("拚\u0001"));
        l0.p(t5, ProtectedSandApp.s("招\u0001"));
        return t4.compareTo(t5) <= 0 ? t4 : t5;
    }

    @fg.l
    @c1(version = "1.1")
    public static final <T extends Comparable<? super T>> T t0(@fg.l T t4, @fg.l T t5, @fg.l T t6) {
        l0.p(t4, ProtectedSandApp.s("拚\u0001"));
        l0.p(t5, ProtectedSandApp.s("招\u0001"));
        l0.p(t6, ProtectedSandApp.s("拜\u0001"));
        return (T) s0(t4, s0(t5, t6));
    }

    @fg.l
    @c1(version = "1.4")
    public static final <T extends Comparable<? super T>> T u0(@fg.l T t4, @fg.l T... tArr) {
        l0.p(t4, ProtectedSandApp.s("拚\u0001"));
        l0.p(tArr, ProtectedSandApp.s("拙\u0001"));
        for (T t5 : tArr) {
            t4 = (T) s0(t4, t5);
        }
        return t4;
    }

    @c1(version = "1.1")
    @kotlin.internal.f
    private static final short v0(short s4, short s5) {
        return (short) Math.min((int) s4, (int) s5);
    }

    @c1(version = "1.1")
    @kotlin.internal.f
    private static final short w0(short s4, short s5, short s6) {
        return (short) Math.min((int) s4, Math.min((int) s5, (int) s6));
    }

    @c1(version = "1.4")
    public static final short x0(short s4, @fg.l short... sArr) {
        l0.p(sArr, ProtectedSandApp.s("拙\u0001"));
        for (short s5 : sArr) {
            s4 = (short) Math.min((int) s4, (int) s5);
        }
        return s4;
    }
}
