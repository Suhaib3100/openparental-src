package com.google.android.gms.internal.common;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes5.dex */
final class zzaf extends zzah {
    private final transient zzah zza;

    zzaf(zzah zzahVar) {
        this.zza = zzahVar;
    }

    private final int zzs(int i4) {
        return (this.zza.size() - 1) - i4;
    }

    @Override // com.google.android.gms.internal.common.zzah, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.zza.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i4) {
        zzah zzahVar = this.zza;
        zzr.zzb(i4, zzahVar.size(), ProtectedSandApp.s("쿖"));
        return zzahVar.get(zzs(i4));
    }

    @Override // com.google.android.gms.internal.common.zzah, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.zza.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return zzs(lastIndexOf);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.common.zzah, java.util.List
    public final int lastIndexOf(Object obj) {
        int indexOf = this.zza.indexOf(obj);
        if (indexOf >= 0) {
            return zzs(indexOf);
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.common.zzac
    final boolean zzf() {
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.common.zzah
    public final zzah zzh() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.common.zzah, java.util.List
    /* renamed from: zzi, reason: merged with bridge method [inline-methods] */
    public final zzah subList(int i4, int i5) {
        zzah zzahVar = this.zza;
        zzr.zzd(i4, i5, zzahVar.size());
        return zzahVar.subList(zzahVar.size() - i5, zzahVar.size() - i4).zzh();
    }
}
