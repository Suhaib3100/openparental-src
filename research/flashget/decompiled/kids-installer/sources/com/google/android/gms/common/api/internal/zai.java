package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes2.dex */
public abstract class zai {
    public final int zac;

    public zai(int i5) {
        this.zac = i5;
    }

    static /* bridge */ /* synthetic */ Status zah(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ProtectedSandApp.s("ଏ") + remoteException.getLocalizedMessage());
    }

    public abstract void zad(@o0 Status status);

    public abstract void zae(@o0 Exception exc);

    public abstract void zaf(zabq<?> zabqVar) throws DeadObjectException;

    public abstract void zag(@o0 zaad zaadVar, boolean z5);
}
