package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.x;
import androidx.compose.ui.c;
import androidx.compose.ui.q;
import kotlin.Metadata;

/* compiled from: RowColumnImpl.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n*\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0006¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/layout/m2;", "Landroidx/compose/ui/node/s1;", "Landroidx/compose/ui/q$d;", "Landroidx/compose/ui/c$c;", "vertical", "<init>", "(Landroidx/compose/ui/c$c;)V", "Landroidx/compose/ui/unit/d;", "", "parentData", "Landroidx/compose/foundation/layout/v1;", "z7", "(Landroidx/compose/ui/unit/d;Ljava/lang/Object;)Landroidx/compose/foundation/layout/v1;", "p", "Landroidx/compose/ui/c$c;", "y7", "()Landroidx/compose/ui/c$c;", "A7", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class m2 extends q.d implements androidx.compose.ui.node.s1 {

    /* renamed from: q, reason: collision with root package name */
    public static final int f5205q = 8;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private c.InterfaceC0326c vertical;

    public m2(@fg.l c.InterfaceC0326c interfaceC0326c) {
        this.vertical = interfaceC0326c;
    }

    public final void A7(@fg.l c.InterfaceC0326c interfaceC0326c) {
        this.vertical = interfaceC0326c;
    }

    @fg.l
    /* renamed from: y7, reason: from getter */
    public final c.InterfaceC0326c getVertical() {
        return this.vertical;
    }

    @Override // androidx.compose.ui.node.s1
    @fg.l
    /* renamed from: z7, reason: merged with bridge method [inline-methods] */
    public v1 T(@fg.l androidx.compose.ui.unit.d dVar, @fg.m Object obj) {
        v1 v1Var = obj instanceof v1 ? (v1) obj : null;
        if (v1Var == null) {
            v1Var = new v1(0.0f, false, null, 7, null);
        }
        x.Companion companion = x.INSTANCE;
        c.InterfaceC0326c interfaceC0326c = this.vertical;
        companion.getClass();
        v1Var.i(new x.g(interfaceC0326c));
        return v1Var;
    }
}
