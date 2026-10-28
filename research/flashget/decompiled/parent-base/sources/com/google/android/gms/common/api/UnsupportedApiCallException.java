package com.google.android.gms.common.api;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes5.dex */
public final class UnsupportedApiCallException extends UnsupportedOperationException {
    private final Feature zza;

    @KeepForSdk
    public UnsupportedApiCallException(@o0 Feature feature) {
        this.zza = feature;
    }

    @Override // java.lang.Throwable
    @o0
    public String getMessage() {
        return ProtectedSandApp.s("짜").concat(String.valueOf(this.zza));
    }
}
