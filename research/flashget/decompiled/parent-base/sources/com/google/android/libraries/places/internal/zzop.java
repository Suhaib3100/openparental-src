package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzop extends zzadk implements zzaes {
    private static final zzop zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private byte zzh = 2;

    static {
        zzop zzopVar = new zzop();
        zzb = zzopVar;
        zzadk.zzG(zzop.class, zzopVar);
    }

    private zzop() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ueb07"), new Object[]{ProtectedSandApp.s("\ueb06"), ProtectedSandApp.s("\ueb04"), ProtectedSandApp.s("\ueb05")});
        }
        if (i5 == 3) {
            return new zzop();
        }
        zzon zzonVar = null;
        if (i5 == 4) {
            return new zzoo(zzonVar);
        }
        if (i5 == 5) {
            return zzb;
        }
        this.zzh = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
