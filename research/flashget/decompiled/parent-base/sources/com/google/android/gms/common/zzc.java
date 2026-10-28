package com.google.android.gms.common;

import com.google.android.gms.common.internal.ShowFirstParty;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
@ShowFirstParty
/* loaded from: classes5.dex */
public final class zzc {
    static int zza(int i4) {
        int[] iArr = {1, 2, 3};
        for (int i5 = 0; i5 < 3; i5++) {
            int i6 = iArr[i5];
            int i7 = i6 - 1;
            if (i6 == 0) {
                throw null;
            }
            if (i7 == i4) {
                return i6;
            }
        }
        return 1;
    }
}
