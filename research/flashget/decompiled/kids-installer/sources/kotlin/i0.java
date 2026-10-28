package kotlin;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import kotlin.internal.InlineOnly;

/* compiled from: BigDecimals.kt */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0087\n\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\n\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0001H\u0087\n\u001a\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\u0007\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\n\u001a\r\u0010\t\u001a\u00020\u0001*\u00020\nH\u0087\b\u001a\u0015\u0010\t\u001a\u00020\u0001*\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0087\b\u001a\r\u0010\t\u001a\u00020\u0001*\u00020\rH\u0087\b\u001a\u0015\u0010\t\u001a\u00020\u0001*\u00020\r2\u0006\u0010\u000b\u001a\u00020\fH\u0087\b\u001a\r\u0010\t\u001a\u00020\u0001*\u00020\u000eH\u0087\b\u001a\u0015\u0010\t\u001a\u00020\u0001*\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0087\b\u001a\r\u0010\t\u001a\u00020\u0001*\u00020\u000fH\u0087\b\u001a\u0015\u0010\t\u001a\u00020\u0001*\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\fH\u0087\b\u001a\r\u0010\u0010\u001a\u00020\u0001*\u00020\u0001H\u0087\n¨\u0006\u0011"}, d2 = {"dec", "Ljava/math/BigDecimal;", "div", "other", "inc", "minus", "plus", "rem", "times", "toBigDecimal", "", "mathContext", "Ljava/math/MathContext;", "", "", "", "unaryMinus", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/NumbersKt")
/* loaded from: classes5.dex */
class i0 {
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal a(BigDecimal bigDecimal) {
        kotlin.jvm.internal.l0.p(bigDecimal, ProtectedSandApp.s("㼨"));
        BigDecimal subtract = bigDecimal.subtract(BigDecimal.ONE);
        kotlin.jvm.internal.l0.o(subtract, ProtectedSandApp.s("㼩"));
        return subtract;
    }

    @InlineOnly
    private static final BigDecimal b(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        kotlin.jvm.internal.l0.p(bigDecimal, ProtectedSandApp.s("㼪"));
        kotlin.jvm.internal.l0.p(bigDecimal2, ProtectedSandApp.s("㼫"));
        BigDecimal divide = bigDecimal.divide(bigDecimal2, RoundingMode.HALF_EVEN);
        kotlin.jvm.internal.l0.o(divide, ProtectedSandApp.s("㼬"));
        return divide;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal c(BigDecimal bigDecimal) {
        kotlin.jvm.internal.l0.p(bigDecimal, ProtectedSandApp.s("㼭"));
        BigDecimal add = bigDecimal.add(BigDecimal.ONE);
        kotlin.jvm.internal.l0.o(add, ProtectedSandApp.s("㼮"));
        return add;
    }

    @InlineOnly
    private static final BigDecimal d(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        kotlin.jvm.internal.l0.p(bigDecimal, ProtectedSandApp.s("㼯"));
        kotlin.jvm.internal.l0.p(bigDecimal2, ProtectedSandApp.s("㼰"));
        BigDecimal subtract = bigDecimal.subtract(bigDecimal2);
        kotlin.jvm.internal.l0.o(subtract, ProtectedSandApp.s("㼱"));
        return subtract;
    }

    @InlineOnly
    private static final BigDecimal e(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        kotlin.jvm.internal.l0.p(bigDecimal, ProtectedSandApp.s("㼲"));
        kotlin.jvm.internal.l0.p(bigDecimal2, ProtectedSandApp.s("㼳"));
        BigDecimal add = bigDecimal.add(bigDecimal2);
        kotlin.jvm.internal.l0.o(add, ProtectedSandApp.s("㼴"));
        return add;
    }

    @InlineOnly
    private static final BigDecimal f(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        kotlin.jvm.internal.l0.p(bigDecimal, ProtectedSandApp.s("㼵"));
        kotlin.jvm.internal.l0.p(bigDecimal2, ProtectedSandApp.s("㼶"));
        BigDecimal remainder = bigDecimal.remainder(bigDecimal2);
        kotlin.jvm.internal.l0.o(remainder, ProtectedSandApp.s("㼷"));
        return remainder;
    }

    @InlineOnly
    private static final BigDecimal g(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        kotlin.jvm.internal.l0.p(bigDecimal, ProtectedSandApp.s("㼸"));
        kotlin.jvm.internal.l0.p(bigDecimal2, ProtectedSandApp.s("㼹"));
        BigDecimal multiply = bigDecimal.multiply(bigDecimal2);
        kotlin.jvm.internal.l0.o(multiply, ProtectedSandApp.s("㼺"));
        return multiply;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal h(double d6) {
        return new BigDecimal(String.valueOf(d6));
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal i(double d6, MathContext mathContext) {
        kotlin.jvm.internal.l0.p(mathContext, ProtectedSandApp.s("㼻"));
        return new BigDecimal(String.valueOf(d6), mathContext);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal j(float f6) {
        return new BigDecimal(String.valueOf(f6));
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal k(float f6, MathContext mathContext) {
        kotlin.jvm.internal.l0.p(mathContext, ProtectedSandApp.s("㼼"));
        return new BigDecimal(String.valueOf(f6), mathContext);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal l(int i5) {
        BigDecimal valueOf = BigDecimal.valueOf(i5);
        kotlin.jvm.internal.l0.o(valueOf, ProtectedSandApp.s("㼽"));
        return valueOf;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal m(int i5, MathContext mathContext) {
        kotlin.jvm.internal.l0.p(mathContext, ProtectedSandApp.s("㼾"));
        return new BigDecimal(i5, mathContext);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal n(long j5) {
        BigDecimal valueOf = BigDecimal.valueOf(j5);
        kotlin.jvm.internal.l0.o(valueOf, ProtectedSandApp.s("㼿"));
        return valueOf;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal o(long j5, MathContext mathContext) {
        kotlin.jvm.internal.l0.p(mathContext, ProtectedSandApp.s("㽀"));
        return new BigDecimal(j5, mathContext);
    }

    @InlineOnly
    private static final BigDecimal p(BigDecimal bigDecimal) {
        kotlin.jvm.internal.l0.p(bigDecimal, ProtectedSandApp.s("㽁"));
        BigDecimal negate = bigDecimal.negate();
        kotlin.jvm.internal.l0.o(negate, ProtectedSandApp.s("㽂"));
        return negate;
    }
}
