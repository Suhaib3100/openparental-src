package androidx.core.provider;

import android.graphics.Typeface;
import android.os.Handler;
import androidx.annotation.o0;
import androidx.core.provider.g;
import androidx.core.provider.h;

/* compiled from: CallbackWithHandler.java */
/* loaded from: classes.dex */
class a {

    /* renamed from: a, reason: collision with root package name */
    @o0
    private final h.d f5002a;

    /* renamed from: b, reason: collision with root package name */
    @o0
    private final Handler f5003b;

    /* compiled from: CallbackWithHandler.java */
    /* renamed from: androidx.core.provider.a$a, reason: collision with other inner class name */
    class RunnableC0044a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ h.d f5004o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ Typeface f5005p;

        RunnableC0044a(h.d dVar, Typeface typeface) {
            this.f5004o = dVar;
            this.f5005p = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5004o.b(this.f5005p);
        }
    }

    /* compiled from: CallbackWithHandler.java */
    class b implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ h.d f5007o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f5008p;

        b(h.d dVar, int i5) {
            this.f5007o = dVar;
            this.f5008p = i5;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5007o.a(this.f5008p);
        }
    }

    a(@o0 h.d dVar, @o0 Handler handler) {
        this.f5002a = dVar;
        this.f5003b = handler;
    }

    private void a(int i5) {
        this.f5003b.post(new b(this.f5002a, i5));
    }

    private void c(@o0 Typeface typeface) {
        this.f5003b.post(new RunnableC0044a(this.f5002a, typeface));
    }

    void b(@o0 g.e eVar) {
        if (eVar.a()) {
            c(eVar.f5033a);
        } else {
            a(eVar.f5034b);
        }
    }

    a(@o0 h.d dVar) {
        this.f5002a = dVar;
        this.f5003b = androidx.core.provider.b.a();
    }
}
