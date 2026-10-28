package dagger.internal;

/* compiled from: SingleCheck.java */
/* loaded from: classes6.dex */
public final class a0<T> implements t<T> {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f22360c = new Object();

    /* renamed from: d, reason: collision with root package name */
    static final /* synthetic */ boolean f22361d = false;

    /* renamed from: a, reason: collision with root package name */
    private volatile t<T> f22362a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f22363b = f22360c;

    private a0(t<T> tVar) {
        this.f22362a = tVar;
    }

    public static <P extends t<T>, T> t<T> a(P p5) {
        if ((p5 instanceof a0) || (p5 instanceof g)) {
            return p5;
        }
        p5.getClass();
        return new a0(p5);
    }

    public static <P extends h3.c<T>, T> h3.c<T> b(P p5) {
        return a(v.a(p5));
    }

    @Override // h3.c
    public T get() {
        T t5 = (T) this.f22363b;
        if (t5 != f22360c) {
            return t5;
        }
        t<T> tVar = this.f22362a;
        if (tVar == null) {
            return (T) this.f22363b;
        }
        T t6 = tVar.get();
        this.f22363b = t6;
        this.f22362a = null;
        return t6;
    }
}
