package retrofit2;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import okhttp3.e0;
import retrofit2.c;
import retrofit2.g;

/* compiled from: DefaultCallAdapterFactory.java */
/* loaded from: classes6.dex */
final class g extends c.a {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final Executor f32993a;

    /* compiled from: DefaultCallAdapterFactory.java */
    class a implements c<Object, retrofit2.b<?>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Type f32994a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Executor f32995b;

        a(Type type, Executor executor) {
            this.f32994a = type;
            this.f32995b = executor;
        }

        @Override // retrofit2.c
        public Type a() {
            return this.f32994a;
        }

        @Override // retrofit2.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public retrofit2.b<Object> b(retrofit2.b<Object> bVar) {
            Executor executor = this.f32995b;
            return executor == null ? bVar : new b(executor, bVar);
        }
    }

    /* compiled from: DefaultCallAdapterFactory.java */
    static final class b<T> implements retrofit2.b<T> {

        /* renamed from: o, reason: collision with root package name */
        final Executor f32997o;

        /* renamed from: p, reason: collision with root package name */
        final retrofit2.b<T> f32998p;

        /* compiled from: DefaultCallAdapterFactory.java */
        class a implements d<T> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f32999a;

            a(d dVar) {
                this.f32999a = dVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void e(d dVar, Throwable th) {
                dVar.a(b.this, th);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void f(d dVar, v vVar) {
                if (b.this.f32998p.t()) {
                    dVar.a(b.this, new IOException(ProtectedSandApp.s("鐐")));
                } else {
                    dVar.b(b.this, vVar);
                }
            }

            @Override // retrofit2.d
            public void a(retrofit2.b<T> bVar, final Throwable th) {
                Executor executor = b.this.f32997o;
                final d dVar = this.f32999a;
                executor.execute(new Runnable() { // from class: retrofit2.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.b.a.this.e(dVar, th);
                    }
                });
            }

            @Override // retrofit2.d
            public void b(retrofit2.b<T> bVar, final v<T> vVar) {
                Executor executor = b.this.f32997o;
                final d dVar = this.f32999a;
                executor.execute(new Runnable() { // from class: retrofit2.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.b.a.this.f(dVar, vVar);
                    }
                });
            }
        }

        b(Executor executor, retrofit2.b<T> bVar) {
            this.f32997o = executor;
            this.f32998p = bVar;
        }

        @Override // retrofit2.b
        public void cancel() {
            this.f32998p.cancel();
        }

        @Override // retrofit2.b
        public v<T> execute() throws IOException {
            return this.f32998p.execute();
        }

        @Override // retrofit2.b
        public e0 g() {
            return this.f32998p.g();
        }

        @Override // retrofit2.b
        public boolean r() {
            return this.f32998p.r();
        }

        @Override // retrofit2.b
        public boolean t() {
            return this.f32998p.t();
        }

        @Override // retrofit2.b
        public void y0(d<T> dVar) {
            Objects.requireNonNull(dVar, ProtectedSandApp.s("鐑"));
            this.f32998p.y0(new a(dVar));
        }

        @Override // retrofit2.b
        public retrofit2.b<T> clone() {
            return new b(this.f32997o, this.f32998p.clone());
        }
    }

    g(@Nullable Executor executor) {
        this.f32993a = executor;
    }

    @Override // retrofit2.c.a
    @Nullable
    public c<?, ?> a(Type type, Annotation[] annotationArr, w wVar) {
        if (a0.h(type) != retrofit2.b.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new a(a0.g(0, (ParameterizedType) type), a0.l(annotationArr, y.class) ? null : this.f32993a);
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("鐒"));
    }
}
