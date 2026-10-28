package androidx.transition;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import androidx.core.graphics.b2;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes3.dex */
public class PatternPathMotion extends PathMotion {

    /* renamed from: a, reason: collision with root package name */
    private Path f9769a;

    /* renamed from: b, reason: collision with root package name */
    private final Path f9770b;

    /* renamed from: c, reason: collision with root package name */
    private final Matrix f9771c;

    public PatternPathMotion() {
        Path path = new Path();
        this.f9770b = path;
        this.f9771c = new Matrix();
        path.lineTo(1.0f, 0.0f);
        this.f9769a = path;
    }

    private static float b(float f6, float f7) {
        return (float) Math.sqrt((f7 * f7) + (f6 * f6));
    }

    @Override // androidx.transition.PathMotion
    public Path a(float f6, float f7, float f8, float f9) {
        float f10 = f8 - f6;
        float f11 = f9 - f7;
        float b6 = b(f10, f11);
        double atan2 = Math.atan2(f11, f10);
        this.f9771c.setScale(b6, b6);
        this.f9771c.postRotate((float) Math.toDegrees(atan2));
        this.f9771c.postTranslate(f6, f7);
        Path path = new Path();
        this.f9770b.transform(this.f9771c, path);
        return path;
    }

    public Path c() {
        return this.f9769a;
    }

    public void d(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float[] fArr = new float[2];
        pathMeasure.getPosTan(pathMeasure.getLength(), fArr, null);
        float f6 = fArr[0];
        float f7 = fArr[1];
        pathMeasure.getPosTan(0.0f, fArr, null);
        float f8 = fArr[0];
        float f9 = fArr[1];
        if (f8 == f6 && f9 == f7) {
            throw new IllegalArgumentException("pattern must not end at the starting point");
        }
        this.f9771c.setTranslate(-f8, -f9);
        float f10 = f6 - f8;
        float f11 = f7 - f9;
        float b6 = 1.0f / b(f10, f11);
        this.f9771c.postScale(b6, b6);
        this.f9771c.postRotate((float) Math.toDegrees(-Math.atan2(f11, f10)));
        path.transform(this.f9771c, this.f9770b);
        this.f9769a = path;
    }

    @SuppressLint({"RestrictedApi"})
    public PatternPathMotion(Context context, AttributeSet attributeSet) {
        this.f9770b = new Path();
        this.f9771c = new Matrix();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w.f10090k);
        try {
            String m5 = androidx.core.content.res.p.m(obtainStyledAttributes, (XmlPullParser) attributeSet, "patternPathData", 0);
            if (m5 != null) {
                d(b2.e(m5));
                return;
            }
            throw new RuntimeException("pathData must be supplied for patternPathMotion");
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public PatternPathMotion(Path path) {
        this.f9770b = new Path();
        this.f9771c = new Matrix();
        d(path);
    }
}
