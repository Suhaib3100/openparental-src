package androidx.compose.ui.focus;

import androidx.compose.ui.q;
import kotlin.Metadata;

/* compiled from: FocusProperties.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0006¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/focus/y;", "Landroidx/compose/ui/focus/w;", "Landroidx/compose/ui/q$d;", "Landroidx/compose/ui/focus/z;", "focusPropertiesScope", "<init>", "(Landroidx/compose/ui/focus/z;)V", "Landroidx/compose/ui/focus/t;", "focusProperties", "Lkotlin/k2;", "V3", "(Landroidx/compose/ui/focus/t;)V", "p", "Landroidx/compose/ui/focus/z;", "y7", "()Landroidx/compose/ui/focus/z;", "z7", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class y extends q.d implements w {

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private z focusPropertiesScope;

    public y(@fg.l z zVar) {
        this.focusPropertiesScope = zVar;
    }

    @Override // androidx.compose.ui.focus.w
    public void V3(@fg.l t focusProperties) {
        this.focusPropertiesScope.a(focusProperties);
    }

    @fg.l
    /* renamed from: y7, reason: from getter */
    public final z getFocusPropertiesScope() {
        return this.focusPropertiesScope;
    }

    public final void z7(@fg.l z zVar) {
        this.focusPropertiesScope = zVar;
    }
}
