package com.google.android.gms.auth.api.signin.internal;

import android.content.Intent;
import android.os.Bundle;
import androidx.loader.app.a;
import androidx.loader.content.c;
import com.google.android.gms.common.api.GoogleApiClient;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* loaded from: classes5.dex */
final class zbw implements a.InterfaceC0505a {
    final /* synthetic */ SignInHubActivity zba;

    /* synthetic */ zbw(SignInHubActivity signInHubActivity, zbv zbvVar) {
        this.zba = signInHubActivity;
    }

    @Override // androidx.loader.app.a.InterfaceC0505a
    public final c onCreateLoader(int i4, Bundle bundle) {
        return new zbc(this.zba, GoogleApiClient.getAllClients());
    }

    @Override // androidx.loader.app.a.InterfaceC0505a
    public final /* bridge */ /* synthetic */ void onLoadFinished(c cVar, Object obj) {
        int i4;
        Intent intent;
        SignInHubActivity signInHubActivity = this.zba;
        i4 = signInHubActivity.zbe;
        intent = signInHubActivity.zbf;
        signInHubActivity.setResult(i4, intent);
        this.zba.finish();
    }

    @Override // androidx.loader.app.a.InterfaceC0505a
    public final void onLoaderReset(c cVar) {
    }
}
