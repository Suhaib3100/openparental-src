package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import androidx.annotation.o0;
import androidx.annotation.q0;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: RoundedBitmapDrawable.java */
/* loaded from: classes.dex */
public abstract class n extends Drawable {

    /* renamed from: n, reason: collision with root package name */
    private static final int f4728n = 3;

    /* renamed from: a, reason: collision with root package name */
    final Bitmap f4729a;

    /* renamed from: b, reason: collision with root package name */
    private int f4730b;

    /* renamed from: e, reason: collision with root package name */
    private final BitmapShader f4733e;

    /* renamed from: g, reason: collision with root package name */
    private float f4735g;

    /* renamed from: k, reason: collision with root package name */
    private boolean f4739k;

    /* renamed from: l, reason: collision with root package name */
    private int f4740l;

    /* renamed from: m, reason: collision with root package name */
    private int f4741m;

    /* renamed from: c, reason: collision with root package name */
    private int f4731c = 119;

    /* renamed from: d, reason: collision with root package name */
    private final Paint f4732d = new Paint(3);

    /* renamed from: f, reason: collision with root package name */
    private final Matrix f4734f = new Matrix();

    /* renamed from: h, reason: collision with root package name */
    final Rect f4736h = new Rect();

    /* renamed from: i, reason: collision with root package name */
    private final RectF f4737i = new RectF();

    /* renamed from: j, reason: collision with root package name */
    private boolean f4738j = true;

    n(Resources resources, Bitmap bitmap) {
        this.f4730b = SyslogAppender.LOG_LOCAL4;
        if (resources != null) {
            this.f4730b = resources.getDisplayMetrics().densityDpi;
        }
        this.f4729a = bitmap;
        if (bitmap != null) {
            a();
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f4733e = new BitmapShader(bitmap, tileMode, tileMode);
        } else {
            this.f4741m = -1;
            this.f4740l = -1;
            this.f4733e = null;
        }
    }

    private void a() {
        this.f4740l = this.f4729a.getScaledWidth(this.f4730b);
        this.f4741m = this.f4729a.getScaledHeight(this.f4730b);
    }

    private static boolean j(float f6) {
        return f6 > 0.05f;
    }

    private void s() {
        this.f4735g = Math.min(this.f4741m, this.f4740l) / 2;
    }

    @q0
    public final Bitmap b() {
        return this.f4729a;
    }

    public float c() {
        return this.f4735g;
    }

    public int d() {
        return this.f4731c;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@o0 Canvas canvas) {
        Bitmap bitmap = this.f4729a;
        if (bitmap == null) {
            return;
        }
        t();
        if (this.f4732d.getShader() == null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.f4736h, this.f4732d);
            return;
        }
        RectF rectF = this.f4737i;
        float f6 = this.f4735g;
        canvas.drawRoundRect(rectF, f6, f6, this.f4732d);
    }

    @o0
    public final Paint e() {
        return this.f4732d;
    }

    void f(int i5, int i6, int i7, Rect rect, Rect rect2) {
        throw new UnsupportedOperationException();
    }

    public boolean g() {
        return this.f4732d.isAntiAlias();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f4732d.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f4732d.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f4741m;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f4740l;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Bitmap bitmap;
        return (this.f4731c != 119 || this.f4739k || (bitmap = this.f4729a) == null || bitmap.hasAlpha() || this.f4732d.getAlpha() < 255 || j(this.f4735g)) ? -3 : -1;
    }

    public boolean h() {
        throw new UnsupportedOperationException();
    }

    public boolean i() {
        return this.f4739k;
    }

    public void k(boolean z5) {
        this.f4732d.setAntiAlias(z5);
        invalidateSelf();
    }

    public void l(boolean z5) {
        this.f4739k = z5;
        this.f4738j = true;
        if (!z5) {
            m(0.0f);
            return;
        }
        s();
        this.f4732d.setShader(this.f4733e);
        invalidateSelf();
    }

    public void m(float f6) {
        if (this.f4735g == f6) {
            return;
        }
        this.f4739k = false;
        if (j(f6)) {
            this.f4732d.setShader(this.f4733e);
        } else {
            this.f4732d.setShader(null);
        }
        this.f4735g = f6;
        invalidateSelf();
    }

    public void n(int i5) {
        if (this.f4731c != i5) {
            this.f4731c = i5;
            this.f4738j = true;
            invalidateSelf();
        }
    }

    public void o(boolean z5) {
        throw new UnsupportedOperationException();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(@o0 Rect rect) {
        super.onBoundsChange(rect);
        if (this.f4739k) {
            s();
        }
        this.f4738j = true;
    }

    public void p(int i5) {
        if (this.f4730b != i5) {
            if (i5 == 0) {
                i5 = SyslogAppender.LOG_LOCAL4;
            }
            this.f4730b = i5;
            if (this.f4729a != null) {
                a();
            }
            invalidateSelf();
        }
    }

    public void q(@o0 Canvas canvas) {
        p(canvas.getDensity());
    }

    public void r(@o0 DisplayMetrics displayMetrics) {
        p(displayMetrics.densityDpi);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i5) {
        if (i5 != this.f4732d.getAlpha()) {
            this.f4732d.setAlpha(i5);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f4732d.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z5) {
        this.f4732d.setDither(z5);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z5) {
        this.f4732d.setFilterBitmap(z5);
        invalidateSelf();
    }

    void t() {
        if (this.f4738j) {
            if (this.f4739k) {
                int min = Math.min(this.f4740l, this.f4741m);
                f(this.f4731c, min, min, getBounds(), this.f4736h);
                int min2 = Math.min(this.f4736h.width(), this.f4736h.height());
                this.f4736h.inset(Math.max(0, (this.f4736h.width() - min2) / 2), Math.max(0, (this.f4736h.height() - min2) / 2));
                this.f4735g = min2 * 0.5f;
            } else {
                f(this.f4731c, this.f4740l, this.f4741m, getBounds(), this.f4736h);
            }
            this.f4737i.set(this.f4736h);
            if (this.f4733e != null) {
                Matrix matrix = this.f4734f;
                RectF rectF = this.f4737i;
                matrix.setTranslate(rectF.left, rectF.top);
                this.f4734f.preScale(this.f4737i.width() / this.f4729a.getWidth(), this.f4737i.height() / this.f4729a.getHeight());
                this.f4733e.setLocalMatrix(this.f4734f);
                this.f4732d.setShader(this.f4733e);
            }
            this.f4738j = false;
        }
    }
}
