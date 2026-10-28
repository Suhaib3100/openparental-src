package kotlin.text;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: StringNumberConversionsJVM.kt */
@Metadata(d1 = {"\u0000X\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\u001a4\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002H\u00010\u0005H\u0082\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a\r\u0010\b\u001a\u00020\t*\u00020\u0003H\u0087\b\u001a\u0015\u0010\b\u001a\u00020\t*\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0087\b\u001a\u000e\u0010\f\u001a\u0004\u0018\u00010\t*\u00020\u0003H\u0007\u001a\u0016\u0010\f\u001a\u0004\u0018\u00010\t*\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0007\u001a\r\u0010\r\u001a\u00020\u000e*\u00020\u0003H\u0087\b\u001a\u0015\u0010\r\u001a\u00020\u000e*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0087\b\u001a\u000e\u0010\u0011\u001a\u0004\u0018\u00010\u000e*\u00020\u0003H\u0007\u001a\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000e*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0007\u001a\u000f\u0010\u0012\u001a\u00020\u0013*\u0004\u0018\u00010\u0003H\u0087\b\u001a\r\u0010\u0014\u001a\u00020\u0015*\u00020\u0003H\u0087\b\u001a\u0015\u0010\u0014\u001a\u00020\u0015*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0087\b\u001a\r\u0010\u0016\u001a\u00020\u0017*\u00020\u0003H\u0087\b\u001a\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0017*\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0019\u001a\r\u0010\u001a\u001a\u00020\u001b*\u00020\u0003H\u0087\b\u001a\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001b*\u00020\u0003H\u0007¢\u0006\u0002\u0010\u001d\u001a\r\u0010\u001e\u001a\u00020\u0010*\u00020\u0003H\u0087\b\u001a\u0015\u0010\u001e\u001a\u00020\u0010*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0087\b\u001a\r\u0010\u001f\u001a\u00020 *\u00020\u0003H\u0087\b\u001a\u0015\u0010\u001f\u001a\u00020 *\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0087\b\u001a\r\u0010!\u001a\u00020\"*\u00020\u0003H\u0087\b\u001a\u0015\u0010!\u001a\u00020\"*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0087\b\u001a\u0015\u0010#\u001a\u00020\u0003*\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u0010H\u0087\b\u001a\u0015\u0010#\u001a\u00020\u0003*\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010H\u0087\b\u001a\u0015\u0010#\u001a\u00020\u0003*\u00020 2\u0006\u0010\u000f\u001a\u00020\u0010H\u0087\b\u001a\u0015\u0010#\u001a\u00020\u0003*\u00020\"2\u0006\u0010\u000f\u001a\u00020\u0010H\u0087\b¨\u0006$"}, d2 = {"screenFloatValue", "T", "str", "", "parse", "Lkotlin/Function1;", "screenFloatValue$StringsKt__StringNumberConversionsJVMKt", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "toBigDecimal", "Ljava/math/BigDecimal;", "mathContext", "Ljava/math/MathContext;", "toBigDecimalOrNull", "toBigInteger", "Ljava/math/BigInteger;", "radix", "", "toBigIntegerOrNull", "toBoolean", "", "toByte", "", "toDouble", "", "toDoubleOrNull", "(Ljava/lang/String;)Ljava/lang/Double;", "toFloat", "", "toFloatOrNull", "(Ljava/lang/String;)Ljava/lang/Float;", "toInt", "toLong", "", "toShort", "", "toString", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/text/StringsKt")
@SourceDebugExtension({"SMAP\nStringNumberConversionsJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringNumberConversionsJVM.kt\nkotlin/text/StringsKt__StringNumberConversionsJVMKt\n*L\n1#1,274:1\n265#1,7:275\n265#1,7:282\n265#1,7:289\n265#1,7:296\n*S KotlinDebug\n*F\n+ 1 StringNumberConversionsJVM.kt\nkotlin/text/StringsKt__StringNumberConversionsJVMKt\n*L\n142#1:275,7\n149#1:282,7\n229#1:289,7\n240#1:296,7\n*E\n"})
/* loaded from: classes6.dex */
class c0 extends b0 {
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigInteger A0(String str, int i5) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("賴"));
        return new BigInteger(str, d.a(i5));
    }

    @SinceKotlin(version = "1.2")
    @d5.e
    public static final BigInteger B0(@d5.d String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("賵"));
        return C0(str, 10);
    }

    @SinceKotlin(version = "1.2")
    @d5.e
    public static final BigInteger C0(@d5.d String str, int i5) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("賶"));
        d.a(i5);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        if (length != 1) {
            for (int i6 = str.charAt(0) == '-' ? 1 : 0; i6 < length; i6++) {
                if (Character.digit((int) str.charAt(i6), i5) < 0) {
                    return null;
                }
            }
        } else if (Character.digit((int) str.charAt(0), i5) < 0) {
            return null;
        }
        return new BigInteger(str, d.a(i5));
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final boolean D0(String str) {
        return Boolean.parseBoolean(str);
    }

    @InlineOnly
    private static final byte E0(String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("賷"));
        return Byte.parseByte(str);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte F0(String str, int i5) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("賸"));
        return Byte.parseByte(str, d.a(i5));
    }

    @InlineOnly
    private static final double G0(String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("賹"));
        return Double.parseDouble(str);
    }

    @SinceKotlin(version = "1.1")
    @d5.e
    public static final Double H0(@d5.d String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("賺"));
        try {
            if (ScreenFloatValueRegEx.f27180b.k(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @InlineOnly
    private static final float I0(String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("賻"));
        return Float.parseFloat(str);
    }

    @SinceKotlin(version = "1.1")
    @d5.e
    public static final Float J0(@d5.d String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("購"));
        try {
            if (ScreenFloatValueRegEx.f27180b.k(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @InlineOnly
    private static final int K0(String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("賽"));
        return Integer.parseInt(str);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final int L0(String str, int i5) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("賾"));
        return Integer.parseInt(str, d.a(i5));
    }

    @InlineOnly
    private static final long M0(String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("賿"));
        return Long.parseLong(str);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final long N0(String str, int i5) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("贀"));
        return Long.parseLong(str, d.a(i5));
    }

    @InlineOnly
    private static final short O0(String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("贁"));
        return Short.parseShort(str);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short P0(String str, int i5) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("贂"));
        return Short.parseShort(str, d.a(i5));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final String Q0(byte b6, int i5) {
        String num = Integer.toString(b6, d.a(i5));
        kotlin.jvm.internal.l0.o(num, ProtectedSandApp.s("贃"));
        return num;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final String R0(int i5, int i6) {
        String num = Integer.toString(i5, d.a(i6));
        kotlin.jvm.internal.l0.o(num, ProtectedSandApp.s("贄"));
        return num;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final String S0(long j5, int i5) {
        String l5 = Long.toString(j5, d.a(i5));
        kotlin.jvm.internal.l0.o(l5, ProtectedSandApp.s("贅"));
        return l5;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final String T0(short s5, int i5) {
        String num = Integer.toString(s5, d.a(i5));
        kotlin.jvm.internal.l0.o(num, ProtectedSandApp.s("贆"));
        return num;
    }

    private static final <T> T u0(String str, q3.l<? super String, ? extends T> lVar) {
        try {
            if (ScreenFloatValueRegEx.f27180b.k(str)) {
                return lVar.N(str);
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal v0(String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("贇"));
        return new BigDecimal(str);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal w0(String str, MathContext mathContext) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("贈"));
        kotlin.jvm.internal.l0.p(mathContext, ProtectedSandApp.s("贉"));
        return new BigDecimal(str, mathContext);
    }

    @SinceKotlin(version = "1.2")
    @d5.e
    public static final BigDecimal x0(@d5.d String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("贊"));
        try {
            if (ScreenFloatValueRegEx.f27180b.k(str)) {
                return new BigDecimal(str);
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @SinceKotlin(version = "1.2")
    @d5.e
    public static final BigDecimal y0(@d5.d String str, @d5.d MathContext mathContext) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("贋"));
        kotlin.jvm.internal.l0.p(mathContext, ProtectedSandApp.s("贌"));
        try {
            if (ScreenFloatValueRegEx.f27180b.k(str)) {
                return new BigDecimal(str, mathContext);
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigInteger z0(String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("贍"));
        return new BigInteger(str);
    }
}
