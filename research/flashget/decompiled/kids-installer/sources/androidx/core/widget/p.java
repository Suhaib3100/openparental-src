package androidx.core.widget;

import android.view.View;
import android.widget.PopupMenu;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;

/* compiled from: PopupMenuCompat.java */
/* loaded from: classes.dex */
public final class p {

    /* compiled from: PopupMenuCompat.java */
    @x0(19)
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static View.OnTouchListener a(PopupMenu popupMenu) {
            return popupMenu.getDragToOpenListener();
        }
    }

    private p() {
    }

    @q0
    public static View.OnTouchListener a(@o0 Object obj) {
        return a.a((PopupMenu) obj);
    }
}
