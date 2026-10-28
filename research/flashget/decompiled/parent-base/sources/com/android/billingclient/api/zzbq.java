package com.android.billingclient.api;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import java.util.Objects;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes3.dex */
final class zzbq extends ResultReceiver {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ n0 f40803b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbq(m mVar, Handler handler, n0 n0Var) {
        super(handler);
        this.f40803b = n0Var;
        Objects.requireNonNull(mVar);
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i4, @androidx.annotation.q0 Bundle bundle) {
        this.f40803b.a(o0.c(bundle));
    }
}
