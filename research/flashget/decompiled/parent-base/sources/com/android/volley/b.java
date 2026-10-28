package com.android.volley;

import androidx.annotation.c1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: AsyncNetwork.java */
/* loaded from: classes3.dex */
public abstract class b implements j {

    /* renamed from: a, reason: collision with root package name */
    private ExecutorService f40813a;

    /* renamed from: b, reason: collision with root package name */
    private ExecutorService f40814b;

    /* renamed from: c, reason: collision with root package name */
    private ScheduledExecutorService f40815c;

    /* compiled from: AsyncNetwork.java */
    class a implements InterfaceC0672b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AtomicReference f40816a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CountDownLatch f40817b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AtomicReference f40818c;

        a(AtomicReference atomicReference, CountDownLatch countDownLatch, AtomicReference atomicReference2) {
            this.f40816a = atomicReference;
            this.f40817b = countDownLatch;
            this.f40818c = atomicReference2;
        }

        @Override // com.android.volley.b.InterfaceC0672b
        public void a(VolleyError volleyError) {
            this.f40818c.set(volleyError);
            this.f40817b.countDown();
        }

        @Override // com.android.volley.b.InterfaceC0672b
        public void b(l lVar) {
            this.f40816a.set(lVar);
            this.f40817b.countDown();
        }
    }

    /* compiled from: AsyncNetwork.java */
    /* renamed from: com.android.volley.b$b, reason: collision with other inner class name */
    public interface InterfaceC0672b {
        void a(VolleyError volleyError);

        void b(l lVar);
    }

    protected b() {
    }

    @Override // com.android.volley.j
    public l a(n<?> nVar) throws VolleyError {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicReference atomicReference = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        e(nVar, new a(atomicReference, countDownLatch, atomicReference2));
        try {
            countDownLatch.await();
            if (atomicReference.get() != null) {
                return (l) atomicReference.get();
            }
            if (atomicReference2.get() != null) {
                throw ((VolleyError) atomicReference2.get());
            }
            throw new VolleyError(ProtectedSandApp.s("٢"));
        } catch (InterruptedException e4) {
            t.d(e4, ProtectedSandApp.s("٣"), new Object[0]);
            Thread.currentThread().interrupt();
            throw new VolleyError(e4);
        }
    }

    protected ExecutorService b() {
        return this.f40813a;
    }

    protected ExecutorService c() {
        return this.f40814b;
    }

    protected ScheduledExecutorService d() {
        return this.f40815c;
    }

    public abstract void e(n<?> nVar, InterfaceC0672b interfaceC0672b);

    @c1({c1.a.LIBRARY_GROUP})
    public void f(ExecutorService executorService) {
        this.f40813a = executorService;
    }

    @c1({c1.a.LIBRARY_GROUP})
    public void g(ExecutorService executorService) {
        this.f40814b = executorService;
    }

    @c1({c1.a.LIBRARY_GROUP})
    public void h(ScheduledExecutorService scheduledExecutorService) {
        this.f40815c = scheduledExecutorService;
    }
}
