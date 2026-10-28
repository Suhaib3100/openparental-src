package com.google.android.gms.internal.fido;

import android.support.v4.media.a;
import androidx.compose.foundation.text.q;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes5.dex */
final class zzgr extends zzgu {
    private final int zzc;
    private final int zzd;

    zzgr(byte[] bArr, int i4, int i5) {
        super(bArr);
        zzgx.zzj(i4, i4 + i5, bArr.length);
        this.zzc = i4;
        this.zzd = i5;
    }

    @Override // com.google.android.gms.internal.fido.zzgu, com.google.android.gms.internal.fido.zzgx
    public final byte zza(int i4) {
        int i5 = this.zzd;
        if (((i5 - (i4 + 1)) | i4) >= 0) {
            return this.zza[this.zzc + i4];
        }
        if (i4 < 0) {
            throw new ArrayIndexOutOfBoundsException(a.a(ProtectedSandApp.s("킞"), i4));
        }
        throw new ArrayIndexOutOfBoundsException(q.a(ProtectedSandApp.s("킟"), i4, ProtectedSandApp.s("킠"), i5));
    }

    @Override // com.google.android.gms.internal.fido.zzgu, com.google.android.gms.internal.fido.zzgx
    final byte zzb(int i4) {
        return this.zza[this.zzc + i4];
    }

    @Override // com.google.android.gms.internal.fido.zzgu
    protected final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.fido.zzgu, com.google.android.gms.internal.fido.zzgx
    public final int zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.fido.zzgu, com.google.android.gms.internal.fido.zzgx
    protected final void zze(byte[] bArr, int i4, int i5, int i6) {
        System.arraycopy(this.zza, this.zzc, bArr, 0, i6);
    }
}
