package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzln extends zzadk implements zzaes {
    private static final zzln zzb;
    private int zze;
    private int zzg;
    private int zzh;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private String zzf = "";
    private String zzi = "";

    static {
        zzln zzlnVar = new zzln();
        zzb = zzlnVar;
        zzadk.zzG(zzln.class, zzlnVar);
    }

    private zzln() {
    }

    public static zzli zza() {
        return (zzli) zzb.zzx();
    }

    static /* synthetic */ void zzd(zzln zzlnVar, String str) {
        zzlnVar.zze |= 1;
        zzlnVar.zzf = str;
    }

    static /* synthetic */ void zze(zzln zzlnVar, int i4) {
        zzlnVar.zze |= 2;
        zzlnVar.zzg = i4;
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\uea5b"), new Object[]{ProtectedSandApp.s("\uea52"), ProtectedSandApp.s("\uea53"), ProtectedSandApp.s("\uea54"), ProtectedSandApp.s("\uea55"), ProtectedSandApp.s("\uea56"), ProtectedSandApp.s("\uea57"), ProtectedSandApp.s("\uea58"), zzlj.zza, ProtectedSandApp.s("\uea59"), zzll.zza, ProtectedSandApp.s("\uea5a"), zzlk.zza, ProtectedSandApp.s("\uea51"), zzlm.zza});
        }
        if (i5 == 3) {
            return new zzln();
        }
        zzlh zzlhVar = null;
        if (i5 == 4) {
            return new zzli(zzlhVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
