package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzto extends zzadk implements zzaes {
    private static final zzto zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    static {
        zzto zztoVar = new zzto();
        zzb = zztoVar;
        zzadk.zzG(zzto.class, zztoVar);
    }

    private zzto() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\uecb2"), new Object[]{ProtectedSandApp.s("\uecae"), ProtectedSandApp.s("\uecaf"), ProtectedSandApp.s("\uecb0"), ProtectedSandApp.s("\uecb1"), ProtectedSandApp.s("\uecac"), ProtectedSandApp.s("\uecad")});
        }
        if (i5 == 3) {
            return new zzto();
        }
        zzsz zzszVar = null;
        if (i5 == 4) {
            return new zztn(zzszVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
