package com.google.android.gms.internal.auth;

import android.support.v4.media.a;
import androidx.compose.foundation.text.q;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes5.dex */
final class zzdz extends zzec {
    private final int zzc;

    zzdz(byte[] bArr, int i4, int i5) {
        super(bArr);
        zzef.zzi(0, i5, bArr.length);
        this.zzc = i5;
    }

    @Override // com.google.android.gms.internal.auth.zzec, com.google.android.gms.internal.auth.zzef
    public final byte zza(int i4) {
        int i5 = this.zzc;
        if (((i5 - (i4 + 1)) | i4) >= 0) {
            return this.zza[i4];
        }
        if (i4 < 0) {
            throw new ArrayIndexOutOfBoundsException(a.a(ProtectedSandApp.s("켬"), i4));
        }
        throw new ArrayIndexOutOfBoundsException(q.a(ProtectedSandApp.s("켭"), i4, ProtectedSandApp.s("켮"), i5));
    }

    @Override // com.google.android.gms.internal.auth.zzec, com.google.android.gms.internal.auth.zzef
    final byte zzb(int i4) {
        return this.zza[i4];
    }

    @Override // com.google.android.gms.internal.auth.zzec
    protected final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.auth.zzec, com.google.android.gms.internal.auth.zzef
    public final int zzd() {
        return this.zzc;
    }
}
