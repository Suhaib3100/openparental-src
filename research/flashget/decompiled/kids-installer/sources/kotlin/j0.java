package kotlin;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import kotlin.internal.InlineOnly;

/* compiled from: BigIntegers.kt */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0001H\u0087\n\u001a\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\r\u0010\u0005\u001a\u00020\u0001*\u00020\u0001H\u0087\n\u001a\r\u0010\u0006\u001a\u00020\u0001*\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0007\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f\u001a\u0015\u0010\t\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\n\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\u000b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\f\u001a\u00020\rH\u0087\f\u001a\u0015\u0010\u000e\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\f\u001a\u00020\rH\u0087\f\u001a\u0015\u0010\u000f\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\r\u0010\u0010\u001a\u00020\u0011*\u00020\u0001H\u0087\b\u001a!\u0010\u0010\u001a\u00020\u0011*\u00020\u00012\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0087\b\u001a\r\u0010\u0015\u001a\u00020\u0001*\u00020\rH\u0087\b\u001a\r\u0010\u0015\u001a\u00020\u0001*\u00020\u0016H\u0087\b\u001a\r\u0010\u0017\u001a\u00020\u0001*\u00020\u0001H\u0087\n\u001a\u0015\u0010\u0018\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f¨\u0006\u0019"}, d2 = {"and", "Ljava/math/BigInteger;", "other", "dec", "div", "inc", "inv", "minus", "or", "plus", "rem", "shl", "n", "", "shr", "times", "toBigDecimal", "Ljava/math/BigDecimal;", "scale", "mathContext", "Ljava/math/MathContext;", "toBigInteger", "", "unaryMinus", "xor", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/NumbersKt")
/* loaded from: classes5.dex */
class j0 extends i0 {
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigInteger A(BigInteger bigInteger, int i5) {
        kotlin.jvm.internal.l0.p(bigInteger, ProtectedSandApp.s("䄍"));
        BigInteger shiftRight = bigInteger.shiftRight(i5);
        kotlin.jvm.internal.l0.o(shiftRight, ProtectedSandApp.s("䄎"));
        return shiftRight;
    }

    @InlineOnly
    private static final BigInteger B(BigInteger bigInteger, BigInteger bigInteger2) {
        kotlin.jvm.internal.l0.p(bigInteger, ProtectedSandApp.s("䄏"));
        kotlin.jvm.internal.l0.p(bigInteger2, ProtectedSandApp.s("䄐"));
        BigInteger multiply = bigInteger.multiply(bigInteger2);
        kotlin.jvm.internal.l0.o(multiply, ProtectedSandApp.s("䄑"));
        return multiply;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal C(BigInteger bigInteger) {
        kotlin.jvm.internal.l0.p(bigInteger, ProtectedSandApp.s("䄒"));
        return new BigDecimal(bigInteger);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal D(BigInteger bigInteger, int i5, MathContext mathContext) {
        kotlin.jvm.internal.l0.p(bigInteger, ProtectedSandApp.s("䄓"));
        kotlin.jvm.internal.l0.p(mathContext, ProtectedSandApp.s("䄔"));
        return new BigDecimal(bigInteger, i5, mathContext);
    }

    static /* synthetic */ BigDecimal E(BigInteger bigInteger, int i5, MathContext mathContext, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i5 = 0;
        }
        if ((i6 & 2) != 0) {
            mathContext = MathContext.UNLIMITED;
            kotlin.jvm.internal.l0.o(mathContext, ProtectedSandApp.s("䄕"));
        }
        kotlin.jvm.internal.l0.p(bigInteger, ProtectedSandApp.s("䄖"));
        kotlin.jvm.internal.l0.p(mathContext, ProtectedSandApp.s("䄗"));
        return new BigDecimal(bigInteger, i5, mathContext);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigInteger F(int i5) {
        BigInteger valueOf = BigInteger.valueOf(i5);
        kotlin.jvm.internal.l0.o(valueOf, ProtectedSandApp.s("䄘"));
        return valueOf;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigInteger G(long j5) {
        BigInteger valueOf = BigInteger.valueOf(j5);
        kotlin.jvm.internal.l0.o(valueOf, ProtectedSandApp.s("䄙"));
        return valueOf;
    }

    @InlineOnly
    private static final BigInteger H(BigInteger bigInteger) {
        kotlin.jvm.internal.l0.p(bigInteger, ProtectedSandApp.s("䄚"));
        BigInteger negate = bigInteger.negate();
        kotlin.jvm.internal.l0.o(negate, ProtectedSandApp.s("䄛"));
        return negate;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigInteger I(BigInteger bigInteger, BigInteger bigInteger2) {
        kotlin.jvm.internal.l0.p(bigInteger, ProtectedSandApp.s("䄜"));
        kotlin.jvm.internal.l0.p(bigInteger2, ProtectedSandApp.s("䄝"));
        BigInteger xor = bigInteger.xor(bigInteger2);
        kotlin.jvm.internal.l0.o(xor, ProtectedSandApp.s("䄞"));
        return xor;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigInteger q(BigInteger bigInteger, BigInteger bigInteger2) {
        kotlin.jvm.internal.l0.p(bigInteger, ProtectedSandApp.s("䄟"));
        kotlin.jvm.internal.l0.p(bigInteger2, ProtectedSandApp.s("䄠"));
        BigInteger and = bigInteger.and(bigInteger2);
        kotlin.jvm.internal.l0.o(and, ProtectedSandApp.s("䄡"));
        return and;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigInteger r(BigInteger bigInteger) {
        kotlin.jvm.internal.l0.p(bigInteger, ProtectedSandApp.s("䄢"));
        BigInteger subtract = bigInteger.subtract(BigInteger.ONE);
        kotlin.jvm.internal.l0.o(subtract, ProtectedSandApp.s("䄣"));
        return subtract;
    }

    @InlineOnly
    private static final BigInteger s(BigInteger bigInteger, BigInteger bigInteger2) {
        kotlin.jvm.internal.l0.p(bigInteger, ProtectedSandApp.s("䄤"));
        kotlin.jvm.internal.l0.p(bigInteger2, ProtectedSandApp.s("䄥"));
        BigInteger divide = bigInteger.divide(bigInteger2);
        kotlin.jvm.internal.l0.o(divide, ProtectedSandApp.s("䄦"));
        return divide;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigInteger t(BigInteger bigInteger) {
        kotlin.jvm.internal.l0.p(bigInteger, ProtectedSandApp.s("䄧"));
        BigInteger add = bigInteger.add(BigInteger.ONE);
        kotlin.jvm.internal.l0.o(add, ProtectedSandApp.s("䄨"));
        return add;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigInteger u(BigInteger bigInteger) {
        kotlin.jvm.internal.l0.p(bigInteger, ProtectedSandApp.s("䄩"));
        BigInteger not = bigInteger.not();
        kotlin.jvm.internal.l0.o(not, ProtectedSandApp.s("䄪"));
        return not;
    }

    @InlineOnly
    private static final BigInteger v(BigInteger bigInteger, BigInteger bigInteger2) {
        kotlin.jvm.internal.l0.p(bigInteger, ProtectedSandApp.s("䄫"));
        kotlin.jvm.internal.l0.p(bigInteger2, ProtectedSandApp.s("䄬"));
        BigInteger subtract = bigInteger.subtract(bigInteger2);
        kotlin.jvm.internal.l0.o(subtract, ProtectedSandApp.s("䄭"));
        return subtract;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigInteger w(BigInteger bigInteger, BigInteger bigInteger2) {
        kotlin.jvm.internal.l0.p(bigInteger, ProtectedSandApp.s("䄮"));
        kotlin.jvm.internal.l0.p(bigInteger2, ProtectedSandApp.s("䄯"));
        BigInteger or = bigInteger.or(bigInteger2);
        kotlin.jvm.internal.l0.o(or, ProtectedSandApp.s("䄰"));
        return or;
    }

    @InlineOnly
    private static final BigInteger x(BigInteger bigInteger, BigInteger bigInteger2) {
        kotlin.jvm.internal.l0.p(bigInteger, ProtectedSandApp.s("䄱"));
        kotlin.jvm.internal.l0.p(bigInteger2, ProtectedSandApp.s("䄲"));
        BigInteger add = bigInteger.add(bigInteger2);
        kotlin.jvm.internal.l0.o(add, ProtectedSandApp.s("䄳"));
        return add;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final BigInteger y(BigInteger bigInteger, BigInteger bigInteger2) {
        kotlin.jvm.internal.l0.p(bigInteger, ProtectedSandApp.s("䄴"));
        kotlin.jvm.internal.l0.p(bigInteger2, ProtectedSandApp.s("䄵"));
        BigInteger remainder = bigInteger.remainder(bigInteger2);
        kotlin.jvm.internal.l0.o(remainder, ProtectedSandApp.s("䄶"));
        return remainder;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigInteger z(BigInteger bigInteger, int i5) {
        kotlin.jvm.internal.l0.p(bigInteger, ProtectedSandApp.s("䄷"));
        BigInteger shiftLeft = bigInteger.shiftLeft(i5);
        kotlin.jvm.internal.l0.o(shiftLeft, ProtectedSandApp.s("䄸"));
        return shiftLeft;
    }
}
