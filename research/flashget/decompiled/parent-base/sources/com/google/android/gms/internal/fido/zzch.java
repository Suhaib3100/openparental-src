package com.google.android.gms.internal.fido;

import java.util.AbstractMap;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes5.dex */
final class zzch extends zzcc {
    final /* synthetic */ zzci zza;

    zzch(zzci zzciVar) {
        this.zza = zzciVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i4) {
        zzcv zzcvVar;
        zzcc zzccVar;
        zzcvVar = this.zza.zza.zzd;
        Object obj = zzcvVar.zzd.get(i4);
        zzccVar = this.zza.zza.zze;
        return new AbstractMap.SimpleImmutableEntry(obj, zzccVar.get(i4));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zza.size();
    }
}
