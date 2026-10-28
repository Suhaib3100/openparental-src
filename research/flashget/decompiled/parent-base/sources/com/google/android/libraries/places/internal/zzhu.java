package com.google.android.libraries.places.internal;

import java.util.Arrays;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzhu {
    Object[] zza = new Object[8];
    int zzb = 0;
    zzht zzc;

    public final zzhu zza(Object obj, Object obj2) {
        int i4 = this.zzb + 1;
        int i5 = i4 + i4;
        Object[] objArr = this.zza;
        int length = objArr.length;
        if (i5 > length) {
            int i6 = length + (length >> 1) + 1;
            if (i6 < i5) {
                int highestOneBit = Integer.highestOneBit(i5 - 1);
                i6 = highestOneBit + highestOneBit;
            }
            if (i6 < 0) {
                i6 = Integer.MAX_VALUE;
            }
            this.zza = Arrays.copyOf(objArr, i6);
        }
        zzhh.zza(obj, obj2);
        Object[] objArr2 = this.zza;
        int i7 = this.zzb;
        int i10 = i7 + i7;
        objArr2[i10] = obj;
        objArr2[i10 + 1] = obj2;
        this.zzb = i7 + 1;
        return this;
    }

    public final zzhv zzb() {
        zzht zzhtVar = this.zzc;
        if (zzhtVar != null) {
            throw zzhtVar.zza();
        }
        zzil zzf = zzil.zzf(this.zzb, this.zza, this);
        zzht zzhtVar2 = this.zzc;
        if (zzhtVar2 == null) {
            return zzf;
        }
        throw zzhtVar2.zza();
    }
}
