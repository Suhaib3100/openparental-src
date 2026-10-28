package retrofit2;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import kotlin.coroutines.Continuation;
import okhttp3.e;
import okhttp3.g0;
import okhttp3.h0;
import retrofit2.a0;

/* compiled from: HttpServiceMethod.java */
/* loaded from: classes6.dex */
abstract class j<ResponseT, ReturnT> extends x<ReturnT> {

    /* renamed from: a, reason: collision with root package name */
    private final u f33007a;

    /* renamed from: b, reason: collision with root package name */
    private final e.a f33008b;

    /* renamed from: c, reason: collision with root package name */
    private final f<h0, ResponseT> f33009c;

    /* compiled from: HttpServiceMethod.java */
    static final class a<ResponseT, ReturnT> extends j<ResponseT, ReturnT> {

        /* renamed from: d, reason: collision with root package name */
        private final retrofit2.c<ResponseT, ReturnT> f33010d;

        a(u uVar, e.a aVar, f<h0, ResponseT> fVar, retrofit2.c<ResponseT, ReturnT> cVar) {
            super(uVar, aVar, fVar);
            this.f33010d = cVar;
        }

        @Override // retrofit2.j
        protected ReturnT c(retrofit2.b<ResponseT> bVar, Object[] objArr) {
            return this.f33010d.b(bVar);
        }
    }

    /* compiled from: HttpServiceMethod.java */
    static final class b<ResponseT> extends j<ResponseT, Object> {

        /* renamed from: d, reason: collision with root package name */
        private final retrofit2.c<ResponseT, retrofit2.b<ResponseT>> f33011d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f33012e;

        b(u uVar, e.a aVar, f<h0, ResponseT> fVar, retrofit2.c<ResponseT, retrofit2.b<ResponseT>> cVar, boolean z5) {
            super(uVar, aVar, fVar);
            this.f33011d = cVar;
            this.f33012e = z5;
        }

        @Override // retrofit2.j
        protected Object c(retrofit2.b<ResponseT> bVar, Object[] objArr) {
            retrofit2.b<ResponseT> b6 = this.f33011d.b(bVar);
            Continuation continuation = (Continuation) objArr[objArr.length - 1];
            try {
                return this.f33012e ? l.b(b6, continuation) : l.a(b6, continuation);
            } catch (Exception e6) {
                return l.e(e6, continuation);
            }
        }
    }

    /* compiled from: HttpServiceMethod.java */
    static final class c<ResponseT> extends j<ResponseT, Object> {

        /* renamed from: d, reason: collision with root package name */
        private final retrofit2.c<ResponseT, retrofit2.b<ResponseT>> f33013d;

        c(u uVar, e.a aVar, f<h0, ResponseT> fVar, retrofit2.c<ResponseT, retrofit2.b<ResponseT>> cVar) {
            super(uVar, aVar, fVar);
            this.f33013d = cVar;
        }

        @Override // retrofit2.j
        protected Object c(retrofit2.b<ResponseT> bVar, Object[] objArr) {
            retrofit2.b<ResponseT> b6 = this.f33013d.b(bVar);
            Continuation continuation = (Continuation) objArr[objArr.length - 1];
            try {
                return l.c(b6, continuation);
            } catch (Exception e6) {
                return l.e(e6, continuation);
            }
        }
    }

    j(u uVar, e.a aVar, f<h0, ResponseT> fVar) {
        this.f33007a = uVar;
        this.f33008b = aVar;
        this.f33009c = fVar;
    }

    private static <ResponseT, ReturnT> retrofit2.c<ResponseT, ReturnT> d(w wVar, Method method, Type type, Annotation[] annotationArr) {
        try {
            return (retrofit2.c<ResponseT, ReturnT>) wVar.j(null, type, annotationArr);
        } catch (RuntimeException e6) {
            throw a0.n(method, e6, ProtectedSandApp.s("鐓"), type);
        }
    }

    private static <ResponseT> f<h0, ResponseT> e(w wVar, Method method, Type type) {
        try {
            return wVar.l(null, type, method.getAnnotations());
        } catch (RuntimeException e6) {
            throw a0.n(method, e6, ProtectedSandApp.s("鐔"), type);
        }
    }

    static <ResponseT, ReturnT> j<ResponseT, ReturnT> f(w wVar, Method method, u uVar) {
        Type genericReturnType;
        boolean z5;
        boolean z6 = uVar.f33119k;
        Annotation[] annotations = method.getAnnotations();
        if (z6) {
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Type f6 = a0.f(0, (ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]);
            if (a0.h(f6) == v.class && (f6 instanceof ParameterizedType)) {
                f6 = a0.g(0, (ParameterizedType) f6);
                z5 = true;
            } else {
                z5 = false;
            }
            genericReturnType = new a0.b(null, retrofit2.b.class, f6);
            annotations = z.a(annotations);
        } else {
            genericReturnType = method.getGenericReturnType();
            z5 = false;
        }
        retrofit2.c d6 = d(wVar, method, genericReturnType, annotations);
        Type a6 = d6.a();
        if (a6 == g0.class) {
            throw a0.n(method, null, ProtectedSandApp.s("鐘") + a0.h(a6).getName() + ProtectedSandApp.s("鐙"), new Object[0]);
        }
        if (a6 == v.class) {
            throw a0.m(method, ProtectedSandApp.s("鐗"), new Object[0]);
        }
        if (uVar.f33111c.equals(ProtectedSandApp.s("鐕")) && !Void.class.equals(a6)) {
            throw a0.m(method, ProtectedSandApp.s("鐖"), new Object[0]);
        }
        f e6 = e(wVar, method, a6);
        e.a aVar = wVar.f33150b;
        return !z6 ? new a(uVar, aVar, e6, d6) : z5 ? new c(uVar, aVar, e6, d6) : new b(uVar, aVar, e6, d6, false);
    }

    @Override // retrofit2.x
    @Nullable
    final ReturnT a(Object[] objArr) {
        return c(new m(this.f33007a, objArr, this.f33008b, this.f33009c), objArr);
    }

    @Nullable
    protected abstract ReturnT c(retrofit2.b<ResponseT> bVar, Object[] objArr);
}
