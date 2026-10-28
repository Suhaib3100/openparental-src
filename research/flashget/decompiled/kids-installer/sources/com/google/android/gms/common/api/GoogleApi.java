package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.l0;
import androidx.annotation.n1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.NonGmsServiceBrokerClient;
import com.google.android.gms.common.api.internal.RegisterListenerMethod;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.UnregisterListenerMethod;
import com.google.android.gms.common.api.internal.zaae;
import com.google.android.gms.common.api.internal.zabq;
import com.google.android.gms.common.api.internal.zabv;
import com.google.android.gms.common.api.internal.zact;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Set;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: classes3.dex */
public abstract class GoogleApi<O extends Api.ApiOptions> implements HasApiKey<O> {

    @o0
    protected final GoogleApiManager zaa;
    private final Context zab;

    @q0
    private final String zac;
    private final Api<O> zad;
    private final O zae;
    private final ApiKey<O> zaf;
    private final Looper zag;
    private final int zah;

    @NotOnlyInitialized
    private final GoogleApiClient zai;
    private final StatusExceptionMapper zaj;

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @KeepForSdk
    /* loaded from: classes2.dex */
    public static class Settings {

        @o0
        @KeepForSdk
        public static final Settings DEFAULT_SETTINGS = new Builder().build();

        @o0
        public final StatusExceptionMapper zaa;

        @o0
        public final Looper zab;

        /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
        @KeepForSdk
        public static class Builder {
            private StatusExceptionMapper zaa;
            private Looper zab;

            @KeepForSdk
            public Builder() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @o0
            @KeepForSdk
            public Settings build() {
                if (this.zaa == null) {
                    this.zaa = new ApiExceptionMapper();
                }
                if (this.zab == null) {
                    this.zab = Looper.getMainLooper();
                }
                return new Settings(this.zaa, this.zab);
            }

            @o0
            @KeepForSdk
            public Builder setLooper(@o0 Looper looper) {
                Preconditions.checkNotNull(looper, ProtectedSandApp.s("ઞ"));
                this.zab = looper;
                return this;
            }

            @o0
            @KeepForSdk
            public Builder setMapper(@o0 StatusExceptionMapper statusExceptionMapper) {
                Preconditions.checkNotNull(statusExceptionMapper, ProtectedSandApp.s("ટ"));
                this.zaa = statusExceptionMapper;
                return this;
            }
        }

        @KeepForSdk
        private Settings(StatusExceptionMapper statusExceptionMapper, Account account, Looper looper) {
            this.zaa = statusExceptionMapper;
            this.zab = looper;
        }
    }

    @KeepForSdk
    @l0
    public GoogleApi(@o0 Activity activity, @o0 Api<O> api, @o0 O o5, @o0 Settings settings) {
        this(activity, activity, api, o5, settings);
    }

    private final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T zad(int i5, @o0 T t5) {
        t5.zak();
        this.zaa.zaw(this, i5, t5);
        return t5;
    }

    private final <TResult, A extends Api.AnyClient> Task<TResult> zae(int i5, @o0 TaskApiCall<A, TResult> taskApiCall) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.zaa.zax(this, i5, taskApiCall, taskCompletionSource, this.zaj);
        return taskCompletionSource.getTask();
    }

    @o0
    @KeepForSdk
    public GoogleApiClient asGoogleApiClient() {
        return this.zai;
    }

    @o0
    @KeepForSdk
    protected ClientSettings.Builder createClientSettingsBuilder() {
        Account account;
        Set<Scope> emptySet;
        GoogleSignInAccount googleSignInAccount;
        ClientSettings.Builder builder = new ClientSettings.Builder();
        O o5 = this.zae;
        if (!(o5 instanceof Api.ApiOptions.HasGoogleSignInAccountOptions) || (googleSignInAccount = ((Api.ApiOptions.HasGoogleSignInAccountOptions) o5).getGoogleSignInAccount()) == null) {
            O o6 = this.zae;
            account = o6 instanceof Api.ApiOptions.HasAccountOptions ? ((Api.ApiOptions.HasAccountOptions) o6).getAccount() : null;
        } else {
            account = googleSignInAccount.getAccount();
        }
        builder.zab(account);
        O o7 = this.zae;
        if (o7 instanceof Api.ApiOptions.HasGoogleSignInAccountOptions) {
            GoogleSignInAccount googleSignInAccount2 = ((Api.ApiOptions.HasGoogleSignInAccountOptions) o7).getGoogleSignInAccount();
            emptySet = googleSignInAccount2 == null ? Collections.emptySet() : googleSignInAccount2.getRequestedScopes();
        } else {
            emptySet = Collections.emptySet();
        }
        builder.zaa(emptySet);
        builder.zac(this.zab.getClass().getName());
        builder.setRealClientPackageName(this.zab.getPackageName());
        return builder;
    }

    @o0
    @KeepForSdk
    protected Task<Boolean> disconnectService() {
        return this.zaa.zap(this);
    }

    @o0
    @KeepForSdk
    public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T doBestEffortWrite(@o0 T t5) {
        zad(2, t5);
        return t5;
    }

    @o0
    @KeepForSdk
    public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T doRead(@o0 T t5) {
        zad(0, t5);
        return t5;
    }

    @o0
    @KeepForSdk
    @Deprecated
    public <A extends Api.AnyClient, T extends RegisterListenerMethod<A, ?>, U extends UnregisterListenerMethod<A, ?>> Task<Void> doRegisterEventListener(@o0 T t5, @o0 U u5) {
        Preconditions.checkNotNull(t5);
        Preconditions.checkNotNull(u5);
        ListenerHolder.ListenerKey listenerKey = t5.getListenerKey();
        String s5 = ProtectedSandApp.s("←");
        Preconditions.checkNotNull(listenerKey, s5);
        Preconditions.checkNotNull(u5.getListenerKey(), s5);
        Preconditions.checkArgument(Objects.equal(t5.getListenerKey(), u5.getListenerKey()), ProtectedSandApp.s("↑"));
        return this.zaa.zaq(this, t5, u5, new Runnable() { // from class: com.google.android.gms.common.api.zad
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
    }

    @o0
    @KeepForSdk
    public Task<Boolean> doUnregisterEventListener(@o0 ListenerHolder.ListenerKey<?> listenerKey) {
        return doUnregisterEventListener(listenerKey, 0);
    }

    @o0
    @KeepForSdk
    public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T doWrite(@o0 T t5) {
        zad(1, t5);
        return t5;
    }

    @Override // com.google.android.gms.common.api.HasApiKey
    @o0
    public final ApiKey<O> getApiKey() {
        return this.zaf;
    }

    @o0
    @KeepForSdk
    public O getApiOptions() {
        return this.zae;
    }

    @o0
    @KeepForSdk
    public Context getApplicationContext() {
        return this.zab;
    }

    @q0
    @KeepForSdk
    protected String getContextAttributionTag() {
        return this.zac;
    }

    @q0
    @KeepForSdk
    @Deprecated
    protected String getContextFeatureId() {
        return this.zac;
    }

    @o0
    @KeepForSdk
    public Looper getLooper() {
        return this.zag;
    }

    @o0
    @KeepForSdk
    public <L> ListenerHolder<L> registerListener(@o0 L l5, @o0 String str) {
        return ListenerHolders.createListenerHolder(l5, this.zag, str);
    }

    public final int zaa() {
        return this.zah;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n1
    public final Api.Client zab(Looper looper, zabq<O> zabqVar) {
        Api.Client buildClient = ((Api.AbstractClientBuilder) Preconditions.checkNotNull(this.zad.zaa())).buildClient(this.zab, looper, createClientSettingsBuilder().build(), (ClientSettings) this.zae, (GoogleApiClient.ConnectionCallbacks) zabqVar, (GoogleApiClient.OnConnectionFailedListener) zabqVar);
        String contextAttributionTag = getContextAttributionTag();
        if (contextAttributionTag != null && (buildClient instanceof BaseGmsClient)) {
            ((BaseGmsClient) buildClient).setAttributionTag(contextAttributionTag);
        }
        if (contextAttributionTag != null && (buildClient instanceof NonGmsServiceBrokerClient)) {
            ((NonGmsServiceBrokerClient) buildClient).zac(contextAttributionTag);
        }
        return buildClient;
    }

    public final zact zac(Context context, Handler handler) {
        return new zact(context, handler, createClientSettingsBuilder().build());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public GoogleApi(@androidx.annotation.o0 android.app.Activity r2, @androidx.annotation.o0 com.google.android.gms.common.api.Api<O> r3, @androidx.annotation.o0 O r4, @androidx.annotation.o0 com.google.android.gms.common.api.internal.StatusExceptionMapper r5) {
        /*
            r1 = this;
            com.google.android.gms.common.api.GoogleApi$Settings$Builder r0 = new com.google.android.gms.common.api.GoogleApi$Settings$Builder
            r0.<init>()
            r0.setMapper(r5)
            android.os.Looper r5 = r2.getMainLooper()
            r0.setLooper(r5)
            com.google.android.gms.common.api.GoogleApi$Settings r5 = r0.build()
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.GoogleApi.<init>(android.app.Activity, com.google.android.gms.common.api.Api, com.google.android.gms.common.api.Api$ApiOptions, com.google.android.gms.common.api.internal.StatusExceptionMapper):void");
    }

    @o0
    @KeepForSdk
    public <TResult, A extends Api.AnyClient> Task<TResult> doBestEffortWrite(@o0 TaskApiCall<A, TResult> taskApiCall) {
        return zae(2, taskApiCall);
    }

    @o0
    @KeepForSdk
    public <TResult, A extends Api.AnyClient> Task<TResult> doRead(@o0 TaskApiCall<A, TResult> taskApiCall) {
        return zae(0, taskApiCall);
    }

    @o0
    @KeepForSdk
    public Task<Boolean> doUnregisterEventListener(@o0 ListenerHolder.ListenerKey<?> listenerKey, int i5) {
        Preconditions.checkNotNull(listenerKey, ProtectedSandApp.s("↓"));
        return this.zaa.zar(this, listenerKey, i5);
    }

    @o0
    @KeepForSdk
    public <TResult, A extends Api.AnyClient> Task<TResult> doWrite(@o0 TaskApiCall<A, TResult> taskApiCall) {
        return zae(1, taskApiCall);
    }

    private GoogleApi(@o0 Context context, @q0 Activity activity, Api<O> api, O o5, Settings settings) {
        Preconditions.checkNotNull(context, ProtectedSandApp.s("\u218c"));
        Preconditions.checkNotNull(api, ProtectedSandApp.s("\u218d"));
        Preconditions.checkNotNull(settings, ProtectedSandApp.s("\u218e"));
        this.zab = context.getApplicationContext();
        String str = null;
        if (PlatformVersion.isAtLeastR()) {
            try {
                str = (String) Context.class.getMethod(ProtectedSandApp.s("\u218f"), new Class[0]).invoke(context, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.zac = str;
        this.zad = api;
        this.zae = o5;
        this.zag = settings.zab;
        ApiKey<O> zaa = ApiKey.zaa(api, o5, str);
        this.zaf = zaa;
        this.zai = new zabv(this);
        GoogleApiManager zam = GoogleApiManager.zam(this.zab);
        this.zaa = zam;
        this.zah = zam.zaa();
        this.zaj = settings.zaa;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            zaae.zad(activity, zam, zaa);
        }
        zam.zaB(this);
    }

    @o0
    @KeepForSdk
    public <A extends Api.AnyClient> Task<Void> doRegisterEventListener(@o0 RegistrationMethods<A, ?> registrationMethods) {
        Preconditions.checkNotNull(registrationMethods);
        ListenerHolder.ListenerKey<?> listenerKey = registrationMethods.register.getListenerKey();
        String s5 = ProtectedSandApp.s("→");
        Preconditions.checkNotNull(listenerKey, s5);
        Preconditions.checkNotNull(registrationMethods.zaa.getListenerKey(), s5);
        return this.zaa.zaq(this, registrationMethods.register, registrationMethods.zaa, registrationMethods.zab);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public GoogleApi(@androidx.annotation.o0 android.content.Context r2, @androidx.annotation.o0 com.google.android.gms.common.api.Api<O> r3, @androidx.annotation.o0 O r4, @androidx.annotation.o0 android.os.Looper r5, @androidx.annotation.o0 com.google.android.gms.common.api.internal.StatusExceptionMapper r6) {
        /*
            r1 = this;
            com.google.android.gms.common.api.GoogleApi$Settings$Builder r0 = new com.google.android.gms.common.api.GoogleApi$Settings$Builder
            r0.<init>()
            r0.setLooper(r5)
            r0.setMapper(r6)
            com.google.android.gms.common.api.GoogleApi$Settings r5 = r0.build()
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.GoogleApi.<init>(android.content.Context, com.google.android.gms.common.api.Api, com.google.android.gms.common.api.Api$ApiOptions, android.os.Looper, com.google.android.gms.common.api.internal.StatusExceptionMapper):void");
    }

    @KeepForSdk
    public GoogleApi(@o0 Context context, @o0 Api<O> api, @o0 O o5, @o0 Settings settings) {
        this(context, (Activity) null, api, o5, settings);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public GoogleApi(@androidx.annotation.o0 android.content.Context r2, @androidx.annotation.o0 com.google.android.gms.common.api.Api<O> r3, @androidx.annotation.o0 O r4, @androidx.annotation.o0 com.google.android.gms.common.api.internal.StatusExceptionMapper r5) {
        /*
            r1 = this;
            com.google.android.gms.common.api.GoogleApi$Settings$Builder r0 = new com.google.android.gms.common.api.GoogleApi$Settings$Builder
            r0.<init>()
            r0.setMapper(r5)
            com.google.android.gms.common.api.GoogleApi$Settings r5 = r0.build()
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.GoogleApi.<init>(android.content.Context, com.google.android.gms.common.api.Api, com.google.android.gms.common.api.Api$ApiOptions, com.google.android.gms.common.api.internal.StatusExceptionMapper):void");
    }
}
