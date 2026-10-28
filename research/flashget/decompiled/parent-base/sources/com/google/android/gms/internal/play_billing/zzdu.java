package com.google.android.gms.internal.play_billing;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
public final class zzdu extends zzgp implements zzhs {
    private static final zzdu zzb;
    private int zzd;
    private int zze;
    private boolean zzf;

    static {
        zzdu zzduVar = new zzdu();
        zzb = zzduVar;
        zzgp.zzB(zzdu.class, zzduVar);
    }

    private zzdu() {
    }

    public static zzdu zzb() {
        return zzb;
    }

    public final boolean zzc() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgp
    protected final Object zzd(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzgp.zzy(zzb, ProtectedSandApp.s("흜"), new Object[]{ProtectedSandApp.s("흛"), ProtectedSandApp.s("흙"), ProtectedSandApp.s("흚")});
        }
        if (i5 == 3) {
            return new zzdu();
        }
        zzdt zzdtVar = null;
        if (i5 == 4) {
            return new zzds(zzdtVar);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }

    public final int zze() {
        int i4 = this.zze;
        int i5 = i4 != 0 ? i4 != 1 ? i4 != 2 ? 0 : 4 : 3 : 2;
        if (i5 == 0) {
            return 1;
        }
        return i5;
    }
}
