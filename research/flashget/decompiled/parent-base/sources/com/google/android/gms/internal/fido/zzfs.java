package com.google.android.gms.internal.fido;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Serializable;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes5.dex */
final class zzfs extends zzft implements Serializable {
    final byte[] zza;

    zzfs(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.fido.zzft
    public final int zza() {
        byte[] bArr = this.zza;
        int length = bArr.length;
        if (length < 4) {
            throw new IllegalStateException(zzbo.zza(ProtectedSandApp.s("큯"), Integer.valueOf(length)));
        }
        int i4 = bArr[0] & 255;
        int i5 = bArr[1] & 255;
        int i6 = bArr[2] & 255;
        return ((bArr[3] & 255) << 24) | i4 | (i5 << 8) | (i6 << 16);
    }

    @Override // com.google.android.gms.internal.fido.zzft
    public final int zzb() {
        return this.zza.length * 8;
    }

    @Override // com.google.android.gms.internal.fido.zzft
    final boolean zzc(zzft zzftVar) {
        if (this.zza.length != zzftVar.zze().length) {
            return false;
        }
        boolean z4 = true;
        int i4 = 0;
        while (true) {
            byte[] bArr = this.zza;
            if (i4 >= bArr.length) {
                return z4;
            }
            z4 &= bArr[i4] == zzftVar.zze()[i4];
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.fido.zzft
    public final byte[] zzd() {
        return (byte[]) this.zza.clone();
    }

    @Override // com.google.android.gms.internal.fido.zzft
    final byte[] zze() {
        return this.zza;
    }
}
