package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzap {
    final String zza;
    final String zzb;
    final String zzc;
    final long zzd;
    final long zze;
    final zzas zzf;

    zzap(zzgd zzgdVar, String str, String str2, String str3, long j5, long j6, Bundle bundle) {
        zzas zzasVar;
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        this.zza = str2;
        this.zzb = str3;
        this.zzc = true == TextUtils.isEmpty(str) ? null : str;
        this.zzd = j5;
        this.zze = j6;
        if (j6 != 0 && j6 > j5) {
            zzgdVar.zzaA().zzk().zzb(ProtectedSandApp.s("\u0ef5"), zzet.zzn(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            zzasVar = new zzas(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    zzgdVar.zzaA().zzd().zza(ProtectedSandApp.s("\u0ef6"));
                    it.remove();
                } else {
                    Object zzA = zzgdVar.zzv().zzA(next, bundle2.get(next));
                    if (zzA == null) {
                        zzgdVar.zzaA().zzk().zzb(ProtectedSandApp.s("\u0ef7"), zzgdVar.zzj().zze(next));
                        it.remove();
                    } else {
                        zzgdVar.zzv().zzP(bundle2, next, zzA);
                    }
                }
            }
            zzasVar = new zzas(bundle2);
        }
        this.zzf = zzasVar;
    }

    public final String toString() {
        String str = this.zza;
        String str2 = this.zzb;
        String zzasVar = this.zzf.toString();
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("\u0ef9"));
        sb.append(str);
        sb.append(ProtectedSandApp.s("\u0efa"));
        sb.append(str2);
        sb.append(ProtectedSandApp.s("\u0efb"));
        return androidx.concurrent.futures.a.a(sb, zzasVar, ProtectedSandApp.s("\u0efc"));
    }

    final zzap zza(zzgd zzgdVar, long j5) {
        return new zzap(zzgdVar, this.zzc, this.zza, this.zzb, this.zzd, j5, this.zzf);
    }

    private zzap(zzgd zzgdVar, String str, String str2, String str3, long j5, long j6, zzas zzasVar) {
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        Preconditions.checkNotNull(zzasVar);
        this.zza = str2;
        this.zzb = str3;
        this.zzc = true == TextUtils.isEmpty(str) ? null : str;
        this.zzd = j5;
        this.zze = j6;
        if (j6 != 0 && j6 > j5) {
            zzgdVar.zzaA().zzk().zzc(ProtectedSandApp.s("\u0ef8"), zzet.zzn(str2), zzet.zzn(str3));
        }
        this.zzf = zzasVar;
    }
}
