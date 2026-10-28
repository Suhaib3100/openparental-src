package kotlin;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;

/* compiled from: BigIntegers.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001c\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001c\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u001c\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u001c\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u0006\u0010\u0003\u001a\u001c\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u0007\u0010\u0003\u001a\u0014\u0010\b\u001a\u00020\u0000*\u00020\u0000H\u0087\n¢\u0006\u0004\b\b\u0010\t\u001a\u0014\u0010\n\u001a\u00020\u0000*\u00020\u0000H\u0087\n¢\u0006\u0004\b\n\u0010\t\u001a\u0014\u0010\u000b\u001a\u00020\u0000*\u00020\u0000H\u0087\n¢\u0006\u0004\b\u000b\u0010\t\u001a\u0014\u0010\f\u001a\u00020\u0000*\u00020\u0000H\u0087\b¢\u0006\u0004\b\f\u0010\t\u001a\u001c\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\b\r\u0010\u0003\u001a\u001c\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\b\u000e\u0010\u0003\u001a\u001c\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\b\u000f\u0010\u0003\u001a\u001c\u0010\u0012\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0087\f¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001c\u0010\u0014\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0087\f¢\u0006\u0004\b\u0014\u0010\u0013\u001a\u0014\u0010\u0015\u001a\u00020\u0000*\u00020\u0010H\u0087\b¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0014\u0010\u0018\u001a\u00020\u0000*\u00020\u0017H\u0087\b¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0014\u0010\u001b\u001a\u00020\u001a*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u001b\u0010\u001c\u001a(\u0010 \u001a\u00020\u001a*\u00020\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u00102\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0087\b¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"Ljava/math/BigInteger;", "other", "x", "(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;", "v", "B", "s", "y", "H", "(Ljava/math/BigInteger;)Ljava/math/BigInteger;", "t", "r", "u", "q", "w", "I", "", "n", "z", "(Ljava/math/BigInteger;I)Ljava/math/BigInteger;", "A", "F", "(I)Ljava/math/BigInteger;", "", "G", "(J)Ljava/math/BigInteger;", "Ljava/math/BigDecimal;", "C", "(Ljava/math/BigInteger;)Ljava/math/BigDecimal;", "scale", "Ljava/math/MathContext;", "mathContext", "D", "(Ljava/math/BigInteger;ILjava/math/MathContext;)Ljava/math/BigDecimal;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/NumbersKt")
/* loaded from: classes7.dex */
class j0 extends i0 {
    @c1(version = "1.2")
    @kotlin.internal.f
    private static final BigInteger A(BigInteger bigInteger, int i4) {
        kotlin.jvm.internal.l0.p(bigInteger, ProtectedSandApp.s("捤\u0001"));
        BigInteger shiftRight = bigInteger.shiftRight(i4);
        kotlin.jvm.internal.l0.o(shiftRight, ProtectedSandApp.s("捥\u0001"));
        return shiftRight;
    }

    @kotlin.internal.f
    private static final BigInteger B(BigInteger bigInteger, BigInteger bigInteger2) {
        kotlin.jvm.internal.l0.p(bigInteger, ProtectedSandApp.s("捤\u0001"));
        kotlin.jvm.internal.l0.p(bigInteger2, ProtectedSandApp.s("捦\u0001"));
        BigInteger multiply = bigInteger.multiply(bigInteger2);
        kotlin.jvm.internal.l0.o(multiply, ProtectedSandApp.s("捧\u0001"));
        return multiply;
    }

    @c1(version = "1.2")
    @kotlin.internal.f
    private static final BigDecimal C(BigInteger bigInteger) {
        kotlin.jvm.internal.l0.p(bigInteger, ProtectedSandApp.s("捤\u0001"));
        return new BigDecimal(bigInteger);
    }

    @c1(version = "1.2")
    @kotlin.internal.f
    private static final BigDecimal D(BigInteger bigInteger, int i4, MathContext mathContext) {
        kotlin.jvm.internal.l0.p(bigInteger, ProtectedSandApp.s("捤\u0001"));
        kotlin.jvm.internal.l0.p(mathContext, ProtectedSandApp.s("捨\u0001"));
        return new BigDecimal(bigInteger, i4, mathContext);
    }

    static /* synthetic */ BigDecimal E(BigInteger bigInteger, int i4, MathContext mathContext, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = 0;
        }
        if ((i5 & 2) != 0) {
            mathContext = MathContext.UNLIMITED;
            kotlin.jvm.internal.l0.o(mathContext, ProtectedSandApp.s("捩\u0001"));
        }
        kotlin.jvm.internal.l0.p(bigInteger, ProtectedSandApp.s("捤\u0001"));
        kotlin.jvm.internal.l0.p(mathContext, ProtectedSandApp.s("捨\u0001"));
        return new BigDecimal(bigInteger, i4, mathContext);
    }

    @c1(version = "1.2")
    @kotlin.internal.f
    private static final BigInteger F(int i4) {
        BigInteger valueOf = BigInteger.valueOf(i4);
        kotlin.jvm.internal.l0.o(valueOf, ProtectedSandApp.s("捪\u0001"));
        return valueOf;
    }

    @c1(version = "1.2")
    @kotlin.internal.f
    private static final BigInteger G(long j4) {
        BigInteger valueOf = BigInteger.valueOf(j4);
        kotlin.jvm.internal.l0.o(valueOf, ProtectedSandApp.s("捪\u0001"));
        return valueOf;
    }

    @kotlin.internal.f
    private static final BigInteger H(BigInteger bigInteger) {
        kotlin.jvm.internal.l0.p(bigInteger, ProtectedSandApp.s("捤\u0001"));
        BigInteger negate = bigInteger.negate();
        kotlin.jvm.internal.l0.o(negate, ProtectedSandApp.s("捫\u0001"));
        return negate;
    }

    @c1(version = "1.2")
    @kotlin.internal.f
    private static final BigInteger I(BigInteger bigInteger, BigInteger bigInteger2) {
        kotlin.jvm.internal.l0.p(bigInteger, ProtectedSandApp.s("捤\u0001"));
        kotlin.jvm.internal.l0.p(bigInteger2, ProtectedSandApp.s("捦\u0001"));
        BigInteger xor = bigInteger.xor(bigInteger2);
        kotlin.jvm.internal.l0.o(xor, ProtectedSandApp.s("捬\u0001"));
        return xor;
    }

    @c1(version = "1.2")
    @kotlin.internal.f
    private static final BigInteger q(BigInteger bigInteger, BigInteger bigInteger2) {
        kotlin.jvm.internal.l0.p(bigInteger, ProtectedSandApp.s("捤\u0001"));
        kotlin.jvm.internal.l0.p(bigInteger2, ProtectedSandApp.s("捦\u0001"));
        BigInteger and = bigInteger.and(bigInteger2);
        kotlin.jvm.internal.l0.o(and, ProtectedSandApp.s("捭\u0001"));
        return and;
    }

    @c1(version = "1.2")
    @kotlin.internal.f
    private static final BigInteger r(BigInteger bigInteger) {
        kotlin.jvm.internal.l0.p(bigInteger, ProtectedSandApp.s("捤\u0001"));
        BigInteger subtract = bigInteger.subtract(BigInteger.ONE);
        kotlin.jvm.internal.l0.o(subtract, ProtectedSandApp.s("据\u0001"));
        return subtract;
    }

    @kotlin.internal.f
    private static final BigInteger s(BigInteger bigInteger, BigInteger bigInteger2) {
        kotlin.jvm.internal.l0.p(bigInteger, ProtectedSandApp.s("捤\u0001"));
        kotlin.jvm.internal.l0.p(bigInteger2, ProtectedSandApp.s("捦\u0001"));
        BigInteger divide = bigInteger.divide(bigInteger2);
        kotlin.jvm.internal.l0.o(divide, ProtectedSandApp.s("捯\u0001"));
        return divide;
    }

    @c1(version = "1.2")
    @kotlin.internal.f
    private static final BigInteger t(BigInteger bigInteger) {
        kotlin.jvm.internal.l0.p(bigInteger, ProtectedSandApp.s("捤\u0001"));
        BigInteger add = bigInteger.add(BigInteger.ONE);
        kotlin.jvm.internal.l0.o(add, ProtectedSandApp.s("捰\u0001"));
        return add;
    }

    @c1(version = "1.2")
    @kotlin.internal.f
    private static final BigInteger u(BigInteger bigInteger) {
        kotlin.jvm.internal.l0.p(bigInteger, ProtectedSandApp.s("捤\u0001"));
        BigInteger not = bigInteger.not();
        kotlin.jvm.internal.l0.o(not, ProtectedSandApp.s("捱\u0001"));
        return not;
    }

    @kotlin.internal.f
    private static final BigInteger v(BigInteger bigInteger, BigInteger bigInteger2) {
        kotlin.jvm.internal.l0.p(bigInteger, ProtectedSandApp.s("捤\u0001"));
        kotlin.jvm.internal.l0.p(bigInteger2, ProtectedSandApp.s("捦\u0001"));
        BigInteger subtract = bigInteger.subtract(bigInteger2);
        kotlin.jvm.internal.l0.o(subtract, ProtectedSandApp.s("据\u0001"));
        return subtract;
    }

    @c1(version = "1.2")
    @kotlin.internal.f
    private static final BigInteger w(BigInteger bigInteger, BigInteger bigInteger2) {
        kotlin.jvm.internal.l0.p(bigInteger, ProtectedSandApp.s("捤\u0001"));
        kotlin.jvm.internal.l0.p(bigInteger2, ProtectedSandApp.s("捦\u0001"));
        BigInteger or = bigInteger.or(bigInteger2);
        kotlin.jvm.internal.l0.o(or, ProtectedSandApp.s("捲\u0001"));
        return or;
    }

    @kotlin.internal.f
    private static final BigInteger x(BigInteger bigInteger, BigInteger bigInteger2) {
        kotlin.jvm.internal.l0.p(bigInteger, ProtectedSandApp.s("捤\u0001"));
        kotlin.jvm.internal.l0.p(bigInteger2, ProtectedSandApp.s("捦\u0001"));
        BigInteger add = bigInteger.add(bigInteger2);
        kotlin.jvm.internal.l0.o(add, ProtectedSandApp.s("捰\u0001"));
        return add;
    }

    @c1(version = "1.1")
    @kotlin.internal.f
    private static final BigInteger y(BigInteger bigInteger, BigInteger bigInteger2) {
        kotlin.jvm.internal.l0.p(bigInteger, ProtectedSandApp.s("捤\u0001"));
        kotlin.jvm.internal.l0.p(bigInteger2, ProtectedSandApp.s("捦\u0001"));
        BigInteger remainder = bigInteger.remainder(bigInteger2);
        kotlin.jvm.internal.l0.o(remainder, ProtectedSandApp.s("捳\u0001"));
        return remainder;
    }

    @c1(version = "1.2")
    @kotlin.internal.f
    private static final BigInteger z(BigInteger bigInteger, int i4) {
        kotlin.jvm.internal.l0.p(bigInteger, ProtectedSandApp.s("捤\u0001"));
        BigInteger shiftLeft = bigInteger.shiftLeft(i4);
        kotlin.jvm.internal.l0.o(shiftLeft, ProtectedSandApp.s("捴\u0001"));
        return shiftLeft;
    }
}
