package com.google.android.gms.common.api.internal;

import androidx.annotation.o0;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes5.dex */
public final class zaci {
    public final RegisterListenerMethod zaa;
    public final UnregisterListenerMethod zab;
    public final Runnable zac;

    public zaci(@o0 RegisterListenerMethod registerListenerMethod, @o0 UnregisterListenerMethod unregisterListenerMethod, @o0 Runnable runnable) {
        this.zaa = registerListenerMethod;
        this.zab = unregisterListenerMethod;
        this.zac = runnable;
    }
}
