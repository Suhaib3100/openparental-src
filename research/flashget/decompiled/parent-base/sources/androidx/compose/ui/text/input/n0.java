package androidx.compose.ui.text.input;

import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: NullableInputConnectionWrapper.android.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0013\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/input/n0;", "Landroidx/compose/ui/text/input/l0;", "Landroid/view/inputmethod/InputConnection;", "delegate", "Lkotlin/Function0;", "Lkotlin/k2;", "onConnectionClosed", "<init>", "(Landroid/view/inputmethod/InputConnection;Lld/a;)V", "Landroid/view/inputmethod/InputContentInfo;", "p0", "", "p1", "Landroid/os/Bundle;", "p2", "", "commitContent", "(Landroid/view/inputmethod/InputContentInfo;ILandroid/os/Bundle;)Z", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.annotation.x0(25)
/* loaded from: classes.dex */
class n0 extends l0 {
    public n0(@fg.l InputConnection inputConnection, @fg.l ld.a<k2> aVar) {
        super(inputConnection, aVar);
    }

    @Override // androidx.compose.ui.text.input.k0, android.view.inputmethod.InputConnection
    public final boolean commitContent(@fg.l InputContentInfo p02, int p12, @fg.m Bundle p22) {
        boolean commitContent;
        InputConnection delegate = getDelegate();
        if (delegate == null) {
            return false;
        }
        commitContent = delegate.commitContent(p02, p12, p22);
        return commitContent;
    }
}
