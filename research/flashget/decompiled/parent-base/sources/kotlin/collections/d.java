package kotlin.collections;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: AbstractMap.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010&\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\r\b'\u0018\u0000 \u0017*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003:\u00014B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006H\b¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J!\u0010\u0017\u001a\u00020\u00122\u0010\u0010\u0007\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00122\b\u0010\u0019\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u0014J\u001a\u0010\u001b\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0012H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\bH\u0016¢\u0006\u0004\b\"\u0010#R\u001e\u0010'\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001e\u0010+\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010(8\b@\bX\u0088\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u001fR\u001a\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00028\u00010(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00065"}, d2 = {"Lkotlin/collections/d;", "K", "V", "", "<init>", "()V", "", "entry", "", "m", "(Ljava/util/Map$Entry;)Ljava/lang/String;", "", "o", "l", "(Ljava/lang/Object;)Ljava/lang/String;", "key", "j", "(Ljava/lang/Object;)Ljava/util/Map$Entry;", "", "containsKey", "(Ljava/lang/Object;)Z", "value", "containsValue", "d", "(Ljava/util/Map$Entry;)Z", "other", "equals", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "hashCode", "()I", "isEmpty", "()Z", "toString", "()Ljava/lang/String;", "", "b", "Ljava/util/Set;", "_keys", "", "c", "Ljava/util/Collection;", "_values", "h", "size", "f", "()Ljava/util/Set;", "keys", "i", "()Ljava/util/Collection;", "values", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.c1(version = "1.1")
@kotlin.jvm.internal.r1({"SMAP\nAbstractMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractMap.kt\nkotlin/collections/AbstractMap\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,153:1\n1747#2,3:154\n1726#2,3:157\n288#2,2:160\n*S KotlinDebug\n*F\n+ 1 AbstractMap.kt\nkotlin/collections/AbstractMap\n*L\n28#1:154,3\n60#1:157,3\n141#1:160,2\n*E\n"})
/* loaded from: classes7.dex */
public abstract class d<K, V> implements Map<K, V>, md.a {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private volatile Set<? extends K> _keys;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private volatile Collection<? extends V> _values;

    /* compiled from: AbstractMap.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010&\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\t2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u000e\u001a\u00020\r2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lkotlin/collections/d$a;", "", "<init>", "()V", "", "e", "", "b", "(Ljava/util/Map$Entry;)I", "", "c", "(Ljava/util/Map$Entry;)Ljava/lang/String;", "other", "", "a", "(Ljava/util/Map$Entry;Ljava/lang/Object;)Z", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nAbstractMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractMap.kt\nkotlin/collections/AbstractMap$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,153:1\n1#2:154\n*E\n"})
    /* renamed from: kotlin.collections.d$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final boolean a(@fg.l Map.Entry<?, ?> e4, @fg.m Object other) {
            kotlin.jvm.internal.l0.p(e4, ProtectedSandApp.s("愤\u0001"));
            if (!(other instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) other;
            return kotlin.jvm.internal.l0.g(e4.getKey(), entry.getKey()) && kotlin.jvm.internal.l0.g(e4.getValue(), entry.getValue());
        }

        public final int b(@fg.l Map.Entry<?, ?> e4) {
            kotlin.jvm.internal.l0.p(e4, ProtectedSandApp.s("愤\u0001"));
            Object key = e4.getKey();
            int hashCode = key != null ? key.hashCode() : 0;
            Object value = e4.getValue();
            return hashCode ^ (value != null ? value.hashCode() : 0);
        }

        @fg.l
        public final String c(@fg.l Map.Entry<?, ?> e4) {
            kotlin.jvm.internal.l0.p(e4, ProtectedSandApp.s("愤\u0001"));
            StringBuilder sb = new StringBuilder();
            sb.append(e4.getKey());
            sb.append('=');
            sb.append(e4.getValue());
            return sb.toString();
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: AbstractMap.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"kotlin/collections/d$b", "Lkotlin/collections/i;", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "iterator", "()Ljava/util/Iterator;", "", "b", "()I", "size", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends i<K> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ d<K, V> f74897c;

        /* compiled from: AbstractMap.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlin/collections/d$b$a", "", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Iterator<K>, md.a {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Iterator<Map.Entry<K, V>> f74898b;

            /* JADX WARN: Multi-variable type inference failed */
            a(Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
                this.f74898b = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f74898b.hasNext();
            }

            @Override // java.util.Iterator
            public K next() {
                return this.f74898b.next().getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException(ProtectedSandApp.s("愥\u0001"));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        b(d<K, ? extends V> dVar) {
            this.f74897c = dVar;
        }

        @Override // kotlin.collections.a
        /* renamed from: b */
        public int getSize() {
            return this.f74897c.getSize();
        }

        @Override // kotlin.collections.a, java.util.Collection, java.util.List
        public boolean contains(Object element) {
            return this.f74897c.containsKey(element);
        }

        @Override // kotlin.collections.i, kotlin.collections.a, java.util.Collection, java.lang.Iterable, java.util.List
        @fg.l
        public Iterator<K> iterator() {
            return new a(this.f74897c.e().iterator());
        }
    }

    /* compiled from: AbstractMap.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0010&\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001 \u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"K", "V", "", "it", "", "a", "(Ljava/util/Map$Entry;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 9, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.l<Map.Entry<? extends K, ? extends V>, CharSequence> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d<K, V> f74899b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(d<K, ? extends V> dVar) {
            super(1);
            this.f74899b = dVar;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(@fg.l Map.Entry<? extends K, ? extends V> entry) {
            kotlin.jvm.internal.l0.p(entry, ProtectedSandApp.s("愧\u0001"));
            return this.f74899b.m(entry);
        }
    }

    /* compiled from: AbstractMap.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"kotlin/collections/d$d", "Lkotlin/collections/a;", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "iterator", "()Ljava/util/Iterator;", "", "b", "()I", "size", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.collections.d$d, reason: collision with other inner class name */
    public static final class C1050d extends kotlin.collections.a<V> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d<K, V> f74900b;

        /* compiled from: AbstractMap.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlin/collections/d$d$a", "", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: kotlin.collections.d$d$a */
        public static final class a implements Iterator<V>, md.a {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Iterator<Map.Entry<K, V>> f74901b;

            /* JADX WARN: Multi-variable type inference failed */
            a(Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
                this.f74901b = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f74901b.hasNext();
            }

            @Override // java.util.Iterator
            public V next() {
                return this.f74901b.next().getValue();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException(ProtectedSandApp.s("愨\u0001"));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        C1050d(d<K, ? extends V> dVar) {
            this.f74900b = dVar;
        }

        @Override // kotlin.collections.a
        /* renamed from: b */
        public int getSize() {
            return this.f74900b.getSize();
        }

        @Override // kotlin.collections.a, java.util.Collection, java.util.List
        public boolean contains(Object element) {
            return this.f74900b.containsValue(element);
        }

        @Override // kotlin.collections.a, java.util.Collection, java.lang.Iterable, java.util.List
        @fg.l
        public Iterator<V> iterator() {
            return new a(this.f74900b.e().iterator());
        }
    }

    protected d() {
    }

    private final Map.Entry<K, V> j(K key) {
        Object obj;
        Iterator it = e().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.l0.g(((Map.Entry) obj).getKey(), key)) {
                break;
            }
        }
        return (Map.Entry) obj;
    }

    private final String l(Object o4) {
        return o4 == this ? ProtectedSandApp.s("愱\u0001") : String.valueOf(o4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String m(Map.Entry<? extends K, ? extends V> entry) {
        return l(entry.getKey()) + '=' + l(entry.getValue());
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("愲\u0001"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object key) {
        return j(key) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object value) {
        Set e4 = e();
        if ((e4 instanceof Collection) && e4.isEmpty()) {
            return false;
        }
        Iterator it = e4.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.l0.g(((Map.Entry) it.next()).getValue(), value)) {
                return true;
            }
        }
        return false;
    }

    public final boolean d(@fg.m Map.Entry<?, ?> entry) {
        if (entry == null) {
            return false;
        }
        Object key = entry.getKey();
        Object value = entry.getValue();
        kotlin.jvm.internal.l0.n(this, ProtectedSandApp.s("愳\u0001"));
        V v4 = get(key);
        if (!kotlin.jvm.internal.l0.g(value, v4)) {
            return false;
        }
        if (v4 != null) {
            return true;
        }
        kotlin.jvm.internal.l0.n(this, ProtectedSandApp.s("愴\u0001"));
        return containsKey(key);
    }

    public abstract Set e();

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return e();
    }

    @Override // java.util.Map
    public boolean equals(@fg.m Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Map)) {
            return false;
        }
        Map map = (Map) other;
        if (getSize() != map.size()) {
            return false;
        }
        Set<Map.Entry<K, V>> entrySet = map.entrySet();
        if ((entrySet instanceof Collection) && entrySet.isEmpty()) {
            return true;
        }
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            if (!d((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    @fg.l
    public Set<K> f() {
        if (this._keys == null) {
            this._keys = new b(this);
        }
        Set<? extends K> set = this._keys;
        kotlin.jvm.internal.l0.m(set);
        return set;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    @fg.m
    public V get(Object key) {
        Map.Entry<K, V> j4 = j(key);
        if (j4 != null) {
            return j4.getValue();
        }
        return null;
    }

    /* renamed from: h */
    public int getSize() {
        return e().size();
    }

    @Override // java.util.Map
    public int hashCode() {
        return e().hashCode();
    }

    @fg.l
    public Collection<V> i() {
        if (this._values == null) {
            this._values = new C1050d(this);
        }
        Collection<? extends V> collection = this._values;
        kotlin.jvm.internal.l0.m(collection);
        return collection;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return getSize() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return f();
    }

    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.h
    public V put(K k4, V v4) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("愲\u0001"));
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("愲\u0001"));
    }

    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.h
    public V remove(Object obj) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("愲\u0001"));
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @fg.l
    public String toString() {
        return g0.m3(e(), ProtectedSandApp.s("愵\u0001"), ProtectedSandApp.s("愶\u0001"), ProtectedSandApp.s("愷\u0001"), 0, null, new c(this), 24, null);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return i();
    }
}
