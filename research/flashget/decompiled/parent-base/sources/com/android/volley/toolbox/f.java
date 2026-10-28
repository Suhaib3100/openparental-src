package com.android.volley.toolbox;

import android.os.SystemClock;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.android.volley.AuthFailureError;
import com.android.volley.VolleyError;
import com.android.volley.b;
import com.android.volley.toolbox.c;
import com.android.volley.toolbox.v;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* compiled from: BasicAsyncNetwork.java */
/* loaded from: classes3.dex */
public class f extends com.android.volley.b {

    /* renamed from: d, reason: collision with root package name */
    private final com.android.volley.toolbox.c f40983d;

    /* renamed from: e, reason: collision with root package name */
    private final h f40984e;

    /* compiled from: BasicAsyncNetwork.java */
    class a implements c.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.android.volley.n f40985a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f40986b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b.InterfaceC0672b f40987c;

        a(com.android.volley.n nVar, long j4, b.InterfaceC0672b interfaceC0672b) {
            this.f40985a = nVar;
            this.f40986b = j4;
            this.f40987c = interfaceC0672b;
        }

        @Override // com.android.volley.toolbox.c.b
        public void a(n nVar) {
            f.this.n(this.f40985a, this.f40986b, nVar, this.f40987c);
        }

        @Override // com.android.volley.toolbox.c.b
        public void b(IOException iOException) {
            f.this.m(this.f40985a, this.f40987c, iOException, this.f40986b, null, null);
        }

        @Override // com.android.volley.toolbox.c.b
        public void c(AuthFailureError authFailureError) {
            this.f40987c.a(authFailureError);
        }
    }

    /* compiled from: BasicAsyncNetwork.java */
    public static class b {

        /* renamed from: c, reason: collision with root package name */
        private static final int f40989c = 4096;

        /* renamed from: a, reason: collision with root package name */
        @o0
        private com.android.volley.toolbox.c f40990a;

        /* renamed from: b, reason: collision with root package name */
        private h f40991b = null;

        public b(@o0 com.android.volley.toolbox.c cVar) {
            this.f40990a = cVar;
        }

        public f a() {
            if (this.f40991b == null) {
                this.f40991b = new h(4096);
            }
            return new f(this.f40990a, this.f40991b, null);
        }

        public b b(h hVar) {
            this.f40991b = hVar;
            return this;
        }
    }

    /* compiled from: BasicAsyncNetwork.java */
    private class c<T> extends com.android.volley.p<T> {

        /* renamed from: c, reason: collision with root package name */
        final com.android.volley.n<T> f40992c;

        /* renamed from: d, reason: collision with root package name */
        final v.b f40993d;

        /* renamed from: e, reason: collision with root package name */
        final b.InterfaceC0672b f40994e;

        c(com.android.volley.n<T> nVar, v.b bVar, b.InterfaceC0672b interfaceC0672b) {
            super(nVar);
            this.f40992c = nVar;
            this.f40993d = bVar;
            this.f40994e = interfaceC0672b;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                v.a(this.f40992c, this.f40993d);
                f.this.e(this.f40992c, this.f40994e);
            } catch (VolleyError e4) {
                this.f40994e.a(e4);
            }
        }
    }

    /* compiled from: BasicAsyncNetwork.java */
    private class d<T> extends com.android.volley.p<T> {

        /* renamed from: c, reason: collision with root package name */
        InputStream f40996c;

        /* renamed from: d, reason: collision with root package name */
        n f40997d;

        /* renamed from: e, reason: collision with root package name */
        com.android.volley.n<T> f40998e;

        /* renamed from: f, reason: collision with root package name */
        b.InterfaceC0672b f40999f;

        /* renamed from: g, reason: collision with root package name */
        long f41000g;

        /* renamed from: h, reason: collision with root package name */
        List<com.android.volley.i> f41001h;

        /* renamed from: i, reason: collision with root package name */
        int f41002i;

        d(InputStream inputStream, n nVar, com.android.volley.n<T> nVar2, b.InterfaceC0672b interfaceC0672b, long j4, List<com.android.volley.i> list, int i4) {
            super(nVar2);
            this.f40996c = inputStream;
            this.f40997d = nVar;
            this.f40998e = nVar2;
            this.f40999f = interfaceC0672b;
            this.f41000g = j4;
            this.f41001h = list;
            this.f41002i = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                f.this.o(this.f41000g, this.f41002i, this.f40997d, this.f40998e, this.f40999f, this.f41001h, v.c(this.f40996c, this.f40997d.c(), f.this.f40984e));
            } catch (IOException e4) {
                f.this.m(this.f40998e, this.f40999f, e4, this.f41000g, this.f40997d, null);
            }
        }
    }

    private f(com.android.volley.toolbox.c cVar, h hVar) {
        this.f40983d = cVar;
        this.f40984e = hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(com.android.volley.n<?> nVar, b.InterfaceC0672b interfaceC0672b, IOException iOException, long j4, @q0 n nVar2, @q0 byte[] bArr) {
        try {
            b().execute(new c(nVar, v.e(nVar, iOException, j4, nVar2, bArr), interfaceC0672b));
        } catch (VolleyError e4) {
            interfaceC0672b.a(e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(com.android.volley.n<?> nVar, long j4, n nVar2, b.InterfaceC0672b interfaceC0672b) {
        int e4 = nVar2.e();
        List<com.android.volley.i> d5 = nVar2.d();
        if (e4 == 304) {
            interfaceC0672b.b(v.b(nVar, SystemClock.elapsedRealtime() - j4, d5));
            return;
        }
        byte[] b5 = nVar2.b();
        if (b5 == null && nVar2.a() == null) {
            b5 = new byte[0];
        }
        byte[] bArr = b5;
        if (bArr != null) {
            o(j4, e4, nVar2, nVar, interfaceC0672b, d5, bArr);
        } else {
            b().execute(new d(nVar2.a(), nVar2, nVar, interfaceC0672b, j4, d5, e4));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(long j4, int i4, n nVar, com.android.volley.n<?> nVar2, b.InterfaceC0672b interfaceC0672b, List<com.android.volley.i> list, byte[] bArr) {
        v.d(SystemClock.elapsedRealtime() - j4, nVar2, bArr, i4);
        if (i4 < 200 || i4 > 299) {
            m(nVar2, interfaceC0672b, new IOException(), j4, nVar, bArr);
        } else {
            interfaceC0672b.b(new com.android.volley.l(i4, bArr, false, SystemClock.elapsedRealtime() - j4, list));
        }
    }

    @Override // com.android.volley.b
    public void e(com.android.volley.n<?> nVar, b.InterfaceC0672b interfaceC0672b) {
        if (b() == null) {
            throw new IllegalStateException(ProtectedSandApp.s("ڷ"));
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f40983d.c(nVar, m.c(nVar.getCacheEntry()), new a(nVar, elapsedRealtime, interfaceC0672b));
    }

    @Override // com.android.volley.b
    @c1({c1.a.LIBRARY_GROUP})
    public void f(ExecutorService executorService) {
        super.f(executorService);
        this.f40983d.f(executorService);
    }

    @Override // com.android.volley.b
    @c1({c1.a.LIBRARY_GROUP})
    public void g(ExecutorService executorService) {
        super.g(executorService);
        this.f40983d.g(executorService);
    }

    /* synthetic */ f(com.android.volley.toolbox.c cVar, h hVar, a aVar) {
        this(cVar, hVar);
    }
}
