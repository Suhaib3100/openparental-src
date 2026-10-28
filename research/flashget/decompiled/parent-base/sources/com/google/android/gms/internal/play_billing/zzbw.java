package com.google.android.gms.internal.play_billing;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
public class zzbw {
    zzbw() {
    }

    static int zza(int i4, int i5) {
        if (i5 < 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("횲"));
        }
        if (i5 <= i4) {
            return i4;
        }
        int i6 = i4 + (i4 >> 1) + 1;
        if (i6 < i5) {
            int highestOneBit = Integer.highestOneBit(i5 - 1);
            i6 = highestOneBit + highestOneBit;
        }
        if (i6 < 0) {
            return Integer.MAX_VALUE;
        }
        return i6;
    }
}
