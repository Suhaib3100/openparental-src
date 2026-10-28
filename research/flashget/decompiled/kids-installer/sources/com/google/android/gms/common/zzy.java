package com.google.android.gms.common;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
final class zzy {
    static int zza(int i5) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i6 = 0; i6 < 6; i6++) {
            int i7 = iArr[i6];
            int i8 = i7 - 1;
            if (i7 == 0) {
                throw null;
            }
            if (i8 == i5) {
                return i7;
            }
        }
        return 1;
    }
}
