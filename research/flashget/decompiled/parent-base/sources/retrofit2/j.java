package retrofit2;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import okhttp3.e;
import okhttp3.f0;
import okhttp3.g0;
import retrofit2.c0;

/* compiled from: HttpServiceMethod.java */
/* loaded from: classes9.dex */
abstract class j<ResponseT, ReturnT> extends z<ReturnT> {

    /* renamed from: a, reason: collision with root package name */
    private final w f89923a;

    /* renamed from: b, reason: collision with root package name */
    private final e.a f89924b;

    /* renamed from: c, reason: collision with root package name */
    private final f<g0, ResponseT> f89925c;

    /* compiled from: HttpServiceMethod.java */
    static final class a<ResponseT, ReturnT> extends j<ResponseT, ReturnT> {

        /* renamed from: d, reason: collision with root package name */
        private final retrofit2.c<ResponseT, ReturnT> f89926d;

        a(w wVar, e.a aVar, f<g0, ResponseT> fVar, retrofit2.c<ResponseT, ReturnT> cVar) {
            super(wVar, aVar, fVar);
            this.f89926d = cVar;
        }

        @Override // retrofit2.j
        protected ReturnT c(retrofit2.b<ResponseT> bVar, Object[] objArr) {
            return this.f89926d.b(bVar);
        }
    }

    /* compiled from: HttpServiceMethod.java */
    static final class b<ResponseT> extends j<ResponseT, Object> {

        /* renamed from: d, reason: collision with root package name */
        private final retrofit2.c<ResponseT, retrofit2.b<ResponseT>> f89927d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f89928e;

        b(w wVar, e.a aVar, f<g0, ResponseT> fVar, retrofit2.c<ResponseT, retrofit2.b<ResponseT>> cVar, boolean z4) {
            super(wVar, aVar, fVar);
            this.f89927d = cVar;
            this.f89928e = z4;
        }

        @Override // retrofit2.j
        protected Object c(retrofit2.b<ResponseT> bVar, Object[] objArr) {
            retrofit2.b<ResponseT> b5 = this.f89927d.b(bVar);
            kotlin.coroutines.d dVar = (kotlin.coroutines.d) objArr[objArr.length - 1];
            try {
                return this.f89928e ? l.b(b5, dVar) : l.a(b5, dVar);
            } catch (Exception e4) {
                return l.e(e4, dVar);
            }
        }
    }

    /* compiled from: HttpServiceMethod.java */
    static final class c<ResponseT> extends j<ResponseT, Object> {

        /* renamed from: d, reason: collision with root package name */
        private final retrofit2.c<ResponseT, retrofit2.b<ResponseT>> f89929d;

        c(w wVar, e.a aVar, f<g0, ResponseT> fVar, retrofit2.c<ResponseT, retrofit2.b<ResponseT>> cVar) {
            super(wVar, aVar, fVar);
            this.f89929d = cVar;
        }

        @Override // retrofit2.j
        protected Object c(retrofit2.b<ResponseT> bVar, Object[] objArr) {
            retrofit2.b<ResponseT> b5 = this.f89929d.b(bVar);
            kotlin.coroutines.d dVar = (kotlin.coroutines.d) objArr[objArr.length - 1];
            try {
                return l.c(b5, dVar);
            } catch (Exception e4) {
                return l.e(e4, dVar);
            }
        }
    }

    j(w wVar, e.a aVar, f<g0, ResponseT> fVar) {
        this.f89923a = wVar;
        this.f89924b = aVar;
        this.f89925c = fVar;
    }

    private static <ResponseT, ReturnT> retrofit2.c<ResponseT, ReturnT> d(y yVar, Method method, Type type, Annotation[] annotationArr) {
        try {
            return (retrofit2.c<ResponseT, ReturnT>) yVar.j(null, type, annotationArr);
        } catch (RuntimeException e4) {
            throw c0.n(method, e4, ProtectedSandApp.s("ꖽ\u0001"), type);
        }
    }

    private static <ResponseT> f<g0, ResponseT> e(y yVar, Method method, Type type) {
        try {
            return yVar.l(null, type, method.getAnnotations());
        } catch (RuntimeException e4) {
            throw c0.n(method, e4, ProtectedSandApp.s("ꖾ\u0001"), type);
        }
    }

    static <ResponseT, ReturnT> j<ResponseT, ReturnT> f(y yVar, Method method, w wVar) {
        Type genericReturnType;
        boolean z4;
        boolean z5 = wVar.f90035k;
        Annotation[] annotations = method.getAnnotations();
        if (z5) {
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Type f4 = c0.f(0, (ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]);
            if (c0.h(f4) == x.class && (f4 instanceof ParameterizedType)) {
                f4 = c0.g(0, (ParameterizedType) f4);
                z4 = true;
            } else {
                z4 = false;
            }
            genericReturnType = new c0.b(null, retrofit2.b.class, f4);
            annotations = b0.a(annotations);
        } else {
            genericReturnType = method.getGenericReturnType();
            z4 = false;
        }
        retrofit2.c d5 = d(yVar, method, genericReturnType, annotations);
        Type a5 = d5.a();
        if (a5 == f0.class) {
            throw c0.n(method, null, ProtectedSandApp.s("ꗂ\u0001") + c0.h(a5).getName() + ProtectedSandApp.s("ꗃ\u0001"), new Object[0]);
        }
        if (a5 == x.class) {
            throw c0.m(method, ProtectedSandApp.s("ꗁ\u0001"), new Object[0]);
        }
        if (wVar.f90027c.equals(ProtectedSandApp.s("ꖿ\u0001")) && !Void.class.equals(a5)) {
            throw c0.m(method, ProtectedSandApp.s("ꗀ\u0001"), new Object[0]);
        }
        f e4 = e(yVar, method, a5);
        e.a aVar = yVar.f90066b;
        return !z5 ? new a(wVar, aVar, e4, d5) : z4 ? new c(wVar, aVar, e4, d5) : new b(wVar, aVar, e4, d5, false);
    }

    @Override // retrofit2.z
    @zc.h
    final ReturnT a(Object[] objArr) {
        return c(new m(this.f89923a, objArr, this.f89924b, this.f89925c), objArr);
    }

    @zc.h
    protected abstract ReturnT c(retrofit2.b<ResponseT> bVar, Object[] objArr);
}
