package com.lyft.kronos.internal.ntp;

import java.util.concurrent.ThreadFactory;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class j implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread h4;
        h4 = k.h(runnable);
        return h4;
    }
}
