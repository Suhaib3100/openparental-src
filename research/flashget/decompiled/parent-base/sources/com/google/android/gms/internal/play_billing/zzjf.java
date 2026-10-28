package com.google.android.gms.internal.play_billing;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
public final class zzjf extends zzgp implements zzhs {
    private static final zzjf zzb;
    private int zzd = 0;
    private Object zze;

    static {
        zzjf zzjfVar = new zzjf();
        zzb = zzjfVar;
        zzgp.zzB(zzjf.class, zzjfVar);
    }

    private zzjf() {
    }

    public static zzjd zza() {
        return (zzjd) zzb.zzp();
    }

    public static zzjf zzc() {
        return zzb;
    }

    static /* synthetic */ void zze(zzjf zzjfVar, String str) {
        str.getClass();
        zzjfVar.zzd = 3;
        zzjfVar.zze = str;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgp
    protected final Object zzd(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new zzia(zzb, ProtectedSandApp.s("\ud84f"), new Object[]{ProtectedSandApp.s("\ud84d"), ProtectedSandApp.s("\ud84e"), zzim.class, zzhi.class});
        }
        if (i5 == 3) {
            return new zzjf();
        }
        zzje zzjeVar = null;
        if (i5 == 4) {
            return new zzjd(zzjeVar);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }
}
