package androidx.arch.core.executor;

import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import java.util.concurrent.Executor;

/* compiled from: ArchTaskExecutor.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes2.dex */
public class a extends d {

    /* renamed from: c, reason: collision with root package name */
    private static volatile a f1413c;

    /* renamed from: d, reason: collision with root package name */
    @o0
    private static final Executor f1414d = new ExecutorC0012a();

    /* renamed from: e, reason: collision with root package name */
    @o0
    private static final Executor f1415e = new b();

    /* renamed from: a, reason: collision with root package name */
    @o0
    private d f1416a;

    /* renamed from: b, reason: collision with root package name */
    @o0
    private d f1417b;

    /* compiled from: ArchTaskExecutor.java */
    /* renamed from: androidx.arch.core.executor.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class ExecutorC0012a implements Executor {
        ExecutorC0012a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            a.f().d(runnable);
        }
    }

    /* compiled from: ArchTaskExecutor.java */
    /* loaded from: classes.dex */
    static class b implements Executor {
        b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            a.f().a(runnable);
        }
    }

    private a() {
        c cVar = new c();
        this.f1417b = cVar;
        this.f1416a = cVar;
    }

    @o0
    public static Executor e() {
        return f1415e;
    }

    @o0
    public static a f() {
        if (f1413c != null) {
            return f1413c;
        }
        synchronized (a.class) {
            if (f1413c == null) {
                f1413c = new a();
            }
        }
        return f1413c;
    }

    @o0
    public static Executor g() {
        return f1414d;
    }

    @Override // androidx.arch.core.executor.d
    public void a(Runnable runnable) {
        this.f1416a.a(runnable);
    }

    @Override // androidx.arch.core.executor.d
    public boolean c() {
        return this.f1416a.c();
    }

    @Override // androidx.arch.core.executor.d
    public void d(Runnable runnable) {
        this.f1416a.d(runnable);
    }

    public void h(@q0 d dVar) {
        if (dVar == null) {
            dVar = this.f1417b;
        }
        this.f1416a = dVar;
    }
}
