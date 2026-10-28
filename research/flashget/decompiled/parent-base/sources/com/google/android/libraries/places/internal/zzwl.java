package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzwl extends zzadk implements zzaes {
    private static final zzwl zzb;
    private int zze;
    private zzado zzf = zzadk.zzz();
    private zzadr zzg = zzadk.zzB();
    private String zzh = "";
    private boolean zzi;
    private int zzj;

    static {
        zzwl zzwlVar = new zzwl();
        zzb = zzwlVar;
        zzadk.zzG(zzwl.class, zzwlVar);
    }

    private zzwl() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ued58"), new Object[]{ProtectedSandApp.s("\ued54"), ProtectedSandApp.s("\ued55"), ProtectedSandApp.s("\ued56"), ProtectedSandApp.s("\ued57"), ProtectedSandApp.s("\ued52"), ProtectedSandApp.s("\ued53")});
        }
        if (i5 == 3) {
            return new zzwl();
        }
        zzvo zzvoVar = null;
        if (i5 == 4) {
            return new zzwk(zzvoVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
