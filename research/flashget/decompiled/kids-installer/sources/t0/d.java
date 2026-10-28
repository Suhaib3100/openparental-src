package t0;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.d0;
import androidx.annotation.q0;

/* compiled from: ViewBindings.java */
/* loaded from: classes2.dex */
public class d {
    private d() {
    }

    @q0
    public static <T extends View> T a(View view, @d0 int i5) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            T t5 = (T) viewGroup.getChildAt(i6).findViewById(i5);
            if (t5 != null) {
                return t5;
            }
        }
        return null;
    }
}
