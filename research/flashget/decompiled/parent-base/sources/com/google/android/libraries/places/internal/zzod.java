package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzod extends zzadk implements zzaes {
    private static final zzod zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;

    static {
        zzod zzodVar = new zzod();
        zzb = zzodVar;
        zzadk.zzG(zzod.class, zzodVar);
    }

    private zzod() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ueaf6"), new Object[]{ProtectedSandApp.s("\ueaf1"), ProtectedSandApp.s("\ueaf2"), ProtectedSandApp.s("\ueaf3"), ProtectedSandApp.s("\ueaf4"), ProtectedSandApp.s("\ueaf5"), ProtectedSandApp.s("\ueaef"), ProtectedSandApp.s("\ueaf0")});
        }
        if (i5 == 3) {
            return new zzod();
        }
        zznw zznwVar = null;
        if (i5 == 4) {
            return new zzoc(zznwVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
