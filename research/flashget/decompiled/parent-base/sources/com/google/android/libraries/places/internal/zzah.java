package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzah extends zzadk implements zzaes {
    private static final zzah zzb;
    private int zze;
    private int zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private float zzj;
    private boolean zzk;
    private zzadr zzl = zzadk.zzB();
    private zzadr zzm = zzadk.zzB();
    private zzadr zzn = zzadk.zzB();
    private int zzo;
    private long zzp;

    static {
        zzah zzahVar = new zzah();
        zzb = zzahVar;
        zzadk.zzG(zzah.class, zzahVar);
    }

    private zzah() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ue818"), new Object[]{ProtectedSandApp.s("\ue80e"), ProtectedSandApp.s("\ue80f"), zzao.zza, ProtectedSandApp.s("\ue810"), ProtectedSandApp.s("\ue811"), ProtectedSandApp.s("\ue812"), ProtectedSandApp.s("\ue813"), ProtectedSandApp.s("\ue814"), ProtectedSandApp.s("\ue815"), ProtectedSandApp.s("\ue816"), zzan.class, ProtectedSandApp.s("\ue817"), zzan.class, ProtectedSandApp.s("\ue80c"), ProtectedSandApp.s("\ue80d")});
        }
        if (i5 == 3) {
            return new zzah();
        }
        zzaf zzafVar = null;
        if (i5 == 4) {
            return new zzag(zzafVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
