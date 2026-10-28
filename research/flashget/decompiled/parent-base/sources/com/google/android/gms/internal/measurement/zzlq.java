package com.google.android.gms.internal.measurement;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.1.2 */
/* loaded from: classes5.dex */
final class zzlq {
    private static final zzlq zza = new zzlq();
    private final ConcurrentMap<Class<?>, zzlu<?>> zzc = new ConcurrentHashMap();
    private final zzlt zzb = new zzkq();

    private zzlq() {
    }

    public static zzlq zza() {
        return zza;
    }

    public final <T> zzlu<T> zza(Class<T> cls) {
        String s4 = ProtectedSandApp.s("핃");
        zzjv.zza(cls, s4);
        zzlu<T> zzluVar = (zzlu) this.zzc.get(cls);
        if (zzluVar != null) {
            return zzluVar;
        }
        zzlu<T> zza2 = this.zzb.zza(cls);
        zzjv.zza(cls, s4);
        zzjv.zza(zza2, ProtectedSandApp.s("필"));
        zzlu<T> zzluVar2 = (zzlu) this.zzc.putIfAbsent(cls, zza2);
        return zzluVar2 != null ? zzluVar2 : zza2;
    }

    public final <T> zzlu<T> zza(T t4) {
        return zza((Class) t4.getClass());
    }
}
