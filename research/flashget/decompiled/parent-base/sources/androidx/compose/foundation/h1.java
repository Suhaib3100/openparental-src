package androidx.compose.foundation;

import androidx.compose.ui.q;
import kotlin.Metadata;

/* compiled from: FocusedBounds.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R$\u0010\u0019\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/h1;", "Landroidx/compose/ui/q$d;", "Landroidx/compose/ui/modifier/j;", "Landroidx/compose/ui/node/s;", "<init>", "()V", "Lkotlin/k2;", "z7", "", "focused", "A7", "(Z)V", "Landroidx/compose/ui/layout/u;", "coordinates", "W", "(Landroidx/compose/ui/layout/u;)V", "p", "Z", "isFocused", "q", "Landroidx/compose/ui/layout/u;", "layoutCoordinates", "Lkotlin/Function1;", "y7", "()Lld/l;", "observer", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class h1 extends q.d implements androidx.compose.ui.modifier.j, androidx.compose.ui.node.s {

    /* renamed from: r, reason: collision with root package name */
    public static final int f4660r = 8;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private boolean isFocused;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.ui.layout.u layoutCoordinates;

    private final ld.l<androidx.compose.ui.layout.u, kotlin.k2> y7() {
        if (getIsAttached()) {
            return (ld.l) v(g1.a());
        }
        return null;
    }

    private final void z7() {
        ld.l<androidx.compose.ui.layout.u, kotlin.k2> y7;
        androidx.compose.ui.layout.u uVar = this.layoutCoordinates;
        if (uVar != null) {
            kotlin.jvm.internal.l0.m(uVar);
            if (!uVar.f() || (y7 = y7()) == null) {
                return;
            }
            y7.invoke(this.layoutCoordinates);
        }
    }

    public final void A7(boolean focused) {
        if (focused == this.isFocused) {
            return;
        }
        if (focused) {
            z7();
        } else {
            ld.l<androidx.compose.ui.layout.u, kotlin.k2> y7 = y7();
            if (y7 != null) {
                y7.invoke(null);
            }
        }
        this.isFocused = focused;
    }

    @Override // androidx.compose.ui.node.s
    public void W(@fg.l androidx.compose.ui.layout.u coordinates) {
        this.layoutCoordinates = coordinates;
        if (this.isFocused) {
            if (coordinates.f()) {
                z7();
                return;
            }
            ld.l<androidx.compose.ui.layout.u, kotlin.k2> y7 = y7();
            if (y7 != null) {
                y7.invoke(null);
            }
        }
    }
}
