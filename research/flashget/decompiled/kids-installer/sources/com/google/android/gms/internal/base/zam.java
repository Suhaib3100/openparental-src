package com.google.android.gms.internal.base;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes2.dex */
public interface zam {
    ExecutorService zaa(ThreadFactory threadFactory, int i5);

    ExecutorService zab(int i5, int i6);

    ExecutorService zac(int i5, ThreadFactory threadFactory, int i6);
}
