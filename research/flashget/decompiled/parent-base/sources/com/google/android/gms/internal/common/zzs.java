package com.google.android.gms.internal.common;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes5.dex */
final class zzs extends zzv {
    final /* synthetic */ zzp zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzs(zzw zzwVar, CharSequence charSequence, zzp zzpVar) {
        super(zzwVar, charSequence);
        this.zza = zzpVar;
    }

    @Override // com.google.android.gms.internal.common.zzv
    final int zzc(int i4) {
        CharSequence charSequence = ((zzv) this).zzb;
        int length = charSequence.length();
        zzr.zzc(i4, length, ProtectedSandApp.s("쿫"));
        while (i4 < length) {
            if (this.zza.zza(charSequence.charAt(i4))) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.common.zzv
    final int zzd(int i4) {
        return i4 + 1;
    }
}
