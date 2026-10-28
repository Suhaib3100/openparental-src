package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzwy extends zzadk implements zzaes {
    private static final zzwy zzb;
    private int zze;
    private int zzf;
    private boolean zzj;
    private zzadr zzg = zzadk.zzB();
    private String zzh = "";
    private String zzi = "";
    private zzadr zzk = zzadk.zzB();

    static {
        zzwy zzwyVar = new zzwy();
        zzb = zzwyVar;
        zzadk.zzG(zzwy.class, zzwyVar);
    }

    private zzwy() {
    }

    public static zzwx zza() {
        return (zzwx) zzb.zzx();
    }

    static /* synthetic */ void zzd(zzwy zzwyVar, String str) {
        zzadr zzadrVar = zzwyVar.zzg;
        if (!zzadrVar.zzc()) {
            zzwyVar.zzg = zzadk.zzC(zzadrVar);
        }
        zzwyVar.zzg.add(str);
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ued76"), new Object[]{ProtectedSandApp.s("\ued71"), ProtectedSandApp.s("\ued72"), ProtectedSandApp.s("\ued73"), ProtectedSandApp.s("\ued74"), ProtectedSandApp.s("\ued75"), ProtectedSandApp.s("\ued6f"), ProtectedSandApp.s("\ued70")});
        }
        if (i5 == 3) {
            return new zzwy();
        }
        zzvo zzvoVar = null;
        if (i5 == 4) {
            return new zzwx(zzvoVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
