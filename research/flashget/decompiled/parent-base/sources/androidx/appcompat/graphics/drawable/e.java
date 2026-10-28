package androidx.appcompat.graphics.drawable;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.c1;
import androidx.annotation.l;
import androidx.annotation.x;
import com.google.firebase.remoteconfig.p;
import d.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: DrawerArrowDrawable.java */
/* loaded from: classes.dex */
public class e extends Drawable {

    /* renamed from: m, reason: collision with root package name */
    public static final int f1033m = 0;

    /* renamed from: n, reason: collision with root package name */
    public static final int f1034n = 1;

    /* renamed from: o, reason: collision with root package name */
    public static final int f1035o = 2;

    /* renamed from: p, reason: collision with root package name */
    public static final int f1036p = 3;

    /* renamed from: q, reason: collision with root package name */
    private static final float f1037q = (float) Math.toRadians(45.0d);

    /* renamed from: a, reason: collision with root package name */
    private final Paint f1038a;

    /* renamed from: b, reason: collision with root package name */
    private float f1039b;

    /* renamed from: c, reason: collision with root package name */
    private float f1040c;

    /* renamed from: d, reason: collision with root package name */
    private float f1041d;

    /* renamed from: e, reason: collision with root package name */
    private float f1042e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f1043f;

    /* renamed from: g, reason: collision with root package name */
    private final Path f1044g;

    /* renamed from: h, reason: collision with root package name */
    private final int f1045h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f1046i;

    /* renamed from: j, reason: collision with root package name */
    private float f1047j;

    /* renamed from: k, reason: collision with root package name */
    private float f1048k;

    /* renamed from: l, reason: collision with root package name */
    private int f1049l;

    /* compiled from: DrawerArrowDrawable.java */
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public e(Context context) {
        Paint paint = new Paint();
        this.f1038a = paint;
        this.f1044g = new Path();
        this.f1046i = false;
        this.f1049l = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, a.m.C3, a.b.f73020o1, a.l.f73462v1);
        p(obtainStyledAttributes.getColor(a.m.G3, 0));
        o(obtainStyledAttributes.getDimension(a.m.K3, 0.0f));
        s(obtainStyledAttributes.getBoolean(a.m.J3, true));
        r(Math.round(obtainStyledAttributes.getDimension(a.m.I3, 0.0f)));
        this.f1045h = obtainStyledAttributes.getDimensionPixelSize(a.m.H3, 0);
        this.f1040c = Math.round(obtainStyledAttributes.getDimension(a.m.F3, 0.0f));
        this.f1039b = Math.round(obtainStyledAttributes.getDimension(a.m.D3, 0.0f));
        this.f1041d = obtainStyledAttributes.getDimension(a.m.E3, 0.0f);
        obtainStyledAttributes.recycle();
    }

    private static float k(float f4, float f5, float f6) {
        return d.a(f5, f4, f6, f4);
    }

    public float a() {
        return this.f1039b;
    }

    public float b() {
        return this.f1041d;
    }

    public float c() {
        return this.f1040c;
    }

    public float d() {
        return this.f1038a.getStrokeWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i4 = this.f1049l;
        boolean z4 = false;
        if (i4 != 0 && (i4 == 1 || (i4 == 3 ? getLayoutDirection() == 0 : getLayoutDirection() == 1))) {
            z4 = true;
        }
        float f4 = this.f1039b;
        float k4 = k(this.f1040c, (float) Math.sqrt(f4 * f4 * 2.0f), this.f1047j);
        float k5 = k(this.f1040c, this.f1041d, this.f1047j);
        float round = Math.round(k(0.0f, this.f1048k, this.f1047j));
        float k6 = k(0.0f, f1037q, this.f1047j);
        float k7 = k(z4 ? 0.0f : -180.0f, z4 ? 180.0f : 0.0f, this.f1047j);
        double d5 = k4;
        double d6 = k6;
        boolean z5 = z4;
        float round2 = Math.round(Math.cos(d6) * d5);
        float round3 = Math.round(Math.sin(d6) * d5);
        this.f1044g.rewind();
        float k10 = k(this.f1038a.getStrokeWidth() + this.f1042e, -this.f1048k, this.f1047j);
        float f5 = (-k5) / 2.0f;
        this.f1044g.moveTo(f5 + round, 0.0f);
        this.f1044g.rLineTo(k5 - (round * 2.0f), 0.0f);
        this.f1044g.moveTo(f5, k10);
        this.f1044g.rLineTo(round2, round3);
        this.f1044g.moveTo(f5, -k10);
        this.f1044g.rLineTo(round2, -round3);
        this.f1044g.close();
        canvas.save();
        float strokeWidth = this.f1038a.getStrokeWidth();
        float height = bounds.height() - (3.0f * strokeWidth);
        canvas.translate(bounds.centerX(), (strokeWidth * 1.5f) + this.f1042e + ((((int) (height - (2.0f * r5))) / 4) * 2));
        if (this.f1043f) {
            canvas.rotate(k7 * (this.f1046i ^ z5 ? -1 : 1));
        } else if (z5) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.f1044g, this.f1038a);
        canvas.restore();
    }

    @l
    public int e() {
        return this.f1038a.getColor();
    }

    public int f() {
        return this.f1049l;
    }

    public float g() {
        return this.f1042e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f1045h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f1045h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public final Paint h() {
        return this.f1038a;
    }

    @x(from = p.f60679p, to = 1.0d)
    public float i() {
        return this.f1047j;
    }

    public boolean j() {
        return this.f1043f;
    }

    public void l(float f4) {
        if (this.f1039b != f4) {
            this.f1039b = f4;
            invalidateSelf();
        }
    }

    public void m(float f4) {
        if (this.f1041d != f4) {
            this.f1041d = f4;
            invalidateSelf();
        }
    }

    public void n(float f4) {
        if (this.f1040c != f4) {
            this.f1040c = f4;
            invalidateSelf();
        }
    }

    public void o(float f4) {
        if (this.f1038a.getStrokeWidth() != f4) {
            this.f1038a.setStrokeWidth(f4);
            this.f1048k = (float) (Math.cos(f1037q) * (f4 / 2.0f));
            invalidateSelf();
        }
    }

    public void p(@l int i4) {
        if (i4 != this.f1038a.getColor()) {
            this.f1038a.setColor(i4);
            invalidateSelf();
        }
    }

    public void q(int i4) {
        if (i4 != this.f1049l) {
            this.f1049l = i4;
            invalidateSelf();
        }
    }

    public void r(float f4) {
        if (f4 != this.f1042e) {
            this.f1042e = f4;
            invalidateSelf();
        }
    }

    public void s(boolean z4) {
        if (this.f1043f != z4) {
            this.f1043f = z4;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
        if (i4 != this.f1038a.getAlpha()) {
            this.f1038a.setAlpha(i4);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f1038a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setProgress(@x(from = 0.0d, to = 1.0d) float f4) {
        if (this.f1047j != f4) {
            this.f1047j = f4;
            invalidateSelf();
        }
    }

    public void t(boolean z4) {
        if (this.f1046i != z4) {
            this.f1046i = z4;
            invalidateSelf();
        }
    }
}
