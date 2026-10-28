package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes3.dex */
public final class zat implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {
    public final Api<?> zaa;
    private final boolean zab;

    @q0
    private zau zac;

    public zat(Api<?> api, boolean z5) {
        this.zaa = api;
        this.zab = z5;
    }

    private final zau zab() {
        Preconditions.checkNotNull(this.zac, ProtectedSandApp.s("∥"));
        return this.zac;
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(@q0 Bundle bundle) {
        zab().onConnected(bundle);
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(@o0 ConnectionResult connectionResult) {
        zab().zaa(connectionResult, this.zaa, this.zab);
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i5) {
        zab().onConnectionSuspended(i5);
    }

    public final void zaa(zau zauVar) {
        this.zac = zauVar;
    }
}
