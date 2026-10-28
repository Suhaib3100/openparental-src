package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: classes2.dex */
public class BaseImplementation {

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @KeepForSdk
    public interface ResultHolder<R> {
        @KeepForSdk
        void setFailedResult(@o0 Status status);

        @KeepForSdk
        void setResult(@o0 R r5);
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @KeepForSdk
    /* loaded from: classes3.dex */
    public static abstract class ApiMethodImpl<R extends Result, A extends Api.AnyClient> extends BasePendingResult<R> implements ResultHolder<R> {

        @q0
        @KeepForSdk
        private final Api<?> mApi;

        @KeepForSdk
        private final Api.AnyClientKey<A> mClientKey;

        @KeepForSdk
        @Deprecated
        protected ApiMethodImpl(@o0 Api.AnyClientKey<A> anyClientKey, @o0 GoogleApiClient googleApiClient) {
            super((GoogleApiClient) Preconditions.checkNotNull(googleApiClient, ProtectedSandApp.s("↙")));
            this.mClientKey = (Api.AnyClientKey) Preconditions.checkNotNull(anyClientKey);
            this.mApi = null;
        }

        @KeepForSdk
        private void setFailedResult(@o0 RemoteException remoteException) {
            setFailedResult(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
        }

        @KeepForSdk
        protected abstract void doExecute(@o0 A a6) throws RemoteException;

        @q0
        @KeepForSdk
        public final Api<?> getApi() {
            return this.mApi;
        }

        @o0
        @KeepForSdk
        public final Api.AnyClientKey<A> getClientKey() {
            return this.mClientKey;
        }

        @KeepForSdk
        protected void onSetFailedResult(@o0 R r5) {
        }

        @KeepForSdk
        public final void run(@o0 A a6) throws DeadObjectException {
            try {
                doExecute(a6);
            } catch (DeadObjectException e6) {
                setFailedResult(e6);
                throw e6;
            } catch (RemoteException e7) {
                setFailedResult(e7);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
        @KeepForSdk
        public /* bridge */ /* synthetic */ void setResult(@o0 Object obj) {
            super.setResult((ApiMethodImpl<R, A>) obj);
        }

        @KeepForSdk
        protected ApiMethodImpl(@o0 Api<?> api, @o0 GoogleApiClient googleApiClient) {
            super((GoogleApiClient) Preconditions.checkNotNull(googleApiClient, ProtectedSandApp.s("↚")));
            Preconditions.checkNotNull(api, ProtectedSandApp.s("↛"));
            this.mClientKey = (Api.AnyClientKey<A>) api.zab();
            this.mApi = api;
        }

        @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
        @KeepForSdk
        public final void setFailedResult(@o0 Status status) {
            Preconditions.checkArgument(!status.isSuccess(), ProtectedSandApp.s("↜"));
            R createFailedResult = createFailedResult(status);
            setResult((ApiMethodImpl<R, A>) createFailedResult);
            onSetFailedResult(createFailedResult);
        }

        @KeepForSdk
        @m1
        protected ApiMethodImpl(@o0 BasePendingResult.CallbackHandler<R> callbackHandler) {
            super(callbackHandler);
            this.mClientKey = new Api.AnyClientKey<>();
            this.mApi = null;
        }
    }
}
