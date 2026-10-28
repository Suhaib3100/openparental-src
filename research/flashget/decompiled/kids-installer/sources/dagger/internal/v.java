package dagger.internal;

/* compiled from: Providers.java */
/* loaded from: classes5.dex */
public final class v {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Providers.java */
    /* loaded from: classes6.dex */
    class a<T> implements t<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ h3.c f22380a;

        a(h3.c cVar) {
            this.f22380a = cVar;
        }

        @Override // h3.c
        public T get() {
            return (T) this.f22380a.get();
        }
    }

    private v() {
    }

    public static <T> t<T> a(h3.c<T> cVar) {
        cVar.getClass();
        return new a(cVar);
    }
}
