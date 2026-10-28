package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.a1;
import androidx.compose.runtime.g3;
import androidx.compose.runtime.k2;
import androidx.compose.runtime.saveable.i;
import androidx.compose.runtime.t3;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.v0;
import androidx.compose.runtime.w0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: LazySaveableStateHolder.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010#\n\u0002\b\u0003\b\u0002\u0018\u0000  2\u00020\u00012\u00020\u0002:\u0001\u001eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005B1\b\u0016\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0011\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J(\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\b2\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0014H\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u0019\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t0\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\n2\u0011\u0010\u001d\u001a\r\u0012\u0004\u0012\u00020\u001b0\u0014¢\u0006\u0002\b\u001cH\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\"R/\u0010)\u001a\u0004\u0018\u00010\u00022\b\u0010#\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\n0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010+¨\u0006-"}, d2 = {"Landroidx/compose/foundation/lazy/layout/i0;", "Landroidx/compose/runtime/saveable/i;", "Landroidx/compose/runtime/saveable/f;", "wrappedRegistry", "<init>", "(Landroidx/compose/runtime/saveable/i;)V", "parentRegistry", "", "", "", "", "restoredValues", "(Landroidx/compose/runtime/saveable/i;Ljava/util/Map;)V", "value", "", "a", "(Ljava/lang/Object;)Z", "key", "f", "(Ljava/lang/String;)Ljava/lang/Object;", "Lkotlin/Function0;", "valueProvider", "Landroidx/compose/runtime/saveable/i$a;", "c", "(Ljava/lang/String;Lld/a;)Landroidx/compose/runtime/saveable/i$a;", "e", "()Ljava/util/Map;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "content", "b", "(Ljava/lang/Object;Lld/p;Landroidx/compose/runtime/t;I)V", "d", "(Ljava/lang/Object;)V", "Landroidx/compose/runtime/saveable/i;", "<set-?>", "Landroidx/compose/runtime/k2;", "h", "()Landroidx/compose/runtime/saveable/f;", "i", "(Landroidx/compose/runtime/saveable/f;)V", "wrappedHolder", "", "Ljava/util/Set;", "previouslyComposedKeys", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLazySaveableStateHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazySaveableStateHolder.kt\nandroidx/compose/foundation/lazy/layout/LazySaveableStateHolder\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,108:1\n81#2:109\n107#2,2:110\n1855#3,2:112\n1#4:114\n*S KotlinDebug\n*F\n+ 1 LazySaveableStateHolder.kt\nandroidx/compose/foundation/lazy/layout/LazySaveableStateHolder\n*L\n68#1:109\n68#1:110,2\n75#1:112,2\n*E\n"})
/* loaded from: classes.dex */
final class i0 implements androidx.compose.runtime.saveable.i, androidx.compose.runtime.saveable.f {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.saveable.i wrappedRegistry;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 wrappedHolder;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Set<Object> previouslyComposedKeys;

    /* compiled from: LazySaveableStateHolder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<Object, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.saveable.i f6060b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.runtime.saveable.i iVar) {
            super(1);
            this.f6060b = iVar;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@fg.l Object obj) {
            androidx.compose.runtime.saveable.i iVar = this.f6060b;
            return Boolean.valueOf(iVar != null ? iVar.a(obj) : true);
        }
    }

    /* compiled from: LazySaveableStateHolder.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000b\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\t\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n0\b0\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/foundation/lazy/layout/i0$b;", "", "<init>", "()V", "Landroidx/compose/runtime/saveable/i;", "parentRegistry", "Landroidx/compose/runtime/saveable/l;", "Landroidx/compose/foundation/lazy/layout/i0;", "", "", "", "a", "(Landroidx/compose/runtime/saveable/i;)Landroidx/compose/runtime/saveable/l;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.lazy.layout.i0$b, reason: from kotlin metadata */
    public static final class Companion {

        /* compiled from: LazySaveableStateHolder.kt */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/runtime/saveable/n;", "Landroidx/compose/foundation/lazy/layout/i0;", "it", "", "", "", "", "a", "(Landroidx/compose/runtime/saveable/n;Landroidx/compose/foundation/lazy/layout/i0;)Ljava/util/Map;"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nLazySaveableStateHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazySaveableStateHolder.kt\nandroidx/compose/foundation/lazy/layout/LazySaveableStateHolder$Companion$saver$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,108:1\n1#2:109\n*E\n"})
        /* renamed from: androidx.compose.foundation.lazy.layout.i0$b$a */
        static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.saveable.n, i0, Map<String, ? extends List<? extends Object>>> {

            /* renamed from: b, reason: collision with root package name */
            public static final a f6061b = new a(2);

            a() {
                super(2);
            }

            @Override // ld.p
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Map<String, List<Object>> invoke(@fg.l androidx.compose.runtime.saveable.n nVar, @fg.l i0 i0Var) {
                Map<String, List<Object>> e4 = i0Var.e();
                if (e4.isEmpty()) {
                    return null;
                }
                return e4;
            }
        }

        /* compiled from: LazySaveableStateHolder.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "", "", "", "restored", "Landroidx/compose/foundation/lazy/layout/i0;", "a", "(Ljava/util/Map;)Landroidx/compose/foundation/lazy/layout/i0;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.lazy.layout.i0$b$b, reason: collision with other inner class name */
        static final class C0108b extends kotlin.jvm.internal.n0 implements ld.l<Map<String, ? extends List<? extends Object>>, i0> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.saveable.i f6062b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0108b(androidx.compose.runtime.saveable.i iVar) {
                super(1);
                this.f6062b = iVar;
            }

            @Override // ld.l
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final i0 invoke(@fg.l Map<String, ? extends List<? extends Object>> map) {
                return new i0(this.f6062b, map);
            }
        }

        private Companion() {
        }

        @fg.l
        public final androidx.compose.runtime.saveable.l<i0, Map<String, List<Object>>> a(@fg.m androidx.compose.runtime.saveable.i parentRegistry) {
            return androidx.compose.runtime.saveable.m.a(a.f6061b, new C0108b(parentRegistry));
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: LazySaveableStateHolder.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/w0;", "Landroidx/compose/runtime/v0;", "a", "(Landroidx/compose/runtime/w0;)Landroidx/compose/runtime/v0;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazySaveableStateHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazySaveableStateHolder.kt\nandroidx/compose/foundation/lazy/layout/LazySaveableStateHolder$SaveableStateProvider$2\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,108:1\n64#2,5:109\n*S KotlinDebug\n*F\n+ 1 LazySaveableStateHolder.kt\nandroidx/compose/foundation/lazy/layout/LazySaveableStateHolder$SaveableStateProvider$2\n*L\n88#1:109,5\n*E\n"})
    static final class c extends kotlin.jvm.internal.n0 implements ld.l<w0, v0> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f6064c;

        /* compiled from: Effects.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/w0$a", "Landroidx/compose/runtime/v0;", "Lkotlin/k2;", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @r1({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 LazySaveableStateHolder.kt\nandroidx/compose/foundation/lazy/layout/LazySaveableStateHolder$SaveableStateProvider$2\n*L\n1#1,497:1\n89#2,2:498\n*E\n"})
        public static final class a implements v0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ i0 f6065a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object f6066b;

            public a(i0 i0Var, Object obj) {
                this.f6065a = i0Var;
                this.f6066b = obj;
            }

            @Override // androidx.compose.runtime.v0
            public void dispose() {
                this.f6065a.previouslyComposedKeys.add(this.f6066b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Object obj) {
            super(1);
            this.f6064c = obj;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final v0 invoke(@fg.l w0 w0Var) {
            i0.this.previouslyComposedKeys.remove(this.f6064c);
            return new a(i0.this, this.f6064c);
        }
    }

    /* compiled from: LazySaveableStateHolder.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f6068c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f6069d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f6070e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(Object obj, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, int i4) {
            super(2);
            this.f6068c = obj;
            this.f6069d = pVar;
            this.f6070e = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            i0.this.b(this.f6068c, this.f6069d, tVar, g3.b(this.f6070e | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    public i0(@fg.l androidx.compose.runtime.saveable.i iVar) {
        k2 g4;
        this.wrappedRegistry = iVar;
        g4 = t4.g(null, null, 2, null);
        this.wrappedHolder = g4;
        this.previouslyComposedKeys = new LinkedHashSet();
    }

    @Override // androidx.compose.runtime.saveable.i
    public boolean a(@fg.l Object value) {
        return this.wrappedRegistry.a(value);
    }

    @Override // androidx.compose.runtime.saveable.f
    @androidx.compose.runtime.i
    public void b(@fg.l Object obj, @fg.l ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
        androidx.compose.runtime.t o4 = tVar.o(-697180401);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-697180401, i4, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.SaveableStateProvider (LazySaveableStateHolder.kt:82)");
        }
        androidx.compose.runtime.saveable.f h4 = h();
        if (h4 == null) {
            throw new IllegalArgumentException("null wrappedHolder");
        }
        h4.b(obj, pVar, o4, (i4 & 112) | 520);
        a1.c(obj, new c(obj), o4, 8);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new d(obj, pVar, i4));
        }
    }

    @Override // androidx.compose.runtime.saveable.i
    @fg.l
    public i.a c(@fg.l String key, @fg.l ld.a<? extends Object> valueProvider) {
        return this.wrappedRegistry.c(key, valueProvider);
    }

    @Override // androidx.compose.runtime.saveable.f
    public void d(@fg.l Object key) {
        androidx.compose.runtime.saveable.f h4 = h();
        if (h4 == null) {
            throw new IllegalArgumentException("null wrappedHolder");
        }
        h4.d(key);
    }

    @Override // androidx.compose.runtime.saveable.i
    @fg.l
    public Map<String, List<Object>> e() {
        androidx.compose.runtime.saveable.f h4 = h();
        if (h4 != null) {
            Iterator<T> it = this.previouslyComposedKeys.iterator();
            while (it.hasNext()) {
                h4.d(it.next());
            }
        }
        return this.wrappedRegistry.e();
    }

    @Override // androidx.compose.runtime.saveable.i
    @fg.m
    public Object f(@fg.l String key) {
        return this.wrappedRegistry.f(key);
    }

    @fg.m
    public final androidx.compose.runtime.saveable.f h() {
        return (androidx.compose.runtime.saveable.f) this.wrappedHolder.getValue();
    }

    public final void i(@fg.m androidx.compose.runtime.saveable.f fVar) {
        this.wrappedHolder.setValue(fVar);
    }

    public i0(@fg.m androidx.compose.runtime.saveable.i iVar, @fg.m Map<String, ? extends List<? extends Object>> map) {
        this(androidx.compose.runtime.saveable.k.a(map, new a(iVar)));
    }
}
