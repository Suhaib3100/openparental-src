package androidx.compose.ui.layout;

import kotlin.Metadata;
import kotlin.k2;

/* compiled from: SubcomposeLayout.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006B\u0011\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\tJ*\u0010\u0010\u001a\u00020\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\u00012\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\r¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R1\u0010 \u001a\u0019\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\f0\u0019¢\u0006\u0002\b\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR1\u0010#\u001a\u0019\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\f0\u0019¢\u0006\u0002\b\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001d\u001a\u0004\b\"\u0010\u001fRH\u0010(\u001a0\u0012\u0004\u0012\u00020\u001a\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0\u0019¢\u0006\u0002\b\u001b\u0012\u0004\u0012\u00020\f0\u0019¢\u0006\u0002\b\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b'\u0010\u001fR\u0014\u0010+\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Landroidx/compose/ui/layout/r1;", "", "Landroidx/compose/ui/layout/t1;", "slotReusePolicy", "<init>", "(Landroidx/compose/ui/layout/t1;)V", "()V", "", "maxSlotsToRetainForReuse", "(I)V", "slotId", "Lkotlin/Function0;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "content", "Landroidx/compose/ui/layout/r1$a;", "i", "(Ljava/lang/Object;Lld/p;)Landroidx/compose/ui/layout/r1$a;", "d", "a", "Landroidx/compose/ui/layout/t1;", "Landroidx/compose/ui/layout/e0;", "b", "Landroidx/compose/ui/layout/e0;", "_state", "Lkotlin/Function2;", "Landroidx/compose/ui/node/h0;", "Lkotlin/u;", "c", "Lld/p;", "g", "()Lld/p;", "setRoot", "Landroidx/compose/runtime/z;", "e", "setCompositionContext", "Landroidx/compose/ui/layout/s1;", "Landroidx/compose/ui/unit/b;", "Landroidx/compose/ui/layout/n0;", "f", "setMeasurePolicy", "h", "()Landroidx/compose/ui/layout/e0;", "state", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class r1 {

    /* renamed from: f, reason: collision with root package name */
    public static final int f19092f = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final t1 slotReusePolicy;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private e0 _state;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.p<androidx.compose.ui.node.h0, r1, k2> setRoot;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.p<androidx.compose.ui.node.h0, androidx.compose.runtime.z, k2> setCompositionContext;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.p<androidx.compose.ui.node.h0, ld.p<? super s1, ? super androidx.compose.ui.unit.b, ? extends n0>, k2> setMeasurePolicy;

    /* compiled from: SubcomposeLayout.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\"\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/r1$a;", "", "Lkotlin/k2;", "dispose", "()V", "", "index", "Landroidx/compose/ui/unit/b;", "constraints", "b", "(IJ)V", "a", "()I", "placeablesCount", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface a {
        default int a() {
            return 0;
        }

        default void b(int index, long constraints) {
        }

        void dispose();
    }

    /* compiled from: SubcomposeLayout.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/node/h0;", "Landroidx/compose/runtime/z;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/node/h0;Landroidx/compose/runtime/z;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.ui.node.h0, androidx.compose.runtime.z, k2> {
        b() {
            super(2);
        }

        public final void a(@fg.l androidx.compose.ui.node.h0 h0Var, @fg.l androidx.compose.runtime.z zVar) {
            r1.this.h().M(zVar);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.ui.node.h0 h0Var, androidx.compose.runtime.z zVar) {
            a(h0Var, zVar);
            return k2.f75408a;
        }
    }

    /* compiled from: SubcomposeLayout.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007*\u00020\u00002\u001d\u0010\u0006\u001a\u0019\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¢\u0006\u0002\b\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Landroidx/compose/ui/node/h0;", "Lkotlin/Function2;", "Landroidx/compose/ui/layout/s1;", "Landroidx/compose/ui/unit/b;", "Landroidx/compose/ui/layout/n0;", "Lkotlin/u;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/node/h0;Lld/p;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.ui.node.h0, ld.p<? super s1, ? super androidx.compose.ui.unit.b, ? extends n0>, k2> {
        c() {
            super(2);
        }

        public final void a(@fg.l androidx.compose.ui.node.h0 h0Var, @fg.l ld.p<? super s1, ? super androidx.compose.ui.unit.b, ? extends n0> pVar) {
            h0Var.t(r1.this.h().u(pVar));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.ui.node.h0 h0Var, ld.p<? super s1, ? super androidx.compose.ui.unit.b, ? extends n0> pVar) {
            a(h0Var, pVar);
            return k2.f75408a;
        }
    }

    /* compiled from: SubcomposeLayout.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/node/h0;", "Landroidx/compose/ui/layout/r1;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/node/h0;Landroidx/compose/ui/layout/r1;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.ui.node.h0, r1, k2> {
        d() {
            super(2);
        }

        public final void a(@fg.l androidx.compose.ui.node.h0 h0Var, @fg.l r1 r1Var) {
            r1 r1Var2 = r1.this;
            e0 subcompositionsState = h0Var.getSubcompositionsState();
            if (subcompositionsState == null) {
                subcompositionsState = new e0(h0Var, r1.this.slotReusePolicy);
                h0Var.O1(subcompositionsState);
            }
            r1Var2._state = subcompositionsState;
            r1.this.h().F();
            r1.this.h().N(r1.this.slotReusePolicy);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.ui.node.h0 h0Var, r1 r1Var) {
            a(h0Var, r1Var);
            return k2.f75408a;
        }
    }

    public r1(@fg.l t1 t1Var) {
        this.slotReusePolicy = t1Var;
        this.setRoot = new d();
        this.setCompositionContext = new b();
        this.setMeasurePolicy = new c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e0 h() {
        e0 e0Var = this._state;
        if (e0Var != null) {
            return e0Var;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }

    public final void d() {
        h().A();
    }

    @fg.l
    public final ld.p<androidx.compose.ui.node.h0, androidx.compose.runtime.z, k2> e() {
        return this.setCompositionContext;
    }

    @fg.l
    public final ld.p<androidx.compose.ui.node.h0, ld.p<? super s1, ? super androidx.compose.ui.unit.b, ? extends n0>, k2> f() {
        return this.setMeasurePolicy;
    }

    @fg.l
    public final ld.p<androidx.compose.ui.node.h0, r1, k2> g() {
        return this.setRoot;
    }

    @fg.l
    public final a i(@fg.m Object slotId, @fg.l ld.p<? super androidx.compose.runtime.t, ? super Integer, k2> content) {
        return h().K(slotId, content);
    }

    public r1() {
        this(u0.f19110a);
    }

    @kotlin.k(message = "This constructor is deprecated", replaceWith = @kotlin.x0(expression = "SubcomposeLayoutState(SubcomposeSlotReusePolicy(maxSlotsToRetainForReuse))", imports = {"androidx.compose.ui.layout.SubcomposeSlotReusePolicy"}))
    public r1(int i4) {
        this(q1.c(i4));
    }
}
