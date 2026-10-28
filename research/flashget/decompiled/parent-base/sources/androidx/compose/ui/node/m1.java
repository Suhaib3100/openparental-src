package androidx.compose.ui.node;

import kotlin.Metadata;
import kotlin.k2;

/* compiled from: ObserverModifierNode.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u0014\u0010\f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/node/m1;", "Landroidx/compose/ui/node/q1;", "Landroidx/compose/ui/node/k1;", "observerNode", "<init>", "(Landroidx/compose/ui/node/k1;)V", "b", "Landroidx/compose/ui/node/k1;", "()Landroidx/compose/ui/node/k1;", "", "G3", "()Z", "isValidOwnerScope", "c", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class m1 implements q1 {

    /* renamed from: d, reason: collision with root package name */
    public static final int f19435d = 8;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k1 observerNode;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private static final ld.l<m1, k2> f19436e = a.f19438b;

    /* compiled from: ObserverModifierNode.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/m1;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/node/m1;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<m1, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f19438b = new a(1);

        a() {
            super(1);
        }

        public final void a(@fg.l m1 m1Var) {
            if (m1Var.G3()) {
                m1Var.getObserverNode().d2();
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(m1 m1Var) {
            a(m1Var);
            return k2.f75408a;
        }
    }

    /* compiled from: ObserverModifierNode.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/node/m1$b;", "", "<init>", "()V", "Lkotlin/Function1;", "Landroidx/compose/ui/node/m1;", "Lkotlin/k2;", "OnObserveReadsChanged", "Lld/l;", "a", "()Lld/l;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.node.m1$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        public final ld.l<m1, k2> a() {
            return m1.f19436e;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    public m1(@fg.l k1 k1Var) {
        this.observerNode = k1Var;
    }

    @Override // androidx.compose.ui.node.q1
    public boolean G3() {
        return this.observerNode.getNode().getIsAttached();
    }

    @fg.l
    /* renamed from: b, reason: from getter */
    public final k1 getObserverNode() {
        return this.observerNode;
    }
}
