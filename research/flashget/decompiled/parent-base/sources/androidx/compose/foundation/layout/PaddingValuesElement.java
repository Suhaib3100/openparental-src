package androidx.compose.foundation.layout;

import kotlin.Metadata;

/* compiled from: Padding.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B(\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u0007*\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR(\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Landroidx/compose/foundation/layout/PaddingValuesElement;", "Landroidx/compose/ui/node/y0;", "Landroidx/compose/foundation/layout/p1;", "Landroidx/compose/foundation/layout/l1;", "paddingValues", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/a2;", "Lkotlin/k2;", "Lkotlin/u;", "inspectorInfo", "<init>", "(Landroidx/compose/foundation/layout/l1;Lld/l;)V", "n", "()Landroidx/compose/foundation/layout/p1;", "node", "s", "(Landroidx/compose/foundation/layout/p1;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "k", "(Landroidx/compose/ui/platform/a2;)V", "d", "Landroidx/compose/foundation/layout/l1;", "r", "()Landroidx/compose/foundation/layout/l1;", "e", "Lld/l;", "o", "()Lld/l;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class PaddingValuesElement extends androidx.compose.ui.node.y0<p1> {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final l1 paddingValues;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.l<androidx.compose.ui.platform.a2, kotlin.k2> inspectorInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public PaddingValuesElement(@fg.l l1 l1Var, @fg.l ld.l<? super androidx.compose.ui.platform.a2, kotlin.k2> lVar) {
        this.paddingValues = l1Var;
        this.inspectorInfo = lVar;
    }

    @Override // androidx.compose.ui.node.y0
    public boolean equals(@fg.m Object other) {
        PaddingValuesElement paddingValuesElement = other instanceof PaddingValuesElement ? (PaddingValuesElement) other : null;
        if (paddingValuesElement == null) {
            return false;
        }
        return kotlin.jvm.internal.l0.g(this.paddingValues, paddingValuesElement.paddingValues);
    }

    @Override // androidx.compose.ui.node.y0
    public int hashCode() {
        return this.paddingValues.hashCode();
    }

    @Override // androidx.compose.ui.node.y0
    public void k(@fg.l androidx.compose.ui.platform.a2 a2Var) {
        this.inspectorInfo.invoke(a2Var);
    }

    @Override // androidx.compose.ui.node.y0
    @fg.l
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public p1 i() {
        return new p1(this.paddingValues);
    }

    @fg.l
    public final ld.l<androidx.compose.ui.platform.a2, kotlin.k2> o() {
        return this.inspectorInfo;
    }

    @fg.l
    /* renamed from: r, reason: from getter */
    public final l1 getPaddingValues() {
        return this.paddingValues;
    }

    @Override // androidx.compose.ui.node.y0
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void m(@fg.l p1 node) {
        node.z7(this.paddingValues);
    }
}
