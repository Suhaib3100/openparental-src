package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzaas extends zzadk implements zzaes {
    private static final zzaas zzb;
    private int zze;
    private long zzf;
    private int zzg;

    static {
        zzaas zzaasVar = new zzaas();
        zzb = zzaasVar;
        zzadk.zzG(zzaas.class, zzaasVar);
    }

    private zzaas() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ue6d6"), new Object[]{ProtectedSandApp.s("\ue6d5"), ProtectedSandApp.s("\ue6d3"), ProtectedSandApp.s("\ue6d4")});
        }
        if (i5 == 3) {
            return new zzaas();
        }
        zzaaq zzaaqVar = null;
        if (i5 == 4) {
            return new zzaar(zzaaqVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
