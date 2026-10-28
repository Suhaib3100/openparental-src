package kotlin.text;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.c1;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StringNumberConversions.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0010\u000e\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0015\u0010\t\u001a\u0004\u0018\u00010\b*\u00020\u0000H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u001d\u0010\u000b\u001a\u0004\u0018\u00010\b*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u0015\u0010\r\u001a\u0004\u0018\u00010\u0004*\u00020\u0000H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u001d\u0010\u000f\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0011*\u00020\u0000H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u0011*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"", "", "V0", "(Ljava/lang/String;)Ljava/lang/Byte;", "", "radix", "W0", "(Ljava/lang/String;I)Ljava/lang/Byte;", "", "b1", "(Ljava/lang/String;)Ljava/lang/Short;", "c1", "(Ljava/lang/String;I)Ljava/lang/Short;", "X0", "(Ljava/lang/String;)Ljava/lang/Integer;", "Y0", "(Ljava/lang/String;I)Ljava/lang/Integer;", "", "Z0", "(Ljava/lang/String;)Ljava/lang/Long;", "a1", "(Ljava/lang/String;I)Ljava/lang/Long;", "input", "", "U0", "(Ljava/lang/String;)Ljava/lang/Void;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/text/StringsKt")
/* loaded from: classes7.dex */
public class d0 extends c0 {
    @fg.l
    public static final Void U0(@fg.l String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("菴\u0001"));
        throw new NumberFormatException(ProtectedSandApp.s("菵\u0001") + str + '\'');
    }

    @fg.m
    @c1(version = "1.1")
    public static final Byte V0(@fg.l String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("菶\u0001"));
        return W0(str, 10);
    }

    @fg.m
    @c1(version = "1.1")
    public static final Byte W0(@fg.l String str, int i4) {
        int intValue;
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("菶\u0001"));
        Integer Y0 = Y0(str, i4);
        if (Y0 == null || (intValue = Y0.intValue()) < -128 || intValue > 127) {
            return null;
        }
        return Byte.valueOf((byte) intValue);
    }

    @fg.m
    @c1(version = "1.1")
    public static Integer X0(@fg.l String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("菶\u0001"));
        return Y0(str, 10);
    }

    @fg.m
    @c1(version = "1.1")
    public static final Integer Y0(@fg.l String str, int i4) {
        boolean z4;
        int i5;
        int i6;
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("菶\u0001"));
        d.a(i4);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i7 = 0;
        char charAt = str.charAt(0);
        int i10 = -2147483647;
        if (kotlin.jvm.internal.l0.t(charAt, 48) < 0) {
            i5 = 1;
            if (length == 1) {
                return null;
            }
            if (charAt == '-') {
                i10 = Integer.MIN_VALUE;
                z4 = true;
            } else {
                if (charAt != '+') {
                    return null;
                }
                z4 = false;
            }
        } else {
            z4 = false;
            i5 = 0;
        }
        int i11 = -59652323;
        while (i5 < length) {
            int digit = Character.digit((int) str.charAt(i5), i4);
            if (digit < 0) {
                return null;
            }
            if ((i7 < i11 && (i11 != -59652323 || i7 < (i11 = i10 / i4))) || (i6 = i7 * i4) < i10 + digit) {
                return null;
            }
            i7 = i6 - digit;
            i5++;
        }
        return z4 ? Integer.valueOf(i7) : Integer.valueOf(-i7);
    }

    @fg.m
    @c1(version = "1.1")
    public static Long Z0(@fg.l String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("菶\u0001"));
        return a1(str, 10);
    }

    @fg.m
    @c1(version = "1.1")
    public static final Long a1(@fg.l String str, int i4) {
        boolean z4;
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("菶\u0001"));
        d.a(i4);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i5 = 0;
        char charAt = str.charAt(0);
        long j4 = -9223372036854775807L;
        if (kotlin.jvm.internal.l0.t(charAt, 48) < 0) {
            z4 = true;
            if (length == 1) {
                return null;
            }
            if (charAt == '-') {
                j4 = Long.MIN_VALUE;
                i5 = 1;
            } else {
                if (charAt != '+') {
                    return null;
                }
                z4 = false;
                i5 = 1;
            }
        } else {
            z4 = false;
        }
        long j5 = -256204778801521550L;
        long j6 = 0;
        long j7 = -256204778801521550L;
        while (i5 < length) {
            int digit = Character.digit((int) str.charAt(i5), i4);
            if (digit < 0) {
                return null;
            }
            if (j6 < j7) {
                if (j7 == j5) {
                    j7 = j4 / i4;
                    if (j6 < j7) {
                    }
                }
                return null;
            }
            long j10 = j6 * i4;
            long j11 = digit;
            if (j10 < j4 + j11) {
                return null;
            }
            j6 = j10 - j11;
            i5++;
            j5 = -256204778801521550L;
        }
        return z4 ? Long.valueOf(j6) : Long.valueOf(-j6);
    }

    @fg.m
    @c1(version = "1.1")
    public static final Short b1(@fg.l String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("菶\u0001"));
        return c1(str, 10);
    }

    @fg.m
    @c1(version = "1.1")
    public static final Short c1(@fg.l String str, int i4) {
        int intValue;
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("菶\u0001"));
        Integer Y0 = Y0(str, i4);
        if (Y0 == null || (intValue = Y0.intValue()) < -32768 || intValue > 32767) {
            return null;
        }
        return Short.valueOf((short) intValue);
    }
}
