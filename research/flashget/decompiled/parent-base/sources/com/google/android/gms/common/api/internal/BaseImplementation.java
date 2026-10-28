package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
@KeepForSdk
/* loaded from: classes5.dex */
public class BaseImplementation {

    /* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
    @KeepForSdk
    public interface ResultHolder<R> {
        @KeepForSdk
        void setFailedResult(@o0 Status status);

        @KeepForSdk
        void setResult(@o0 R r4);
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
    @KeepForSdk
    public static abstract class ApiMethodImpl<R extends Result, A extends Api.AnyClient> extends BasePendingResult<R> implements ResultHolder<R> {

        @q0
        @KeepForSdk
        private final Api<?> api;

        @KeepForSdk
        private final Api.AnyClientKey<A> clientKey;

        @KeepForSdk
        @Deprecated
        protected ApiMethodImpl(@o0 Api.AnyClientKey<A> anyClientKey, @o0 GoogleApiClient googleApiClient) {
            super((GoogleApiClient) Preconditions.checkNotNull(googleApiClient, ProtectedSandApp.s("졭")));
            this.clientKey = (Api.AnyClientKey) Preconditions.checkNotNull(anyClientKey);
            this.api = null;
        }

        @KeepForSdk
        private void setFailedResult(@o0 RemoteException remoteException) {
            setFailedResult(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
        }

        @KeepForSdk
        protected abstract void doExecute(@o0 A a5) throws RemoteException;

        @q0
        @KeepForSdk
        public final Api<?> getApi() {
            return this.api;
        }

        @o0
        @KeepForSdk
        public final Api.AnyClientKey<A> getClientKey() {
            return this.clientKey;
        }

        @KeepForSdk
        protected void onSetFailedResult(@o0 R r4) {
        }

        @KeepForSdk
        public final void run(@o0 A a5) throws DeadObjectException {
            try {
                doExecute(a5);
            } catch (DeadObjectException e4) {
                setFailedResult(e4);
                throw e4;
            } catch (RemoteException e5) {
                setFailedResult(e5);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @KeepForSdk
        public /* bridge */ /* synthetic */ void setResult(@o0 Object obj) {
            setResult((ApiMethodImpl<R, A>) obj);
        }

        @KeepForSdk
        protected ApiMethodImpl(@o0 Api<?> api, @o0 GoogleApiClient googleApiClient) {
            super((GoogleApiClient) Preconditions.checkNotNull(googleApiClient, ProtectedSandApp.s("졭")));
            Preconditions.checkNotNull(api, ProtectedSandApp.s("졮"));
            this.clientKey = api.zab();
            this.api = api;
        }

        @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
        @KeepForSdk
        public final void setFailedResult(@o0 Status status) {
            Preconditions.checkArgument(!status.isSuccess(), ProtectedSandApp.s("졯"));
            R createFailedResult = createFailedResult(status);
            setResult((ApiMethodImpl<R, A>) createFailedResult);
            onSetFailedResult(createFailedResult);
        }

        @KeepForSdk
        @m1
        protected ApiMethodImpl(@o0 BasePendingResult.CallbackHandler<R> callbackHandler) {
            super(callbackHandler);
            this.clientKey = new Api.AnyClientKey<>();
            this.api = null;
        }
    }
}
