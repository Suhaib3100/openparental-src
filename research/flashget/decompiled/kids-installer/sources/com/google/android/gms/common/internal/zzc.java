package com.google.android.gms.common.internal;

import androidx.annotation.q0;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public abstract class zzc {

    @q0
    private Object zza;
    private boolean zzb = false;
    final /* synthetic */ BaseGmsClient zzd;

    public zzc(BaseGmsClient baseGmsClient, Object obj) {
        this.zzd = baseGmsClient;
        this.zza = obj;
    }

    protected abstract void zza(Object obj);

    protected abstract void zzc();

    public final void zze() {
        Object obj;
        synchronized (this) {
            obj = this.zza;
            if (this.zzb) {
                toString();
            }
        }
        if (obj != null) {
            try {
                zza(obj);
            } catch (RuntimeException e6) {
                throw e6;
            }
        }
        synchronized (this) {
            this.zzb = true;
        }
        zzg();
    }

    public final void zzf() {
        synchronized (this) {
            this.zza = null;
        }
    }

    public final void zzg() {
        ArrayList arrayList;
        ArrayList arrayList2;
        zzf();
        arrayList = this.zzd.zzt;
        synchronized (arrayList) {
            arrayList2 = this.zzd.zzt;
            arrayList2.remove(this);
        }
    }
}
