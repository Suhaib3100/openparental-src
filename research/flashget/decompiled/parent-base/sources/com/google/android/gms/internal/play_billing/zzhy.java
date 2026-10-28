package com.google.android.gms.internal.play_billing;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
final class zzhy {
    private static final zzhy zza = new zzhy();
    private final ConcurrentMap zzb = new ConcurrentHashMap();

    private zzhy() {
        zzgk.zza();
    }

    static zzhy zza() {
        return zza;
    }

    private <T> zzib<T> zzc(Class<T> cls) {
        zzib<T> zzl;
        int i4 = zzic.zza;
        if (!zzgp.class.isAssignableFrom(cls)) {
            int i5 = zzfc.zza;
        }
        int i6 = zzfc.zza;
        if (!zzgp.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\ud81c").concat(cls.getName()));
        }
        try {
            zzhp zzhpVar = (zzhp) zzgp.zzr(cls.asSubclass(zzgp.class)).zzd(3, null, null);
            if (zzhpVar.zzb()) {
                zzl = zzhv.zzc(zzic.zzm(), zzgf.zza(), zzhpVar.zza());
            } else {
                zzl = zzhu.zzl(cls, zzhpVar, zzhx.zza(), zzhf.zza(), zzic.zzm(), zzhpVar.zzc() + (-1) != 1 ? zzgf.zza() : null, zzho.zza());
            }
            zzib<T> zzibVar = (zzib) this.zzb.putIfAbsent(cls, zzl);
            return zzibVar != null ? zzibVar : zzl;
        } catch (Exception e4) {
            throw new RuntimeException(ProtectedSandApp.s("\ud81b").concat(cls.getName()), e4);
        }
    }

    final zzib zzb(Class cls) {
        Object obj = this.zzb.get(cls);
        return obj == null ? zzc(cls) : (zzib) obj;
    }
}
