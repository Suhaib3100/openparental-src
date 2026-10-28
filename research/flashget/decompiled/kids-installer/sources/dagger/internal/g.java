package dagger.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: DoubleCheck.java */
/* loaded from: classes6.dex */
public final class g<T> implements t<T>, d3.e<T> {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f22366c = new Object();

    /* renamed from: d, reason: collision with root package name */
    static final /* synthetic */ boolean f22367d = false;

    /* renamed from: a, reason: collision with root package name */
    private volatile t<T> f22368a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f22369b = f22366c;

    private g(t<T> tVar) {
        this.f22368a = tVar;
    }

    public static <P extends t<T>, T> d3.e<T> a(P p5) {
        if (p5 instanceof d3.e) {
            return (d3.e) p5;
        }
        p5.getClass();
        return new g(p5);
    }

    public static <P extends h3.c<T>, T> d3.e<T> b(P p5) {
        return a(v.a(p5));
    }

    public static <P extends t<T>, T> t<T> c(P p5) {
        p5.getClass();
        return p5 instanceof g ? p5 : new g(p5);
    }

    @Deprecated
    public static <P extends h3.c<T>, T> h3.c<T> d(P p5) {
        return c(v.a(p5));
    }

    private static Object e(Object obj, Object obj2) {
        if (!(obj != f22366c) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException(ProtectedSandApp.s("歾") + obj + ProtectedSandApp.s("歿") + obj2 + ProtectedSandApp.s("殀"));
    }

    @Override // h3.c
    public T get() {
        T t5 = (T) this.f22369b;
        Object obj = f22366c;
        if (t5 == obj) {
            synchronized (this) {
                t5 = (T) this.f22369b;
                if (t5 == obj) {
                    t5 = this.f22368a.get();
                    this.f22369b = e(this.f22369b, t5);
                    this.f22368a = null;
                }
            }
        }
        return t5;
    }
}
