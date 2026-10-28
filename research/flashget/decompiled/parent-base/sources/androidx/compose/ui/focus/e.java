package androidx.compose.ui.focus;

import androidx.compose.ui.q;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: FocusChangedModifier.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bR.\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\bR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/focus/e;", "Landroidx/compose/ui/focus/i;", "Landroidx/compose/ui/q$d;", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/j0;", "Lkotlin/k2;", "onFocusChanged", "<init>", "(Lld/l;)V", "focusState", "e0", "(Landroidx/compose/ui/focus/j0;)V", "p", "Lld/l;", "y7", "()Lld/l;", "z7", "q", "Landroidx/compose/ui/focus/j0;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class e extends q.d implements i {

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private ld.l<? super j0, k2> onFocusChanged;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private j0 focusState;

    public e(@fg.l ld.l<? super j0, k2> lVar) {
        this.onFocusChanged = lVar;
    }

    @Override // androidx.compose.ui.focus.i
    public void e0(@fg.l j0 focusState) {
        if (kotlin.jvm.internal.l0.g(this.focusState, focusState)) {
            return;
        }
        this.focusState = focusState;
        this.onFocusChanged.invoke(focusState);
    }

    @fg.l
    public final ld.l<j0, k2> y7() {
        return this.onFocusChanged;
    }

    public final void z7(@fg.l ld.l<? super j0, k2> lVar) {
        this.onFocusChanged = lVar;
    }
}
