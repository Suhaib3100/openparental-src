package androidx.compose.ui.node;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: LayoutNodeAlignmentLines.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010%\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\b*\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H$¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0010J\u000f\u0010\u0017\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0017\u0010\u0010J\r\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u0010J\u001e\u0010\u001b\u001a\u00020\u0019*\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H$ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010(\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010+\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010#\u001a\u0004\b)\u0010%\"\u0004\b*\u0010'R\"\u0010.\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010#\u001a\u0004\b,\u0010%\"\u0004\b-\u0010'R\"\u00102\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b/\u0010#\u001a\u0004\b0\u0010%\"\u0004\b1\u0010'R\"\u00105\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010#\u001a\u0004\b3\u0010%\"\u0004\b4\u0010'R\"\u00108\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u0010#\u001a\u0004\b6\u0010%\"\u0004\b7\u0010'R\u0018\u00109\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001eR \u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010;R\u0014\u0010>\u001a\u00020!8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b=\u0010%R\u0014\u0010@\u001a\u00020!8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b?\u0010%R$\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u0011*\u00020\n8$X¤\u0004¢\u0006\u0006\u001a\u0004\b/\u0010A\u0082\u0001\u0002CD\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006E"}, d2 = {"Landroidx/compose/ui/node/a;", "", "Landroidx/compose/ui/node/b;", "alignmentLinesOwner", "<init>", "(Landroidx/compose/ui/node/b;)V", "Landroidx/compose/ui/layout/a;", "alignmentLine", "", "initialPosition", "Landroidx/compose/ui/node/e1;", "initialCoordinator", "Lkotlin/k2;", "c", "(Landroidx/compose/ui/layout/a;ILandroidx/compose/ui/node/e1;)V", "s", "()V", "", "h", "()Ljava/util/Map;", "i", "(Landroidx/compose/ui/node/e1;Landroidx/compose/ui/layout/a;)I", "r", "t", "q", "Li0/f;", "position", "d", "(Landroidx/compose/ui/node/e1;J)J", "a", "Landroidx/compose/ui/node/b;", "f", "()Landroidx/compose/ui/node/b;", "", "b", "Z", "g", "()Z", "u", "(Z)V", "dirty", "p", "z", "usedDuringParentMeasurement", "o", "y", "usedDuringParentLayout", "e", "j", "v", "previousUsedDuringParentLayout", "n", "x", "usedByModifierMeasurement", "m", "w", "usedByModifierLayout", "queryOwner", "", "Ljava/util/Map;", "alignmentLineMap", "k", "queried", "l", "required", "(Landroidx/compose/ui/node/e1;)Ljava/util/Map;", "alignmentLinesMap", "Landroidx/compose/ui/node/i0;", "Landroidx/compose/ui/node/p0;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: j, reason: collision with root package name */
    public static final int f19156j = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final b alignmentLinesOwner;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean dirty;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean usedDuringParentMeasurement;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean usedDuringParentLayout;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean previousUsedDuringParentLayout;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean usedByModifierMeasurement;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean usedByModifierLayout;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private b queryOwner;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Map<androidx.compose.ui.layout.a, Integer> alignmentLineMap;

    /* compiled from: LayoutNodeAlignmentLines.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/b;", "childOwner", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/node/b;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nLayoutNodeAlignmentLines.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeAlignmentLines.kt\nandroidx/compose/ui/node/AlignmentLines$recalculate$1\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,247:1\n215#2,2:248\n1855#3,2:250\n*S KotlinDebug\n*F\n+ 1 LayoutNodeAlignmentLines.kt\nandroidx/compose/ui/node/AlignmentLines$recalculate$1\n*L\n163#1:248,2\n170#1:250,2\n*E\n"})
    /* renamed from: androidx.compose.ui.node.a$a, reason: collision with other inner class name */
    static final class C0344a extends kotlin.jvm.internal.n0 implements ld.l<b, k2> {
        C0344a() {
            super(1);
        }

        public final void a(@fg.l b bVar) {
            if (bVar.getIsPlaced()) {
                if (bVar.getAlignmentLines().getDirty()) {
                    bVar.V();
                }
                Map map = bVar.getAlignmentLines().alignmentLineMap;
                a aVar = a.this;
                for (Map.Entry entry : map.entrySet()) {
                    aVar.c((androidx.compose.ui.layout.a) entry.getKey(), ((Number) entry.getValue()).intValue(), bVar.i0());
                }
                e1 wrappedBy = bVar.i0().getWrappedBy();
                kotlin.jvm.internal.l0.m(wrappedBy);
                while (!kotlin.jvm.internal.l0.g(wrappedBy, a.this.getAlignmentLinesOwner().i0())) {
                    Set<androidx.compose.ui.layout.a> keySet = a.this.e(wrappedBy).keySet();
                    a aVar2 = a.this;
                    for (androidx.compose.ui.layout.a aVar3 : keySet) {
                        aVar2.c(aVar3, aVar2.i(wrappedBy, aVar3), wrappedBy);
                    }
                    wrappedBy = wrappedBy.getWrappedBy();
                    kotlin.jvm.internal.l0.m(wrappedBy);
                }
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(b bVar) {
            a(bVar);
            return k2.f75408a;
        }
    }

    public /* synthetic */ a(b bVar, kotlin.jvm.internal.w wVar) {
        this(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(androidx.compose.ui.layout.a alignmentLine, int initialPosition, e1 initialCoordinator) {
        float f4 = initialPosition;
        long a5 = i0.g.a(f4, f4);
        while (true) {
            a5 = d(initialCoordinator, a5);
            initialCoordinator = initialCoordinator.getWrappedBy();
            kotlin.jvm.internal.l0.m(initialCoordinator);
            if (kotlin.jvm.internal.l0.g(initialCoordinator, this.alignmentLinesOwner.i0())) {
                break;
            } else if (e(initialCoordinator).containsKey(alignmentLine)) {
                float i4 = i(initialCoordinator, alignmentLine);
                a5 = i0.g.a(i4, i4);
            }
        }
        int L0 = alignmentLine instanceof androidx.compose.ui.layout.m ? kotlin.math.b.L0(i0.f.r(a5)) : kotlin.math.b.L0(i0.f.p(a5));
        Map<androidx.compose.ui.layout.a, Integer> map = this.alignmentLineMap;
        if (map.containsKey(alignmentLine)) {
            L0 = androidx.compose.ui.layout.b.c(alignmentLine, ((Number) kotlin.collections.z0.K(this.alignmentLineMap, alignmentLine)).intValue(), L0);
        }
        map.put(alignmentLine, Integer.valueOf(L0));
    }

    protected abstract long d(@fg.l e1 e1Var, long j4);

    @fg.l
    protected abstract Map<androidx.compose.ui.layout.a, Integer> e(@fg.l e1 e1Var);

    @fg.l
    /* renamed from: f, reason: from getter */
    public final b getAlignmentLinesOwner() {
        return this.alignmentLinesOwner;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getDirty() {
        return this.dirty;
    }

    @fg.l
    public final Map<androidx.compose.ui.layout.a, Integer> h() {
        return this.alignmentLineMap;
    }

    protected abstract int i(@fg.l e1 e1Var, @fg.l androidx.compose.ui.layout.a aVar);

    /* renamed from: j, reason: from getter */
    public final boolean getPreviousUsedDuringParentLayout() {
        return this.previousUsedDuringParentLayout;
    }

    public final boolean k() {
        return this.usedDuringParentMeasurement || this.previousUsedDuringParentLayout || this.usedByModifierMeasurement || this.usedByModifierLayout;
    }

    public final boolean l() {
        s();
        return this.queryOwner != null;
    }

    /* renamed from: m, reason: from getter */
    public final boolean getUsedByModifierLayout() {
        return this.usedByModifierLayout;
    }

    /* renamed from: n, reason: from getter */
    public final boolean getUsedByModifierMeasurement() {
        return this.usedByModifierMeasurement;
    }

    /* renamed from: o, reason: from getter */
    public final boolean getUsedDuringParentLayout() {
        return this.usedDuringParentLayout;
    }

    /* renamed from: p, reason: from getter */
    public final boolean getUsedDuringParentMeasurement() {
        return this.usedDuringParentMeasurement;
    }

    public final void q() {
        this.dirty = true;
        b I = this.alignmentLinesOwner.I();
        if (I == null) {
            return;
        }
        if (this.usedDuringParentMeasurement) {
            I.s0();
        } else if (this.previousUsedDuringParentLayout || this.usedDuringParentLayout) {
            I.requestLayout();
        }
        if (this.usedByModifierMeasurement) {
            this.alignmentLinesOwner.s0();
        }
        if (this.usedByModifierLayout) {
            this.alignmentLinesOwner.requestLayout();
        }
        I.getAlignmentLines().q();
    }

    public final void r() {
        this.alignmentLineMap.clear();
        this.alignmentLinesOwner.N(new C0344a());
        this.alignmentLineMap.putAll(e(this.alignmentLinesOwner.i0()));
        this.dirty = false;
    }

    public final void s() {
        b bVar;
        a alignmentLines;
        a alignmentLines2;
        if (k()) {
            bVar = this.alignmentLinesOwner;
        } else {
            b I = this.alignmentLinesOwner.I();
            if (I == null) {
                return;
            }
            bVar = I.getAlignmentLines().queryOwner;
            if (bVar == null || !bVar.getAlignmentLines().k()) {
                b bVar2 = this.queryOwner;
                if (bVar2 == null || bVar2.getAlignmentLines().k()) {
                    return;
                }
                b I2 = bVar2.I();
                if (I2 != null && (alignmentLines2 = I2.getAlignmentLines()) != null) {
                    alignmentLines2.s();
                }
                b I3 = bVar2.I();
                bVar = (I3 == null || (alignmentLines = I3.getAlignmentLines()) == null) ? null : alignmentLines.queryOwner;
            }
        }
        this.queryOwner = bVar;
    }

    public final void t() {
        this.dirty = true;
        this.usedDuringParentMeasurement = false;
        this.previousUsedDuringParentLayout = false;
        this.usedDuringParentLayout = false;
        this.usedByModifierMeasurement = false;
        this.usedByModifierLayout = false;
        this.queryOwner = null;
    }

    public final void u(boolean z4) {
        this.dirty = z4;
    }

    public final void v(boolean z4) {
        this.previousUsedDuringParentLayout = z4;
    }

    public final void w(boolean z4) {
        this.usedByModifierLayout = z4;
    }

    public final void x(boolean z4) {
        this.usedByModifierMeasurement = z4;
    }

    public final void y(boolean z4) {
        this.usedDuringParentLayout = z4;
    }

    public final void z(boolean z4) {
        this.usedDuringParentMeasurement = z4;
    }

    private a(b bVar) {
        this.alignmentLinesOwner = bVar;
        this.dirty = true;
        this.alignmentLineMap = new HashMap();
    }
}
