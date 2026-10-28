package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzok extends zzadk implements zzaes {
    private static final zzok zzb;
    private int zze;
    private boolean zzf;
    private long zzg;

    static {
        zzok zzokVar = new zzok();
        zzb = zzokVar;
        zzadk.zzG(zzok.class, zzokVar);
    }

    private zzok() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ueaff"), new Object[]{ProtectedSandApp.s("\ueafe"), ProtectedSandApp.s("\ueafc"), ProtectedSandApp.s("\ueafd")});
        }
        if (i5 == 3) {
            return new zzok();
        }
        zzoe zzoeVar = null;
        if (i5 == 4) {
            return new zzoj(zzoeVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
