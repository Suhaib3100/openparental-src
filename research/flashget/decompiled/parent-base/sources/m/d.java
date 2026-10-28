package m;

import fg.l;
import fg.m;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

/* compiled from: LruHashMap.jvm.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001f\b\u0016\u0012\u0014\u0010\n\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000¢\u0006\u0004\b\b\u0010\u000bJ\u001a\u0010\r\u001a\u0004\u0018\u00018\u00012\u0006\u0010\f\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u0004\u0018\u00018\u00012\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u0004\u0018\u00018\u00012\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0004\b\u0012\u0010\u000eR0\u0010\u0016\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0013j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0015R\u0011\u0010\u001a\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R#\u0010\u001f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001c0\u001b8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lm/d;", "", "K", "V", "", "initialCapacity", "", "loadFactor", "<init>", "(IF)V", "original", "(Lm/d;)V", "key", "a", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "d", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "e", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "Ljava/util/LinkedHashMap;", "map", "", "c", "()Z", "isEmpty", "", "", "b", "()Ljava/util/Set;", "entries", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d<K, V> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final LinkedHashMap<K, V> map;

    public d() {
        this(0, 0.0f, 3, null);
    }

    @m
    public final V a(@l K key) {
        l0.p(key, "key");
        return this.map.get(key);
    }

    @l
    public final Set<Map.Entry<K, V>> b() {
        Set<Map.Entry<K, V>> entrySet = this.map.entrySet();
        l0.o(entrySet, "map.entries");
        return entrySet;
    }

    public final boolean c() {
        return this.map.isEmpty();
    }

    @m
    public final V d(@l K key, @l V value) {
        l0.p(key, "key");
        l0.p(value, "value");
        return this.map.put(key, value);
    }

    @m
    public final V e(@l K key) {
        l0.p(key, "key");
        return this.map.remove(key);
    }

    public d(int i4, float f4) {
        this.map = new LinkedHashMap<>(i4, f4, true);
    }

    public /* synthetic */ d(int i4, float f4, int i5, w wVar) {
        this((i5 & 1) != 0 ? 16 : i4, (i5 & 2) != 0 ? 0.75f : f4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(@l d<? extends K, V> original) {
        this(0, 0.0f, 3, null);
        l0.p(original, "original");
        for (Map.Entry<? extends K, V> entry : original.b()) {
            d(entry.getKey(), entry.getValue());
        }
    }
}
