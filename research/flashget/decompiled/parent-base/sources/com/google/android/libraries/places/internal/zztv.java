package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zztv extends zzadk implements zzaes {
    private static final zztv zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    static {
        zztv zztvVar = new zztv();
        zzb = zztvVar;
        zzadk.zzG(zztv.class, zztvVar);
    }

    private zztv() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\uecbd"), new Object[]{ProtectedSandApp.s("\uecb9"), ProtectedSandApp.s("\uecba"), zztt.zza, ProtectedSandApp.s("\uecbb"), zztu.zza, ProtectedSandApp.s("\uecbc"), zztw.zza, ProtectedSandApp.s("\uecb8")});
        }
        if (i5 == 3) {
            return new zztv();
        }
        zzsz zzszVar = null;
        if (i5 == 4) {
            return new zzts(zzszVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
