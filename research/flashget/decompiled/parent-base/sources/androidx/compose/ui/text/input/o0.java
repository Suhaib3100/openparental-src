package androidx.compose.ui.text.input;

import android.os.Build;
import android.view.inputmethod.InputConnection;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: NullableInputConnectionWrapper.android.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/view/inputmethod/InputConnection;", "delegate", "Lkotlin/Function0;", "Lkotlin/k2;", "onConnectionClosed", "Landroidx/compose/ui/text/input/j0;", "a", "(Landroid/view/inputmethod/InputConnection;Lld/a;)Landroidx/compose/ui/text/input/j0;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class o0 {
    @fg.l
    public static final j0 a(@fg.l InputConnection inputConnection, @fg.l ld.a<k2> aVar) {
        return Build.VERSION.SDK_INT >= 25 ? new n0(inputConnection, aVar) : new l0(inputConnection, aVar);
    }
}
