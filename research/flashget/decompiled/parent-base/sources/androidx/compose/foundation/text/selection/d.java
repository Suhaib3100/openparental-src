package androidx.compose.foundation.text.selection;

import androidx.compose.ui.platform.s5;
import kotlin.Metadata;

/* compiled from: SelectionGestures.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\"\u0010\u001a\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u001b\u001a\u0004\b\u0015\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Landroidx/compose/foundation/text/selection/d;", "", "Landroidx/compose/ui/platform/s5;", "viewConfiguration", "<init>", "(Landroidx/compose/ui/platform/s5;)V", "Landroidx/compose/ui/input/pointer/p;", "event", "Lkotlin/k2;", "g", "(Landroidx/compose/ui/input/pointer/p;)V", "Landroidx/compose/ui/input/pointer/b0;", "prevClick", "newClick", "", "f", "(Landroidx/compose/ui/input/pointer/b0;Landroidx/compose/ui/input/pointer/b0;)Z", "c", "a", "Landroidx/compose/ui/platform/s5;", "", "b", "I", "()I", "d", "(I)V", "clicks", "Landroidx/compose/ui/input/pointer/b0;", "()Landroidx/compose/ui/input/pointer/b0;", "e", "(Landroidx/compose/ui/input/pointer/b0;)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final s5 viewConfiguration;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int clicks;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.ui.input.pointer.b0 prevClick;

    public d(@fg.l s5 s5Var) {
        this.viewConfiguration = s5Var;
    }

    /* renamed from: a, reason: from getter */
    public final int getClicks() {
        return this.clicks;
    }

    @fg.m
    /* renamed from: b, reason: from getter */
    public final androidx.compose.ui.input.pointer.b0 getPrevClick() {
        return this.prevClick;
    }

    public final boolean c(@fg.l androidx.compose.ui.input.pointer.b0 prevClick, @fg.l androidx.compose.ui.input.pointer.b0 newClick) {
        return ((double) i0.f.m(i0.f.u(newClick.getPosition(), prevClick.getPosition()))) < 100.0d;
    }

    public final void d(int i4) {
        this.clicks = i4;
    }

    public final void e(@fg.m androidx.compose.ui.input.pointer.b0 b0Var) {
        this.prevClick = b0Var;
    }

    public final boolean f(@fg.l androidx.compose.ui.input.pointer.b0 prevClick, @fg.l androidx.compose.ui.input.pointer.b0 newClick) {
        return newClick.getUptimeMillis() - prevClick.getUptimeMillis() < this.viewConfiguration.a();
    }

    public final void g(@fg.l androidx.compose.ui.input.pointer.p event) {
        androidx.compose.ui.input.pointer.b0 b0Var = this.prevClick;
        androidx.compose.ui.input.pointer.b0 b0Var2 = event.e().get(0);
        if (b0Var != null && f(b0Var, b0Var2) && c(b0Var, b0Var2)) {
            this.clicks++;
        } else {
            this.clicks = 1;
        }
        this.prevClick = b0Var2;
    }
}
