package kotlin.collections;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MapWithDefault.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003B<\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0002\u0010\u000bJ\u0015\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001fJ\u0015\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u001fJ\u0013\u0010\"\u001a\u00020\u001e2\b\u0010#\u001a\u0004\u0018\u00010$H\u0096\u0002J\u0018\u0010%\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010&J\u0015\u0010'\u001a\u00028\u00012\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010&J\b\u0010(\u001a\u00020\u0016H\u0016J\b\u0010)\u001a\u00020\u001eH\u0016J\b\u0010*\u001a\u00020+H\u0016R)\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00028\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e0\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006,"}, d2 = {"Lkotlin/collections/MapWithDefaultImpl;", "K", "V", "Lkotlin/collections/MapWithDefault;", "map", "", "default", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "key", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)V", "entries", "", "", "getEntries", "()Ljava/util/Set;", "keys", "getKeys", "getMap", "()Ljava/util/Map;", "size", "", "getSize", "()I", "values", "", "getValues", "()Ljava/util/Collection;", "containsKey", "", "(Ljava/lang/Object;)Z", "containsValue", "value", "equals", "other", "", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "getOrImplicitDefault", "hashCode", "isEmpty", "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMapWithDefault.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MapWithDefaultImpl\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,104:1\n341#2,6:105\n*S KotlinDebug\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MapWithDefaultImpl\n*L\n80#1:105,6\n*E\n"})
/* renamed from: kotlin.collections.b1, reason: from Kotlin metadata */
/* loaded from: classes6.dex */
final class MapWithDefaultImpl<K, V> implements MapWithDefault<K, V> {

    /* renamed from: o, reason: collision with root package name */
    @d5.d
    private final Map<K, V> f23079o;

    /* renamed from: p, reason: collision with root package name */
    @d5.d
    private final q3.l<K, V> f23080p;

    /* JADX WARN: Multi-variable type inference failed */
    public MapWithDefaultImpl(@d5.d Map<K, ? extends V> map, @d5.d q3.l<? super K, ? extends V> lVar) {
        kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("殊"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("残"));
        this.f23079o = map;
        this.f23080p = lVar;
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("殌"));
    }

    @Override // java.util.Map
    public boolean containsKey(Object key) {
        return this.f23079o.containsKey(key);
    }

    @Override // java.util.Map
    public boolean containsValue(Object value) {
        return this.f23079o.containsValue(value);
    }

    @d5.d
    public Set<Map.Entry<K, V>> d() {
        return this.f23079o.entrySet();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return d();
    }

    @Override // java.util.Map
    public boolean equals(@d5.e Object other) {
        return this.f23079o.equals(other);
    }

    @d5.d
    public Set<K> f() {
        return this.f23079o.keySet();
    }

    public int g() {
        return this.f23079o.size();
    }

    @Override // java.util.Map
    @d5.e
    public V get(Object key) {
        return this.f23079o.get(key);
    }

    @d5.d
    public Collection<V> h() {
        return this.f23079o.values();
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.f23079o.hashCode();
    }

    @Override // kotlin.collections.MapWithDefault
    @d5.d
    public Map<K, V> i() {
        return this.f23079o;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f23079o.isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return f();
    }

    @Override // kotlin.collections.MapWithDefault
    public V o(K k5) {
        Map<K, V> map = this.f23079o;
        V v5 = map.get(k5);
        return (v5 != null || map.containsKey(k5)) ? v5 : this.f23080p.N(k5);
    }

    @Override // java.util.Map
    public V put(K k5, V v5) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("殍"));
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("殎"));
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("殏"));
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return g();
    }

    @d5.d
    public String toString() {
        return this.f23079o.toString();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return h();
    }
}
