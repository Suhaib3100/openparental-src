package com.google.android.gms.internal.auth;

import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.q0;
import com.google.android.gms.auth.AccountChangeEventsResponse;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes5.dex */
public interface zzm extends IInterface {
    void zzb(Status status, @q0 AccountChangeEventsResponse accountChangeEventsResponse) throws RemoteException;
}
