package com.google.android.gms.internal.measurement;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes4.dex */
public final class zzft extends zzlb implements zzmj {
    private static final zzft zza;
    private int zzd;
    private zzli zze = zzlb.zzbH();
    private String zzf = "";
    private long zzg;
    private long zzh;
    private int zzi;

    static {
        zzft zzftVar = new zzft();
        zza = zzftVar;
        zzlb.zzbO(zzft.class, zzftVar);
    }

    private zzft() {
    }

    public static zzfs zze() {
        return (zzfs) zza.zzbA();
    }

    static /* synthetic */ void zzj(zzft zzftVar, int i5, zzfx zzfxVar) {
        zzfxVar.getClass();
        zzftVar.zzv();
        zzftVar.zze.set(i5, zzfxVar);
    }

    static /* synthetic */ void zzk(zzft zzftVar, zzfx zzfxVar) {
        zzfxVar.getClass();
        zzftVar.zzv();
        zzftVar.zze.add(zzfxVar);
    }

    static /* synthetic */ void zzm(zzft zzftVar, Iterable iterable) {
        zzftVar.zzv();
        zzjk.zzbw(iterable, zzftVar.zze);
    }

    static /* synthetic */ void zzo(zzft zzftVar, int i5) {
        zzftVar.zzv();
        zzftVar.zze.remove(i5);
    }

    static /* synthetic */ void zzp(zzft zzftVar, String str) {
        str.getClass();
        zzftVar.zzd |= 1;
        zzftVar.zzf = str;
    }

    static /* synthetic */ void zzq(zzft zzftVar, long j5) {
        zzftVar.zzd |= 2;
        zzftVar.zzg = j5;
    }

    static /* synthetic */ void zzr(zzft zzftVar, long j5) {
        zzftVar.zzd |= 4;
        zzftVar.zzh = j5;
    }

    private final void zzv() {
        zzli zzliVar = this.zze;
        if (zzliVar.zzc()) {
            return;
        }
        this.zze = zzlb.zzbI(zzliVar);
    }

    public final int zza() {
        return this.zzi;
    }

    public final int zzb() {
        return this.zze.size();
    }

    public final long zzc() {
        return this.zzh;
    }

    public final long zzd() {
        return this.zzg;
    }

    public final zzfx zzg(int i5) {
        return (zzfx) this.zze.get(i5);
    }

    public final String zzh() {
        return this.zzf;
    }

    public final List zzi() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    protected final Object zzl(int i5, Object obj, Object obj2) {
        int i6 = i5 - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return zzlb.zzbL(zza, ProtectedSandApp.s("ⷩ"), new Object[]{ProtectedSandApp.s("ⷣ"), ProtectedSandApp.s("ⷤ"), zzfx.class, ProtectedSandApp.s("ⷥ"), ProtectedSandApp.s("ⷦ"), ProtectedSandApp.s("ⷧ"), ProtectedSandApp.s("ⷨ")});
        }
        if (i6 == 3) {
            return new zzft();
        }
        zzfk zzfkVar = null;
        if (i6 == 4) {
            return new zzfs(zzfkVar);
        }
        if (i6 != 5) {
            return null;
        }
        return zza;
    }

    public final boolean zzs() {
        return (this.zzd & 8) != 0;
    }

    public final boolean zzt() {
        return (this.zzd & 4) != 0;
    }

    public final boolean zzu() {
        return (this.zzd & 2) != 0;
    }
}
