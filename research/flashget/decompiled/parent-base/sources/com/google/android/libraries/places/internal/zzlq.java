package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzlq extends zzadk implements zzaes {
    private static final zzlq zzb;
    private int zze;
    private zzly zzf;
    private int zzg;

    static {
        zzlq zzlqVar = new zzlq();
        zzb = zzlqVar;
        zzadk.zzG(zzlq.class, zzlqVar);
    }

    private zzlq() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\uea5f"), new Object[]{ProtectedSandApp.s("\uea5e"), ProtectedSandApp.s("\uea5c"), ProtectedSandApp.s("\uea5d")});
        }
        if (i5 == 3) {
            return new zzlq();
        }
        zzlo zzloVar = null;
        if (i5 == 4) {
            return new zzlp(zzloVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
