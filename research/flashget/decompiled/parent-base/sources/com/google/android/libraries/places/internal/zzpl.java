package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzpl extends zzadk implements zzaes {
    private static final zzpl zzb;
    private int zze;
    private boolean zzf;
    private boolean zzg;
    private int zzh;
    private int zzi;

    static {
        zzpl zzplVar = new zzpl();
        zzb = zzplVar;
        zzadk.zzG(zzpl.class, zzplVar);
    }

    private zzpl() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ueb51"), new Object[]{ProtectedSandApp.s("\ueb4e"), ProtectedSandApp.s("\ueb4f"), ProtectedSandApp.s("\ueb50"), ProtectedSandApp.s("\ueb4c"), ProtectedSandApp.s("\ueb4d")});
        }
        if (i5 == 3) {
            return new zzpl();
        }
        zzph zzphVar = null;
        if (i5 == 4) {
            return new zzpk(zzphVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
