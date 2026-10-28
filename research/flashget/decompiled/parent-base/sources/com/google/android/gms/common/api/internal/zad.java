package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.o0;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes5.dex */
abstract class zad extends zac {
    protected final TaskCompletionSource zaa;

    public zad(int i4, TaskCompletionSource taskCompletionSource) {
        super(i4);
        this.zaa = taskCompletionSource;
    }

    protected abstract void zac(zabq zabqVar) throws RemoteException;

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zad(@o0 Status status) {
        this.zaa.trySetException(new ApiException(status));
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zae(@o0 Exception exc) {
        this.zaa.trySetException(exc);
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zaf(zabq zabqVar) throws DeadObjectException {
        try {
            zac(zabqVar);
        } catch (DeadObjectException e4) {
            zad(zai.zah(e4));
            throw e4;
        } catch (RemoteException e5) {
            zad(zai.zah(e5));
        } catch (RuntimeException e6) {
            this.zaa.trySetException(e6);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public void zag(@o0 zaad zaadVar, boolean z4) {
    }
}
