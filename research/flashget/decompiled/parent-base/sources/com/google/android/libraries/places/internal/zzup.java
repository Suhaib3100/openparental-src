package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzup extends zzadk implements zzaes {
    private static final zzup zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;

    static {
        zzup zzupVar = new zzup();
        zzb = zzupVar;
        zzadk.zzG(zzup.class, zzupVar);
    }

    private zzup() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\uecee"), new Object[]{ProtectedSandApp.s("\uece8"), ProtectedSandApp.s("\uece9"), ProtectedSandApp.s("\uecea"), ProtectedSandApp.s("\ueceb"), ProtectedSandApp.s("\uecec"), ProtectedSandApp.s("\ueced"), ProtectedSandApp.s("\uece6"), ProtectedSandApp.s("\uece7")});
        }
        if (i5 == 3) {
            return new zzup();
        }
        zzsz zzszVar = null;
        if (i5 == 4) {
            return new zzuo(zzszVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
