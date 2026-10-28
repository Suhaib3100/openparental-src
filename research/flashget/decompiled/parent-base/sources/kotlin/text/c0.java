package kotlin.text;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import kotlin.Metadata;
import kotlin.c1;
import kotlin.jvm.internal.r1;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StringNumberConversionsJVM.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0010\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\u0007\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\u0007\u0010\b\u001a\u001c\u0010\t\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\t\u0010\n\u001a\u001c\u0010\f\u001a\u00020\u0003*\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\f\u0010\r\u001a\u0016\u0010\u000f\u001a\u00020\u000e*\u0004\u0018\u00010\u0003H\u0087\b¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0014\u0010\u0011\u001a\u00020\u0000*\u00020\u0003H\u0087\b¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001c\u0010\u0013\u001a\u00020\u0000*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0014\u0010\u0015\u001a\u00020\u0006*\u00020\u0003H\u0087\b¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001c\u0010\u0017\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0014\u0010\u0019\u001a\u00020\u0001*\u00020\u0003H\u0087\b¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001c\u0010\u001b\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0014\u0010\u001d\u001a\u00020\u000b*\u00020\u0003H\u0087\b¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001c\u0010\u001f\u001a\u00020\u000b*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\u001f\u0010 \u001a\u0014\u0010\"\u001a\u00020!*\u00020\u0003H\u0087\b¢\u0006\u0004\b\"\u0010#\u001a\u0014\u0010%\u001a\u00020$*\u00020\u0003H\u0087\b¢\u0006\u0004\b%\u0010&\u001a\u0015\u0010'\u001a\u0004\u0018\u00010!*\u00020\u0003H\u0007¢\u0006\u0004\b'\u0010(\u001a\u0015\u0010)\u001a\u0004\u0018\u00010$*\u00020\u0003H\u0007¢\u0006\u0004\b)\u0010*\u001a\u0014\u0010,\u001a\u00020+*\u00020\u0003H\u0087\b¢\u0006\u0004\b,\u0010-\u001a\u001c\u0010.\u001a\u00020+*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b.\u0010/\u001a\u0015\u00100\u001a\u0004\u0018\u00010+*\u00020\u0003H\u0007¢\u0006\u0004\b0\u0010-\u001a\u001d\u00101\u001a\u0004\u0018\u00010+*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b1\u0010/\u001a\u0014\u00103\u001a\u000202*\u00020\u0003H\u0087\b¢\u0006\u0004\b3\u00104\u001a\u001c\u00107\u001a\u000202*\u00020\u00032\u0006\u00106\u001a\u000205H\u0087\b¢\u0006\u0004\b7\u00108\u001a\u0015\u00109\u001a\u0004\u0018\u000102*\u00020\u0003H\u0007¢\u0006\u0004\b9\u00104\u001a\u001d\u0010:\u001a\u0004\u0018\u000102*\u00020\u00032\u0006\u00106\u001a\u000205H\u0007¢\u0006\u0004\b:\u00108\u001a4\u0010?\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010;2\u0006\u0010<\u001a\u00020\u00032\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000=H\u0082\b¢\u0006\u0004\b?\u0010@¨\u0006A"}, d2 = {"", "", "radix", "", "Q0", "(BI)Ljava/lang/String;", "", "T0", "(SI)Ljava/lang/String;", "R0", "(II)Ljava/lang/String;", "", "S0", "(JI)Ljava/lang/String;", "", "D0", "(Ljava/lang/String;)Z", "E0", "(Ljava/lang/String;)B", "F0", "(Ljava/lang/String;I)B", "O0", "(Ljava/lang/String;)S", "P0", "(Ljava/lang/String;I)S", "K0", "(Ljava/lang/String;)I", "L0", "(Ljava/lang/String;I)I", "M0", "(Ljava/lang/String;)J", "N0", "(Ljava/lang/String;I)J", "", "I0", "(Ljava/lang/String;)F", "", "G0", "(Ljava/lang/String;)D", "J0", "(Ljava/lang/String;)Ljava/lang/Float;", "H0", "(Ljava/lang/String;)Ljava/lang/Double;", "Ljava/math/BigInteger;", "z0", "(Ljava/lang/String;)Ljava/math/BigInteger;", "A0", "(Ljava/lang/String;I)Ljava/math/BigInteger;", "B0", "C0", "Ljava/math/BigDecimal;", "v0", "(Ljava/lang/String;)Ljava/math/BigDecimal;", "Ljava/math/MathContext;", "mathContext", "w0", "(Ljava/lang/String;Ljava/math/MathContext;)Ljava/math/BigDecimal;", "x0", "y0", "T", "str", "Lkotlin/Function1;", "parse", "u0", "(Ljava/lang/String;Lld/l;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/text/StringsKt")
@r1({"SMAP\nStringNumberConversionsJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringNumberConversionsJVM.kt\nkotlin/text/StringsKt__StringNumberConversionsJVMKt\n*L\n1#1,274:1\n265#1,7:275\n265#1,7:282\n265#1,7:289\n265#1,7:296\n*S KotlinDebug\n*F\n+ 1 StringNumberConversionsJVM.kt\nkotlin/text/StringsKt__StringNumberConversionsJVMKt\n*L\n142#1:275,7\n149#1:282,7\n229#1:289,7\n240#1:296,7\n*E\n"})
/* loaded from: classes7.dex */
public class c0 extends b0 {
    @c1(version = "1.2")
    @kotlin.internal.f
    private static final BigInteger A0(String str, int i4) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("菡\u0001"));
        return new BigInteger(str, d.a(i4));
    }

    @fg.m
    @c1(version = "1.2")
    public static final BigInteger B0(@fg.l String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("菡\u0001"));
        return C0(str, 10);
    }

    @fg.m
    @c1(version = "1.2")
    public static final BigInteger C0(@fg.l String str, int i4) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("菡\u0001"));
        d.a(i4);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        if (length != 1) {
            for (int i5 = str.charAt(0) == '-' ? 1 : 0; i5 < length; i5++) {
                if (Character.digit((int) str.charAt(i5), i4) < 0) {
                    return null;
                }
            }
        } else if (Character.digit((int) str.charAt(0), i4) < 0) {
            return null;
        }
        return new BigInteger(str, d.a(i4));
    }

    @c1(version = "1.4")
    @kotlin.internal.f
    private static final boolean D0(String str) {
        return Boolean.parseBoolean(str);
    }

    @kotlin.internal.f
    private static final byte E0(String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("菡\u0001"));
        return Byte.parseByte(str);
    }

    @c1(version = "1.1")
    @kotlin.internal.f
    private static final byte F0(String str, int i4) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("菡\u0001"));
        return Byte.parseByte(str, d.a(i4));
    }

    @kotlin.internal.f
    private static final double G0(String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("菡\u0001"));
        return Double.parseDouble(str);
    }

    @fg.m
    @c1(version = "1.1")
    public static Double H0(@fg.l String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("菡\u0001"));
        try {
            if (u.value.k(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @kotlin.internal.f
    private static final float I0(String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("菡\u0001"));
        return Float.parseFloat(str);
    }

    @fg.m
    @c1(version = "1.1")
    public static Float J0(@fg.l String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("菡\u0001"));
        try {
            if (u.value.k(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @kotlin.internal.f
    private static final int K0(String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("菡\u0001"));
        return Integer.parseInt(str);
    }

    @c1(version = "1.1")
    @kotlin.internal.f
    private static final int L0(String str, int i4) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("菡\u0001"));
        return Integer.parseInt(str, d.a(i4));
    }

    @kotlin.internal.f
    private static final long M0(String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("菡\u0001"));
        return Long.parseLong(str);
    }

    @c1(version = "1.1")
    @kotlin.internal.f
    private static final long N0(String str, int i4) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("菡\u0001"));
        return Long.parseLong(str, d.a(i4));
    }

    @kotlin.internal.f
    private static final short O0(String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("菡\u0001"));
        return Short.parseShort(str);
    }

    @c1(version = "1.1")
    @kotlin.internal.f
    private static final short P0(String str, int i4) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("菡\u0001"));
        return Short.parseShort(str, d.a(i4));
    }

    @c1(version = "1.1")
    @kotlin.internal.f
    private static final String Q0(byte b5, int i4) {
        String num = Integer.toString(b5, d.a(i4));
        kotlin.jvm.internal.l0.o(num, ProtectedSandApp.s("菢\u0001"));
        return num;
    }

    @c1(version = "1.1")
    @kotlin.internal.f
    private static final String R0(int i4, int i5) {
        String num = Integer.toString(i4, d.a(i5));
        kotlin.jvm.internal.l0.o(num, ProtectedSandApp.s("菢\u0001"));
        return num;
    }

    @c1(version = "1.1")
    @kotlin.internal.f
    private static final String S0(long j4, int i4) {
        String l4 = Long.toString(j4, d.a(i4));
        kotlin.jvm.internal.l0.o(l4, ProtectedSandApp.s("菢\u0001"));
        return l4;
    }

    @c1(version = "1.1")
    @kotlin.internal.f
    private static final String T0(short s4, int i4) {
        String num = Integer.toString(s4, d.a(i4));
        kotlin.jvm.internal.l0.o(num, ProtectedSandApp.s("菢\u0001"));
        return num;
    }

    private static final <T> T u0(String str, ld.l<? super String, ? extends T> lVar) {
        try {
            if (u.value.k(str)) {
                return lVar.invoke(str);
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @c1(version = "1.2")
    @kotlin.internal.f
    private static final BigDecimal v0(String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("菡\u0001"));
        return new BigDecimal(str);
    }

    @c1(version = "1.2")
    @kotlin.internal.f
    private static final BigDecimal w0(String str, MathContext mathContext) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("菡\u0001"));
        kotlin.jvm.internal.l0.p(mathContext, ProtectedSandApp.s("菣\u0001"));
        return new BigDecimal(str, mathContext);
    }

    @fg.m
    @c1(version = "1.2")
    public static final BigDecimal x0(@fg.l String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("菡\u0001"));
        try {
            if (u.value.k(str)) {
                return new BigDecimal(str);
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @fg.m
    @c1(version = "1.2")
    public static final BigDecimal y0(@fg.l String str, @fg.l MathContext mathContext) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("菡\u0001"));
        kotlin.jvm.internal.l0.p(mathContext, ProtectedSandApp.s("菣\u0001"));
        try {
            if (u.value.k(str)) {
                return new BigDecimal(str, mathContext);
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @c1(version = "1.2")
    @kotlin.internal.f
    private static final BigInteger z0(String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("菡\u0001"));
        return new BigInteger(str);
    }
}
