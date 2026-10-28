package androidx.compose.ui.focus;

import androidx.compose.ui.q;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: FocusRequesterModifier.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0006¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/focus/g0;", "Landroidx/compose/ui/focus/e0;", "Landroidx/compose/ui/q$d;", "Landroidx/compose/ui/focus/a0;", "focusRequester", "<init>", "(Landroidx/compose/ui/focus/a0;)V", "Lkotlin/k2;", "i7", "()V", "j7", "p", "Landroidx/compose/ui/focus/a0;", "k1", "()Landroidx/compose/ui/focus/a0;", "y7", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nFocusRequesterModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusRequesterModifier.kt\nandroidx/compose/ui/focus/FocusRequesterNode\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,81:1\n728#2,2:82\n735#2,2:84\n*S KotlinDebug\n*F\n+ 1 FocusRequesterModifier.kt\nandroidx/compose/ui/focus/FocusRequesterNode\n*L\n73#1:82,2\n77#1:84,2\n*E\n"})
/* loaded from: classes.dex */
final class g0 extends q.d implements e0 {

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private a0 focusRequester;

    public g0(@fg.l a0 a0Var) {
        this.focusRequester = a0Var;
    }

    @Override // androidx.compose.ui.q.d
    public void i7() {
        this.focusRequester.g().b(this);
    }

    @Override // androidx.compose.ui.q.d
    public void j7() {
        this.focusRequester.g().j0(this);
    }

    @fg.l
    /* renamed from: k1, reason: from getter */
    public final a0 getFocusRequester() {
        return this.focusRequester;
    }

    public final void y7(@fg.l a0 a0Var) {
        this.focusRequester = a0Var;
    }
}
