package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzun extends zzadk implements zzaes {
    private static final zzun zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;

    static {
        zzun zzunVar = new zzun();
        zzb = zzunVar;
        zzadk.zzG(zzun.class, zzunVar);
    }

    private zzun() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\uece5"), new Object[]{ProtectedSandApp.s("\uece0"), ProtectedSandApp.s("\uece1"), ProtectedSandApp.s("\uece2"), ProtectedSandApp.s("\uece3"), ProtectedSandApp.s("\uece4"), ProtectedSandApp.s("\uecde"), ProtectedSandApp.s("\uecdf")});
        }
        if (i5 == 3) {
            return new zzun();
        }
        zzsz zzszVar = null;
        if (i5 == 4) {
            return new zzum(zzszVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
