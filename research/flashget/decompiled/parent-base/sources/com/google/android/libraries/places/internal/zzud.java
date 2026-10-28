package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzud extends zzadk implements zzaes {
    private static final zzud zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private zzvb zzj;
    private zzul zzk;
    private zzuz zzl;
    private int zzm;
    private int zzn;

    static {
        zzud zzudVar = new zzud();
        zzb = zzudVar;
        zzadk.zzG(zzud.class, zzudVar);
    }

    private zzud() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 != 2) {
            if (i5 == 3) {
                return new zzud();
            }
            zzsz zzszVar = null;
            if (i5 == 4) {
                return new zzty(zzszVar);
            }
            if (i5 != 5) {
                return null;
            }
            return zzb;
        }
        return zzadk.zzF(zzb, ProtectedSandApp.s("\ueccb"), new Object[]{ProtectedSandApp.s("\uecc2"), ProtectedSandApp.s("\uecc3"), zzua.zza, ProtectedSandApp.s("\uecc4"), zzuc.zza, ProtectedSandApp.s("\uecc5"), ProtectedSandApp.s("\uecc6"), zztz.zza, ProtectedSandApp.s("\uecc7"), ProtectedSandApp.s("\uecc8"), ProtectedSandApp.s("\uecc9"), ProtectedSandApp.s("\uecca"), zztx.zza, ProtectedSandApp.s("\uecc1"), zzub.zza});
    }
}
