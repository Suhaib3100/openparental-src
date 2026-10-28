package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzig extends zzhs {
    static final zzhs zza = new zzig(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    zzig(Object[] objArr, int i4) {
        this.zzb = objArr;
        this.zzc = i4;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        zzha.zza(i4, this.zzc, ProtectedSandApp.s("\ue9e3"));
        Object obj = this.zzb[i4];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.internal.zzhs, com.google.android.libraries.places.internal.zzhp
    final int zza(Object[] objArr, int i4) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzc);
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.internal.zzhp
    final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.internal.zzhp
    final int zzc() {
        return 0;
    }

    @Override // com.google.android.libraries.places.internal.zzhp
    final boolean zzf() {
        return false;
    }

    @Override // com.google.android.libraries.places.internal.zzhp
    final Object[] zzg() {
        return this.zzb;
    }
}
