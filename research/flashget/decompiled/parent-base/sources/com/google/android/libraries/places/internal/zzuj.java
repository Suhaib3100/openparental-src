package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzuj extends zzadk implements zzaes {
    private static final zzuj zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;
    private int zzl;
    private int zzm;

    static {
        zzuj zzujVar = new zzuj();
        zzb = zzujVar;
        zzadk.zzG(zzuj.class, zzujVar);
    }

    private zzuj() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\uecd8"), new Object[]{ProtectedSandApp.s("\uecd0"), ProtectedSandApp.s("\uecd1"), ProtectedSandApp.s("\uecd2"), ProtectedSandApp.s("\uecd3"), ProtectedSandApp.s("\uecd4"), ProtectedSandApp.s("\uecd5"), ProtectedSandApp.s("\uecd6"), ProtectedSandApp.s("\uecd7"), zzui.zza, ProtectedSandApp.s("\ueccf"), zzuh.zza});
        }
        if (i5 == 3) {
            return new zzuj();
        }
        zzsz zzszVar = null;
        if (i5 == 4) {
            return new zzug(zzszVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
