package com.google.android.material.circularreveal;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.l;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.appcompat.view.menu.s;
import androidx.core.view.y1;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.material.circularreveal.c;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: CircularRevealHelper.java */
/* loaded from: classes2.dex */
public class b {

    /* renamed from: k, reason: collision with root package name */
    private static final boolean f13261k = false;

    /* renamed from: l, reason: collision with root package name */
    public static final int f13262l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static final int f13263m = 1;

    /* renamed from: n, reason: collision with root package name */
    public static final int f13264n = 2;

    /* renamed from: o, reason: collision with root package name */
    public static final int f13265o = 2;

    /* renamed from: a, reason: collision with root package name */
    private final a f13266a;

    /* renamed from: b, reason: collision with root package name */
    @o0
    private final View f13267b;

    /* renamed from: c, reason: collision with root package name */
    @o0
    private final Path f13268c;

    /* renamed from: d, reason: collision with root package name */
    @o0
    private final Paint f13269d;

    /* renamed from: e, reason: collision with root package name */
    @o0
    private final Paint f13270e;

    /* renamed from: f, reason: collision with root package name */
    @q0
    private c.e f13271f;

    /* renamed from: g, reason: collision with root package name */
    @q0
    private Drawable f13272g;

    /* renamed from: h, reason: collision with root package name */
    private Paint f13273h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f13274i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f13275j;

    /* compiled from: CircularRevealHelper.java */
    public interface a {
        void i(Canvas canvas);

        boolean k();
    }

    /* compiled from: CircularRevealHelper.java */
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.circularreveal.b$b, reason: collision with other inner class name */
    public @interface InterfaceC0171b {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(a aVar) {
        this.f13266a = aVar;
        View view = (View) aVar;
        this.f13267b = view;
        view.setWillNotDraw(false);
        this.f13268c = new Path();
        this.f13269d = new Paint(7);
        Paint paint = new Paint(1);
        this.f13270e = paint;
        paint.setColor(0);
    }

    private void d(@o0 Canvas canvas, int i5, float f6) {
        this.f13273h.setColor(i5);
        this.f13273h.setStrokeWidth(f6);
        c.e eVar = this.f13271f;
        canvas.drawCircle(eVar.f13281a, eVar.f13282b, eVar.f13283c - (f6 / 2.0f), this.f13273h);
    }

    private void e(@o0 Canvas canvas) {
        this.f13266a.i(canvas);
        if (r()) {
            c.e eVar = this.f13271f;
            canvas.drawCircle(eVar.f13281a, eVar.f13282b, eVar.f13283c, this.f13270e);
        }
        if (p()) {
            d(canvas, y1.f5758t, 10.0f);
            d(canvas, m.a.f29111c, 5.0f);
        }
        f(canvas);
    }

    private void f(@o0 Canvas canvas) {
        if (q()) {
            Rect bounds = this.f13272g.getBounds();
            float width = this.f13271f.f13281a - (bounds.width() / 2.0f);
            float height = this.f13271f.f13282b - (bounds.height() / 2.0f);
            canvas.translate(width, height);
            this.f13272g.draw(canvas);
            canvas.translate(-width, -height);
        }
    }

    private float i(@o0 c.e eVar) {
        return u1.a.b(eVar.f13281a, eVar.f13282b, 0.0f, 0.0f, this.f13267b.getWidth(), this.f13267b.getHeight());
    }

    private void k() {
        if (f13265o == 1) {
            this.f13268c.rewind();
            c.e eVar = this.f13271f;
            if (eVar != null) {
                this.f13268c.addCircle(eVar.f13281a, eVar.f13282b, eVar.f13283c, Path.Direction.CW);
            }
        }
        this.f13267b.invalidate();
    }

    private boolean p() {
        c.e eVar = this.f13271f;
        boolean z5 = eVar == null || eVar.a();
        return f13265o == 0 ? !z5 && this.f13275j : !z5;
    }

    private boolean q() {
        return (this.f13274i || this.f13272g == null || this.f13271f == null) ? false : true;
    }

    private boolean r() {
        return (this.f13274i || Color.alpha(this.f13270e.getColor()) == 0) ? false : true;
    }

    public void a() {
        if (f13265o == 0) {
            this.f13274i = true;
            this.f13275j = false;
            this.f13267b.buildDrawingCache();
            Bitmap drawingCache = this.f13267b.getDrawingCache();
            if (drawingCache == null && this.f13267b.getWidth() != 0 && this.f13267b.getHeight() != 0) {
                drawingCache = Bitmap.createBitmap(this.f13267b.getWidth(), this.f13267b.getHeight(), Bitmap.Config.ARGB_8888);
                this.f13267b.draw(new Canvas(drawingCache));
            }
            if (drawingCache != null) {
                Paint paint = this.f13269d;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(drawingCache, tileMode, tileMode));
            }
            this.f13274i = false;
            this.f13275j = true;
        }
    }

    public void b() {
        if (f13265o == 0) {
            this.f13275j = false;
            this.f13267b.destroyDrawingCache();
            this.f13269d.setShader(null);
            this.f13267b.invalidate();
        }
    }

    public void c(@o0 Canvas canvas) {
        if (p()) {
            int i5 = f13265o;
            if (i5 == 0) {
                c.e eVar = this.f13271f;
                canvas.drawCircle(eVar.f13281a, eVar.f13282b, eVar.f13283c, this.f13269d);
                if (r()) {
                    c.e eVar2 = this.f13271f;
                    canvas.drawCircle(eVar2.f13281a, eVar2.f13282b, eVar2.f13283c, this.f13270e);
                }
            } else if (i5 == 1) {
                int save = canvas.save();
                canvas.clipPath(this.f13268c);
                this.f13266a.i(canvas);
                if (r()) {
                    canvas.drawRect(0.0f, 0.0f, this.f13267b.getWidth(), this.f13267b.getHeight(), this.f13270e);
                }
                canvas.restoreToCount(save);
            } else {
                if (i5 != 2) {
                    throw new IllegalStateException(s.a(ProtectedSandApp.s("ሏ"), i5));
                }
                this.f13266a.i(canvas);
                if (r()) {
                    canvas.drawRect(0.0f, 0.0f, this.f13267b.getWidth(), this.f13267b.getHeight(), this.f13270e);
                }
            }
        } else {
            this.f13266a.i(canvas);
            if (r()) {
                canvas.drawRect(0.0f, 0.0f, this.f13267b.getWidth(), this.f13267b.getHeight(), this.f13270e);
            }
        }
        f(canvas);
    }

    @q0
    public Drawable g() {
        return this.f13272g;
    }

    @l
    public int h() {
        return this.f13270e.getColor();
    }

    @q0
    public c.e j() {
        c.e eVar = this.f13271f;
        if (eVar == null) {
            return null;
        }
        c.e eVar2 = new c.e(eVar);
        if (eVar2.a()) {
            eVar2.f13283c = i(eVar2);
        }
        return eVar2;
    }

    public boolean l() {
        return this.f13266a.k() && !p();
    }

    public void m(@q0 Drawable drawable) {
        this.f13272g = drawable;
        this.f13267b.invalidate();
    }

    public void n(@l int i5) {
        this.f13270e.setColor(i5);
        this.f13267b.invalidate();
    }

    public void o(@q0 c.e eVar) {
        if (eVar == null) {
            this.f13271f = null;
        } else {
            c.e eVar2 = this.f13271f;
            if (eVar2 == null) {
                this.f13271f = new c.e(eVar);
            } else {
                eVar2.c(eVar);
            }
            if (u1.a.e(eVar.f13283c, i(eVar), 1.0E-4f)) {
                this.f13271f.f13283c = Float.MAX_VALUE;
            }
        }
        k();
    }
}
