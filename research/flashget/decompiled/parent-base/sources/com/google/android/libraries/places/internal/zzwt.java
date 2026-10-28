package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzwt extends zzadk implements zzaes {
    private static final zzwt zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private zzwh zzk;
    private zzwa zzl;
    private zzvv zzm;
    private zzaab zzn;
    private zzwc zzo;
    private zzwf zzp;
    private zzaad zzq;
    private zzaal zzr;
    private zzaah zzs;
    private int zzt;

    static {
        zzwt zzwtVar = new zzwt();
        zzb = zzwtVar;
        zzadk.zzG(zzwt.class, zzwtVar);
    }

    private zzwt() {
    }

    public static zzwo zza() {
        return (zzwo) zzb.zzx();
    }

    static /* synthetic */ void zzd(zzwt zzwtVar, int i4) {
        zzwtVar.zze |= 4;
        zzwtVar.zzh = i4;
    }

    static /* synthetic */ void zze(zzwt zzwtVar, zzwh zzwhVar) {
        zzwhVar.getClass();
        zzwtVar.zzk = zzwhVar;
        zzwtVar.zze |= 32;
    }

    static /* synthetic */ void zzf(zzwt zzwtVar, zzvv zzvvVar) {
        zzvvVar.getClass();
        zzwtVar.zzm = zzvvVar;
        zzwtVar.zze |= 128;
    }

    static /* synthetic */ void zzg(zzwt zzwtVar, zzwc zzwcVar) {
        zzwcVar.getClass();
        zzwtVar.zzo = zzwcVar;
        zzwtVar.zze |= 512;
    }

    static /* synthetic */ void zzh(zzwt zzwtVar, int i4) {
        zzwtVar.zzf = i4 - 1;
        zzwtVar.zze |= 1;
    }

    static /* synthetic */ void zzi(zzwt zzwtVar, int i4) {
        zzwtVar.zzg = i4 - 1;
        zzwtVar.zze |= 2;
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 != 2) {
            if (i5 == 3) {
                return new zzwt();
            }
            zzvo zzvoVar = null;
            if (i5 == 4) {
                return new zzwo(zzvoVar);
            }
            if (i5 != 5) {
                return null;
            }
            return zzb;
        }
        return zzadk.zzF(zzb, ProtectedSandApp.s("\ued69"), new Object[]{ProtectedSandApp.s("\ued5a"), ProtectedSandApp.s("\ued5b"), zzwq.zza, ProtectedSandApp.s("\ued5c"), zzws.zza, ProtectedSandApp.s("\ued5d"), ProtectedSandApp.s("\ued5e"), zzwp.zza, ProtectedSandApp.s("\ued5f"), zzwn.zza, ProtectedSandApp.s("\ued60"), ProtectedSandApp.s("\ued61"), ProtectedSandApp.s("\ued62"), ProtectedSandApp.s("\ued63"), ProtectedSandApp.s("\ued64"), ProtectedSandApp.s("\ued65"), ProtectedSandApp.s("\ued66"), ProtectedSandApp.s("\ued67"), ProtectedSandApp.s("\ued68"), ProtectedSandApp.s("\ued59"), zzwr.zza});
    }
}
