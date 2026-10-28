package com.google.android.gms.internal.fido;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes5.dex */
final class zzff extends AbstractSet {
    final int zza = -1;
    final /* synthetic */ zzfg zzb;

    zzff(zzfg zzfgVar, int i4) {
        this.zzb = zzfgVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Object[] objArr;
        int i4 = this.zza;
        objArr = this.zzb.zzb;
        return Arrays.binarySearch(objArr, zzb(), zza(), obj, i4 == -1 ? zzfg.zza : zzfi.zza) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzfe(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return zza() - zzb();
    }

    final int zza() {
        int[] iArr;
        int i4 = this.zza;
        iArr = this.zzb.zzc;
        return iArr[i4 + 1];
    }

    final int zzb() {
        int[] iArr;
        if (this.zza == -1) {
            return 0;
        }
        iArr = this.zzb.zzc;
        return iArr[0];
    }
}
