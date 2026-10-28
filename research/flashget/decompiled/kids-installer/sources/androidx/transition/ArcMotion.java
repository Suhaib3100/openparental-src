package androidx.transition;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes3.dex */
public class ArcMotion extends PathMotion {

    /* renamed from: g, reason: collision with root package name */
    private static final float f9656g = 0.0f;

    /* renamed from: h, reason: collision with root package name */
    private static final float f9657h = 70.0f;

    /* renamed from: i, reason: collision with root package name */
    private static final float f9658i = (float) Math.tan(Math.toRadians(35.0d));

    /* renamed from: a, reason: collision with root package name */
    private float f9659a;

    /* renamed from: b, reason: collision with root package name */
    private float f9660b;

    /* renamed from: c, reason: collision with root package name */
    private float f9661c;

    /* renamed from: d, reason: collision with root package name */
    private float f9662d;

    /* renamed from: e, reason: collision with root package name */
    private float f9663e;

    /* renamed from: f, reason: collision with root package name */
    private float f9664f;

    public ArcMotion() {
        this.f9659a = 0.0f;
        this.f9660b = 0.0f;
        this.f9661c = f9657h;
        this.f9662d = 0.0f;
        this.f9663e = 0.0f;
        this.f9664f = f9658i;
    }

    private static float h(float f6) {
        if (f6 < 0.0f || f6 > 90.0f) {
            throw new IllegalArgumentException("Arc must be between 0 and 90 degrees");
        }
        return (float) Math.tan(Math.toRadians(f6 / 2.0f));
    }

    @Override // androidx.transition.PathMotion
    public Path a(float f6, float f7, float f8, float f9) {
        float f10;
        float f11;
        float f12;
        Path path = new Path();
        path.moveTo(f6, f7);
        float f13 = f8 - f6;
        float f14 = f9 - f7;
        float f15 = (f14 * f14) + (f13 * f13);
        float f16 = (f6 + f8) / 2.0f;
        float f17 = (f7 + f9) / 2.0f;
        float f18 = 0.25f * f15;
        boolean z5 = f7 > f9;
        if (Math.abs(f13) < Math.abs(f14)) {
            float abs = Math.abs(f15 / (f14 * 2.0f));
            if (z5) {
                f11 = abs + f9;
                f10 = f8;
            } else {
                f11 = abs + f7;
                f10 = f6;
            }
            f12 = this.f9663e;
        } else {
            float f19 = f15 / (f13 * 2.0f);
            if (z5) {
                f11 = f7;
                f10 = f19 + f6;
            } else {
                f10 = f8 - f19;
                f11 = f9;
            }
            f12 = this.f9662d;
        }
        float f20 = f18 * f12 * f12;
        float f21 = f16 - f10;
        float f22 = f17 - f11;
        float f23 = (f22 * f22) + (f21 * f21);
        float f24 = this.f9664f;
        float f25 = f18 * f24 * f24;
        if (f23 >= f20) {
            f20 = f23 > f25 ? f25 : 0.0f;
        }
        if (f20 != 0.0f) {
            float sqrt = (float) Math.sqrt(f20 / f23);
            f10 = androidx.appcompat.graphics.drawable.d.a(f10, f16, sqrt, f16);
            f11 = androidx.appcompat.graphics.drawable.d.a(f11, f17, sqrt, f17);
        }
        path.cubicTo((f6 + f10) / 2.0f, (f7 + f11) / 2.0f, (f10 + f8) / 2.0f, (f11 + f9) / 2.0f, f8, f9);
        return path;
    }

    public float b() {
        return this.f9661c;
    }

    public float c() {
        return this.f9659a;
    }

    public float d() {
        return this.f9660b;
    }

    public void e(float f6) {
        this.f9661c = f6;
        this.f9664f = h(f6);
    }

    public void f(float f6) {
        this.f9659a = f6;
        this.f9662d = h(f6);
    }

    public void g(float f6) {
        this.f9660b = f6;
        this.f9663e = h(f6);
    }

    @SuppressLint({"RestrictedApi"})
    public ArcMotion(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9659a = 0.0f;
        this.f9660b = 0.0f;
        this.f9661c = f9657h;
        this.f9662d = 0.0f;
        this.f9663e = 0.0f;
        this.f9664f = f9658i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w.f10089j);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        g(androidx.core.content.res.p.j(obtainStyledAttributes, xmlPullParser, "minimumVerticalAngle", 1, 0.0f));
        f(androidx.core.content.res.p.j(obtainStyledAttributes, xmlPullParser, "minimumHorizontalAngle", 0, 0.0f));
        e(androidx.core.content.res.p.j(obtainStyledAttributes, xmlPullParser, "maximumAngle", 2, f9657h));
        obtainStyledAttributes.recycle();
    }
}
