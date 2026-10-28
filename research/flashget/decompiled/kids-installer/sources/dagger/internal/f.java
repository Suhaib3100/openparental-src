package dagger.internal;

/* compiled from: DelegateFactory.java */
/* loaded from: classes6.dex */
public final class f<T> implements h<T> {

    /* renamed from: a, reason: collision with root package name */
    private t<T> f22365a;

    public static <T> void b(t<T> tVar, t<T> tVar2) {
        d((f) tVar, tVar2);
    }

    @Deprecated
    public static <T> void c(h3.c<T> cVar, h3.c<T> cVar2) {
        d((f) cVar, v.a(cVar2));
    }

    private static <T> void d(f<T> fVar, t<T> tVar) {
        tVar.getClass();
        if (((f) fVar).f22365a != null) {
            throw new IllegalStateException();
        }
        ((f) fVar).f22365a = tVar;
    }

    t<T> a() {
        t<T> tVar = this.f22365a;
        tVar.getClass();
        return tVar;
    }

    @Deprecated
    public void e(t<T> tVar) {
        b(this, tVar);
    }

    @Deprecated
    public void f(h3.c<T> cVar) {
        b(this, v.a(cVar));
    }

    @Override // h3.c
    public T get() {
        t<T> tVar = this.f22365a;
        if (tVar != null) {
            return tVar.get();
        }
        throw new IllegalStateException();
    }
}
