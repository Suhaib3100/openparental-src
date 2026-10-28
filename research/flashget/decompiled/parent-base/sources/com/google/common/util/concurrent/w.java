package com.google.common.util.concurrent;

import java.util.concurrent.Callable;

/* compiled from: Callables.java */
@b0
@d9.b(emulated = true)
/* loaded from: classes6.dex */
public final class w {
    private w() {
    }

    public static /* synthetic */ Object d(Object obj) {
        return obj;
    }

    @d9.a
    @d9.c
    public static <T> m<T> e(final Callable<T> callable, final d1 d1Var) {
        callable.getClass();
        d1Var.getClass();
        return new m() { // from class: com.google.common.util.concurrent.t
            @Override // com.google.common.util.concurrent.m
            public final ListenableFuture call() {
                return d1.this.submit(callable);
            }
        };
    }

    private static /* synthetic */ Object g(Object obj) throws Exception {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object h(com.google.common.base.u0 u0Var, Callable callable) throws Exception {
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        boolean m4 = m((String) u0Var.get(), currentThread);
        try {
            return callable.call();
        } finally {
            if (m4) {
                m(name, currentThread);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void i(com.google.common.base.u0 u0Var, Runnable runnable) {
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        boolean m4 = m((String) u0Var.get(), currentThread);
        try {
            runnable.run();
        } finally {
            if (m4) {
                m(name, currentThread);
            }
        }
    }

    public static <T> Callable<T> j(@j1 final T t4) {
        return new Callable() { // from class: com.google.common.util.concurrent.u
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return t4;
            }
        };
    }

    @d9.c
    static Runnable k(final Runnable runnable, final com.google.common.base.u0<String> u0Var) {
        u0Var.getClass();
        runnable.getClass();
        return new Runnable() { // from class: com.google.common.util.concurrent.v
            @Override // java.lang.Runnable
            public final void run() {
                w.i(com.google.common.base.u0.this, runnable);
            }
        };
    }

    @d9.c
    static <T> Callable<T> l(final Callable<T> callable, final com.google.common.base.u0<String> u0Var) {
        u0Var.getClass();
        callable.getClass();
        return new Callable() { // from class: com.google.common.util.concurrent.s
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object h4;
                h4 = w.h(com.google.common.base.u0.this, callable);
                return h4;
            }
        };
    }

    @d9.c
    private static boolean m(String str, Thread thread) {
        try {
            thread.setName(str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }
}
