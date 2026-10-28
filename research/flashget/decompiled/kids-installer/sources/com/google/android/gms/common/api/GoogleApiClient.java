package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.collection.a;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.e0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.LifecycleActivity;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.SignInConnectionListener;
import com.google.android.gms.common.api.internal.zabe;
import com.google.android.gms.common.api.internal.zada;
import com.google.android.gms.common.api.internal.zak;
import com.google.android.gms.common.api.internal.zat;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.signin.SignInOptions;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
@Deprecated
/* loaded from: classes2.dex */
public abstract class GoogleApiClient {
    public static final int SIGN_IN_MODE_OPTIONAL = 2;
    public static final int SIGN_IN_MODE_REQUIRED = 1;

    @o0
    @KeepForSdk
    public static final String DEFAULT_ACCOUNT = ProtectedSandApp.s("ૈ");

    @GuardedBy("sAllClients")
    private static final Set<GoogleApiClient> zaa = Collections.newSetFromMap(new WeakHashMap());

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @Deprecated
    /* loaded from: classes3.dex */
    public interface ConnectionCallbacks extends com.google.android.gms.common.api.internal.ConnectionCallbacks {
        public static final int CAUSE_NETWORK_LOST = 2;
        public static final int CAUSE_SERVICE_DISCONNECTED = 1;
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @Deprecated
    /* loaded from: classes3.dex */
    public interface OnConnectionFailedListener extends com.google.android.gms.common.api.internal.OnConnectionFailedListener {
    }

    public static void dumpAll(@o0 String str, @o0 FileDescriptor fileDescriptor, @o0 PrintWriter printWriter, @o0 String[] strArr) {
        Set<GoogleApiClient> set = zaa;
        synchronized (set) {
            String concat = String.valueOf(str).concat(ProtectedSandApp.s("ૉ"));
            int i5 = 0;
            for (GoogleApiClient googleApiClient : set) {
                printWriter.append((CharSequence) str).append((CharSequence) ProtectedSandApp.s("\u0aca")).println(i5);
                googleApiClient.dump(concat, fileDescriptor, printWriter, strArr);
                i5++;
            }
        }
    }

    @o0
    @KeepForSdk
    public static Set<GoogleApiClient> getAllClients() {
        Set<GoogleApiClient> set = zaa;
        synchronized (set) {
        }
        return set;
    }

    @o0
    public abstract ConnectionResult blockingConnect();

    @o0
    public abstract ConnectionResult blockingConnect(long j5, @o0 TimeUnit timeUnit);

    @o0
    public abstract PendingResult<Status> clearDefaultAccountAndReconnect();

    public abstract void connect();

    public void connect(int i5) {
        throw new UnsupportedOperationException();
    }

    public abstract void disconnect();

    public abstract void dump(@o0 String str, @o0 FileDescriptor fileDescriptor, @o0 PrintWriter printWriter, @o0 String[] strArr);

    @o0
    @KeepForSdk
    public <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T enqueue(@o0 T t5) {
        throw new UnsupportedOperationException();
    }

    @o0
    @KeepForSdk
    public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T execute(@o0 T t5) {
        throw new UnsupportedOperationException();
    }

    @o0
    @KeepForSdk
    public <C extends Api.Client> C getClient(@o0 Api.AnyClientKey<C> anyClientKey) {
        throw new UnsupportedOperationException();
    }

    @o0
    public abstract ConnectionResult getConnectionResult(@o0 Api<?> api);

    @o0
    @KeepForSdk
    public Context getContext() {
        throw new UnsupportedOperationException();
    }

    @o0
    @KeepForSdk
    public Looper getLooper() {
        throw new UnsupportedOperationException();
    }

    @KeepForSdk
    public boolean hasApi(@o0 Api<?> api) {
        throw new UnsupportedOperationException();
    }

    public abstract boolean hasConnectedApi(@o0 Api<?> api);

    public abstract boolean isConnected();

    public abstract boolean isConnecting();

    public abstract boolean isConnectionCallbacksRegistered(@o0 ConnectionCallbacks connectionCallbacks);

    public abstract boolean isConnectionFailedListenerRegistered(@o0 OnConnectionFailedListener onConnectionFailedListener);

    @KeepForSdk
    public boolean maybeSignIn(@o0 SignInConnectionListener signInConnectionListener) {
        throw new UnsupportedOperationException();
    }

    @KeepForSdk
    public void maybeSignOut() {
        throw new UnsupportedOperationException();
    }

    public abstract void reconnect();

    public abstract void registerConnectionCallbacks(@o0 ConnectionCallbacks connectionCallbacks);

    public abstract void registerConnectionFailedListener(@o0 OnConnectionFailedListener onConnectionFailedListener);

    @o0
    @KeepForSdk
    public <L> ListenerHolder<L> registerListener(@o0 L l5) {
        throw new UnsupportedOperationException();
    }

    public abstract void stopAutoManage(@o0 FragmentActivity fragmentActivity);

    public abstract void unregisterConnectionCallbacks(@o0 ConnectionCallbacks connectionCallbacks);

    public abstract void unregisterConnectionFailedListener(@o0 OnConnectionFailedListener onConnectionFailedListener);

    public void zao(zada zadaVar) {
        throw new UnsupportedOperationException();
    }

    public void zap(zada zadaVar) {
        throw new UnsupportedOperationException();
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @KeepForSdk
    @Deprecated
    public static final class Builder {

        @q0
        private Account zaa;
        private final Set<Scope> zab;
        private final Set<Scope> zac;
        private int zad;
        private View zae;
        private String zaf;
        private String zag;
        private final Map<Api<?>, com.google.android.gms.common.internal.zab> zah;
        private final Context zai;
        private final Map<Api<?>, Api.ApiOptions> zaj;
        private LifecycleActivity zak;
        private int zal;

        @q0
        private OnConnectionFailedListener zam;
        private Looper zan;
        private GoogleApiAvailability zao;
        private Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> zap;
        private final ArrayList<ConnectionCallbacks> zaq;
        private final ArrayList<OnConnectionFailedListener> zar;

        @KeepForSdk
        public Builder(@o0 Context context) {
            this.zab = new HashSet();
            this.zac = new HashSet();
            this.zah = new a();
            this.zaj = new a();
            this.zal = -1;
            this.zao = GoogleApiAvailability.getInstance();
            this.zap = com.google.android.gms.signin.zad.zac;
            this.zaq = new ArrayList<>();
            this.zar = new ArrayList<>();
            this.zai = context;
            this.zan = context.getMainLooper();
            this.zaf = context.getPackageName();
            this.zag = context.getClass().getName();
        }

        private final <O extends Api.ApiOptions> void zab(Api<O> api, @q0 O o5, Scope... scopeArr) {
            HashSet hashSet = new HashSet(((Api.BaseClientBuilder) Preconditions.checkNotNull(api.zac(), ProtectedSandApp.s("\u0ab1"))).getImpliedScopes(o5));
            for (Scope scope : scopeArr) {
                hashSet.add(scope);
            }
            this.zah.put(api, new com.google.android.gms.common.internal.zab(hashSet));
        }

        @o0
        public Builder addApi(@o0 Api<? extends Api.ApiOptions.NotRequiredOptions> api) {
            Preconditions.checkNotNull(api, ProtectedSandApp.s("લ"));
            this.zaj.put(api, null);
            List<Scope> impliedScopes = ((Api.BaseClientBuilder) Preconditions.checkNotNull(api.zac(), ProtectedSandApp.s("ળ"))).getImpliedScopes(null);
            this.zac.addAll(impliedScopes);
            this.zab.addAll(impliedScopes);
            return this;
        }

        @o0
        public <O extends Api.ApiOptions.HasOptions> Builder addApiIfAvailable(@o0 Api<O> api, @o0 O o5, @o0 Scope... scopeArr) {
            Preconditions.checkNotNull(api, ProtectedSandApp.s("ષ"));
            Preconditions.checkNotNull(o5, ProtectedSandApp.s("સ"));
            this.zaj.put(api, o5);
            zab(api, o5, scopeArr);
            return this;
        }

        @o0
        public Builder addConnectionCallbacks(@o0 ConnectionCallbacks connectionCallbacks) {
            Preconditions.checkNotNull(connectionCallbacks, ProtectedSandApp.s("\u0aba"));
            this.zaq.add(connectionCallbacks);
            return this;
        }

        @o0
        public Builder addOnConnectionFailedListener(@o0 OnConnectionFailedListener onConnectionFailedListener) {
            Preconditions.checkNotNull(onConnectionFailedListener, ProtectedSandApp.s("\u0abb"));
            this.zar.add(onConnectionFailedListener);
            return this;
        }

        @o0
        public Builder addScope(@o0 Scope scope) {
            Preconditions.checkNotNull(scope, ProtectedSandApp.s("઼"));
            this.zab.add(scope);
            return this;
        }

        @o0
        public GoogleApiClient build() {
            Preconditions.checkArgument(!this.zaj.isEmpty(), ProtectedSandApp.s("ઽ"));
            ClientSettings zaa = zaa();
            Map<Api<?>, com.google.android.gms.common.internal.zab> zad = zaa.zad();
            a aVar = new a();
            a aVar2 = new a();
            ArrayList arrayList = new ArrayList();
            Api<?> api = null;
            boolean z5 = false;
            for (Api<?> api2 : this.zaj.keySet()) {
                Api.ApiOptions apiOptions = this.zaj.get(api2);
                boolean z6 = zad.get(api2) != null;
                aVar.put(api2, Boolean.valueOf(z6));
                zat zatVar = new zat(api2, z6);
                arrayList.add(zatVar);
                Api.AbstractClientBuilder abstractClientBuilder = (Api.AbstractClientBuilder) Preconditions.checkNotNull(api2.zaa());
                Api.Client buildClient = abstractClientBuilder.buildClient(this.zai, this.zan, zaa, (ClientSettings) apiOptions, (ConnectionCallbacks) zatVar, (OnConnectionFailedListener) zatVar);
                aVar2.put(api2.zab(), buildClient);
                if (abstractClientBuilder.getPriority() == 1) {
                    z5 = apiOptions != null;
                }
                if (buildClient.providesSignIn()) {
                    if (api != null) {
                        String zad2 = api2.zad();
                        String zad3 = api.zad();
                        throw new IllegalStateException(e0.a(new StringBuilder(String.valueOf(zad2).length() + 21 + String.valueOf(zad3).length()), zad2, ProtectedSandApp.s("ા"), zad3));
                    }
                    api = api2;
                }
            }
            if (api != null) {
                if (z5) {
                    String zad4 = api.zad();
                    throw new IllegalStateException(e0.a(new StringBuilder(String.valueOf(zad4).length() + 82), ProtectedSandApp.s("ુ"), zad4, ProtectedSandApp.s("ૂ")));
                }
                Preconditions.checkState(this.zaa == null, ProtectedSandApp.s("િ"), api.zad());
                Preconditions.checkState(this.zab.equals(this.zac), ProtectedSandApp.s("ી"), api.zad());
            }
            zabe zabeVar = new zabe(this.zai, new ReentrantLock(), this.zan, zaa, this.zao, this.zap, aVar, this.zaq, this.zar, aVar2, this.zal, zabe.zad(aVar2.values(), true), arrayList);
            synchronized (GoogleApiClient.zaa) {
                GoogleApiClient.zaa.add(zabeVar);
            }
            if (this.zal >= 0) {
                zak.zaa(this.zak).zad(this.zal, zabeVar, this.zam);
            }
            return zabeVar;
        }

        @o0
        public Builder enableAutoManage(@o0 FragmentActivity fragmentActivity, int i5, @q0 OnConnectionFailedListener onConnectionFailedListener) {
            LifecycleActivity lifecycleActivity = new LifecycleActivity((Activity) fragmentActivity);
            Preconditions.checkArgument(i5 >= 0, ProtectedSandApp.s("ૃ"));
            this.zal = i5;
            this.zam = onConnectionFailedListener;
            this.zak = lifecycleActivity;
            return this;
        }

        @o0
        public Builder setAccountName(@o0 String str) {
            this.zaa = str == null ? null : new Account(str, ProtectedSandApp.s("ૄ"));
            return this;
        }

        @o0
        public Builder setGravityForPopups(int i5) {
            this.zad = i5;
            return this;
        }

        @o0
        public Builder setHandler(@o0 Handler handler) {
            Preconditions.checkNotNull(handler, ProtectedSandApp.s("ૅ"));
            this.zan = handler.getLooper();
            return this;
        }

        @o0
        public Builder setViewForPopups(@o0 View view) {
            Preconditions.checkNotNull(view, ProtectedSandApp.s("\u0ac6"));
            this.zae = view;
            return this;
        }

        @o0
        public Builder useDefaultAccount() {
            setAccountName(ProtectedSandApp.s("ે"));
            return this;
        }

        @VisibleForTesting
        @o0
        public final ClientSettings zaa() {
            SignInOptions signInOptions = SignInOptions.zaa;
            Map<Api<?>, Api.ApiOptions> map = this.zaj;
            Api<SignInOptions> api = com.google.android.gms.signin.zad.zag;
            if (map.containsKey(api)) {
                signInOptions = (SignInOptions) this.zaj.get(api);
            }
            return new ClientSettings(this.zaa, this.zab, this.zah, this.zad, this.zae, this.zaf, this.zag, signInOptions, false);
        }

        @o0
        public Builder enableAutoManage(@o0 FragmentActivity fragmentActivity, @q0 OnConnectionFailedListener onConnectionFailedListener) {
            enableAutoManage(fragmentActivity, 0, onConnectionFailedListener);
            return this;
        }

        @o0
        public <T extends Api.ApiOptions.NotRequiredOptions> Builder addApiIfAvailable(@o0 Api<? extends Api.ApiOptions.NotRequiredOptions> api, @o0 Scope... scopeArr) {
            Preconditions.checkNotNull(api, ProtectedSandApp.s("હ"));
            this.zaj.put(api, null);
            zab(api, null, scopeArr);
            return this;
        }

        @o0
        public <O extends Api.ApiOptions.HasOptions> Builder addApi(@o0 Api<O> api, @o0 O o5) {
            Preconditions.checkNotNull(api, ProtectedSandApp.s("\u0ab4"));
            Preconditions.checkNotNull(o5, ProtectedSandApp.s("વ"));
            this.zaj.put(api, o5);
            List<Scope> impliedScopes = ((Api.BaseClientBuilder) Preconditions.checkNotNull(api.zac(), ProtectedSandApp.s("શ"))).getImpliedScopes(o5);
            this.zac.addAll(impliedScopes);
            this.zab.addAll(impliedScopes);
            return this;
        }

        @KeepForSdk
        public Builder(@o0 Context context, @o0 ConnectionCallbacks connectionCallbacks, @o0 OnConnectionFailedListener onConnectionFailedListener) {
            this(context);
            Preconditions.checkNotNull(connectionCallbacks, ProtectedSandApp.s("ય"));
            this.zaq.add(connectionCallbacks);
            Preconditions.checkNotNull(onConnectionFailedListener, ProtectedSandApp.s("ર"));
            this.zar.add(onConnectionFailedListener);
        }
    }
}
