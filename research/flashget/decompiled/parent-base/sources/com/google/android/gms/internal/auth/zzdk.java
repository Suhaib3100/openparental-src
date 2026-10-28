package com.google.android.gms.internal.auth;

import android.support.v4.media.d;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Serializable;
import zc.a;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes5.dex */
final class zzdk implements Serializable, zzdj {
    final zzdj zza;
    volatile transient boolean zzb;

    @a
    transient Object zzc;

    zzdk(zzdj zzdjVar) {
        this.zza = zzdjVar;
    }

    public final String toString() {
        Object obj;
        if (this.zzb) {
            obj = d.a(ProtectedSandApp.s("켔"), String.valueOf(this.zzc), ProtectedSandApp.s("켕"));
        } else {
            obj = this.zza;
        }
        return d.a(ProtectedSandApp.s("켖"), obj.toString(), ProtectedSandApp.s("켗"));
    }

    @Override // com.google.android.gms.internal.auth.zzdj
    public final Object zza() {
        if (!this.zzb) {
            synchronized (this) {
                try {
                    if (!this.zzb) {
                        Object zza = this.zza.zza();
                        this.zzc = zza;
                        this.zzb = true;
                        return zza;
                    }
                } finally {
                }
            }
        }
        return this.zzc;
    }
}
