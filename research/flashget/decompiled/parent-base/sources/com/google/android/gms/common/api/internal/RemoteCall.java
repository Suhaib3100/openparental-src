package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.o0;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
@KeepForSdk
/* loaded from: classes5.dex */
public interface RemoteCall<T, U> {
    @KeepForSdk
    void accept(@o0 T t4, @o0 U u4) throws RemoteException;
}
