package okhttp3.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.net.IDN;
import java.net.InetAddress;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.text.v;
import okio.m;

/* compiled from: hostnames.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\u001a\u0013\u0010\u0001\u001a\u0004\u0018\u00010\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a)\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a7\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0017\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"", "e", "(Ljava/lang/String;)Ljava/lang/String;", "", "a", "(Ljava/lang/String;)Z", "input", "", "pos", "limit", "Ljava/net/InetAddress;", "c", "(Ljava/lang/String;II)Ljava/net/InetAddress;", "", "address", "addressOffset", "b", "(Ljava/lang/String;II[BI)Z", "d", "([B)Ljava/lang/String;", "okhttp"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public final class a {
    private static final boolean a(String str) {
        int length = str.length();
        for (int i4 = 0; i4 < length; i4++) {
            char charAt = str.charAt(i4);
            if (l0.t(charAt, 31) <= 0 || l0.t(charAt, 127) >= 0 || v.o3(ProtectedSandApp.s("鿟\u0001"), charAt, 0, false, 6, null) != -1) {
                return true;
            }
        }
        return false;
    }

    private static final boolean b(String str, int i4, int i5, byte[] bArr, int i6) {
        int i7 = i6;
        while (i4 < i5) {
            if (i7 == bArr.length) {
                return false;
            }
            if (i7 != i6) {
                if (str.charAt(i4) != '.') {
                    return false;
                }
                i4++;
            }
            int i10 = i4;
            int i11 = 0;
            while (i10 < i5) {
                char charAt = str.charAt(i10);
                if (l0.t(charAt, 48) < 0 || l0.t(charAt, 57) > 0) {
                    break;
                }
                if ((i11 == 0 && i4 != i10) || (i11 = ((i11 * 10) + charAt) - 48) > 255) {
                    return false;
                }
                i10++;
            }
            if (i10 - i4 == 0) {
                return false;
            }
            bArr[i7] = (byte) i11;
            i7++;
            i4 = i10;
        }
        return i7 == i6 + 4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a5, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.net.InetAddress c(java.lang.String r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 190
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.a.c(java.lang.String, int, int):java.net.InetAddress");
    }

    private static final String d(byte[] bArr) {
        int i4 = -1;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i6 < bArr.length) {
            int i10 = i6;
            while (i10 < 16 && bArr[i10] == 0 && bArr[i10 + 1] == 0) {
                i10 += 2;
            }
            int i11 = i10 - i6;
            if (i11 > i7 && i11 >= 4) {
                i4 = i6;
                i7 = i11;
            }
            i6 = i10 + 2;
        }
        m mVar = new m();
        while (i5 < bArr.length) {
            if (i5 == i4) {
                mVar.writeByte(58);
                i5 += i7;
                if (i5 == 16) {
                    mVar.writeByte(58);
                }
            } else {
                if (i5 > 0) {
                    mVar.writeByte(58);
                }
                mVar.a3((d.b(bArr[i5], 255) << 8) | (255 & bArr[i5 + 1]));
                i5 += 2;
            }
        }
        return mVar.n3();
    }

    @fg.m
    public static final String e(@l String str) {
        l0.p(str, ProtectedSandApp.s("鿣\u0001"));
        if (v.T2(str, ProtectedSandApp.s("鿡\u0001"), false, 2, null)) {
            InetAddress c5 = (v.s2(str, ProtectedSandApp.s("鿤\u0001"), false, 2, null) && v.J1(str, ProtectedSandApp.s("鿥\u0001"), false, 2, null)) ? c(str, 1, str.length() - 1) : c(str, 0, str.length());
            if (c5 == null) {
                return null;
            }
            byte[] address = c5.getAddress();
            if (address.length == 16) {
                l0.o(address, ProtectedSandApp.s("鿦\u0001"));
                return d(address);
            }
            if (address.length == 4) {
                return c5.getHostAddress();
            }
            throw new AssertionError(ProtectedSandApp.s("鿧\u0001") + str + '\'');
        }
        try {
            String ascii = IDN.toASCII(str);
            l0.o(ascii, ProtectedSandApp.s("鿨\u0001"));
            Locale locale = Locale.US;
            l0.o(locale, ProtectedSandApp.s("鿩\u0001"));
            if (ascii == null) {
                throw new NullPointerException(ProtectedSandApp.s("鿫\u0001"));
            }
            String lowerCase = ascii.toLowerCase(locale);
            l0.o(lowerCase, ProtectedSandApp.s("鿪\u0001"));
            if (lowerCase.length() != 0 && !a(lowerCase)) {
                return lowerCase;
            }
            return null;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
