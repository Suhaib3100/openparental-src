package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import androidx.annotation.o0;
import androidx.fragment.app.e0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes3.dex */
public final class zae<A extends BaseImplementation.ApiMethodImpl<? extends Result, Api.AnyClient>> extends zai {
    protected final A zaa;

    public zae(int i5, A a6) {
        super(i5);
        this.zaa = (A) Preconditions.checkNotNull(a6, ProtectedSandApp.s("∗"));
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
        String simpleName = exc.getClass().getSimpleName();
        String localizedMessage = exc.getLocalizedMessage();
        try {
            this.zaa.setFailedResult(new Status(10, e0.a(new StringBuilder(simpleName.length() + 2 + String.valueOf(localizedMessage).length()), simpleName, ProtectedSandApp.s("∘"), localizedMessage)));
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zaf(zabq<?> zabqVar) throws DeadObjectException {
        try {
            this.zaa.run(zabqVar.zaf());
        } catch (RuntimeException e6) {
            zae(e6);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zag(@o0 zaad zaadVar, boolean z5) {
        zaadVar.zac(this.zaa, z5);
    }
}
