package com.google.android.gms.common.api.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.api.Api;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes2.dex */
final class zabo implements Runnable {
    final /* synthetic */ zabp zaa;

    zabo(zabp zabpVar) {
        this.zaa = zabpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Api.Client client;
        Api.Client client2;
        zabq zabqVar = this.zaa.zaa;
        client = zabqVar.zac;
        client2 = zabqVar.zac;
        client.disconnect(client2.getClass().getName().concat(ProtectedSandApp.s("ଈ")));
    }
}
