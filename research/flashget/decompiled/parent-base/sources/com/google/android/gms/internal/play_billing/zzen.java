package com.google.android.gms.internal.play_billing;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
public final class zzen extends zzgp implements zzhs {
    private static final zzen zzb;
    private zzgu zzd = zzgp.zzv();

    static {
        zzen zzenVar = new zzen();
        zzb = zzenVar;
        zzgp.zzB(zzen.class, zzenVar);
    }

    private zzen() {
    }

    public static zzem zza() {
        return (zzem) zzb.zzp();
    }

    static /* synthetic */ void zzc(zzen zzenVar, Iterable iterable) {
        zzgu zzguVar = zzenVar.zzd;
        if (!zzguVar.zzc()) {
            int size = zzguVar.size();
            zzenVar.zzd = zzguVar.zzd(size + size);
        }
        zzfa.zzk(iterable, zzenVar.zzd);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgp
    protected final Object zzd(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzgp.zzy(zzb, ProtectedSandApp.s("흴"), new Object[]{ProtectedSandApp.s("흳"), zzel.class});
        }
        if (i5 == 3) {
            return new zzen();
        }
        zzeo zzeoVar = null;
        if (i5 == 4) {
            return new zzem(zzeoVar);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }
}
