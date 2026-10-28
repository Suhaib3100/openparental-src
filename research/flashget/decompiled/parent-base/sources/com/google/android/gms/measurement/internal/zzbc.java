package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.support.v4.media.c;
import android.text.TextUtils;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzbc {
    final String zza;
    final String zzb;
    final String zzc;
    final long zzd;
    final long zze;
    final zzbe zzf;

    zzbc(zzhy zzhyVar, String str, String str2, String str3, long j4, long j5, Bundle bundle) {
        zzbe zzbeVar;
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        this.zza = str2;
        this.zzb = str3;
        this.zzc = TextUtils.isEmpty(str) ? null : str;
        this.zzd = j4;
        this.zze = j5;
        if (j5 != 0 && j5 > j4) {
            zzhyVar.zzj().zzu().zza(ProtectedSandApp.s("\udd75"), zzgo.zza(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            zzbeVar = new zzbe(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    zzhyVar.zzj().zzg().zza(ProtectedSandApp.s("\udd76"));
                    it.remove();
                } else {
                    Object zzb = zzhyVar.zzt().zzb(next, bundle2.get(next));
                    if (zzb == null) {
                        zzhyVar.zzj().zzu().zza(ProtectedSandApp.s("\udd77"), zzhyVar.zzk().zzb(next));
                        it.remove();
                    } else {
                        zzhyVar.zzt().zza(bundle2, next, zzb);
                    }
                }
            }
            zzbeVar = new zzbe(bundle2);
        }
        this.zzf = zzbeVar;
    }

    public final String toString() {
        String str = this.zza;
        String str2 = this.zzb;
        return c.a(androidx.constraintlayout.core.parser.b.a(ProtectedSandApp.s("\udd79"), str, ProtectedSandApp.s("\udd7a"), str2, ProtectedSandApp.s("\udd7b")), String.valueOf(this.zzf), ProtectedSandApp.s("\udd7c"));
    }

    final zzbc zza(zzhy zzhyVar, long j4) {
        return new zzbc(zzhyVar, this.zzc, this.zza, this.zzb, this.zzd, j4, this.zzf);
    }

    private zzbc(zzhy zzhyVar, String str, String str2, String str3, long j4, long j5, zzbe zzbeVar) {
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        Preconditions.checkNotNull(zzbeVar);
        this.zza = str2;
        this.zzb = str3;
        this.zzc = TextUtils.isEmpty(str) ? null : str;
        this.zzd = j4;
        this.zze = j5;
        if (j5 != 0 && j5 > j4) {
            zzhyVar.zzj().zzu().zza(ProtectedSandApp.s("\udd78"), zzgo.zza(str2), zzgo.zza(str3));
        }
        this.zzf = zzbeVar;
    }
}
