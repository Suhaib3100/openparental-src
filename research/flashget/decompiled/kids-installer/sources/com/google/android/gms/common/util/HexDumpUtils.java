package com.google.android.gms.common.util;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import kotlin.UByte;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public final class HexDumpUtils {
    @q0
    @KeepForSdk
    public static String dump(@o0 byte[] bArr, int i5, int i6, boolean z5) {
        int length;
        if (bArr == null || (length = bArr.length) == 0 || i5 < 0 || i6 <= 0 || i5 + i6 > length) {
            return null;
        }
        StringBuilder sb = new StringBuilder(((i6 + 15) / 16) * (z5 ? 75 : 57));
        int i7 = i6;
        int i8 = 0;
        int i9 = 0;
        while (i7 > 0) {
            if (i8 == 0) {
                if (i6 < 65536) {
                    sb.append(String.format(ProtectedSandApp.s("\u0c52"), Integer.valueOf(i5)));
                } else {
                    sb.append(String.format(ProtectedSandApp.s("\u0c53"), Integer.valueOf(i5)));
                }
                i9 = i5;
            } else if (i8 == 8) {
                sb.append(ProtectedSandApp.s("\u0c54"));
            }
            sb.append(String.format(ProtectedSandApp.s("ౕ"), Integer.valueOf(bArr[i5] & UByte.f27220r)));
            i7--;
            i8++;
            if (z5 && (i8 == 16 || i7 == 0)) {
                int i10 = 16 - i8;
                if (i10 > 0) {
                    for (int i11 = 0; i11 < i10; i11++) {
                        sb.append(ProtectedSandApp.s("ౖ"));
                    }
                }
                String s5 = ProtectedSandApp.s("\u0c57");
                if (i10 >= 8) {
                    sb.append(s5);
                }
                sb.append(s5);
                for (int i12 = 0; i12 < i8; i12++) {
                    char c6 = (char) bArr[i9 + i12];
                    if (c6 < ' ' || c6 > '~') {
                        c6 = '.';
                    }
                    sb.append(c6);
                }
            }
            if (i8 == 16 || i7 == 0) {
                sb.append('\n');
                i8 = 0;
            }
            i5++;
        }
        return sb.toString();
    }
}
