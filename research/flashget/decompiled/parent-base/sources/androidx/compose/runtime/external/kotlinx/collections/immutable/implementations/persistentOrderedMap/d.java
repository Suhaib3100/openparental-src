package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.h;
import androidx.compose.runtime.internal.u;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: PersistentOrderedMapBuilder.kt */
@u(parameters = 0)
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0010\u001a\u0004\u0018\u00018\u00012\u0006\u0010\f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0013\u001a\u0004\u0018\u00018\u00012\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u0004\u0018\u00018\u00012\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0011J\u001d\u0010\u0015\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR(\u0010\"\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0018\u0010$\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u001fR,\u0010+\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010&0%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0014\u0010.\u001a\u00020,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010-R&\u00102\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001000/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u00101R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u00101R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00028\u0001048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u00105¨\u00067"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/d;", "K", "V", "Lkotlin/collections/g;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/h$a;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/c;", "map", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/c;)V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/h;", "a", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/h;", "key", "", "containsKey", "(Ljava/lang/Object;)Z", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "Lkotlin/k2;", "clear", "()V", "b", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/c;", "", "<set-?>", "c", "Ljava/lang/Object;", "f", "()Ljava/lang/Object;", "firstKey", "d", "lastKey", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/f;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/a;", "e", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/f;", "h", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/f;", "hashMapBuilder", "", "()I", "size", "", "", "()Ljava/util/Set;", "entries", "keys", "", "()Ljava/util/Collection;", "values", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d<K, V> extends kotlin.collections.g<K, V> implements h.a<K, V> {

    /* renamed from: f, reason: collision with root package name */
    public static final int f16341f = 8;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private c<K, V> map;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private Object firstKey;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private Object lastKey;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.f<K, a<V>> hashMapBuilder;

    public d(@fg.l c<K, V> cVar) {
        this.map = cVar;
        this.firstKey = cVar.getFirstKey();
        this.lastKey = this.map.getLastKey();
        this.hashMapBuilder = this.map.t().g();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.h.a
    @fg.l
    public androidx.compose.runtime.external.kotlinx.collections.immutable.h<K, V> a() {
        c<K, V> cVar;
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d<K, a<V>> a5 = this.hashMapBuilder.a();
        if (a5 == this.map.t()) {
            this.map.getFirstKey();
            this.map.getLastKey();
            cVar = this.map;
        } else {
            cVar = new c<>(this.firstKey, this.lastKey, a5);
        }
        this.map = cVar;
        return cVar;
    }

    @Override // kotlin.collections.g
    @fg.l
    public Set<Map.Entry<K, V>> b() {
        return new e(this);
    }

    @Override // kotlin.collections.g
    @fg.l
    public Set<K> c() {
        return new g(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.hashMapBuilder.clear();
        f0.c cVar = f0.c.f73848a;
        this.firstKey = cVar;
        this.lastKey = cVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object key) {
        return this.hashMapBuilder.containsKey(key);
    }

    @Override // kotlin.collections.g
    /* renamed from: d */
    public int getSize() {
        return this.hashMapBuilder.size();
    }

    @Override // kotlin.collections.g
    @fg.l
    public Collection<V> e() {
        return new k(this);
    }

    @fg.m
    /* renamed from: f, reason: from getter */
    public final Object getFirstKey() {
        return this.firstKey;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @fg.m
    public V get(Object key) {
        a<V> aVar = this.hashMapBuilder.get(key);
        if (aVar != null) {
            return aVar.e();
        }
        return null;
    }

    @fg.l
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.f<K, a<V>> h() {
        return this.hashMapBuilder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.g, java.util.AbstractMap, java.util.Map
    @fg.m
    public V put(K key, V value) {
        a<V> aVar = this.hashMapBuilder.get(key);
        if (aVar != null) {
            if (aVar.e() == value) {
                return value;
            }
            this.hashMapBuilder.put(key, aVar.h(value));
            return aVar.e();
        }
        if (isEmpty()) {
            this.firstKey = key;
            this.lastKey = key;
            this.hashMapBuilder.put(key, new a<>(value));
            return null;
        }
        Object obj = this.lastKey;
        Object obj2 = this.hashMapBuilder.get(obj);
        l0.m(obj2);
        a aVar2 = (a) obj2;
        aVar2.a();
        this.hashMapBuilder.put(obj, aVar2.f(key));
        this.hashMapBuilder.put(key, new a<>(value, obj));
        this.lastKey = key;
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    @fg.m
    public V remove(Object key) {
        a<V> remove = this.hashMapBuilder.remove(key);
        if (remove == null) {
            return null;
        }
        if (remove.b()) {
            a<V> aVar = this.hashMapBuilder.get(remove.getPrevious());
            l0.m(aVar);
            this.hashMapBuilder.put(remove.getPrevious(), aVar.f(remove.getNext()));
        } else {
            this.firstKey = remove.getNext();
        }
        if (remove.a()) {
            a<V> aVar2 = this.hashMapBuilder.get(remove.getNext());
            l0.m(aVar2);
            this.hashMapBuilder.put(remove.getNext(), aVar2.g(remove.getPrevious()));
        } else {
            this.lastKey = remove.getPrevious();
        }
        return remove.e();
    }

    @Override // java.util.Map
    public final boolean remove(Object key, Object value) {
        a<V> aVar = this.hashMapBuilder.get(key);
        if (aVar == null || !l0.g(aVar.e(), value)) {
            return false;
        }
        remove(key);
        return true;
    }
}
