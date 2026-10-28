package androidx.core.graphics;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.core.graphics.q;

/* compiled from: BlendModeColorFilterCompat.java */
/* loaded from: classes.dex */
public class o {

    /* compiled from: BlendModeColorFilterCompat.java */
    @androidx.annotation.x0(29)
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static ColorFilter a(int i5, Object obj) {
            return new BlendModeColorFilter(i5, (BlendMode) obj);
        }
    }

    private o() {
    }

    @androidx.annotation.q0
    public static ColorFilter a(int i5, @androidx.annotation.o0 p pVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            Object a6 = q.b.a(pVar);
            if (a6 != null) {
                return a.a(i5, a6);
            }
            return null;
        }
        PorterDuff.Mode a7 = q.a(pVar);
        if (a7 != null) {
            return new PorterDuffColorFilter(i5, a7);
        }
        return null;
    }
}
