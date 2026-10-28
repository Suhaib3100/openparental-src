package com.google.android.gms.common.util;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
@KeepForSdk
/* loaded from: classes5.dex */
public final class HexDumpUtils {
    @q0
    @KeepForSdk
    public static String dump(@o0 byte[] bArr, int i4, int i5, boolean z4) {
        int length;
        if (bArr == null || (length = bArr.length) == 0 || i4 < 0 || i5 <= 0 || i4 + i5 > length) {
            return null;
        }
        StringBuilder sb = new StringBuilder(((i5 + 15) / 16) * (z4 ? 75 : 57));
        int i6 = i5;
        int i7 = 0;
        int i10 = 0;
        while (i6 > 0) {
            if (i7 == 0) {
                if (i5 < 65536) {
                    sb.append(String.format(ProtectedSandApp.s("쯬"), Integer.valueOf(i4)));
                } else {
                    sb.append(String.format(ProtectedSandApp.s("쯭"), Integer.valueOf(i4)));
                }
                i10 = i4;
            } else if (i7 == 8) {
                sb.append(ProtectedSandApp.s("쯮"));
            }
            sb.append(String.format(ProtectedSandApp.s("쯯"), Integer.valueOf(bArr[i4] & 255)));
            i6--;
            i7++;
            if (z4 && (i7 == 16 || i6 == 0)) {
                int i11 = 16 - i7;
                if (i11 > 0) {
                    for (int i12 = 0; i12 < i11; i12++) {
                        sb.append(ProtectedSandApp.s("쯰"));
                    }
                }
                String s4 = ProtectedSandApp.s("쯱");
                if (i11 >= 8) {
                    sb.append(s4);
                }
                sb.append(s4);
                for (int i13 = 0; i13 < i7; i13++) {
                    char c5 = (char) bArr[i10 + i13];
                    if (c5 < ' ' || c5 > '~') {
                        c5 = '.';
                    }
                    sb.append(c5);
                }
            }
            if (i7 == 16 || i6 == 0) {
                sb.append('\n');
                i7 = 0;
            }
            i4++;
        }
        return sb.toString();
    }
}
