package dagger.android;

/* compiled from: AndroidInjector.java */
/* loaded from: classes7.dex */
public interface d<T> {

    /* compiled from: AndroidInjector.java */
    @Deprecated
    public static abstract class a<T> implements b<T> {
        public abstract d<T> a();

        @vc.b
        public abstract void b(T instance);

        @Override // dagger.android.d.b
        public final d<T> create(T instance) {
            b(instance);
            return a();
        }
    }

    /* compiled from: AndroidInjector.java */
    public interface b<T> {
        d<T> create(@vc.b T instance);
    }

    void i(T instance);
}
