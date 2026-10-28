package com.google.android.gms.measurement.internal;

import android.content.Context;
import androidx.annotation.m1;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
@m1
/* loaded from: classes2.dex */
public final class zzli {
    final Context zza;

    @m1
    public zzli(Context context) {
        Preconditions.checkNotNull(context);
        Context applicationContext = context.getApplicationContext();
        Preconditions.checkNotNull(applicationContext);
        this.zza = applicationContext;
    }
}
