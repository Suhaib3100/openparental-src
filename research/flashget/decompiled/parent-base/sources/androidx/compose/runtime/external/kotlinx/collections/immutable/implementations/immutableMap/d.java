package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.h;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.u;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.w0;

/* compiled from: PersistentHashMap.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0010\u0018\u0000 5*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u00016B#\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f0\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f0\u000fH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0012\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001d\u0010\u001aJ1\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0014\u0010\u001f\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001eH\u0016¢\u0006\u0004\b \u0010!J\u001b\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016¢\u0006\u0004\b\"\u0010#J\u001b\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010$H\u0016¢\u0006\u0004\b%\u0010&R&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u000eR\u001a\u00102\u001a\b\u0012\u0004\u0012\u00028\u0001008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0001\u00101R&\u00104\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f0\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u0010\u000e¨\u00067"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/d;", "K", "V", "Lkotlin/collections/d;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/h;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", "node", "", "size", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;I)V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/e;", "", "q", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/e;", "", "e", "()Ljava/util/Set;", "key", "", "containsKey", "(Ljava/lang/Object;)Z", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "v", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/d;", "w", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/d;", "x", "", "m", "putAll", "(Ljava/util/Map;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/h;", "clear", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/h;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/f;", "p", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/f;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", "t", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", "f", "I", "h", "()I", "U0", "keys", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/b;", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/b;", "values", "B2", "entries", "g", "a", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@r1({"SMAP\nPersistentHashMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentHashMap.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap\n+ 2 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n*L\n1#1,85:1\n53#2:86\n*S KotlinDebug\n*F\n+ 1 PersistentHashMap.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap\n*L\n69#1:86\n*E\n"})
/* loaded from: classes.dex */
public class d<K, V> extends kotlin.collections.d<K, V> implements androidx.compose.runtime.external.kotlinx.collections.immutable.h<K, V> {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: h, reason: collision with root package name */
    public static final int f16232h = 8;

    /* renamed from: i, reason: collision with root package name */
    @fg.l
    private static final d f16233i;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final u<K, V> node;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int size;

    /* compiled from: PersistentHashMap.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\bR \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/d$a;", "", "<init>", "()V", "K", "V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/d;", "a", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/d;", "", "EMPTY", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/d;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        public final <K, V> d<K, V> a() {
            d<K, V> dVar = d.f16233i;
            l0.n(dVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
            return dVar;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    static {
        u.INSTANCE.getClass();
        f16233i = new d(u.f16274g, 0);
    }

    public d(@fg.l u<K, V> uVar, int i4) {
        this.node = uVar;
        this.size = i4;
    }

    private final androidx.compose.runtime.external.kotlinx.collections.immutable.e<Map.Entry<K, V>> q() {
        return new o(this);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.d
    @fg.l
    public androidx.compose.runtime.external.kotlinx.collections.immutable.e<Map.Entry<K, V>> B2() {
        return new o(this);
    }

    @Override // kotlin.collections.d
    @fg.l
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public androidx.compose.runtime.external.kotlinx.collections.immutable.b<V> i() {
        return new s(this);
    }

    @Override // kotlin.collections.d
    @fg.l
    /* renamed from: U0, reason: merged with bridge method [inline-methods] */
    public androidx.compose.runtime.external.kotlinx.collections.immutable.e<K> f() {
        return new q(this);
    }

    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.h
    @fg.l
    public androidx.compose.runtime.external.kotlinx.collections.immutable.h<K, V> clear() {
        return INSTANCE.a();
    }

    @Override // kotlin.collections.d, java.util.Map
    public boolean containsKey(K key) {
        return this.node.n(key != null ? key.hashCode() : 0, key, 0);
    }

    @Override // kotlin.collections.d
    @fg.l
    @w0
    public final Set<Map.Entry<K, V>> e() {
        return new o(this);
    }

    @Override // kotlin.collections.d, java.util.Map
    @fg.m
    public V get(K key) {
        return this.node.r(key != null ? key.hashCode() : 0, key, 0);
    }

    @Override // kotlin.collections.d
    /* renamed from: h, reason: from getter */
    public int getSize() {
        return this.size;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.h
    @fg.l
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public f<K, V> g() {
        return new f<>(this);
    }

    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.h
    @fg.l
    public androidx.compose.runtime.external.kotlinx.collections.immutable.h<K, V> putAll(@fg.l Map<? extends K, ? extends V> m4) {
        l0.n(this, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        h.a<K, V> g4 = g();
        g4.putAll(m4);
        return g4.a2();
    }

    public final /* bridge */ androidx.compose.runtime.external.kotlinx.collections.immutable.e<Map.Entry<K, V>> r() {
        return B2();
    }

    @fg.l
    public final u<K, V> t() {
        return this.node;
    }

    public final /* bridge */ androidx.compose.runtime.external.kotlinx.collections.immutable.e<K> u() {
        return f();
    }

    @Override // kotlin.collections.d, java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.h
    @fg.l
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public d<K, V> put(K key, V value) {
        u.b<K, V> S = this.node.S(key != null ? key.hashCode() : 0, key, value, 0);
        if (S == null) {
            return this;
        }
        return new d<>(S.a(), S.getSizeDelta() + getSize());
    }

    @Override // kotlin.collections.d, java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.h
    @fg.l
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public d<K, V> remove(K key) {
        u<K, V> T = this.node.T(key != null ? key.hashCode() : 0, key, 0);
        return this.node == T ? this : T == null ? INSTANCE.a() : new d<>(T, getSize() - 1);
    }

    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.h
    @fg.l
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public d<K, V> remove(K key, V value) {
        u<K, V> U = this.node.U(key != null ? key.hashCode() : 0, key, value, 0);
        return this.node == U ? this : U == null ? INSTANCE.a() : new d<>(U, getSize() - 1);
    }

    public final /* bridge */ androidx.compose.runtime.external.kotlinx.collections.immutable.b<V> y() {
        return i();
    }
}
