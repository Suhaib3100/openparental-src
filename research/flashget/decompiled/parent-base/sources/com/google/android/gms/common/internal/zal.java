package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import androidx.annotation.o0;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes5.dex */
public final class zal {
    private final SparseIntArray zaa;
    private GoogleApiAvailabilityLight zab;

    public zal() {
        this(GoogleApiAvailability.getInstance());
    }

    public final int zaa(Context context, int i4) {
        return this.zaa.get(i4, -1);
    }

    @ResultIgnorabilityUnspecified
    public final int zab(@o0 Context context, @o0 Api.Client client) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(client);
        int i4 = 0;
        if (!client.requiresGooglePlayServices()) {
            return 0;
        }
        int minApkVersion = client.getMinApkVersion();
        int zaa = zaa(context, minApkVersion);
        if (zaa == -1) {
            int i5 = 0;
            while (true) {
                if (i5 >= this.zaa.size()) {
                    i4 = -1;
                    break;
                }
                int keyAt = this.zaa.keyAt(i5);
                if (keyAt > minApkVersion && this.zaa.get(keyAt) == 0) {
                    break;
                }
                i5++;
            }
            zaa = i4 == -1 ? this.zab.isGooglePlayServicesAvailable(context, minApkVersion) : i4;
            this.zaa.put(minApkVersion, zaa);
        }
        return zaa;
    }

    public final void zac() {
        this.zaa.clear();
    }

    public zal(@o0 GoogleApiAvailabilityLight googleApiAvailabilityLight) {
        this.zaa = new SparseIntArray();
        Preconditions.checkNotNull(googleApiAvailabilityLight);
        this.zab = googleApiAvailabilityLight;
    }
}
