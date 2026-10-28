package kotlin.reflect.jvm.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.ref.SoftReference;

/* compiled from: ReflectProperties.java */
/* loaded from: classes7.dex */
public class i0 {

    /* compiled from: ReflectProperties.java */
    public static class a<T> extends b<T> implements ld.a<T> {

        /* renamed from: c, reason: collision with root package name */
        private final ld.a<T> f75654c;

        /* renamed from: d, reason: collision with root package name */
        private volatile SoftReference<Object> f75655d;

        public a(@fg.m T t4, @fg.l ld.a<T> aVar) {
            if (aVar == null) {
                d(0);
            }
            this.f75655d = null;
            this.f75654c = aVar;
            if (t4 != null) {
                this.f75655d = new SoftReference<>(a(t4));
            }
        }

        private static /* synthetic */ void d(int i4) {
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("杧\u0001"), ProtectedSandApp.s("杦\u0001"), ProtectedSandApp.s("杤\u0001"), ProtectedSandApp.s("来\u0001")));
        }

        @Override // kotlin.reflect.jvm.internal.i0.b, ld.a
        public T invoke() {
            Object obj;
            SoftReference<Object> softReference = this.f75655d;
            if (softReference != null && (obj = softReference.get()) != null) {
                return c(obj);
            }
            T invoke = this.f75654c.invoke();
            this.f75655d = new SoftReference<>(a(invoke));
            return invoke;
        }
    }

    /* compiled from: ReflectProperties.java */
    public static abstract class b<T> {

        /* renamed from: b, reason: collision with root package name */
        private static final Object f75656b = new a();

        /* compiled from: ReflectProperties.java */
        static class a {
            a() {
            }
        }

        protected Object a(T t4) {
            return t4 == null ? f75656b : t4;
        }

        public final T b(Object obj, Object obj2) {
            return invoke();
        }

        /* JADX WARN: Multi-variable type inference failed */
        protected T c(Object obj) {
            if (obj == f75656b) {
                return null;
            }
            return obj;
        }

        public abstract T invoke();
    }

    private static /* synthetic */ void a(int i4) {
        throw new IllegalArgumentException(String.format(ProtectedSandApp.s("杫\u0001"), ProtectedSandApp.s("杪\u0001"), ProtectedSandApp.s("杨\u0001"), ProtectedSandApp.s("杩\u0001")));
    }

    @fg.l
    public static <T> a<T> b(@fg.m T t4, @fg.l ld.a<T> aVar) {
        if (aVar == null) {
            a(0);
        }
        return new a<>(t4, aVar);
    }

    @fg.l
    public static <T> a<T> c(@fg.l ld.a<T> aVar) {
        if (aVar == null) {
            a(1);
        }
        return b(null, aVar);
    }
}
