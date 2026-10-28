package androidx.core.graphics;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.core.graphics.f;

/* compiled from: BlendModeColorFilterCompat.java */
/* loaded from: classes3.dex */
public class d {

    /* compiled from: BlendModeColorFilterCompat.java */
    @androidx.annotation.x0(29)
    static class a {
        private a() {
        }

        static ColorFilter a(int i4, Object obj) {
            return new BlendModeColorFilter(i4, (BlendMode) obj);
        }
    }

    private d() {
    }

    @androidx.annotation.q0
    public static ColorFilter a(int i4, @androidx.annotation.o0 e eVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            Object a5 = f.b.a(eVar);
            if (a5 != null) {
                return a.a(i4, a5);
            }
            return null;
        }
        PorterDuff.Mode a6 = f.a(eVar);
        if (a6 != null) {
            return new PorterDuffColorFilter(i4, a6);
        }
        return null;
    }
}
