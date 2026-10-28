package com.google.android.gms.internal.measurement;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes4.dex */
public final class zzgt extends zzlb implements zzmj {
    private static final zzgt zza;
    private int zzd;
    private zzli zze = zzlb.zzbH();
    private zzgp zzf;

    static {
        zzgt zzgtVar = new zzgt();
        zza = zzgtVar;
        zzlb.zzbO(zzgt.class, zzgtVar);
    }

    private zzgt() {
    }

    public final zzgp zza() {
        zzgp zzgpVar = this.zzf;
        return zzgpVar == null ? zzgp.zzc() : zzgpVar;
    }

    public final List zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    protected final Object zzl(int i5, Object obj, Object obj2) {
        int i6 = i5 - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return zzlb.zzbL(zza, ProtectedSandApp.s("⹕"), new Object[]{ProtectedSandApp.s("⹒"), ProtectedSandApp.s("⹓"), zzgy.class, ProtectedSandApp.s("⹔")});
        }
        if (i6 == 3) {
            return new zzgt();
        }
        zzgn zzgnVar = null;
        if (i6 == 4) {
            return new zzgs(zzgnVar);
        }
        if (i6 != 5) {
            return null;
        }
        return zza;
    }
}
