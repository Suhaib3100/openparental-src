package com.google.android.gms.common.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes5.dex */
public final class zzaf extends Exception {
    public final ConnectionResult zza;

    public zzaf(ConnectionResult connectionResult) {
        Preconditions.checkArgument(connectionResult.hasResolution(), ProtectedSandApp.s("쭇"));
        this.zza = connectionResult;
    }
}
