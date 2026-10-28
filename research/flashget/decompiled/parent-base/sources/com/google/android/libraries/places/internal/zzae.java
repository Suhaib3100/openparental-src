package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzae extends zzadk implements zzaes {
    private static final zzae zzb;
    private int zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;

    static {
        zzae zzaeVar = new zzae();
        zzb = zzaeVar;
        zzadk.zzG(zzae.class, zzaeVar);
    }

    private zzae() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ue7a2"), new Object[]{ProtectedSandApp.s("\ue79b"), ProtectedSandApp.s("\ue79c"), zzad.zza, ProtectedSandApp.s("\ue79d"), ProtectedSandApp.s("\ue79e"), ProtectedSandApp.s("\ue79f"), ProtectedSandApp.s("\ue7a0"), ProtectedSandApp.s("\ue7a1"), ProtectedSandApp.s("\ue799"), ProtectedSandApp.s("\ue79a")});
        }
        if (i5 == 3) {
            return new zzae();
        }
        zzab zzabVar = null;
        if (i5 == 4) {
            return new zzac(zzabVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
