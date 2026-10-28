package com.google.android.gms.common.api.internal;

import android.util.Log;
import androidx.annotation.n1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes3.dex */
final class zabu implements BaseGmsClient.ConnectionProgressReportCallbacks, zacs {
    final /* synthetic */ GoogleApiManager zaa;
    private final Api.Client zab;
    private final ApiKey<?> zac;

    @q0
    private IAccountAccessor zad = null;

    @q0
    private Set<Scope> zae = null;
    private boolean zaf = false;

    public zabu(GoogleApiManager googleApiManager, Api.Client client, ApiKey<?> apiKey) {
        this.zaa = googleApiManager;
        this.zab = client;
        this.zac = apiKey;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @n1
    public final void zag() {
        IAccountAccessor iAccountAccessor;
        if (!this.zaf || (iAccountAccessor = this.zad) == null) {
            return;
        }
        this.zab.getRemoteService(iAccountAccessor, this.zae);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
    public final void onReportServiceBinding(@o0 ConnectionResult connectionResult) {
        this.zaa.zat.post(new zabt(this, connectionResult));
    }

    @Override // com.google.android.gms.common.api.internal.zacs
    @n1
    public final void zae(ConnectionResult connectionResult) {
        Map map;
        map = this.zaa.zap;
        zabq zabqVar = (zabq) map.get(this.zac);
        if (zabqVar != null) {
            zabqVar.zas(connectionResult);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zacs
    @n1
    public final void zaf(@q0 IAccountAccessor iAccountAccessor, @q0 Set<Scope> set) {
        if (iAccountAccessor == null || set == null) {
            Log.wtf(ProtectedSandApp.s("⇻"), ProtectedSandApp.s("⇼"), new Exception());
            zae(new ConnectionResult(4));
        } else {
            this.zad = iAccountAccessor;
            this.zae = set;
            zag();
        }
    }
}
