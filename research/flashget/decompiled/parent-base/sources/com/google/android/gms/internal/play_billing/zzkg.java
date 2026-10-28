package com.google.android.gms.internal.play_billing;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
public final class zzkg extends zzgp implements zzhs {
    private static final zzkg zzb;
    private int zzd;
    private int zzh;
    private long zzi;
    private long zzj;
    private boolean zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private int zzs;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";
    private String zzr = "";

    static {
        zzkg zzkgVar = new zzkg();
        zzb = zzkgVar;
        zzgp.zzB(zzkg.class, zzkgVar);
    }

    private zzkg() {
    }

    static /* synthetic */ void zzG(zzkg zzkgVar, long j4) {
        zzkgVar.zzd |= 512;
        zzkgVar.zzn = 926300087L;
    }

    static /* synthetic */ void zzH(zzkg zzkgVar, String str) {
        str.getClass();
        zzkgVar.zzd |= 4;
        zzkgVar.zzg = str;
    }

    static /* synthetic */ void zzI(zzkg zzkgVar, String str) {
        str.getClass();
        zzkgVar.zzd |= 1024;
        zzkgVar.zzo = str;
    }

    static /* synthetic */ void zzJ(zzkg zzkgVar, String str) {
        str.getClass();
        zzkgVar.zzd |= 8192;
        zzkgVar.zzr = str;
    }

    static /* synthetic */ void zzK(zzkg zzkgVar, String str) {
        str.getClass();
        zzkgVar.zzd |= 4096;
        zzkgVar.zzq = str;
    }

    static /* synthetic */ void zzL(zzkg zzkgVar, String str) {
        str.getClass();
        zzkgVar.zzd |= 2048;
        zzkgVar.zzp = str;
    }

    static /* synthetic */ void zzM(zzkg zzkgVar, int i4) {
        zzkgVar.zzd |= 16384;
        zzkgVar.zzs = i4;
    }

    static /* synthetic */ void zzN(zzkg zzkgVar, boolean z4) {
        zzkgVar.zzd |= 64;
        zzkgVar.zzk = z4;
    }

    static /* synthetic */ void zzO(zzkg zzkgVar, String str) {
        str.getClass();
        zzkgVar.zzd |= 1;
        zzkgVar.zze = str;
    }

    static /* synthetic */ void zzP(zzkg zzkgVar, String str) {
        zzkgVar.zzd |= 2;
        zzkgVar.zzf = str;
    }

    public static zzke zza() {
        return (zzke) zzb.zzp();
    }

    static /* synthetic */ void zzc(zzkg zzkgVar, int i4) {
        zzkgVar.zzd |= 128;
        zzkgVar.zzl = i4;
    }

    static /* synthetic */ void zze(zzkg zzkgVar, int i4) {
        zzkgVar.zzd |= 256;
        zzkgVar.zzm = i4;
    }

    static /* synthetic */ void zzf(zzkg zzkgVar, int i4) {
        zzkgVar.zzd |= 8;
        zzkgVar.zzh = i4;
    }

    static /* synthetic */ void zzg(zzkg zzkgVar, long j4) {
        zzkgVar.zzd |= 16;
        zzkgVar.zzi = j4;
    }

    static /* synthetic */ void zzh(zzkg zzkgVar, long j4) {
        zzkgVar.zzd |= 32;
        zzkgVar.zzj = j4;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgp
    protected final Object zzd(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzgp.zzy(zzb, ProtectedSandApp.s("\ud935"), new Object[]{ProtectedSandApp.s("\ud927"), ProtectedSandApp.s("\ud928"), ProtectedSandApp.s("\ud929"), ProtectedSandApp.s("\ud92a"), ProtectedSandApp.s("\ud92b"), ProtectedSandApp.s("\ud92c"), ProtectedSandApp.s("\ud92d"), ProtectedSandApp.s("\ud92e"), ProtectedSandApp.s("\ud92f"), ProtectedSandApp.s("\ud930"), ProtectedSandApp.s("\ud931"), ProtectedSandApp.s("\ud932"), ProtectedSandApp.s("\ud933"), ProtectedSandApp.s("\ud934"), ProtectedSandApp.s("\ud925"), ProtectedSandApp.s("\ud926")});
        }
        if (i5 == 3) {
            return new zzkg();
        }
        zzkf zzkfVar = null;
        if (i5 == 4) {
            return new zzke(zzkfVar);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }
}
