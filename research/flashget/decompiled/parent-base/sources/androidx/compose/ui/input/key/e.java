package androidx.compose.ui.input.key;

import android.view.KeyEvent;
import fg.l;
import kotlin.Metadata;

/* compiled from: KeyEvent.android.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0015\u0010\b\u001a\u00020\u0005*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u0015\u0010\u000b\u001a\u00020\t*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0007\"\u0015\u0010\u000f\u001a\u00020\f*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"\u0015\u0010\u0011\u001a\u00020\f*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000e\"\u0015\u0010\u0013\u001a\u00020\f*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000e\"\u0015\u0010\u0015\u001a\u00020\f*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000e*\n\u0010\u0017\"\u00020\u00162\u00020\u0016¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/input/key/c;", "Landroidx/compose/ui/input/key/b;", "a", "(Landroid/view/KeyEvent;)J", "key", "", "c", "(Landroid/view/KeyEvent;)I", "utf16CodePoint", "Landroidx/compose/ui/input/key/d;", "b", "type", "", "d", "(Landroid/view/KeyEvent;)Z", "isAltPressed", "e", "isCtrlPressed", "f", "isMetaPressed", "g", "isShiftPressed", "Landroid/view/KeyEvent;", "NativeKeyEvent", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e {
    public static final long a(@l KeyEvent keyEvent) {
        return i.a(keyEvent.getKeyCode());
    }

    public static final int b(@l KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action == 0) {
            d.INSTANCE.getClass();
            return d.f18651e;
        }
        if (action != 1) {
            d.INSTANCE.getClass();
            return d.f18649c;
        }
        d.INSTANCE.getClass();
        return d.f18650d;
    }

    public static final int c(@l KeyEvent keyEvent) {
        return keyEvent.getUnicodeChar();
    }

    public static final boolean d(@l KeyEvent keyEvent) {
        return keyEvent.isAltPressed();
    }

    public static final boolean e(@l KeyEvent keyEvent) {
        return keyEvent.isCtrlPressed();
    }

    public static final boolean f(@l KeyEvent keyEvent) {
        return keyEvent.isMetaPressed();
    }

    public static final boolean g(@l KeyEvent keyEvent) {
        return keyEvent.isShiftPressed();
    }
}
