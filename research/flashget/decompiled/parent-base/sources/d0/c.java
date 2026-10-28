package d0;

import androidx.compose.runtime.external.kotlinx.collections.immutable.e;
import androidx.compose.runtime.internal.u;
import fg.l;
import fg.m;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.Metadata;

/* compiled from: ReadOnlyCollectionAdapters.kt */
@u(parameters = 0)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010&\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00028\u0001H\u0096\u0001¢\u0006\u0004\b\r\u0010\u000bJ\u001a\u0010\u000e\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u000bJ\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR \u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R \u0010'\u001a\b\u0012\u0004\u0012\u00028\u00010#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u0001\u0010&R,\u0010+\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010(0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010\u001f\u001a\u0004\b*\u0010!R\u0014\u0010,\u001a\u00020\u00158\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0017¨\u0006-"}, d2 = {"Ld0/c;", "K", "V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/d;", "", "impl", "<init>", "(Ljava/util/Map;)V", "key", "", "containsKey", "(Ljava/lang/Object;)Z", "value", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "isEmpty", "()Z", "", "other", "equals", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "b", "Ljava/util/Map;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/e;", "c", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/e;", "U0", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/e;", "keys", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/b;", "d", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/b;", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/b;", "values", "", "e", "B2", "entries", "size", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c<K, V> implements androidx.compose.runtime.external.kotlinx.collections.immutable.d<K, V>, Map<K, V>, md.a {

    /* renamed from: f, reason: collision with root package name */
    public static final int f73623f = 8;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final Map<K, V> impl;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final e<K> keys;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    private final androidx.compose.runtime.external.kotlinx.collections.immutable.b<V> values;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @l
    private final e<Map.Entry<K, V>> entries;

    /* JADX WARN: Multi-variable type inference failed */
    public c(@l Map<K, ? extends V> map) {
        this.impl = map;
        this.keys = new d((Collection) map.keySet());
        this.values = new a(map.values());
        this.entries = new d((Collection) map.entrySet());
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.d
    @l
    public e<Map.Entry<K, V>> B2() {
        return this.entries;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.d
    @l
    public androidx.compose.runtime.external.kotlinx.collections.immutable.b<V> K() {
        return this.values;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.d
    @l
    public e<K> U0() {
        return this.keys;
    }

    public final e<Map.Entry<K, V>> b() {
        return this.entries;
    }

    public int c() {
        return this.impl.size();
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V compute(K k4, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V computeIfAbsent(K k4, Function<? super K, ? extends V> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V computeIfPresent(K k4, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object key) {
        return this.impl.containsKey(key);
    }

    @Override // java.util.Map
    public boolean containsValue(Object value) {
        return this.impl.containsValue(value);
    }

    public final e<K> d() {
        return this.keys;
    }

    public final androidx.compose.runtime.external.kotlinx.collections.immutable.b<V> e() {
        return this.values;
    }

    @Override // java.util.Map
    public Set entrySet() {
        return this.entries;
    }

    @Override // java.util.Map
    public boolean equals(@m Object other) {
        return this.impl.equals(other);
    }

    @Override // java.util.Map
    @m
    public V get(Object key) {
        return this.impl.get(key);
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.impl.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.impl.isEmpty();
    }

    @Override // java.util.Map
    public Set keySet() {
        return this.keys;
    }

    @Override // java.util.Map
    public V merge(K k4, V v4, BiFunction<? super V, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V put(K k4, V v4) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V putIfAbsent(K k4, V v4) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V replace(K k4, V v4) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void replaceAll(BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.impl.size();
    }

    @l
    public String toString() {
        return this.impl.toString();
    }

    @Override // java.util.Map
    public Collection values() {
        return this.values;
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean replace(K k4, V v4, V v5) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
