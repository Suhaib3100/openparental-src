package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Looper;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes5.dex */
public final class Api<O extends ApiOptions> {
    private final AbstractClientBuilder zaa;
    private final ClientKey zab;
    private final String zac;

    /* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
    @KeepForSdk
    public static abstract class AbstractClientBuilder<T extends Client, O> extends BaseClientBuilder<T, O> {
        @o0
        @KeepForSdk
        @Deprecated
        public T buildClient(@o0 Context context, @o0 Looper looper, @o0 ClientSettings clientSettings, @o0 O o4, @o0 GoogleApiClient.ConnectionCallbacks connectionCallbacks, @o0 GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
            return buildClient(context, looper, clientSettings, (ClientSettings) o4, (ConnectionCallbacks) connectionCallbacks, (OnConnectionFailedListener) onConnectionFailedListener);
        }

        @o0
        @KeepForSdk
        public T buildClient(@o0 Context context, @o0 Looper looper, @o0 ClientSettings clientSettings, @o0 O o4, @o0 ConnectionCallbacks connectionCallbacks, @o0 OnConnectionFailedListener onConnectionFailedListener) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("읎"));
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
    @KeepForSdk
    public interface AnyClient {
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
    @KeepForSdk
    public static class AnyClientKey<C extends AnyClient> {
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
    public interface ApiOptions {

        @o0
        public static final NoOptions NO_OPTIONS = new NoOptions(null);

        /* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
        public interface HasAccountOptions extends HasOptions, NotRequiredOptions {
            @o0
            Account getAccount();
        }

        /* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
        public interface HasGoogleSignInAccountOptions extends HasOptions {
            @q0
            GoogleSignInAccount getGoogleSignInAccount();
        }

        /* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
        public interface HasOptions extends ApiOptions {
        }

        /* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
        public static final class NoOptions implements NotRequiredOptions {
            private NoOptions() {
            }

            /* synthetic */ NoOptions(zaa zaaVar) {
            }
        }

        /* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
        public interface NotRequiredOptions extends ApiOptions {
        }

        /* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
        public interface Optional extends HasOptions, NotRequiredOptions {
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
    @m1
    @KeepForSdk
    public static abstract class BaseClientBuilder<T extends AnyClient, O> {

        @KeepForSdk
        public static final int API_PRIORITY_GAMES = 1;

        @KeepForSdk
        public static final int API_PRIORITY_OTHER = Integer.MAX_VALUE;

        @KeepForSdk
        public static final int API_PRIORITY_PLUS = 2;

        @o0
        @KeepForSdk
        public List<Scope> getImpliedScopes(@q0 O o4) {
            return Collections.emptyList();
        }

        @KeepForSdk
        public int getPriority() {
            return Integer.MAX_VALUE;
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
    @KeepForSdk
    public interface Client extends AnyClient {
        @KeepForSdk
        void connect(@o0 BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks);

        @KeepForSdk
        void disconnect();

        @KeepForSdk
        void disconnect(@o0 String str);

        @KeepForSdk
        void dump(@o0 String str, @q0 FileDescriptor fileDescriptor, @o0 PrintWriter printWriter, @q0 String[] strArr);

        @o0
        @KeepForSdk
        Feature[] getAvailableFeatures();

        @o0
        @KeepForSdk
        String getEndpointPackageName();

        @q0
        @KeepForSdk
        String getLastDisconnectMessage();

        @KeepForSdk
        int getMinApkVersion();

        @KeepForSdk
        void getRemoteService(@q0 IAccountAccessor iAccountAccessor, @q0 Set<Scope> set);

        @o0
        @KeepForSdk
        Feature[] getRequiredFeatures();

        @o0
        @KeepForSdk
        Set<Scope> getScopesForConnectionlessNonSignIn();

        @q0
        @KeepForSdk
        IBinder getServiceBrokerBinder();

        @o0
        @KeepForSdk
        Intent getSignInIntent();

        @KeepForSdk
        boolean isConnected();

        @KeepForSdk
        boolean isConnecting();

        @KeepForSdk
        void onUserSignOut(@o0 BaseGmsClient.SignOutCallbacks signOutCallbacks);

        @KeepForSdk
        boolean providesSignIn();

        @KeepForSdk
        boolean requiresAccount();

        @KeepForSdk
        boolean requiresGooglePlayServices();

        @KeepForSdk
        boolean requiresSignIn();
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
    @KeepForSdk
    public static final class ClientKey<C extends Client> extends AnyClientKey<C> {
    }

    @KeepForSdk
    public <C extends Client> Api(@o0 String str, @o0 AbstractClientBuilder<C, O> abstractClientBuilder, @o0 ClientKey<C> clientKey) {
        Preconditions.checkNotNull(abstractClientBuilder, ProtectedSandApp.s("즣"));
        Preconditions.checkNotNull(clientKey, ProtectedSandApp.s("즤"));
        this.zac = str;
        this.zaa = abstractClientBuilder;
        this.zab = clientKey;
    }

    @o0
    public final AbstractClientBuilder zaa() {
        return this.zaa;
    }

    @o0
    public final AnyClientKey zab() {
        return this.zab;
    }

    @o0
    public final BaseClientBuilder zac() {
        return this.zaa;
    }

    @o0
    public final String zad() {
        return this.zac;
    }
}
