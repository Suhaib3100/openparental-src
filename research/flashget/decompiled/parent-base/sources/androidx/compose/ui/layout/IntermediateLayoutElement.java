package androidx.compose.ui.layout;

import androidx.compose.ui.platform.a2;
import kotlin.Metadata;

/* compiled from: LookaheadScope.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BJ\u0012A\u0010\r\u001a=\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0003¢\u0006\u0002\b\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0017\u001a\u00020\u0013*\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018JK\u0010\u0019\u001a=\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0003¢\u0006\u0002\b\fHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJU\u0010\u001b\u001a\u00020\u00002C\b\u0002\u0010\r\u001a=\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0003¢\u0006\u0002\b\fHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'RR\u0010\r\u001a=\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0003¢\u0006\u0002\b\f8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u001a¨\u0006+"}, d2 = {"Landroidx/compose/ui/layout/IntermediateLayoutElement;", "Landroidx/compose/ui/node/y0;", "Landroidx/compose/ui/layout/n;", "Lkotlin/Function3;", "Landroidx/compose/ui/layout/o;", "Landroidx/compose/ui/layout/l0;", "Lkotlin/r0;", "name", "measurable", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "Lkotlin/u;", "measure", "<init>", "(Lld/q;)V", "s", "()Landroidx/compose/ui/layout/n;", "node", "Lkotlin/k2;", "v", "(Landroidx/compose/ui/layout/n;)V", "Landroidx/compose/ui/platform/a2;", "k", "(Landroidx/compose/ui/platform/a2;)V", "n", "()Lld/q;", "o", "(Lld/q;)Landroidx/compose/ui/layout/IntermediateLayoutElement;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Lld/q;", "u", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class IntermediateLayoutElement extends androidx.compose.ui.node.y0<n> {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.q<o, l0, androidx.compose.ui.unit.b, n0> measure;

    /* JADX WARN: Multi-variable type inference failed */
    public IntermediateLayoutElement(@fg.l ld.q<? super o, ? super l0, ? super androidx.compose.ui.unit.b, ? extends n0> qVar) {
        this.measure = qVar;
    }

    public static IntermediateLayoutElement r(IntermediateLayoutElement intermediateLayoutElement, ld.q qVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            qVar = intermediateLayoutElement.measure;
        }
        intermediateLayoutElement.getClass();
        return new IntermediateLayoutElement(qVar);
    }

    @Override // androidx.compose.ui.node.y0
    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof IntermediateLayoutElement) && kotlin.jvm.internal.l0.g(this.measure, ((IntermediateLayoutElement) other).measure);
    }

    @Override // androidx.compose.ui.node.y0
    public int hashCode() {
        return this.measure.hashCode();
    }

    @Override // androidx.compose.ui.node.y0
    public void k(@fg.l a2 a2Var) {
        a2Var.d("intermediateLayout");
        a2Var.getProperties().c("measure", this.measure);
    }

    @fg.l
    public final ld.q<o, l0, androidx.compose.ui.unit.b, n0> n() {
        return this.measure;
    }

    @fg.l
    public final IntermediateLayoutElement o(@fg.l ld.q<? super o, ? super l0, ? super androidx.compose.ui.unit.b, ? extends n0> measure) {
        return new IntermediateLayoutElement(measure);
    }

    @Override // androidx.compose.ui.node.y0
    @fg.l
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public n i() {
        return new n(this.measure);
    }

    @fg.l
    public String toString() {
        return "IntermediateLayoutElement(measure=" + this.measure + ')';
    }

    @fg.l
    public final ld.q<o, l0, androidx.compose.ui.unit.b, n0> u() {
        return this.measure;
    }

    @Override // androidx.compose.ui.node.y0
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void m(@fg.l n node) {
        node.J7(this.measure);
    }
}
