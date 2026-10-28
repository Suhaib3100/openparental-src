package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzvl extends zzadk implements zzaes {
    private static final zzvl zzb;
    private int zze;
    private int zzf;
    private zzvi zzg;
    private zzvi zzh;
    private int zzi;
    private zzvn zzj;
    private zzuf zzk;

    static {
        zzvl zzvlVar = new zzvl();
        zzb = zzvlVar;
        zzadk.zzG(zzvl.class, zzvlVar);
    }

    private zzvl() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ued2e"), new Object[]{ProtectedSandApp.s("\ued29"), ProtectedSandApp.s("\ued2a"), zzvj.zza, ProtectedSandApp.s("\ued2b"), ProtectedSandApp.s("\ued2c"), ProtectedSandApp.s("\ued2d"), zzvk.zza, ProtectedSandApp.s("\ued27"), ProtectedSandApp.s("\ued28")});
        }
        if (i5 == 3) {
            return new zzvl();
        }
        zzsz zzszVar = null;
        if (i5 == 4) {
            return new zzvf(zzszVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
