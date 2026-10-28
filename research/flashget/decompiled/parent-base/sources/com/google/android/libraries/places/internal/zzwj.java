package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzwj extends zzadk implements zzaes {
    private static final zzwj zzb;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    static {
        zzwj zzwjVar = new zzwj();
        zzb = zzwjVar;
        zzadk.zzG(zzwj.class, zzwjVar);
    }

    private zzwj() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ued51"), new Object[]{ProtectedSandApp.s("\ued50"), ProtectedSandApp.s("\ued4e"), ProtectedSandApp.s("\ued4f")});
        }
        if (i5 == 3) {
            return new zzwj();
        }
        zzvo zzvoVar = null;
        if (i5 == 4) {
            return new zzwi(zzvoVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
