package dagger.internal;

/* compiled from: DelegateFactory.java */
/* loaded from: classes7.dex */
public final class f<T> implements h<T> {

    /* renamed from: a, reason: collision with root package name */
    private t<T> f73679a;

    @Deprecated
    public static <T> void b(cd.c<T> cVar, cd.c<T> cVar2) {
        d((f) cVar, v.a(cVar2));
    }

    public static <T> void c(t<T> tVar, t<T> tVar2) {
        d((f) tVar, tVar2);
    }

    private static <T> void d(f<T> fVar, t<T> tVar) {
        tVar.getClass();
        if (((f) fVar).f73679a != null) {
            throw new IllegalStateException();
        }
        ((f) fVar).f73679a = tVar;
    }

    t<T> a() {
        t<T> tVar = this.f73679a;
        tVar.getClass();
        return tVar;
    }

    @Deprecated
    public void e(cd.c<T> cVar) {
        d(this, v.a(cVar));
    }

    @Deprecated
    public void f(t<T> tVar) {
        d(this, tVar);
    }

    @Override // cd.c
    public T get() {
        t<T> tVar = this.f73679a;
        if (tVar != null) {
            return tVar.get();
        }
        throw new IllegalStateException();
    }
}
