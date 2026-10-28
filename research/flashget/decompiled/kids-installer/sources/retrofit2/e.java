package retrofit2;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import retrofit2.c;

/* compiled from: CompletableFutureCallAdapterFactory.java */
@IgnoreJRERequirement
/* loaded from: classes6.dex */
final class e extends c.a {

    /* renamed from: a, reason: collision with root package name */
    static final c.a f32982a = new e();

    /* compiled from: CompletableFutureCallAdapterFactory.java */
    @IgnoreJRERequirement
    private static final class a<R> implements c<R, CompletableFuture<R>> {

        /* renamed from: a, reason: collision with root package name */
        private final Type f32983a;

        /* compiled from: CompletableFutureCallAdapterFactory.java */
        /* renamed from: retrofit2.e$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        class C0506a extends CompletableFuture<R> {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ retrofit2.b f32984o;

            C0506a(retrofit2.b bVar) {
                this.f32984o = bVar;
            }

            @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
            public boolean cancel(boolean z5) {
                if (z5) {
                    this.f32984o.cancel();
                }
                return super.cancel(z5);
            }
        }

        /* compiled from: CompletableFutureCallAdapterFactory.java */
        class b implements d<R> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CompletableFuture f32986a;

            b(CompletableFuture completableFuture) {
                this.f32986a = completableFuture;
            }

            @Override // retrofit2.d
            public void a(retrofit2.b<R> bVar, Throwable th) {
                this.f32986a.completeExceptionally(th);
            }

            @Override // retrofit2.d
            public void b(retrofit2.b<R> bVar, v<R> vVar) {
                if (vVar.g()) {
                    this.f32986a.complete(vVar.a());
                } else {
                    this.f32986a.completeExceptionally(new HttpException(vVar));
                }
            }
        }

        a(Type type) {
            this.f32983a = type;
        }

        @Override // retrofit2.c
        public Type a() {
            return this.f32983a;
        }

        @Override // retrofit2.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public CompletableFuture<R> b(retrofit2.b<R> bVar) {
            C0506a c0506a = new C0506a(bVar);
            bVar.y0(new b(c0506a));
            return c0506a;
        }
    }

    /* compiled from: CompletableFutureCallAdapterFactory.java */
    @IgnoreJRERequirement
    private static final class b<R> implements c<R, CompletableFuture<v<R>>> {

        /* renamed from: a, reason: collision with root package name */
        private final Type f32988a;

        /* compiled from: CompletableFutureCallAdapterFactory.java */
        /* loaded from: classes5.dex */
        class a extends CompletableFuture<v<R>> {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ retrofit2.b f32989o;

            a(retrofit2.b bVar) {
                this.f32989o = bVar;
            }

            @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
            public boolean cancel(boolean z5) {
                if (z5) {
                    this.f32989o.cancel();
                }
                return super.cancel(z5);
            }
        }

        /* compiled from: CompletableFutureCallAdapterFactory.java */
        /* renamed from: retrofit2.e$b$b, reason: collision with other inner class name */
        class C0507b implements d<R> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CompletableFuture f32991a;

            C0507b(CompletableFuture completableFuture) {
                this.f32991a = completableFuture;
            }

            @Override // retrofit2.d
            public void a(retrofit2.b<R> bVar, Throwable th) {
                this.f32991a.completeExceptionally(th);
            }

            @Override // retrofit2.d
            public void b(retrofit2.b<R> bVar, v<R> vVar) {
                this.f32991a.complete(vVar);
            }
        }

        b(Type type) {
            this.f32988a = type;
        }

        @Override // retrofit2.c
        public Type a() {
            return this.f32988a;
        }

        @Override // retrofit2.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public CompletableFuture<v<R>> b(retrofit2.b<R> bVar) {
            a aVar = new a(bVar);
            bVar.y0(new C0507b(aVar));
            return aVar;
        }
    }

    e() {
    }

    @Override // retrofit2.c.a
    @Nullable
    public c<?, ?> a(Type type, Annotation[] annotationArr, w wVar) {
        if (a0.h(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException(ProtectedSandApp.s("鐏"));
        }
        Type g5 = a0.g(0, (ParameterizedType) type);
        if (a0.h(g5) != v.class) {
            return new a(g5);
        }
        if (g5 instanceof ParameterizedType) {
            return new b(a0.g(0, (ParameterizedType) g5));
        }
        throw new IllegalStateException(ProtectedSandApp.s("鐎"));
    }
}
