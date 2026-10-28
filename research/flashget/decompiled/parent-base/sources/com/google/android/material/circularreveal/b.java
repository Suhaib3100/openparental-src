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
import androidx.core.view.x1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.material.circularreveal.c;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: CircularRevealHelper.java */
/* loaded from: classes6.dex */
public class b {

    /* renamed from: k, reason: collision with root package name */
    private static final boolean f53013k = false;

    /* renamed from: l, reason: collision with root package name */
    public static final int f53014l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static final int f53015m = 1;

    /* renamed from: n, reason: collision with root package name */
    public static final int f53016n = 2;

    /* renamed from: o, reason: collision with root package name */
    public static final int f53017o = 2;

    /* renamed from: a, reason: collision with root package name */
    private final a f53018a;

    /* renamed from: b, reason: collision with root package name */
    @o0
    private final View f53019b;

    /* renamed from: c, reason: collision with root package name */
    @o0
    private final Path f53020c;

    /* renamed from: d, reason: collision with root package name */
    @o0
    private final Paint f53021d;

    /* renamed from: e, reason: collision with root package name */
    @o0
    private final Paint f53022e;

    /* renamed from: f, reason: collision with root package name */
    @q0
    private c.e f53023f;

    /* renamed from: g, reason: collision with root package name */
    @q0
    private Drawable f53024g;

    /* renamed from: h, reason: collision with root package name */
    private Paint f53025h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f53026i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f53027j;

    /* compiled from: CircularRevealHelper.java */
    public interface a {
        void h(Canvas canvas);

        boolean l();
    }

    /* compiled from: CircularRevealHelper.java */
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.circularreveal.b$b, reason: collision with other inner class name */
    public @interface InterfaceC0805b {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(a aVar) {
        this.f53018a = aVar;
        View view = (View) aVar;
        this.f53019b = view;
        view.setWillNotDraw(false);
        this.f53020c = new Path();
        this.f53021d = new Paint(7);
        Paint paint = new Paint(1);
        this.f53022e = paint;
        paint.setColor(0);
    }

    private void d(@o0 Canvas canvas, int i4, float f4) {
        this.f53025h.setColor(i4);
        this.f53025h.setStrokeWidth(f4);
        c.e eVar = this.f53023f;
        canvas.drawCircle(eVar.f53033a, eVar.f53034b, eVar.f53035c - (f4 / 2.0f), this.f53025h);
    }

    private void e(@o0 Canvas canvas) {
        this.f53018a.h(canvas);
        if (r()) {
            c.e eVar = this.f53023f;
            canvas.drawCircle(eVar.f53033a, eVar.f53034b, eVar.f53035c, this.f53022e);
        }
        if (p()) {
            d(canvas, x1.f27484y, 10.0f);
            d(canvas, c1.a.f38447c, 5.0f);
        }
        f(canvas);
    }

    private void f(@o0 Canvas canvas) {
        if (q()) {
            Rect bounds = this.f53024g.getBounds();
            float width = this.f53023f.f53033a - (bounds.width() / 2.0f);
            float height = this.f53023f.f53034b - (bounds.height() / 2.0f);
            canvas.translate(width, height);
            this.f53024g.draw(canvas);
            canvas.translate(-width, -height);
        }
    }

    private float i(@o0 c.e eVar) {
        return z8.a.b(eVar.f53033a, eVar.f53034b, 0.0f, 0.0f, this.f53019b.getWidth(), this.f53019b.getHeight());
    }

    private void k() {
        if (f53017o == 1) {
            this.f53020c.rewind();
            c.e eVar = this.f53023f;
            if (eVar != null) {
                this.f53020c.addCircle(eVar.f53033a, eVar.f53034b, eVar.f53035c, Path.Direction.CW);
            }
        }
        this.f53019b.invalidate();
    }

    private boolean p() {
        c.e eVar = this.f53023f;
        boolean z4 = eVar == null || eVar.a();
        return f53017o == 0 ? !z4 && this.f53027j : !z4;
    }

    private boolean q() {
        return (this.f53026i || this.f53024g == null || this.f53023f == null) ? false : true;
    }

    private boolean r() {
        return (this.f53026i || Color.alpha(this.f53022e.getColor()) == 0) ? false : true;
    }

    public void a() {
        if (f53017o == 0) {
            this.f53026i = true;
            this.f53027j = false;
            this.f53019b.buildDrawingCache();
            Bitmap drawingCache = this.f53019b.getDrawingCache();
            if (drawingCache == null && this.f53019b.getWidth() != 0 && this.f53019b.getHeight() != 0) {
                drawingCache = Bitmap.createBitmap(this.f53019b.getWidth(), this.f53019b.getHeight(), Bitmap.Config.ARGB_8888);
                this.f53019b.draw(new Canvas(drawingCache));
            }
            if (drawingCache != null) {
                Paint paint = this.f53021d;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(drawingCache, tileMode, tileMode));
            }
            this.f53026i = false;
            this.f53027j = true;
        }
    }

    public void b() {
        if (f53017o == 0) {
            this.f53027j = false;
            this.f53019b.destroyDrawingCache();
            this.f53021d.setShader(null);
            this.f53019b.invalidate();
        }
    }

    public void c(@o0 Canvas canvas) {
        if (p()) {
            int i4 = f53017o;
            if (i4 == 0) {
                c.e eVar = this.f53023f;
                canvas.drawCircle(eVar.f53033a, eVar.f53034b, eVar.f53035c, this.f53021d);
                if (r()) {
                    c.e eVar2 = this.f53023f;
                    canvas.drawCircle(eVar2.f53033a, eVar2.f53034b, eVar2.f53035c, this.f53022e);
                }
            } else if (i4 == 1) {
                int save = canvas.save();
                canvas.clipPath(this.f53020c);
                this.f53018a.h(canvas);
                if (r()) {
                    canvas.drawRect(0.0f, 0.0f, this.f53019b.getWidth(), this.f53019b.getHeight(), this.f53022e);
                }
                canvas.restoreToCount(save);
            } else {
                if (i4 != 2) {
                    throw new IllegalStateException(android.support.v4.media.a.a(ProtectedSandApp.s("\uf18e"), i4));
                }
                this.f53018a.h(canvas);
                if (r()) {
                    canvas.drawRect(0.0f, 0.0f, this.f53019b.getWidth(), this.f53019b.getHeight(), this.f53022e);
                }
            }
        } else {
            this.f53018a.h(canvas);
            if (r()) {
                canvas.drawRect(0.0f, 0.0f, this.f53019b.getWidth(), this.f53019b.getHeight(), this.f53022e);
            }
        }
        f(canvas);
    }

    @q0
    public Drawable g() {
        return this.f53024g;
    }

    @l
    public int h() {
        return this.f53022e.getColor();
    }

    @q0
    public c.e j() {
        c.e eVar = this.f53023f;
        if (eVar == null) {
            return null;
        }
        c.e eVar2 = new c.e(eVar);
        if (eVar2.a()) {
            eVar2.f53035c = i(eVar2);
        }
        return eVar2;
    }

    public boolean l() {
        return this.f53018a.l() && !p();
    }

    public void m(@q0 Drawable drawable) {
        this.f53024g = drawable;
        this.f53019b.invalidate();
    }

    public void n(@l int i4) {
        this.f53022e.setColor(i4);
        this.f53019b.invalidate();
    }

    public void o(@q0 c.e eVar) {
        if (eVar == null) {
            this.f53023f = null;
        } else {
            c.e eVar2 = this.f53023f;
            if (eVar2 == null) {
                this.f53023f = new c.e(eVar);
            } else {
                eVar2.c(eVar);
            }
            if (z8.a.e(eVar.f53035c, i(eVar), 1.0E-4f)) {
                this.f53023f.f53035c = Float.MAX_VALUE;
            }
        }
        k();
    }
}
