package com.google.android.gms.internal.play_billing;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
public final class zzej extends zzgp implements zzhs {
    private static final zzej zzb;
    private int zzd;
    private int zze;
    private zzdu zzf;

    static {
        zzej zzejVar = new zzej();
        zzb = zzejVar;
        zzgp.zzB(zzej.class, zzejVar);
    }

    private zzej() {
    }

    public static zzej zzc(byte[] bArr) throws zzhb {
        return (zzej) zzgp.zzt(zzb, bArr);
    }

    public final zzdu zza() {
        zzdu zzduVar = this.zzf;
        return zzduVar == null ? zzdu.zzb() : zzduVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgp
    protected final Object zzd(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzgp.zzy(zzb, ProtectedSandApp.s("흭"), new Object[]{ProtectedSandApp.s("희"), ProtectedSandApp.s("흪"), ProtectedSandApp.s("흫")});
        }
        if (i5 == 3) {
            return new zzej();
        }
        zzei zzeiVar = null;
        if (i5 == 4) {
            return new zzeh(zzeiVar);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }

    public final boolean zze() {
        return (this.zzd & 2) != 0;
    }
}
