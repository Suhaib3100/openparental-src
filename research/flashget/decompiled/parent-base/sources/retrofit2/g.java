package retrofit2;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.concurrent.Executor;
import retrofit2.c;
import retrofit2.g;

/* compiled from: DefaultCallAdapterFactory.java */
/* loaded from: classes9.dex */
final class g extends c.a {

    /* renamed from: a, reason: collision with root package name */
    @zc.h
    private final Executor f89909a;

    /* compiled from: DefaultCallAdapterFactory.java */
    class a implements c<Object, retrofit2.b<?>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Type f89910a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Executor f89911b;

        a(Type type, Executor executor) {
            this.f89910a = type;
            this.f89911b = executor;
        }

        @Override // retrofit2.c
        public Type a() {
            return this.f89910a;
        }

        @Override // retrofit2.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public retrofit2.b<Object> b(retrofit2.b<Object> bVar) {
            Executor executor = this.f89911b;
            return executor == null ? bVar : new b(executor, bVar);
        }
    }

    /* compiled from: DefaultCallAdapterFactory.java */
    static final class b<T> implements retrofit2.b<T> {

        /* renamed from: b, reason: collision with root package name */
        final Executor f89913b;

        /* renamed from: c, reason: collision with root package name */
        final retrofit2.b<T> f89914c;

        /* compiled from: DefaultCallAdapterFactory.java */
        class a implements d<T> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f89915a;

            a(d dVar) {
                this.f89915a = dVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void e(d dVar, Throwable th) {
                dVar.a(b.this, th);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void f(d dVar, x xVar) {
                if (b.this.f89914c.L()) {
                    dVar.a(b.this, new IOException(ProtectedSandApp.s("ꖸ\u0001")));
                } else {
                    dVar.b(b.this, xVar);
                }
            }

            @Override // retrofit2.d
            public void a(retrofit2.b<T> bVar, final Throwable th) {
                Executor executor = b.this.f89913b;
                final d dVar = this.f89915a;
                executor.execute(new Runnable() { // from class: retrofit2.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.b.a.this.e(dVar, th);
                    }
                });
            }

            @Override // retrofit2.d
            public void b(retrofit2.b<T> bVar, final x<T> xVar) {
                Executor executor = b.this.f89913b;
                final d dVar = this.f89915a;
                executor.execute(new Runnable() { // from class: retrofit2.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.b.a.this.f(dVar, xVar);
                    }
                });
            }
        }

        b(Executor executor, retrofit2.b<T> bVar) {
            this.f89913b = executor;
            this.f89914c = bVar;
        }

        @Override // retrofit2.b
        public boolean L() {
            return this.f89914c.L();
        }

        @Override // retrofit2.b
        public void O0(d<T> dVar) {
            Objects.requireNonNull(dVar, ProtectedSandApp.s("ꖹ\u0001"));
            this.f89914c.O0(new a(dVar));
        }

        @Override // retrofit2.b
        public void cancel() {
            this.f89914c.cancel();
        }

        @Override // retrofit2.b
        public okhttp3.d0 h() {
            return this.f89914c.h();
        }

        @Override // retrofit2.b
        public x<T> j() throws IOException {
            return this.f89914c.j();
        }

        @Override // retrofit2.b
        public boolean x() {
            return this.f89914c.x();
        }

        @Override // retrofit2.b
        public retrofit2.b<T> clone() {
            return new b(this.f89913b, this.f89914c.clone());
        }
    }

    g(@zc.h Executor executor) {
        this.f89909a = executor;
    }

    @Override // retrofit2.c.a
    @zc.h
    public c<?, ?> a(Type type, Annotation[] annotationArr, y yVar) {
        if (c0.h(type) != retrofit2.b.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new a(c0.g(0, (ParameterizedType) type), c0.l(annotationArr, a0.class) ? null : this.f89909a);
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("ꖺ\u0001"));
    }
}
