package androidx.recyclerview.widget;

import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.recyclerview.widget.k;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: AsyncDifferConfig.java */
/* loaded from: classes.dex */
public final class c<T> {

    /* renamed from: a, reason: collision with root package name */
    @q0
    private final Executor f9156a;

    /* renamed from: b, reason: collision with root package name */
    @o0
    private final Executor f9157b;

    /* renamed from: c, reason: collision with root package name */
    @o0
    private final k.f<T> f9158c;

    /* compiled from: AsyncDifferConfig.java */
    public static final class a<T> {

        /* renamed from: d, reason: collision with root package name */
        private static final Object f9159d = new Object();

        /* renamed from: e, reason: collision with root package name */
        private static Executor f9160e;

        /* renamed from: a, reason: collision with root package name */
        @q0
        private Executor f9161a;

        /* renamed from: b, reason: collision with root package name */
        private Executor f9162b;

        /* renamed from: c, reason: collision with root package name */
        private final k.f<T> f9163c;

        public a(@o0 k.f<T> fVar) {
            this.f9163c = fVar;
        }

        @o0
        public c<T> a() {
            if (this.f9162b == null) {
                synchronized (f9159d) {
                    if (f9160e == null) {
                        f9160e = Executors.newFixedThreadPool(2);
                    }
                }
                this.f9162b = f9160e;
            }
            return new c<>(this.f9161a, this.f9162b, this.f9163c);
        }

        @o0
        public a<T> b(Executor executor) {
            this.f9162b = executor;
            return this;
        }

        @c1({c1.a.LIBRARY})
        @o0
        public a<T> c(Executor executor) {
            this.f9161a = executor;
            return this;
        }
    }

    c(@q0 Executor executor, @o0 Executor executor2, @o0 k.f<T> fVar) {
        this.f9156a = executor;
        this.f9157b = executor2;
        this.f9158c = fVar;
    }

    @o0
    public Executor a() {
        return this.f9157b;
    }

    @o0
    public k.f<T> b() {
        return this.f9158c;
    }

    @q0
    @c1({c1.a.LIBRARY})
    public Executor c() {
        return this.f9156a;
    }
}
