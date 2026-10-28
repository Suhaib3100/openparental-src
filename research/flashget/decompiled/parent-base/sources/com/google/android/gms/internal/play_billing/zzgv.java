package com.google.android.gms.internal.play_billing;

import java.nio.ByteBuffer;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
public final class zzgv {
    public static final byte[] zza;

    static {
        byte[] bArr = new byte[0];
        zza = bArr;
        ByteBuffer.wrap(bArr);
        int i4 = zzft.zza;
        try {
            new zzfr(bArr, 0, 0, false, null).zza(0);
        } catch (zzhb e4) {
            throw new IllegalArgumentException(e4);
        }
    }

    public static int zza(boolean z4) {
        return z4 ? 1231 : 1237;
    }

    static int zzb(int i4, byte[] bArr, int i5, int i6) {
        for (int i7 = i5; i7 < i5 + i6; i7++) {
            i4 = (i4 * 31) + bArr[i7];
        }
        return i4;
    }
}
