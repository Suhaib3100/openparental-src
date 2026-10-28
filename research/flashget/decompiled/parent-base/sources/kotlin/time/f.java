package kotlin.time;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

/* compiled from: DurationJvm.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\n\u0010\t\"\u001a\u0010\u000f\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000e\" \u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012¨\u0006\u0014"}, d2 = {"", "decimals", "Ljava/text/DecimalFormat;", "a", "(I)Ljava/text/DecimalFormat;", "", "value", "", "b", "(DI)Ljava/lang/String;", "c", "", "Z", "d", "()Z", "durationAssertionsEnabled", "", "Ljava/lang/ThreadLocal;", "[Ljava/lang/ThreadLocal;", "precisionFormats", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nDurationJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DurationJvm.kt\nkotlin/time/DurationJvmKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,33:1\n1#2:34\n*E\n"})
/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f79214a = false;

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final ThreadLocal<DecimalFormat>[] f79215b;

    static {
        ThreadLocal<DecimalFormat>[] threadLocalArr = new ThreadLocal[4];
        for (int i4 = 0; i4 < 4; i4++) {
            threadLocalArr[i4] = new ThreadLocal<>();
        }
        f79215b = threadLocalArr;
    }

    private static final DecimalFormat a(int i4) {
        DecimalFormat decimalFormat = new DecimalFormat(ProtectedSandApp.s("蔮\u0001"));
        if (i4 > 0) {
            decimalFormat.setMinimumFractionDigits(i4);
        }
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        return decimalFormat;
    }

    @fg.l
    public static final String b(double d5, int i4) {
        DecimalFormat a5;
        ThreadLocal<DecimalFormat>[] threadLocalArr = f79215b;
        if (i4 < threadLocalArr.length) {
            ThreadLocal<DecimalFormat> threadLocal = threadLocalArr[i4];
            DecimalFormat decimalFormat = threadLocal.get();
            if (decimalFormat == null) {
                decimalFormat = a(i4);
                threadLocal.set(decimalFormat);
            } else {
                l0.m(decimalFormat);
            }
            a5 = decimalFormat;
        } else {
            a5 = a(i4);
        }
        String format = a5.format(d5);
        l0.o(format, ProtectedSandApp.s("蔯\u0001"));
        return format;
    }

    @fg.l
    public static final String c(double d5, int i4) {
        DecimalFormat a5 = a(0);
        a5.setMaximumFractionDigits(i4);
        String format = a5.format(d5);
        l0.o(format, ProtectedSandApp.s("蔯\u0001"));
        return format;
    }

    public static final boolean d() {
        return f79214a;
    }
}
