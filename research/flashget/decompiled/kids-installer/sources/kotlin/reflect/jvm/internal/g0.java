package kotlin.reflect.jvm.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.ref.SoftReference;

/* compiled from: ReflectProperties.java */
/* loaded from: classes5.dex */
public class g0 {

    /* compiled from: ReflectProperties.java */
    /* loaded from: classes6.dex */
    public static class a<T> extends c<T> implements q3.a<T> {

        /* renamed from: p, reason: collision with root package name */
        private final q3.a<T> f23870p;

        /* renamed from: q, reason: collision with root package name */
        private volatile SoftReference<Object> f23871q;

        public a(@d5.e T t5, @d5.d q3.a<T> aVar) {
            if (aVar == null) {
                d(0);
            }
            this.f23871q = null;
            this.f23870p = aVar;
            if (t5 != null) {
                this.f23871q = new SoftReference<>(a(t5));
            }
        }

        private static /* synthetic */ void d(int i5) {
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("翫"), ProtectedSandApp.s("翨"), ProtectedSandApp.s("翩"), ProtectedSandApp.s("翪")));
        }

        @Override // kotlin.reflect.jvm.internal.g0.c, q3.a
        public T n() {
            Object obj;
            SoftReference<Object> softReference = this.f23871q;
            if (softReference != null && (obj = softReference.get()) != null) {
                return c(obj);
            }
            T n5 = this.f23870p.n();
            this.f23871q = new SoftReference<>(a(n5));
            return n5;
        }
    }

    /* compiled from: ReflectProperties.java */
    public static class b<T> extends c<T> {

        /* renamed from: p, reason: collision with root package name */
        private final q3.a<T> f23872p;

        /* renamed from: q, reason: collision with root package name */
        private volatile Object f23873q;

        public b(@d5.d q3.a<T> aVar) {
            if (aVar == null) {
                d(0);
            }
            this.f23873q = null;
            this.f23872p = aVar;
        }

        private static /* synthetic */ void d(int i5) {
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("䏅"), ProtectedSandApp.s("䏂"), ProtectedSandApp.s("䏃"), ProtectedSandApp.s("䏄")));
        }

        @Override // kotlin.reflect.jvm.internal.g0.c, q3.a
        public T n() {
            Object obj = this.f23873q;
            if (obj != null) {
                return c(obj);
            }
            T n5 = this.f23872p.n();
            this.f23873q = a(n5);
            return n5;
        }
    }

    /* compiled from: ReflectProperties.java */
    public static abstract class c<T> {

        /* renamed from: o, reason: collision with root package name */
        private static final Object f23874o = new a();

        /* compiled from: ReflectProperties.java */
        static class a {
            a() {
            }
        }

        protected Object a(T t5) {
            return t5 == null ? f23874o : t5;
        }

        public final T b(Object obj, Object obj2) {
            return n();
        }

        /* JADX WARN: Multi-variable type inference failed */
        protected T c(Object obj) {
            if (obj == f23874o) {
                return null;
            }
            return obj;
        }

        public abstract T n();
    }

    private static /* synthetic */ void a(int i5) {
        Object[] objArr = new Object[3];
        objArr[0] = ProtectedSandApp.s("䏆");
        objArr[1] = ProtectedSandApp.s("䏇");
        if (i5 == 1 || i5 == 2) {
            objArr[2] = ProtectedSandApp.s("䏉");
        } else {
            objArr[2] = ProtectedSandApp.s("䏈");
        }
        throw new IllegalArgumentException(String.format(ProtectedSandApp.s("䏊"), objArr));
    }

    @d5.d
    public static <T> b<T> b(@d5.d q3.a<T> aVar) {
        if (aVar == null) {
            a(0);
        }
        return new b<>(aVar);
    }

    @d5.d
    public static <T> a<T> c(@d5.e T t5, @d5.d q3.a<T> aVar) {
        if (aVar == null) {
            a(1);
        }
        return new a<>(t5, aVar);
    }

    @d5.d
    public static <T> a<T> d(@d5.d q3.a<T> aVar) {
        if (aVar == null) {
            a(2);
        }
        return c(null, aVar);
    }
}
