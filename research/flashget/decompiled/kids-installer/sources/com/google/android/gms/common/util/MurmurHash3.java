package com.google.android.gms.common.util;

import androidx.annotation.o0;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public class MurmurHash3 {
    private MurmurHash3() {
    }

    @KeepForSdk
    public static int murmurhash3_x86_32(@o0 byte[] bArr, int i5, int i6, int i7) {
        int i8 = (i6 & (-4)) + i5;
        while (i5 < i8) {
            int i9 = ((bArr[i5] & 255) | ((bArr[i5 + 1] & 255) << 8) | ((bArr[i5 + 2] & 255) << 16) | (bArr[i5 + 3] << 24)) * (-862048943);
            int i10 = i7 ^ (((i9 << 15) | (i9 >>> 17)) * 461845907);
            i7 = (((i10 >>> 19) | (i10 << 13)) * 5) - 430675100;
            i5 += 4;
        }
        int i11 = i6 & 3;
        if (i11 != 1) {
            if (i11 != 2) {
                r3 = i11 == 3 ? (bArr[i8 + 2] & 255) << 16 : 0;
                int i12 = i7 ^ i6;
                int i13 = (i12 ^ (i12 >>> 16)) * (-2048144789);
                int i14 = (i13 ^ (i13 >>> 13)) * (-1028477387);
                return i14 ^ (i14 >>> 16);
            }
            r3 |= (bArr[i8 + 1] & 255) << 8;
        }
        int i15 = ((bArr[i8] & 255) | r3) * (-862048943);
        i7 ^= ((i15 >>> 17) | (i15 << 15)) * 461845907;
        int i122 = i7 ^ i6;
        int i132 = (i122 ^ (i122 >>> 16)) * (-2048144789);
        int i142 = (i132 ^ (i132 >>> 13)) * (-1028477387);
        return i142 ^ (i142 >>> 16);
    }
}
