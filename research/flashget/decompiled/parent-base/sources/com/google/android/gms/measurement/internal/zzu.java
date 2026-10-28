package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.n1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import org.apache.commons.lang3.time.e;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzu {
    private final zzhy zza;

    public zzu(zzhy zzhyVar) {
        this.zza = zzhyVar;
    }

    private final boolean zzc() {
        return this.zza.zzn().zzs.zza() > 0;
    }

    private final boolean zzd() {
        return zzc() && this.zza.zzb().currentTimeMillis() - this.zza.zzn().zzs.zza() > this.zza.zzf().zzc((String) null, zzbh.zzav);
    }

    @n1
    final void zza(String str, Bundle bundle) {
        String str2;
        this.zza.zzl().zzt();
        if (this.zza.zzac()) {
            return;
        }
        if (bundle == null || bundle.isEmpty()) {
            str2 = null;
        } else {
            if (str == null || str.isEmpty()) {
                str = ProtectedSandApp.s("\ue4ae");
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str3 : bundle.keySet()) {
                builder.appendQueryParameter(str3, bundle.getString(str3));
            }
            str2 = builder.build().toString();
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.zza.zzn().zzr.zza(str2);
        this.zza.zzn().zzs.zza(this.zza.zzb().currentTimeMillis());
    }

    final void zzb() {
        if (zzc() && zzd()) {
            this.zza.zzn().zzr.zza(null);
        }
    }

    @n1
    final void zza() {
        String str;
        this.zza.zzl().zzt();
        if (zzc()) {
            boolean zzd = zzd();
            String s4 = ProtectedSandApp.s("\ue4a8");
            if (zzd) {
                this.zza.zzn().zzr.zza(null);
                Bundle bundle = new Bundle();
                String s5 = ProtectedSandApp.s("\ue4a9");
                String s6 = ProtectedSandApp.s("\ue4aa");
                bundle.putString(s5, s6);
                bundle.putString(ProtectedSandApp.s("\ue4ab"), s6);
                bundle.putString(ProtectedSandApp.s("\ue4ac"), ProtectedSandApp.s("\ue4ad"));
                bundle.putLong(s4, 1L);
                this.zza.zzp().zzc(ProtectedSandApp.s("\ue4ae"), ProtectedSandApp.s("\ue4af"), bundle);
            } else {
                String zza = this.zza.zzn().zzr.zza();
                if (TextUtils.isEmpty(zza)) {
                    this.zza.zzj().zzn().zza(ProtectedSandApp.s("\ue4b0"));
                } else {
                    long zza2 = ((this.zza.zzn().zzs.zza() / e.f86241c) - 1) * e.f86241c;
                    Uri parse = Uri.parse(zza);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(parse.getPath(), bundle2);
                    for (String str2 : parse.getQueryParameterNames()) {
                        bundle2.putString(str2, parse.getQueryParameter(str2));
                    }
                    ((Bundle) pair.second).putLong(s4, zza2);
                    Object obj = pair.first;
                    if (obj == null) {
                        str = ProtectedSandApp.s("\ue4b1");
                    } else {
                        str = (String) obj;
                    }
                    this.zza.zzp().zzc(str, ProtectedSandApp.s("\ue4b2"), (Bundle) pair.second);
                }
                this.zza.zzn().zzr.zza(null);
            }
            this.zza.zzn().zzs.zza(0L);
        }
    }
}
