package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
abstract class zzhd extends zzgl {
    final CharSequence zzb;
    final zzgq zzc;
    int zzd = 0;
    int zze;

    protected zzhd(zzhe zzheVar, CharSequence charSequence) {
        zzgq zzgqVar;
        zzgqVar = zzheVar.zza;
        this.zzc = zzgqVar;
        this.zze = Integer.MAX_VALUE;
        this.zzb = ProtectedSandApp.s("\ue9bf");
    }

    @Override // com.google.android.libraries.places.internal.zzgl
    @zc.a
    protected final /* bridge */ /* synthetic */ Object zza() {
        int zzc;
        int i4 = this.zzd;
        while (true) {
            int i5 = this.zzd;
            if (i5 == -1) {
                zzb();
                return null;
            }
            int zzd = zzd(i5);
            if (zzd == -1) {
                zzd = this.zzb.length();
                this.zzd = -1;
                zzc = -1;
            } else {
                zzc = zzc(zzd);
                this.zzd = zzc;
            }
            if (zzc != i4) {
                if (i4 < zzd) {
                    this.zzb.charAt(i4);
                }
                if (i4 < zzd) {
                    this.zzb.charAt(zzd - 1);
                }
                int i6 = this.zze;
                if (i6 == 1) {
                    zzd = this.zzb.length();
                    this.zzd = -1;
                    if (zzd > i4) {
                        this.zzb.charAt(zzd - 1);
                    }
                } else {
                    this.zze = i6 - 1;
                }
                return this.zzb.subSequence(i4, zzd).toString();
            }
            int i7 = zzc + 1;
            this.zzd = i7;
            if (i7 > this.zzb.length()) {
                this.zzd = -1;
            }
        }
    }

    abstract int zzc(int i4);

    abstract int zzd(int i4);
}
