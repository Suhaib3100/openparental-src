package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzabb extends zzadk implements zzaes {
    private static final zzabb zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;

    static {
        zzabb zzabbVar = new zzabb();
        zzb = zzabbVar;
        zzadk.zzG(zzabb.class, zzabbVar);
    }

    private zzabb() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ue6ed"), new Object[]{ProtectedSandApp.s("\ue6e7"), ProtectedSandApp.s("\ue6e8"), ProtectedSandApp.s("\ue6e9"), ProtectedSandApp.s("\ue6ea"), ProtectedSandApp.s("\ue6eb"), ProtectedSandApp.s("\ue6ec"), ProtectedSandApp.s("\ue6e5"), ProtectedSandApp.s("\ue6e6")});
        }
        if (i5 == 3) {
            return new zzabb();
        }
        zzaaz zzaazVar = null;
        if (i5 == 4) {
            return new zzaba(zzaazVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
