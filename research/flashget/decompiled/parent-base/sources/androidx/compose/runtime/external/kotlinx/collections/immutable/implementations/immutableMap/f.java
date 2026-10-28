package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.h;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: PersistentHashMapBuilder.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0003\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u000f\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0017\u001a\u00020\u00162\u0014\u0010\u0015\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0019\u0010\u0010J\u001d\u0010\u0019\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR*\u0010'\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f8\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R.\u0010/\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010(8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R$\u00106\u001a\u0004\u0018\u00018\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010=\u001a\u0002078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\t\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R*\u0010@\u001a\u0002072\u0006\u0010\u0011\u001a\u0002078\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b>\u00108\u001a\u0004\b)\u0010:\"\u0004\b?\u0010<R&\u0010D\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010B0A8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010CR\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00028\u00000A8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010CR\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00010F8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u0010G¨\u0006I"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/f;", "K", "V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/h$a;", "Lkotlin/collections/g;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/d;", "map", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/d;)V", "f", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/d;", "key", "", "containsKey", "(Ljava/lang/Object;)Z", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "from", "Lkotlin/k2;", "putAll", "(Ljava/util/Map;)V", "remove", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "clear", "()V", "b", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/d;", "Lf0/f;", "<set-?>", "c", "Lf0/f;", "l", "()Lf0/f;", "q", "(Lf0/f;)V", "ownership", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", "d", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", "i", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", "o", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;)V", "node", "e", "Ljava/lang/Object;", "j", "()Ljava/lang/Object;", "p", "(Ljava/lang/Object;)V", "operationResult", "", "I", "h", "()I", "m", "(I)V", "modCount", "g", "r", "size", "", "", "()Ljava/util/Set;", "entries", "keys", "", "()Ljava/util/Collection;", "values", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class f<K, V> extends kotlin.collections.g<K, V> implements h.a<K, V> {

    /* renamed from: h, reason: collision with root package name */
    public static final int f16240h = 8;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private d<K, V> map;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private f0.f ownership = new f0.f();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private u<K, V> node;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private V operationResult;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int modCount;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int size;

    public f(@fg.l d<K, V> dVar) {
        this.map = dVar;
        this.node = this.map.t();
        this.size = this.map.getSize();
    }

    @Override // kotlin.collections.g
    @fg.l
    public Set<Map.Entry<K, V>> b() {
        return new h(this);
    }

    @Override // kotlin.collections.g
    @fg.l
    public Set<K> c() {
        return new j(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        u.INSTANCE.getClass();
        u<K, V> uVar = u.f16274g;
        l0.n(uVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.node = uVar;
        r(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(K key) {
        return this.node.n(key != null ? key.hashCode() : 0, key, 0);
    }

    @Override // kotlin.collections.g
    /* renamed from: d, reason: from getter */
    public int getSize() {
        return this.size;
    }

    @Override // kotlin.collections.g
    @fg.l
    public Collection<V> e() {
        return new l(this);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.h.a
    @fg.l
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public d<K, V> a() {
        d<K, V> dVar;
        if (this.node == this.map.t()) {
            dVar = this.map;
        } else {
            this.ownership = new f0.f();
            dVar = new d<>(this.node, getSize());
        }
        this.map = dVar;
        return dVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @fg.m
    public V get(K key) {
        return this.node.r(key != null ? key.hashCode() : 0, key, 0);
    }

    /* renamed from: h, reason: from getter */
    public final int getModCount() {
        return this.modCount;
    }

    @fg.l
    public final u<K, V> i() {
        return this.node;
    }

    @fg.m
    public final V j() {
        return this.operationResult;
    }

    @fg.l
    /* renamed from: l, reason: from getter */
    public final f0.f getOwnership() {
        return this.ownership;
    }

    public final void m(int i4) {
        this.modCount = i4;
    }

    public final void o(@fg.l u<K, V> uVar) {
        this.node = uVar;
    }

    public final void p(@fg.m V v4) {
        this.operationResult = v4;
    }

    @Override // kotlin.collections.g, java.util.AbstractMap, java.util.Map
    @fg.m
    public V put(K key, V value) {
        this.operationResult = null;
        this.node = this.node.G(key != null ? key.hashCode() : 0, key, value, 0, this);
        return this.operationResult;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(@fg.l Map<? extends K, ? extends V> from) {
        d<K, V> dVar = from instanceof d ? (d) from : null;
        if (dVar == null) {
            f fVar = from instanceof f ? (f) from : null;
            dVar = fVar != null ? fVar.a() : null;
        }
        if (dVar == null) {
            super.putAll(from);
            return;
        }
        f0.b bVar = new f0.b(0, 1, null);
        int size = getSize();
        u<K, V> uVar = this.node;
        u<K, V> t4 = dVar.t();
        l0.n(t4, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.node = uVar.H(t4, 0, bVar, this);
        int size2 = (dVar.getSize() + size) - bVar.d();
        if (size != size2) {
            r(size2);
        }
    }

    protected final void q(@fg.l f0.f fVar) {
        this.ownership = fVar;
    }

    public void r(int i4) {
        this.size = i4;
        this.modCount++;
    }

    @Override // java.util.Map
    public final boolean remove(Object key, Object value) {
        int size = getSize();
        u<K, V> K = this.node.K(key != null ? key.hashCode() : 0, key, value, 0, this);
        if (K == null) {
            u.INSTANCE.getClass();
            K = u.f16274g;
            l0.n(K, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.node = K;
        return size != getSize();
    }

    @Override // java.util.AbstractMap, java.util.Map
    @fg.m
    public V remove(K key) {
        this.operationResult = null;
        u<K, V> J = this.node.J(key != null ? key.hashCode() : 0, key, 0, this);
        if (J == null) {
            u.INSTANCE.getClass();
            J = u.f16274g;
            l0.n(J, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.node = J;
        return this.operationResult;
    }
}
