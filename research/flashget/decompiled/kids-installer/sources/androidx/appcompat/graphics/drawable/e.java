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
    public static final int f515m = 0;

    /* renamed from: n, reason: collision with root package name */
    public static final int f516n = 1;

    /* renamed from: o, reason: collision with root package name */
    public static final int f517o = 2;

    /* renamed from: p, reason: collision with root package name */
    public static final int f518p = 3;

    /* renamed from: q, reason: collision with root package name */
    private static final float f519q = (float) Math.toRadians(45.0d);

    /* renamed from: a, reason: collision with root package name */
    private final Paint f520a;

    /* renamed from: b, reason: collision with root package name */
    private float f521b;

    /* renamed from: c, reason: collision with root package name */
    private float f522c;

    /* renamed from: d, reason: collision with root package name */
    private float f523d;

    /* renamed from: e, reason: collision with root package name */
    private float f524e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f525f;

    /* renamed from: g, reason: collision with root package name */
    private final Path f526g;

    /* renamed from: h, reason: collision with root package name */
    private final int f527h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f528i;

    /* renamed from: j, reason: collision with root package name */
    private float f529j;

    /* renamed from: k, reason: collision with root package name */
    private float f530k;

    /* renamed from: l, reason: collision with root package name */
    private int f531l;

    /* compiled from: DrawerArrowDrawable.java */
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public e(Context context) {
        Paint paint = new Paint();
        this.f520a = paint;
        this.f526g = new Path();
        this.f528i = false;
        this.f531l = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, a.n.Q3, a.c.f21603m1, a.m.f22130v1);
        p(obtainStyledAttributes.getColor(a.n.U3, 0));
        o(obtainStyledAttributes.getDimension(a.n.Y3, 0.0f));
        t(obtainStyledAttributes.getBoolean(a.n.X3, true));
        r(Math.round(obtainStyledAttributes.getDimension(a.n.W3, 0.0f)));
        this.f527h = obtainStyledAttributes.getDimensionPixelSize(a.n.V3, 0);
        this.f522c = Math.round(obtainStyledAttributes.getDimension(a.n.T3, 0.0f));
        this.f521b = Math.round(obtainStyledAttributes.getDimension(a.n.R3, 0.0f));
        this.f523d = obtainStyledAttributes.getDimension(a.n.S3, 0.0f);
        obtainStyledAttributes.recycle();
    }

    private static float k(float f6, float f7, float f8) {
        return d.a(f7, f6, f8, f6);
    }

    public float a() {
        return this.f521b;
    }

    public float b() {
        return this.f523d;
    }

    public float c() {
        return this.f522c;
    }

    public float d() {
        return this.f520a.getStrokeWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i5 = this.f531l;
        boolean z5 = false;
        if (i5 != 0 && (i5 == 1 || (i5 == 3 ? androidx.core.graphics.drawable.d.f(this) == 0 : androidx.core.graphics.drawable.d.f(this) == 1))) {
            z5 = true;
        }
        float f6 = this.f521b;
        float sqrt = (float) Math.sqrt(f6 * f6 * 2.0f);
        float f7 = this.f522c;
        float f8 = this.f529j;
        float a6 = d.a(sqrt, f7, f8, f7);
        float a7 = d.a(this.f523d, f7, f8, f7);
        float round = Math.round(((this.f530k - 0.0f) * f8) + 0.0f);
        float f9 = f519q;
        float f10 = this.f529j;
        float a8 = d.a(f9, 0.0f, f10, 0.0f);
        float f11 = z5 ? 0.0f : -180.0f;
        float a9 = d.a(z5 ? 180.0f : 0.0f, f11, f10, f11);
        double d6 = a6;
        double d7 = a8;
        float round2 = Math.round(Math.cos(d7) * d6);
        float round3 = Math.round(Math.sin(d7) * d6);
        this.f526g.rewind();
        float strokeWidth = this.f520a.getStrokeWidth() + this.f524e;
        float a10 = d.a(-this.f530k, strokeWidth, this.f529j, strokeWidth);
        float f12 = (-a7) / 2.0f;
        this.f526g.moveTo(f12 + round, 0.0f);
        this.f526g.rLineTo(a7 - (round * 2.0f), 0.0f);
        this.f526g.moveTo(f12, a10);
        this.f526g.rLineTo(round2, round3);
        this.f526g.moveTo(f12, -a10);
        this.f526g.rLineTo(round2, -round3);
        this.f526g.close();
        canvas.save();
        float strokeWidth2 = this.f520a.getStrokeWidth();
        float height = bounds.height() - (3.0f * strokeWidth2);
        canvas.translate(bounds.centerX(), (strokeWidth2 * 1.5f) + this.f524e + ((((int) (height - (2.0f * r8))) / 4) * 2));
        if (this.f525f) {
            canvas.rotate(a9 * (this.f528i ^ z5 ? -1 : 1));
        } else if (z5) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.f526g, this.f520a);
        canvas.restore();
    }

    @l
    public int e() {
        return this.f520a.getColor();
    }

    public int f() {
        return this.f531l;
    }

    public float g() {
        return this.f524e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f527h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f527h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public final Paint h() {
        return this.f520a;
    }

    @x(from = p.f18289o, to = 1.0d)
    public float i() {
        return this.f529j;
    }

    public boolean j() {
        return this.f525f;
    }

    public void l(float f6) {
        if (this.f521b != f6) {
            this.f521b = f6;
            invalidateSelf();
        }
    }

    public void m(float f6) {
        if (this.f523d != f6) {
            this.f523d = f6;
            invalidateSelf();
        }
    }

    public void n(float f6) {
        if (this.f522c != f6) {
            this.f522c = f6;
            invalidateSelf();
        }
    }

    public void o(float f6) {
        if (this.f520a.getStrokeWidth() != f6) {
            this.f520a.setStrokeWidth(f6);
            this.f530k = (float) (Math.cos(f519q) * (f6 / 2.0f));
            invalidateSelf();
        }
    }

    public void p(@l int i5) {
        if (i5 != this.f520a.getColor()) {
            this.f520a.setColor(i5);
            invalidateSelf();
        }
    }

    public void q(int i5) {
        if (i5 != this.f531l) {
            this.f531l = i5;
            invalidateSelf();
        }
    }

    public void r(float f6) {
        if (f6 != this.f524e) {
            this.f524e = f6;
            invalidateSelf();
        }
    }

    public void s(@x(from = 0.0d, to = 1.0d) float f6) {
        if (this.f529j != f6) {
            this.f529j = f6;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i5) {
        if (i5 != this.f520a.getAlpha()) {
            this.f520a.setAlpha(i5);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f520a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void t(boolean z5) {
        if (this.f525f != z5) {
            this.f525f = z5;
            invalidateSelf();
        }
    }

    public void u(boolean z5) {
        if (this.f528i != z5) {
            this.f528i = z5;
            invalidateSelf();
        }
    }
}
