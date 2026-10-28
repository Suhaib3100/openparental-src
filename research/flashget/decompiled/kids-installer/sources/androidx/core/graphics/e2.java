package androidx.core.graphics;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: PathUtils.java */
/* loaded from: classes.dex */
public final class e2 {

    /* compiled from: PathUtils.java */
    @androidx.annotation.x0(26)
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static float[] a(Path path, float f6) {
            float[] approximate;
            approximate = path.approximate(f6);
            return approximate;
        }
    }

    private e2() {
    }

    @androidx.annotation.o0
    @androidx.annotation.x0(26)
    public static Collection<c2> a(@androidx.annotation.o0 Path path) {
        return b(path, 0.5f);
    }

    @androidx.annotation.o0
    @androidx.annotation.x0(26)
    public static Collection<c2> b(@androidx.annotation.o0 Path path, @androidx.annotation.x(from = 0.0d) float f6) {
        float[] a6 = a.a(path, f6);
        int length = a6.length / 3;
        ArrayList arrayList = new ArrayList(length);
        for (int i5 = 1; i5 < length; i5++) {
            int i6 = i5 * 3;
            int i7 = (i5 - 1) * 3;
            float f7 = a6[i6];
            float f8 = a6[i6 + 1];
            float f9 = a6[i6 + 2];
            float f10 = a6[i7];
            float f11 = a6[i7 + 1];
            float f12 = a6[i7 + 2];
            if (f7 != f10 && (f8 != f11 || f9 != f12)) {
                arrayList.add(new c2(new PointF(f11, f12), f10, new PointF(f8, f9), f7));
            }
        }
        return arrayList;
    }
}
