package com.google.android.gms.internal.measurement;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.3.0 */
/* loaded from: classes2.dex */
final class zzmq {
    private static final zzmq zza = new zzmq();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final zzmu zzb = new zzma();

    private zzmq() {
    }

    public static zzmq zza() {
        return zza;
    }

    public final zzmt zzb(Class cls) {
        String s5 = ProtectedSandApp.s("ำ");
        zzlj.zzc(cls, s5);
        zzmt zzmtVar = (zzmt) this.zzc.get(cls);
        if (zzmtVar == null) {
            zzmtVar = this.zzb.zza(cls);
            zzlj.zzc(cls, s5);
            zzlj.zzc(zzmtVar, ProtectedSandApp.s("ิ"));
            zzmt zzmtVar2 = (zzmt) this.zzc.putIfAbsent(cls, zzmtVar);
            if (zzmtVar2 != null) {
                return zzmtVar2;
            }
        }
        return zzmtVar;
    }
}
