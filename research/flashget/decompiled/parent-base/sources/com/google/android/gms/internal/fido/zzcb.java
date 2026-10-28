package com.google.android.gms.internal.fido;

import com.flashget.parentalcontrol.ProtectedSandApp;
import zc.a;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes5.dex */
final class zzcb extends zzcc {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzcc zzc;

    zzcb(zzcc zzccVar, int i4, int i5) {
        this.zzc = zzccVar;
        this.zza = i4;
        this.zzb = i5;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        zzbm.zza(i4, this.zzb, ProtectedSandApp.s("퀥"));
        return this.zzc.get(i4 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.fido.zzby
    final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.fido.zzby
    final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.fido.zzby
    @a
    final Object[] zze() {
        return this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.fido.zzcc, java.util.List
    /* renamed from: zzg */
    public final zzcc subList(int i4, int i5) {
        zzbm.zze(i4, i5, this.zzb);
        int i6 = this.zza;
        return this.zzc.subList(i4 + i6, i5 + i6);
    }
}
