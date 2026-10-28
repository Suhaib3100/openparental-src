package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: Service.java */
@b0
@f9.f("Create an AbstractIdleService")
@d9.c
/* loaded from: classes6.dex */
public interface p1 {

    /* compiled from: Service.java */
    public static abstract class a {
        public void a(b bVar, Throwable th) {
        }

        public void b() {
        }

        public void c() {
        }

        public void d(b bVar) {
        }

        public void e(b bVar) {
        }
    }

    /* compiled from: Service.java */
    public enum b {
        NEW,
        STARTING,
        RUNNING,
        STOPPING,
        TERMINATED,
        FAILED
    }

    void a(a aVar, Executor executor);

    void b(long j4, TimeUnit timeUnit) throws TimeoutException;

    void c(long j4, TimeUnit timeUnit) throws TimeoutException;

    void d();

    @f9.a
    p1 e();

    void f();

    Throwable g();

    @f9.a
    p1 h();

    boolean isRunning();

    b state();
}
