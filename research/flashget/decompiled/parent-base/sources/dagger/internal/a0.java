package dagger.internal;

/* compiled from: SingleCheck.java */
/* loaded from: classes7.dex */
public final class a0<T> implements t<T> {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f73674c = new Object();

    /* renamed from: d, reason: collision with root package name */
    static final /* synthetic */ boolean f73675d = false;

    /* renamed from: a, reason: collision with root package name */
    private volatile t<T> f73676a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f73677b = f73674c;

    private a0(t<T> tVar) {
        this.f73676a = tVar;
    }

    public static <P extends cd.c<T>, T> cd.c<T> a(P p4) {
        return b(v.a(p4));
    }

    public static <P extends t<T>, T> t<T> b(P p4) {
        if ((p4 instanceof a0) || (p4 instanceof g)) {
            return p4;
        }
        p4.getClass();
        return new a0(p4);
    }

    @Override // cd.c
    public T get() {
        T t4 = (T) this.f73677b;
        if (t4 != f73674c) {
            return t4;
        }
        t<T> tVar = this.f73676a;
        if (tVar == null) {
            return (T) this.f73677b;
        }
        T t5 = tVar.get();
        this.f73677b = t5;
        this.f73676a = null;
        return t5;
    }
}
