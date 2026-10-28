package kotlin.text;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.ExperimentalStdlibApi;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.internal.InlineOnly;

/* compiled from: UHexExtensions.kt */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0002\u0010\u0005\u001a\u001c\u0010\u0006\u001a\u00020\u0007*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0002\u0010\b\u001a\u001c\u0010\t\u001a\u00020\n*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0002\u0010\u000b\u001a\u001c\u0010\f\u001a\u00020\r*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0002\u0010\u000e\u001a\u001c\u0010\u000f\u001a\u00020\u0010*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0002\u0010\u0011\u001a\u001e\u0010\u0012\u001a\u00020\u0002*\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0004\b\u0013\u0010\u0014\u001a2\u0010\u0012\u001a\u00020\u0002*\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001e\u0010\u0012\u001a\u00020\u0002*\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001e\u0010\u0012\u001a\u00020\u0002*\u00020\n2\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001e\u0010\u0012\u001a\u00020\u0002*\u00020\r2\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001e\u0010\u0012\u001a\u00020\u0002*\u00020\u00102\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"hexToUByte", "Lkotlin/UByte;", "", "format", "Lkotlin/text/HexFormat;", "(Ljava/lang/String;Lkotlin/text/HexFormat;)B", "hexToUByteArray", "Lkotlin/UByteArray;", "(Ljava/lang/String;Lkotlin/text/HexFormat;)[B", "hexToUInt", "Lkotlin/UInt;", "(Ljava/lang/String;Lkotlin/text/HexFormat;)I", "hexToULong", "Lkotlin/ULong;", "(Ljava/lang/String;Lkotlin/text/HexFormat;)J", "hexToUShort", "Lkotlin/UShort;", "(Ljava/lang/String;Lkotlin/text/HexFormat;)S", "toHexString", "toHexString-ZQbaR00", "(BLkotlin/text/HexFormat;)Ljava/lang/String;", "startIndex", "", "endIndex", "toHexString-lZCiFrA", "([BIILkotlin/text/HexFormat;)Ljava/lang/String;", "toHexString-zHuV2wU", "([BLkotlin/text/HexFormat;)Ljava/lang/String;", "toHexString-8M7LxHw", "(ILkotlin/text/HexFormat;)Ljava/lang/String;", "toHexString-8UJCm-I", "(JLkotlin/text/HexFormat;)Ljava/lang/String;", "toHexString-r3ox_E0", "(SLkotlin/text/HexFormat;)Ljava/lang/String;", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class n0 {
    @ExperimentalStdlibApi
    @SinceKotlin(version = "1.9")
    @InlineOnly
    private static final byte a(String str, HexFormat hexFormat) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("孚"));
        kotlin.jvm.internal.l0.p(hexFormat, ProtectedSandApp.s("孛"));
        return UByte.r(j.h(str, hexFormat));
    }

    static byte b(String str, HexFormat hexFormat, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            HexFormat.f27090d.getClass();
            hexFormat = HexFormat.f27091e;
        }
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("孜"));
        kotlin.jvm.internal.l0.p(hexFormat, ProtectedSandApp.s("孝"));
        return UByte.r(j.h(str, hexFormat));
    }

    @ExperimentalStdlibApi
    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.9")
    @InlineOnly
    private static final byte[] c(String str, HexFormat hexFormat) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("孞"));
        kotlin.jvm.internal.l0.p(hexFormat, ProtectedSandApp.s("孟"));
        byte[] l5 = j.l(str, hexFormat);
        kotlin.jvm.internal.l0.p(l5, ProtectedSandApp.s("孠"));
        return l5;
    }

    static byte[] d(String str, HexFormat hexFormat, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            HexFormat.f27090d.getClass();
            hexFormat = HexFormat.f27091e;
        }
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("孡"));
        kotlin.jvm.internal.l0.p(hexFormat, ProtectedSandApp.s("孢"));
        byte[] l5 = j.l(str, hexFormat);
        kotlin.jvm.internal.l0.p(l5, ProtectedSandApp.s("季"));
        return l5;
    }

    @ExperimentalStdlibApi
    @SinceKotlin(version = "1.9")
    @InlineOnly
    private static final int e(String str, HexFormat hexFormat) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("孤"));
        kotlin.jvm.internal.l0.p(hexFormat, ProtectedSandApp.s("孥"));
        return UInt.r(j.p(str, hexFormat));
    }

    static int f(String str, HexFormat hexFormat, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            HexFormat.f27090d.getClass();
            hexFormat = HexFormat.f27091e;
        }
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("学"));
        kotlin.jvm.internal.l0.p(hexFormat, ProtectedSandApp.s("孧"));
        return UInt.r(j.p(str, hexFormat));
    }

    @ExperimentalStdlibApi
    @SinceKotlin(version = "1.9")
    @InlineOnly
    private static final long g(String str, HexFormat hexFormat) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("孨"));
        kotlin.jvm.internal.l0.p(hexFormat, ProtectedSandApp.s("孩"));
        return ULong.r(j.t(str, hexFormat));
    }

    static long h(String str, HexFormat hexFormat, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            HexFormat.f27090d.getClass();
            hexFormat = HexFormat.f27091e;
        }
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("孪"));
        kotlin.jvm.internal.l0.p(hexFormat, ProtectedSandApp.s("孫"));
        return ULong.r(j.t(str, hexFormat));
    }

    @ExperimentalStdlibApi
    @SinceKotlin(version = "1.9")
    @InlineOnly
    private static final short i(String str, HexFormat hexFormat) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("孬"));
        kotlin.jvm.internal.l0.p(hexFormat, ProtectedSandApp.s("孭"));
        return UShort.r(j.z(str, hexFormat));
    }

    static short j(String str, HexFormat hexFormat, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            HexFormat.f27090d.getClass();
            hexFormat = HexFormat.f27091e;
        }
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("孮"));
        kotlin.jvm.internal.l0.p(hexFormat, ProtectedSandApp.s("孯"));
        return UShort.r(j.z(str, hexFormat));
    }

    @ExperimentalStdlibApi
    @SinceKotlin(version = "1.9")
    @InlineOnly
    private static final String k(int i5, HexFormat hexFormat) {
        kotlin.jvm.internal.l0.p(hexFormat, ProtectedSandApp.s("孰"));
        return j.E(i5, hexFormat);
    }

    static String l(int i5, HexFormat hexFormat, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            HexFormat.f27090d.getClass();
            hexFormat = HexFormat.f27091e;
        }
        kotlin.jvm.internal.l0.p(hexFormat, ProtectedSandApp.s("孱"));
        return j.E(i5, hexFormat);
    }

    @ExperimentalStdlibApi
    @SinceKotlin(version = "1.9")
    @InlineOnly
    private static final String m(long j5, HexFormat hexFormat) {
        kotlin.jvm.internal.l0.p(hexFormat, ProtectedSandApp.s("孲"));
        return j.F(j5, hexFormat);
    }

    static String n(long j5, HexFormat hexFormat, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            HexFormat.f27090d.getClass();
            hexFormat = HexFormat.f27091e;
        }
        kotlin.jvm.internal.l0.p(hexFormat, ProtectedSandApp.s("孳"));
        return j.F(j5, hexFormat);
    }

    @ExperimentalStdlibApi
    @SinceKotlin(version = "1.9")
    @InlineOnly
    private static final String o(byte b6, HexFormat hexFormat) {
        kotlin.jvm.internal.l0.p(hexFormat, ProtectedSandApp.s("孴"));
        return j.D(b6, hexFormat);
    }

    static String p(byte b6, HexFormat hexFormat, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            HexFormat.f27090d.getClass();
            hexFormat = HexFormat.f27091e;
        }
        kotlin.jvm.internal.l0.p(hexFormat, ProtectedSandApp.s("孵"));
        return j.D(b6, hexFormat);
    }

    @ExperimentalStdlibApi
    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.9")
    @InlineOnly
    private static final String q(byte[] bArr, int i5, int i6, HexFormat hexFormat) {
        kotlin.jvm.internal.l0.p(bArr, ProtectedSandApp.s("孶"));
        kotlin.jvm.internal.l0.p(hexFormat, ProtectedSandApp.s("孷"));
        return j.H(bArr, i5, i6, hexFormat);
    }

    static String r(byte[] bArr, int i5, int i6, HexFormat hexFormat, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i5 = 0;
        }
        if ((i7 & 2) != 0) {
            i6 = bArr.length;
        }
        if ((i7 & 4) != 0) {
            HexFormat.f27090d.getClass();
            hexFormat = HexFormat.f27091e;
        }
        kotlin.jvm.internal.l0.p(bArr, ProtectedSandApp.s("學"));
        kotlin.jvm.internal.l0.p(hexFormat, ProtectedSandApp.s("孹"));
        return j.H(bArr, i5, i6, hexFormat);
    }

    @ExperimentalStdlibApi
    @SinceKotlin(version = "1.9")
    @InlineOnly
    private static final String s(short s5, HexFormat hexFormat) {
        kotlin.jvm.internal.l0.p(hexFormat, ProtectedSandApp.s("孺"));
        return j.G(s5, hexFormat);
    }

    static String t(short s5, HexFormat hexFormat, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            HexFormat.f27090d.getClass();
            hexFormat = HexFormat.f27091e;
        }
        kotlin.jvm.internal.l0.p(hexFormat, ProtectedSandApp.s("孻"));
        return j.G(s5, hexFormat);
    }

    @ExperimentalStdlibApi
    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.9")
    @InlineOnly
    private static final String u(byte[] bArr, HexFormat hexFormat) {
        kotlin.jvm.internal.l0.p(bArr, ProtectedSandApp.s("孼"));
        kotlin.jvm.internal.l0.p(hexFormat, ProtectedSandApp.s("孽"));
        return j.I(bArr, hexFormat);
    }

    static String v(byte[] bArr, HexFormat hexFormat, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            HexFormat.f27090d.getClass();
            hexFormat = HexFormat.f27091e;
        }
        kotlin.jvm.internal.l0.p(bArr, ProtectedSandApp.s("孾"));
        kotlin.jvm.internal.l0.p(hexFormat, ProtectedSandApp.s("孿"));
        return j.I(bArr, hexFormat);
    }
}
