package androidx.compose.ui.input.key;

import android.view.KeyEvent;
import androidx.compose.ui.q;
import fg.m;
import kotlin.Metadata;
import ld.l;

/* compiled from: KeyInputModifier.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\fR0\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R0\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/input/key/h;", "Landroidx/compose/ui/input/key/g;", "Landroidx/compose/ui/q$d;", "Lkotlin/Function1;", "Landroidx/compose/ui/input/key/c;", "", "onEvent", "onPreEvent", "<init>", "(Lld/l;Lld/l;)V", "event", "k4", "(Landroid/view/KeyEvent;)Z", "n3", "p", "Lld/l;", "y7", "()Lld/l;", "A7", "(Lld/l;)V", "q", "z7", "B7", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class h extends q.d implements g {

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @m
    private l<? super c, Boolean> onEvent;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @m
    private l<? super c, Boolean> onPreEvent;

    public h(@m l<? super c, Boolean> lVar, @m l<? super c, Boolean> lVar2) {
        this.onEvent = lVar;
        this.onPreEvent = lVar2;
    }

    public final void A7(@m l<? super c, Boolean> lVar) {
        this.onEvent = lVar;
    }

    public final void B7(@m l<? super c, Boolean> lVar) {
        this.onPreEvent = lVar;
    }

    @Override // androidx.compose.ui.input.key.g
    public boolean k4(@fg.l KeyEvent event) {
        l<? super c, Boolean> lVar = this.onEvent;
        if (lVar != null) {
            return lVar.invoke(c.a(event)).booleanValue();
        }
        return false;
    }

    @Override // androidx.compose.ui.input.key.g
    public boolean n3(@fg.l KeyEvent event) {
        l<? super c, Boolean> lVar = this.onPreEvent;
        if (lVar != null) {
            return lVar.invoke(c.a(event)).booleanValue();
        }
        return false;
    }

    @m
    public final l<c, Boolean> y7() {
        return this.onEvent;
    }

    @m
    public final l<c, Boolean> z7() {
        return this.onPreEvent;
    }
}
