package androidx.core.graphics;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: PathUtils.java */
/* loaded from: classes3.dex */
public final class l0 {

    /* compiled from: PathUtils.java */
    @androidx.annotation.x0(26)
    static class a {
        private a() {
        }

        static float[] a(Path path, float f4) {
            return path.approximate(f4);
        }
    }

    private l0() {
    }

    @androidx.annotation.o0
    @androidx.annotation.x0(26)
    public static Collection<k0> a(@androidx.annotation.o0 Path path) {
        return b(path, 0.5f);
    }

    @androidx.annotation.o0
    @androidx.annotation.x0(26)
    public static Collection<k0> b(@androidx.annotation.o0 Path path, @androidx.annotation.x(from = 0.0d) float f4) {
        float[] a5 = a.a(path, f4);
        int length = a5.length / 3;
        ArrayList arrayList = new ArrayList(length);
        for (int i4 = 1; i4 < length; i4++) {
            int i5 = i4 * 3;
            int i6 = (i4 - 1) * 3;
            float f5 = a5[i5];
            float f6 = a5[i5 + 1];
            float f7 = a5[i5 + 2];
            float f10 = a5[i6];
            float f11 = a5[i6 + 1];
            float f12 = a5[i6 + 2];
            if (f5 != f10 && (f6 != f11 || f7 != f12)) {
                arrayList.add(new k0(new PointF(f11, f12), f10, new PointF(f6, f7), f5));
            }
        }
        return arrayList;
    }
}
