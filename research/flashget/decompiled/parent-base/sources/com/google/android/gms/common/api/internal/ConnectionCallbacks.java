package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.q0;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
@KeepForSdk
/* loaded from: classes5.dex */
public interface ConnectionCallbacks {
    @ShowFirstParty
    @KeepForSdk
    void onConnected(@q0 Bundle bundle);

    @ShowFirstParty
    @KeepForSdk
    void onConnectionSuspended(int i4);
}
