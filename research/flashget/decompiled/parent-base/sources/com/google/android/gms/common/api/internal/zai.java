package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes5.dex */
public abstract class zai {
    public final int zac;

    public zai(int i4) {
        this.zac = i4;
    }

    static /* bridge */ /* synthetic */ Status zah(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ProtectedSandApp.s("쩧") + remoteException.getLocalizedMessage());
    }

    public abstract void zad(@o0 Status status);

    public abstract void zae(@o0 Exception exc);

    public abstract void zaf(zabq zabqVar) throws DeadObjectException;

    public abstract void zag(@o0 zaad zaadVar, boolean z4);
}
