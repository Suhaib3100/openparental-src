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

/* compiled from: RoundedBitmapDrawable.java */
/* loaded from: classes3.dex */
public abstract class i extends Drawable {

    /* renamed from: n, reason: collision with root package name */
    private static final int f26216n = 3;

    /* renamed from: a, reason: collision with root package name */
    final Bitmap f26217a;

    /* renamed from: b, reason: collision with root package name */
    private int f26218b;

    /* renamed from: e, reason: collision with root package name */
    private final BitmapShader f26221e;

    /* renamed from: g, reason: collision with root package name */
    private float f26223g;

    /* renamed from: k, reason: collision with root package name */
    private boolean f26227k;

    /* renamed from: l, reason: collision with root package name */
    private int f26228l;

    /* renamed from: m, reason: collision with root package name */
    private int f26229m;

    /* renamed from: c, reason: collision with root package name */
    private int f26219c = 119;

    /* renamed from: d, reason: collision with root package name */
    private final Paint f26220d = new Paint(3);

    /* renamed from: f, reason: collision with root package name */
    private final Matrix f26222f = new Matrix();

    /* renamed from: h, reason: collision with root package name */
    final Rect f26224h = new Rect();

    /* renamed from: i, reason: collision with root package name */
    private final RectF f26225i = new RectF();

    /* renamed from: j, reason: collision with root package name */
    private boolean f26226j = true;

    i(Resources resources, Bitmap bitmap) {
        this.f26218b = 160;
        if (resources != null) {
            this.f26218b = resources.getDisplayMetrics().densityDpi;
        }
        this.f26217a = bitmap;
        if (bitmap != null) {
            a();
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f26221e = new BitmapShader(bitmap, tileMode, tileMode);
        } else {
            this.f26229m = -1;
            this.f26228l = -1;
            this.f26221e = null;
        }
    }

    private void a() {
        this.f26228l = this.f26217a.getScaledWidth(this.f26218b);
        this.f26229m = this.f26217a.getScaledHeight(this.f26218b);
    }

    private static boolean j(float f4) {
        return f4 > 0.05f;
    }

    private void s() {
        this.f26223g = Math.min(this.f26229m, this.f26228l) / 2;
    }

    @q0
    public final Bitmap b() {
        return this.f26217a;
    }

    public float c() {
        return this.f26223g;
    }

    public int d() {
        return this.f26219c;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@o0 Canvas canvas) {
        Bitmap bitmap = this.f26217a;
        if (bitmap == null) {
            return;
        }
        t();
        if (this.f26220d.getShader() == null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.f26224h, this.f26220d);
            return;
        }
        RectF rectF = this.f26225i;
        float f4 = this.f26223g;
        canvas.drawRoundRect(rectF, f4, f4, this.f26220d);
    }

    @o0
    public final Paint e() {
        return this.f26220d;
    }

    void f(int i4, int i5, int i6, Rect rect, Rect rect2) {
        throw new UnsupportedOperationException();
    }

    public boolean g() {
        return this.f26220d.isAntiAlias();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f26220d.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f26220d.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f26229m;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f26228l;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Bitmap bitmap;
        return (this.f26219c != 119 || this.f26227k || (bitmap = this.f26217a) == null || bitmap.hasAlpha() || this.f26220d.getAlpha() < 255 || j(this.f26223g)) ? -3 : -1;
    }

    public boolean h() {
        throw new UnsupportedOperationException();
    }

    public boolean i() {
        return this.f26227k;
    }

    public void k(boolean z4) {
        this.f26220d.setAntiAlias(z4);
        invalidateSelf();
    }

    public void l(boolean z4) {
        this.f26227k = z4;
        this.f26226j = true;
        if (!z4) {
            m(0.0f);
            return;
        }
        s();
        this.f26220d.setShader(this.f26221e);
        invalidateSelf();
    }

    public void m(float f4) {
        if (this.f26223g == f4) {
            return;
        }
        this.f26227k = false;
        if (j(f4)) {
            this.f26220d.setShader(this.f26221e);
        } else {
            this.f26220d.setShader(null);
        }
        this.f26223g = f4;
        invalidateSelf();
    }

    public void n(int i4) {
        if (this.f26219c != i4) {
            this.f26219c = i4;
            this.f26226j = true;
            invalidateSelf();
        }
    }

    public void o(boolean z4) {
        throw new UnsupportedOperationException();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(@o0 Rect rect) {
        super.onBoundsChange(rect);
        if (this.f26227k) {
            s();
        }
        this.f26226j = true;
    }

    public void p(int i4) {
        if (this.f26218b != i4) {
            if (i4 == 0) {
                i4 = 160;
            }
            this.f26218b = i4;
            if (this.f26217a != null) {
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
    public void setAlpha(int i4) {
        if (i4 != this.f26220d.getAlpha()) {
            this.f26220d.setAlpha(i4);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f26220d.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z4) {
        this.f26220d.setDither(z4);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z4) {
        this.f26220d.setFilterBitmap(z4);
        invalidateSelf();
    }

    void t() {
        if (this.f26226j) {
            if (this.f26227k) {
                int min = Math.min(this.f26228l, this.f26229m);
                f(this.f26219c, min, min, getBounds(), this.f26224h);
                int min2 = Math.min(this.f26224h.width(), this.f26224h.height());
                this.f26224h.inset(Math.max(0, (this.f26224h.width() - min2) / 2), Math.max(0, (this.f26224h.height() - min2) / 2));
                this.f26223g = min2 * 0.5f;
            } else {
                f(this.f26219c, this.f26228l, this.f26229m, getBounds(), this.f26224h);
            }
            this.f26225i.set(this.f26224h);
            if (this.f26221e != null) {
                Matrix matrix = this.f26222f;
                RectF rectF = this.f26225i;
                matrix.setTranslate(rectF.left, rectF.top);
                this.f26222f.preScale(this.f26225i.width() / this.f26217a.getWidth(), this.f26225i.height() / this.f26217a.getHeight());
                this.f26221e.setLocalMatrix(this.f26222f);
                this.f26220d.setShader(this.f26221e);
            }
            this.f26226j = false;
        }
    }
}
