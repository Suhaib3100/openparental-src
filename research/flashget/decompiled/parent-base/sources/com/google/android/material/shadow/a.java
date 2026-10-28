package com.google.android.material.shadow;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.annotation.o0;
import androidx.appcompat.graphics.drawable.DrawableWrapper;
import androidx.core.content.d;
import com.flashget.parentalcontrol.ProtectedSandApp;
import s8.a;

/* compiled from: ShadowDrawableWrapper.java */
@Deprecated
/* loaded from: classes6.dex */
public class a extends DrawableWrapper {

    /* renamed from: q, reason: collision with root package name */
    static final double f53809q = Math.cos(Math.toRadians(45.0d));

    /* renamed from: r, reason: collision with root package name */
    static final float f53810r = 1.5f;

    /* renamed from: s, reason: collision with root package name */
    static final float f53811s = 0.25f;

    /* renamed from: t, reason: collision with root package name */
    static final float f53812t = 0.5f;

    /* renamed from: u, reason: collision with root package name */
    static final float f53813u = 1.0f;

    /* renamed from: a, reason: collision with root package name */
    @o0
    final Paint f53814a;

    /* renamed from: b, reason: collision with root package name */
    @o0
    final Paint f53815b;

    /* renamed from: c, reason: collision with root package name */
    @o0
    final RectF f53816c;

    /* renamed from: d, reason: collision with root package name */
    float f53817d;

    /* renamed from: e, reason: collision with root package name */
    Path f53818e;

    /* renamed from: f, reason: collision with root package name */
    float f53819f;

    /* renamed from: g, reason: collision with root package name */
    float f53820g;

    /* renamed from: h, reason: collision with root package name */
    float f53821h;

    /* renamed from: i, reason: collision with root package name */
    float f53822i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f53823j;

    /* renamed from: k, reason: collision with root package name */
    private final int f53824k;

    /* renamed from: l, reason: collision with root package name */
    private final int f53825l;

    /* renamed from: m, reason: collision with root package name */
    private final int f53826m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f53827n;

    /* renamed from: o, reason: collision with root package name */
    private float f53828o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f53829p;

    public a(Context context, Drawable drawable, float f4, float f5, float f6) {
        super(drawable);
        this.f53823j = true;
        this.f53827n = true;
        this.f53829p = false;
        this.f53824k = d.getColor(context, a.e.f90763z0);
        this.f53825l = d.getColor(context, a.e.f90759y0);
        this.f53826m = d.getColor(context, a.e.f90755x0);
        Paint paint = new Paint(5);
        this.f53814a = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f53817d = Math.round(f4);
        this.f53816c = new RectF();
        Paint paint2 = new Paint(paint);
        this.f53815b = paint2;
        paint2.setAntiAlias(false);
        u(f5, f6);
    }

    private void a(@o0 Rect rect) {
        float f4 = this.f53820g;
        float f5 = f53810r * f4;
        this.f53816c.set(rect.left + f4, rect.top + f5, rect.right - f4, rect.bottom - f5);
        Drawable wrappedDrawable = getWrappedDrawable();
        RectF rectF = this.f53816c;
        wrappedDrawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        b();
    }

    private void b() {
        float f4 = this.f53817d;
        RectF rectF = new RectF(-f4, -f4, f4, f4);
        RectF rectF2 = new RectF(rectF);
        float f5 = this.f53821h;
        rectF2.inset(-f5, -f5);
        Path path = this.f53818e;
        if (path == null) {
            this.f53818e = new Path();
        } else {
            path.reset();
        }
        this.f53818e.setFillType(Path.FillType.EVEN_ODD);
        this.f53818e.moveTo(-this.f53817d, 0.0f);
        this.f53818e.rLineTo(-this.f53821h, 0.0f);
        this.f53818e.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f53818e.arcTo(rectF, 270.0f, -90.0f, false);
        this.f53818e.close();
        float f6 = -rectF2.top;
        if (f6 > 0.0f) {
            float f7 = this.f53817d / f6;
            this.f53814a.setShader(new RadialGradient(0.0f, 0.0f, f6, new int[]{0, this.f53824k, this.f53825l, this.f53826m}, new float[]{0.0f, f7, ((1.0f - f7) / 2.0f) + f7, 1.0f}, Shader.TileMode.CLAMP));
        }
        this.f53815b.setShader(new LinearGradient(0.0f, rectF.top, 0.0f, rectF2.top, new int[]{this.f53824k, this.f53825l, this.f53826m}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.f53815b.setAntiAlias(false);
    }

    public static float c(float f4, float f5, boolean z4) {
        if (!z4) {
            return f4;
        }
        return (float) (((1.0d - f53809q) * f5) + f4);
    }

    public static float d(float f4, float f5, boolean z4) {
        if (!z4) {
            return f4 * f53810r;
        }
        return (float) (((1.0d - f53809q) * f5) + (f4 * f53810r));
    }

    private void f(@o0 Canvas canvas) {
        int i4;
        float f4;
        int i5;
        float f5;
        float f6;
        float f7;
        int save = canvas.save();
        canvas.rotate(this.f53828o, this.f53816c.centerX(), this.f53816c.centerY());
        float f10 = this.f53817d;
        float f11 = (-f10) - this.f53821h;
        float f12 = f10 * 2.0f;
        boolean z4 = this.f53816c.width() - f12 > 0.0f;
        boolean z5 = this.f53816c.height() - f12 > 0.0f;
        float f13 = this.f53822i;
        float f14 = f10 / ((f13 - (0.5f * f13)) + f10);
        float f15 = f10 / ((f13 - (f53811s * f13)) + f10);
        float f16 = f10 / ((f13 - (f13 * 1.0f)) + f10);
        int save2 = canvas.save();
        RectF rectF = this.f53816c;
        canvas.translate(rectF.left + f10, rectF.top + f10);
        canvas.scale(f14, f15);
        canvas.drawPath(this.f53818e, this.f53814a);
        if (z4) {
            canvas.scale(1.0f / f14, 1.0f);
            i4 = save2;
            f4 = f16;
            i5 = save;
            f5 = f15;
            canvas.drawRect(0.0f, f11, this.f53816c.width() - f12, -this.f53817d, this.f53815b);
        } else {
            i4 = save2;
            f4 = f16;
            i5 = save;
            f5 = f15;
        }
        canvas.restoreToCount(i4);
        int save3 = canvas.save();
        RectF rectF2 = this.f53816c;
        canvas.translate(rectF2.right - f10, rectF2.bottom - f10);
        float f17 = f4;
        canvas.scale(f14, f17);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f53818e, this.f53814a);
        if (z4) {
            canvas.scale(1.0f / f14, 1.0f);
            f6 = f5;
            f7 = f17;
            canvas.drawRect(0.0f, f11, this.f53816c.width() - f12, (-this.f53817d) + this.f53821h, this.f53815b);
        } else {
            f6 = f5;
            f7 = f17;
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        RectF rectF3 = this.f53816c;
        canvas.translate(rectF3.left + f10, rectF3.bottom - f10);
        canvas.scale(f14, f7);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f53818e, this.f53814a);
        if (z5) {
            canvas.scale(1.0f / f7, 1.0f);
            canvas.drawRect(0.0f, f11, this.f53816c.height() - f12, -this.f53817d, this.f53815b);
        }
        canvas.restoreToCount(save4);
        int save5 = canvas.save();
        RectF rectF4 = this.f53816c;
        canvas.translate(rectF4.right - f10, rectF4.top + f10);
        float f18 = f6;
        canvas.scale(f14, f18);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f53818e, this.f53814a);
        if (z5) {
            canvas.scale(1.0f / f18, 1.0f);
            canvas.drawRect(0.0f, f11, this.f53816c.height() - f12, -this.f53817d, this.f53815b);
        }
        canvas.restoreToCount(save5);
        canvas.restoreToCount(i5);
    }

    private static int v(float f4) {
        int round = Math.round(f4);
        return round % 2 == 1 ? round - 1 : round;
    }

    public void e(@o0 Canvas canvas) {
        if (this.f53823j) {
            a(getBounds());
            this.f53823j = false;
        }
        f(canvas);
        super.draw(canvas);
    }

    public float g() {
        return this.f53817d;
    }

    public float h() {
        return this.f53820g;
    }

    public float i() {
        float f4 = this.f53820g;
        return (this.f53820g * f53810r * 2.0f) + (Math.max(f4, ((f4 * f53810r) / 2.0f) + this.f53817d) * 2.0f);
    }

    public float j() {
        float f4 = this.f53820g;
        return (this.f53820g * 2.0f) + (Math.max(f4, (f4 / 2.0f) + this.f53817d) * 2.0f);
    }

    public int k() {
        return -3;
    }

    public boolean l(@o0 Rect rect) {
        int ceil = (int) Math.ceil(d(this.f53820g, this.f53817d, this.f53827n));
        int ceil2 = (int) Math.ceil(c(this.f53820g, this.f53817d, this.f53827n));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    public float m() {
        return this.f53822i;
    }

    protected void n(Rect rect) {
        this.f53823j = true;
    }

    public void o(boolean z4) {
        this.f53827n = z4;
        invalidateSelf();
    }

    public void p(int i4) {
        super.setAlpha(i4);
        this.f53814a.setAlpha(i4);
        this.f53815b.setAlpha(i4);
    }

    public void q(float f4) {
        float round = Math.round(f4);
        if (this.f53817d == round) {
            return;
        }
        this.f53817d = round;
        this.f53823j = true;
        invalidateSelf();
    }

    public void r(float f4) {
        u(this.f53822i, f4);
    }

    public final void s(float f4) {
        if (this.f53828o != f4) {
            this.f53828o = f4;
            invalidateSelf();
        }
    }

    public void t(float f4) {
        u(f4, this.f53820g);
    }

    public void u(float f4, float f5) {
        if (f4 < 0.0f || f5 < 0.0f) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\uf20d"));
        }
        float v4 = v(f4);
        float v5 = v(f5);
        if (v4 > v5) {
            if (!this.f53829p) {
                this.f53829p = true;
            }
            v4 = v5;
        }
        if (this.f53822i == v4 && this.f53820g == v5) {
            return;
        }
        this.f53822i = v4;
        this.f53820g = v5;
        this.f53821h = Math.round(v4 * f53810r);
        this.f53819f = v5;
        this.f53823j = true;
        invalidateSelf();
    }
}
