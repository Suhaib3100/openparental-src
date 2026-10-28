package com.google.android.gms.internal.measurement;

import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.remoteconfig.p;

/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes4.dex */
public final class zzgm extends zzlb implements zzmj {
    private static final zzgm zza;
    private int zzd;
    private long zze;
    private String zzf = "";
    private String zzg = "";
    private long zzh;
    private float zzi;
    private double zzj;

    static {
        zzgm zzgmVar = new zzgm();
        zza = zzgmVar;
        zzlb.zzbO(zzgm.class, zzgmVar);
    }

    private zzgm() {
    }

    public static zzgl zzd() {
        return (zzgl) zza.zzbA();
    }

    static /* synthetic */ void zzh(zzgm zzgmVar, long j5) {
        zzgmVar.zzd |= 1;
        zzgmVar.zze = j5;
    }

    static /* synthetic */ void zzi(zzgm zzgmVar, String str) {
        str.getClass();
        zzgmVar.zzd |= 2;
        zzgmVar.zzf = str;
    }

    static /* synthetic */ void zzj(zzgm zzgmVar, String str) {
        str.getClass();
        zzgmVar.zzd |= 4;
        zzgmVar.zzg = str;
    }

    static /* synthetic */ void zzk(zzgm zzgmVar) {
        zzgmVar.zzd &= -5;
        zzgmVar.zzg = zza.zzg;
    }

    static /* synthetic */ void zzm(zzgm zzgmVar, long j5) {
        zzgmVar.zzd |= 8;
        zzgmVar.zzh = j5;
    }

    static /* synthetic */ void zzn(zzgm zzgmVar) {
        zzgmVar.zzd &= -9;
        zzgmVar.zzh = 0L;
    }

    static /* synthetic */ void zzo(zzgm zzgmVar, double d6) {
        zzgmVar.zzd |= 32;
        zzgmVar.zzj = d6;
    }

    static /* synthetic */ void zzp(zzgm zzgmVar) {
        zzgmVar.zzd &= -33;
        zzgmVar.zzj = p.f18289o;
    }

    public final double zza() {
        return this.zzj;
    }

    public final long zzb() {
        return this.zzh;
    }

    public final long zzc() {
        return this.zze;
    }

    public final String zzf() {
        return this.zzf;
    }

    public final String zzg() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    protected final Object zzl(int i5, Object obj, Object obj2) {
        int i6 = i5 - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return zzlb.zzbL(zza, ProtectedSandApp.s("⹋"), new Object[]{ProtectedSandApp.s("⹄"), ProtectedSandApp.s("⹅"), ProtectedSandApp.s("⹆"), ProtectedSandApp.s("⹇"), ProtectedSandApp.s("⹈"), ProtectedSandApp.s("⹉"), ProtectedSandApp.s("⹊")});
        }
        if (i6 == 3) {
            return new zzgm();
        }
        zzfk zzfkVar = null;
        if (i6 == 4) {
            return new zzgl(zzfkVar);
        }
        if (i6 != 5) {
            return null;
        }
        return zza;
    }

    public final boolean zzq() {
        return (this.zzd & 32) != 0;
    }

    public final boolean zzr() {
        return (this.zzd & 8) != 0;
    }

    public final boolean zzs() {
        return (this.zzd & 1) != 0;
    }

    public final boolean zzt() {
        return (this.zzd & 4) != 0;
    }
}
