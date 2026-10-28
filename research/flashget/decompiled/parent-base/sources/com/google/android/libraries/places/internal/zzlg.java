package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzlg extends zzadk implements zzaes {
    private static final zzlg zzb;
    private int zze;
    private zzya zzg;
    private zzni zzh;
    private zzaav zzi;
    private zzux zzj;
    private zzqq zzk;
    private zzob zzl;
    private zznc zzm;
    private zzmi zzn;
    private zznv zzo;
    private zzsh zzp;
    private zzsv zzq;
    private zzsy zzr;
    private zzls zzs;
    private zzox zzt;
    private zzc zzu;
    private zzaj zzv;
    private zzar zzw;
    private byte zzx = 2;
    private int zzf = 1;

    static {
        zzlg zzlgVar = new zzlg();
        zzb = zzlgVar;
        zzadk.zzG(zzlg.class, zzlgVar);
    }

    private zzlg() {
    }

    public static zzle zza() {
        return (zzle) zzb.zzx();
    }

    static /* synthetic */ void zzd(zzlg zzlgVar, zzya zzyaVar) {
        zzyaVar.getClass();
        zzlgVar.zzg = zzyaVar;
        zzlgVar.zze |= 2;
    }

    static /* synthetic */ void zze(zzlg zzlgVar, int i4) {
        zzlgVar.zzf = 1;
        zzlgVar.zze = 1 | zzlgVar.zze;
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return Byte.valueOf(this.zzx);
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\uea50"), new Object[]{ProtectedSandApp.s("\uea3f"), ProtectedSandApp.s("\uea40"), zzlf.zza, ProtectedSandApp.s("\uea41"), ProtectedSandApp.s("\uea42"), ProtectedSandApp.s("\uea43"), ProtectedSandApp.s("\uea44"), ProtectedSandApp.s("\uea45"), ProtectedSandApp.s("\uea46"), ProtectedSandApp.s("\uea47"), ProtectedSandApp.s("\uea48"), ProtectedSandApp.s("\uea49"), ProtectedSandApp.s("\uea4a"), ProtectedSandApp.s("\uea4b"), ProtectedSandApp.s("\uea4c"), ProtectedSandApp.s("\uea4d"), ProtectedSandApp.s("\uea4e"), ProtectedSandApp.s("\uea4f"), ProtectedSandApp.s("\uea3d"), ProtectedSandApp.s("\uea3e")});
        }
        if (i5 == 3) {
            return new zzlg();
        }
        zzld zzldVar = null;
        if (i5 == 4) {
            return new zzle(zzldVar);
        }
        if (i5 == 5) {
            return zzb;
        }
        this.zzx = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
