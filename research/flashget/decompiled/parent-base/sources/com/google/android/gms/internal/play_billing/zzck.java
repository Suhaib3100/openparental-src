package com.google.android.gms.internal.play_billing;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.AbstractMap;
import java.util.Objects;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
final class zzck extends zzca {
    final /* synthetic */ zzcl zza;

    zzck(zzcl zzclVar) {
        Objects.requireNonNull(zzclVar);
        this.zza = zzclVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i4) {
        int i5;
        Object[] objArr;
        Object[] objArr2;
        zzcl zzclVar = this.zza;
        i5 = zzclVar.zzc;
        zzbl.zza(i4, i5, ProtectedSandApp.s("훾"));
        objArr = zzclVar.zzb;
        int i6 = i4 + i4;
        Object obj = objArr[i6];
        Objects.requireNonNull(obj);
        objArr2 = zzclVar.zzb;
        Object obj2 = objArr2[i6 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i4;
        i4 = this.zza.zzc;
        return i4;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbx
    public final boolean zzf() {
        return true;
    }
}
