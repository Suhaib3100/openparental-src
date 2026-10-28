package com.google.android.gms.common.api;

import android.support.v4.media.d;
import android.text.TextUtils;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes5.dex */
public class AvailabilityException extends Exception {
    private final androidx.collection.a zaa;

    public AvailabilityException(@o0 androidx.collection.a aVar) {
        this.zaa = aVar;
    }

    @o0
    public ConnectionResult getConnectionResult(@o0 GoogleApi<? extends Api.ApiOptions> googleApi) {
        androidx.collection.a aVar = this.zaa;
        ApiKey<? extends Api.ApiOptions> apiKey = googleApi.getApiKey();
        Object obj = aVar.get(apiKey);
        Preconditions.checkArgument(obj != null, d.a(ProtectedSandApp.s("즧"), apiKey.zaa(), ProtectedSandApp.s("즨")));
        return (ConnectionResult) Preconditions.checkNotNull((ConnectionResult) this.zaa.get(apiKey));
    }

    @Override // java.lang.Throwable
    @o0
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z4 = true;
        for (ApiKey apiKey : this.zaa.keySet()) {
            ConnectionResult connectionResult = (ConnectionResult) Preconditions.checkNotNull((ConnectionResult) this.zaa.get(apiKey));
            z4 &= !connectionResult.isSuccess();
            arrayList.add(apiKey.zaa() + ProtectedSandApp.s("즩") + String.valueOf(connectionResult));
        }
        StringBuilder sb = new StringBuilder();
        if (z4) {
            sb.append(ProtectedSandApp.s("즪"));
        } else {
            sb.append(ProtectedSandApp.s("즫"));
        }
        sb.append(TextUtils.join(ProtectedSandApp.s("즬"), arrayList));
        return sb.toString();
    }

    @o0
    public ConnectionResult getConnectionResult(@o0 HasApiKey<? extends Api.ApiOptions> hasApiKey) {
        androidx.collection.a aVar = this.zaa;
        ApiKey<? extends Api.ApiOptions> apiKey = hasApiKey.getApiKey();
        Object obj = aVar.get(apiKey);
        Preconditions.checkArgument(obj != null, d.a(ProtectedSandApp.s("즧"), apiKey.zaa(), ProtectedSandApp.s("즨")));
        return (ConnectionResult) Preconditions.checkNotNull((ConnectionResult) this.zaa.get(apiKey));
    }
}
