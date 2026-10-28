package com.google.android.gms.auth;

import android.content.Intent;
import androidx.annotation.q0;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes5.dex */
public class GooglePlayServicesAvailabilityException extends UserRecoverableAuthException {
    private final int zza;

    GooglePlayServicesAvailabilityException(int i4, @q0 String str, @q0 Intent intent) {
        super(str, intent);
        this.zza = i4;
    }

    public int getConnectionStatusCode() {
        return this.zza;
    }
}
