package com.google.android.gms.measurement.internal;

import androidx.annotation.b0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzfz<V> {
    private static final Object zza = new Object();
    private final String zzb;
    private final zzfx<V> zzc;
    private final V zzd;
    private final Object zze;

    @b0("overrideLock")
    private volatile V zzf;

    @b0("cachingLock")
    private volatile V zzg;

    public final V zza(V v4) {
        List<zzfz> list;
        synchronized (this.zze) {
        }
        if (v4 != null) {
            return v4;
        }
        if (zzga.zza == null) {
            return this.zzd;
        }
        synchronized (zza) {
            try {
                if (zzab.zza()) {
                    return this.zzg == null ? this.zzd : this.zzg;
                }
                try {
                    list = zzbh.zzdm;
                    for (zzfz zzfzVar : list) {
                        if (zzab.zza()) {
                            throw new IllegalStateException(ProtectedSandApp.s("\ude07"));
                        }
                        V v5 = null;
                        try {
                            zzfx<V> zzfxVar = zzfzVar.zzc;
                            if (zzfxVar != null) {
                                v5 = zzfxVar.zza();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (zza) {
                            zzfzVar.zzg = v5;
                        }
                    }
                } catch (SecurityException unused2) {
                }
                zzfx<V> zzfxVar2 = this.zzc;
                if (zzfxVar2 == null) {
                    return this.zzd;
                }
                try {
                    return zzfxVar2.zza();
                } catch (IllegalStateException unused3) {
                    return this.zzd;
                } catch (SecurityException unused4) {
                    return this.zzd;
                }
            } finally {
            }
        }
    }

    private zzfz(String str, V v4, V v5, zzfx<V> zzfxVar) {
        this.zze = new Object();
        this.zzf = null;
        this.zzg = null;
        this.zzb = str;
        this.zzd = v4;
        this.zzc = zzfxVar;
    }

    public final String zza() {
        return this.zzb;
    }
}
