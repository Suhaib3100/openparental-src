package androidx.compose.foundation.layout;

import kotlin.Metadata;

/* compiled from: Offset.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BA\u0012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u0003¢\u0006\u0002\b\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u000b*\u00020\nH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR(\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R(\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u0003¢\u0006\u0002\b\u00068\u0006¢\u0006\f\n\u0004\b(\u0010!\u001a\u0004\b)\u0010#¨\u0006*"}, d2 = {"Landroidx/compose/foundation/layout/OffsetPxElement;", "Landroidx/compose/ui/node/y0;", "Landroidx/compose/foundation/layout/h1;", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/d;", "Landroidx/compose/ui/unit/q;", "Lkotlin/u;", "offset", "", "rtlAware", "Landroidx/compose/ui/platform/a2;", "Lkotlin/k2;", "inspectorInfo", "<init>", "(Lld/l;ZLld/l;)V", "n", "()Landroidx/compose/foundation/layout/h1;", "node", "u", "(Landroidx/compose/foundation/layout/h1;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "k", "(Landroidx/compose/ui/platform/a2;)V", "d", "Lld/l;", "r", "()Lld/l;", "e", "Z", "s", "()Z", "f", "o", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class OffsetPxElement extends androidx.compose.ui.node.y0<h1> {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.l<androidx.compose.ui.unit.d, androidx.compose.ui.unit.q> offset;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean rtlAware;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.l<androidx.compose.ui.platform.a2, kotlin.k2> inspectorInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public OffsetPxElement(@fg.l ld.l<? super androidx.compose.ui.unit.d, androidx.compose.ui.unit.q> lVar, boolean z4, @fg.l ld.l<? super androidx.compose.ui.platform.a2, kotlin.k2> lVar2) {
        this.offset = lVar;
        this.rtlAware = z4;
        this.inspectorInfo = lVar2;
    }

    @Override // androidx.compose.ui.node.y0
    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        OffsetPxElement offsetPxElement = other instanceof OffsetPxElement ? (OffsetPxElement) other : null;
        if (offsetPxElement == null) {
            return false;
        }
        return kotlin.jvm.internal.l0.g(this.offset, offsetPxElement.offset) && this.rtlAware == offsetPxElement.rtlAware;
    }

    @Override // androidx.compose.ui.node.y0
    public int hashCode() {
        return Boolean.hashCode(this.rtlAware) + (this.offset.hashCode() * 31);
    }

    @Override // androidx.compose.ui.node.y0
    public void k(@fg.l androidx.compose.ui.platform.a2 a2Var) {
        this.inspectorInfo.invoke(a2Var);
    }

    @Override // androidx.compose.ui.node.y0
    @fg.l
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public h1 i() {
        return new h1(this.offset, this.rtlAware);
    }

    @fg.l
    public final ld.l<androidx.compose.ui.platform.a2, kotlin.k2> o() {
        return this.inspectorInfo;
    }

    @fg.l
    public final ld.l<androidx.compose.ui.unit.d, androidx.compose.ui.unit.q> r() {
        return this.offset;
    }

    /* renamed from: s, reason: from getter */
    public final boolean getRtlAware() {
        return this.rtlAware;
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder("OffsetPxModifier(offset=");
        sb.append(this.offset);
        sb.append(", rtlAware=");
        return androidx.compose.animation.l.a(sb, this.rtlAware, ')');
    }

    @Override // androidx.compose.ui.node.y0
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public void m(@fg.l h1 node) {
        node.A7(this.offset);
        node.B7(this.rtlAware);
    }
}
