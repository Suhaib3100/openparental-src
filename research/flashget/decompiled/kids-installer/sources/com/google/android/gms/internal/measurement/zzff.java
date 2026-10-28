package com.google.android.gms.internal.measurement;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes4.dex */
public final class zzff extends zzlb implements zzmj {
    private static final zzff zza;
    private int zzd;
    private long zze;
    private int zzg;
    private boolean zzl;
    private String zzf = "";
    private zzli zzh = zzlb.zzbH();
    private zzli zzi = zzlb.zzbH();
    private zzli zzj = zzlb.zzbH();
    private String zzk = "";
    private zzli zzm = zzlb.zzbH();
    private zzli zzn = zzlb.zzbH();
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";
    private String zzr = "";

    static {
        zzff zzffVar = new zzff();
        zza = zzffVar;
        zzlb.zzbO(zzff.class, zzffVar);
    }

    private zzff() {
    }

    public static zzfe zze() {
        return (zzfe) zza.zzbA();
    }

    public static zzff zzg() {
        return zza;
    }

    static /* synthetic */ void zzq(zzff zzffVar, int i5, zzfd zzfdVar) {
        zzfdVar.getClass();
        zzli zzliVar = zzffVar.zzi;
        if (!zzliVar.zzc()) {
            zzffVar.zzi = zzlb.zzbI(zzliVar);
        }
        zzffVar.zzi.set(i5, zzfdVar);
    }

    public final int zza() {
        return this.zzm.size();
    }

    public final int zzb() {
        return this.zzi.size();
    }

    public final long zzc() {
        return this.zze;
    }

    public final zzfd zzd(int i5) {
        return (zzfd) this.zzi.get(i5);
    }

    public final String zzh() {
        return this.zzf;
    }

    public final String zzi() {
        return this.zzq;
    }

    public final String zzj() {
        return this.zzp;
    }

    public final String zzk() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    protected final Object zzl(int i5, Object obj, Object obj2) {
        int i6 = i5 - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return zzlb.zzbL(zza, ProtectedSandApp.s("\u2dc7"), new Object[]{ProtectedSandApp.s("ⶸ"), ProtectedSandApp.s("ⶹ"), ProtectedSandApp.s("ⶺ"), ProtectedSandApp.s("ⶻ"), ProtectedSandApp.s("ⶼ"), zzfj.class, ProtectedSandApp.s("ⶽ"), zzfd.class, ProtectedSandApp.s("ⶾ"), zzei.class, ProtectedSandApp.s("\u2dbf"), ProtectedSandApp.s("ⷀ"), ProtectedSandApp.s("ⷁ"), zzgt.class, ProtectedSandApp.s("ⷂ"), zzfb.class, ProtectedSandApp.s("ⷃ"), ProtectedSandApp.s("ⷄ"), ProtectedSandApp.s("ⷅ"), ProtectedSandApp.s("ⷆ")});
        }
        if (i6 == 3) {
            return new zzff();
        }
        zzez zzezVar = null;
        if (i6 == 4) {
            return new zzfe(zzezVar);
        }
        if (i6 != 5) {
            return null;
        }
        return zza;
    }

    public final List zzm() {
        return this.zzj;
    }

    public final List zzn() {
        return this.zzn;
    }

    public final List zzo() {
        return this.zzm;
    }

    public final List zzp() {
        return this.zzh;
    }

    public final boolean zzs() {
        return this.zzl;
    }

    public final boolean zzt() {
        return (this.zzd & 2) != 0;
    }

    public final boolean zzu() {
        return (this.zzd & 1) != 0;
    }
}
