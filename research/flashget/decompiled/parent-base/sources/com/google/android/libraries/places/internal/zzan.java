package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzan extends zzadk implements zzaes {
    private static final zzan zzb;
    private int zze;
    private boolean zzf;
    private long zzg;
    private long zzh;
    private int zzi;
    private float zzj;
    private float zzk;
    private boolean zzl;
    private float zzm;
    private double zzn;
    private int zzo;

    static {
        zzan zzanVar = new zzan();
        zzb = zzanVar;
        zzadk.zzG(zzan.class, zzanVar);
    }

    private zzan() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            zzadn zzadnVar = zzam.zza;
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ue828"), new Object[]{ProtectedSandApp.s("\ue81f"), ProtectedSandApp.s("\ue820"), ProtectedSandApp.s("\ue821"), ProtectedSandApp.s("\ue822"), ProtectedSandApp.s("\ue823"), zzadnVar, ProtectedSandApp.s("\ue824"), ProtectedSandApp.s("\ue825"), ProtectedSandApp.s("\ue826"), ProtectedSandApp.s("\ue827"), ProtectedSandApp.s("\ue81d"), ProtectedSandApp.s("\ue81e"), zzadnVar});
        }
        if (i5 == 3) {
            return new zzan();
        }
        zzak zzakVar = null;
        if (i5 == 4) {
            return new zzal(zzakVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
