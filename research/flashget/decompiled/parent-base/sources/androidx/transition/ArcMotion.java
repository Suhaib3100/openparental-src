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
    private static final float f34224g = 0.0f;

    /* renamed from: h, reason: collision with root package name */
    private static final float f34225h = 70.0f;

    /* renamed from: i, reason: collision with root package name */
    private static final float f34226i = (float) Math.tan(Math.toRadians(35.0d));

    /* renamed from: a, reason: collision with root package name */
    private float f34227a;

    /* renamed from: b, reason: collision with root package name */
    private float f34228b;

    /* renamed from: c, reason: collision with root package name */
    private float f34229c;

    /* renamed from: d, reason: collision with root package name */
    private float f34230d;

    /* renamed from: e, reason: collision with root package name */
    private float f34231e;

    /* renamed from: f, reason: collision with root package name */
    private float f34232f;

    public ArcMotion() {
        this.f34227a = 0.0f;
        this.f34228b = 0.0f;
        this.f34229c = f34225h;
        this.f34230d = 0.0f;
        this.f34231e = 0.0f;
        this.f34232f = f34226i;
    }

    private static float h(float f4) {
        if (f4 < 0.0f || f4 > 90.0f) {
            throw new IllegalArgumentException("Arc must be between 0 and 90 degrees");
        }
        return (float) Math.tan(Math.toRadians(f4 / 2.0f));
    }

    @Override // androidx.transition.PathMotion
    @androidx.annotation.o0
    public Path a(float f4, float f5, float f6, float f7) {
        float f10;
        float f11;
        float f12;
        Path path = new Path();
        path.moveTo(f4, f5);
        float f13 = f6 - f4;
        float f14 = f7 - f5;
        float f15 = (f14 * f14) + (f13 * f13);
        float f16 = (f4 + f6) / 2.0f;
        float f17 = (f5 + f7) / 2.0f;
        float f18 = 0.25f * f15;
        boolean z4 = f5 > f7;
        if (Math.abs(f13) < Math.abs(f14)) {
            float abs = Math.abs(f15 / (f14 * 2.0f));
            if (z4) {
                f11 = abs + f7;
                f10 = f6;
            } else {
                f11 = abs + f5;
                f10 = f4;
            }
            f12 = this.f34231e;
        } else {
            float f19 = f15 / (f13 * 2.0f);
            if (z4) {
                f11 = f5;
                f10 = f19 + f4;
            } else {
                f10 = f6 - f19;
                f11 = f7;
            }
            f12 = this.f34230d;
        }
        float f20 = f18 * f12 * f12;
        float f21 = f16 - f10;
        float f22 = f17 - f11;
        float f23 = (f22 * f22) + (f21 * f21);
        float f24 = this.f34232f;
        float f25 = f18 * f24 * f24;
        if (f23 >= f20) {
            f20 = f23 > f25 ? f25 : 0.0f;
        }
        if (f20 != 0.0f) {
            float sqrt = (float) Math.sqrt(f20 / f23);
            f10 = androidx.appcompat.graphics.drawable.d.a(f10, f16, sqrt, f16);
            f11 = androidx.appcompat.graphics.drawable.d.a(f11, f17, sqrt, f17);
        }
        path.cubicTo((f4 + f10) / 2.0f, (f5 + f11) / 2.0f, (f10 + f6) / 2.0f, (f11 + f7) / 2.0f, f6, f7);
        return path;
    }

    public float b() {
        return this.f34229c;
    }

    public float c() {
        return this.f34227a;
    }

    public float d() {
        return this.f34228b;
    }

    public void e(float f4) {
        this.f34229c = f4;
        this.f34232f = h(f4);
    }

    public void f(float f4) {
        this.f34227a = f4;
        this.f34230d = h(f4);
    }

    public void g(float f4) {
        this.f34228b = f4;
        this.f34231e = h(f4);
    }

    @SuppressLint({"RestrictedApi"})
    public ArcMotion(@androidx.annotation.o0 Context context, @androidx.annotation.o0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f34227a = 0.0f;
        this.f34228b = 0.0f;
        this.f34229c = f34225h;
        this.f34230d = 0.0f;
        this.f34231e = 0.0f;
        this.f34232f = f34226i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u.f35214j);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        g(androidx.core.content.res.n.j(obtainStyledAttributes, xmlPullParser, "minimumVerticalAngle", 1, 0.0f));
        f(androidx.core.content.res.n.j(obtainStyledAttributes, xmlPullParser, "minimumHorizontalAngle", 0, 0.0f));
        e(androidx.core.content.res.n.j(obtainStyledAttributes, xmlPullParser, "maximumAngle", 2, f34225h));
        obtainStyledAttributes.recycle();
    }
}
