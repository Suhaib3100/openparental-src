package androidx.core.provider;

import android.graphics.Typeface;
import androidx.annotation.o0;
import androidx.core.provider.k;
import androidx.core.provider.q;
import androidx.core.provider.r;
import java.util.concurrent.Executor;

/* compiled from: CallbackWrapper.java */
/* loaded from: classes3.dex */
class a {

    /* renamed from: a, reason: collision with root package name */
    @o0
    private final q.d f26559a;

    /* renamed from: b, reason: collision with root package name */
    @o0
    private final Executor f26560b;

    /* compiled from: CallbackWrapper.java */
    /* renamed from: androidx.core.provider.a$a, reason: collision with other inner class name */
    class RunnableC0424a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ q.d f26561b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Typeface f26562c;

        RunnableC0424a(q.d dVar, Typeface typeface) {
            this.f26561b = dVar;
            this.f26562c = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f26561b.b(this.f26562c);
        }
    }

    /* compiled from: CallbackWrapper.java */
    class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ q.d f26564b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f26565c;

        b(q.d dVar, int i4) {
            this.f26564b = dVar;
            this.f26565c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f26564b.a(this.f26565c);
        }
    }

    a(@o0 q.d dVar, @o0 Executor executor) {
        this.f26559a = dVar;
        this.f26560b = executor;
    }

    private void a(int i4) {
        this.f26560b.execute(new b(this.f26559a, i4));
    }

    private void c(@o0 Typeface typeface) {
        this.f26560b.execute(new RunnableC0424a(this.f26559a, typeface));
    }

    void b(@o0 k.e eVar) {
        if (eVar.a()) {
            c(eVar.f26596a);
        } else {
            a(eVar.f26597b);
        }
    }

    a(@o0 q.d dVar) {
        this(dVar, new r.b(androidx.core.provider.b.a()));
    }
}
