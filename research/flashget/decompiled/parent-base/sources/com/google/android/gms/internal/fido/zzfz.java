package com.google.android.gms.internal.fido;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.security.MessageDigest;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes5.dex */
final class zzfz extends zzfp {
    private final MessageDigest zza;
    private final int zzb;
    private boolean zzc;

    /* synthetic */ zzfz(MessageDigest messageDigest, int i4, zzfy zzfyVar) {
        this.zza = messageDigest;
        this.zzb = i4;
    }

    private final void zzd() {
        zzbm.zzf(!this.zzc, ProtectedSandApp.s("큲"));
    }

    @Override // com.google.android.gms.internal.fido.zzfp
    protected final void zzb(byte[] bArr, int i4, int i5) {
        zzd();
        this.zza.update(bArr, 0, i5);
    }

    @Override // com.google.android.gms.internal.fido.zzfv
    public final zzft zzc() {
        zzd();
        this.zzc = true;
        int i4 = this.zzb;
        if (i4 == this.zza.getDigestLength()) {
            byte[] digest = this.zza.digest();
            int i5 = zzft.zzb;
            return new zzfs(digest);
        }
        byte[] copyOf = Arrays.copyOf(this.zza.digest(), i4);
        int i6 = zzft.zzb;
        return new zzfs(copyOf);
    }
}
