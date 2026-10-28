package androidx.compose.ui.input.rotary;

import androidx.compose.ui.q;
import fg.m;
import kotlin.Metadata;
import ld.l;

/* compiled from: RotaryInputModifier.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\fR0\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R0\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/input/rotary/c;", "Landroidx/compose/ui/input/rotary/b;", "Landroidx/compose/ui/q$d;", "Lkotlin/Function1;", "Landroidx/compose/ui/input/rotary/d;", "", "onEvent", "onPreEvent", "<init>", "(Lld/l;Lld/l;)V", "event", "r4", "(Landroidx/compose/ui/input/rotary/d;)Z", "f1", "p", "Lld/l;", "y7", "()Lld/l;", "A7", "(Lld/l;)V", "q", "z7", "B7", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class c extends q.d implements b {

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @m
    private l<? super d, Boolean> onEvent;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @m
    private l<? super d, Boolean> onPreEvent;

    public c(@m l<? super d, Boolean> lVar, @m l<? super d, Boolean> lVar2) {
        this.onEvent = lVar;
        this.onPreEvent = lVar2;
    }

    public final void A7(@m l<? super d, Boolean> lVar) {
        this.onEvent = lVar;
    }

    public final void B7(@m l<? super d, Boolean> lVar) {
        this.onPreEvent = lVar;
    }

    @Override // androidx.compose.ui.input.rotary.b
    public boolean f1(@fg.l d event) {
        l<? super d, Boolean> lVar = this.onPreEvent;
        if (lVar != null) {
            return lVar.invoke(event).booleanValue();
        }
        return false;
    }

    @Override // androidx.compose.ui.input.rotary.b
    public boolean r4(@fg.l d event) {
        l<? super d, Boolean> lVar = this.onEvent;
        if (lVar != null) {
            return lVar.invoke(event).booleanValue();
        }
        return false;
    }

    @m
    public final l<d, Boolean> y7() {
        return this.onEvent;
    }

    @m
    public final l<d, Boolean> z7() {
        return this.onPreEvent;
    }
}
