package dagger.internal;

/* compiled from: Providers.java */
/* loaded from: classes7.dex */
public final class v {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Providers.java */
    class a<T> implements t<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ cd.c f73694a;

        a(cd.c cVar) {
            this.f73694a = cVar;
        }

        @Override // cd.c
        public T get() {
            return (T) this.f73694a.get();
        }
    }

    private v() {
    }

    public static <T> t<T> a(cd.c<T> cVar) {
        cVar.getClass();
        return new a(cVar);
    }
}
