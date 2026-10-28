package androidx.core.widget;

import android.view.View;
import android.widget.ListPopupWindow;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.w0;

/* compiled from: ListPopupWindowCompat.java */
/* loaded from: classes3.dex */
public final class k {
    private k() {
    }

    @q0
    @w0(expression = "listPopupWindow.createDragToOpenListener(src)")
    @Deprecated
    public static View.OnTouchListener a(@o0 ListPopupWindow listPopupWindow, @o0 View view) {
        return listPopupWindow.createDragToOpenListener(view);
    }

    @Deprecated
    public static View.OnTouchListener b(Object obj, View view) {
        return ((ListPopupWindow) obj).createDragToOpenListener(view);
    }
}
