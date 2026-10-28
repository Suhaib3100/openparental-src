package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.o0;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
@KeepForSdk
/* loaded from: classes5.dex */
public abstract class UnregisterListenerMethod<A extends Api.AnyClient, L> {
    private final ListenerHolder.ListenerKey zaa;

    @KeepForSdk
    protected UnregisterListenerMethod(@o0 ListenerHolder.ListenerKey<L> listenerKey) {
        this.zaa = listenerKey;
    }

    @o0
    @KeepForSdk
    public ListenerHolder.ListenerKey<L> getListenerKey() {
        return this.zaa;
    }

    @KeepForSdk
    protected abstract void unregisterListener(@o0 A a5, @o0 TaskCompletionSource<Boolean> taskCompletionSource) throws RemoteException;
}
