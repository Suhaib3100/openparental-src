package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzrq extends zzadk implements zzaes {
    private static final zzrq zzb;
    private int zze;
    private String zzf = "";
    private int zzg;
    private int zzh;
    private float zzi;
    private float zzj;
    private float zzk;
    private long zzl;

    static {
        zzrq zzrqVar = new zzrq();
        zzb = zzrqVar;
        zzadk.zzG(zzrq.class, zzrqVar);
    }

    private zzrq() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\uec2e"), new Object[]{ProtectedSandApp.s("\uec28"), ProtectedSandApp.s("\uec29"), ProtectedSandApp.s("\uec2a"), zzsf.zza, ProtectedSandApp.s("\uec2b"), ProtectedSandApp.s("\uec2c"), ProtectedSandApp.s("\uec2d"), ProtectedSandApp.s("\uec26"), ProtectedSandApp.s("\uec27")});
        }
        if (i5 == 3) {
            return new zzrq();
        }
        zzri zzriVar = null;
        if (i5 == 4) {
            return new zzrp(zzriVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
