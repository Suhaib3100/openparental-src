package androidx.compose.foundation.layout;

import kotlin.Metadata;

/* compiled from: Box.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B0\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\t*\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R(\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Landroidx/compose/foundation/layout/BoxChildDataElement;", "Landroidx/compose/ui/node/y0;", "Landroidx/compose/foundation/layout/l;", "Landroidx/compose/ui/c;", "alignment", "", "matchParentSize", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/a2;", "Lkotlin/k2;", "Lkotlin/u;", "inspectorInfo", "<init>", "(Landroidx/compose/ui/c;ZLld/l;)V", "n", "()Landroidx/compose/foundation/layout/l;", "node", "u", "(Landroidx/compose/foundation/layout/l;)V", "k", "(Landroidx/compose/ui/platform/a2;)V", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "d", "Landroidx/compose/ui/c;", "o", "()Landroidx/compose/ui/c;", "e", "Z", "s", "()Z", "f", "Lld/l;", "r", "()Lld/l;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class BoxChildDataElement extends androidx.compose.ui.node.y0<l> {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.c alignment;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean matchParentSize;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.l<androidx.compose.ui.platform.a2, kotlin.k2> inspectorInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public BoxChildDataElement(@fg.l androidx.compose.ui.c cVar, boolean z4, @fg.l ld.l<? super androidx.compose.ui.platform.a2, kotlin.k2> lVar) {
        this.alignment = cVar;
        this.matchParentSize = z4;
        this.inspectorInfo = lVar;
    }

    @Override // androidx.compose.ui.node.y0
    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        BoxChildDataElement boxChildDataElement = other instanceof BoxChildDataElement ? (BoxChildDataElement) other : null;
        if (boxChildDataElement == null) {
            return false;
        }
        return kotlin.jvm.internal.l0.g(this.alignment, boxChildDataElement.alignment) && this.matchParentSize == boxChildDataElement.matchParentSize;
    }

    @Override // androidx.compose.ui.node.y0
    public int hashCode() {
        return Boolean.hashCode(this.matchParentSize) + (this.alignment.hashCode() * 31);
    }

    @Override // androidx.compose.ui.node.y0
    public void k(@fg.l androidx.compose.ui.platform.a2 a2Var) {
        this.inspectorInfo.invoke(a2Var);
    }

    @Override // androidx.compose.ui.node.y0
    @fg.l
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public l i() {
        return new l(this.alignment, this.matchParentSize);
    }

    @fg.l
    /* renamed from: o, reason: from getter */
    public final androidx.compose.ui.c getAlignment() {
        return this.alignment;
    }

    @fg.l
    public final ld.l<androidx.compose.ui.platform.a2, kotlin.k2> r() {
        return this.inspectorInfo;
    }

    /* renamed from: s, reason: from getter */
    public final boolean getMatchParentSize() {
        return this.matchParentSize;
    }

    @Override // androidx.compose.ui.node.y0
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public void m(@fg.l l node) {
        node.B7(this.alignment);
        node.C7(this.matchParentSize);
    }
}
