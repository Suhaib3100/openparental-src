package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.tasks.TaskCompletionSource;
import f9.a;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
@KeepForSdk
/* loaded from: classes5.dex */
public abstract class TaskApiCall<A extends Api.AnyClient, ResultT> {

    @q0
    private final Feature[] zaa;
    private final boolean zab;
    private final int zac;

    /* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
    @KeepForSdk
    public static class Builder<A extends Api.AnyClient, ResultT> {
        private RemoteCall zaa;
        private Feature[] zac;
        private boolean zab = true;
        private int zad = 0;

        private Builder() {
        }

        @o0
        @KeepForSdk
        public TaskApiCall<A, ResultT> build() {
            Preconditions.checkArgument(this.zaa != null, ProtectedSandApp.s("쨌"));
            return new zacv(this, this.zac, this.zab, this.zad);
        }

        @a
        @Deprecated
        @o0
        @KeepForSdk
        public Builder<A, ResultT> execute(@o0 final BiConsumer<A, TaskCompletionSource<ResultT>> biConsumer) {
            this.zaa = new RemoteCall() { // from class: com.google.android.gms.common.api.internal.zacu
                @Override // com.google.android.gms.common.api.internal.RemoteCall
                public final void accept(Object obj, Object obj2) {
                    BiConsumer.this.accept((Api.AnyClient) obj, (TaskCompletionSource) obj2);
                }
            };
            return this;
        }

        @o0
        @KeepForSdk
        @a
        public Builder<A, ResultT> run(@o0 RemoteCall<A, TaskCompletionSource<ResultT>> remoteCall) {
            this.zaa = remoteCall;
            return this;
        }

        @o0
        @KeepForSdk
        @a
        public Builder<A, ResultT> setAutoResolveMissingFeatures(boolean z4) {
            this.zab = z4;
            return this;
        }

        @o0
        @KeepForSdk
        @a
        public Builder<A, ResultT> setFeatures(@o0 Feature... featureArr) {
            this.zac = featureArr;
            return this;
        }

        @o0
        @KeepForSdk
        @a
        public Builder<A, ResultT> setMethodKey(int i4) {
            this.zad = i4;
            return this;
        }

        /* synthetic */ Builder(zacw zacwVar) {
        }
    }

    @KeepForSdk
    @Deprecated
    public TaskApiCall() {
        this.zaa = null;
        this.zab = false;
        this.zac = 0;
    }

    @o0
    @KeepForSdk
    public static <A extends Api.AnyClient, ResultT> Builder<A, ResultT> builder() {
        return new Builder<>(null);
    }

    @KeepForSdk
    protected abstract void doExecute(@o0 A a5, @o0 TaskCompletionSource<ResultT> taskCompletionSource) throws RemoteException;

    @KeepForSdk
    public boolean shouldAutoResolveMissingFeatures() {
        return this.zab;
    }

    public final int zaa() {
        return this.zac;
    }

    @q0
    public final Feature[] zab() {
        return this.zaa;
    }

    @KeepForSdk
    protected TaskApiCall(@q0 Feature[] featureArr, boolean z4, int i4) {
        this.zaa = featureArr;
        boolean z5 = false;
        if (featureArr != null && z4) {
            z5 = true;
        }
        this.zab = z5;
        this.zac = i4;
    }
}
