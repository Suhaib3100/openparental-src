package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzmv extends zzadk implements zzaes {
    private static final zzmv zzb;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private boolean zzh;

    static {
        zzmv zzmvVar = new zzmv();
        zzb = zzmvVar;
        zzadk.zzG(zzmv.class, zzmvVar);
    }

    private zzmv() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ueab2"), new Object[]{ProtectedSandApp.s("\ueab0"), ProtectedSandApp.s("\ueab1"), ProtectedSandApp.s("\ueaae"), ProtectedSandApp.s("\ueaaf")});
        }
        if (i5 == 3) {
            return new zzmv();
        }
        zzmt zzmtVar = null;
        if (i5 == 4) {
            return new zzmu(zzmtVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
