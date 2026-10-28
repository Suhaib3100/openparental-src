package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzabx extends zzadk implements zzaes {
    private static final zzabx zzb;
    private int zze;
    private int zzf;
    private zzabb zzg;
    private zzabb zzh;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private zzabb zzo;
    private zzabe zzp;
    private zzabk zzq;
    private int zzr;
    private int zzs;
    private zzabh zzt;
    private byte zzu = 2;
    private zzadr zzi = zzadk.zzB();

    static {
        zzabx zzabxVar = new zzabx();
        zzb = zzabxVar;
        zzadk.zzG(zzabx.class, zzabxVar);
    }

    private zzabx() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return Byte.valueOf(this.zzu);
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ue735"), new Object[]{ProtectedSandApp.s("\ue727"), ProtectedSandApp.s("\ue728"), ProtectedSandApp.s("\ue729"), ProtectedSandApp.s("\ue72a"), ProtectedSandApp.s("\ue72b"), zzabu.class, ProtectedSandApp.s("\ue72c"), ProtectedSandApp.s("\ue72d"), ProtectedSandApp.s("\ue72e"), ProtectedSandApp.s("\ue72f"), ProtectedSandApp.s("\ue730"), ProtectedSandApp.s("\ue731"), ProtectedSandApp.s("\ue732"), ProtectedSandApp.s("\ue733"), ProtectedSandApp.s("\ue734"), ProtectedSandApp.s("\ue725"), ProtectedSandApp.s("\ue726")});
        }
        if (i5 == 3) {
            return new zzabx();
        }
        zzabv zzabvVar = null;
        if (i5 == 4) {
            return new zzabw(zzabvVar);
        }
        if (i5 == 5) {
            return zzb;
        }
        this.zzu = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
