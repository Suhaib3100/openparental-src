package com.google.android.gms.internal.measurement;

import androidx.compose.foundation.text.q;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.1.2 */
/* loaded from: classes5.dex */
final class zzio extends zziv {
    private final int zzc;
    private final int zzd;

    zzio(byte[] bArr, int i4, int i5) {
        super(bArr);
        zzik.zza(i4, i4 + i5, bArr.length);
        this.zzc = i4;
        this.zzd = i5;
    }

    @Override // com.google.android.gms.internal.measurement.zziv, com.google.android.gms.internal.measurement.zzik
    public final byte zza(int i4) {
        int zzb = zzb();
        if (((zzb - (i4 + 1)) | i4) >= 0) {
            return this.zzb[this.zzc + i4];
        }
        if (i4 < 0) {
            throw new ArrayIndexOutOfBoundsException(android.support.v4.media.a.a(ProtectedSandApp.s("풧"), i4));
        }
        throw new ArrayIndexOutOfBoundsException(q.a(ProtectedSandApp.s("풨"), i4, ProtectedSandApp.s("풩"), zzb));
    }

    @Override // com.google.android.gms.internal.measurement.zziv, com.google.android.gms.internal.measurement.zzik
    final byte zzb(int i4) {
        return this.zzb[this.zzc + i4];
    }

    @Override // com.google.android.gms.internal.measurement.zziv
    protected final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zziv, com.google.android.gms.internal.measurement.zzik
    public final int zzb() {
        return this.zzd;
    }
}
