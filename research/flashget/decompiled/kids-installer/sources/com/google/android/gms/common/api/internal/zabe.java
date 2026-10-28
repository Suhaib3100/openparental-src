package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.C0532i;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.fragment.app.FragmentActivity;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.service.Common;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.signin.SignInOptions;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes3.dex */
public final class zabe extends GoogleApiClient implements zabz {

    @q0
    @VisibleForTesting
    zabx zab;
    final Map<Api.AnyClientKey<?>, Api.Client> zac;
    Set<Scope> zad;
    final ClientSettings zae;
    final Map<Api<?>, Boolean> zaf;
    final Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> zag;

    @q0
    Set<zada> zah;
    final zadc zai;
    private final Lock zaj;
    private final com.google.android.gms.common.internal.zak zak;
    private final int zam;
    private final Context zan;
    private final Looper zao;
    private volatile boolean zap;
    private long zaq;
    private long zar;
    private final zabc zas;
    private final GoogleApiAvailability zat;
    private final ListenerHolders zau;
    private final ArrayList<zat> zav;
    private Integer zaw;
    private final com.google.android.gms.common.internal.zaj zax;

    @q0
    private zaca zal = null;

    @VisibleForTesting
    final Queue<BaseImplementation.ApiMethodImpl<?, ?>> zaa = new LinkedList();

    public zabe(Context context, Lock lock, Looper looper, ClientSettings clientSettings, GoogleApiAvailability googleApiAvailability, Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> abstractClientBuilder, Map<Api<?>, Boolean> map, List<GoogleApiClient.ConnectionCallbacks> list, List<GoogleApiClient.OnConnectionFailedListener> list2, Map<Api.AnyClientKey<?>, Api.Client> map2, int i5, int i6, ArrayList<zat> arrayList) {
        this.zaq = true != ClientLibraryUtils.isPackageSide() ? 120000L : 10000L;
        this.zar = C0532i.f8582a;
        this.zad = new HashSet();
        this.zau = new ListenerHolders();
        this.zaw = null;
        this.zah = null;
        zaay zaayVar = new zaay(this);
        this.zax = zaayVar;
        this.zan = context;
        this.zaj = lock;
        this.zak = new com.google.android.gms.common.internal.zak(looper, zaayVar);
        this.zao = looper;
        this.zas = new zabc(this, looper);
        this.zat = googleApiAvailability;
        this.zam = i5;
        if (i5 >= 0) {
            this.zaw = Integer.valueOf(i6);
        }
        this.zaf = map;
        this.zac = map2;
        this.zav = arrayList;
        this.zai = new zadc();
        Iterator<GoogleApiClient.ConnectionCallbacks> it = list.iterator();
        while (it.hasNext()) {
            this.zak.zaf(it.next());
        }
        Iterator<GoogleApiClient.OnConnectionFailedListener> it2 = list2.iterator();
        while (it2.hasNext()) {
            this.zak.zag(it2.next());
        }
        this.zae = clientSettings;
        this.zag = abstractClientBuilder;
    }

    public static int zad(Iterable<Api.Client> iterable, boolean z5) {
        boolean z6 = false;
        boolean z7 = false;
        for (Api.Client client : iterable) {
            z6 |= client.requiresSignIn();
            z7 |= client.providesSignIn();
        }
        if (z6) {
            return (z7 && z5) ? 2 : 1;
        }
        return 3;
    }

    static String zag(int i5) {
        return i5 != 1 ? i5 != 2 ? i5 != 3 ? ProtectedSandApp.s("⇒") : ProtectedSandApp.s("⇓") : ProtectedSandApp.s("⇔") : ProtectedSandApp.s("⇕");
    }

    static /* bridge */ /* synthetic */ void zai(zabe zabeVar) {
        zabeVar.zaj.lock();
        try {
            if (zabeVar.zap) {
                zabeVar.zan();
            }
        } finally {
            zabeVar.zaj.unlock();
        }
    }

    static /* bridge */ /* synthetic */ void zaj(zabe zabeVar) {
        zabeVar.zaj.lock();
        try {
            if (zabeVar.zak()) {
                zabeVar.zan();
            }
        } finally {
            zabeVar.zaj.unlock();
        }
    }

    private final void zal(int i5) {
        Integer num = this.zaw;
        if (num == null) {
            this.zaw = Integer.valueOf(i5);
        } else if (num.intValue() != i5) {
            String zag = zag(i5);
            String zag2 = zag(this.zaw.intValue());
            StringBuilder sb = new StringBuilder(zag2.length() + zag.length() + 51);
            sb.append(ProtectedSandApp.s("⇘"));
            sb.append(zag);
            sb.append(ProtectedSandApp.s("⇙"));
            sb.append(zag2);
            throw new IllegalStateException(sb.toString());
        }
        if (this.zal != null) {
            return;
        }
        boolean z5 = false;
        boolean z6 = false;
        for (Api.Client client : this.zac.values()) {
            z5 |= client.requiresSignIn();
            z6 |= client.providesSignIn();
        }
        int intValue = this.zaw.intValue();
        if (intValue == 1) {
            if (!z5) {
                throw new IllegalStateException(ProtectedSandApp.s("⇗"));
            }
            if (z6) {
                throw new IllegalStateException(ProtectedSandApp.s("⇖"));
            }
        } else if (intValue == 2 && z5) {
            this.zal = zaaa.zag(this.zan, this, this.zaj, this.zao, this.zat, this.zac, this.zae, this.zaf, this.zag, this.zav);
            return;
        }
        this.zal = new zabi(this.zan, this, this.zaj, this.zao, this.zat, this.zac, this.zae, this.zaf, this.zag, this.zav, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zam(GoogleApiClient googleApiClient, StatusPendingResult statusPendingResult, boolean z5) {
        Common.zaa.zaa(googleApiClient).setResultCallback(new zabb(this, statusPendingResult, z5, googleApiClient));
    }

    @GuardedBy("mLock")
    private final void zan() {
        this.zak.zab();
        ((zaca) Preconditions.checkNotNull(this.zal)).zaq();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final ConnectionResult blockingConnect() {
        boolean z5 = true;
        Preconditions.checkState(Looper.myLooper() != Looper.getMainLooper(), ProtectedSandApp.s("⇚"));
        this.zaj.lock();
        try {
            if (this.zam >= 0) {
                if (this.zaw == null) {
                    z5 = false;
                }
                Preconditions.checkState(z5, ProtectedSandApp.s("⇛"));
            } else {
                Integer num = this.zaw;
                if (num == null) {
                    this.zaw = Integer.valueOf(zad(this.zac.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException(ProtectedSandApp.s("⇜"));
                }
            }
            zal(((Integer) Preconditions.checkNotNull(this.zaw)).intValue());
            this.zak.zab();
            return ((zaca) Preconditions.checkNotNull(this.zal)).zab();
        } finally {
            this.zaj.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final PendingResult<Status> clearDefaultAccountAndReconnect() {
        Preconditions.checkState(isConnected(), ProtectedSandApp.s("⇠"));
        Integer num = this.zaw;
        boolean z5 = true;
        if (num != null && num.intValue() == 2) {
            z5 = false;
        }
        Preconditions.checkState(z5, ProtectedSandApp.s("⇡"));
        StatusPendingResult statusPendingResult = new StatusPendingResult(this);
        if (this.zac.containsKey(Common.CLIENT_KEY)) {
            zam(this, statusPendingResult, false);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            zaaz zaazVar = new zaaz(this, atomicReference, statusPendingResult);
            zaba zabaVar = new zaba(this, statusPendingResult);
            GoogleApiClient.Builder builder = new GoogleApiClient.Builder(this.zan);
            builder.addApi(Common.API);
            builder.addConnectionCallbacks(zaazVar);
            builder.addOnConnectionFailedListener(zabaVar);
            builder.setHandler(this.zas);
            GoogleApiClient build = builder.build();
            atomicReference.set(build);
            build.connect();
        }
        return statusPendingResult;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0093, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0099, code lost:
    
        throw r0;
     */
    @Override // com.google.android.gms.common.api.GoogleApiClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void connect() {
        /*
            r5 = this;
            java.util.concurrent.locks.Lock r0 = r5.zaj
            r0.lock()
            int r0 = r5.zam     // Catch: java.lang.Throwable -> L93
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 < 0) goto L1d
            java.lang.Integer r0 = r5.zaw     // Catch: java.lang.Throwable -> L93
            if (r0 == 0) goto L12
            r0 = r3
            goto L13
        L12:
            r0 = r2
        L13:
            java.lang.String r4 = "⇢"
            java.lang.String r4 = com.flashget.kidsdownloader.ProtectedSandApp.s(r4)     // Catch: java.lang.Throwable -> L93
            com.google.android.gms.common.internal.Preconditions.checkState(r0, r4)     // Catch: java.lang.Throwable -> L93
            goto L38
        L1d:
            java.lang.Integer r0 = r5.zaw     // Catch: java.lang.Throwable -> L93
            if (r0 != 0) goto L32
            java.util.Map<com.google.android.gms.common.api.Api$AnyClientKey<?>, com.google.android.gms.common.api.Api$Client> r0 = r5.zac     // Catch: java.lang.Throwable -> L93
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> L93
            int r0 = zad(r0, r2)     // Catch: java.lang.Throwable -> L93
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L93
            r5.zaw = r0     // Catch: java.lang.Throwable -> L93
            goto L38
        L32:
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L93
            if (r0 == r1) goto L87
        L38:
            java.lang.Integer r0 = r5.zaw     // Catch: java.lang.Throwable -> L93
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch: java.lang.Throwable -> L93
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L93
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L93
            java.util.concurrent.locks.Lock r4 = r5.zaj     // Catch: java.lang.Throwable -> L93
            r4.lock()     // Catch: java.lang.Throwable -> L93
            r4 = 3
            if (r0 == r4) goto L53
            if (r0 == r3) goto L53
            if (r0 != r1) goto L51
            goto L54
        L51:
            r1 = r0
            goto L55
        L53:
            r1 = r0
        L54:
            r2 = r3
        L55:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L80
            r3 = 33
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L80
            java.lang.String r3 = "⇣"
            java.lang.String r3 = com.flashget.kidsdownloader.ProtectedSandApp.s(r3)     // Catch: java.lang.Throwable -> L80
            r0.append(r3)     // Catch: java.lang.Throwable -> L80
            r0.append(r1)     // Catch: java.lang.Throwable -> L80
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L80
            com.google.android.gms.common.internal.Preconditions.checkArgument(r2, r0)     // Catch: java.lang.Throwable -> L80
            r5.zal(r1)     // Catch: java.lang.Throwable -> L80
            r5.zan()     // Catch: java.lang.Throwable -> L80
            java.util.concurrent.locks.Lock r0 = r5.zaj     // Catch: java.lang.Throwable -> L93
            r0.unlock()     // Catch: java.lang.Throwable -> L93
            java.util.concurrent.locks.Lock r0 = r5.zaj
            r0.unlock()
            return
        L80:
            r0 = move-exception
            java.util.concurrent.locks.Lock r1 = r5.zaj     // Catch: java.lang.Throwable -> L93
            r1.unlock()     // Catch: java.lang.Throwable -> L93
            throw r0     // Catch: java.lang.Throwable -> L93
        L87:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L93
            java.lang.String r1 = "⇤"
            java.lang.String r1 = com.flashget.kidsdownloader.ProtectedSandApp.s(r1)     // Catch: java.lang.Throwable -> L93
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L93
            throw r0     // Catch: java.lang.Throwable -> L93
        L93:
            r0 = move-exception
            java.util.concurrent.locks.Lock r1 = r5.zaj
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zabe.connect():void");
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void disconnect() {
        Lock lock;
        this.zaj.lock();
        try {
            this.zai.zab();
            zaca zacaVar = this.zal;
            if (zacaVar != null) {
                zacaVar.zar();
            }
            this.zau.zab();
            for (BaseImplementation.ApiMethodImpl<?, ?> apiMethodImpl : this.zaa) {
                apiMethodImpl.zan(null);
                apiMethodImpl.cancel();
            }
            this.zaa.clear();
            if (this.zal == null) {
                lock = this.zaj;
            } else {
                zak();
                this.zak.zaa();
                lock = this.zaj;
            }
            lock.unlock();
        } catch (Throwable th) {
            this.zaj.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void dump(String str, @q0 FileDescriptor fileDescriptor, PrintWriter printWriter, @q0 String[] strArr) {
        printWriter.append((CharSequence) str).append((CharSequence) ProtectedSandApp.s("⇦")).println(this.zan);
        printWriter.append((CharSequence) str).append((CharSequence) ProtectedSandApp.s("⇧")).print(this.zap);
        printWriter.append((CharSequence) ProtectedSandApp.s("⇨")).print(this.zaa.size());
        printWriter.append((CharSequence) ProtectedSandApp.s("⇩")).println(this.zai.zab.size());
        zaca zacaVar = this.zal;
        if (zacaVar != null) {
            zacaVar.zas(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T enqueue(@o0 T t5) {
        Lock lock;
        Api<?> api = t5.getApi();
        boolean containsKey = this.zac.containsKey(t5.getClientKey());
        String zad = api != null ? api.zad() : ProtectedSandApp.s("⇪");
        StringBuilder sb = new StringBuilder(String.valueOf(zad).length() + 65);
        sb.append(ProtectedSandApp.s("⇫"));
        sb.append(zad);
        sb.append(ProtectedSandApp.s("⇬"));
        Preconditions.checkArgument(containsKey, sb.toString());
        this.zaj.lock();
        try {
            zaca zacaVar = this.zal;
            if (zacaVar == null) {
                this.zaa.add(t5);
                lock = this.zaj;
            } else {
                t5 = (T) zacaVar.zae(t5);
                lock = this.zaj;
            }
            lock.unlock();
            return t5;
        } catch (Throwable th) {
            this.zaj.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T execute(@o0 T t5) {
        Lock lock;
        Api<?> api = t5.getApi();
        boolean containsKey = this.zac.containsKey(t5.getClientKey());
        String zad = api != null ? api.zad() : ProtectedSandApp.s("⇭");
        StringBuilder sb = new StringBuilder(String.valueOf(zad).length() + 65);
        sb.append(ProtectedSandApp.s("⇮"));
        sb.append(zad);
        sb.append(ProtectedSandApp.s("⇯"));
        Preconditions.checkArgument(containsKey, sb.toString());
        this.zaj.lock();
        try {
            zaca zacaVar = this.zal;
            if (zacaVar == null) {
                throw new IllegalStateException(ProtectedSandApp.s("⇰"));
            }
            if (this.zap) {
                this.zaa.add(t5);
                while (!this.zaa.isEmpty()) {
                    BaseImplementation.ApiMethodImpl<?, ?> remove = this.zaa.remove();
                    this.zai.zaa(remove);
                    remove.setFailedResult(Status.RESULT_INTERNAL_ERROR);
                }
                lock = this.zaj;
            } else {
                t5 = (T) zacaVar.zaf(t5);
                lock = this.zaj;
            }
            lock.unlock();
            return t5;
        } catch (Throwable th) {
            this.zaj.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    @o0
    public final <C extends Api.Client> C getClient(@o0 Api.AnyClientKey<C> anyClientKey) {
        C c6 = (C) this.zac.get(anyClientKey);
        Preconditions.checkNotNull(c6, ProtectedSandApp.s("⇱"));
        return c6;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    @o0
    public final ConnectionResult getConnectionResult(@o0 Api<?> api) {
        ConnectionResult connectionResult;
        Lock lock;
        this.zaj.lock();
        try {
            if (!isConnected() && !this.zap) {
                throw new IllegalStateException(ProtectedSandApp.s("⇲"));
            }
            if (!this.zac.containsKey(api.zab())) {
                throw new IllegalArgumentException(String.valueOf(api.zad()).concat(ProtectedSandApp.s("⇵")));
            }
            ConnectionResult zad = ((zaca) Preconditions.checkNotNull(this.zal)).zad(api);
            if (zad != null) {
                return zad;
            }
            if (this.zap) {
                connectionResult = ConnectionResult.RESULT_SUCCESS;
                lock = this.zaj;
            } else {
                zaf();
                Log.wtf(ProtectedSandApp.s("⇴"), String.valueOf(api.zad()).concat(ProtectedSandApp.s("⇳")), new Exception());
                connectionResult = new ConnectionResult(8, null);
                lock = this.zaj;
            }
            lock.unlock();
            return connectionResult;
        } finally {
            this.zaj.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final Context getContext() {
        return this.zan;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final Looper getLooper() {
        return this.zao;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean hasApi(@o0 Api<?> api) {
        return this.zac.containsKey(api.zab());
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean hasConnectedApi(@o0 Api<?> api) {
        Api.Client client;
        return isConnected() && (client = this.zac.get(api.zab())) != null && client.isConnected();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnected() {
        zaca zacaVar = this.zal;
        return zacaVar != null && zacaVar.zaw();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnecting() {
        zaca zacaVar = this.zal;
        return zacaVar != null && zacaVar.zax();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnectionCallbacksRegistered(@o0 GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        return this.zak.zaj(connectionCallbacks);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnectionFailedListenerRegistered(@o0 GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return this.zak.zak(onConnectionFailedListener);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean maybeSignIn(SignInConnectionListener signInConnectionListener) {
        zaca zacaVar = this.zal;
        return zacaVar != null && zacaVar.zay(signInConnectionListener);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void maybeSignOut() {
        zaca zacaVar = this.zal;
        if (zacaVar != null) {
            zacaVar.zau();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void reconnect() {
        disconnect();
        connect();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void registerConnectionCallbacks(@o0 GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        this.zak.zaf(connectionCallbacks);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void registerConnectionFailedListener(@o0 GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.zak.zag(onConnectionFailedListener);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final <L> ListenerHolder<L> registerListener(@o0 L l5) {
        this.zaj.lock();
        try {
            return this.zau.zaa(l5, this.zao, ProtectedSandApp.s("⇶"));
        } finally {
            this.zaj.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void stopAutoManage(@o0 FragmentActivity fragmentActivity) {
        LifecycleActivity lifecycleActivity = new LifecycleActivity((Activity) fragmentActivity);
        if (this.zam < 0) {
            throw new IllegalStateException(ProtectedSandApp.s("⇷"));
        }
        zak.zaa(lifecycleActivity).zae(this.zam);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void unregisterConnectionCallbacks(@o0 GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        this.zak.zah(connectionCallbacks);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void unregisterConnectionFailedListener(@o0 GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.zak.zai(onConnectionFailedListener);
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    @GuardedBy("mLock")
    public final void zaa(ConnectionResult connectionResult) {
        if (!this.zat.isPlayServicesPossiblyUpdating(this.zan, connectionResult.getErrorCode())) {
            zak();
        }
        if (this.zap) {
            return;
        }
        this.zak.zac(connectionResult);
        this.zak.zaa();
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    @GuardedBy("mLock")
    public final void zab(@q0 Bundle bundle) {
        while (!this.zaa.isEmpty()) {
            execute(this.zaa.remove());
        }
        this.zak.zad(bundle);
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    @GuardedBy("mLock")
    public final void zac(int i5, boolean z5) {
        if (i5 == 1) {
            if (!z5 && !this.zap) {
                this.zap = true;
                if (this.zab == null && !ClientLibraryUtils.isPackageSide()) {
                    try {
                        this.zab = this.zat.zac(this.zan.getApplicationContext(), new zabd(this));
                    } catch (SecurityException unused) {
                    }
                }
                zabc zabcVar = this.zas;
                zabcVar.sendMessageDelayed(zabcVar.obtainMessage(1), this.zaq);
                zabc zabcVar2 = this.zas;
                zabcVar2.sendMessageDelayed(zabcVar2.obtainMessage(2), this.zar);
            }
            i5 = 1;
        }
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.zai.zab.toArray(new BasePendingResult[0])) {
            basePendingResult.forceFailureUnlessReady(zadc.zaa);
        }
        this.zak.zae(i5);
        this.zak.zaa();
        if (i5 == 2) {
            zan();
        }
    }

    final String zaf() {
        StringWriter stringWriter = new StringWriter();
        dump("", null, new PrintWriter(stringWriter), null);
        return stringWriter.toString();
    }

    @GuardedBy("mLock")
    final boolean zak() {
        if (!this.zap) {
            return false;
        }
        this.zap = false;
        this.zas.removeMessages(2);
        this.zas.removeMessages(1);
        zabx zabxVar = this.zab;
        if (zabxVar != null) {
            zabxVar.zab();
            this.zab = null;
        }
        return true;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void zao(zada zadaVar) {
        this.zaj.lock();
        try {
            if (this.zah == null) {
                this.zah = new HashSet();
            }
            this.zah.add(zadaVar);
        } finally {
            this.zaj.unlock();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
    
        if (r3 == false) goto L19;
     */
    @Override // com.google.android.gms.common.api.GoogleApiClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zap(com.google.android.gms.common.api.internal.zada r3) {
        /*
            r2 = this;
            java.util.concurrent.locks.Lock r0 = r2.zaj
            r0.lock()
            java.util.Set<com.google.android.gms.common.api.internal.zada> r0 = r2.zah     // Catch: java.lang.Throwable -> L63
            java.lang.String r1 = "⇸"
            java.lang.String r1 = com.flashget.kidsdownloader.ProtectedSandApp.s(r1)
            if (r0 != 0) goto L1e
            java.lang.Exception r3 = new java.lang.Exception     // Catch: java.lang.Throwable -> L63
            r3.<init>()     // Catch: java.lang.Throwable -> L63
            java.lang.String r0 = "⇹"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)     // Catch: java.lang.Throwable -> L63
            android.util.Log.wtf(r1, r0, r3)     // Catch: java.lang.Throwable -> L63
            goto L56
        L1e:
            boolean r3 = r0.remove(r3)     // Catch: java.lang.Throwable -> L63
            if (r3 != 0) goto L33
            java.lang.Exception r3 = new java.lang.Exception     // Catch: java.lang.Throwable -> L63
            r3.<init>()     // Catch: java.lang.Throwable -> L63
            java.lang.String r0 = "⇺"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)     // Catch: java.lang.Throwable -> L63
            android.util.Log.wtf(r1, r0, r3)     // Catch: java.lang.Throwable -> L63
            goto L56
        L33:
            java.util.concurrent.locks.Lock r3 = r2.zaj     // Catch: java.lang.Throwable -> L63
            r3.lock()     // Catch: java.lang.Throwable -> L63
            java.util.Set<com.google.android.gms.common.api.internal.zada> r3 = r2.zah     // Catch: java.lang.Throwable -> L5c
            if (r3 != 0) goto L42
            java.util.concurrent.locks.Lock r3 = r2.zaj     // Catch: java.lang.Throwable -> L63
            r3.unlock()     // Catch: java.lang.Throwable -> L63
            goto L4f
        L42:
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L5c
            r3 = r3 ^ 1
            java.util.concurrent.locks.Lock r0 = r2.zaj     // Catch: java.lang.Throwable -> L63
            r0.unlock()     // Catch: java.lang.Throwable -> L63
            if (r3 != 0) goto L56
        L4f:
            com.google.android.gms.common.api.internal.zaca r3 = r2.zal     // Catch: java.lang.Throwable -> L63
            if (r3 == 0) goto L56
            r3.zat()     // Catch: java.lang.Throwable -> L63
        L56:
            java.util.concurrent.locks.Lock r3 = r2.zaj
            r3.unlock()
            return
        L5c:
            r3 = move-exception
            java.util.concurrent.locks.Lock r0 = r2.zaj     // Catch: java.lang.Throwable -> L63
            r0.unlock()     // Catch: java.lang.Throwable -> L63
            throw r3     // Catch: java.lang.Throwable -> L63
        L63:
            r3 = move-exception
            java.util.concurrent.locks.Lock r0 = r2.zaj
            r0.unlock()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zabe.zap(com.google.android.gms.common.api.internal.zada):void");
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final ConnectionResult blockingConnect(long j5, @o0 TimeUnit timeUnit) {
        Preconditions.checkState(Looper.myLooper() != Looper.getMainLooper(), ProtectedSandApp.s("⇝"));
        Preconditions.checkNotNull(timeUnit, ProtectedSandApp.s("⇞"));
        this.zaj.lock();
        try {
            Integer num = this.zaw;
            if (num == null) {
                this.zaw = Integer.valueOf(zad(this.zac.values(), false));
            } else if (num.intValue() == 2) {
                throw new IllegalStateException(ProtectedSandApp.s("⇟"));
            }
            zal(((Integer) Preconditions.checkNotNull(this.zaw)).intValue());
            this.zak.zab();
            return ((zaca) Preconditions.checkNotNull(this.zal)).zac(j5, timeUnit);
        } finally {
            this.zaj.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void connect(int i5) {
        this.zaj.lock();
        boolean z5 = true;
        if (i5 != 3 && i5 != 1) {
            if (i5 == 2) {
                i5 = 2;
            } else {
                z5 = false;
            }
        }
        try {
            StringBuilder sb = new StringBuilder(33);
            sb.append(ProtectedSandApp.s("⇥"));
            sb.append(i5);
            Preconditions.checkArgument(z5, sb.toString());
            zal(i5);
            zan();
        } finally {
            this.zaj.unlock();
        }
    }
}
