package com.google.android.gms.internal.common;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes3.dex */
final class zzt extends zzw {
    final /* synthetic */ zzu zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzt(zzu zzuVar, zzx zzxVar, CharSequence charSequence) {
        super(zzxVar, charSequence);
        this.zza = zzuVar;
    }

    @Override // com.google.android.gms.internal.common.zzw
    final int zzc(int i5) {
        return i5 + 1;
    }

    @Override // com.google.android.gms.internal.common.zzw
    final int zzd(int i5) {
        zzo zzoVar = this.zza.zza;
        CharSequence charSequence = ((zzw) this).zzb;
        int length = charSequence.length();
        zzs.zzb(i5, length, ProtectedSandApp.s("⊵"));
        while (i5 < length) {
            if (zzoVar.zza(charSequence.charAt(i5))) {
                return i5;
            }
            i5++;
        }
        return -1;
    }
}
