package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.n1;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzs {
    private final zzgd zza;

    public zzs(zzgd zzgdVar) {
        this.zza = zzgdVar;
    }

    @n1
    final void zza(String str, Bundle bundle) {
        String uri;
        this.zza.zzaB().zzg();
        if (this.zza.zzJ()) {
            return;
        }
        if (bundle.isEmpty()) {
            uri = null;
        } else {
            if (true == str.isEmpty()) {
                str = ProtectedSandApp.s("ᆔ");
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            uri = builder.build().toString();
        }
        if (TextUtils.isEmpty(uri)) {
            return;
        }
        this.zza.zzm().zzq.zzb(uri);
        this.zza.zzm().zzr.zzb(this.zza.zzax().currentTimeMillis());
    }

    @n1
    final void zzb() {
        this.zza.zzaB().zzg();
        if (zzd()) {
            boolean zze = zze();
            String s5 = ProtectedSandApp.s("ᆕ");
            if (zze) {
                this.zza.zzm().zzq.zzb(null);
                Bundle bundle = new Bundle();
                String s6 = ProtectedSandApp.s("ᆖ");
                String s7 = ProtectedSandApp.s("ᆗ");
                bundle.putString(s6, s7);
                bundle.putString(ProtectedSandApp.s("ᆘ"), s7);
                bundle.putString(ProtectedSandApp.s("ᆙ"), ProtectedSandApp.s("ᆚ"));
                bundle.putLong(s5, 1L);
                this.zza.zzq().zzG(ProtectedSandApp.s("ᆛ"), ProtectedSandApp.s("ᆜ"), bundle);
            } else {
                String zza = this.zza.zzm().zzq.zza();
                if (TextUtils.isEmpty(zza)) {
                    this.zza.zzaA().zzh().zza(ProtectedSandApp.s("ᆝ"));
                } else {
                    long zza2 = this.zza.zzm().zzr.zza() / 3600000;
                    Uri parse = Uri.parse(zza);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(parse.getPath(), bundle2);
                    for (String str : parse.getQueryParameterNames()) {
                        bundle2.putString(str, parse.getQueryParameter(str));
                    }
                    ((Bundle) pair.second).putLong(s5, (zza2 - 1) * 3600000);
                    Object obj = pair.first;
                    this.zza.zzq().zzG(obj == null ? ProtectedSandApp.s("ᆞ") : (String) obj, ProtectedSandApp.s("ᆟ"), (Bundle) pair.second);
                }
                this.zza.zzm().zzq.zzb(null);
            }
            this.zza.zzm().zzr.zzb(0L);
        }
    }

    final void zzc() {
        if (zzd() && zze()) {
            this.zza.zzm().zzq.zzb(null);
        }
    }

    final boolean zzd() {
        return this.zza.zzm().zzr.zza() > 0;
    }

    final boolean zze() {
        return zzd() && this.zza.zzax().currentTimeMillis() - this.zza.zzm().zzr.zza() > this.zza.zzf().zzi(null, zzeg.zzS);
    }
}
