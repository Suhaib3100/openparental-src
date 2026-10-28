package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzyx extends zzadk implements zzaes {
    private static final zzyx zzb;
    private int zze;
    private zzwl zzf;
    private int zzg;
    private int zzh;
    private boolean zzi;
    private long zzj;
    private int zzk;
    private int zzl;
    private int zzm;

    static {
        zzyx zzyxVar = new zzyx();
        zzb = zzyxVar;
        zzadk.zzG(zzyx.class, zzyxVar);
    }

    private zzyx() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\uedfe"), new Object[]{ProtectedSandApp.s("\uedf6"), ProtectedSandApp.s("\uedf7"), ProtectedSandApp.s("\uedf8"), zzwm.zza, ProtectedSandApp.s("\uedf9"), zzyw.zza, ProtectedSandApp.s("\uedfa"), ProtectedSandApp.s("\uedfb"), ProtectedSandApp.s("\uedfc"), zzyv.zza, ProtectedSandApp.s("\uedfd"), ProtectedSandApp.s("\uedf5"), zzvp.zza});
        }
        if (i5 == 3) {
            return new zzyx();
        }
        zzvo zzvoVar = null;
        if (i5 == 4) {
            return new zzyu(zzvoVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
