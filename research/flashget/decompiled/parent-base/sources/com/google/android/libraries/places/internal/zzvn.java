package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzvn extends zzadk implements zzaes {
    private static final zzvn zzb;
    private int zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    static {
        zzvn zzvnVar = new zzvn();
        zzb = zzvnVar;
        zzadk.zzG(zzvn.class, zzvnVar);
    }

    private zzvn() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ued34"), new Object[]{ProtectedSandApp.s("\ued31"), ProtectedSandApp.s("\ued32"), ProtectedSandApp.s("\ued33"), ProtectedSandApp.s("\ued2f"), ProtectedSandApp.s("\ued30")});
        }
        if (i5 == 3) {
            return new zzvn();
        }
        zzsz zzszVar = null;
        if (i5 == 4) {
            return new zzvm(zzszVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
