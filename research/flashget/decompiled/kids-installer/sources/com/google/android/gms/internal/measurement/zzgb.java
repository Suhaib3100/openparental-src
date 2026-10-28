package com.google.android.gms.internal.measurement;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes4.dex */
public final class zzgb extends zzlb implements zzmj {
    private static final zzgb zza;
    private zzli zzd = zzlb.zzbH();

    static {
        zzgb zzgbVar = new zzgb();
        zza = zzgbVar;
        zzlb.zzbO(zzgb.class, zzgbVar);
    }

    private zzgb() {
    }

    public static zzga zza() {
        return (zzga) zza.zzbA();
    }

    static /* synthetic */ void zze(zzgb zzgbVar, zzgd zzgdVar) {
        zzgdVar.getClass();
        zzli zzliVar = zzgbVar.zzd;
        if (!zzliVar.zzc()) {
            zzgbVar.zzd = zzlb.zzbI(zzliVar);
        }
        zzgbVar.zzd.add(zzgdVar);
    }

    public final zzgd zzc(int i5) {
        return (zzgd) this.zzd.get(0);
    }

    public final List zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    protected final Object zzl(int i5, Object obj, Object obj2) {
        int i6 = i5 - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return zzlb.zzbL(zza, ProtectedSandApp.s("ⷼ"), new Object[]{ProtectedSandApp.s("ⷻ"), zzgd.class});
        }
        if (i6 == 3) {
            return new zzgb();
        }
        zzfk zzfkVar = null;
        if (i6 == 4) {
            return new zzga(zzfkVar);
        }
        if (i6 != 5) {
            return null;
        }
        return zza;
    }
}
