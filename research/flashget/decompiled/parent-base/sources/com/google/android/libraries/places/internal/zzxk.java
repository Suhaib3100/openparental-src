package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzxk extends zzadk implements zzaes {
    private static final zzxk zzb;
    private int zze;
    private zzor zzg;
    private zzwy zzh;
    private byte zzi = 2;
    private String zzf = "";

    static {
        zzxk zzxkVar = new zzxk();
        zzb = zzxkVar;
        zzadk.zzG(zzxk.class, zzxkVar);
    }

    private zzxk() {
    }

    public static zzxj zza() {
        return (zzxj) zzb.zzx();
    }

    static /* synthetic */ void zzd(zzxk zzxkVar, zzwy zzwyVar) {
        zzxkVar.zzh = zzwyVar;
        zzxkVar.zze |= 4;
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return Byte.valueOf(this.zzi);
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ued92"), new Object[]{ProtectedSandApp.s("\ued90"), ProtectedSandApp.s("\ued91"), ProtectedSandApp.s("\ued8e"), ProtectedSandApp.s("\ued8f")});
        }
        if (i5 == 3) {
            return new zzxk();
        }
        zzvo zzvoVar = null;
        if (i5 == 4) {
            return new zzxj(zzvoVar);
        }
        if (i5 == 5) {
            return zzb;
        }
        this.zzi = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
