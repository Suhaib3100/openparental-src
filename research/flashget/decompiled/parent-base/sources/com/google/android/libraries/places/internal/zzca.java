package com.google.android.libraries.places.internal;

import androidx.annotation.q0;
import com.google.android.gms.tasks.CancellationToken;
import java.util.Map;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public abstract class zzca {
    private final zzen zza;

    protected zzca(zzen zzenVar) {
        this.zza = zzenVar;
    }

    @q0
    protected final CancellationToken zza() {
        return this.zza.getCancellationToken();
    }

    protected final zzen zzb() {
        return this.zza;
    }

    protected abstract String zzc();

    protected abstract Map zzd();
}
