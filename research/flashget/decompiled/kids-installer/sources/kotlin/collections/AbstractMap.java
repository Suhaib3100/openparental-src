package kotlin.collections;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AbstractMap.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010&\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\b'\u0018\u0000 )*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003:\u0001)B\u0007\b\u0004¢\u0006\u0002\u0010\u0004J\u001f\u0010\u0013\u001a\u00020\u00142\u0010\u0010\u0015\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0016H\u0000¢\u0006\u0002\b\u0017J\u0015\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001d\u001a\u00020\u00142\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\u0018\u0010 \u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0019\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010!J\b\u0010\"\u001a\u00020\rH\u0016J#\u0010#\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00162\u0006\u0010\u0019\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010$J\b\u0010%\u001a\u00020\u0014H\u0016J\b\u0010&\u001a\u00020'H\u0016J\u0012\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u001fH\u0002J\u001c\u0010&\u001a\u00020'2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0016H\bR\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\bX\u0088\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006*"}, d2 = {"Lkotlin/collections/AbstractMap;", "K", "V", "", "()V", "_keys", "", "_values", "", "keys", "getKeys", "()Ljava/util/Set;", "size", "", "getSize", "()I", "values", "getValues", "()Ljava/util/Collection;", "containsEntry", "", "entry", "", "containsEntry$kotlin_stdlib", "containsKey", "key", "(Ljava/lang/Object;)Z", "containsValue", "value", "equals", "other", "", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "hashCode", "implFindEntry", "(Ljava/lang/Object;)Ljava/util/Map$Entry;", "isEmpty", "toString", "", "o", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SinceKotlin(version = "1.1")
@SourceDebugExtension({"SMAP\nAbstractMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractMap.kt\nkotlin/collections/AbstractMap\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,153:1\n1747#2,3:154\n1726#2,3:157\n288#2,2:160\n*S KotlinDebug\n*F\n+ 1 AbstractMap.kt\nkotlin/collections/AbstractMap\n*L\n28#1:154,3\n60#1:157,3\n141#1:160,2\n*E\n"})
/* renamed from: kotlin.collections.d, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
public abstract class AbstractMap<K, V> implements Map<K, V>, r3.a {

    /* renamed from: q, reason: collision with root package name */
    @d5.d
    public static final a f23135q = new a(null);

    /* renamed from: o, reason: collision with root package name */
    @d5.e
    private volatile Set<? extends K> f23136o;

    /* renamed from: p, reason: collision with root package name */
    @d5.e
    private volatile Collection<? extends V> f23137p;

    /* compiled from: AbstractMap.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J'\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0002\b\bJ\u001d\u0010\t\u001a\u00020\n2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0006H\u0000¢\u0006\u0002\b\u000bJ\u001d\u0010\f\u001a\u00020\r2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0006H\u0000¢\u0006\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lkotlin/collections/AbstractMap$Companion;", "", "()V", "entryEquals", "", "e", "", "other", "entryEquals$kotlin_stdlib", "entryHashCode", "", "entryHashCode$kotlin_stdlib", "entryToString", "", "entryToString$kotlin_stdlib", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nAbstractMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractMap.kt\nkotlin/collections/AbstractMap$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,153:1\n1#2:154\n*E\n"})
    /* renamed from: kotlin.collections.d$a */
    public static final class a {
        private a() {
        }

        public final boolean a(@d5.d Map.Entry<?, ?> entry, @d5.e Object obj) {
            kotlin.jvm.internal.l0.p(entry, ProtectedSandApp.s("㞝"));
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry2 = (Map.Entry) obj;
            return kotlin.jvm.internal.l0.g(entry.getKey(), entry2.getKey()) && kotlin.jvm.internal.l0.g(entry.getValue(), entry2.getValue());
        }

        public final int b(@d5.d Map.Entry<?, ?> entry) {
            kotlin.jvm.internal.l0.p(entry, ProtectedSandApp.s("㞞"));
            Object key = entry.getKey();
            int hashCode = key != null ? key.hashCode() : 0;
            Object value = entry.getValue();
            return hashCode ^ (value != null ? value.hashCode() : 0);
        }

        @d5.d
        public final String c(@d5.d Map.Entry<?, ?> entry) {
            kotlin.jvm.internal.l0.p(entry, ProtectedSandApp.s("㞟"));
            StringBuilder sb = new StringBuilder();
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            return sb.toString();
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: AbstractMap.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\tJ\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0096\u0002R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\f"}, d2 = {"kotlin/collections/AbstractMap$keys$1", "Lkotlin/collections/AbstractSet;", "size", "", "getSize", "()I", "contains", "", "element", "(Ljava/lang/Object;)Z", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.collections.d$b */
    /* loaded from: classes6.dex */
    public static final class b extends AbstractSet<K> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ AbstractMap<K, V> f23138p;

        /* compiled from: AbstractMap.kt */
        @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\u0002\u001a\u00020\u0003H\u0096\u0002J\u000e\u0010\u0004\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"kotlin/collections/AbstractMap$keys$1$iterator$1", "", "hasNext", "", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: kotlin.collections.d$b$a */
        /* loaded from: classes5.dex */
        public static final class a implements Iterator<K>, r3.a {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ Iterator<Map.Entry<K, V>> f23139o;

            /* JADX WARN: Multi-variable type inference failed */
            a(Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
                this.f23139o = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f23139o.hasNext();
            }

            @Override // java.util.Iterator
            public K next() {
                return this.f23139o.next().getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException(ProtectedSandApp.s("㞠"));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        b(AbstractMap<K, ? extends V> abstractMap) {
            this.f23138p = abstractMap;
        }

        @Override // kotlin.collections.AbstractCollection
        /* renamed from: b */
        public int getF23147s() {
            return this.f23138p.size();
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean contains(Object element) {
            return this.f23138p.containsKey(element);
        }

        @Override // kotlin.collections.AbstractSet, kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable
        @d5.d
        public Iterator<K> iterator() {
            return new a(this.f23138p.entrySet().iterator());
        }
    }

    /* compiled from: AbstractMap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010&\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0006\b\u0001\u0010\u0003 \u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "K", "V", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.collections.d$c */
    /* loaded from: classes6.dex */
    static final class c extends Lambda implements q3.l<Map.Entry<? extends K, ? extends V>, CharSequence> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ AbstractMap<K, V> f23140p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(AbstractMap<K, ? extends V> abstractMap) {
            super(1);
            this.f23140p = abstractMap;
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence N(@d5.d Map.Entry<? extends K, ? extends V> entry) {
            kotlin.jvm.internal.l0.p(entry, ProtectedSandApp.s("沝"));
            return this.f23140p.n(entry);
        }
    }

    /* compiled from: AbstractMap.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\tJ\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0096\u0002R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\f"}, d2 = {"kotlin/collections/AbstractMap$values$1", "Lkotlin/collections/AbstractCollection;", "size", "", "getSize", "()I", "contains", "", "element", "(Ljava/lang/Object;)Z", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.collections.d$d */
    /* loaded from: classes6.dex */
    public static final class d extends AbstractCollection<V> {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ AbstractMap<K, V> f23141o;

        /* compiled from: AbstractMap.kt */
        @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\u0002\u001a\u00020\u0003H\u0096\u0002J\u000e\u0010\u0004\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"kotlin/collections/AbstractMap$values$1$iterator$1", "", "hasNext", "", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: kotlin.collections.d$d$a */
        /* loaded from: classes5.dex */
        public static final class a implements Iterator<V>, r3.a {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ Iterator<Map.Entry<K, V>> f23142o;

            /* JADX WARN: Multi-variable type inference failed */
            a(Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
                this.f23142o = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f23142o.hasNext();
            }

            @Override // java.util.Iterator
            public V next() {
                return this.f23142o.next().getValue();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException(ProtectedSandApp.s("㞡"));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        d(AbstractMap<K, ? extends V> abstractMap) {
            this.f23141o = abstractMap;
        }

        @Override // kotlin.collections.AbstractCollection
        /* renamed from: b */
        public int getF23147s() {
            return this.f23141o.size();
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean contains(Object element) {
            return this.f23141o.containsValue(element);
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable
        @d5.d
        public Iterator<V> iterator() {
            return new a(this.f23141o.entrySet().iterator());
        }
    }

    protected AbstractMap() {
    }

    private final Map.Entry<K, V> l(K k5) {
        Object obj;
        Iterator<T> it = entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.l0.g(((Map.Entry) obj).getKey(), k5)) {
                break;
            }
        }
        return (Map.Entry) obj;
    }

    private final String m(Object obj) {
        return obj == this ? ProtectedSandApp.s("㞩") : String.valueOf(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String n(Map.Entry<? extends K, ? extends V> entry) {
        return m(entry.getKey()) + '=' + m(entry.getValue());
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("㞪"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object key) {
        return l(key) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object value) {
        Set<Map.Entry<K, V>> entrySet = entrySet();
        if ((entrySet instanceof Collection) && entrySet.isEmpty()) {
            return false;
        }
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.l0.g(((Map.Entry) it.next()).getValue(), value)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return g();
    }

    @Override // java.util.Map
    public boolean equals(@d5.e Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Map)) {
            return false;
        }
        Map map = (Map) other;
        if (size() != map.size()) {
            return false;
        }
        Set<Map.Entry<K, V>> entrySet = map.entrySet();
        if ((entrySet instanceof Collection) && entrySet.isEmpty()) {
            return true;
        }
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            if (!f((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean f(@d5.e Map.Entry<?, ?> entry) {
        if (entry == null) {
            return false;
        }
        Object key = entry.getKey();
        Object value = entry.getValue();
        kotlin.jvm.internal.l0.n(this, ProtectedSandApp.s("㞫"));
        V v5 = get(key);
        if (!kotlin.jvm.internal.l0.g(value, v5)) {
            return false;
        }
        if (v5 != null) {
            return true;
        }
        kotlin.jvm.internal.l0.n(this, ProtectedSandApp.s("㞬"));
        return containsKey(key);
    }

    public abstract Set g();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    @d5.e
    public V get(Object key) {
        Map.Entry<K, V> l5 = l(key);
        if (l5 != null) {
            return l5.getValue();
        }
        return null;
    }

    @d5.d
    public Set<K> h() {
        if (this.f23136o == null) {
            this.f23136o = new b(this);
        }
        Set<? extends K> set = this.f23136o;
        kotlin.jvm.internal.l0.m(set);
        return set;
    }

    @Override // java.util.Map
    public int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    public int j() {
        return entrySet().size();
    }

    @d5.d
    public Collection<V> k() {
        if (this.f23137p == null) {
            this.f23137p = new d(this);
        }
        Collection<? extends V> collection = this.f23137p;
        kotlin.jvm.internal.l0.m(collection);
        return collection;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return h();
    }

    @Override // java.util.Map
    public V put(K k5, V v5) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("㞭"));
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("㞮"));
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("㞯"));
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return j();
    }

    @d5.d
    public String toString() {
        return j0.m3(entrySet(), ProtectedSandApp.s("㞰"), ProtectedSandApp.s("㞱"), ProtectedSandApp.s("㞲"), 0, null, new c(this), 24, null);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return k();
    }
}
