package com.google.android.gms.measurement.internal;

import android.content.Context;
import androidx.annotation.m1;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
@m1
/* loaded from: classes5.dex */
public final class zzok {
    final Context zza;

    @m1
    public zzok(Context context) {
        Preconditions.checkNotNull(context);
        Context applicationContext = context.getApplicationContext();
        Preconditions.checkNotNull(applicationContext);
        this.zza = applicationContext;
    }
}
