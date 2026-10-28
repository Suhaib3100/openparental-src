package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzvb extends zzadk implements zzaes {
    private static final zzvb zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private boolean zzi;

    static {
        zzvb zzvbVar = new zzvb();
        zzb = zzvbVar;
        zzadk.zzG(zzvb.class, zzvbVar);
    }

    private zzvb() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ued1f"), new Object[]{ProtectedSandApp.s("\ued1c"), ProtectedSandApp.s("\ued1d"), ProtectedSandApp.s("\ued1e"), ProtectedSandApp.s("\ued1a"), ProtectedSandApp.s("\ued1b")});
        }
        if (i5 == 3) {
            return new zzvb();
        }
        zzsz zzszVar = null;
        if (i5 == 4) {
            return new zzva(zzszVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
