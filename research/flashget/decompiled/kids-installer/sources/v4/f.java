package v4;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import okio.r0;

/* compiled from: -Utf8.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001e\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001\u001a\n\u0010\u0006\u001a\u00020\u0000*\u00020\u0004¨\u0006\u0007"}, d2 = {"", "", "beginIndex", "endIndex", "", "b", "a", "okio"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class f {
    @d5.d
    public static final byte[] a(@d5.d String str) {
        int i5;
        int i6;
        char charAt;
        l0.p(str, ProtectedSandApp.s("欳"));
        byte[] bArr = new byte[str.length() * 4];
        int length = str.length();
        int i7 = 0;
        while (true) {
            String s5 = ProtectedSandApp.s("欴");
            if (i7 >= length) {
                byte[] copyOf = Arrays.copyOf(bArr, str.length());
                l0.o(copyOf, s5);
                return copyOf;
            }
            char charAt2 = str.charAt(i7);
            if (l0.t(charAt2, 128) >= 0) {
                int length2 = str.length();
                int i8 = i7;
                while (i7 < length2) {
                    char charAt3 = str.charAt(i7);
                    if (l0.t(charAt3, 128) < 0) {
                        int i9 = i8 + 1;
                        bArr[i8] = (byte) charAt3;
                        i7++;
                        while (i7 < length2 && l0.t(str.charAt(i7), 128) < 0) {
                            bArr[i9] = (byte) str.charAt(i7);
                            i7++;
                            i9++;
                        }
                        i8 = i9;
                    } else {
                        if (l0.t(charAt3, 2048) < 0) {
                            int i10 = i8 + 1;
                            bArr[i8] = (byte) ((charAt3 >> 6) | 192);
                            byte b6 = (byte) ((charAt3 & '?') | 128);
                            i5 = i10 + 1;
                            bArr[i10] = b6;
                        } else if (55296 > charAt3 || 57343 < charAt3) {
                            int i11 = i8 + 1;
                            bArr[i8] = (byte) ((charAt3 >> '\f') | 224);
                            int i12 = i11 + 1;
                            bArr[i11] = (byte) (((charAt3 >> 6) & 63) | 128);
                            byte b7 = (byte) ((charAt3 & '?') | 128);
                            i5 = i12 + 1;
                            bArr[i12] = b7;
                        } else if (l0.t(charAt3, 56319) > 0 || length2 <= (i6 = i7 + 1) || 56320 > (charAt = str.charAt(i6)) || 57343 < charAt) {
                            i5 = i8 + 1;
                            bArr[i8] = r0.f31710a;
                        } else {
                            int charAt4 = (str.charAt(i6) + (charAt3 << '\n')) - 56613888;
                            int i13 = i8 + 1;
                            bArr[i8] = (byte) ((charAt4 >> 18) | 240);
                            int i14 = i13 + 1;
                            bArr[i13] = (byte) (((charAt4 >> 12) & 63) | 128);
                            int i15 = i14 + 1;
                            bArr[i14] = (byte) (((charAt4 >> 6) & 63) | 128);
                            i5 = i15 + 1;
                            bArr[i15] = (byte) ((charAt4 & 63) | 128);
                            i7 += 2;
                            i8 = i5;
                        }
                        i7++;
                        i8 = i5;
                    }
                }
                byte[] copyOf2 = Arrays.copyOf(bArr, i8);
                l0.o(copyOf2, s5);
                return copyOf2;
            }
            bArr[i7] = (byte) charAt2;
            i7++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x011b, code lost:
    
        if (((r16[r5] & 192) == 128) == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x009c, code lost:
    
        if (((r16[r5] & 192) == 128) == false) goto L23;
     */
    @d5.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String b(@d5.d byte[] r16, int r17, int r18) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v4.f.b(byte[], int, int):java.lang.String");
    }

    public static /* synthetic */ String c(byte[] bArr, int i5, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i5 = 0;
        }
        if ((i7 & 2) != 0) {
            i6 = bArr.length;
        }
        return b(bArr, i5, i6);
    }
}
