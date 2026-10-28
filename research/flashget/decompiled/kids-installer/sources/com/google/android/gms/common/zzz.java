package com.google.android.gms.common;

import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.common.zzag;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
final class zzz {

    @q0
    private String zza = null;
    private long zzb = -1;
    private zzag zzc = zzag.zzl();
    private zzag zzd = zzag.zzl();

    zzz() {
    }

    @x1.a
    final zzz zza(long j5) {
        this.zzb = j5;
        return this;
    }

    @x1.a
    final zzz zzb(List list) {
        Preconditions.checkNotNull(list);
        this.zzd = zzag.zzk(list);
        return this;
    }

    @x1.a
    final zzz zzc(List list) {
        Preconditions.checkNotNull(list);
        this.zzc = zzag.zzk(list);
        return this;
    }

    @x1.a
    final zzz zzd(String str) {
        this.zza = str;
        return this;
    }

    final zzab zze() {
        if (this.zza == null) {
            throw new IllegalStateException(ProtectedSandApp.s("ಮ"));
        }
        if (this.zzb < 0) {
            throw new IllegalStateException(ProtectedSandApp.s("ಭ"));
        }
        if (this.zzc.isEmpty() && this.zzd.isEmpty()) {
            throw new IllegalStateException(ProtectedSandApp.s("ಬ"));
        }
        return new zzab(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
