package com.google.android.gms.internal.play_billing;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Objects;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
final class zzbz extends zzca {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzca zzc;

    zzbz(zzca zzcaVar, int i4, int i5) {
        Objects.requireNonNull(zzcaVar);
        this.zzc = zzcaVar;
        this.zza = i4;
        this.zzb = i5;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        zzbl.zza(i4, this.zzb, ProtectedSandApp.s("횶"));
        return this.zzc.get(i4 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbx
    final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbx
    final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbx
    final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbx
    final Object[] zzg() {
        return this.zzc.zzg();
    }

    @Override // com.google.android.gms.internal.play_billing.zzca, java.util.List
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final zzca subList(int i4, int i5) {
        zzbl.zzd(i4, i5, this.zzb);
        int i6 = this.zza;
        return this.zzc.subList(i4 + i6, i5 + i6);
    }
}
