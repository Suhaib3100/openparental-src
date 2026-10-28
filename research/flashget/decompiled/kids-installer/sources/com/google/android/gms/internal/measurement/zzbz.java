package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.3.0 */
/* loaded from: classes3.dex */
public final class zzbz extends zzce {
    private final AtomicReference zza = new AtomicReference();
    private boolean zzb;

    public static final Object zzf(Bundle bundle, Class cls) {
        Object obj;
        if (bundle == null || (obj = bundle.get(ProtectedSandApp.s("⌷"))) == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e6) {
            String.format(ProtectedSandApp.s("⌸"), cls.getCanonicalName(), obj.getClass().getCanonicalName());
            throw e6;
        }
    }

    public final Bundle zzb(long j5) {
        Bundle bundle;
        synchronized (this.zza) {
            if (!this.zzb) {
                try {
                    this.zza.wait(j5);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.zza.get();
        }
        return bundle;
    }

    public final Long zzc(long j5) {
        return (Long) zzf(zzb(j5), Long.class);
    }

    public final String zzd(long j5) {
        return (String) zzf(zzb(j5), String.class);
    }

    @Override // com.google.android.gms.internal.measurement.zzcf
    public final void zze(Bundle bundle) {
        synchronized (this.zza) {
            try {
                this.zza.set(bundle);
                this.zzb = true;
            } finally {
                this.zza.notify();
            }
        }
    }
}
