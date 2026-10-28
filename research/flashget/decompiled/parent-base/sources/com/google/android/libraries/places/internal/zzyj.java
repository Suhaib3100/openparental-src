package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzyj extends zzadk implements zzaes {
    private static final zzyj zzb;
    private int zze;
    private zzop zzf;
    private byte zzg = 2;

    static {
        zzyj zzyjVar = new zzyj();
        zzb = zzyjVar;
        zzadk.zzG(zzyj.class, zzyjVar);
    }

    private zzyj() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\uede2"), new Object[]{ProtectedSandApp.s("\uede0"), ProtectedSandApp.s("\uede1")});
        }
        if (i5 == 3) {
            return new zzyj();
        }
        zzvo zzvoVar = null;
        if (i5 == 4) {
            return new zzyi(zzvoVar);
        }
        if (i5 == 5) {
            return zzb;
        }
        this.zzg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
