package com.google.android.gms.internal.maps;

import com.flashget.parentalcontrol.ProtectedSandApp;
import zc.a;

/* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
/* loaded from: classes5.dex */
final class zzay extends zzaz {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzaz zzc;

    zzay(zzaz zzazVar, int i4, int i5) {
        this.zzc = zzazVar;
        this.zza = i4;
        this.zzb = i5;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        zzas.zza(i4, this.zzb, ProtectedSandApp.s("톱"));
        return this.zzc.get(i4 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.maps.zzaw
    final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.maps.zzaw
    final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.maps.zzaw
    @a
    final Object[] zze() {
        return this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.maps.zzaz, java.util.List
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzaz subList(int i4, int i5) {
        zzas.zzc(i4, i5, this.zzb);
        int i6 = this.zza;
        return this.zzc.subList(i4 + i6, i5 + i6);
    }
}
