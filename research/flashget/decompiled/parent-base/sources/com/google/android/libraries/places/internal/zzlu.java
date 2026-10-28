package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzlu extends zzadk implements zzaes {
    private static final zzlu zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;

    static {
        zzlu zzluVar = new zzlu();
        zzb = zzluVar;
        zzadk.zzG(zzlu.class, zzluVar);
    }

    private zzlu() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\uea73"), new Object[]{ProtectedSandApp.s("\uea66"), ProtectedSandApp.s("\uea67"), ProtectedSandApp.s("\uea68"), ProtectedSandApp.s("\uea69"), ProtectedSandApp.s("\uea6a"), ProtectedSandApp.s("\uea6b"), ProtectedSandApp.s("\uea6c"), ProtectedSandApp.s("\uea6d"), ProtectedSandApp.s("\uea6e"), ProtectedSandApp.s("\uea6f"), ProtectedSandApp.s("\uea70"), ProtectedSandApp.s("\uea71"), ProtectedSandApp.s("\uea72"), ProtectedSandApp.s("\uea64"), ProtectedSandApp.s("\uea65")});
        }
        if (i5 == 3) {
            return new zzlu();
        }
        zzlo zzloVar = null;
        if (i5 == 4) {
            return new zzlt(zzloVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
