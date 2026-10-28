package k3;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.d0;
import androidx.annotation.q0;

/* compiled from: ViewBindings.java */
/* loaded from: classes3.dex */
public class c {
    private c() {
    }

    @q0
    public static <T extends View> T a(View view, @d0 int i4) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            T t4 = (T) viewGroup.getChildAt(i5).findViewById(i4);
            if (t4 != null) {
                return t4;
            }
        }
        return null;
    }
}
