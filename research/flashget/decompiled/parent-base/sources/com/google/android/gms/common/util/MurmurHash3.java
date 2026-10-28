package com.google.android.gms.common.util;

import androidx.annotation.o0;
import androidx.collection.x2;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
@KeepForSdk
/* loaded from: classes5.dex */
public class MurmurHash3 {
    private MurmurHash3() {
    }

    @KeepForSdk
    public static int murmurhash3_x86_32(@o0 byte[] bArr, int i4, int i5, int i6) {
        int i7;
        int i10 = i4;
        while (true) {
            i7 = (i5 & (-4)) + i4;
            if (i10 >= i7) {
                break;
            }
            int i11 = ((bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | (bArr[i10 + 3] << 24)) * x2.f2466j;
            int i12 = i6 ^ (((i11 >>> 17) | (i11 << 15)) * 461845907);
            i6 = (((i12 >>> 19) | (i12 << 13)) * 5) - 430675100;
            i10 += 4;
        }
        int i13 = i5 & 3;
        if (i13 != 1) {
            if (i13 != 2) {
                r0 = i13 == 3 ? (bArr[i7 + 2] & 255) << 16 : 0;
                int i14 = i6 ^ i5;
                int i15 = (i14 ^ (i14 >>> 16)) * (-2048144789);
                int i16 = (i15 ^ (i15 >>> 13)) * (-1028477387);
                return i16 ^ (i16 >>> 16);
            }
            r0 |= (bArr[i7 + 1] & 255) << 8;
        }
        int i17 = ((bArr[i7] & 255) | r0) * x2.f2466j;
        i6 ^= ((i17 >>> 17) | (i17 << 15)) * 461845907;
        int i142 = i6 ^ i5;
        int i152 = (i142 ^ (i142 >>> 16)) * (-2048144789);
        int i162 = (i152 ^ (i152 >>> 13)) * (-1028477387);
        return i162 ^ (i162 >>> 16);
    }
}
