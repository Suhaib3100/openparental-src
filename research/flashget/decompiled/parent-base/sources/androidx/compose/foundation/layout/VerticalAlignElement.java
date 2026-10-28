package androidx.compose.foundation.layout;

import androidx.compose.ui.c;
import kotlin.Metadata;

/* compiled from: RowColumnImpl.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\n*\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/layout/VerticalAlignElement;", "Landroidx/compose/ui/node/y0;", "Landroidx/compose/foundation/layout/m2;", "Landroidx/compose/ui/c$c;", "alignment", "<init>", "(Landroidx/compose/ui/c$c;)V", "n", "()Landroidx/compose/foundation/layout/m2;", "node", "Lkotlin/k2;", "r", "(Landroidx/compose/foundation/layout/m2;)V", "Landroidx/compose/ui/platform/a2;", "k", "(Landroidx/compose/ui/platform/a2;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Landroidx/compose/ui/c$c;", "o", "()Landroidx/compose/ui/c$c;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class VerticalAlignElement extends androidx.compose.ui.node.y0<m2> {

    /* renamed from: e, reason: collision with root package name */
    public static final int f4837e = 0;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final c.InterfaceC0326c alignment;

    public VerticalAlignElement(@fg.l c.InterfaceC0326c interfaceC0326c) {
        this.alignment = interfaceC0326c;
    }

    @Override // androidx.compose.ui.node.y0
    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        VerticalAlignElement verticalAlignElement = other instanceof VerticalAlignElement ? (VerticalAlignElement) other : null;
        if (verticalAlignElement == null) {
            return false;
        }
        return kotlin.jvm.internal.l0.g(this.alignment, verticalAlignElement.alignment);
    }

    @Override // androidx.compose.ui.node.y0
    public int hashCode() {
        return this.alignment.hashCode();
    }

    @Override // androidx.compose.ui.node.y0
    public void k(@fg.l androidx.compose.ui.platform.a2 a2Var) {
        a2Var.d("align");
        a2Var.e(this.alignment);
    }

    @Override // androidx.compose.ui.node.y0
    @fg.l
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public m2 i() {
        return new m2(this.alignment);
    }

    @fg.l
    /* renamed from: o, reason: from getter */
    public final c.InterfaceC0326c getAlignment() {
        return this.alignment;
    }

    @Override // androidx.compose.ui.node.y0
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public void m(@fg.l m2 node) {
        node.A7(this.alignment);
    }
}
