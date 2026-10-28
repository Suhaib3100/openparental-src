package kotlin;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/* compiled from: BigDecimals.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0005\u001a\u001c\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001c\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u001c\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u001c\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u0006\u0010\u0003\u001a\u001c\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u0007\u0010\u0003\u001a\u0014\u0010\b\u001a\u00020\u0000*\u00020\u0000H\u0087\n¢\u0006\u0004\b\b\u0010\t\u001a\u0014\u0010\n\u001a\u00020\u0000*\u00020\u0000H\u0087\n¢\u0006\u0004\b\n\u0010\t\u001a\u0014\u0010\u000b\u001a\u00020\u0000*\u00020\u0000H\u0087\n¢\u0006\u0004\b\u000b\u0010\t\u001a\u0014\u0010\r\u001a\u00020\u0000*\u00020\fH\u0087\b¢\u0006\u0004\b\r\u0010\u000e\u001a\u001c\u0010\u0011\u001a\u00020\u0000*\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0087\b¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0014\u0010\u0014\u001a\u00020\u0000*\u00020\u0013H\u0087\b¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001c\u0010\u0016\u001a\u00020\u0000*\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000fH\u0087\b¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0014\u0010\u0019\u001a\u00020\u0000*\u00020\u0018H\u0087\b¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001c\u0010\u001b\u001a\u00020\u0000*\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u000fH\u0087\b¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0014\u0010\u001e\u001a\u00020\u0000*\u00020\u001dH\u0087\b¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001c\u0010 \u001a\u00020\u0000*\u00020\u001d2\u0006\u0010\u0010\u001a\u00020\u000fH\u0087\b¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"Ljava/math/BigDecimal;", "other", "e", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Ljava/math/BigDecimal;", "d", "g", "b", "f", "p", "(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;", "c", "a", "", "l", "(I)Ljava/math/BigDecimal;", "Ljava/math/MathContext;", "mathContext", "m", "(ILjava/math/MathContext;)Ljava/math/BigDecimal;", "", "n", "(J)Ljava/math/BigDecimal;", "o", "(JLjava/math/MathContext;)Ljava/math/BigDecimal;", "", "j", "(F)Ljava/math/BigDecimal;", "k", "(FLjava/math/MathContext;)Ljava/math/BigDecimal;", "", "h", "(D)Ljava/math/BigDecimal;", "i", "(DLjava/math/MathContext;)Ljava/math/BigDecimal;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/NumbersKt")
/* loaded from: classes7.dex */
class i0 {
    @c1(version = "1.2")
    @kotlin.internal.f
    private static final BigDecimal a(BigDecimal bigDecimal) {
        kotlin.jvm.internal.l0.p(bigDecimal, ProtectedSandApp.s("捚\u0001"));
        BigDecimal subtract = bigDecimal.subtract(BigDecimal.ONE);
        kotlin.jvm.internal.l0.o(subtract, ProtectedSandApp.s("捛\u0001"));
        return subtract;
    }

    @kotlin.internal.f
    private static final BigDecimal b(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        kotlin.jvm.internal.l0.p(bigDecimal, ProtectedSandApp.s("捚\u0001"));
        kotlin.jvm.internal.l0.p(bigDecimal2, ProtectedSandApp.s("捜\u0001"));
        BigDecimal divide = bigDecimal.divide(bigDecimal2, RoundingMode.HALF_EVEN);
        kotlin.jvm.internal.l0.o(divide, ProtectedSandApp.s("捝\u0001"));
        return divide;
    }

    @c1(version = "1.2")
    @kotlin.internal.f
    private static final BigDecimal c(BigDecimal bigDecimal) {
        kotlin.jvm.internal.l0.p(bigDecimal, ProtectedSandApp.s("捚\u0001"));
        BigDecimal add = bigDecimal.add(BigDecimal.ONE);
        kotlin.jvm.internal.l0.o(add, ProtectedSandApp.s("捞\u0001"));
        return add;
    }

    @kotlin.internal.f
    private static final BigDecimal d(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        kotlin.jvm.internal.l0.p(bigDecimal, ProtectedSandApp.s("捚\u0001"));
        kotlin.jvm.internal.l0.p(bigDecimal2, ProtectedSandApp.s("捜\u0001"));
        BigDecimal subtract = bigDecimal.subtract(bigDecimal2);
        kotlin.jvm.internal.l0.o(subtract, ProtectedSandApp.s("捛\u0001"));
        return subtract;
    }

    @kotlin.internal.f
    private static final BigDecimal e(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        kotlin.jvm.internal.l0.p(bigDecimal, ProtectedSandApp.s("捚\u0001"));
        kotlin.jvm.internal.l0.p(bigDecimal2, ProtectedSandApp.s("捜\u0001"));
        BigDecimal add = bigDecimal.add(bigDecimal2);
        kotlin.jvm.internal.l0.o(add, ProtectedSandApp.s("捞\u0001"));
        return add;
    }

    @kotlin.internal.f
    private static final BigDecimal f(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        kotlin.jvm.internal.l0.p(bigDecimal, ProtectedSandApp.s("捚\u0001"));
        kotlin.jvm.internal.l0.p(bigDecimal2, ProtectedSandApp.s("捜\u0001"));
        BigDecimal remainder = bigDecimal.remainder(bigDecimal2);
        kotlin.jvm.internal.l0.o(remainder, ProtectedSandApp.s("损\u0001"));
        return remainder;
    }

    @kotlin.internal.f
    private static final BigDecimal g(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        kotlin.jvm.internal.l0.p(bigDecimal, ProtectedSandApp.s("捚\u0001"));
        kotlin.jvm.internal.l0.p(bigDecimal2, ProtectedSandApp.s("捜\u0001"));
        BigDecimal multiply = bigDecimal.multiply(bigDecimal2);
        kotlin.jvm.internal.l0.o(multiply, ProtectedSandApp.s("捠\u0001"));
        return multiply;
    }

    @c1(version = "1.2")
    @kotlin.internal.f
    private static final BigDecimal h(double d5) {
        return new BigDecimal(String.valueOf(d5));
    }

    @c1(version = "1.2")
    @kotlin.internal.f
    private static final BigDecimal i(double d5, MathContext mathContext) {
        kotlin.jvm.internal.l0.p(mathContext, ProtectedSandApp.s("捡\u0001"));
        return new BigDecimal(String.valueOf(d5), mathContext);
    }

    @c1(version = "1.2")
    @kotlin.internal.f
    private static final BigDecimal j(float f4) {
        return new BigDecimal(String.valueOf(f4));
    }

    @c1(version = "1.2")
    @kotlin.internal.f
    private static final BigDecimal k(float f4, MathContext mathContext) {
        kotlin.jvm.internal.l0.p(mathContext, ProtectedSandApp.s("捡\u0001"));
        return new BigDecimal(String.valueOf(f4), mathContext);
    }

    @c1(version = "1.2")
    @kotlin.internal.f
    private static final BigDecimal l(int i4) {
        BigDecimal valueOf = BigDecimal.valueOf(i4);
        kotlin.jvm.internal.l0.o(valueOf, ProtectedSandApp.s("换\u0001"));
        return valueOf;
    }

    @c1(version = "1.2")
    @kotlin.internal.f
    private static final BigDecimal m(int i4, MathContext mathContext) {
        kotlin.jvm.internal.l0.p(mathContext, ProtectedSandApp.s("捡\u0001"));
        return new BigDecimal(i4, mathContext);
    }

    @c1(version = "1.2")
    @kotlin.internal.f
    private static final BigDecimal n(long j4) {
        BigDecimal valueOf = BigDecimal.valueOf(j4);
        kotlin.jvm.internal.l0.o(valueOf, ProtectedSandApp.s("换\u0001"));
        return valueOf;
    }

    @c1(version = "1.2")
    @kotlin.internal.f
    private static final BigDecimal o(long j4, MathContext mathContext) {
        kotlin.jvm.internal.l0.p(mathContext, ProtectedSandApp.s("捡\u0001"));
        return new BigDecimal(j4, mathContext);
    }

    @kotlin.internal.f
    private static final BigDecimal p(BigDecimal bigDecimal) {
        kotlin.jvm.internal.l0.p(bigDecimal, ProtectedSandApp.s("捚\u0001"));
        BigDecimal negate = bigDecimal.negate();
        kotlin.jvm.internal.l0.o(negate, ProtectedSandApp.s("捣\u0001"));
        return negate;
    }
}
