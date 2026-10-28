package com.google.firebase.messaging.threads;

import f9.d;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* compiled from: ExecutorFactory.java */
/* loaded from: classes6.dex */
public interface a {
    ExecutorService a(c cVar);

    ScheduledExecutorService b(int i4, ThreadFactory threadFactory, c cVar);

    ExecutorService c(c cVar);

    Future<?> d(@d String str, @d String str2, c cVar, Runnable runnable);

    void e(@d String str, @d String str2, c cVar, Runnable runnable);

    ScheduledExecutorService f(int i4, c cVar);

    ExecutorService g(int i4, ThreadFactory threadFactory, c cVar);

    ExecutorService h(int i4, c cVar);

    ExecutorService i(ThreadFactory threadFactory, c cVar);

    ExecutorService j(ThreadFactory threadFactory, c cVar);
}
