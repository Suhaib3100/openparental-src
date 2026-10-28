package db;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

/* compiled from: DataStore.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\b\n\u0002\u0010\u001f\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0002B@\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0002\u0012!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0003H\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0010H\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\"\u0010\u0018\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001c\u001a\u00020\f2\u0014\u0010\u001b\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u001aH\u0096\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001e\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000f\u001a\u00020\u0003H\u0096\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010 \u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b \u0010\u001fR \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010!R/\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\"R&\u0010'\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000$0#8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b%\u0010&R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00030#8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b(\u0010&R\u0014\u0010,\u001a\u00020\u00038\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b*\u0010+R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000-8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"Ldb/a;", "V", "", "", "store", "Lkotlin/Function1;", "Lkotlin/r0;", "name", "offset", "create", "<init>", "(Ljava/util/Map;Lld/l;)V", "Lkotlin/k2;", "clear", "()V", "key", "", "b", "(I)Z", "value", "containsValue", "(Ljava/lang/Object;)Z", "isEmpty", "()Z", "i", "(ILjava/lang/Object;)Ljava/lang/Object;", "", "from", "putAll", "(Ljava/util/Map;)V", "j", "(I)Ljava/lang/Object;", "c", "Ljava/util/Map;", "Lld/l;", "", "", "d", "()Ljava/util/Set;", "entries", "e", "keys", "f", "()I", "size", "", "h", "()Ljava/util/Collection;", "values", "Calendar-View_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class a<V> implements Map<Integer, V>, md.g {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final Map<Integer, V> store;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final ld.l<Integer, V> create;

    /* JADX WARN: Multi-variable type inference failed */
    public a(@l Map<Integer, V> map, @l ld.l<? super Integer, ? extends V> lVar) {
        l0.p(map, ProtectedSandApp.s("㜋\u0001"));
        l0.p(lVar, ProtectedSandApp.s("㜌\u0001"));
        this.store = map;
        this.create = lVar;
    }

    public boolean b(int key) {
        return this.store.containsKey(Integer.valueOf(key));
    }

    public V c(int key) {
        V v4 = this.store.get(Integer.valueOf(key));
        if (v4 != null) {
            return v4;
        }
        V invoke = this.create.invoke(Integer.valueOf(key));
        i(key, invoke);
        return invoke;
    }

    @Override // java.util.Map
    public void clear() {
        this.store.clear();
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof Integer) {
            return b(((Number) obj).intValue());
        }
        return false;
    }

    @Override // java.util.Map
    public boolean containsValue(Object value) {
        return this.store.containsValue(value);
    }

    @l
    public Set<Map.Entry<Integer, V>> d() {
        return this.store.entrySet();
    }

    @l
    public Set<Integer> e() {
        return this.store.keySet();
    }

    @Override // java.util.Map
    public final Set<Map.Entry<Integer, V>> entrySet() {
        return this.store.entrySet();
    }

    public int f() {
        return this.store.size();
    }

    @Override // java.util.Map
    public final /* bridge */ V get(Object obj) {
        if (obj instanceof Integer) {
            return c(((Number) obj).intValue());
        }
        return null;
    }

    @l
    public Collection<V> h() {
        return this.store.values();
    }

    @m
    public V i(int key, V value) {
        return this.store.put(Integer.valueOf(key), value);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.store.isEmpty();
    }

    @m
    public V j(int key) {
        return this.store.remove(Integer.valueOf(key));
    }

    @Override // java.util.Map
    public final Set<Integer> keySet() {
        return this.store.keySet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object put(Integer num, Object obj) {
        return i(num.intValue(), obj);
    }

    @Override // java.util.Map
    public void putAll(@l Map<? extends Integer, ? extends V> from) {
        l0.p(from, ProtectedSandApp.s("㜍\u0001"));
        this.store.putAll(from);
    }

    @Override // java.util.Map
    public final /* bridge */ V remove(Object obj) {
        if (obj instanceof Integer) {
            return j(((Number) obj).intValue());
        }
        return null;
    }

    @Override // java.util.Map
    public final int size() {
        return this.store.size();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        return this.store.values();
    }

    public /* synthetic */ a(Map map, ld.l lVar, int i4, w wVar) {
        this((i4 & 1) != 0 ? new HashMap() : map, lVar);
    }
}
