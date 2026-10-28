package androidx.compose.ui.layout;

import androidx.compose.ui.platform.a2;
import kotlin.Metadata;

/* compiled from: LayoutModifier.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B,\u0012#\u0010\t\u001a\u001f\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\u0002\b\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\u00020\u000f*\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u0015\u001a\u001f\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\u0002\b\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J7\u0010\u0017\u001a\u00020\u00002%\b\u0002\u0010\t\u001a\u001f\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\u0002\b\bHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R4\u0010\t\u001a\u001f\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\u0002\b\b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0016¨\u0006'"}, d2 = {"Landroidx/compose/ui/layout/LayoutElement;", "Landroidx/compose/ui/node/y0;", "Landroidx/compose/ui/layout/c0;", "Lkotlin/Function3;", "Landroidx/compose/ui/layout/o0;", "Landroidx/compose/ui/layout/l0;", "Landroidx/compose/ui/unit/b;", "Landroidx/compose/ui/layout/n0;", "Lkotlin/u;", "measure", "<init>", "(Lld/q;)V", "s", "()Landroidx/compose/ui/layout/c0;", "node", "Lkotlin/k2;", "v", "(Landroidx/compose/ui/layout/c0;)V", "Landroidx/compose/ui/platform/a2;", "k", "(Landroidx/compose/ui/platform/a2;)V", "n", "()Lld/q;", "o", "(Lld/q;)Landroidx/compose/ui/layout/LayoutElement;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Lld/q;", "u", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class LayoutElement extends androidx.compose.ui.node.y0<c0> {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.q<o0, l0, androidx.compose.ui.unit.b, n0> measure;

    /* JADX WARN: Multi-variable type inference failed */
    public LayoutElement(@fg.l ld.q<? super o0, ? super l0, ? super androidx.compose.ui.unit.b, ? extends n0> qVar) {
        this.measure = qVar;
    }

    public static LayoutElement r(LayoutElement layoutElement, ld.q qVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            qVar = layoutElement.measure;
        }
        layoutElement.getClass();
        return new LayoutElement(qVar);
    }

    @Override // androidx.compose.ui.node.y0
    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LayoutElement) && kotlin.jvm.internal.l0.g(this.measure, ((LayoutElement) other).measure);
    }

    @Override // androidx.compose.ui.node.y0
    public int hashCode() {
        return this.measure.hashCode();
    }

    @Override // androidx.compose.ui.node.y0
    public void k(@fg.l a2 a2Var) {
        a2Var.d("layout");
        a2Var.getProperties().c("measure", this.measure);
    }

    @fg.l
    public final ld.q<o0, l0, androidx.compose.ui.unit.b, n0> n() {
        return this.measure;
    }

    @fg.l
    public final LayoutElement o(@fg.l ld.q<? super o0, ? super l0, ? super androidx.compose.ui.unit.b, ? extends n0> measure) {
        return new LayoutElement(measure);
    }

    @Override // androidx.compose.ui.node.y0
    @fg.l
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public c0 i() {
        return new c0(this.measure);
    }

    @fg.l
    public String toString() {
        return "LayoutElement(measure=" + this.measure + ')';
    }

    @fg.l
    public final ld.q<o0, l0, androidx.compose.ui.unit.b, n0> u() {
        return this.measure;
    }

    @Override // androidx.compose.ui.node.y0
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void m(@fg.l c0 node) {
        node.z7(this.measure);
    }
}
