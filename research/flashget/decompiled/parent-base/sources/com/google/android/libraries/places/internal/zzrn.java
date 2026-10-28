package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzrn extends zzadk implements zzaes {
    private static final zzrn zzb;
    private int zze;
    private float zzf;
    private float zzg;
    private float zzh;
    private int zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;

    static {
        zzrn zzrnVar = new zzrn();
        zzb = zzrnVar;
        zzadk.zzG(zzrn.class, zzrnVar);
    }

    private zzrn() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\uec20"), new Object[]{ProtectedSandApp.s("\uec18"), ProtectedSandApp.s("\uec19"), ProtectedSandApp.s("\uec1a"), ProtectedSandApp.s("\uec1b"), ProtectedSandApp.s("\uec1c"), ProtectedSandApp.s("\uec1d"), ProtectedSandApp.s("\uec1e"), ProtectedSandApp.s("\uec1f"), ProtectedSandApp.s("\uec16"), ProtectedSandApp.s("\uec17")});
        }
        if (i5 == 3) {
            return new zzrn();
        }
        zzri zzriVar = null;
        if (i5 == 4) {
            return new zzrm(zzriVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
