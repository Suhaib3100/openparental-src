package com.google.android.gms.internal.measurement;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes4.dex */
public final class zzgk extends zzlb implements zzmj {
    private static final zzgk zza;
    private int zzd;
    private int zze;
    private zzlh zzf = zzlb.zzbF();

    static {
        zzgk zzgkVar = new zzgk();
        zza = zzgkVar;
        zzlb.zzbO(zzgk.class, zzgkVar);
    }

    private zzgk() {
    }

    public static zzgj zzd() {
        return (zzgj) zza.zzbA();
    }

    static /* synthetic */ void zzg(zzgk zzgkVar, int i5) {
        zzgkVar.zzd |= 1;
        zzgkVar.zze = i5;
    }

    static /* synthetic */ void zzh(zzgk zzgkVar, Iterable iterable) {
        zzlh zzlhVar = zzgkVar.zzf;
        if (!zzlhVar.zzc()) {
            zzgkVar.zzf = zzlb.zzbG(zzlhVar);
        }
        zzjk.zzbw(iterable, zzgkVar.zzf);
    }

    public final int zza() {
        return this.zzf.size();
    }

    public final int zzb() {
        return this.zze;
    }

    public final long zzc(int i5) {
        return this.zzf.zza(i5);
    }

    public final List zzf() {
        return this.zzf;
    }

    public final boolean zzi() {
        return (this.zzd & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    protected final Object zzl(int i5, Object obj, Object obj2) {
        int i6 = i5 - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return zzlb.zzbL(zza, ProtectedSandApp.s("⹃"), new Object[]{ProtectedSandApp.s("⹀"), ProtectedSandApp.s("⹁"), ProtectedSandApp.s("⹂")});
        }
        if (i6 == 3) {
            return new zzgk();
        }
        zzfk zzfkVar = null;
        if (i6 == 4) {
            return new zzgj(zzfkVar);
        }
        if (i6 != 5) {
            return null;
        }
        return zza;
    }
}
