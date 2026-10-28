package androidx.compose.foundation;

import androidx.compose.ui.q;
import kotlin.Metadata;

/* compiled from: Focusable.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Landroidx/compose/foundation/b1;", "Landroidx/compose/ui/q$d;", "Landroidx/compose/ui/node/h;", "Landroidx/compose/ui/focus/w;", "<init>", "()V", "Landroidx/compose/ui/focus/t;", "focusProperties", "Lkotlin/k2;", "V3", "(Landroidx/compose/ui/focus/t;)V", "Ll0/b;", "y7", "()Ll0/b;", "inputModeManager", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class b1 extends q.d implements androidx.compose.ui.node.h, androidx.compose.ui.focus.w {
    private final l0.b y7() {
        return (l0.b) androidx.compose.ui.node.i.a(this, androidx.compose.ui.platform.h1.o());
    }

    @Override // androidx.compose.ui.focus.w
    public void V3(@fg.l androidx.compose.ui.focus.t focusProperties) {
        int b5 = y7().b();
        l0.a.INSTANCE.getClass();
        focusProperties.m(!l0.a.f(b5, l0.a.f81245c));
    }
}
