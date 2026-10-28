package com.google.android.gms.common.wrappers;

import android.content.Context;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public class Wrappers {
    private static Wrappers zza = new Wrappers();

    @q0
    private PackageManagerWrapper zzb = null;

    @o0
    @KeepForSdk
    public static PackageManagerWrapper packageManager(@o0 Context context) {
        return zza.zza(context);
    }

    @VisibleForTesting
    @o0
    public final synchronized PackageManagerWrapper zza(@o0 Context context) {
        if (this.zzb == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.zzb = new PackageManagerWrapper(context);
        }
        return this.zzb;
    }
}
