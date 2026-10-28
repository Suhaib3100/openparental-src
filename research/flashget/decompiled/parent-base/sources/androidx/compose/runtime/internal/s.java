package androidx.compose.runtime.internal;

import androidx.compose.runtime.b5;
import androidx.compose.runtime.d0;
import androidx.compose.runtime.external.kotlinx.collections.immutable.h;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.u;
import androidx.compose.runtime.h0;
import androidx.compose.runtime.t2;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: PersistentCompositionLocalMap.kt */
@u(parameters = 1)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\u0006\b\u0000\u0018\u0000 \u001b2\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\u00012\u00020\u0005:\u0002\u001c\u000eB3\u0012\"\u0010\u0007\u001a\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0011\u001a\u00020\u00052\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R6\u0010\u001a\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\u00170\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Landroidx/compose/runtime/internal/s;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/d;", "Landroidx/compose/runtime/d0;", "", "Landroidx/compose/runtime/b5;", "Landroidx/compose/runtime/t2;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", "node", "", "size", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;I)V", "T", "key", "b", "(Landroidx/compose/runtime/d0;)Ljava/lang/Object;", "value", "u0", "(Landroidx/compose/runtime/d0;Landroidx/compose/runtime/b5;)Landroidx/compose/runtime/t2;", "Landroidx/compose/runtime/internal/s$a;", "A", "()Landroidx/compose/runtime/internal/s$a;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/e;", "", "B2", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/e;", "entries", "j", "a", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class s extends androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d<d0<Object>, b5<? extends Object>> implements t2 {

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: k, reason: collision with root package name */
    public static final int f16801k = 0;

    /* renamed from: l, reason: collision with root package name */
    @fg.l
    private static final s f16802l;

    /* compiled from: PersistentCompositionLocalMap.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\u00012\u00020\u0005B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0007\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\t¨\u0006\u0010"}, d2 = {"Landroidx/compose/runtime/internal/s$a;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/f;", "Landroidx/compose/runtime/d0;", "", "Landroidx/compose/runtime/b5;", "Landroidx/compose/runtime/t2$a;", "Landroidx/compose/runtime/internal/s;", "map", "<init>", "(Landroidx/compose/runtime/internal/s;)V", "t", "()Landroidx/compose/runtime/internal/s;", "i", "Landroidx/compose/runtime/internal/s;", "y", "D", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @u(parameters = 0)
    public static final class a extends androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.f<d0<Object>, b5<? extends Object>> implements t2.a {

        /* renamed from: j, reason: collision with root package name */
        public static final int f16803j = 8;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private s map;

        public a(@fg.l s sVar) {
            super(sVar);
            this.map = sVar;
        }

        public final /* bridge */ b5 A(Object obj, b5 b5Var) {
            return !(obj instanceof d0) ? b5Var : (b5) super.getOrDefault((d0) obj, b5Var);
        }

        public /* bridge */ b5<Object> B(d0<Object> d0Var) {
            return (b5) super.remove(d0Var);
        }

        public final /* bridge */ b5<Object> C(Object obj) {
            if (obj instanceof d0) {
                return (b5) super.remove((d0) obj);
            }
            return null;
        }

        public final void D(@fg.l s sVar) {
            this.map = sVar;
        }

        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.f, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj instanceof d0) {
                return super.containsKey((d0) obj);
            }
            return false;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj instanceof b5) {
                return super.containsValue((b5) obj);
            }
            return false;
        }

        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.f, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Object get(Object obj) {
            if (obj instanceof d0) {
                return (b5) super.get((d0) obj);
            }
            return null;
        }

        @Override // java.util.Map
        public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof d0) ? obj2 : (b5) super.getOrDefault((d0) obj, (b5) obj2);
        }

        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.f, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Object remove(Object obj) {
            if (obj instanceof d0) {
                return (b5) super.remove((d0) obj);
            }
            return null;
        }

        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.f
        @fg.l
        /* renamed from: t, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public s a() {
            s sVar;
            if (i() == this.map.t()) {
                sVar = this.map;
            } else {
                q(new f0.f());
                sVar = new s(i(), getSize());
            }
            this.map = sVar;
            return sVar;
        }

        public /* bridge */ boolean u(d0<Object> d0Var) {
            return super.containsKey(d0Var);
        }

        public /* bridge */ boolean v(b5<? extends Object> b5Var) {
            return super.containsValue(b5Var);
        }

        public /* bridge */ b5<Object> w(d0<Object> d0Var) {
            return (b5) super.get(d0Var);
        }

        public final /* bridge */ b5<Object> x(Object obj) {
            if (obj instanceof d0) {
                return (b5) super.get((d0) obj);
            }
            return null;
        }

        @fg.l
        /* renamed from: y, reason: from getter */
        public final s getMap() {
            return this.map;
        }

        public /* bridge */ b5<Object> z(d0<Object> d0Var, b5<? extends Object> b5Var) {
            return (b5) super.getOrDefault(d0Var, b5Var);
        }
    }

    /* compiled from: PersistentCompositionLocalMap.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroidx/compose/runtime/internal/s$b;", "", "<init>", "()V", "Landroidx/compose/runtime/internal/s;", "Empty", "Landroidx/compose/runtime/internal/s;", "a", "()Landroidx/compose/runtime/internal/s;", "b", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.runtime.internal.s$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ void b() {
        }

        @fg.l
        public final s a() {
            return s.f16802l;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    static {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.u.INSTANCE.getClass();
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.u uVar = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.u.f16274g;
        l0.n(uVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>");
        f16802l = new s(uVar, 0);
    }

    public s(@fg.l androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.u<d0<Object>, b5<Object>> uVar, int i4) {
        super(uVar, i4);
    }

    @fg.l
    public a A() {
        return new a(this);
    }

    public /* bridge */ boolean B(d0<Object> d0Var) {
        return super.containsKey(d0Var);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d, androidx.compose.runtime.external.kotlinx.collections.immutable.d
    @fg.l
    public androidx.compose.runtime.external.kotlinx.collections.immutable.e<Map.Entry<d0<Object>, b5<Object>>> B2() {
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.o(this);
    }

    public /* bridge */ boolean C(b5<? extends Object> b5Var) {
        return super.containsValue(b5Var);
    }

    public /* bridge */ b5<Object> D(d0<Object> d0Var) {
        return (b5) super.get(d0Var);
    }

    public final /* bridge */ b5<Object> E(Object obj) {
        if (obj instanceof d0) {
            return (b5) super.get((d0) obj);
        }
        return null;
    }

    public /* bridge */ b5<Object> F(d0<Object> d0Var, b5<? extends Object> b5Var) {
        return (b5) super.getOrDefault(d0Var, b5Var);
    }

    public final /* bridge */ b5 H(Object obj, b5 b5Var) {
        return !(obj instanceof d0) ? b5Var : (b5) super.getOrDefault((d0) obj, b5Var);
    }

    @Override // androidx.compose.runtime.g0
    public <T> T b(@fg.l d0<T> key) {
        return (T) h0.d(this, key);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d, kotlin.collections.d, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof d0) {
            return super.containsKey((d0) obj);
        }
        return false;
    }

    @Override // kotlin.collections.d, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof b5) {
            return super.containsValue((b5) obj);
        }
        return false;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d, androidx.compose.runtime.external.kotlinx.collections.immutable.h
    /* renamed from: g, reason: avoid collision after fix types in other method */
    public h.a<d0<Object>, b5<? extends Object>> g2() {
        return new a(this);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d, kotlin.collections.d, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof d0) {
            return (b5) super.get((d0) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof d0) ? obj2 : (b5) super.getOrDefault((d0) obj, (b5) obj2);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d
    /* renamed from: p */
    public androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.f<d0<Object>, b5<? extends Object>> g() {
        return new a(this);
    }

    @Override // androidx.compose.runtime.t2
    @fg.l
    public t2 u0(@fg.l d0<Object> key, @fg.l b5<? extends Object> value) {
        u.b<d0<Object>, b5<? extends Object>> S = t().S(key.hashCode(), key, value, 0);
        if (S == null) {
            return this;
        }
        return new s(S.a(), S.getSizeDelta() + getSize());
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d, androidx.compose.runtime.external.kotlinx.collections.immutable.h
    public h.a<d0<Object>, b5<? extends Object>> g() {
        return new a(this);
    }
}
