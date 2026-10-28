package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzaav extends zzadk implements zzaes {
    private static final zzaav zzb;
    private int zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;

    static {
        zzaav zzaavVar = new zzaav();
        zzb = zzaavVar;
        zzadk.zzG(zzaav.class, zzaavVar);
    }

    private zzaav() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ue6e1"), new Object[]{ProtectedSandApp.s("\ue6d9"), ProtectedSandApp.s("\ue6da"), ProtectedSandApp.s("\ue6db"), ProtectedSandApp.s("\ue6dc"), ProtectedSandApp.s("\ue6dd"), ProtectedSandApp.s("\ue6de"), ProtectedSandApp.s("\ue6df"), ProtectedSandApp.s("\ue6e0"), ProtectedSandApp.s("\ue6d7"), ProtectedSandApp.s("\ue6d8")});
        }
        if (i5 == 3) {
            return new zzaav();
        }
        zzaat zzaatVar = null;
        if (i5 == 4) {
            return new zzaau(zzaatVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
