package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzly extends zzadk implements zzaes {
    private static final zzly zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;

    static {
        zzly zzlyVar = new zzly();
        zzb = zzlyVar;
        zzadk.zzG(zzly.class, zzlyVar);
    }

    private zzly() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\uea82"), new Object[]{ProtectedSandApp.s("\uea7d"), ProtectedSandApp.s("\uea7e"), ProtectedSandApp.s("\uea7f"), ProtectedSandApp.s("\uea80"), ProtectedSandApp.s("\uea81"), ProtectedSandApp.s("\uea7b"), ProtectedSandApp.s("\uea7c")});
        }
        if (i5 == 3) {
            return new zzly();
        }
        zzlo zzloVar = null;
        if (i5 == 4) {
            return new zzlx(zzloVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
