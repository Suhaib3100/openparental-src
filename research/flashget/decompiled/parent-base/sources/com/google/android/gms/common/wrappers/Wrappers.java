package com.google.android.gms.common.wrappers;

import android.content.Context;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
@KeepForSdk
/* loaded from: classes5.dex */
public class Wrappers {
    private static final Wrappers zzb = new Wrappers();

    @q0
    private PackageManagerWrapper zza = null;

    @o0
    @KeepForSdk
    public static PackageManagerWrapper packageManager(@o0 Context context) {
        return zzb.zza(context);
    }

    @o0
    @m1
    public final synchronized PackageManagerWrapper zza(@o0 Context context) {
        try {
            if (this.zza == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                this.zza = new PackageManagerWrapper(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.zza;
    }
}
