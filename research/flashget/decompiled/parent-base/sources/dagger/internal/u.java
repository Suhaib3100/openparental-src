package dagger.internal;

/* compiled from: ProviderOfLazy.java */
/* loaded from: classes7.dex */
public final class u<T> implements t<vc.e<T>> {

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ boolean f73692b = false;

    /* renamed from: a, reason: collision with root package name */
    private final t<T> f73693a;

    private u(t<T> tVar) {
        this.f73693a = tVar;
    }

    @Deprecated
    public static <T> t<vc.e<T>> a(cd.c<T> cVar) {
        return b(v.a(cVar));
    }

    public static <T> t<vc.e<T>> b(t<T> tVar) {
        tVar.getClass();
        return new u(tVar);
    }

    public vc.e<T> c() {
        return g.b(this.f73693a);
    }

    @Override // cd.c
    public Object get() {
        return g.b(this.f73693a);
    }
}
