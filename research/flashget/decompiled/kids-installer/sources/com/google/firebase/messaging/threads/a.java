package com.google.firebase.messaging.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import x1.d;

/* compiled from: ExecutorFactory.java */
/* loaded from: classes2.dex */
public interface a {
    ExecutorService a(c cVar);

    ExecutorService b(c cVar);

    Future<?> c(@d String str, @d String str2, c cVar, Runnable runnable);

    void d(@d String str, @d String str2, c cVar, Runnable runnable);

    ScheduledExecutorService e(int i5, ThreadFactory threadFactory, c cVar);

    ScheduledExecutorService f(int i5, c cVar);

    ExecutorService g(int i5, ThreadFactory threadFactory, c cVar);

    ExecutorService h(int i5, c cVar);

    ExecutorService i(ThreadFactory threadFactory, c cVar);

    ExecutorService j(ThreadFactory threadFactory, c cVar);
}
