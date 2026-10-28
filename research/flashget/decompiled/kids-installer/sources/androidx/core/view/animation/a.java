package androidx.core.view.animation;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;
import androidx.appcompat.graphics.drawable.d;

/* compiled from: PathInterpolatorApi14.java */
/* loaded from: classes.dex */
class a implements Interpolator {

    /* renamed from: c, reason: collision with root package name */
    private static final float f5420c = 0.002f;

    /* renamed from: a, reason: collision with root package name */
    private final float[] f5421a;

    /* renamed from: b, reason: collision with root package name */
    private final float[] f5422b;

    a(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i5 = ((int) (length / 0.002f)) + 1;
        this.f5421a = new float[i5];
        this.f5422b = new float[i5];
        float[] fArr = new float[2];
        for (int i6 = 0; i6 < i5; i6++) {
            pathMeasure.getPosTan((i6 * length) / (i5 - 1), fArr, null);
            this.f5421a[i6] = fArr[0];
            this.f5422b[i6] = fArr[1];
        }
    }

    private static Path a(float f6, float f7, float f8, float f9) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f6, f7, f8, f9, 1.0f, 1.0f);
        return path;
    }

    private static Path b(float f6, float f7) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f6, f7, 1.0f, 1.0f);
        return path;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f6) {
        if (f6 <= 0.0f) {
            return 0.0f;
        }
        if (f6 >= 1.0f) {
            return 1.0f;
        }
        int length = this.f5421a.length - 1;
        int i5 = 0;
        while (length - i5 > 1) {
            int i6 = (i5 + length) / 2;
            if (f6 < this.f5421a[i6]) {
                length = i6;
            } else {
                i5 = i6;
            }
        }
        float[] fArr = this.f5421a;
        float f7 = fArr[length];
        float f8 = fArr[i5];
        float f9 = f7 - f8;
        if (f9 == 0.0f) {
            return this.f5422b[i5];
        }
        float f10 = (f6 - f8) / f9;
        float[] fArr2 = this.f5422b;
        float f11 = fArr2[i5];
        return d.a(fArr2[length], f11, f10, f11);
    }

    a(float f6, float f7) {
        this(b(f6, f7));
    }

    a(float f6, float f7, float f8, float f9) {
        this(a(f6, f7, f8, f9));
    }
}
