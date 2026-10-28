package ve;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import okio.r0;

/* compiled from: -Utf8.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a%\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0011\u0010\u0007\u001a\u00020\u0000*\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "", "beginIndex", "endIndex", "", "b", "([BII)Ljava/lang/String;", "a", "(Ljava/lang/String;)[B", "okio"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class f {
    @l
    public static final byte[] a(@l String str) {
        int i4;
        char charAt;
        l0.p(str, ProtectedSandApp.s("Ⅺ"));
        byte[] bArr = new byte[str.length() * 4];
        int length = str.length();
        int i5 = 0;
        while (true) {
            String s4 = ProtectedSandApp.s("Ⅻ");
            if (i5 >= length) {
                byte[] copyOf = Arrays.copyOf(bArr, str.length());
                l0.o(copyOf, s4);
                return copyOf;
            }
            char charAt2 = str.charAt(i5);
            if (l0.t(charAt2, 128) >= 0) {
                int length2 = str.length();
                int i6 = i5;
                while (i5 < length2) {
                    char charAt3 = str.charAt(i5);
                    if (l0.t(charAt3, 128) < 0) {
                        int i7 = i6 + 1;
                        bArr[i6] = (byte) charAt3;
                        i5++;
                        while (i5 < length2 && l0.t(str.charAt(i5), 128) < 0) {
                            bArr[i7] = (byte) str.charAt(i5);
                            i5++;
                            i7++;
                        }
                        i6 = i7;
                    } else {
                        if (l0.t(charAt3, 2048) < 0) {
                            bArr[i6] = (byte) ((charAt3 >> 6) | 192);
                            i6 += 2;
                            bArr[i6 + 1] = (byte) ((charAt3 & '?') | 128);
                        } else if (55296 > charAt3 || 57343 < charAt3) {
                            bArr[i6] = (byte) ((charAt3 >> '\f') | 224);
                            bArr[i6 + 1] = (byte) (((charAt3 >> 6) & 63) | 128);
                            i6 += 3;
                            bArr[i6 + 2] = (byte) ((charAt3 & '?') | 128);
                        } else if (l0.t(charAt3, 56319) > 0 || length2 <= (i4 = i5 + 1) || 56320 > (charAt = str.charAt(i4)) || 57343 < charAt) {
                            bArr[i6] = r0.f85265a;
                            i5++;
                            i6++;
                        } else {
                            int charAt4 = (str.charAt(i4) + (charAt3 << '\n')) - 56613888;
                            bArr[i6] = (byte) ((charAt4 >> 18) | 240);
                            bArr[i6 + 1] = (byte) (((charAt4 >> 12) & 63) | 128);
                            bArr[i6 + 2] = (byte) (((charAt4 >> 6) & 63) | 128);
                            i6 += 4;
                            bArr[i6 + 3] = (byte) ((charAt4 & 63) | 128);
                            i5 += 2;
                        }
                        i5++;
                    }
                }
                byte[] copyOf2 = Arrays.copyOf(bArr, i6);
                l0.o(copyOf2, s4);
                return copyOf2;
            }
            bArr[i5] = (byte) charAt2;
            i5++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0100, code lost:
    
        if ((r16[r5] & 192) == 128) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0095, code lost:
    
        if ((r16[r5] & 192) == 128) goto L31;
     */
    @fg.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String b(@fg.l byte[] r16, int r17, int r18) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ve.f.b(byte[], int, int):java.lang.String");
    }

    public static /* synthetic */ String c(byte[] bArr, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = bArr.length;
        }
        return b(bArr, i4, i5);
    }
}
