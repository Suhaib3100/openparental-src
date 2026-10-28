package androidx.compose.runtime.saveable;

import androidx.compose.runtime.a1;
import androidx.compose.runtime.f0;
import androidx.compose.runtime.g3;
import androidx.compose.runtime.t;
import androidx.compose.runtime.t3;
import androidx.compose.runtime.v0;
import androidx.compose.runtime.w0;
import androidx.compose.runtime.x;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.z0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.k2;
import ld.p;

/* compiled from: SaveableStateHolder.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0002\u001a\u0013B1\u0012(\b\u0002\u0010\u0007\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00060\u00040\u0002¢\u0006\u0004\b\b\u0010\tJ1\u0010\n\u001a$\u0012\u0004\u0012\u00020\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00060\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ*\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00032\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\b\u000fH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R4\u0010\u0007\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00060\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060\u0017R\u00020\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016R$\u0010 \u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Landroidx/compose/runtime/saveable/g;", "Landroidx/compose/runtime/saveable/f;", "", "", "", "", "", "savedStates", "<init>", "(Ljava/util/Map;)V", "h", "()Ljava/util/Map;", "key", "Lkotlin/Function0;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "content", "b", "(Ljava/lang/Object;Lld/p;Landroidx/compose/runtime/t;I)V", "d", "(Ljava/lang/Object;)V", "a", "Ljava/util/Map;", "Landroidx/compose/runtime/saveable/g$d;", "registryHolders", "Landroidx/compose/runtime/saveable/i;", "c", "Landroidx/compose/runtime/saveable/i;", "g", "()Landroidx/compose/runtime/saveable/i;", "i", "(Landroidx/compose/runtime/saveable/i;)V", "parentSaveableStateRegistry", "runtime-saveable_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSaveableStateHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SaveableStateHolder.kt\nandroidx/compose/runtime/saveable/SaveableStateHolderImpl\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,142:1\n145#2,2:143\n25#2:145\n147#2,2:152\n1116#3,6:146\n1855#4,2:154\n1#5:156\n*S KotlinDebug\n*F\n+ 1 SaveableStateHolder.kt\nandroidx/compose/runtime/saveable/SaveableStateHolderImpl\n*L\n76#1:143,2\n77#1:145\n76#1:152,2\n77#1:146,6\n102#1:154,2\n*E\n"})
/* loaded from: classes.dex */
final class g implements androidx.compose.runtime.saveable.f {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private static final l<g, ?> f16981e = m.a(a.f16985b, b.f16986b);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Map<Object, Map<String, List<Object>>> savedStates;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Map<Object, d> registryHolders;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private i parentSaveableStateRegistry;

    /* compiled from: SaveableStateHolder.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0002\u0010\b\u001a$\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00070\u0005\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Landroidx/compose/runtime/saveable/n;", "Landroidx/compose/runtime/saveable/g;", "it", "", "", "", "", "", "a", "(Landroidx/compose/runtime/saveable/n;Landroidx/compose/runtime/saveable/g;)Ljava/util/Map;"}, k = 3, mv = {1, 8, 0})
    static final class a extends n0 implements p<n, g, Map<Object, Map<String, ? extends List<? extends Object>>>> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f16985b = new a(2);

        a() {
            super(2);
        }

        @fg.m
        public final Map<Object, Map<String, List<Object>>> a(@fg.l n nVar, @fg.l g gVar) {
            return gVar.h();
        }

        @Override // ld.p
        public Map<Object, Map<String, ? extends List<? extends Object>>> invoke(n nVar, g gVar) {
            return gVar.h();
        }
    }

    /* compiled from: SaveableStateHolder.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062&\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "", "", "", "", "it", "Landroidx/compose/runtime/saveable/g;", "a", "(Ljava/util/Map;)Landroidx/compose/runtime/saveable/g;"}, k = 3, mv = {1, 8, 0})
    static final class b extends n0 implements ld.l<Map<Object, Map<String, ? extends List<? extends Object>>>, g> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f16986b = new b(1);

        b() {
            super(1);
        }

        @fg.m
        public final g a(@fg.l Map<Object, Map<String, List<Object>>> map) {
            return new g(map);
        }

        @Override // ld.l
        public g invoke(Map<Object, Map<String, ? extends List<? extends Object>>> map) {
            return new g(map);
        }
    }

    /* compiled from: SaveableStateHolder.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/runtime/saveable/g$c;", "", "<init>", "()V", "Landroidx/compose/runtime/saveable/l;", "Landroidx/compose/runtime/saveable/g;", "Saver", "Landroidx/compose/runtime/saveable/l;", "a", "()Landroidx/compose/runtime/saveable/l;", "runtime-saveable_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.runtime.saveable.g$c, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        public final l<g, ?> a() {
            return g.f16981e;
        }

        public Companion(w wVar) {
        }
    }

    /* compiled from: SaveableStateHolder.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J5\u0010\u000b\u001a\u00020\n2&\u0010\t\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b0\u00060\u0005¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001b\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0019\u001a\u0004\b\u0011\u0010\u001a¨\u0006\u001c"}, d2 = {"Landroidx/compose/runtime/saveable/g$d;", "", "key", "<init>", "(Landroidx/compose/runtime/saveable/g;Ljava/lang/Object;)V", "", "", "", "", "map", "Lkotlin/k2;", "d", "(Ljava/util/Map;)V", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "", "b", "Z", "c", "()Z", "e", "(Z)V", "shouldSave", "Landroidx/compose/runtime/saveable/i;", "Landroidx/compose/runtime/saveable/i;", "()Landroidx/compose/runtime/saveable/i;", "registry", "runtime-saveable_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class d {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final Object key;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean shouldSave = true;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final i registry;

        /* compiled from: SaveableStateHolder.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        static final class a extends n0 implements ld.l<Object, Boolean> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ g f16991b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(g gVar) {
                super(1);
                this.f16991b = gVar;
            }

            @Override // ld.l
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@fg.l Object obj) {
                i parentSaveableStateRegistry = this.f16991b.getParentSaveableStateRegistry();
                return Boolean.valueOf(parentSaveableStateRegistry != null ? parentSaveableStateRegistry.a(obj) : true);
            }
        }

        public d(@fg.l Object obj) {
            this.key = obj;
            this.registry = k.a((Map) g.this.savedStates.get(obj), new a(g.this));
        }

        @fg.l
        /* renamed from: a, reason: from getter */
        public final Object getKey() {
            return this.key;
        }

        @fg.l
        /* renamed from: b, reason: from getter */
        public final i getRegistry() {
            return this.registry;
        }

        /* renamed from: c, reason: from getter */
        public final boolean getShouldSave() {
            return this.shouldSave;
        }

        public final void d(@fg.l Map<Object, Map<String, List<Object>>> map) {
            if (this.shouldSave) {
                Map<String, List<Object>> e4 = this.registry.e();
                if (e4.isEmpty()) {
                    map.remove(this.key);
                } else {
                    map.put(this.key, e4);
                }
            }
        }

        public final void e(boolean z4) {
            this.shouldSave = z4;
        }
    }

    /* compiled from: SaveableStateHolder.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/w0;", "Landroidx/compose/runtime/v0;", "a", "(Landroidx/compose/runtime/w0;)Landroidx/compose/runtime/v0;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nSaveableStateHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SaveableStateHolder.kt\nandroidx/compose/runtime/saveable/SaveableStateHolderImpl$SaveableStateProvider$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,142:1\n1#2:143\n64#3,5:144\n*S KotlinDebug\n*F\n+ 1 SaveableStateHolder.kt\nandroidx/compose/runtime/saveable/SaveableStateHolderImpl$SaveableStateProvider$1$1\n*L\n92#1:144,5\n*E\n"})
    static final class e extends n0 implements ld.l<w0, v0> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f16993c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ d f16994d;

        /* compiled from: Effects.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/w0$a", "Landroidx/compose/runtime/v0;", "Lkotlin/k2;", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @r1({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 SaveableStateHolder.kt\nandroidx/compose/runtime/saveable/SaveableStateHolderImpl$SaveableStateProvider$1$1\n*L\n1#1,497:1\n93#2,3:498\n*E\n"})
        public static final class a implements v0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f16995a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ g f16996b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Object f16997c;

            public a(d dVar, g gVar, Object obj) {
                this.f16995a = dVar;
                this.f16996b = gVar;
                this.f16997c = obj;
            }

            @Override // androidx.compose.runtime.v0
            public void dispose() {
                this.f16995a.d(this.f16996b.savedStates);
                this.f16996b.registryHolders.remove(this.f16997c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Object obj, d dVar) {
            super(1);
            this.f16993c = obj;
            this.f16994d = dVar;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final v0 invoke(@fg.l w0 w0Var) {
            boolean containsKey = g.this.registryHolders.containsKey(this.f16993c);
            Object obj = this.f16993c;
            if (!containsKey) {
                g.this.savedStates.remove(this.f16993c);
                g.this.registryHolders.put(this.f16993c, this.f16994d);
                return new a(this.f16994d, g.this, this.f16993c);
            }
            throw new IllegalArgumentException(("Key " + obj + " was used multiple times ").toString());
        }
    }

    /* compiled from: SaveableStateHolder.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class f extends n0 implements p<t, Integer, k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f16999c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ p<t, Integer, k2> f17000d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f17001e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(Object obj, p<? super t, ? super Integer, k2> pVar, int i4) {
            super(2);
            this.f16999c = obj;
            this.f17000d = pVar;
            this.f17001e = i4;
        }

        public final void a(@fg.m t tVar, int i4) {
            g.this.b(this.f16999c, this.f17000d, tVar, g3.b(this.f17001e | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<Object, Map<String, List<Object>>> h() {
        Map<Object, Map<String, List<Object>>> J0 = z0.J0(this.savedStates);
        Iterator<T> it = this.registryHolders.values().iterator();
        while (it.hasNext()) {
            ((d) it.next()).d(J0);
        }
        if (J0.isEmpty()) {
            return null;
        }
        return J0;
    }

    @Override // androidx.compose.runtime.saveable.f
    @androidx.compose.runtime.i
    public void b(@fg.l Object obj, @fg.l p<? super t, ? super Integer, k2> pVar, @fg.m t tVar, int i4) {
        t o4 = tVar.o(-1198538093);
        if (x.b0()) {
            x.r0(-1198538093, i4, -1, "androidx.compose.runtime.saveable.SaveableStateHolderImpl.SaveableStateProvider (SaveableStateHolder.kt:74)");
        }
        o4.P(444418301);
        o4.Z(207, obj);
        o4.P(-492369756);
        Object Q = o4.Q();
        if (Q == t.INSTANCE.a()) {
            i iVar = this.parentSaveableStateRegistry;
            if (!(iVar != null ? iVar.a(obj) : true)) {
                throw new IllegalArgumentException(("Type of the key " + obj + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
            }
            Q = new d(obj);
            o4.E(Q);
        }
        o4.p0();
        d dVar = (d) Q;
        f0.b(k.b().e(dVar.getRegistry()), pVar, o4, i4 & 112);
        a1.c(k2.f75408a, new e(obj, dVar), o4, 6);
        o4.O();
        o4.p0();
        if (x.b0()) {
            x.q0();
        }
        t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new f(obj, pVar, i4));
        }
    }

    @Override // androidx.compose.runtime.saveable.f
    public void d(@fg.l Object key) {
        d dVar = this.registryHolders.get(key);
        if (dVar != null) {
            dVar.e(false);
        } else {
            this.savedStates.remove(key);
        }
    }

    @fg.m
    /* renamed from: g, reason: from getter */
    public final i getParentSaveableStateRegistry() {
        return this.parentSaveableStateRegistry;
    }

    public final void i(@fg.m i iVar) {
        this.parentSaveableStateRegistry = iVar;
    }

    public g(@fg.l Map<Object, Map<String, List<Object>>> map) {
        this.savedStates = map;
        this.registryHolders = new LinkedHashMap();
    }

    public /* synthetic */ g(Map map, int i4, w wVar) {
        this((i4 & 1) != 0 ? new LinkedHashMap() : map);
    }
}
