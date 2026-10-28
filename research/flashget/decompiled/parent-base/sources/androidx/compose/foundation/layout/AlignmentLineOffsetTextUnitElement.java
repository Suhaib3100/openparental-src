package androidx.compose.foundation.layout;

import kotlin.Metadata;

/* compiled from: AlignmentLine.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B8\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\n*\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\u0006\u001a\u00020\u00058\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\u0007\u001a\u00020\u00058\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%R(\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006,"}, d2 = {"Landroidx/compose/foundation/layout/AlignmentLineOffsetTextUnitElement;", "Landroidx/compose/ui/node/y0;", "Landroidx/compose/foundation/layout/e;", "Landroidx/compose/ui/layout/a;", "alignmentLine", "Landroidx/compose/ui/unit/z;", "before", "after", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/a2;", "Lkotlin/k2;", "Lkotlin/u;", "inspectorInfo", "<init>", "(Landroidx/compose/ui/layout/a;JJLld/l;Lkotlin/jvm/internal/w;)V", "n", "()Landroidx/compose/foundation/layout/e;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "k", "(Landroidx/compose/ui/platform/a2;)V", "node", "v", "(Landroidx/compose/foundation/layout/e;)V", "d", "Landroidx/compose/ui/layout/a;", "r", "()Landroidx/compose/ui/layout/a;", "e", "J", "s", "()J", "f", "o", "g", "Lld/l;", "u", "()Lld/l;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class AlignmentLineOffsetTextUnitElement extends androidx.compose.ui.node.y0<e> {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.layout.a alignmentLine;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long before;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final long after;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.l<androidx.compose.ui.platform.a2, kotlin.k2> inspectorInfo;

    public /* synthetic */ AlignmentLineOffsetTextUnitElement(androidx.compose.ui.layout.a aVar, long j4, long j5, ld.l lVar, kotlin.jvm.internal.w wVar) {
        this(aVar, j4, j5, lVar);
    }

    @Override // androidx.compose.ui.node.y0
    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        AlignmentLineOffsetTextUnitElement alignmentLineOffsetTextUnitElement = other instanceof AlignmentLineOffsetTextUnitElement ? (AlignmentLineOffsetTextUnitElement) other : null;
        if (alignmentLineOffsetTextUnitElement == null) {
            return false;
        }
        return kotlin.jvm.internal.l0.g(this.alignmentLine, alignmentLineOffsetTextUnitElement.alignmentLine) && androidx.compose.ui.unit.z.j(this.before, alignmentLineOffsetTextUnitElement.before) && androidx.compose.ui.unit.z.j(this.after, alignmentLineOffsetTextUnitElement.after);
    }

    @Override // androidx.compose.ui.node.y0
    public int hashCode() {
        return Long.hashCode(this.after) + ((androidx.compose.ui.unit.z.o(this.before) + (this.alignmentLine.hashCode() * 31)) * 31);
    }

    @Override // androidx.compose.ui.node.y0
    public void k(@fg.l androidx.compose.ui.platform.a2 a2Var) {
        this.inspectorInfo.invoke(a2Var);
    }

    @Override // androidx.compose.ui.node.y0
    @fg.l
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public e i() {
        return new e(this.alignmentLine, this.before, this.after, null);
    }

    /* renamed from: o, reason: from getter */
    public final long getAfter() {
        return this.after;
    }

    @fg.l
    /* renamed from: r, reason: from getter */
    public final androidx.compose.ui.layout.a getAlignmentLine() {
        return this.alignmentLine;
    }

    /* renamed from: s, reason: from getter */
    public final long getBefore() {
        return this.before;
    }

    @fg.l
    public final ld.l<androidx.compose.ui.platform.a2, kotlin.k2> u() {
        return this.inspectorInfo;
    }

    @Override // androidx.compose.ui.node.y0
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void m(@fg.l e node) {
        node.C7(this.alignmentLine);
        node.D7(this.before);
        node.B7(this.after);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private AlignmentLineOffsetTextUnitElement(androidx.compose.ui.layout.a aVar, long j4, long j5, ld.l<? super androidx.compose.ui.platform.a2, kotlin.k2> lVar) {
        this.alignmentLine = aVar;
        this.before = j4;
        this.after = j5;
        this.inspectorInfo = lVar;
    }
}
