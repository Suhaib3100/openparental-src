package kotlin.reflect.jvm.internal.impl.util;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;
import kotlin.reflect.KClass;

/* compiled from: ArrayMapOwner.kt */
/* loaded from: classes5.dex */
public abstract class s<K, V> {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final ConcurrentHashMap<KClass<? extends K>, Integer> f26646a = new ConcurrentHashMap<>();

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final AtomicInteger f26647b = new AtomicInteger(0);

    /* compiled from: ArrayMapOwner.kt */
    /* loaded from: classes6.dex */
    static final class a extends Lambda implements q3.l<KClass<? extends K>, Integer> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ s<K, V> f26648p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(s<K, V> sVar) {
            super(1);
            this.f26648p = sVar;
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer N(@d5.d KClass<? extends K> kClass) {
            l0.p(kClass, ProtectedSandApp.s("觛"));
            return Integer.valueOf(((s) this.f26648p).f26647b.getAndIncrement());
        }
    }

    public abstract <T extends K> int b(@d5.d ConcurrentHashMap<KClass<? extends K>, Integer> concurrentHashMap, @d5.d KClass<T> kClass, @d5.d q3.l<? super KClass<? extends K>, Integer> lVar);

    /* JADX WARN: Multi-variable type inference failed */
    @d5.d
    public final <T extends V, KK extends K> n<K, V, T> c(@d5.d KClass<KK> kClass) {
        l0.p(kClass, ProtectedSandApp.s("嗲"));
        return new n<>(kClass, d(kClass));
    }

    public final <T extends K> int d(@d5.d KClass<T> kClass) {
        l0.p(kClass, ProtectedSandApp.s("嗳"));
        return b(this.f26646a, kClass, new a(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @d5.d
    public final Collection<Integer> e() {
        Collection<Integer> values = this.f26646a.values();
        l0.o(values, ProtectedSandApp.s("嗴"));
        return values;
    }
}
