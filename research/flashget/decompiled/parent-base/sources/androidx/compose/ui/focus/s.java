package androidx.compose.ui.focus;

import android.view.KeyEvent;
import kotlin.Metadata;

/* compiled from: FocusOwner.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH&ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH&ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u001bH&¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u001eH&¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020!8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u001c\u0010*\u001a\u00020%8&@&X¦\u000e¢\u0006\f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8&X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006/À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/focus/s;", "Landroidx/compose/ui/focus/m;", "Lkotlin/k2;", "d", "()V", "n", "", "force", "refreshFocusEvents", "e", "(ZZ)V", "Li0/i;", "m", "()Li0/i;", "Landroidx/compose/ui/input/key/c;", "keyEvent", "p", "(Landroid/view/KeyEvent;)Z", "h", "Landroidx/compose/ui/input/rotary/d;", "event", "k", "(Landroidx/compose/ui/input/rotary/d;)Z", "Landroidx/compose/ui/focus/FocusTargetNode;", "node", "i", "(Landroidx/compose/ui/focus/FocusTargetNode;)V", "Landroidx/compose/ui/focus/i;", "b", "(Landroidx/compose/ui/focus/i;)V", "Landroidx/compose/ui/focus/w;", "l", "(Landroidx/compose/ui/focus/w;)V", "Landroidx/compose/ui/q;", "c", "()Landroidx/compose/ui/q;", "modifier", "Landroidx/compose/ui/unit/w;", "getLayoutDirection", "()Landroidx/compose/ui/unit/w;", "a", "(Landroidx/compose/ui/unit/w;)V", "layoutDirection", "Landroidx/compose/ui/focus/o0;", "f", "()Landroidx/compose/ui/focus/o0;", "focusTransactionManager", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface s extends m {
    void a(@fg.l androidx.compose.ui.unit.w wVar);

    void b(@fg.l i node);

    @fg.l
    androidx.compose.ui.q c();

    void d();

    void e(boolean force, boolean refreshFocusEvents);

    @fg.l
    o0 f();

    @fg.l
    androidx.compose.ui.unit.w getLayoutDirection();

    boolean h(@fg.l KeyEvent keyEvent);

    void i(@fg.l FocusTargetNode node);

    boolean k(@fg.l androidx.compose.ui.input.rotary.d event);

    void l(@fg.l w node);

    @fg.m
    i0.i m();

    void n();

    boolean p(@fg.l KeyEvent keyEvent);
}
