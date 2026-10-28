package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
public final class zzcc {
    Object[] zza = new Object[8];
    int zzb = 0;
    zzcb zzc;

    public final zzcc zza(Object obj, Object obj2) {
        int i4 = this.zzb + 1;
        Object[] objArr = this.zza;
        int length = objArr.length;
        int i5 = i4 + i4;
        if (i5 > length) {
            this.zza = Arrays.copyOf(objArr, zzbw.zza(length, i5));
        }
        zzbt.zza(obj, obj2);
        Object[] objArr2 = this.zza;
        int i6 = this.zzb;
        int i7 = i6 + i6;
        objArr2[i7] = obj;
        objArr2[i7 + 1] = obj2;
        this.zzb = i6 + 1;
        return this;
    }

    public final zzcd zzb() {
        zzcb zzcbVar = this.zzc;
        if (zzcbVar != null) {
            throw zzcbVar.zza();
        }
        zzco zzg = zzco.zzg(this.zzb, this.zza, this);
        zzcb zzcbVar2 = this.zzc;
        if (zzcbVar2 == null) {
            return zzg;
        }
        throw zzcbVar2.zza();
    }
}
