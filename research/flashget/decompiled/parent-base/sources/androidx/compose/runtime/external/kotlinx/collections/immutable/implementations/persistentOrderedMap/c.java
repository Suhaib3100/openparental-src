package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.h;
import androidx.compose.runtime.internal.u;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.w0;

/* compiled from: PersistentOrderedMap.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 2*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001<B5\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\t0\b¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e0\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e0\u0011H\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0018\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0014\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001f\u0010\u001cJ1\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0014\u0010!\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010 H\u0016¢\u0006\u0004\b\"\u0010#J\u001b\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016¢\u0006\u0004\b$\u0010%J\u001b\u0010'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010&H\u0016¢\u0006\u0004\b'\u0010(R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010)\u001a\u0004\b*\u0010+R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b-\u0010+R,\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\t0\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010.\u001a\u0004\b/\u00100R\u0014\u00104\u001a\u0002018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00028\u00000\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u0010R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00028\u0001078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0001\u00108R&\u0010;\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e0\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010\u0010¨\u0006="}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/c;", "K", "V", "Lkotlin/collections/d;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/h;", "", "firstKey", "lastKey", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/d;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/a;", "hashMap", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/d;)V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/e;", "", "p", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/e;", "", "e", "()Ljava/util/Set;", "key", "", "containsKey", "(Ljava/lang/Object;)Z", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "w", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/c;", "x", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/c;", "y", "", "m", "putAll", "(Ljava/util/Map;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/h;", "clear", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/h;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/h$a;", "g", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/h$a;", "Ljava/lang/Object;", "r", "()Ljava/lang/Object;", "f", "u", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/d;", "t", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/d;", "", "h", "()I", "size", "U0", "keys", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/b;", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/b;", "values", "B2", "entries", "a", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@u(parameters = 0)
@r1({"SMAP\nPersistentOrderedMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentOrderedMap.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap\n+ 2 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n*L\n1#1,135:1\n53#2:136\n*S KotlinDebug\n*F\n+ 1 PersistentOrderedMap.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap\n*L\n119#1:136\n*E\n"})
/* loaded from: classes.dex */
public final class c<K, V> extends kotlin.collections.d<K, V> implements androidx.compose.runtime.external.kotlinx.collections.immutable.h<K, V> {

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: i, reason: collision with root package name */
    public static final int f16336i = 8;

    /* renamed from: j, reason: collision with root package name */
    @fg.l
    private static final c f16337j;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final Object firstKey;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final Object lastKey;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d<K, a<V>> hashMap;

    /* compiled from: PersistentOrderedMap.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\bR \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/c$a;", "", "<init>", "()V", "K", "V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/c;", "a", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/c;", "", "EMPTY", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/c;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.c$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        public final <K, V> c<K, V> a() {
            c<K, V> cVar = c.f16337j;
            l0.n(cVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap.Companion.emptyOf>");
            return cVar;
        }

        public Companion(w wVar) {
        }
    }

    static {
        f0.c cVar = f0.c.f73848a;
        f16337j = new c(cVar, cVar, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d.INSTANCE.a());
    }

    public c(@fg.m Object obj, @fg.m Object obj2, @fg.l androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d<K, a<V>> dVar) {
        this.firstKey = obj;
        this.lastKey = obj2;
        this.hashMap = dVar;
    }

    private final androidx.compose.runtime.external.kotlinx.collections.immutable.e<Map.Entry<K, V>> p() {
        return new m(this);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.d
    @fg.l
    public androidx.compose.runtime.external.kotlinx.collections.immutable.e<Map.Entry<K, V>> B2() {
        return new m(this);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.d
    @fg.l
    /* renamed from: K */
    public androidx.compose.runtime.external.kotlinx.collections.immutable.b<V> i() {
        return new r(this);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.d
    @fg.l
    /* renamed from: U0 */
    public androidx.compose.runtime.external.kotlinx.collections.immutable.e<K> f() {
        return new o(this);
    }

    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.h
    @fg.l
    public androidx.compose.runtime.external.kotlinx.collections.immutable.h<K, V> clear() {
        return INSTANCE.a();
    }

    @Override // kotlin.collections.d, java.util.Map
    public boolean containsKey(Object key) {
        return this.hashMap.containsKey(key);
    }

    @Override // kotlin.collections.d
    @fg.l
    @w0
    public final Set<Map.Entry<K, V>> e() {
        return new m(this);
    }

    @Override // kotlin.collections.d
    public Set f() {
        return new o(this);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.h
    @fg.l
    public h.a<K, V> g() {
        return new d(this);
    }

    @Override // kotlin.collections.d, java.util.Map
    @fg.m
    public V get(Object key) {
        a<V> aVar = this.hashMap.get(key);
        if (aVar != null) {
            return aVar.e();
        }
        return null;
    }

    @Override // kotlin.collections.d
    /* renamed from: h */
    public int getSize() {
        return this.hashMap.size();
    }

    @Override // kotlin.collections.d
    public Collection i() {
        return new r(this);
    }

    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.h
    @fg.l
    public androidx.compose.runtime.external.kotlinx.collections.immutable.h<K, V> putAll(@fg.l Map<? extends K, ? extends V> m4) {
        l0.n(this, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        h.a<K, V> g4 = g();
        g4.putAll(m4);
        return g4.a();
    }

    public final androidx.compose.runtime.external.kotlinx.collections.immutable.e<Map.Entry<K, V>> q() {
        return new m(this);
    }

    @fg.m
    /* renamed from: r, reason: from getter */
    public final Object getFirstKey() {
        return this.firstKey;
    }

    @fg.l
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d<K, a<V>> t() {
        return this.hashMap;
    }

    @fg.m
    /* renamed from: u, reason: from getter */
    public final Object getLastKey() {
        return this.lastKey;
    }

    public final androidx.compose.runtime.external.kotlinx.collections.immutable.e<K> v() {
        return new o(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.d, java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.h
    @fg.l
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public c<K, V> put(K key, V value) {
        if (isEmpty()) {
            return new c<>(key, key, this.hashMap.put(key, new a<>(value)));
        }
        a<V> aVar = this.hashMap.get(key);
        if (aVar != null) {
            if (aVar.e() == value) {
                return this;
            }
            return new c<>(this.firstKey, this.lastKey, this.hashMap.put(key, aVar.h(value)));
        }
        Object obj = this.lastKey;
        Object obj2 = this.hashMap.get(obj);
        l0.m(obj2);
        return new c<>(this.firstKey, key, this.hashMap.put(obj, ((a) obj2).f(key)).put(key, new a(value, obj)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // kotlin.collections.d, java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.h
    @fg.l
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public c<K, V> remove(K key) {
        a<V> aVar = this.hashMap.get(key);
        if (aVar == null) {
            return this;
        }
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d<K, a<V>> remove = this.hashMap.remove(key);
        ?? r5 = remove;
        if (aVar.b()) {
            Object obj = remove.get(aVar.getPrevious());
            l0.m(obj);
            r5 = (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d<K, a<V>>) remove.put(aVar.getPrevious(), ((a) obj).f(aVar.getNext()));
        }
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d dVar = r5;
        if (aVar.a()) {
            Object obj2 = r5.get(aVar.getNext());
            l0.m(obj2);
            dVar = r5.put(aVar.getNext(), ((a) obj2).g(aVar.getPrevious()));
        }
        return new c<>(!aVar.b() ? aVar.getNext() : this.firstKey, !aVar.a() ? aVar.getPrevious() : this.lastKey, dVar);
    }

    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.h
    @fg.l
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public c<K, V> remove(K key, V value) {
        a<V> aVar = this.hashMap.get(key);
        return aVar == null ? this : l0.g(aVar.e(), value) ? remove(key) : this;
    }

    public final androidx.compose.runtime.external.kotlinx.collections.immutable.b<V> z() {
        return new r(this);
    }
}
