package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zznm extends zzadk implements zzaes {
    private static final zznm zzb;
    private int zze;
    private int zzf;
    private long zzg;
    private long zzh;
    private boolean zzi;
    private boolean zzj;
    private int zzk;
    private int zzl;
    private int zzm;

    static {
        zznm zznmVar = new zznm();
        zzb = zznmVar;
        zzadk.zzG(zznm.class, zznmVar);
    }

    private zznm() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ueacf"), new Object[]{ProtectedSandApp.s("\ueac8"), ProtectedSandApp.s("\ueac9"), ProtectedSandApp.s("\ueaca"), ProtectedSandApp.s("\ueacb"), ProtectedSandApp.s("\ueacc"), ProtectedSandApp.s("\ueacd"), ProtectedSandApp.s("\ueace"), ProtectedSandApp.s("\ueac6"), ProtectedSandApp.s("\ueac7")});
        }
        if (i5 == 3) {
            return new zznm();
        }
        zznf zznfVar = null;
        if (i5 == 4) {
            return new zznl(zznfVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
