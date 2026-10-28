package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzhr extends zzhs {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzhs zzc;

    zzhr(zzhs zzhsVar, int i4, int i5) {
        this.zzc = zzhsVar;
        this.zza = i4;
        this.zzb = i5;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        zzha.zza(i4, this.zzb, ProtectedSandApp.s("\ue9da"));
        return this.zzc.get(i4 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.internal.zzhp
    final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.libraries.places.internal.zzhp
    final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzhp
    final boolean zzf() {
        return true;
    }

    @Override // com.google.android.libraries.places.internal.zzhp
    @zc.a
    final Object[] zzg() {
        return this.zzc.zzg();
    }

    @Override // com.google.android.libraries.places.internal.zzhs, java.util.List
    /* renamed from: zzh */
    public final zzhs subList(int i4, int i5) {
        zzha.zzg(i4, i5, this.zzb);
        zzhs zzhsVar = this.zzc;
        int i6 = this.zza;
        return zzhsVar.subList(i4 + i6, i5 + i6);
    }
}
