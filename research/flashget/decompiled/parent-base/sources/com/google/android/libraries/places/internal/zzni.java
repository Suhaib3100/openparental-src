package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzni extends zzadk implements zzaes {
    private static final zzni zzb;
    private int zze;
    private zznk zzg;
    private zznm zzh;
    private zzabx zzi;
    private byte zzj = 2;
    private int zzf = 1;

    static {
        zzni zzniVar = new zzni();
        zzb = zzniVar;
        zzadk.zzG(zzni.class, zzniVar);
    }

    private zzni() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return Byte.valueOf(this.zzj);
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ueac1"), new Object[]{ProtectedSandApp.s("\ueabe"), ProtectedSandApp.s("\ueabf"), zznh.zza, ProtectedSandApp.s("\ueac0"), ProtectedSandApp.s("\ueabc"), ProtectedSandApp.s("\ueabd")});
        }
        if (i5 == 3) {
            return new zzni();
        }
        zznf zznfVar = null;
        if (i5 == 4) {
            return new zzng(zznfVar);
        }
        if (i5 == 5) {
            return zzb;
        }
        this.zzj = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
