package com.google.android.gms.measurement.internal;

import android.support.v4.media.c;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
final class zzgn implements Runnable {
    private final /* synthetic */ int zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ Object zzc;
    private final /* synthetic */ Object zzd;
    private final /* synthetic */ Object zze;
    private final /* synthetic */ zzgo zzf;

    zzgn(zzgo zzgoVar, int i4, String str, Object obj, Object obj2, Object obj3) {
        this.zza = i4;
        this.zzb = str;
        this.zzc = obj;
        this.zzd = obj2;
        this.zze = obj3;
        this.zzf = zzgoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c5;
        long j4;
        char c6;
        long j5;
        zzha zzn = this.zzf.zzu.zzn();
        if (!zzn.zzaf()) {
            this.zzf.zza(6, ProtectedSandApp.s("\ude71"));
            return;
        }
        c5 = this.zzf.zza;
        if (c5 == 0) {
            if (this.zzf.zze().zzz()) {
                this.zzf.zza = 'C';
            } else {
                this.zzf.zza = 'c';
            }
        }
        j4 = this.zzf.zzb;
        if (j4 < 0) {
            this.zzf.zzb = 106000L;
        }
        char charAt = ProtectedSandApp.s("\ude72").charAt(this.zza);
        c6 = this.zzf.zza;
        j5 = this.zzf.zzb;
        String zza = zzgo.zza(true, this.zzb, this.zzc, this.zzd, this.zze);
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("\ude73"));
        sb.append(charAt);
        sb.append(c6);
        sb.append(j5);
        String a5 = c.a(sb, ProtectedSandApp.s("\ude74"), zza);
        if (a5.length() > 1024) {
            a5 = this.zzb.substring(0, 1024);
        }
        zzhe zzheVar = zzn.zzb;
        if (zzheVar != null) {
            zzheVar.zza(a5, 1L);
        }
    }
}
