package com.google.android.datatransport.runtime;

import java.util.concurrent.Executor;

/* compiled from: ExecutionModule_ExecutorFactory.java */
@com.google.android.datatransport.runtime.dagger.internal.a
@com.google.android.datatransport.runtime.dagger.internal.f
@com.google.android.datatransport.runtime.dagger.internal.g("javax.inject.Singleton")
/* loaded from: classes5.dex */
public final class m implements com.google.android.datatransport.runtime.dagger.internal.c<Executor> {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ExecutionModule_ExecutorFactory.java */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final m f52081a = new m();

        private a() {
        }
    }

    public static m a() {
        return a.f52081a;
    }

    public static Executor b() {
        return (Executor) com.google.android.datatransport.runtime.dagger.internal.e.f(l.a());
    }

    public Executor c() {
        return b();
    }

    @Override // cd.c
    public Object get() {
        return b();
    }
}
