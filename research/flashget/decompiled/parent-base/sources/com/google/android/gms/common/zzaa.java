package com.google.android.gms.common;

import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.common.zzah;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes5.dex */
final class zzaa {

    @q0
    private String zza = null;
    private long zzb = -1;
    private zzah zzc = zzah.zzj();
    private zzah zzd = zzah.zzj();

    zzaa() {
    }

    final zzaa zza(String str) {
        this.zza = str;
        return this;
    }

    final zzaa zzb(long j4) {
        this.zzb = j4;
        return this;
    }

    final zzaa zzc(List list) {
        Preconditions.checkNotNull(list);
        this.zzc = zzah.zzp(list);
        return this;
    }

    final zzaa zzd(List list) {
        Preconditions.checkNotNull(list);
        this.zzd = zzah.zzp(list);
        return this;
    }

    final zzab zze() {
        if (this.zza == null) {
            throw new IllegalStateException(ProtectedSandApp.s("찱"));
        }
        if (this.zzb < 0) {
            throw new IllegalStateException(ProtectedSandApp.s("찰"));
        }
        if (this.zzc.isEmpty() && this.zzd.isEmpty()) {
            throw new IllegalStateException(ProtectedSandApp.s("찯"));
        }
        return new zzab(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
