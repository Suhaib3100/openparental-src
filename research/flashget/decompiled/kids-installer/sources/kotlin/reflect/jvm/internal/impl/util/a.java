package kotlin.reflect.jvm.internal.impl.util;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Iterator;
import kotlin.jvm.internal.l0;
import kotlin.reflect.KClass;

/* compiled from: ArrayMapOwner.kt */
/* loaded from: classes5.dex */
public abstract class a<K, V> implements Iterable<V>, r3.a {

    /* compiled from: ArrayMapOwner.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.util.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0394a<K, V, T extends V> {

        /* renamed from: a, reason: collision with root package name */
        @d5.d
        private final KClass<? extends K> f26573a;

        /* renamed from: b, reason: collision with root package name */
        private final int f26574b;

        public AbstractC0394a(@d5.d KClass<? extends K> kClass, int i5) {
            l0.p(kClass, ProtectedSandApp.s("塺"));
            this.f26573a = kClass;
            this.f26574b = i5;
        }

        @d5.e
        protected final T c(@d5.d a<K, V> aVar) {
            l0.p(aVar, ProtectedSandApp.s("塻"));
            return aVar.b().get(this.f26574b);
        }
    }

    @d5.d
    protected abstract c<V> b();

    @d5.d
    protected abstract s<K, V> f();

    protected abstract void g(@d5.d KClass<? extends K> kClass, @d5.d V v5);

    public final boolean isEmpty() {
        return b().b() == 0;
    }

    @Override // java.lang.Iterable
    @d5.d
    public final Iterator<V> iterator() {
        return b().iterator();
    }
}
