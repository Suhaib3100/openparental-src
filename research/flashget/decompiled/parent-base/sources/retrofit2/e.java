package retrofit2;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import retrofit2.c;

/* compiled from: CompletableFutureCallAdapterFactory.java */
@IgnoreJRERequirement
/* loaded from: classes9.dex */
final class e extends c.a {

    /* renamed from: a, reason: collision with root package name */
    static final c.a f89898a = new e();

    /* compiled from: CompletableFutureCallAdapterFactory.java */
    @IgnoreJRERequirement
    private static final class a<R> implements c<R, CompletableFuture<R>> {

        /* renamed from: a, reason: collision with root package name */
        private final Type f89899a;

        /* compiled from: CompletableFutureCallAdapterFactory.java */
        /* renamed from: retrofit2.e$a$a, reason: collision with other inner class name */
        class C1388a extends CompletableFuture<R> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ retrofit2.b f89900b;

            C1388a(retrofit2.b bVar) {
                this.f89900b = bVar;
            }

            @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
            public boolean cancel(boolean z4) {
                if (z4) {
                    this.f89900b.cancel();
                }
                return super.cancel(z4);
            }
        }

        /* compiled from: CompletableFutureCallAdapterFactory.java */
        class b implements d<R> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CompletableFuture f89902a;

            b(CompletableFuture completableFuture) {
                this.f89902a = completableFuture;
            }

            @Override // retrofit2.d
            public void a(retrofit2.b<R> bVar, Throwable th) {
                this.f89902a.completeExceptionally(th);
            }

            @Override // retrofit2.d
            public void b(retrofit2.b<R> bVar, x<R> xVar) {
                if (xVar.g()) {
                    this.f89902a.complete(xVar.a());
                } else {
                    this.f89902a.completeExceptionally(new HttpException(xVar));
                }
            }
        }

        a(Type type) {
            this.f89899a = type;
        }

        @Override // retrofit2.c
        public Type a() {
            return this.f89899a;
        }

        @Override // retrofit2.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public CompletableFuture<R> b(retrofit2.b<R> bVar) {
            C1388a c1388a = new C1388a(bVar);
            bVar.O0(new b(c1388a));
            return c1388a;
        }
    }

    /* compiled from: CompletableFutureCallAdapterFactory.java */
    @IgnoreJRERequirement
    private static final class b<R> implements c<R, CompletableFuture<x<R>>> {

        /* renamed from: a, reason: collision with root package name */
        private final Type f89904a;

        /* compiled from: CompletableFutureCallAdapterFactory.java */
        class a extends CompletableFuture<x<R>> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ retrofit2.b f89905b;

            a(retrofit2.b bVar) {
                this.f89905b = bVar;
            }

            @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
            public boolean cancel(boolean z4) {
                if (z4) {
                    this.f89905b.cancel();
                }
                return super.cancel(z4);
            }
        }

        /* compiled from: CompletableFutureCallAdapterFactory.java */
        /* renamed from: retrofit2.e$b$b, reason: collision with other inner class name */
        class C1389b implements d<R> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CompletableFuture f89907a;

            C1389b(CompletableFuture completableFuture) {
                this.f89907a = completableFuture;
            }

            @Override // retrofit2.d
            public void a(retrofit2.b<R> bVar, Throwable th) {
                this.f89907a.completeExceptionally(th);
            }

            @Override // retrofit2.d
            public void b(retrofit2.b<R> bVar, x<R> xVar) {
                this.f89907a.complete(xVar);
            }
        }

        b(Type type) {
            this.f89904a = type;
        }

        @Override // retrofit2.c
        public Type a() {
            return this.f89904a;
        }

        @Override // retrofit2.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public CompletableFuture<x<R>> b(retrofit2.b<R> bVar) {
            a aVar = new a(bVar);
            bVar.O0(new C1389b(aVar));
            return aVar;
        }
    }

    e() {
    }

    @Override // retrofit2.c.a
    @zc.h
    public c<?, ?> a(Type type, Annotation[] annotationArr, y yVar) {
        if (c0.h(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException(ProtectedSandApp.s("ꖷ\u0001"));
        }
        Type g4 = c0.g(0, (ParameterizedType) type);
        if (c0.h(g4) != x.class) {
            return new a(g4);
        }
        if (g4 instanceof ParameterizedType) {
            return new b(c0.g(0, (ParameterizedType) g4));
        }
        throw new IllegalStateException(ProtectedSandApp.s("ꖶ\u0001"));
    }
}
