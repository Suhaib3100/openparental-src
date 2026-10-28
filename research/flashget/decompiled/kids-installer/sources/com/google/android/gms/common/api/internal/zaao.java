package com.google.android.gms.common.api.internal;

import android.content.Context;
import androidx.annotation.n1;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes3.dex */
final class zaao extends zaav {
    final /* synthetic */ zaaw zaa;
    private final Map<Api.Client, zaal> zac;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zaao(zaaw zaawVar, Map<Api.Client, zaal> map) {
        super(zaawVar, null);
        this.zaa = zaawVar;
        this.zac = map;
    }

    @Override // com.google.android.gms.common.api.internal.zaav
    @n1
    @GuardedBy("mLock")
    public final void zaa() {
        GoogleApiAvailabilityLight googleApiAvailabilityLight;
        Context context;
        boolean z5;
        Context context2;
        zabi zabiVar;
        com.google.android.gms.signin.zae zaeVar;
        com.google.android.gms.signin.zae zaeVar2;
        zabi zabiVar2;
        Context context3;
        boolean z6;
        googleApiAvailabilityLight = this.zaa.zad;
        com.google.android.gms.common.internal.zal zalVar = new com.google.android.gms.common.internal.zal(googleApiAvailabilityLight);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Api.Client client : this.zac.keySet()) {
            if (client.requiresGooglePlayServices()) {
                z6 = this.zac.get(client).zac;
                if (!z6) {
                    arrayList.add(client);
                }
            }
            arrayList2.add(client);
        }
        int i5 = -1;
        int i6 = 0;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            while (i6 < size) {
                Api.Client client2 = (Api.Client) arrayList.get(i6);
                context = this.zaa.zac;
                i5 = zalVar.zab(context, client2);
                i6++;
                if (i5 != 0) {
                    break;
                }
            }
        } else {
            int size2 = arrayList2.size();
            while (i6 < size2) {
                Api.Client client3 = (Api.Client) arrayList2.get(i6);
                context3 = this.zaa.zac;
                i5 = zalVar.zab(context3, client3);
                i6++;
                if (i5 == 0) {
                    break;
                }
            }
        }
        if (i5 != 0) {
            ConnectionResult connectionResult = new ConnectionResult(i5, null);
            zaaw zaawVar = this.zaa;
            zabiVar2 = zaawVar.zaa;
            zabiVar2.zal(new zaam(this, zaawVar, connectionResult));
            return;
        }
        zaaw zaawVar2 = this.zaa;
        z5 = zaawVar2.zam;
        if (z5) {
            zaeVar = zaawVar2.zak;
            if (zaeVar != null) {
                zaeVar2 = zaawVar2.zak;
                zaeVar2.zab();
            }
        }
        for (Api.Client client4 : this.zac.keySet()) {
            zaal zaalVar = this.zac.get(client4);
            if (client4.requiresGooglePlayServices()) {
                context2 = this.zaa.zac;
                if (zalVar.zab(context2, client4) != 0) {
                    zaaw zaawVar3 = this.zaa;
                    zabiVar = zaawVar3.zaa;
                    zabiVar.zal(new zaan(this, zaawVar3, zaalVar));
                }
            }
            client4.connect(zaalVar);
        }
    }
}
