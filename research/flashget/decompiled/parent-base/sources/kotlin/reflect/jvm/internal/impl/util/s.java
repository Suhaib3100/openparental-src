package kotlin.reflect.jvm.internal.impl.util;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;

/* compiled from: ArrayMapOwner.kt */
/* loaded from: classes7.dex */
public abstract class s<K, V> {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private final ConcurrentHashMap<String, Integer> f78654a = new ConcurrentHashMap<>();

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private final AtomicInteger f78655b = new AtomicInteger(0);

    /* compiled from: ArrayMapOwner.kt */
    static final class a extends n0 implements ld.l<String, Integer> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ s<K, V> f78656b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(s<K, V> sVar) {
            super(1);
            this.f78656b = sVar;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(@fg.l String str) {
            l0.p(str, ProtectedSandApp.s("脜\u0001"));
            return Integer.valueOf(((s) this.f78656b).f78655b.getAndIncrement());
        }
    }

    public abstract int b(@fg.l ConcurrentHashMap<String, Integer> concurrentHashMap, @fg.l String str, @fg.l ld.l<? super String, Integer> lVar);

    /* JADX WARN: Multi-variable type inference failed */
    @fg.l
    public final <T extends V, KK extends K> n<K, V, T> c(@fg.l kotlin.reflect.d<KK> dVar) {
        l0.p(dVar, ProtectedSandApp.s("緮\u0001"));
        return new n<>(e(dVar));
    }

    public final int d(@fg.l String str) {
        l0.p(str, ProtectedSandApp.s("緯\u0001"));
        return b(this.f78654a, str, new a(this));
    }

    public final <T extends K> int e(@fg.l kotlin.reflect.d<T> dVar) {
        l0.p(dVar, ProtectedSandApp.s("緮\u0001"));
        String N = dVar.N();
        l0.m(N);
        return d(N);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @fg.l
    public final Collection<Integer> f() {
        Collection<Integer> values = this.f78654a.values();
        l0.o(values, ProtectedSandApp.s("緰\u0001"));
        return values;
    }
}
