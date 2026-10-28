package androidx.compose.ui.layout;

import androidx.compose.ui.q;
import kotlin.Metadata;

/* compiled from: LayoutId.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u0004\u0018\u00010\u0004*\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bR*\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00048\u0016@PX\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/layout/x;", "Landroidx/compose/ui/node/s1;", "Landroidx/compose/ui/layout/y;", "Landroidx/compose/ui/q$d;", "", "layoutId", "<init>", "(Ljava/lang/Object;)V", "Landroidx/compose/ui/unit/d;", "parentData", "T", "(Landroidx/compose/ui/unit/d;Ljava/lang/Object;)Ljava/lang/Object;", "<set-?>", "p", "Ljava/lang/Object;", "N", "()Ljava/lang/Object;", "y7", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class x extends q.d implements androidx.compose.ui.node.s1, y {

    /* renamed from: q, reason: collision with root package name */
    public static final int f19120q = 8;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private Object layoutId;

    public x(@fg.l Object obj) {
        this.layoutId = obj;
    }

    @Override // androidx.compose.ui.layout.y
    @fg.l
    /* renamed from: N, reason: from getter */
    public Object getLayoutId() {
        return this.layoutId;
    }

    @Override // androidx.compose.ui.node.s1
    @fg.m
    public Object T(@fg.l androidx.compose.ui.unit.d dVar, @fg.m Object obj) {
        return this;
    }

    public void y7(@fg.l Object obj) {
        this.layoutId = obj;
    }
}
