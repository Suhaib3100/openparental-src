package kotlin.math;

import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.remoteconfig.p;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.internal.InlineOnly;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MathJVM.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b8\u001a\u0011\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0087\b\u001a\u0011\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\fH\u0087\b\u001a\u0011\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0010\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0007\u001a\u0011\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0010\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0007\u001a\u0011\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0019\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0019\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0010\u0010 \u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0007\u001a\u0011\u0010 \u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010!\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010!\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010\"\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\"\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010#\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010#\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010$\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010$\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010%\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010%\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010&\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010&\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010'\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010'\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0019\u0010(\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u0001H\u0087\b\u001a\u0019\u0010(\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010)\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010)\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010*\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010*\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0018\u0010+\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010,\u001a\u00020\u0001H\u0007\u001a\u0018\u0010+\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u0006H\u0007\u001a\u0011\u0010-\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010-\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0010\u0010.\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0007\u001a\u0010\u0010.\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0007\u001a\u0019\u0010/\u001a\u00020\u00012\u0006\u00100\u001a\u00020\u00012\u0006\u00101\u001a\u00020\u0001H\u0087\b\u001a\u0019\u0010/\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u0006H\u0087\b\u001a\u0019\u0010/\u001a\u00020\t2\u0006\u00100\u001a\u00020\t2\u0006\u00101\u001a\u00020\tH\u0087\b\u001a\u0019\u0010/\u001a\u00020\f2\u0006\u00100\u001a\u00020\f2\u0006\u00101\u001a\u00020\fH\u0087\b\u001a\u0019\u00102\u001a\u00020\u00012\u0006\u00100\u001a\u00020\u00012\u0006\u00101\u001a\u00020\u0001H\u0087\b\u001a\u0019\u00102\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u0006H\u0087\b\u001a\u0019\u00102\u001a\u00020\t2\u0006\u00100\u001a\u00020\t2\u0006\u00101\u001a\u00020\tH\u0087\b\u001a\u0019\u00102\u001a\u00020\f2\u0006\u00100\u001a\u00020\f2\u0006\u00101\u001a\u00020\fH\u0087\b\u001a\u0011\u00103\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u00103\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u00104\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u00104\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u00105\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u00105\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u00106\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u00106\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u00107\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u00107\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u00108\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u00108\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0010\u00109\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0007\u001a\u0010\u00109\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0007\u001a\u0015\u0010:\u001a\u00020\u0001*\u00020\u00012\u0006\u0010;\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010:\u001a\u00020\u0006*\u00020\u00062\u0006\u0010;\u001a\u00020\u0006H\u0087\b\u001a\r\u0010<\u001a\u00020\u0001*\u00020\u0001H\u0087\b\u001a\r\u0010<\u001a\u00020\u0006*\u00020\u0006H\u0087\b\u001a\u0015\u0010=\u001a\u00020\u0001*\u00020\u00012\u0006\u0010>\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010=\u001a\u00020\u0006*\u00020\u00062\u0006\u0010>\u001a\u00020\u0006H\u0087\b\u001a\r\u0010?\u001a\u00020\u0001*\u00020\u0001H\u0087\b\u001a\r\u0010?\u001a\u00020\u0006*\u00020\u0006H\u0087\b\u001a\u0015\u0010@\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010@\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0018\u001a\u00020\tH\u0087\b\u001a\u0015\u0010@\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0015\u0010@\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0018\u001a\u00020\tH\u0087\b\u001a\f\u0010A\u001a\u00020\t*\u00020\u0001H\u0007\u001a\f\u0010A\u001a\u00020\t*\u00020\u0006H\u0007\u001a\f\u0010B\u001a\u00020\f*\u00020\u0001H\u0007\u001a\f\u0010B\u001a\u00020\f*\u00020\u0006H\u0007\u001a\u0015\u0010C\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010C\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\tH\u0087\b\u001a\u0015\u0010C\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0087\b\u001a\u0015\u0010C\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\tH\u0087\b\"\u001f\u0010\u0000\u001a\u00020\u0001*\u00020\u00018Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u001f\u0010\u0000\u001a\u00020\u0006*\u00020\u00068Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0002\u0010\u0007\u001a\u0004\b\u0004\u0010\b\"\u001f\u0010\u0000\u001a\u00020\t*\u00020\t8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0002\u0010\n\u001a\u0004\b\u0004\u0010\u000b\"\u001f\u0010\u0000\u001a\u00020\f*\u00020\f8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0002\u0010\r\u001a\u0004\b\u0004\u0010\u000e\"\u001f\u0010\u000f\u001a\u00020\u0001*\u00020\u00018Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0003\u001a\u0004\b\u0011\u0010\u0005\"\u001f\u0010\u000f\u001a\u00020\u0006*\u00020\u00068Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0007\u001a\u0004\b\u0011\u0010\b\"\u001e\u0010\u000f\u001a\u00020\t*\u00020\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\u000b\"\u001e\u0010\u000f\u001a\u00020\t*\u00020\f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u0012\"\u001f\u0010\u0013\u001a\u00020\u0001*\u00020\u00018Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0003\u001a\u0004\b\u0015\u0010\u0005\"\u001f\u0010\u0013\u001a\u00020\u0006*\u00020\u00068Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0007\u001a\u0004\b\u0015\u0010\b¨\u0006D"}, d2 = {"absoluteValue", "", "getAbsoluteValue$annotations", "(D)V", "getAbsoluteValue", "(D)D", "", "(F)V", "(F)F", "", "(I)V", "(I)I", "", "(J)V", "(J)J", "sign", "getSign$annotations", "getSign", "(J)I", "ulp", "getUlp$annotations", "getUlp", "abs", "x", "n", "acos", "acosh", "asin", "asinh", "atan", "atan2", "y", "atanh", "cbrt", "ceil", "cos", "cosh", "exp", "expm1", "floor", "hypot", "ln", "ln1p", "log", "base", "log10", "log2", "max", "a", "b", "min", "round", "sin", "sinh", "sqrt", "tan", "tanh", "truncate", "IEEErem", "divisor", "nextDown", "nextTowards", "to", "nextUp", "pow", "roundToInt", "roundToLong", "withSign", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/math/MathKt")
/* loaded from: classes5.dex */
public class d extends c {
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double A(double d6) {
        return Math.cos(d6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double A0(double d6, double d7) {
        return Math.nextAfter(d6, d7);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float B(float f6) {
        return (float) Math.cos(f6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float B0(float f6, float f7) {
        return Math.nextAfter(f6, f7);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double C(double d6) {
        return Math.cosh(d6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double C0(double d6) {
        return Math.nextUp(d6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float D(float f6) {
        return (float) Math.cosh(f6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float D0(float f6) {
        return Math.nextUp(f6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double E(double d6) {
        return Math.exp(d6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double E0(double d6, double d7) {
        return Math.pow(d6, d7);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float F(float f6) {
        return (float) Math.exp(f6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double F0(double d6, int i5) {
        return Math.pow(d6, i5);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double G(double d6) {
        return Math.expm1(d6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float G0(float f6, float f7) {
        return (float) Math.pow(f6, f7);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float H(float f6) {
        return (float) Math.expm1(f6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float H0(float f6, int i5) {
        return (float) Math.pow(f6, i5);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double I(double d6) {
        return Math.floor(d6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double I0(double d6) {
        return Math.rint(d6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float J(float f6) {
        return (float) Math.floor(f6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float J0(float f6) {
        return (float) Math.rint(f6);
    }

    private static final double K(double d6) {
        return Math.abs(d6);
    }

    @SinceKotlin(version = "1.2")
    public static int K0(double d6) {
        if (Double.isNaN(d6)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("䆡"));
        }
        if (d6 > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d6 < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d6);
    }

    private static final float L(float f6) {
        return Math.abs(f6);
    }

    @SinceKotlin(version = "1.2")
    public static final int L0(float f6) {
        if (Float.isNaN(f6)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("䆢"));
        }
        return Math.round(f6);
    }

    private static final int M(int i5) {
        return Math.abs(i5);
    }

    @SinceKotlin(version = "1.2")
    public static long M0(double d6) {
        if (Double.isNaN(d6)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("䆣"));
        }
        return Math.round(d6);
    }

    private static final long N(long j5) {
        return Math.abs(j5);
    }

    @SinceKotlin(version = "1.2")
    public static final long N0(float f6) {
        return M0(f6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void O(double d6) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double O0(double d6) {
        return Math.signum(d6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void P(float f6) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float P0(float f6) {
        return Math.signum(f6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void Q(int i5) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double Q0(double d6) {
        return Math.sin(d6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void R(long j5) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float R0(float f6) {
        return (float) Math.sin(f6);
    }

    private static final double S(double d6) {
        return Math.signum(d6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double S0(double d6) {
        return Math.sinh(d6);
    }

    private static final float T(float f6) {
        return Math.signum(f6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float T0(float f6) {
        return (float) Math.sinh(f6);
    }

    public static int U(int i5) {
        if (i5 < 0) {
            return -1;
        }
        return i5 > 0 ? 1 : 0;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double U0(double d6) {
        return Math.sqrt(d6);
    }

    public static int V(long j5) {
        if (j5 < 0) {
            return -1;
        }
        return j5 > 0 ? 1 : 0;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float V0(float f6) {
        return (float) Math.sqrt(f6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void W(double d6) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double W0(double d6) {
        return Math.tan(d6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void X(float f6) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float X0(float f6) {
        return (float) Math.tan(f6);
    }

    @SinceKotlin(version = "1.2")
    public static /* synthetic */ void Y(int i5) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double Y0(double d6) {
        return Math.tanh(d6);
    }

    @SinceKotlin(version = "1.2")
    public static /* synthetic */ void Z(long j5) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float Z0(float f6) {
        return (float) Math.tanh(f6);
    }

    private static final double a0(double d6) {
        return Math.ulp(d6);
    }

    @SinceKotlin(version = "1.2")
    public static final double a1(double d6) {
        return (Double.isNaN(d6) || Double.isInfinite(d6)) ? d6 : d6 > p.f18289o ? Math.floor(d6) : Math.ceil(d6);
    }

    private static final float b0(float f6) {
        return Math.ulp(f6);
    }

    @SinceKotlin(version = "1.2")
    public static final float b1(float f6) {
        if (Float.isNaN(f6) || Float.isInfinite(f6)) {
            return f6;
        }
        return (float) (f6 > 0.0f ? Math.floor(f6) : Math.ceil(f6));
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double c(double d6, double d7) {
        return Math.IEEEremainder(d6, d7);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void c0(double d6) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double c1(double d6, double d7) {
        return Math.copySign(d6, d7);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float d(float f6, float f7) {
        return (float) Math.IEEEremainder(f6, f7);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void d0(float f6) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double d1(double d6, int i5) {
        return Math.copySign(d6, i5);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double e(double d6) {
        return Math.abs(d6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double e0(double d6, double d7) {
        return Math.hypot(d6, d7);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float e1(float f6, float f7) {
        return Math.copySign(f6, f7);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float f(float f6) {
        return Math.abs(f6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float f0(float f6, float f7) {
        return (float) Math.hypot(f6, f7);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float f1(float f6, int i5) {
        return Math.copySign(f6, i5);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final int g(int i5) {
        return Math.abs(i5);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double g0(double d6) {
        return Math.log(d6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final long h(long j5) {
        return Math.abs(j5);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float h0(float f6) {
        return (float) Math.log(f6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double i(double d6) {
        return Math.acos(d6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double i0(double d6) {
        return Math.log1p(d6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float j(float f6) {
        return (float) Math.acos(f6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float j0(float f6) {
        return (float) Math.log1p(f6);
    }

    @SinceKotlin(version = "1.2")
    public static final double k(double d6) {
        if (d6 < 1.0d) {
            return Double.NaN;
        }
        if (d6 > Constants.f23668f) {
            return Math.log(d6) + Constants.f23664b;
        }
        double d7 = 1;
        double d8 = d6 - d7;
        if (d8 >= Constants.f23667e) {
            return Math.log(Math.sqrt((d6 * d6) - d7) + d6);
        }
        double sqrt = Math.sqrt(d8);
        if (sqrt >= Constants.f23666d) {
            sqrt -= ((sqrt * sqrt) * sqrt) / 12;
        }
        return sqrt * Math.sqrt(2.0d);
    }

    @SinceKotlin(version = "1.2")
    public static final double k0(double d6, double d7) {
        if (d7 <= p.f18289o) {
            return Double.NaN;
        }
        if (d7 == 1.0d) {
            return Double.NaN;
        }
        return Math.log(d6) / Math.log(d7);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float l(float f6) {
        return (float) k(f6);
    }

    @SinceKotlin(version = "1.2")
    public static final float l0(float f6, float f7) {
        if (f7 <= 0.0f) {
            return Float.NaN;
        }
        if (f7 == 1.0f) {
            return Float.NaN;
        }
        return (float) (Math.log(f6) / Math.log(f7));
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double m(double d6) {
        return Math.asin(d6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double m0(double d6) {
        return Math.log10(d6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float n(float f6) {
        return (float) Math.asin(f6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float n0(float f6) {
        return (float) Math.log10(f6);
    }

    @SinceKotlin(version = "1.2")
    public static final double o(double d6) {
        double d7 = Constants.f23667e;
        if (d6 < d7) {
            return d6 <= (-d7) ? -o(-d6) : Math.abs(d6) >= Constants.f23666d ? d6 - (((d6 * d6) * d6) / 6) : d6;
        }
        if (d6 <= Constants.f23669g) {
            return Math.log(Math.sqrt((d6 * d6) + 1) + d6);
        }
        if (d6 > Constants.f23668f) {
            return Math.log(d6) + Constants.f23664b;
        }
        double d8 = d6 * 2;
        return Math.log((1 / d8) + d8);
    }

    @SinceKotlin(version = "1.2")
    public static final double o0(double d6) {
        return Math.log(d6) / Constants.f23664b;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float p(float f6) {
        return (float) o(f6);
    }

    @SinceKotlin(version = "1.2")
    public static final float p0(float f6) {
        return (float) (Math.log(f6) / Constants.f23664b);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double q(double d6) {
        return Math.atan(d6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double q0(double d6, double d7) {
        return Math.max(d6, d7);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float r(float f6) {
        return (float) Math.atan(f6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float r0(float f6, float f7) {
        return Math.max(f6, f7);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double s(double d6, double d7) {
        return Math.atan2(d6, d7);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final int s0(int i5, int i6) {
        return Math.max(i5, i6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float t(float f6, float f7) {
        return (float) Math.atan2(f6, f7);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final long t0(long j5, long j6) {
        return Math.max(j5, j6);
    }

    @SinceKotlin(version = "1.2")
    public static final double u(double d6) {
        if (Math.abs(d6) < Constants.f23667e) {
            return Math.abs(d6) > Constants.f23666d ? d6 + (((d6 * d6) * d6) / 3) : d6;
        }
        double d7 = 1;
        return Math.log((d7 + d6) / (d7 - d6)) / 2;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double u0(double d6, double d7) {
        return Math.min(d6, d7);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float v(float f6) {
        return (float) u(f6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float v0(float f6, float f7) {
        return Math.min(f6, f7);
    }

    @SinceKotlin(version = "1.8")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final double w(double d6) {
        return Math.cbrt(d6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final int w0(int i5, int i6) {
        return Math.min(i5, i6);
    }

    @SinceKotlin(version = "1.8")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final float x(float f6) {
        return (float) Math.cbrt(f6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final long x0(long j5, long j6) {
        return Math.min(j5, j6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double y(double d6) {
        return Math.ceil(d6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double y0(double d6) {
        return Math.nextAfter(d6, Double.NEGATIVE_INFINITY);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float z(float f6) {
        return (float) Math.ceil(f6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float z0(float f6) {
        return Math.nextAfter(f6, Double.NEGATIVE_INFINITY);
    }
}
