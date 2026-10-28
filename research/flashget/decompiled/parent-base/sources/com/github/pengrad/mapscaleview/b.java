package com.github.pengrad.mapscaleview;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Typeface;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: Drawer.java */
/* loaded from: classes5.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final Paint f50908a;

    /* renamed from: b, reason: collision with root package name */
    private final Paint f50909b;

    /* renamed from: c, reason: collision with root package name */
    private final Path f50910c;

    /* renamed from: d, reason: collision with root package name */
    private final Paint f50911d;

    /* renamed from: e, reason: collision with root package name */
    private final Path f50912e;

    /* renamed from: f, reason: collision with root package name */
    private float f50913f;

    /* renamed from: g, reason: collision with root package name */
    private float f50914g;

    /* renamed from: h, reason: collision with root package name */
    private float f50915h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f50916i;

    /* renamed from: j, reason: collision with root package name */
    private float f50917j;

    /* renamed from: k, reason: collision with root package name */
    private float f50918k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f50919l;

    /* renamed from: m, reason: collision with root package name */
    private int f50920m;

    /* renamed from: n, reason: collision with root package name */
    private f f50921n;

    b(int i4, float f4, float f5, float f6, boolean z4, boolean z5) {
        Paint paint = new Paint();
        this.f50908a = paint;
        Paint paint2 = new Paint();
        this.f50909b = paint2;
        this.f50910c = new Path();
        Paint paint3 = new Paint();
        this.f50911d = paint3;
        this.f50912e = new Path();
        this.f50913f = 2.0f;
        this.f50914g = (2.0f / 2.0f) / 2.0f;
        this.f50915h = 3.0f;
        this.f50916i = true;
        this.f50921n = new f(null, null);
        paint.setAntiAlias(true);
        paint.setColor(i4);
        paint.setStyle(Paint.Style.FILL);
        paint.setTextSize(f4);
        paint2.setAntiAlias(true);
        paint2.setColor(i4);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(f5);
        paint3.set(paint2);
        paint3.setARGB(255, 255, 255, 255);
        this.f50913f = f5 * 2.0f;
        this.f50914g = f5 / 2.0f;
        this.f50915h = f6 * 2.0f;
        this.f50916i = z4;
        this.f50919l = z5;
        l();
    }

    private void l() {
        this.f50911d.setTextSize(this.f50908a.getTextSize());
        this.f50911d.setTypeface(this.f50908a.getTypeface());
        this.f50911d.setStrokeWidth(this.f50915h);
        Rect rect = new Rect();
        (this.f50916i ? this.f50911d : this.f50908a).getTextBounds(ProtectedSandApp.s("쒛"), 0, 15, rect);
        float height = rect.height();
        this.f50917j = height;
        this.f50918k = (height / 2.0f) + height;
    }

    void a(Canvas canvas) {
        e c5 = this.f50921n.c();
        if (c5 == null) {
            return;
        }
        if (this.f50919l && this.f50920m == 0) {
            this.f50919l = false;
        }
        if (this.f50919l) {
            Paint paint = this.f50911d;
            Paint.Align align = Paint.Align.RIGHT;
            paint.setTextAlign(align);
            this.f50908a.setTextAlign(align);
        } else {
            Paint paint2 = this.f50911d;
            Paint.Align align2 = Paint.Align.LEFT;
            paint2.setTextAlign(align2);
            this.f50908a.setTextAlign(align2);
        }
        if (this.f50916i) {
            this.f50911d.setStrokeWidth(this.f50915h);
            canvas.drawText(c5.b(), this.f50919l ? this.f50920m : 0.0f, this.f50917j, this.f50911d);
        }
        canvas.drawText(c5.b(), this.f50919l ? this.f50920m : 0.0f, this.f50917j, this.f50908a);
        this.f50910c.rewind();
        this.f50910c.moveTo(this.f50919l ? this.f50920m - this.f50914g : this.f50914g, this.f50918k);
        this.f50910c.lineTo(this.f50919l ? this.f50920m - c5.a() : c5.a(), this.f50918k);
        if (this.f50916i) {
            this.f50910c.lineTo(this.f50919l ? this.f50920m - c5.a() : c5.a(), this.f50917j + this.f50914g);
        } else {
            this.f50910c.lineTo(this.f50919l ? this.f50920m - c5.a() : c5.a(), this.f50917j);
        }
        e a5 = this.f50921n.a();
        if (a5 != null) {
            if (a5.a() > c5.a()) {
                this.f50910c.moveTo(this.f50919l ? this.f50920m - c5.a() : c5.a(), this.f50918k);
                this.f50910c.lineTo(this.f50919l ? this.f50920m - a5.a() : a5.a(), this.f50918k);
            } else {
                this.f50910c.moveTo(this.f50919l ? this.f50920m - a5.a() : a5.a(), this.f50918k);
            }
            this.f50910c.lineTo(this.f50919l ? this.f50920m - a5.a() : a5.a(), this.f50917j * 2.0f);
            float f4 = this.f50918k;
            float f5 = this.f50917j;
            float f6 = (f5 / 2.0f) + f4 + f5;
            if (this.f50916i) {
                canvas.drawText(a5.b(), this.f50919l ? this.f50920m : 0.0f, f6, this.f50911d);
            }
            canvas.drawText(a5.b(), this.f50919l ? this.f50920m : 0.0f, f6, this.f50908a);
        }
        if (this.f50916i) {
            this.f50911d.setStrokeWidth(this.f50913f);
            this.f50912e.rewind();
            this.f50912e.moveTo(this.f50919l ? this.f50920m : 0.0f, this.f50918k);
            this.f50912e.lineTo(this.f50919l ? this.f50920m - this.f50914g : this.f50914g, this.f50918k);
            this.f50912e.moveTo(this.f50919l ? this.f50920m - c5.a() : c5.a(), this.f50917j + this.f50914g);
            this.f50912e.lineTo(this.f50919l ? this.f50920m - c5.a() : c5.a(), this.f50917j);
            if (a5 != null) {
                this.f50912e.moveTo(this.f50919l ? this.f50920m - a5.a() : a5.a(), this.f50917j * 2.0f);
                this.f50912e.lineTo(this.f50919l ? this.f50920m - a5.a() : a5.a(), (this.f50917j * 2.0f) + this.f50914g);
            }
            canvas.drawPath(this.f50912e, this.f50911d);
            canvas.drawPath(this.f50910c, this.f50911d);
        }
        canvas.drawPath(this.f50910c, this.f50909b);
    }

    int b() {
        float f4;
        float strokeWidth;
        if (this.f50921n.a() != null) {
            f4 = this.f50917j * 3.0f;
            strokeWidth = this.f50915h / 2.0f;
        } else {
            f4 = this.f50918k;
            strokeWidth = this.f50909b.getStrokeWidth();
        }
        return (int) (strokeWidth + f4);
    }

    int c() {
        return (int) (this.f50909b.getStrokeWidth() + this.f50921n.b());
    }

    void d(int i4) {
        this.f50908a.setColor(i4);
        this.f50909b.setColor(i4);
    }

    void e(boolean z4) {
        this.f50919l = z4;
    }

    void f(boolean z4) {
        this.f50916i = z4;
        l();
    }

    void g(f fVar) {
        this.f50921n = fVar;
    }

    void h(float f4) {
        this.f50909b.setStrokeWidth(f4);
        this.f50913f = f4 * 2.0f;
        this.f50914g = f4 / 2.0f;
        l();
    }

    void i(Typeface typeface) {
        this.f50908a.setTypeface(typeface);
        l();
    }

    void j(float f4) {
        this.f50908a.setTextSize(f4);
        l();
    }

    void k(int i4) {
        this.f50920m = i4;
    }
}
