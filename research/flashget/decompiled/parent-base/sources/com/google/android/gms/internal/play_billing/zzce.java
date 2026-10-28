package com.google.android.gms.internal.play_billing;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
public final class zzce extends zzbv {
    public zzce() {
        super(4);
    }

    public final zzce zzb(Object obj) {
        obj.getClass();
        int length = this.zza.length;
        int zza = zzbw.zza(length, this.zzb + 1);
        if (zza > length || this.zzc) {
            this.zza = Arrays.copyOf(this.zza, zza);
            this.zzc = false;
        }
        Object[] objArr = this.zza;
        int i4 = this.zzb;
        this.zzb = i4 + 1;
        objArr[i4] = obj;
        return this;
    }

    public final zzcf zzc() {
        zzcf zzm;
        int i4 = this.zzb;
        if (i4 == 0) {
            return zzcp.zza;
        }
        if (i4 == 1) {
            Object obj = this.zza[0];
            Objects.requireNonNull(obj);
            return new zzcr(obj);
        }
        zzm = zzcf.zzm(i4, this.zza);
        this.zzb = zzm.size();
        this.zzc = true;
        return zzm;
    }
}
