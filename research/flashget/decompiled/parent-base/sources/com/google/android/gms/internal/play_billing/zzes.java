package com.google.android.gms.internal.play_billing;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
public final class zzes extends zzgp implements zzhs {
    private static final zzes zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    static {
        zzes zzesVar = new zzes();
        zzb = zzesVar;
        zzgp.zzB(zzes.class, zzesVar);
    }

    private zzes() {
    }

    public static zzer zza() {
        return (zzer) zzb.zzp();
    }

    static /* synthetic */ void zzc(zzes zzesVar, String str) {
        zzesVar.zzd |= 4;
        zzesVar.zzg = str;
    }

    static /* synthetic */ void zze(zzes zzesVar, String str) {
        str.getClass();
        zzesVar.zzd |= 16;
        zzesVar.zzi = str;
    }

    static /* synthetic */ void zzf(zzes zzesVar, String str) {
        str.getClass();
        zzesVar.zzd |= 32;
        zzesVar.zzj = str;
    }

    static /* synthetic */ void zzg(zzes zzesVar, String str) {
        zzesVar.zzd |= 8;
        zzesVar.zzh = ProtectedSandApp.s("흺");
    }

    static /* synthetic */ void zzh(zzes zzesVar, int i4) {
        zzesVar.zzd |= 1;
        zzesVar.zze = 24;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgp
    protected final Object zzd(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzgp.zzy(zzb, ProtectedSandApp.s("힂"), new Object[]{ProtectedSandApp.s("흽"), ProtectedSandApp.s("흾"), ProtectedSandApp.s("흿"), ProtectedSandApp.s("힀"), ProtectedSandApp.s("힁"), ProtectedSandApp.s("흻"), ProtectedSandApp.s("흼")});
        }
        if (i5 == 3) {
            return new zzes();
        }
        zzet zzetVar = null;
        if (i5 == 4) {
            return new zzer(zzetVar);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }
}
