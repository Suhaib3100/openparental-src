package kotlin.reflect.jvm.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;

/* compiled from: CacheByClass.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\u0012\u0016\u0010\u000b\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0005\u001a\u00028\u00002\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\b\u001a\u00020\u0007H\u0016R$\u0010\u000b\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00028\u00000\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\nR$\u0010\u000e\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00028\u00000\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\r¨\u0006\u0011"}, d2 = {"Lkotlin/reflect/jvm/internal/f;", "V", "Lkotlin/reflect/jvm/internal/a;", "Ljava/lang/Class;", "key", "b", "(Ljava/lang/Class;)Ljava/lang/Object;", "Lkotlin/m2;", "a", "Lkotlin/Function1;", "Lq3/l;", "compute", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/ConcurrentHashMap;", "cache", "<init>", "(Lq3/l;)V", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes5.dex */
final class f<V> extends a<V> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final q3.l<Class<?>, V> compute;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final ConcurrentHashMap<Class<?>, V> cache;

    /* JADX WARN: Multi-variable type inference failed */
    public f(@d5.d q3.l<? super Class<?>, ? extends V> lVar) {
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("䏀"));
        this.compute = lVar;
        this.cache = new ConcurrentHashMap<>();
    }

    @Override // kotlin.reflect.jvm.internal.a
    public void a() {
        this.cache.clear();
    }

    @Override // kotlin.reflect.jvm.internal.a
    public V b(@d5.d Class<?> key) {
        kotlin.jvm.internal.l0.p(key, ProtectedSandApp.s("䏁"));
        ConcurrentHashMap<Class<?>, V> concurrentHashMap = this.cache;
        V v5 = (V) concurrentHashMap.get(key);
        if (v5 != null) {
            return v5;
        }
        V N = this.compute.N(key);
        V v6 = (V) concurrentHashMap.putIfAbsent(key, N);
        return v6 == null ? N : v6;
    }
}
