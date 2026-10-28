package dagger.internal;

/* compiled from: ProviderOfLazy.java */
/* loaded from: classes6.dex */
public final class u<T> implements t<d3.e<T>> {

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ boolean f22378b = false;

    /* renamed from: a, reason: collision with root package name */
    private final t<T> f22379a;

    private u(t<T> tVar) {
        this.f22379a = tVar;
    }

    public static <T> t<d3.e<T>> a(t<T> tVar) {
        tVar.getClass();
        return new u(tVar);
    }

    @Deprecated
    public static <T> t<d3.e<T>> b(h3.c<T> cVar) {
        return a(v.a(cVar));
    }

    @Override // h3.c
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public d3.e<T> get() {
        return g.a(this.f22379a);
    }
}
