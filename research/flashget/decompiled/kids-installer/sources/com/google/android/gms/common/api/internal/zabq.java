package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import androidx.annotation.n1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.collection.a;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes4.dex */
public final class zabq<O extends Api.ApiOptions> implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener, zau {
    final /* synthetic */ GoogleApiManager zaa;

    @NotOnlyInitialized
    private final Api.Client zac;
    private final ApiKey<O> zad;
    private final zaad zae;
    private final int zah;

    @q0
    private final zact zai;
    private boolean zaj;
    private final Queue<zai> zab = new LinkedList();
    private final Set<zal> zaf = new HashSet();
    private final Map<ListenerHolder.ListenerKey<?>, zaci> zag = new HashMap();
    private final List<zabs> zak = new ArrayList();

    @q0
    private ConnectionResult zal = null;
    private int zam = 0;

    @n1
    public zabq(GoogleApiManager googleApiManager, GoogleApi<O> googleApi) {
        this.zaa = googleApiManager;
        Api.Client zab = googleApi.zab(googleApiManager.zat.getLooper(), this);
        this.zac = zab;
        this.zad = googleApi.getApiKey();
        this.zae = new zaad();
        this.zah = googleApi.zaa();
        if (zab.requiresSignIn()) {
            this.zai = googleApi.zac(googleApiManager.zak, googleApiManager.zat);
        } else {
            this.zai = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n1
    @q0
    private final Feature zaB(@q0 Feature[] featureArr) {
        if (featureArr != null && featureArr.length != 0) {
            Feature[] availableFeatures = this.zac.getAvailableFeatures();
            if (availableFeatures == null) {
                availableFeatures = new Feature[0];
            }
            a aVar = new a(availableFeatures.length);
            for (Feature feature : availableFeatures) {
                aVar.put(feature.getName(), Long.valueOf(feature.getVersion()));
            }
            for (Feature feature2 : featureArr) {
                Long l5 = (Long) aVar.getOrDefault(feature2.getName(), null);
                if (l5 == null || l5.longValue() < feature2.getVersion()) {
                    return feature2;
                }
            }
        }
        return null;
    }

    @n1
    private final void zaC(ConnectionResult connectionResult) {
        Iterator<zal> it = this.zaf.iterator();
        while (it.hasNext()) {
            it.next().zac(this.zad, connectionResult, Objects.equal(connectionResult, ConnectionResult.RESULT_SUCCESS) ? this.zac.getEndpointPackageName() : null);
        }
        this.zaf.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @n1
    public final void zaD(Status status) {
        Preconditions.checkHandlerThread(this.zaa.zat);
        zaE(status, null, false);
    }

    @n1
    private final void zaE(@q0 Status status, @q0 Exception exc, boolean z5) {
        Preconditions.checkHandlerThread(this.zaa.zat);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ⵔ"));
        }
        Iterator<zai> it = this.zab.iterator();
        while (it.hasNext()) {
            zai next = it.next();
            if (!z5 || next.zac == 2) {
                if (status != null) {
                    next.zad(status);
                } else {
                    next.zae(exc);
                }
                it.remove();
            }
        }
    }

    @n1
    private final void zaF() {
        ArrayList arrayList = new ArrayList(this.zab);
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            zai zaiVar = (zai) arrayList.get(i5);
            if (!this.zac.isConnected()) {
                return;
            }
            if (zaL(zaiVar)) {
                this.zab.remove(zaiVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @n1
    public final void zaG() {
        zan();
        zaC(ConnectionResult.RESULT_SUCCESS);
        zaK();
        Iterator<zaci> it = this.zag.values().iterator();
        while (it.hasNext()) {
            zaci next = it.next();
            if (zaB(next.zaa.getRequiredFeatures()) != null) {
                it.remove();
            } else {
                try {
                    next.zaa.registerListener(this.zac, new TaskCompletionSource<>());
                } catch (DeadObjectException unused) {
                    onConnectionSuspended(3);
                    this.zac.disconnect(ProtectedSandApp.s("ⵕ"));
                } catch (RemoteException unused2) {
                    it.remove();
                }
            }
        }
        zaF();
        zaI();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @n1
    public final void zaH(int i5) {
        zan();
        this.zaj = true;
        this.zae.zae(i5, this.zac.getLastDisconnectMessage());
        GoogleApiManager googleApiManager = this.zaa;
        googleApiManager.zat.sendMessageDelayed(Message.obtain(googleApiManager.zat, 9, this.zad), this.zaa.zae);
        GoogleApiManager googleApiManager2 = this.zaa;
        googleApiManager2.zat.sendMessageDelayed(Message.obtain(googleApiManager2.zat, 11, this.zad), this.zaa.zaf);
        this.zaa.zam.zac();
        Iterator<zaci> it = this.zag.values().iterator();
        while (it.hasNext()) {
            it.next().zac.run();
        }
    }

    private final void zaI() {
        this.zaa.zat.removeMessages(12, this.zad);
        GoogleApiManager googleApiManager = this.zaa;
        googleApiManager.zat.sendMessageDelayed(googleApiManager.zat.obtainMessage(12, this.zad), this.zaa.zag);
    }

    @n1
    private final void zaJ(zai zaiVar) {
        zaiVar.zag(this.zae, zaz());
        try {
            zaiVar.zaf(this);
        } catch (DeadObjectException unused) {
            onConnectionSuspended(1);
            this.zac.disconnect(ProtectedSandApp.s("ⵖ"));
        }
    }

    @n1
    private final void zaK() {
        if (this.zaj) {
            this.zaa.zat.removeMessages(11, this.zad);
            this.zaa.zat.removeMessages(9, this.zad);
            this.zaj = false;
        }
    }

    @n1
    private final boolean zaL(zai zaiVar) {
        if (!(zaiVar instanceof zac)) {
            zaJ(zaiVar);
            return true;
        }
        zac zacVar = (zac) zaiVar;
        Feature zaB = zaB(zacVar.zab(this));
        if (zaB == null) {
            zaJ(zaiVar);
            return true;
        }
        String name = this.zac.getClass().getName();
        String name2 = zaB.getName();
        zaB.getVersion();
        new StringBuilder(name.length() + 77 + String.valueOf(name2).length());
        if (!this.zaa.zau || !zacVar.zaa(this)) {
            zacVar.zae(new UnsupportedApiCallException(zaB));
            return true;
        }
        zabs zabsVar = new zabs(this.zad, zaB, null);
        int indexOf = this.zak.indexOf(zabsVar);
        if (indexOf >= 0) {
            zabs zabsVar2 = this.zak.get(indexOf);
            this.zaa.zat.removeMessages(15, zabsVar2);
            GoogleApiManager googleApiManager = this.zaa;
            googleApiManager.zat.sendMessageDelayed(Message.obtain(googleApiManager.zat, 15, zabsVar2), this.zaa.zae);
            return false;
        }
        this.zak.add(zabsVar);
        GoogleApiManager googleApiManager2 = this.zaa;
        googleApiManager2.zat.sendMessageDelayed(Message.obtain(googleApiManager2.zat, 15, zabsVar), this.zaa.zae);
        GoogleApiManager googleApiManager3 = this.zaa;
        googleApiManager3.zat.sendMessageDelayed(Message.obtain(googleApiManager3.zat, 16, zabsVar), this.zaa.zaf);
        ConnectionResult connectionResult = new ConnectionResult(2, null);
        if (zaM(connectionResult)) {
            return false;
        }
        this.zaa.zaG(connectionResult, this.zah);
        return false;
    }

    @n1
    private final boolean zaM(@o0 ConnectionResult connectionResult) {
        synchronized (GoogleApiManager.zac) {
            GoogleApiManager googleApiManager = this.zaa;
            if (googleApiManager.zaq == null || !googleApiManager.zar.contains(this.zad)) {
                return false;
            }
            this.zaa.zaq.zah(connectionResult, this.zah);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @n1
    public final boolean zaN(boolean z5) {
        Preconditions.checkHandlerThread(this.zaa.zat);
        if (!this.zac.isConnected() || this.zag.size() != 0) {
            return false;
        }
        if (!this.zae.zag()) {
            this.zac.disconnect(ProtectedSandApp.s("ⵗ"));
            return true;
        }
        if (z5) {
            zaI();
        }
        return false;
    }

    static /* bridge */ /* synthetic */ void zal(zabq zabqVar, zabs zabsVar) {
        if (zabqVar.zak.contains(zabsVar) && !zabqVar.zaj) {
            if (zabqVar.zac.isConnected()) {
                zabqVar.zaF();
            } else {
                zabqVar.zao();
            }
        }
    }

    static /* bridge */ /* synthetic */ void zam(zabq zabqVar, zabs zabsVar) {
        Feature feature;
        Feature[] zab;
        if (zabqVar.zak.remove(zabsVar)) {
            zabqVar.zaa.zat.removeMessages(15, zabsVar);
            zabqVar.zaa.zat.removeMessages(16, zabsVar);
            feature = zabsVar.zab;
            ArrayList arrayList = new ArrayList(zabqVar.zab.size());
            for (zai zaiVar : zabqVar.zab) {
                if ((zaiVar instanceof zac) && (zab = ((zac) zaiVar).zab(zabqVar)) != null && ArrayUtils.contains(zab, feature)) {
                    arrayList.add(zaiVar);
                }
            }
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                zai zaiVar2 = (zai) arrayList.get(i5);
                zabqVar.zab.remove(zaiVar2);
                zaiVar2.zae(new UnsupportedApiCallException(feature));
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(@q0 Bundle bundle) {
        if (Looper.myLooper() == this.zaa.zat.getLooper()) {
            zaG();
        } else {
            this.zaa.zat.post(new zabm(this));
        }
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    @n1
    public final void onConnectionFailed(@o0 ConnectionResult connectionResult) {
        zar(connectionResult, null);
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i5) {
        if (Looper.myLooper() == this.zaa.zat.getLooper()) {
            zaH(i5);
        } else {
            this.zaa.zat.post(new zabn(this, i5));
        }
    }

    @n1
    public final boolean zaA() {
        return zaN(true);
    }

    @Override // com.google.android.gms.common.api.internal.zau
    public final void zaa(ConnectionResult connectionResult, Api<?> api, boolean z5) {
        throw null;
    }

    public final int zab() {
        return this.zah;
    }

    @n1
    final int zac() {
        return this.zam;
    }

    @n1
    @q0
    public final ConnectionResult zad() {
        Preconditions.checkHandlerThread(this.zaa.zat);
        return this.zal;
    }

    public final Api.Client zaf() {
        return this.zac;
    }

    public final Map<ListenerHolder.ListenerKey<?>, zaci> zah() {
        return this.zag;
    }

    @n1
    public final void zan() {
        Preconditions.checkHandlerThread(this.zaa.zat);
        this.zal = null;
    }

    @n1
    public final void zao() {
        Preconditions.checkHandlerThread(this.zaa.zat);
        if (this.zac.isConnected() || this.zac.isConnecting()) {
            return;
        }
        try {
            GoogleApiManager googleApiManager = this.zaa;
            int zab = googleApiManager.zam.zab(googleApiManager.zak, this.zac);
            if (zab != 0) {
                ConnectionResult connectionResult = new ConnectionResult(zab, null);
                new StringBuilder(this.zac.getClass().getName().length() + 35 + connectionResult.toString().length());
                zar(connectionResult, null);
                return;
            }
            GoogleApiManager googleApiManager2 = this.zaa;
            Api.Client client = this.zac;
            zabu zabuVar = new zabu(googleApiManager2, client, this.zad);
            if (client.requiresSignIn()) {
                ((zact) Preconditions.checkNotNull(this.zai)).zae(zabuVar);
            }
            try {
                this.zac.connect(zabuVar);
            } catch (SecurityException e6) {
                zar(new ConnectionResult(10), e6);
            }
        } catch (IllegalStateException e7) {
            zar(new ConnectionResult(10), e7);
        }
    }

    @n1
    public final void zap(zai zaiVar) {
        Preconditions.checkHandlerThread(this.zaa.zat);
        if (this.zac.isConnected()) {
            if (zaL(zaiVar)) {
                zaI();
                return;
            } else {
                this.zab.add(zaiVar);
                return;
            }
        }
        this.zab.add(zaiVar);
        ConnectionResult connectionResult = this.zal;
        if (connectionResult == null || !connectionResult.hasResolution()) {
            zao();
        } else {
            zar(this.zal, null);
        }
    }

    @n1
    final void zaq() {
        this.zam++;
    }

    @n1
    public final void zar(@o0 ConnectionResult connectionResult, @q0 Exception exc) {
        Preconditions.checkHandlerThread(this.zaa.zat);
        zact zactVar = this.zai;
        if (zactVar != null) {
            zactVar.zaf();
        }
        zan();
        this.zaa.zam.zac();
        zaC(connectionResult);
        if ((this.zac instanceof com.google.android.gms.common.internal.service.zap) && connectionResult.getErrorCode() != 24) {
            this.zaa.zah = true;
            GoogleApiManager googleApiManager = this.zaa;
            googleApiManager.zat.sendMessageDelayed(googleApiManager.zat.obtainMessage(19), 300000L);
        }
        if (connectionResult.getErrorCode() == 4) {
            zaD(GoogleApiManager.zab);
            return;
        }
        if (this.zab.isEmpty()) {
            this.zal = connectionResult;
            return;
        }
        if (exc != null) {
            Preconditions.checkHandlerThread(this.zaa.zat);
            zaE(null, exc, false);
            return;
        }
        if (!this.zaa.zau) {
            zaD(GoogleApiManager.zaH(this.zad, connectionResult));
            return;
        }
        zaE(GoogleApiManager.zaH(this.zad, connectionResult), null, true);
        if (this.zab.isEmpty() || zaM(connectionResult) || this.zaa.zaG(connectionResult, this.zah)) {
            return;
        }
        if (connectionResult.getErrorCode() == 18) {
            this.zaj = true;
        }
        if (!this.zaj) {
            zaD(GoogleApiManager.zaH(this.zad, connectionResult));
        } else {
            GoogleApiManager googleApiManager2 = this.zaa;
            googleApiManager2.zat.sendMessageDelayed(Message.obtain(googleApiManager2.zat, 9, this.zad), this.zaa.zae);
        }
    }

    @n1
    public final void zas(@o0 ConnectionResult connectionResult) {
        Preconditions.checkHandlerThread(this.zaa.zat);
        Api.Client client = this.zac;
        String name = client.getClass().getName();
        String valueOf = String.valueOf(connectionResult);
        StringBuilder sb = new StringBuilder(name.length() + 25 + valueOf.length());
        sb.append(ProtectedSandApp.s("ⵘ"));
        sb.append(name);
        sb.append(ProtectedSandApp.s("ⵙ"));
        sb.append(valueOf);
        client.disconnect(sb.toString());
        zar(connectionResult, null);
    }

    @n1
    public final void zat(zal zalVar) {
        Preconditions.checkHandlerThread(this.zaa.zat);
        this.zaf.add(zalVar);
    }

    @n1
    public final void zau() {
        Preconditions.checkHandlerThread(this.zaa.zat);
        if (this.zaj) {
            zao();
        }
    }

    @n1
    public final void zav() {
        Preconditions.checkHandlerThread(this.zaa.zat);
        zaD(GoogleApiManager.zaa);
        this.zae.zaf();
        for (ListenerHolder.ListenerKey listenerKey : (ListenerHolder.ListenerKey[]) this.zag.keySet().toArray(new ListenerHolder.ListenerKey[0])) {
            zap(new zah(listenerKey, new TaskCompletionSource()));
        }
        zaC(new ConnectionResult(4));
        if (this.zac.isConnected()) {
            this.zac.onUserSignOut(new zabp(this));
        }
    }

    @n1
    public final void zaw() {
        Preconditions.checkHandlerThread(this.zaa.zat);
        if (this.zaj) {
            zaK();
            GoogleApiManager googleApiManager = this.zaa;
            zaD(googleApiManager.zal.isGooglePlayServicesAvailable(googleApiManager.zak) == 18 ? new Status(21, ProtectedSandApp.s("ⵚ")) : new Status(22, ProtectedSandApp.s("ⵛ")));
            this.zac.disconnect(ProtectedSandApp.s("ⵜ"));
        }
    }

    final boolean zay() {
        return this.zac.isConnected();
    }

    public final boolean zaz() {
        return this.zac.requiresSignIn();
    }
}
