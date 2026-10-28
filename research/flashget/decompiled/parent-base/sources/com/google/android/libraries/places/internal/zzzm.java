package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzzm extends zzadk implements zzaes {
    private static final zzzm zzb;
    private int zze;
    private int zzf;
    private zzwy zzi;
    private zzzv zzj;
    private zzyj zzk;
    private zzxi zzl;
    private zzyh zzm;
    private zzxk zzn;
    private zzyf zzo;
    private zzzx zzp;
    private zzzx zzq;
    private zzyl zzr;
    private zzxu zzs;
    private zzzo zzt;
    private zzzq zzu;
    private zzzb zzv;
    private zzyr zzw;
    private zzzs zzx;
    private byte zzy = 2;
    private String zzg = "";
    private String zzh = "";

    static {
        zzzm zzzmVar = new zzzm();
        zzb = zzzmVar;
        zzadk.zzG(zzzm.class, zzzmVar);
    }

    private zzzm() {
    }

    public static zzzk zza() {
        return (zzzk) zzb.zzx();
    }

    static /* synthetic */ void zzd(zzzm zzzmVar, String str) {
        str.getClass();
        zzzmVar.zze |= 2;
        zzzmVar.zzg = str;
    }

    static /* synthetic */ void zze(zzzm zzzmVar, String str) {
        str.getClass();
        zzzmVar.zze |= 4;
        zzzmVar.zzh = str;
    }

    static /* synthetic */ void zzf(zzzm zzzmVar, zzyh zzyhVar) {
        zzyhVar.getClass();
        zzzmVar.zzm = zzyhVar;
        zzzmVar.zze |= 128;
    }

    static /* synthetic */ void zzg(zzzm zzzmVar, zzxk zzxkVar) {
        zzxkVar.getClass();
        zzzmVar.zzn = zzxkVar;
        zzzmVar.zze |= 256;
    }

    static /* synthetic */ void zzh(zzzm zzzmVar, int i4) {
        zzzmVar.zzf = i4 - 1;
        zzzmVar.zze |= 1;
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return Byte.valueOf(this.zzy);
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\uee28"), new Object[]{ProtectedSandApp.s("\uee16"), ProtectedSandApp.s("\uee17"), zzzl.zza, ProtectedSandApp.s("\uee18"), ProtectedSandApp.s("\uee19"), ProtectedSandApp.s("\uee1a"), ProtectedSandApp.s("\uee1b"), ProtectedSandApp.s("\uee1c"), ProtectedSandApp.s("\uee1d"), ProtectedSandApp.s("\uee1e"), ProtectedSandApp.s("\uee1f"), ProtectedSandApp.s("\uee20"), ProtectedSandApp.s("\uee21"), ProtectedSandApp.s("\uee22"), ProtectedSandApp.s("\uee23"), ProtectedSandApp.s("\uee24"), ProtectedSandApp.s("\uee25"), ProtectedSandApp.s("\uee26"), ProtectedSandApp.s("\uee27"), ProtectedSandApp.s("\uee14"), ProtectedSandApp.s("\uee15")});
        }
        if (i5 == 3) {
            return new zzzm();
        }
        zzvo zzvoVar = null;
        if (i5 == 4) {
            return new zzzk(zzvoVar);
        }
        if (i5 == 5) {
            return zzb;
        }
        this.zzy = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
