package com.google.android.gms.common.api;

import android.text.TextUtils;
import androidx.annotation.o0;
import androidx.collection.a;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes2.dex */
public class AvailabilityException extends Exception {
    private final a<ApiKey<?>, ConnectionResult> zaa;

    public AvailabilityException(@o0 a<ApiKey<?>, ConnectionResult> aVar) {
        this.zaa = aVar;
    }

    @o0
    public ConnectionResult getConnectionResult(@o0 GoogleApi<? extends Api.ApiOptions> googleApi) {
        ApiKey<? extends Api.ApiOptions> apiKey = googleApi.getApiKey();
        boolean z5 = this.zaa.get(apiKey) != null;
        String zab = apiKey.zab();
        StringBuilder sb = new StringBuilder(String.valueOf(zab).length() + 58);
        sb.append(ProtectedSandApp.s("ઁ"));
        sb.append(zab);
        sb.append(ProtectedSandApp.s("ં"));
        Preconditions.checkArgument(z5, sb.toString());
        return (ConnectionResult) Preconditions.checkNotNull(this.zaa.get(apiKey));
    }

    @Override // java.lang.Throwable
    @o0
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z5 = true;
        for (ApiKey<?> apiKey : this.zaa.keySet()) {
            ConnectionResult connectionResult = (ConnectionResult) Preconditions.checkNotNull(this.zaa.get(apiKey));
            z5 &= !connectionResult.isSuccess();
            String zab = apiKey.zab();
            String valueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder(String.valueOf(zab).length() + 2 + valueOf.length());
            sb.append(zab);
            sb.append(ProtectedSandApp.s("અ"));
            sb.append(valueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        if (z5) {
            sb2.append(ProtectedSandApp.s("આ"));
        } else {
            sb2.append(ProtectedSandApp.s("ઇ"));
        }
        sb2.append(TextUtils.join(ProtectedSandApp.s("ઈ"), arrayList));
        return sb2.toString();
    }

    @o0
    public ConnectionResult getConnectionResult(@o0 HasApiKey<? extends Api.ApiOptions> hasApiKey) {
        ApiKey<? extends Api.ApiOptions> apiKey = hasApiKey.getApiKey();
        boolean z5 = this.zaa.get(apiKey) != null;
        String zab = apiKey.zab();
        StringBuilder sb = new StringBuilder(String.valueOf(zab).length() + 58);
        sb.append(ProtectedSandApp.s("ઃ"));
        sb.append(zab);
        sb.append(ProtectedSandApp.s("\u0a84"));
        Preconditions.checkArgument(z5, sb.toString());
        return (ConnectionResult) Preconditions.checkNotNull(this.zaa.get(apiKey));
    }
}
