package com.google.android.gms.common;

import android.content.Intent;
import androidx.annotation.o0;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes5.dex */
public class GooglePlayServicesRepairableException extends UserRecoverableException {
    private final int zza;

    public GooglePlayServicesRepairableException(int i4, @o0 String str, @o0 Intent intent) {
        super(str, intent);
        this.zza = i4;
    }

    public int getConnectionStatusCode() {
        return this.zza;
    }
}
