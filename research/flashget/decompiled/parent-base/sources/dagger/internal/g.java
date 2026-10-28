package dagger.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: DoubleCheck.java */
/* loaded from: classes7.dex */
public final class g<T> implements t<T>, vc.e<T> {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f73680c = new Object();

    /* renamed from: d, reason: collision with root package name */
    static final /* synthetic */ boolean f73681d = false;

    /* renamed from: a, reason: collision with root package name */
    private volatile t<T> f73682a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f73683b = f73680c;

    private g(t<T> tVar) {
        this.f73682a = tVar;
    }

    public static <P extends cd.c<T>, T> vc.e<T> a(P p4) {
        return b(v.a(p4));
    }

    public static <P extends t<T>, T> vc.e<T> b(P p4) {
        if (p4 instanceof vc.e) {
            return (vc.e) p4;
        }
        p4.getClass();
        return new g(p4);
    }

    @Deprecated
    public static <P extends cd.c<T>, T> cd.c<T> c(P p4) {
        return d(v.a(p4));
    }

    public static <P extends t<T>, T> t<T> d(P p4) {
        p4.getClass();
        return p4 instanceof g ? p4 : new g(p4);
    }

    private static Object e(Object obj, Object obj2) {
        if (obj == f73680c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException(ProtectedSandApp.s("彰\u0001") + obj + ProtectedSandApp.s("影\u0001") + obj2 + ProtectedSandApp.s("彲\u0001"));
    }

    @Override // cd.c
    public T get() {
        T t4 = (T) this.f73683b;
        Object obj = f73680c;
        if (t4 == obj) {
            synchronized (this) {
                try {
                    t4 = (T) this.f73683b;
                    if (t4 == obj) {
                        t4 = this.f73682a.get();
                        this.f73683b = e(this.f73683b, t4);
                        this.f73682a = null;
                    }
                } finally {
                }
            }
        }
        return t4;
    }
}
