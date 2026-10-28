package com.google.android.gms.internal.play_billing;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
public final class zzlg extends zzgp implements zzhs {
    private static final zzlg zzb;
    private int zzd;
    private zzju zze;
    private long zzf;

    static {
        zzlg zzlgVar = new zzlg();
        zzb = zzlgVar;
        zzgp.zzB(zzlg.class, zzlgVar);
    }

    private zzlg() {
    }

    public static zzle zza() {
        return (zzle) zzb.zzp();
    }

    static /* synthetic */ void zzc(zzlg zzlgVar, zzju zzjuVar) {
        zzjuVar.getClass();
        zzlgVar.zze = zzjuVar;
        zzlgVar.zzd |= 1;
    }

    static /* synthetic */ void zze(zzlg zzlgVar, long j4) {
        zzlgVar.zzd |= 2;
        zzlgVar.zzf = j4;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgp
    protected final Object zzd(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzgp.zzy(zzb, ProtectedSandApp.s("\ud957"), new Object[]{ProtectedSandApp.s("\ud956"), ProtectedSandApp.s("\ud954"), ProtectedSandApp.s("\ud955")});
        }
        if (i5 == 3) {
            return new zzlg();
        }
        zzlf zzlfVar = null;
        if (i5 == 4) {
            return new zzle(zzlfVar);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }
}
