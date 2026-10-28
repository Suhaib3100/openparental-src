package androidx.transition;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes3.dex */
public class PatternPathMotion extends PathMotion {

    /* renamed from: a, reason: collision with root package name */
    private Path f34289a;

    /* renamed from: b, reason: collision with root package name */
    private final Path f34290b;

    /* renamed from: c, reason: collision with root package name */
    private final Matrix f34291c;

    public PatternPathMotion() {
        Path path = new Path();
        this.f34290b = path;
        this.f34291c = new Matrix();
        path.lineTo(1.0f, 0.0f);
        this.f34289a = path;
    }

    private static float b(float f4, float f5) {
        return (float) Math.sqrt((f5 * f5) + (f4 * f4));
    }

    @Override // androidx.transition.PathMotion
    @androidx.annotation.o0
    public Path a(float f4, float f5, float f6, float f7) {
        float f10 = f6 - f4;
        float f11 = f7 - f5;
        float b5 = b(f10, f11);
        double atan2 = Math.atan2(f11, f10);
        this.f34291c.setScale(b5, b5);
        this.f34291c.postRotate((float) Math.toDegrees(atan2));
        this.f34291c.postTranslate(f4, f5);
        Path path = new Path();
        this.f34290b.transform(this.f34291c, path);
        return path;
    }

    public Path c() {
        return this.f34289a;
    }

    public void d(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float[] fArr = new float[2];
        pathMeasure.getPosTan(pathMeasure.getLength(), fArr, null);
        float f4 = fArr[0];
        float f5 = fArr[1];
        pathMeasure.getPosTan(0.0f, fArr, null);
        float f6 = fArr[0];
        float f7 = fArr[1];
        if (f6 == f4 && f7 == f5) {
            throw new IllegalArgumentException("pattern must not end at the starting point");
        }
        this.f34291c.setTranslate(-f6, -f7);
        float f10 = f4 - f6;
        float f11 = f5 - f7;
        float b5 = 1.0f / b(f10, f11);
        this.f34291c.postScale(b5, b5);
        this.f34291c.postRotate((float) Math.toDegrees(-Math.atan2(f11, f10)));
        path.transform(this.f34291c, this.f34290b);
        this.f34289a = path;
    }

    @SuppressLint({"RestrictedApi"})
    public PatternPathMotion(@androidx.annotation.o0 Context context, @androidx.annotation.o0 AttributeSet attributeSet) {
        this.f34290b = new Path();
        this.f34291c = new Matrix();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u.f35215k);
        try {
            String m4 = androidx.core.content.res.n.m(obtainStyledAttributes, (XmlPullParser) attributeSet, "patternPathData", 0);
            if (m4 != null) {
                d(androidx.core.graphics.j0.e(m4));
                return;
            }
            throw new RuntimeException("pathData must be supplied for patternPathMotion");
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public PatternPathMotion(Path path) {
        this.f34290b = new Path();
        this.f34291c = new Matrix();
        d(path);
    }
}
