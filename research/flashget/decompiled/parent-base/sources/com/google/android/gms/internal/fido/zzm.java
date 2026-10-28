package com.google.android.gms.internal.fido;

import android.app.PendingIntent;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.q0;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes5.dex */
public interface zzm extends IInterface {
    void zzb(Status status, @q0 PendingIntent pendingIntent) throws RemoteException;
}
