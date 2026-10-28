package androidx.vectordrawable.graphics.drawable;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import androidx.annotation.c1;
import androidx.core.content.res.p;
import androidx.core.graphics.b2;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: PathInterpolatorCompat.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class g implements Interpolator {

    /* renamed from: c, reason: collision with root package name */
    private static final float f10216c = 0.002f;

    /* renamed from: d, reason: collision with root package name */
    public static final int f10217d = 3000;

    /* renamed from: e, reason: collision with root package name */
    public static final double f10218e = 1.0E-5d;

    /* renamed from: a, reason: collision with root package name */
    private float[] f10219a;

    /* renamed from: b, reason: collision with root package name */
    private float[] f10220b;

    public g(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    private void a(float f6, float f7, float f8, float f9) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f6, f7, f8, f9, 1.0f, 1.0f);
        b(path);
    }

    private void b(Path path) {
        int i5 = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = Math.min(f10217d, ((int) (length / 0.002f)) + 1);
        if (min <= 0) {
            throw new IllegalArgumentException("The Path has a invalid length " + length);
        }
        this.f10219a = new float[min];
        this.f10220b = new float[min];
        float[] fArr = new float[2];
        for (int i6 = 0; i6 < min; i6++) {
            pathMeasure.getPosTan((i6 * length) / (min - 1), fArr, null);
            this.f10219a[i6] = fArr[0];
            this.f10220b[i6] = fArr[1];
        }
        if (Math.abs(this.f10219a[0]) <= 1.0E-5d && Math.abs(this.f10220b[0]) <= 1.0E-5d) {
            int i7 = min - 1;
            if (Math.abs(this.f10219a[i7] - 1.0f) <= 1.0E-5d && Math.abs(this.f10220b[i7] - 1.0f) <= 1.0E-5d) {
                float f6 = 0.0f;
                int i8 = 0;
                while (i5 < min) {
                    float[] fArr2 = this.f10219a;
                    int i9 = i8 + 1;
                    float f7 = fArr2[i8];
                    if (f7 < f6) {
                        throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + f7);
                    }
                    fArr2[i5] = f7;
                    i5++;
                    f6 = f7;
                    i8 = i9;
                }
                if (pathMeasure.nextContour()) {
                    throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                }
                return;
            }
        }
        StringBuilder sb = new StringBuilder("The Path must start at (0,0) and end at (1,1) start: ");
        sb.append(this.f10219a[0]);
        sb.append(",");
        sb.append(this.f10220b[0]);
        sb.append(" end:");
        int i10 = min - 1;
        sb.append(this.f10219a[i10]);
        sb.append(",");
        sb.append(this.f10220b[i10]);
        throw new IllegalArgumentException(sb.toString());
    }

    private void c(float f6, float f7) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f6, f7, 1.0f, 1.0f);
        b(path);
    }

    private void d(TypedArray typedArray, XmlPullParser xmlPullParser) {
        if (p.r(xmlPullParser, "pathData")) {
            String m5 = p.m(typedArray, xmlPullParser, "pathData", 4);
            Path e6 = b2.e(m5);
            if (e6 == null) {
                throw new InflateException(androidx.constraintlayout.motion.widget.g.a("The path is null, which is created from ", m5));
            }
            b(e6);
            return;
        }
        if (!p.r(xmlPullParser, "controlX1")) {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        }
        if (!p.r(xmlPullParser, "controlY1")) {
            throw new InflateException("pathInterpolator requires the controlY1 attribute");
        }
        float j5 = p.j(typedArray, xmlPullParser, "controlX1", 0, 0.0f);
        float j6 = p.j(typedArray, xmlPullParser, "controlY1", 1, 0.0f);
        boolean r5 = p.r(xmlPullParser, "controlX2");
        if (r5 != p.r(xmlPullParser, "controlY2")) {
            throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
        }
        if (r5) {
            a(j5, j6, p.j(typedArray, xmlPullParser, "controlX2", 2, 0.0f), p.j(typedArray, xmlPullParser, "controlY2", 3, 0.0f));
        } else {
            c(j5, j6);
        }
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f6) {
        if (f6 <= 0.0f) {
            return 0.0f;
        }
        if (f6 >= 1.0f) {
            return 1.0f;
        }
        int length = this.f10219a.length - 1;
        int i5 = 0;
        while (length - i5 > 1) {
            int i6 = (i5 + length) / 2;
            if (f6 < this.f10219a[i6]) {
                length = i6;
            } else {
                i5 = i6;
            }
        }
        float[] fArr = this.f10219a;
        float f7 = fArr[length];
        float f8 = fArr[i5];
        float f9 = f7 - f8;
        if (f9 == 0.0f) {
            return this.f10220b[i5];
        }
        float f10 = (f6 - f8) / f9;
        float[] fArr2 = this.f10220b;
        float f11 = fArr2[i5];
        return androidx.appcompat.graphics.drawable.d.a(fArr2[length], f11, f10, f11);
    }

    public g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray s5 = p.s(resources, theme, attributeSet, a.f10167r0);
        d(s5, xmlPullParser);
        s5.recycle();
    }
}
