package com.google.android.gms.internal.play_billing;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
public final class zzel extends zzgp implements zzhs {
    private static final zzel zzb;
    private int zzd;
    private zzev zze;
    private zzev zzf;
    private int zzg;

    static {
        zzel zzelVar = new zzel();
        zzb = zzelVar;
        zzgp.zzB(zzel.class, zzelVar);
    }

    private zzel() {
    }

    public static zzek zza() {
        return (zzek) zzb.zzp();
    }

    static /* synthetic */ void zzc(zzel zzelVar, zzev zzevVar) {
        zzevVar.getClass();
        zzelVar.zze = zzevVar;
        zzelVar.zzd |= 1;
    }

    static /* synthetic */ void zze(zzel zzelVar, zzev zzevVar) {
        zzevVar.getClass();
        zzelVar.zzf = zzevVar;
        zzelVar.zzd |= 2;
    }

    static /* synthetic */ void zzf(zzel zzelVar, int i4) {
        zzelVar.zzg = i4 - 1;
        zzelVar.zzd |= 4;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgp
    protected final Object zzd(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzgp.zzy(zzb, ProtectedSandApp.s("흲"), new Object[]{ProtectedSandApp.s("흯"), ProtectedSandApp.s("흰"), ProtectedSandApp.s("흱"), ProtectedSandApp.s("흮"), zzey.zza()});
        }
        if (i5 == 3) {
            return new zzel();
        }
        zzeo zzeoVar = null;
        if (i5 == 4) {
            return new zzek(zzeoVar);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }
}
