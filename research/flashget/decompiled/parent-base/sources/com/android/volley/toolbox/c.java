package com.android.volley.toolbox;

import androidx.annotation.c1;
import androidx.annotation.q0;
import com.android.volley.AuthFailureError;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: AsyncHttpStack.java */
/* loaded from: classes3.dex */
public abstract class c extends e {

    /* renamed from: a, reason: collision with root package name */
    private ExecutorService f40972a;

    /* renamed from: b, reason: collision with root package name */
    private ExecutorService f40973b;

    /* compiled from: AsyncHttpStack.java */
    class a implements b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AtomicReference f40974a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CountDownLatch f40975b;

        a(AtomicReference atomicReference, CountDownLatch countDownLatch) {
            this.f40974a = atomicReference;
            this.f40975b = countDownLatch;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.android.volley.toolbox.c.b
        public void a(n nVar) {
            this.f40974a.set(new C0678c(nVar, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0));
            this.f40975b.countDown();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.android.volley.toolbox.c.b
        public void b(IOException iOException) {
            this.f40974a.set(new C0678c(null, iOException, 0 == true ? 1 : 0, 0 == true ? 1 : 0));
            this.f40975b.countDown();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.android.volley.toolbox.c.b
        public void c(AuthFailureError authFailureError) {
            this.f40974a.set(new C0678c(null, 0 == true ? 1 : 0, authFailureError, 0 == true ? 1 : 0));
            this.f40975b.countDown();
        }
    }

    /* compiled from: AsyncHttpStack.java */
    public interface b {
        void a(n nVar);

        void b(IOException iOException);

        void c(AuthFailureError authFailureError);
    }

    /* compiled from: AsyncHttpStack.java */
    /* renamed from: com.android.volley.toolbox.c$c, reason: collision with other inner class name */
    private static class C0678c {

        /* renamed from: a, reason: collision with root package name */
        n f40977a;

        /* renamed from: b, reason: collision with root package name */
        IOException f40978b;

        /* renamed from: c, reason: collision with root package name */
        AuthFailureError f40979c;

        /* synthetic */ C0678c(n nVar, IOException iOException, AuthFailureError authFailureError, a aVar) {
            this(nVar, iOException, authFailureError);
        }

        private C0678c(@q0 n nVar, @q0 IOException iOException, @q0 AuthFailureError authFailureError) {
            this.f40977a = nVar;
            this.f40978b = iOException;
            this.f40979c = authFailureError;
        }
    }

    @Override // com.android.volley.toolbox.e
    public final n b(com.android.volley.n<?> nVar, Map<String, String> map) throws IOException, AuthFailureError {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicReference atomicReference = new AtomicReference();
        c(nVar, map, new a(atomicReference, countDownLatch));
        try {
            countDownLatch.await();
            C0678c c0678c = (C0678c) atomicReference.get();
            n nVar2 = c0678c.f40977a;
            if (nVar2 != null) {
                return nVar2;
            }
            IOException iOException = c0678c.f40978b;
            if (iOException != null) {
                throw iOException;
            }
            throw c0678c.f40979c;
        } catch (InterruptedException e4) {
            com.android.volley.t.d(e4, ProtectedSandApp.s("ڴ"), new Object[0]);
            Thread.currentThread().interrupt();
            throw new InterruptedIOException(e4.toString());
        }
    }

    public abstract void c(com.android.volley.n<?> nVar, Map<String, String> map, b bVar);

    protected ExecutorService d() {
        return this.f40972a;
    }

    protected ExecutorService e() {
        return this.f40973b;
    }

    @c1({c1.a.LIBRARY_GROUP})
    public void f(ExecutorService executorService) {
        this.f40972a = executorService;
    }

    @c1({c1.a.LIBRARY_GROUP})
    public void g(ExecutorService executorService) {
        this.f40973b = executorService;
    }
}
