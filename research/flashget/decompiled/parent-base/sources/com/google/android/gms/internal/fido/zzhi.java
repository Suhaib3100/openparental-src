package com.google.android.gms.internal.fido;

import android.support.v4.media.d;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.primitives.u;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes5.dex */
public final class zzhi extends zzhp {
    private final zzgx zza;

    zzhi(zzgx zzgxVar) {
        this.zza = zzgxVar;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        zzhp zzhpVar = (zzhp) obj;
        if (zzhp.zzd(u.f57540a) != zzhpVar.zza()) {
            return zzhp.zzd(u.f57540a) - zzhpVar.zza();
        }
        zzhi zzhiVar = (zzhi) zzhpVar;
        zzgx zzgxVar = this.zza;
        int zzd = zzgxVar.zzd();
        zzgx zzgxVar2 = zzhiVar.zza;
        if (zzd != zzgxVar2.zzd()) {
            return zzgxVar.zzd() - zzgxVar2.zzd();
        }
        return zzgm.zza().compare(zzgxVar.zzm(), zzhiVar.zza.zzm());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzhi.class == obj.getClass()) {
            return this.zza.equals(((zzhi) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(zzhp.zzd(u.f57540a)), this.zza});
    }

    public final String toString() {
        zzgf zzd = zzgf.zzf().zzd();
        byte[] zzm = this.zza.zzm();
        return d.a(ProtectedSandApp.s("탖"), zzd.zzg(zzm, 0, zzm.length), ProtectedSandApp.s("탗"));
    }

    @Override // com.google.android.gms.internal.fido.zzhp
    protected final int zza() {
        return zzhp.zzd(u.f57540a);
    }

    public final zzgx zzc() {
        return this.zza;
    }
}
