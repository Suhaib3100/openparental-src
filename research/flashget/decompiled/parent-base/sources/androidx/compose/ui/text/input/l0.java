package androidx.compose.ui.text.input;

import android.os.Handler;
import android.view.inputmethod.InputConnection;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: NullableInputConnectionWrapper.android.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0013\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0004¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/text/input/l0;", "Landroidx/compose/ui/text/input/k0;", "Landroid/view/inputmethod/InputConnection;", "delegate", "Lkotlin/Function0;", "Lkotlin/k2;", "onConnectionClosed", "<init>", "(Landroid/view/inputmethod/InputConnection;Lld/a;)V", "", "p0", "p1", "", "deleteSurroundingTextInCodePoints", "(II)Z", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "b", "(Landroid/view/inputmethod/InputConnection;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.annotation.x0(24)
/* loaded from: classes.dex */
class l0 extends k0 {
    public l0(@fg.l InputConnection inputConnection, @fg.l ld.a<k2> aVar) {
        super(inputConnection, aVar);
    }

    @Override // androidx.compose.ui.text.input.k0
    protected final void b(@fg.l InputConnection delegate) {
        delegate.closeConnection();
    }

    @Override // androidx.compose.ui.text.input.k0, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int p02, int p12) {
        InputConnection delegate = getDelegate();
        if (delegate != null) {
            return delegate.deleteSurroundingTextInCodePoints(p02, p12);
        }
        return false;
    }

    @Override // androidx.compose.ui.text.input.k0, android.view.inputmethod.InputConnection
    @fg.m
    public final Handler getHandler() {
        InputConnection delegate = getDelegate();
        if (delegate != null) {
            return delegate.getHandler();
        }
        return null;
    }
}
