package androidx.compose.ui.node;

import androidx.compose.ui.platform.s5;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: ComposeUiNode.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\ba\u0018\u0000 .2\u00020\u0001:\u0001\u0013R\"\u0010\t\u001a\u00020\u00028&@&X§\u000e¢\u0006\u0012\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u001c\u0010\u000f\u001a\u00020\n8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0015\u001a\u00020\u00108&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u001b\u001a\u00020\u00168&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010!\u001a\u00020\u001c8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010'\u001a\u00020\"8&@&X¦\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001c\u0010-\u001a\u00020(8&@&X¦\u000e¢\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006/À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/g;", "", "", "j", "()I", "i", "(I)V", "h", "()V", "compositeKeyHash", "Landroidx/compose/ui/layout/m0;", "x", "()Landroidx/compose/ui/layout/m0;", "t", "(Landroidx/compose/ui/layout/m0;)V", "measurePolicy", "Landroidx/compose/ui/unit/w;", "getLayoutDirection", "()Landroidx/compose/ui/unit/w;", "a", "(Landroidx/compose/ui/unit/w;)V", "layoutDirection", "Landroidx/compose/ui/unit/d;", "b", "()Landroidx/compose/ui/unit/d;", "g", "(Landroidx/compose/ui/unit/d;)V", "density", "Landroidx/compose/ui/q;", "c", "()Landroidx/compose/ui/q;", "u", "(Landroidx/compose/ui/q;)V", "modifier", "Landroidx/compose/ui/platform/s5;", "d", "()Landroidx/compose/ui/platform/s5;", "q", "(Landroidx/compose/ui/platform/s5;)V", "viewConfiguration", "Landroidx/compose/runtime/g0;", "A", "()Landroidx/compose/runtime/g0;", "z", "(Landroidx/compose/runtime/g0;)V", "compositionLocalMap", "b0", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.w0
/* loaded from: classes.dex */
public interface g {

    /* renamed from: b0, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = Companion.f19278a;

    /* compiled from: ComposeUiNode.kt */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR.\u0010\u0016\u001a\u0019\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R.\u0010\u0019\u001a\u0019\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u00118\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015R.\u0010\u001d\u001a\u0019\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u00118\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u001c\u0010\u0015R.\u0010\u001f\u001a\u0019\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u00118\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015R.\u0010!\u001a\u0019\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u00118\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R.\u0010$\u001a\u0019\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u00118\u0006¢\u0006\f\n\u0004\b#\u0010\u0013\u001a\u0004\b#\u0010\u0015R7\u0010&\u001a\u0019\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u00118GX\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u0013\u0012\u0004\b\u000b\u0010\u0003\u001a\u0004\b\u0006\u0010\u0015¨\u0006'"}, d2 = {"Landroidx/compose/ui/node/g$a;", "", "<init>", "()V", "Lkotlin/Function0;", "Landroidx/compose/ui/node/g;", "b", "Lld/a;", "a", "()Lld/a;", "Constructor", "c", "j", "VirtualConstructor", "Lkotlin/Function2;", "Landroidx/compose/ui/q;", "Lkotlin/k2;", "Lkotlin/u;", "d", "Lld/p;", "g", "()Lld/p;", "SetModifier", "Landroidx/compose/ui/unit/d;", "e", "SetDensity", "Landroidx/compose/runtime/g0;", "f", "h", "SetResolvedCompositionLocals", "Landroidx/compose/ui/layout/m0;", "SetMeasurePolicy", "Landroidx/compose/ui/unit/w;", "SetLayoutDirection", "Landroidx/compose/ui/platform/s5;", "i", "SetViewConfiguration", "", "SetCompositeKeyHash", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.node.g$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f19278a = new Companion();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private static final ld.a<g> Constructor;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private static final ld.a<g> VirtualConstructor;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private static final ld.p<g, androidx.compose.ui.q, k2> SetModifier;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private static final ld.p<g, androidx.compose.ui.unit.d, k2> SetDensity;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private static final ld.p<g, androidx.compose.runtime.g0, k2> SetResolvedCompositionLocals;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private static final ld.p<g, androidx.compose.ui.layout.m0, k2> SetMeasurePolicy;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private static final ld.p<g, androidx.compose.ui.unit.w, k2> SetLayoutDirection;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private static final ld.p<g, s5, k2> SetViewConfiguration;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private static final ld.p<g, Integer, k2> SetCompositeKeyHash;

        /* compiled from: ComposeUiNode.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/node/g;", "", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/node/g;I)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.ui.node.g$a$a, reason: collision with other inner class name */
        static final class C0347a extends kotlin.jvm.internal.n0 implements ld.p<g, Integer, k2> {

            /* renamed from: b, reason: collision with root package name */
            public static final C0347a f19288b = new C0347a(2);

            C0347a() {
                super(2);
            }

            public final void a(@fg.l g gVar, int i4) {
                gVar.i(i4);
            }

            @Override // ld.p
            public k2 invoke(g gVar, Integer num) {
                gVar.i(num.intValue());
                return k2.f75408a;
            }
        }

        /* compiled from: ComposeUiNode.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/node/g;", "Landroidx/compose/ui/unit/d;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/node/g;Landroidx/compose/ui/unit/d;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.ui.node.g$a$b */
        static final class b extends kotlin.jvm.internal.n0 implements ld.p<g, androidx.compose.ui.unit.d, k2> {

            /* renamed from: b, reason: collision with root package name */
            public static final b f19289b = new b(2);

            b() {
                super(2);
            }

            public final void a(@fg.l g gVar, @fg.l androidx.compose.ui.unit.d dVar) {
                gVar.g(dVar);
            }

            @Override // ld.p
            public k2 invoke(g gVar, androidx.compose.ui.unit.d dVar) {
                gVar.g(dVar);
                return k2.f75408a;
            }
        }

        /* compiled from: ComposeUiNode.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/node/g;", "Landroidx/compose/ui/unit/w;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/node/g;Landroidx/compose/ui/unit/w;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.ui.node.g$a$c */
        static final class c extends kotlin.jvm.internal.n0 implements ld.p<g, androidx.compose.ui.unit.w, k2> {

            /* renamed from: b, reason: collision with root package name */
            public static final c f19290b = new c(2);

            c() {
                super(2);
            }

            public final void a(@fg.l g gVar, @fg.l androidx.compose.ui.unit.w wVar) {
                gVar.a(wVar);
            }

            @Override // ld.p
            public k2 invoke(g gVar, androidx.compose.ui.unit.w wVar) {
                gVar.a(wVar);
                return k2.f75408a;
            }
        }

        /* compiled from: ComposeUiNode.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/node/g;", "Landroidx/compose/ui/layout/m0;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/node/g;Landroidx/compose/ui/layout/m0;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.ui.node.g$a$d */
        static final class d extends kotlin.jvm.internal.n0 implements ld.p<g, androidx.compose.ui.layout.m0, k2> {

            /* renamed from: b, reason: collision with root package name */
            public static final d f19291b = new d(2);

            d() {
                super(2);
            }

            public final void a(@fg.l g gVar, @fg.l androidx.compose.ui.layout.m0 m0Var) {
                gVar.t(m0Var);
            }

            @Override // ld.p
            public k2 invoke(g gVar, androidx.compose.ui.layout.m0 m0Var) {
                gVar.t(m0Var);
                return k2.f75408a;
            }
        }

        /* compiled from: ComposeUiNode.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/node/g;", "Landroidx/compose/ui/q;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/node/g;Landroidx/compose/ui/q;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.ui.node.g$a$e */
        static final class e extends kotlin.jvm.internal.n0 implements ld.p<g, androidx.compose.ui.q, k2> {

            /* renamed from: b, reason: collision with root package name */
            public static final e f19292b = new e(2);

            e() {
                super(2);
            }

            public final void a(@fg.l g gVar, @fg.l androidx.compose.ui.q qVar) {
                gVar.u(qVar);
            }

            @Override // ld.p
            public k2 invoke(g gVar, androidx.compose.ui.q qVar) {
                gVar.u(qVar);
                return k2.f75408a;
            }
        }

        /* compiled from: ComposeUiNode.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/node/g;", "Landroidx/compose/runtime/g0;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/node/g;Landroidx/compose/runtime/g0;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.ui.node.g$a$f */
        static final class f extends kotlin.jvm.internal.n0 implements ld.p<g, androidx.compose.runtime.g0, k2> {

            /* renamed from: b, reason: collision with root package name */
            public static final f f19293b = new f(2);

            f() {
                super(2);
            }

            public final void a(@fg.l g gVar, @fg.l androidx.compose.runtime.g0 g0Var) {
                gVar.z(g0Var);
            }

            @Override // ld.p
            public k2 invoke(g gVar, androidx.compose.runtime.g0 g0Var) {
                gVar.z(g0Var);
                return k2.f75408a;
            }
        }

        /* compiled from: ComposeUiNode.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/node/g;", "Landroidx/compose/ui/platform/s5;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/node/g;Landroidx/compose/ui/platform/s5;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.ui.node.g$a$g, reason: collision with other inner class name */
        static final class C0348g extends kotlin.jvm.internal.n0 implements ld.p<g, s5, k2> {

            /* renamed from: b, reason: collision with root package name */
            public static final C0348g f19294b = new C0348g(2);

            C0348g() {
                super(2);
            }

            public final void a(@fg.l g gVar, @fg.l s5 s5Var) {
                gVar.q(s5Var);
            }

            @Override // ld.p
            public k2 invoke(g gVar, s5 s5Var) {
                gVar.q(s5Var);
                return k2.f75408a;
            }
        }

        /* compiled from: ComposeUiNode.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/node/h0;", "a", "()Landroidx/compose/ui/node/h0;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.ui.node.g$a$h */
        static final class h extends kotlin.jvm.internal.n0 implements ld.a<h0> {

            /* renamed from: b, reason: collision with root package name */
            public static final h f19295b = new h(0);

            h() {
                super(0);
            }

            @Override // ld.a
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final h0 invoke() {
                return new h0(true, 0, 2, null);
            }
        }

        static {
            h0.INSTANCE.getClass();
            Constructor = h0.P;
            VirtualConstructor = h.f19295b;
            SetModifier = e.f19292b;
            SetDensity = b.f19289b;
            SetResolvedCompositionLocals = f.f19293b;
            SetMeasurePolicy = d.f19291b;
            SetLayoutDirection = c.f19290b;
            SetViewConfiguration = C0348g.f19294b;
            SetCompositeKeyHash = C0347a.f19288b;
        }

        private Companion() {
        }

        @androidx.compose.ui.k
        public static /* synthetic */ void c() {
        }

        @fg.l
        public final ld.a<g> a() {
            return Constructor;
        }

        @fg.l
        @androidx.compose.ui.k
        public final ld.p<g, Integer, k2> b() {
            return SetCompositeKeyHash;
        }

        @fg.l
        public final ld.p<g, androidx.compose.ui.unit.d, k2> d() {
            return SetDensity;
        }

        @fg.l
        public final ld.p<g, androidx.compose.ui.unit.w, k2> e() {
            return SetLayoutDirection;
        }

        @fg.l
        public final ld.p<g, androidx.compose.ui.layout.m0, k2> f() {
            return SetMeasurePolicy;
        }

        @fg.l
        public final ld.p<g, androidx.compose.ui.q, k2> g() {
            return SetModifier;
        }

        @fg.l
        public final ld.p<g, androidx.compose.runtime.g0, k2> h() {
            return SetResolvedCompositionLocals;
        }

        @fg.l
        public final ld.p<g, s5, k2> i() {
            return SetViewConfiguration;
        }

        @fg.l
        public final ld.a<g> j() {
            return VirtualConstructor;
        }
    }

    @androidx.compose.ui.k
    static /* synthetic */ void h() {
    }

    @fg.l
    /* renamed from: A */
    androidx.compose.runtime.g0 getCompositionLocalMap();

    void a(@fg.l androidx.compose.ui.unit.w wVar);

    @fg.l
    /* renamed from: b */
    androidx.compose.ui.unit.d getDensity();

    @fg.l
    /* renamed from: c */
    androidx.compose.ui.q getModifier();

    @fg.l
    /* renamed from: d */
    s5 getViewConfiguration();

    void g(@fg.l androidx.compose.ui.unit.d dVar);

    @fg.l
    androidx.compose.ui.unit.w getLayoutDirection();

    void i(int i4);

    /* renamed from: j */
    int getCompositeKeyHash();

    void q(@fg.l s5 s5Var);

    void t(@fg.l androidx.compose.ui.layout.m0 m0Var);

    void u(@fg.l androidx.compose.ui.q qVar);

    @fg.l
    /* renamed from: x */
    androidx.compose.ui.layout.m0 getMeasurePolicy();

    void z(@fg.l androidx.compose.runtime.g0 g0Var);
}
