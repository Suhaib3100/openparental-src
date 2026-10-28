package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
@KeepForSdk
/* loaded from: classes5.dex */
public abstract class RegisterListenerMethod<A extends Api.AnyClient, L> {
    private final ListenerHolder zaa;

    @q0
    private final Feature[] zab;
    private final boolean zac;
    private final int zad;

    @KeepForSdk
    protected RegisterListenerMethod(@o0 ListenerHolder<L> listenerHolder, @q0 Feature[] featureArr, boolean z4, int i4) {
        this.zaa = listenerHolder;
        this.zab = featureArr;
        this.zac = z4;
        this.zad = i4;
    }

    @KeepForSdk
    public void clearListener() {
        this.zaa.clear();
    }

    @q0
    @KeepForSdk
    public ListenerHolder.ListenerKey<L> getListenerKey() {
        return this.zaa.getListenerKey();
    }

    @q0
    @KeepForSdk
    public Feature[] getRequiredFeatures() {
        return this.zab;
    }

    @KeepForSdk
    protected abstract void registerListener(@o0 A a5, @o0 TaskCompletionSource<Void> taskCompletionSource) throws RemoteException;

    public final int zaa() {
        return this.zad;
    }

    public final boolean zab() {
        return this.zac;
    }

    @KeepForSdk
    protected RegisterListenerMethod(@o0 ListenerHolder<L> listenerHolder) {
        this(listenerHolder, null, false, 0);
    }

    @KeepForSdk
    protected RegisterListenerMethod(@o0 ListenerHolder<L> listenerHolder, @o0 Feature[] featureArr, boolean z4) {
        this(listenerHolder, featureArr, z4, 0);
    }
}
