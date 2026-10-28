package androidx.core.widget;

import android.view.View;
import android.widget.ListPopupWindow;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;

/* compiled from: ListPopupWindowCompat.java */
/* loaded from: classes.dex */
public final class m {

    /* compiled from: ListPopupWindowCompat.java */
    @x0(19)
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static View.OnTouchListener a(ListPopupWindow listPopupWindow, View view) {
            return listPopupWindow.createDragToOpenListener(view);
        }
    }

    private m() {
    }

    @q0
    public static View.OnTouchListener a(@o0 ListPopupWindow listPopupWindow, @o0 View view) {
        return a.a(listPopupWindow, view);
    }

    @Deprecated
    public static View.OnTouchListener b(Object obj, View view) {
        return a.a((ListPopupWindow) obj, view);
    }
}
