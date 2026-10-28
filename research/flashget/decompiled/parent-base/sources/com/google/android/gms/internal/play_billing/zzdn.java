package com.google.android.gms.internal.play_billing;

import java.util.concurrent.TimeoutException;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
final class zzdn extends TimeoutException {
    /* synthetic */ zzdn(String str, zzdo zzdoVar) {
        super(str);
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
