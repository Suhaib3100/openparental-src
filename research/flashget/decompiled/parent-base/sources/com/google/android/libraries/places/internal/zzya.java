package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzya extends zzadk implements zzaes {
    private static final zzya zzb;
    private zzwj zzA;
    private zzaao zzB;
    private boolean zzC;
    private zzwt zzE;
    private boolean zzF;
    private int zzH;
    private int zzK;
    private int zze;
    private int zzf;
    private zzln zzh;
    private zzop zzi;
    private int zzj;
    private float zzk;
    private zzzm zzm;
    private zzww zzo;
    private zzxd zzp;
    private zzze zzq;
    private zzyo zzr;
    private zzyx zzs;
    private zzyt zzt;
    private zzzj zzu;
    private zzxp zzv;
    private zzyc zzw;
    private zzyz zzx;
    private zzxs zzy;
    private zzxg zzz;
    private byte zzM = 2;
    private int zzg = 1;
    private zzadr zzl = zzadk.zzB();
    private zzadr zzn = zzadk.zzB();
    private String zzD = "";
    private String zzG = "";
    private String zzI = "";
    private String zzJ = "";
    private String zzL = "";

    static {
        zzya zzyaVar = new zzya();
        zzb = zzyaVar;
        zzadk.zzG(zzya.class, zzyaVar);
    }

    private zzya() {
    }

    public static zzxv zza() {
        return (zzxv) zzb.zzx();
    }

    static /* synthetic */ void zzd(zzya zzyaVar, zzzm zzzmVar) {
        zzzmVar.getClass();
        zzyaVar.zzm = zzzmVar;
        zzyaVar.zze |= 64;
    }

    static /* synthetic */ void zze(zzya zzyaVar, zzze zzzeVar) {
        zzzeVar.getClass();
        zzyaVar.zzq = zzzeVar;
        zzyaVar.zze |= 512;
    }

    static /* synthetic */ void zzf(zzya zzyaVar, zzyo zzyoVar) {
        zzyoVar.getClass();
        zzyaVar.zzr = zzyoVar;
        zzyaVar.zze |= 1024;
    }

    static /* synthetic */ void zzg(zzya zzyaVar, zzln zzlnVar) {
        zzlnVar.getClass();
        zzyaVar.zzh = zzlnVar;
        zzyaVar.zze |= 4;
    }

    static /* synthetic */ void zzh(zzya zzyaVar, zzxp zzxpVar) {
        zzxpVar.getClass();
        zzyaVar.zzv = zzxpVar;
        zzyaVar.zze |= 16384;
    }

    static /* synthetic */ void zzi(zzya zzyaVar, zzwt zzwtVar) {
        zzwtVar.getClass();
        zzyaVar.zzE = zzwtVar;
        zzyaVar.zze |= 8388608;
    }

    static /* synthetic */ void zzj(zzya zzyaVar, boolean z4) {
        zzyaVar.zze |= 16777216;
        zzyaVar.zzF = true;
    }

    static /* synthetic */ void zzk(zzya zzyaVar, String str) {
        str.getClass();
        zzyaVar.zze |= 33554432;
        zzyaVar.zzG = str;
    }

    static /* synthetic */ void zzl(zzya zzyaVar, String str) {
        zzyaVar.zze |= 134217728;
        zzyaVar.zzI = ProtectedSandApp.s("\uedad");
    }

    static /* synthetic */ void zzm(zzya zzyaVar, String str) {
        str.getClass();
        zzyaVar.zze |= 1073741824;
        zzyaVar.zzL = str;
    }

    static /* synthetic */ void zzn(zzya zzyaVar, int i4) {
        zzyaVar.zzg = i4;
        zzyaVar.zze |= 2;
    }

    static /* synthetic */ void zzo(zzya zzyaVar, int i4) {
        zzyaVar.zzK = i4 - 1;
        zzyaVar.zze |= 536870912;
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return Byte.valueOf(this.zzM);
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\uedd0"), new Object[]{ProtectedSandApp.s("\uedaf"), ProtectedSandApp.s("\uedb0"), zzxx.zza, ProtectedSandApp.s("\uedb1"), ProtectedSandApp.s("\uedb2"), ProtectedSandApp.s("\uedb3"), zzaas.class, ProtectedSandApp.s("\uedb4"), ProtectedSandApp.s("\uedb5"), zzww.class, ProtectedSandApp.s("\uedb6"), ProtectedSandApp.s("\uedb7"), ProtectedSandApp.s("\uedb8"), zzxw.zza, ProtectedSandApp.s("\uedb9"), ProtectedSandApp.s("\uedba"), ProtectedSandApp.s("\uedbb"), ProtectedSandApp.s("\uedbc"), ProtectedSandApp.s("\uedbd"), ProtectedSandApp.s("\uedbe"), ProtectedSandApp.s("\uedbf"), ProtectedSandApp.s("\uedc0"), ProtectedSandApp.s("\uedc1"), ProtectedSandApp.s("\uedc2"), ProtectedSandApp.s("\uedc3"), ProtectedSandApp.s("\uedc4"), ProtectedSandApp.s("\uedc5"), ProtectedSandApp.s("\uedc6"), ProtectedSandApp.s("\uedc7"), ProtectedSandApp.s("\uedc8"), ProtectedSandApp.s("\uedc9"), ProtectedSandApp.s("\uedca"), ProtectedSandApp.s("\uedcb"), ProtectedSandApp.s("\uedcc"), zzxy.zza, ProtectedSandApp.s("\uedcd"), ProtectedSandApp.s("\uedce"), ProtectedSandApp.s("\uedcf"), zzxz.zza, ProtectedSandApp.s("\uedae")});
        }
        if (i5 == 3) {
            return new zzya();
        }
        zzvo zzvoVar = null;
        if (i5 == 4) {
            return new zzxv(zzvoVar);
        }
        if (i5 == 5) {
            return zzb;
        }
        this.zzM = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
