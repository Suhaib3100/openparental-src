package androidx.compose.ui.layout;

import androidx.compose.ui.q;
import kotlin.Metadata;

/* compiled from: LayoutModifier.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B,\u0012#\u0010\t\u001a\u001f\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\u0002\b\b¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\u000e\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R?\u0010\t\u001a\u001f\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\u0002\b\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/layout/c0;", "Landroidx/compose/ui/node/c0;", "Landroidx/compose/ui/q$d;", "Lkotlin/Function3;", "Landroidx/compose/ui/layout/o0;", "Landroidx/compose/ui/layout/l0;", "Landroidx/compose/ui/unit/b;", "Landroidx/compose/ui/layout/n0;", "Lkotlin/u;", "measureBlock", "<init>", "(Lld/q;)V", "measurable", "constraints", "f", "(Landroidx/compose/ui/layout/o0;Landroidx/compose/ui/layout/l0;J)Landroidx/compose/ui/layout/n0;", "", "toString", "()Ljava/lang/String;", "p", "Lld/q;", "y7", "()Lld/q;", "z7", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c0 extends q.d implements androidx.compose.ui.node.c0 {

    /* renamed from: q, reason: collision with root package name */
    public static final int f18928q = 8;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private ld.q<? super o0, ? super l0, ? super androidx.compose.ui.unit.b, ? extends n0> measureBlock;

    public c0(@fg.l ld.q<? super o0, ? super l0, ? super androidx.compose.ui.unit.b, ? extends n0> qVar) {
        this.measureBlock = qVar;
    }

    @Override // androidx.compose.ui.node.c0
    @fg.l
    public n0 f(@fg.l o0 o0Var, @fg.l l0 l0Var, long j4) {
        return this.measureBlock.R(o0Var, l0Var, androidx.compose.ui.unit.b.b(j4));
    }

    @fg.l
    public String toString() {
        return "LayoutModifierImpl(measureBlock=" + this.measureBlock + ')';
    }

    @fg.l
    public final ld.q<o0, l0, androidx.compose.ui.unit.b, n0> y7() {
        return this.measureBlock;
    }

    public final void z7(@fg.l ld.q<? super o0, ? super l0, ? super androidx.compose.ui.unit.b, ? extends n0> qVar) {
        this.measureBlock = qVar;
    }
}
