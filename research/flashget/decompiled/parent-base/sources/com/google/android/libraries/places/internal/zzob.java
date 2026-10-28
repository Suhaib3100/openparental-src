package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzob extends zzadk implements zzaes {
    private static final zzob zzb;
    private int zze;
    private int zzf = 1;
    private zzod zzg;
    private zzny zzh;

    static {
        zzob zzobVar = new zzob();
        zzb = zzobVar;
        zzadk.zzG(zzob.class, zzobVar);
    }

    private zzob() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ueaee"), new Object[]{ProtectedSandApp.s("\ueaec"), ProtectedSandApp.s("\ueaed"), zzoa.zza, ProtectedSandApp.s("\ueaea"), ProtectedSandApp.s("\ueaeb")});
        }
        if (i5 == 3) {
            return new zzob();
        }
        zznw zznwVar = null;
        if (i5 == 4) {
            return new zznz(zznwVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
