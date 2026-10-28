package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzxd extends zzadk implements zzaes {
    private static final zzxd zzb;
    private int zze;
    private zzwy zzh;
    private zzor zzi;
    private int zzl;
    private int zzm;
    private int zzo;
    private byte zzp = 2;
    private String zzf = "";
    private String zzg = "";
    private int zzj = 1;
    private String zzk = "";
    private String zzn = "";

    static {
        zzxd zzxdVar = new zzxd();
        zzb = zzxdVar;
        zzadk.zzG(zzxd.class, zzxdVar);
    }

    private zzxd() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return Byte.valueOf(this.zzp);
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ued82"), new Object[]{ProtectedSandApp.s("\ued78"), ProtectedSandApp.s("\ued79"), ProtectedSandApp.s("\ued7a"), ProtectedSandApp.s("\ued7b"), ProtectedSandApp.s("\ued7c"), ProtectedSandApp.s("\ued7d"), zzxa.zza, ProtectedSandApp.s("\ued7e"), ProtectedSandApp.s("\ued7f"), zzxc.zza, ProtectedSandApp.s("\ued80"), ProtectedSandApp.s("\ued81"), ProtectedSandApp.s("\ued77"), zzxb.zza});
        }
        if (i5 == 3) {
            return new zzxd();
        }
        zzvo zzvoVar = null;
        if (i5 == 4) {
            return new zzwz(zzvoVar);
        }
        if (i5 == 5) {
            return zzb;
        }
        this.zzp = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
