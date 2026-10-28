package androidx.arch.core.executor;

import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import java.util.concurrent.Executor;

/* compiled from: ArchTaskExecutor.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class c extends e {

    /* renamed from: c, reason: collision with root package name */
    private static volatile c f2072c;

    /* renamed from: d, reason: collision with root package name */
    @o0
    private static final Executor f2073d = new a();

    /* renamed from: e, reason: collision with root package name */
    @o0
    private static final Executor f2074e = new b();

    /* renamed from: a, reason: collision with root package name */
    @o0
    private e f2075a;

    /* renamed from: b, reason: collision with root package name */
    @o0
    private final e f2076b;

    private c() {
        d dVar = new d();
        this.f2076b = dVar;
        this.f2075a = dVar;
    }

    @o0
    public static Executor g() {
        return f2074e;
    }

    @o0
    public static c h() {
        if (f2072c != null) {
            return f2072c;
        }
        synchronized (c.class) {
            try {
                if (f2072c == null) {
                    f2072c = new c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f2072c;
    }

    @o0
    public static Executor i() {
        return f2073d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void j(Runnable runnable) {
        h().d(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void k(Runnable runnable) {
        h().a(runnable);
    }

    @Override // androidx.arch.core.executor.e
    public void a(@o0 Runnable runnable) {
        this.f2075a.a(runnable);
    }

    @Override // androidx.arch.core.executor.e
    public boolean c() {
        return this.f2075a.c();
    }

    @Override // androidx.arch.core.executor.e
    public void d(@o0 Runnable runnable) {
        this.f2075a.d(runnable);
    }

    public void l(@q0 e eVar) {
        if (eVar == null) {
            eVar = this.f2076b;
        }
        this.f2075a = eVar;
    }
}
