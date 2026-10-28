package com.google.android.gms.common.internal;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes3.dex */
public abstract class DowngradeableSafeParcel extends AbstractSafeParcelable implements ReflectedParcelable {
    private static final Object zza = new Object();
    private boolean zzb = false;

    @KeepForSdk
    protected static boolean canUnparcelSafely(@o0 String str) {
        synchronized (zza) {
        }
        return true;
    }

    @q0
    @KeepForSdk
    protected static Integer getUnparcelClientVersion() {
        synchronized (zza) {
        }
        return null;
    }

    @KeepForSdk
    protected abstract boolean prepareForClientVersion(int i5);

    @KeepForSdk
    public void setShouldDowngrade(boolean z5) {
        this.zzb = z5;
    }

    @KeepForSdk
    protected boolean shouldDowngrade() {
        return this.zzb;
    }
}
