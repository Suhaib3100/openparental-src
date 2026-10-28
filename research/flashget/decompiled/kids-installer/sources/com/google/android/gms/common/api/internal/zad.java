package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.o0;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes3.dex */
abstract class zad<T> extends zac {
    protected final TaskCompletionSource<T> zaa;

    public zad(int i5, TaskCompletionSource<T> taskCompletionSource) {
        super(i5);
        this.zaa = taskCompletionSource;
    }

    protected abstract void zac(zabq<?> zabqVar) throws RemoteException;

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zad(@o0 Status status) {
        this.zaa.trySetException(new ApiException(status));
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zae(@o0 Exception exc) {
        this.zaa.trySetException(exc);
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zaf(zabq<?> zabqVar) throws DeadObjectException {
        try {
            zac(zabqVar);
        } catch (DeadObjectException e6) {
            zad(zai.zah(e6));
            throw e6;
        } catch (RemoteException e7) {
            zad(zai.zah(e7));
        } catch (RuntimeException e8) {
            this.zaa.trySetException(e8);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public void zag(@o0 zaad zaadVar, boolean z5) {
    }
}
