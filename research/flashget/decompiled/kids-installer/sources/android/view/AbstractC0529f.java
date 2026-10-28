package android.view;

import androidx.annotation.c1;
import androidx.annotation.l0;
import androidx.annotation.m1;
import androidx.annotation.n1;
import androidx.annotation.o0;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: ComputableLiveData.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.lifecycle.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0529f<T> {

    /* renamed from: a, reason: collision with root package name */
    final Executor f8533a;

    /* renamed from: b, reason: collision with root package name */
    final LiveData<T> f8534b;

    /* renamed from: c, reason: collision with root package name */
    final AtomicBoolean f8535c;

    /* renamed from: d, reason: collision with root package name */
    final AtomicBoolean f8536d;

    /* renamed from: e, reason: collision with root package name */
    @m1
    final Runnable f8537e;

    /* renamed from: f, reason: collision with root package name */
    @m1
    final Runnable f8538f;

    /* compiled from: ComputableLiveData.java */
    /* renamed from: androidx.lifecycle.f$a */
    /* loaded from: classes3.dex */
    class a extends LiveData<T> {
        a() {
        }

        @Override // android.view.LiveData
        protected void l() {
            AbstractC0529f abstractC0529f = AbstractC0529f.this;
            abstractC0529f.f8533a.execute(abstractC0529f.f8537e);
        }
    }

    /* compiled from: ComputableLiveData.java */
    /* renamed from: androidx.lifecycle.f$b */
    class b implements Runnable {
        b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        @n1
        public void run() {
            do {
                boolean z5 = false;
                if (AbstractC0529f.this.f8536d.compareAndSet(false, true)) {
                    Object obj = null;
                    boolean z6 = false;
                    while (AbstractC0529f.this.f8535c.compareAndSet(true, false)) {
                        try {
                            obj = AbstractC0529f.this.a();
                            z6 = true;
                        } catch (Throwable th) {
                            AbstractC0529f.this.f8536d.set(false);
                            throw th;
                        }
                    }
                    if (z6) {
                        AbstractC0529f.this.f8534b.n(obj);
                    }
                    AbstractC0529f.this.f8536d.set(false);
                    z5 = z6;
                }
                if (!z5) {
                    return;
                }
            } while (AbstractC0529f.this.f8535c.get());
        }
    }

    /* compiled from: ComputableLiveData.java */
    /* renamed from: androidx.lifecycle.f$c */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        @l0
        public void run() {
            boolean h5 = AbstractC0529f.this.f8534b.h();
            if (AbstractC0529f.this.f8535c.compareAndSet(false, true) && h5) {
                AbstractC0529f abstractC0529f = AbstractC0529f.this;
                abstractC0529f.f8533a.execute(abstractC0529f.f8537e);
            }
        }
    }

    public AbstractC0529f() {
        this(androidx.arch.core.executor.a.e());
    }

    @n1
    protected abstract T a();

    @o0
    public LiveData<T> b() {
        return this.f8534b;
    }

    public void c() {
        androidx.arch.core.executor.a.f().b(this.f8538f);
    }

    public AbstractC0529f(@o0 Executor executor) {
        this.f8535c = new AtomicBoolean(true);
        this.f8536d = new AtomicBoolean(false);
        this.f8537e = new b();
        this.f8538f = new c();
        this.f8533a = executor;
        this.f8534b = new a();
    }
}
