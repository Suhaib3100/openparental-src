package dagger.android;

/* compiled from: AndroidInjector.java */
/* loaded from: classes5.dex */
public interface d<T> {

    /* compiled from: AndroidInjector.java */
    @Deprecated
    public static abstract class a<T> implements b<T> {
        @Override // dagger.android.d.b
        public final d<T> a(T instance) {
            c(instance);
            return b();
        }

        public abstract d<T> b();

        @d3.b
        public abstract void c(T instance);
    }

    /* compiled from: AndroidInjector.java */
    public interface b<T> {
        d<T> a(@d3.b T instance);
    }

    void b(T instance);
}
