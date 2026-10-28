package kotlin.text;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.SinceKotlin;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StringNumberConversions.kt */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0003\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0006\u001a\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\t\u001a\u0013\u0010\n\u001a\u0004\u0018\u00010\b*\u00020\u0003H\u0007¢\u0006\u0002\u0010\u000b\u001a\u001b\u0010\n\u001a\u0004\u0018\u00010\b*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\f\u001a\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e*\u00020\u0003H\u0007¢\u0006\u0002\u0010\u000f\u001a\u001b\u0010\r\u001a\u0004\u0018\u00010\u000e*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\u0010\u001a\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012*\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0013\u001a\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u0012*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, d2 = {"numberFormatError", "", "input", "", "toByteOrNull", "", "(Ljava/lang/String;)Ljava/lang/Byte;", "radix", "", "(Ljava/lang/String;I)Ljava/lang/Byte;", "toIntOrNull", "(Ljava/lang/String;)Ljava/lang/Integer;", "(Ljava/lang/String;I)Ljava/lang/Integer;", "toLongOrNull", "", "(Ljava/lang/String;)Ljava/lang/Long;", "(Ljava/lang/String;I)Ljava/lang/Long;", "toShortOrNull", "", "(Ljava/lang/String;)Ljava/lang/Short;", "(Ljava/lang/String;I)Ljava/lang/Short;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/text/StringsKt")
/* loaded from: classes6.dex */
public class d0 extends c0 {
    @d5.d
    public static final Void U0(@d5.d String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("贎"));
        throw new NumberFormatException(ProtectedSandApp.s("贏") + str + '\'');
    }

    @SinceKotlin(version = "1.1")
    @d5.e
    public static final Byte V0(@d5.d String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("贐"));
        return W0(str, 10);
    }

    @SinceKotlin(version = "1.1")
    @d5.e
    public static final Byte W0(@d5.d String str, int i5) {
        int intValue;
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("贑"));
        Integer Y0 = Y0(str, i5);
        if (Y0 == null || (intValue = Y0.intValue()) < -128 || intValue > 127) {
            return null;
        }
        return Byte.valueOf((byte) intValue);
    }

    @SinceKotlin(version = "1.1")
    @d5.e
    public static Integer X0(@d5.d String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("贒"));
        return Y0(str, 10);
    }

    @SinceKotlin(version = "1.1")
    @d5.e
    public static final Integer Y0(@d5.d String str, int i5) {
        boolean z5;
        int i6;
        int i7;
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("贓"));
        d.a(i5);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i8 = 0;
        char charAt = str.charAt(0);
        int i9 = -2147483647;
        if (kotlin.jvm.internal.l0.t(charAt, 48) < 0) {
            i6 = 1;
            if (length == 1) {
                return null;
            }
            if (charAt == '-') {
                i9 = Integer.MIN_VALUE;
                z5 = true;
            } else {
                if (charAt != '+') {
                    return null;
                }
                z5 = false;
            }
        } else {
            z5 = false;
            i6 = 0;
        }
        int i10 = -59652323;
        while (i6 < length) {
            int digit = Character.digit((int) str.charAt(i6), i5);
            if (digit < 0) {
                return null;
            }
            if ((i8 < i10 && (i10 != -59652323 || i8 < (i10 = i9 / i5))) || (i7 = i8 * i5) < i9 + digit) {
                return null;
            }
            i8 = i7 - digit;
            i6++;
        }
        return z5 ? Integer.valueOf(i8) : Integer.valueOf(-i8);
    }

    @SinceKotlin(version = "1.1")
    @d5.e
    public static Long Z0(@d5.d String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("贔"));
        return a1(str, 10);
    }

    @SinceKotlin(version = "1.1")
    @d5.e
    public static final Long a1(@d5.d String str, int i5) {
        boolean z5;
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("贕"));
        d.a(i5);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i6 = 0;
        char charAt = str.charAt(0);
        long j5 = -9223372036854775807L;
        if (kotlin.jvm.internal.l0.t(charAt, 48) < 0) {
            z5 = true;
            if (length == 1) {
                return null;
            }
            if (charAt == '-') {
                j5 = Long.MIN_VALUE;
                i6 = 1;
            } else {
                if (charAt != '+') {
                    return null;
                }
                z5 = false;
                i6 = 1;
            }
        } else {
            z5 = false;
        }
        long j6 = -256204778801521550L;
        long j7 = 0;
        long j8 = -256204778801521550L;
        while (i6 < length) {
            int digit = Character.digit((int) str.charAt(i6), i5);
            if (digit < 0) {
                return null;
            }
            if (j7 < j8) {
                if (j8 == j6) {
                    j8 = j5 / i5;
                    if (j7 < j8) {
                    }
                }
                return null;
            }
            long j9 = j7 * i5;
            long j10 = digit;
            if (j9 < j5 + j10) {
                return null;
            }
            j7 = j9 - j10;
            i6++;
            j6 = -256204778801521550L;
        }
        return z5 ? Long.valueOf(j7) : Long.valueOf(-j7);
    }

    @SinceKotlin(version = "1.1")
    @d5.e
    public static final Short b1(@d5.d String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("贖"));
        return c1(str, 10);
    }

    @SinceKotlin(version = "1.1")
    @d5.e
    public static final Short c1(@d5.d String str, int i5) {
        int intValue;
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("贗"));
        Integer Y0 = Y0(str, i5);
        if (Y0 == null || (intValue = Y0.intValue()) < -32768 || intValue > 32767) {
            return null;
        }
        return Short.valueOf((short) intValue);
    }
}
