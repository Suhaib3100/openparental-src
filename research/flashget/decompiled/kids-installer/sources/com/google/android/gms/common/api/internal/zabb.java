package com.google.android.gms.common.api.internal;

import android.content.Context;
import androidx.annotation.o0;
import com.google.android.gms.auth.api.signin.internal.Storage;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes3.dex */
final class zabb implements ResultCallback<Status> {
    final /* synthetic */ StatusPendingResult zaa;
    final /* synthetic */ boolean zab;
    final /* synthetic */ GoogleApiClient zac;
    final /* synthetic */ zabe zad;

    zabb(zabe zabeVar, StatusPendingResult statusPendingResult, boolean z5, GoogleApiClient googleApiClient) {
        this.zad = zabeVar;
        this.zaa = statusPendingResult;
        this.zab = z5;
        this.zac = googleApiClient;
    }

    @Override // com.google.android.gms.common.api.ResultCallback
    public final /* bridge */ /* synthetic */ void onResult(@o0 Status status) {
        Context context;
        Status status2 = status;
        context = this.zad.zan;
        Storage.getInstance(context).zac();
        if (status2.isSuccess() && this.zad.isConnected()) {
            zabe zabeVar = this.zad;
            zabeVar.disconnect();
            zabeVar.connect();
        }
        this.zaa.setResult(status2);
        if (this.zab) {
            this.zac.disconnect();
        }
    }
}
