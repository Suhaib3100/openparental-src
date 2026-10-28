package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzyt extends zzadk implements zzaes {
    private static final zzyt zzb;
    private int zze;
    private int zzf;
    private int zzh;
    private int zzi;
    private long zzj;
    private boolean zzl;
    private zzadr zzg = zzadk.zzB();
    private String zzk = "";

    static {
        zzyt zzytVar = new zzyt();
        zzb = zzytVar;
        zzadk.zzG(zzyt.class, zzytVar);
    }

    private zzyt() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\uedf4"), new Object[]{ProtectedSandApp.s("\uedee"), ProtectedSandApp.s("\uedef"), zzwm.zza, ProtectedSandApp.s("\uedf0"), ProtectedSandApp.s("\uedf1"), ProtectedSandApp.s("\uedf2"), zzyw.zza, ProtectedSandApp.s("\uedf3"), ProtectedSandApp.s("\uedec"), ProtectedSandApp.s("\ueded")});
        }
        if (i5 == 3) {
            return new zzyt();
        }
        zzvo zzvoVar = null;
        if (i5 == 4) {
            return new zzys(zzvoVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
