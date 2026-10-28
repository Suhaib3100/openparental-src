package androidx.recyclerview.widget;

import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.recyclerview.widget.k;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: AsyncDifferConfig.java */
/* loaded from: classes3.dex */
public final class c<T> {

    /* renamed from: a, reason: collision with root package name */
    @q0
    private final Executor f33057a;

    /* renamed from: b, reason: collision with root package name */
    @o0
    private final Executor f33058b;

    /* renamed from: c, reason: collision with root package name */
    @o0
    private final k.f<T> f33059c;

    /* compiled from: AsyncDifferConfig.java */
    public static final class a<T> {

        /* renamed from: d, reason: collision with root package name */
        private static final Object f33060d = new Object();

        /* renamed from: e, reason: collision with root package name */
        private static Executor f33061e;

        /* renamed from: a, reason: collision with root package name */
        @q0
        private Executor f33062a;

        /* renamed from: b, reason: collision with root package name */
        private Executor f33063b;

        /* renamed from: c, reason: collision with root package name */
        private final k.f<T> f33064c;

        public a(@o0 k.f<T> fVar) {
            this.f33064c = fVar;
        }

        @o0
        public c<T> a() {
            if (this.f33063b == null) {
                synchronized (f33060d) {
                    try {
                        if (f33061e == null) {
                            f33061e = Executors.newFixedThreadPool(2);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.f33063b = f33061e;
            }
            return new c<>(this.f33062a, this.f33063b, this.f33064c);
        }

        @o0
        public a<T> b(@q0 Executor executor) {
            this.f33063b = executor;
            return this;
        }

        @c1({c1.a.LIBRARY})
        @o0
        public a<T> c(@q0 Executor executor) {
            this.f33062a = executor;
            return this;
        }
    }

    c(@q0 Executor executor, @o0 Executor executor2, @o0 k.f<T> fVar) {
        this.f33057a = executor;
        this.f33058b = executor2;
        this.f33059c = fVar;
    }

    @o0
    public Executor a() {
        return this.f33058b;
    }

    @o0
    public k.f<T> b() {
        return this.f33059c;
    }

    @q0
    @c1({c1.a.LIBRARY})
    public Executor c() {
        return this.f33057a;
    }
}
