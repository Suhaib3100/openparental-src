package kotlin.reflect.jvm.internal.impl.util;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Iterator;
import kotlin.jvm.internal.l0;

/* compiled from: ArrayMapOwner.kt */
/* loaded from: classes7.dex */
public abstract class a<K, V> implements Iterable<V>, md.a {

    /* compiled from: ArrayMapOwner.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.util.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC1198a<K, V, T extends V> {

        /* renamed from: a, reason: collision with root package name */
        private final int f78582a;

        public AbstractC1198a(int i4) {
            this.f78582a = i4;
        }

        @fg.m
        protected final T c(@fg.l a<K, V> aVar) {
            l0.p(aVar, ProtectedSandApp.s("肳\u0001"));
            return aVar.b().get(this.f78582a);
        }
    }

    @fg.l
    protected abstract c<V> b();

    @fg.l
    protected abstract s<K, V> c();

    protected abstract void f(@fg.l String str, @fg.l V v4);

    protected final void h(@fg.l kotlin.reflect.d<? extends K> dVar, @fg.l V v4) {
        l0.p(dVar, ProtectedSandApp.s("緵\u0001"));
        l0.p(v4, ProtectedSandApp.s("緶\u0001"));
        String N = dVar.N();
        l0.m(N);
        f(N, v4);
    }

    public final boolean isEmpty() {
        return b().b() == 0;
    }

    @Override // java.lang.Iterable
    @fg.l
    public final Iterator<V> iterator() {
        return b().iterator();
    }
}
