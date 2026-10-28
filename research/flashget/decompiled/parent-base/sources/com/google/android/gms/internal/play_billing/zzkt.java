package com.google.android.gms.internal.play_billing;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
public final class zzkt extends zzgp implements zzhs {
    private static final zzkt zzb;
    private int zzd;
    private zzgu zze = zzgp.zzv();
    private String zzf = "";
    private boolean zzg;

    static {
        zzkt zzktVar = new zzkt();
        zzb = zzktVar;
        zzgp.zzB(zzkt.class, zzktVar);
    }

    private zzkt() {
    }

    public static zzkt zzb() {
        return zzb;
    }

    static /* synthetic */ void zzc(zzkt zzktVar, boolean z4) {
        zzktVar.zzd |= 2;
        zzktVar.zzg = z4;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgp
    protected final Object zzd(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzgp.zzy(zzb, ProtectedSandApp.s("\ud945"), new Object[]{ProtectedSandApp.s("\ud943"), ProtectedSandApp.s("\ud944"), zzkr.class, ProtectedSandApp.s("\ud941"), ProtectedSandApp.s("\ud942")});
        }
        if (i5 == 3) {
            return new zzkt();
        }
        zzks zzksVar = null;
        if (i5 == 4) {
            return new zzko(zzksVar);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }
}
