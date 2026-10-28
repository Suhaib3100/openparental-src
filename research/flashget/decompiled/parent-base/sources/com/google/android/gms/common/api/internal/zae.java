package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import androidx.annotation.o0;
import androidx.compose.material3.z3;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes5.dex */
public final class zae extends zai {
    protected final BaseImplementation.ApiMethodImpl zaa;

    public zae(int i4, BaseImplementation.ApiMethodImpl apiMethodImpl) {
        super(i4);
        this.zaa = (BaseImplementation.ApiMethodImpl) Preconditions.checkNotNull(apiMethodImpl, ProtectedSandApp.s("쩼"));
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zad(@o0 Status status) {
        try {
            this.zaa.setFailedResult(status);
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zae(@o0 Exception exc) {
        try {
            this.zaa.setFailedResult(new Status(10, z3.a(exc.getClass().getSimpleName(), ProtectedSandApp.s("쩽"), exc.getLocalizedMessage())));
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zaf(zabq zabqVar) throws DeadObjectException {
        try {
            this.zaa.run(zabqVar.zaf());
        } catch (RuntimeException e4) {
            zae(e4);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zag(@o0 zaad zaadVar, boolean z4) {
        zaadVar.zac(this.zaa, z4);
    }
}
