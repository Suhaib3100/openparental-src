package com.google.android.gms.internal.play_billing;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
public final class zzln extends zzgp implements zzhs {
    private static final zzln zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private long zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;

    static {
        zzln zzlnVar = new zzln();
        zzb = zzlnVar;
        zzgp.zzB(zzln.class, zzlnVar);
    }

    private zzln() {
    }

    public static zzll zza() {
        return (zzll) zzb.zzp();
    }

    static /* synthetic */ void zzc(zzln zzlnVar, boolean z4) {
        zzlnVar.zzd |= 8;
        zzlnVar.zzh = z4;
    }

    static /* synthetic */ void zze(zzln zzlnVar, int i4) {
        zzlnVar.zzd |= 16;
        zzlnVar.zzi = i4;
    }

    static /* synthetic */ void zzf(zzln zzlnVar, long j4) {
        zzlnVar.zzd |= 4;
        zzlnVar.zzg = j4;
    }

    static /* synthetic */ void zzg(zzln zzlnVar, int i4) {
        zzlnVar.zzd |= 32;
        zzlnVar.zzj = i4;
    }

    static /* synthetic */ void zzh(zzln zzlnVar, boolean z4) {
        zzlnVar.zzd |= 2;
        zzlnVar.zzf = true;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgp
    protected final Object zzd(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzgp.zzy(zzb, ProtectedSandApp.s("\ud962"), new Object[]{ProtectedSandApp.s("\ud95d"), ProtectedSandApp.s("\ud95e"), ProtectedSandApp.s("\ud95f"), ProtectedSandApp.s("\ud960"), ProtectedSandApp.s("\ud961"), ProtectedSandApp.s("\ud95b"), ProtectedSandApp.s("\ud95c")});
        }
        if (i5 == 3) {
            return new zzln();
        }
        zzlm zzlmVar = null;
        if (i5 == 4) {
            return new zzll(zzlmVar);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }
}
