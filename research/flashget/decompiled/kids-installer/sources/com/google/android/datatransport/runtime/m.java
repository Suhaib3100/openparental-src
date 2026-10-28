package com.google.android.datatransport.runtime;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.concurrent.Executor;

/* compiled from: ExecutionModule_ExecutorFactory.java */
/* loaded from: classes3.dex */
public final class m implements com.google.android.datatransport.runtime.dagger.internal.g<Executor> {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ExecutionModule_ExecutorFactory.java */
    /* loaded from: classes2.dex */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final m f12551a = new m();

        private a() {
        }
    }

    public static m a() {
        return a.f12551a;
    }

    public static Executor b() {
        return (Executor) com.google.android.datatransport.runtime.dagger.internal.p.c(l.a(), ProtectedSandApp.s("⁞"));
    }

    public Executor c() {
        return b();
    }

    @Override // h3.c
    public Object get() {
        return b();
    }
}
