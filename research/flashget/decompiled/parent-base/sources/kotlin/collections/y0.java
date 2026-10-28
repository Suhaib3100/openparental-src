package kotlin.collections;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: MapWithDefault.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010&\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B>\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u0011J\u0017\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001c\u0010\u0011J\u001a\u0010\u001d\u001a\u0004\u0018\u00018\u00012\u0006\u0010\t\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00028\u00012\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001f\u0010\u001eR&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R/\u0010\n\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u0014R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010)R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00010+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R&\u00100\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010/0(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010)¨\u00061"}, d2 = {"Lkotlin/collections/y0;", "K", "V", "Lkotlin/collections/x0;", "", "map", "Lkotlin/Function1;", "Lkotlin/r0;", "name", "key", "default", "<init>", "(Ljava/util/Map;Lld/l;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "isEmpty", "()Z", "containsKey", "value", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "e2", "b", "Ljava/util/Map;", "getMap", "()Ljava/util/Map;", "c", "Lld/l;", "d", "size", "", "()Ljava/util/Set;", "keys", "", "e", "()Ljava/util/Collection;", "values", "", "entries", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nMapWithDefault.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MapWithDefaultImpl\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,104:1\n341#2,6:105\n*S KotlinDebug\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MapWithDefaultImpl\n*L\n80#1:105,6\n*E\n"})
/* loaded from: classes7.dex */
final class y0<K, V> implements x0<K, V> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Map<K, V> map;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.l<K, V> default;

    /* JADX WARN: Multi-variable type inference failed */
    public y0(@fg.l Map<K, ? extends V> map, @fg.l ld.l<? super K, ? extends V> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("拉\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("拊\u0001"));
        this.map = map;
        this.default = lVar;
    }

    @fg.l
    public Set<Map.Entry<K, V>> b() {
        return this.map.entrySet();
    }

    @fg.l
    public Set<K> c() {
        return this.map.keySet();
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("拋\u0001"));
    }

    @Override // java.util.Map
    public boolean containsKey(Object key) {
        return this.map.containsKey(key);
    }

    @Override // java.util.Map
    public boolean containsValue(Object value) {
        return this.map.containsValue(value);
    }

    public int d() {
        return this.map.size();
    }

    @fg.l
    public Collection<V> e() {
        return this.map.values();
    }

    @Override // kotlin.collections.x0
    public V e2(K key) {
        Map<K, V> map = this.map;
        V v4 = map.get(key);
        return (v4 != null || map.containsKey(key)) ? v4 : this.default.invoke(key);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return this.map.entrySet();
    }

    @Override // java.util.Map
    public boolean equals(@fg.m Object other) {
        return this.map.equals(other);
    }

    @Override // java.util.Map
    @fg.m
    public V get(Object key) {
        return this.map.get(key);
    }

    @Override // kotlin.collections.x0
    @fg.l
    public Map<K, V> getMap() {
        return this.map;
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.map.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.map.isEmpty();
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        return this.map.keySet();
    }

    @Override // java.util.Map
    public V put(K k4, V v4) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("拋\u0001"));
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("拋\u0001"));
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("拋\u0001"));
    }

    @Override // java.util.Map
    public final int size() {
        return this.map.size();
    }

    @fg.l
    public String toString() {
        return this.map.toString();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        return this.map.values();
    }
}
