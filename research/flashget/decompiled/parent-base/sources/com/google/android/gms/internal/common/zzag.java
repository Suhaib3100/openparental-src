package com.google.android.gms.internal.common;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes5.dex */
final class zzag extends zzah {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzah zzc;

    zzag(zzah zzahVar, int i4, int i5) {
        Objects.requireNonNull(zzahVar);
        this.zzc = zzahVar;
        this.zza = i4;
        this.zzb = i5;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        zzr.zzb(i4, this.zzb, ProtectedSandApp.s("쿗"));
        return this.zzc.get(i4 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.common.zzac
    final Object[] zzb() {
        return this.zzc.zzb();
    }

    @Override // com.google.android.gms.internal.common.zzac
    final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.common.zzac
    final int zzd() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.common.zzac
    final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.common.zzah, java.util.List
    /* renamed from: zzi */
    public final zzah subList(int i4, int i5) {
        zzr.zzd(i4, i5, this.zzb);
        int i6 = this.zza;
        return this.zzc.subList(i4 + i6, i5 + i6);
    }
}
