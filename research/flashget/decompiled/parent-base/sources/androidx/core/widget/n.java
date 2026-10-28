package androidx.core.widget;

import android.view.View;
import android.widget.PopupMenu;
import androidx.annotation.o0;
import androidx.annotation.q0;

/* compiled from: PopupMenuCompat.java */
/* loaded from: classes3.dex */
public final class n {
    private n() {
    }

    @q0
    public static View.OnTouchListener a(@o0 Object obj) {
        return ((PopupMenu) obj).getDragToOpenListener();
    }
}
