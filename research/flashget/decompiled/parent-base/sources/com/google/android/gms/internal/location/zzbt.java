package com.google.android.gms.internal.location;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes5.dex */
final class zzbt<E> extends zzbs<E> {
    static final zzbs<Object> zza = new zzbt(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    zzbt(Object[] objArr, int i4) {
        this.zzb = objArr;
        this.zzc = i4;
    }

    @Override // java.util.List
    public final E get(int i4) {
        zzbm.zza(i4, this.zzc, ProtectedSandApp.s("톃"));
        return (E) this.zzb[i4];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.location.zzbp
    final Object[] zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.location.zzbp
    final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.location.zzbp
    final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.location.zzbp
    final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.location.zzbs, com.google.android.gms.internal.location.zzbp
    final int zzg(Object[] objArr, int i4) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzc);
        return this.zzc;
    }
}
