package com.google.android.gms.internal.measurement;

import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.remoteconfig.p;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes4.dex */
public final class zzfx extends zzlb implements zzmj {
    private static final zzfx zza;
    private int zzd;
    private long zzg;
    private float zzh;
    private double zzi;
    private String zze = "";
    private String zzf = "";
    private zzli zzj = zzlb.zzbH();

    static {
        zzfx zzfxVar = new zzfx();
        zza = zzfxVar;
        zzlb.zzbO(zzfx.class, zzfxVar);
    }

    private zzfx() {
    }

    public static zzfw zze() {
        return (zzfw) zza.zzbA();
    }

    static /* synthetic */ void zzj(zzfx zzfxVar, String str) {
        str.getClass();
        zzfxVar.zzd |= 1;
        zzfxVar.zze = str;
    }

    static /* synthetic */ void zzk(zzfx zzfxVar, String str) {
        str.getClass();
        zzfxVar.zzd |= 2;
        zzfxVar.zzf = str;
    }

    static /* synthetic */ void zzm(zzfx zzfxVar) {
        zzfxVar.zzd &= -3;
        zzfxVar.zzf = zza.zzf;
    }

    static /* synthetic */ void zzn(zzfx zzfxVar, long j5) {
        zzfxVar.zzd |= 4;
        zzfxVar.zzg = j5;
    }

    static /* synthetic */ void zzo(zzfx zzfxVar) {
        zzfxVar.zzd &= -5;
        zzfxVar.zzg = 0L;
    }

    static /* synthetic */ void zzp(zzfx zzfxVar, double d6) {
        zzfxVar.zzd |= 16;
        zzfxVar.zzi = d6;
    }

    static /* synthetic */ void zzq(zzfx zzfxVar) {
        zzfxVar.zzd &= -17;
        zzfxVar.zzi = p.f18289o;
    }

    static /* synthetic */ void zzr(zzfx zzfxVar, zzfx zzfxVar2) {
        zzfxVar2.getClass();
        zzfxVar.zzz();
        zzfxVar.zzj.add(zzfxVar2);
    }

    static /* synthetic */ void zzs(zzfx zzfxVar, Iterable iterable) {
        zzfxVar.zzz();
        zzjk.zzbw(iterable, zzfxVar.zzj);
    }

    private final void zzz() {
        zzli zzliVar = this.zzj;
        if (zzliVar.zzc()) {
            return;
        }
        this.zzj = zzlb.zzbI(zzliVar);
    }

    public final double zza() {
        return this.zzi;
    }

    public final float zzb() {
        return this.zzh;
    }

    public final int zzc() {
        return this.zzj.size();
    }

    public final long zzd() {
        return this.zzg;
    }

    public final String zzg() {
        return this.zze;
    }

    public final String zzh() {
        return this.zzf;
    }

    public final List zzi() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    protected final Object zzl(int i5, Object obj, Object obj2) {
        int i6 = i5 - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return zzlb.zzbL(zza, ProtectedSandApp.s("ⷵ"), new Object[]{ProtectedSandApp.s("ⷮ"), ProtectedSandApp.s("ⷯ"), ProtectedSandApp.s("ⷰ"), ProtectedSandApp.s("ⷱ"), ProtectedSandApp.s("ⷲ"), ProtectedSandApp.s("ⷳ"), ProtectedSandApp.s("ⷴ"), zzfx.class});
        }
        if (i6 == 3) {
            return new zzfx();
        }
        zzfk zzfkVar = null;
        if (i6 == 4) {
            return new zzfw(zzfkVar);
        }
        if (i6 != 5) {
            return null;
        }
        return zza;
    }

    public final boolean zzu() {
        return (this.zzd & 16) != 0;
    }

    public final boolean zzv() {
        return (this.zzd & 8) != 0;
    }

    public final boolean zzw() {
        return (this.zzd & 4) != 0;
    }

    public final boolean zzx() {
        return (this.zzd & 1) != 0;
    }

    public final boolean zzy() {
        return (this.zzd & 2) != 0;
    }
}
