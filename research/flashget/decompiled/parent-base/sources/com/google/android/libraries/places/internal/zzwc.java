package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzwc extends zzadk implements zzaes {
    private static final zzwc zzb;
    private int zze;
    private int zzf;

    static {
        zzwc zzwcVar = new zzwc();
        zzb = zzwcVar;
        zzadk.zzG(zzwc.class, zzwcVar);
    }

    private zzwc() {
    }

    public static zzwb zza() {
        return (zzwb) zzb.zzx();
    }

    static /* synthetic */ void zzd(zzwc zzwcVar, int i4) {
        zzwcVar.zze |= 1;
        zzwcVar.zzf = i4;
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ued45"), new Object[]{ProtectedSandApp.s("\ued43"), ProtectedSandApp.s("\ued44")});
        }
        if (i5 == 3) {
            return new zzwc();
        }
        zzvo zzvoVar = null;
        if (i5 == 4) {
            return new zzwb(zzvoVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
