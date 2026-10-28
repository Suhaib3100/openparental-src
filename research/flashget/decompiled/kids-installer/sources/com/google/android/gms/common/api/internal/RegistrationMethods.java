package com.google.android.gms.common.api.internal;

import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: classes2.dex */
public class RegistrationMethods<A extends Api.AnyClient, L> {

    @o0
    @KeepForSdk
    public final RegisterListenerMethod<A, L> register;

    @o0
    public final UnregisterListenerMethod<A, L> zaa;

    @o0
    public final Runnable zab;

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @KeepForSdk
    public static class Builder<A extends Api.AnyClient, L> {
        private RemoteCall<A, TaskCompletionSource<Void>> zaa;
        private RemoteCall<A, TaskCompletionSource<Boolean>> zab;
        private ListenerHolder<L> zad;
        private Feature[] zae;
        private int zag;
        private Runnable zac = zacj.zaa;
        private boolean zaf = true;

        private Builder() {
        }

        @o0
        @KeepForSdk
        public RegistrationMethods<A, L> build() {
            Preconditions.checkArgument(this.zaa != null, ProtectedSandApp.s("૾"));
            Preconditions.checkArgument(this.zab != null, ProtectedSandApp.s("૿"));
            Preconditions.checkArgument(this.zad != null, ProtectedSandApp.s("\u0b00"));
            return new RegistrationMethods<>(new zack(this, this.zad, this.zae, this.zaf, this.zag), new zacl(this, (ListenerHolder.ListenerKey) Preconditions.checkNotNull(this.zad.getListenerKey(), ProtectedSandApp.s("ଁ"))), this.zac, null);
        }

        @o0
        @KeepForSdk
        public Builder<A, L> onConnectionSuspended(@o0 Runnable runnable) {
            this.zac = runnable;
            return this;
        }

        @o0
        @KeepForSdk
        public Builder<A, L> register(@o0 RemoteCall<A, TaskCompletionSource<Void>> remoteCall) {
            this.zaa = remoteCall;
            return this;
        }

        @o0
        @KeepForSdk
        public Builder<A, L> setAutoResolveMissingFeatures(boolean z5) {
            this.zaf = z5;
            return this;
        }

        @o0
        @KeepForSdk
        public Builder<A, L> setFeatures(@o0 Feature... featureArr) {
            this.zae = featureArr;
            return this;
        }

        @o0
        @KeepForSdk
        public Builder<A, L> setMethodKey(int i5) {
            this.zag = i5;
            return this;
        }

        @o0
        @KeepForSdk
        public Builder<A, L> unregister(@o0 RemoteCall<A, TaskCompletionSource<Boolean>> remoteCall) {
            this.zab = remoteCall;
            return this;
        }

        @o0
        @KeepForSdk
        public Builder<A, L> withHolder(@o0 ListenerHolder<L> listenerHolder) {
            this.zad = listenerHolder;
            return this;
        }

        /* synthetic */ Builder(zacm zacmVar) {
        }
    }

    /* synthetic */ RegistrationMethods(RegisterListenerMethod registerListenerMethod, UnregisterListenerMethod unregisterListenerMethod, Runnable runnable, zacn zacnVar) {
        this.register = registerListenerMethod;
        this.zaa = unregisterListenerMethod;
        this.zab = runnable;
    }

    @o0
    @KeepForSdk
    public static <A extends Api.AnyClient, L> Builder<A, L> builder() {
        return new Builder<>(null);
    }
}
