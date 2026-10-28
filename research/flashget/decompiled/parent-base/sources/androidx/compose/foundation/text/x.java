package androidx.compose.foundation.text;

import android.view.KeyEvent;
import kotlin.Metadata;

/* compiled from: KeyEventHelpers.android.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0016\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/input/key/c;", "", "a", "(Landroid/view/KeyEvent;)Z", "Lkotlin/k2;", "b", "()V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class x {
    public static final boolean a(@fg.l KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4) {
            int b5 = androidx.compose.ui.input.key.e.b(keyEvent);
            androidx.compose.ui.input.key.d.INSTANCE.getClass();
            if (androidx.compose.ui.input.key.d.g(b5, androidx.compose.ui.input.key.d.f18650d)) {
                return true;
            }
        }
        return false;
    }

    public static final void b() {
    }
}
