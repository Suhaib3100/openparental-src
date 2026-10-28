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
import androidx.core.content.d;
import com.flashget.kidsdownloader.ProtectedSandApp;
import n1.a;

/* compiled from: ShadowDrawableWrapper.java */
@Deprecated
/* loaded from: classes3.dex */
public class a extends androidx.appcompat.graphics.drawable.c {
    static final double F = Math.cos(Math.toRadians(45.0d));
    static final float G = 1.5f;
    static final float H = 0.25f;
    static final float I = 0.5f;
    static final float J = 1.0f;
    private final int A;
    private final int B;
    private boolean C;
    private float D;
    private boolean E;

    /* renamed from: p, reason: collision with root package name */
    @o0
    final Paint f13959p;

    /* renamed from: q, reason: collision with root package name */
    @o0
    final Paint f13960q;

    /* renamed from: r, reason: collision with root package name */
    @o0
    final RectF f13961r;

    /* renamed from: s, reason: collision with root package name */
    float f13962s;

    /* renamed from: t, reason: collision with root package name */
    Path f13963t;

    /* renamed from: u, reason: collision with root package name */
    float f13964u;

    /* renamed from: v, reason: collision with root package name */
    float f13965v;

    /* renamed from: w, reason: collision with root package name */
    float f13966w;

    /* renamed from: x, reason: collision with root package name */
    float f13967x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f13968y;

    /* renamed from: z, reason: collision with root package name */
    private final int f13969z;

    public a(Context context, Drawable drawable, float f6, float f7, float f8) {
        super(drawable);
        this.f13968y = true;
        this.C = true;
        this.E = false;
        this.f13969z = d.f(context, a.e.f29435z0);
        this.A = d.f(context, a.e.f29431y0);
        this.B = d.f(context, a.e.f29427x0);
        Paint paint = new Paint(5);
        this.f13959p = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f13962s = Math.round(f6);
        this.f13961r = new RectF();
        Paint paint2 = new Paint(paint);
        this.f13960q = paint2;
        paint2.setAntiAlias(false);
        r(f7, f8);
    }

    private void c(@o0 Rect rect) {
        float f6 = this.f13965v;
        float f7 = G * f6;
        this.f13961r.set(rect.left + f6, rect.top + f7, rect.right - f6, rect.bottom - f7);
        Drawable a6 = a();
        RectF rectF = this.f13961r;
        a6.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        d();
    }

    private void d() {
        float f6 = this.f13962s;
        RectF rectF = new RectF(-f6, -f6, f6, f6);
        RectF rectF2 = new RectF(rectF);
        float f7 = this.f13966w;
        rectF2.inset(-f7, -f7);
        Path path = this.f13963t;
        if (path == null) {
            this.f13963t = new Path();
        } else {
            path.reset();
        }
        this.f13963t.setFillType(Path.FillType.EVEN_ODD);
        this.f13963t.moveTo(-this.f13962s, 0.0f);
        this.f13963t.rLineTo(-this.f13966w, 0.0f);
        this.f13963t.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f13963t.arcTo(rectF, 270.0f, -90.0f, false);
        this.f13963t.close();
        float f8 = -rectF2.top;
        if (f8 > 0.0f) {
            float f9 = this.f13962s / f8;
            this.f13959p.setShader(new RadialGradient(0.0f, 0.0f, f8, new int[]{0, this.f13969z, this.A, this.B}, new float[]{0.0f, f9, ((1.0f - f9) / 2.0f) + f9, 1.0f}, Shader.TileMode.CLAMP));
        }
        this.f13960q.setShader(new LinearGradient(0.0f, rectF.top, 0.0f, rectF2.top, new int[]{this.f13969z, this.A, this.B}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.f13960q.setAntiAlias(false);
    }

    public static float e(float f6, float f7, boolean z5) {
        if (!z5) {
            return f6;
        }
        return (float) (((1.0d - F) * f7) + f6);
    }

    public static float f(float f6, float f7, boolean z5) {
        if (!z5) {
            return f6 * G;
        }
        return (float) (((1.0d - F) * f7) + (f6 * G));
    }

    private void g(@o0 Canvas canvas) {
        int i5;
        float f6;
        int i6;
        float f7;
        float f8;
        float f9;
        int save = canvas.save();
        canvas.rotate(this.D, this.f13961r.centerX(), this.f13961r.centerY());
        float f10 = this.f13962s;
        float f11 = (-f10) - this.f13966w;
        float f12 = f10 * 2.0f;
        boolean z5 = this.f13961r.width() - f12 > 0.0f;
        boolean z6 = this.f13961r.height() - f12 > 0.0f;
        float f13 = this.f13967x;
        float f14 = f10 / ((f13 - (0.5f * f13)) + f10);
        float f15 = f10 / ((f13 - (H * f13)) + f10);
        float f16 = f10 / ((f13 - (f13 * 1.0f)) + f10);
        int save2 = canvas.save();
        RectF rectF = this.f13961r;
        canvas.translate(rectF.left + f10, rectF.top + f10);
        canvas.scale(f14, f15);
        canvas.drawPath(this.f13963t, this.f13959p);
        if (z5) {
            canvas.scale(1.0f / f14, 1.0f);
            i5 = save2;
            f6 = f16;
            i6 = save;
            f7 = f15;
            canvas.drawRect(0.0f, f11, this.f13961r.width() - f12, -this.f13962s, this.f13960q);
        } else {
            i5 = save2;
            f6 = f16;
            i6 = save;
            f7 = f15;
        }
        canvas.restoreToCount(i5);
        int save3 = canvas.save();
        RectF rectF2 = this.f13961r;
        canvas.translate(rectF2.right - f10, rectF2.bottom - f10);
        float f17 = f6;
        canvas.scale(f14, f17);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f13963t, this.f13959p);
        if (z5) {
            canvas.scale(1.0f / f14, 1.0f);
            f8 = f7;
            f9 = f17;
            canvas.drawRect(0.0f, f11, this.f13961r.width() - f12, (-this.f13962s) + this.f13966w, this.f13960q);
        } else {
            f8 = f7;
            f9 = f17;
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        RectF rectF3 = this.f13961r;
        canvas.translate(rectF3.left + f10, rectF3.bottom - f10);
        canvas.scale(f14, f9);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f13963t, this.f13959p);
        if (z6) {
            canvas.scale(1.0f / f9, 1.0f);
            canvas.drawRect(0.0f, f11, this.f13961r.height() - f12, -this.f13962s, this.f13960q);
        }
        canvas.restoreToCount(save4);
        int save5 = canvas.save();
        RectF rectF4 = this.f13961r;
        canvas.translate(rectF4.right - f10, rectF4.top + f10);
        float f18 = f8;
        canvas.scale(f14, f18);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f13963t, this.f13959p);
        if (z6) {
            canvas.scale(1.0f / f18, 1.0f);
            canvas.drawRect(0.0f, f11, this.f13961r.height() - f12, -this.f13962s, this.f13960q);
        }
        canvas.restoreToCount(save5);
        canvas.restoreToCount(i6);
    }

    private static int s(float f6) {
        int round = Math.round(f6);
        return round % 2 == 1 ? round - 1 : round;
    }

    @Override // androidx.appcompat.graphics.drawable.c, android.graphics.drawable.Drawable
    public void draw(@o0 Canvas canvas) {
        if (this.f13968y) {
            c(getBounds());
            this.f13968y = false;
        }
        g(canvas);
        super.draw(canvas);
    }

    @Override // androidx.appcompat.graphics.drawable.c, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // androidx.appcompat.graphics.drawable.c, android.graphics.drawable.Drawable
    public boolean getPadding(@o0 Rect rect) {
        int ceil = (int) Math.ceil(f(this.f13965v, this.f13962s, this.C));
        int ceil2 = (int) Math.ceil(e(this.f13965v, this.f13962s, this.C));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    public float h() {
        return this.f13962s;
    }

    public float i() {
        return this.f13965v;
    }

    public float j() {
        float f6 = this.f13965v;
        return (this.f13965v * G * 2.0f) + (Math.max(f6, ((f6 * G) / 2.0f) + this.f13962s) * 2.0f);
    }

    public float k() {
        float f6 = this.f13965v;
        return (this.f13965v * 2.0f) + (Math.max(f6, (f6 / 2.0f) + this.f13962s) * 2.0f);
    }

    public float l() {
        return this.f13967x;
    }

    public void m(boolean z5) {
        this.C = z5;
        invalidateSelf();
    }

    public void n(float f6) {
        float round = Math.round(f6);
        if (this.f13962s == round) {
            return;
        }
        this.f13962s = round;
        this.f13968y = true;
        invalidateSelf();
    }

    public void o(float f6) {
        r(this.f13967x, f6);
    }

    @Override // androidx.appcompat.graphics.drawable.c, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f13968y = true;
    }

    public final void p(float f6) {
        if (this.D != f6) {
            this.D = f6;
            invalidateSelf();
        }
    }

    public void q(float f6) {
        r(f6, this.f13965v);
    }

    public void r(float f6, float f7) {
        if (f6 < 0.0f || f7 < 0.0f) {
            throw new IllegalArgumentException(ProtectedSandApp.s("✚"));
        }
        float s5 = s(f6);
        float s6 = s(f7);
        if (s5 > s6) {
            if (!this.E) {
                this.E = true;
            }
            s5 = s6;
        }
        if (this.f13967x == s5 && this.f13965v == s6) {
            return;
        }
        this.f13967x = s5;
        this.f13965v = s6;
        this.f13966w = Math.round(s5 * G);
        this.f13964u = s6;
        this.f13968y = true;
        invalidateSelf();
    }

    @Override // androidx.appcompat.graphics.drawable.c, android.graphics.drawable.Drawable
    public void setAlpha(int i5) {
        super.setAlpha(i5);
        this.f13959p.setAlpha(i5);
        this.f13960q.setAlpha(i5);
    }
}
