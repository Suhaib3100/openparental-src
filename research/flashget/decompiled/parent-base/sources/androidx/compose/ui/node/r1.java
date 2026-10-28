package androidx.compose.ui.node;

import kotlin.Metadata;
import kotlin.k2;

/* compiled from: OwnerSnapshotObserver.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B0\u0012'\u0010\b\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0010\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0012\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\u0012\u0010\u0011J/\u0010\u0013\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\u0013\u0010\u0011J%\u0010\u0014\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\u0014\u0010\u0015JC\u0010\u001a\u001a\u00020\u0004\"\b\b\u0000\u0010\u0017*\u00020\u00162\u0006\u0010\u0018\u001a\u00028\u00002\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0004H\u0000¢\u0006\u0004\b \u0010\u001dJ\u000f\u0010!\u001a\u00020\u0004H\u0000¢\u0006\u0004\b!\u0010\u001dR\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010#R \u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010%R \u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010%R \u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010%R \u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010%R \u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010%R \u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010%R \u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010%¨\u00060"}, d2 = {"Landroidx/compose/ui/node/r1;", "", "Lkotlin/Function1;", "Lkotlin/Function0;", "Lkotlin/k2;", "Lkotlin/r0;", "name", "callback", "onChangedExecutor", "<init>", "(Lld/l;)V", "Landroidx/compose/ui/node/h0;", "node", "", "affectsLookahead", "block", "e", "(Landroidx/compose/ui/node/h0;ZLld/a;)V", "c", "g", "j", "(Landroidx/compose/ui/node/h0;Lld/a;)V", "Landroidx/compose/ui/node/q1;", "T", "target", "onChanged", "i", "(Landroidx/compose/ui/node/q1;Lld/l;Lld/a;)V", "b", "()V", "a", "(Ljava/lang/Object;)V", "k", "l", "Landroidx/compose/runtime/snapshots/g0;", "Landroidx/compose/runtime/snapshots/g0;", "observer", "Lld/l;", "onCommitAffectingLookaheadMeasure", "onCommitAffectingMeasure", "d", "onCommitAffectingSemantics", "onCommitAffectingLayout", "f", "onCommitAffectingLayoutModifier", "onCommitAffectingLayoutModifierInLookahead", "h", "onCommitAffectingLookahead", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class r1 {

    /* renamed from: i, reason: collision with root package name */
    public static final int f19474i = androidx.compose.runtime.snapshots.g0.f17062k;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.snapshots.g0 observer;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.l<h0, k2> onCommitAffectingLookaheadMeasure = f.f19488b;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.l<h0, k2> onCommitAffectingMeasure = g.f19489b;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.l<h0, k2> onCommitAffectingSemantics = h.f19490b;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.l<h0, k2> onCommitAffectingLayout = b.f19484b;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.l<h0, k2> onCommitAffectingLayoutModifier = c.f19485b;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.l<h0, k2> onCommitAffectingLayoutModifierInLookahead = d.f19486b;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.l<h0, k2> onCommitAffectingLookahead = e.f19487b;

    /* compiled from: OwnerSnapshotObserver.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<Object, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f19483b = new a(1);

        a() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@fg.l Object obj) {
            kotlin.jvm.internal.l0.n(obj, "null cannot be cast to non-null type androidx.compose.ui.node.OwnerScope");
            return Boolean.valueOf(!((q1) obj).G3());
        }
    }

    /* compiled from: OwnerSnapshotObserver.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/h0;", "layoutNode", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/node/h0;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<h0, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f19484b = new b(1);

        b() {
            super(1);
        }

        public final void a(@fg.l h0 h0Var) {
            if (h0Var.f()) {
                h0.y1(h0Var, false, 1, null);
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(h0 h0Var) {
            a(h0Var);
            return k2.f75408a;
        }
    }

    /* compiled from: OwnerSnapshotObserver.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/h0;", "layoutNode", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/node/h0;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.l<h0, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f19485b = new c(1);

        c() {
            super(1);
        }

        public final void a(@fg.l h0 h0Var) {
            if (h0Var.f()) {
                h0.y1(h0Var, false, 1, null);
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(h0 h0Var) {
            a(h0Var);
            return k2.f75408a;
        }
    }

    /* compiled from: OwnerSnapshotObserver.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/h0;", "layoutNode", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/node/h0;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.jvm.internal.n0 implements ld.l<h0, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f19486b = new d(1);

        d() {
            super(1);
        }

        public final void a(@fg.l h0 h0Var) {
            if (h0Var.f()) {
                h0.u1(h0Var, false, 1, null);
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(h0 h0Var) {
            a(h0Var);
            return k2.f75408a;
        }
    }

    /* compiled from: OwnerSnapshotObserver.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/h0;", "layoutNode", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/node/h0;)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends kotlin.jvm.internal.n0 implements ld.l<h0, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f19487b = new e(1);

        e() {
            super(1);
        }

        public final void a(@fg.l h0 h0Var) {
            if (h0Var.f()) {
                h0.u1(h0Var, false, 1, null);
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(h0 h0Var) {
            a(h0Var);
            return k2.f75408a;
        }
    }

    /* compiled from: OwnerSnapshotObserver.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/h0;", "layoutNode", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/node/h0;)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends kotlin.jvm.internal.n0 implements ld.l<h0, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final f f19488b = new f(1);

        f() {
            super(1);
        }

        public final void a(@fg.l h0 h0Var) {
            if (h0Var.f()) {
                h0.w1(h0Var, false, false, 3, null);
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(h0 h0Var) {
            a(h0Var);
            return k2.f75408a;
        }
    }

    /* compiled from: OwnerSnapshotObserver.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/h0;", "layoutNode", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/node/h0;)V"}, k = 3, mv = {1, 8, 0})
    static final class g extends kotlin.jvm.internal.n0 implements ld.l<h0, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final g f19489b = new g(1);

        g() {
            super(1);
        }

        public final void a(@fg.l h0 h0Var) {
            if (h0Var.f()) {
                h0.A1(h0Var, false, false, 3, null);
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(h0 h0Var) {
            a(h0Var);
            return k2.f75408a;
        }
    }

    /* compiled from: OwnerSnapshotObserver.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/h0;", "layoutNode", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/node/h0;)V"}, k = 3, mv = {1, 8, 0})
    static final class h extends kotlin.jvm.internal.n0 implements ld.l<h0, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final h f19490b = new h(1);

        h() {
            super(1);
        }

        public final void a(@fg.l h0 h0Var) {
            if (h0Var.f()) {
                h0Var.U0();
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(h0 h0Var) {
            a(h0Var);
            return k2.f75408a;
        }
    }

    public r1(@fg.l ld.l<? super ld.a<k2>, k2> lVar) {
        this.observer = new androidx.compose.runtime.snapshots.g0(lVar);
    }

    public static /* synthetic */ void d(r1 r1Var, h0 h0Var, boolean z4, ld.a aVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z4 = true;
        }
        r1Var.c(h0Var, z4, aVar);
    }

    public static /* synthetic */ void f(r1 r1Var, h0 h0Var, boolean z4, ld.a aVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z4 = true;
        }
        r1Var.e(h0Var, z4, aVar);
    }

    public static /* synthetic */ void h(r1 r1Var, h0 h0Var, boolean z4, ld.a aVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z4 = true;
        }
        r1Var.g(h0Var, z4, aVar);
    }

    public final void a(@fg.l Object target) {
        this.observer.k(target);
    }

    public final void b() {
        this.observer.l(a.f19483b);
    }

    public final void c(@fg.l h0 node, boolean affectsLookahead, @fg.l ld.a<k2> block) {
        if (!affectsLookahead || node.getLookaheadRoot() == null) {
            i(node, this.onCommitAffectingLayoutModifier, block);
        } else {
            i(node, this.onCommitAffectingLayoutModifierInLookahead, block);
        }
    }

    public final void e(@fg.l h0 node, boolean affectsLookahead, @fg.l ld.a<k2> block) {
        if (!affectsLookahead || node.getLookaheadRoot() == null) {
            i(node, this.onCommitAffectingLayout, block);
        } else {
            i(node, this.onCommitAffectingLookahead, block);
        }
    }

    public final void g(@fg.l h0 node, boolean affectsLookahead, @fg.l ld.a<k2> block) {
        if (!affectsLookahead || node.getLookaheadRoot() == null) {
            i(node, this.onCommitAffectingMeasure, block);
        } else {
            i(node, this.onCommitAffectingLookaheadMeasure, block);
        }
    }

    public final <T extends q1> void i(@fg.l T target, @fg.l ld.l<? super T, k2> onChanged, @fg.l ld.a<k2> block) {
        this.observer.q(target, onChanged, block);
    }

    public final void j(@fg.l h0 node, @fg.l ld.a<k2> block) {
        i(node, this.onCommitAffectingSemantics, block);
    }

    public final void k() {
        this.observer.v();
    }

    public final void l() {
        this.observer.w();
        this.observer.j();
    }
}
