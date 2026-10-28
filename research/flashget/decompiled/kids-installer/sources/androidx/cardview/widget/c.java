package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.q0;
import androidx.cardview.widget.g;

/* compiled from: CardViewBaseImpl.java */
/* loaded from: classes2.dex */
class c implements e {

    /* renamed from: a, reason: collision with root package name */
    final RectF f1450a = new RectF();

    /* compiled from: CardViewBaseImpl.java */
    class a implements g.a {
        a() {
        }

        @Override // androidx.cardview.widget.g.a
        public void a(Canvas canvas, RectF rectF, float f6, Paint paint) {
            float f7 = 2.0f * f6;
            float width = (rectF.width() - f7) - 1.0f;
            float height = (rectF.height() - f7) - 1.0f;
            if (f6 >= 1.0f) {
                float f8 = f6 + 0.5f;
                float f9 = -f8;
                c.this.f1450a.set(f9, f9, f8, f8);
                int save = canvas.save();
                canvas.translate(rectF.left + f8, rectF.top + f8);
                canvas.drawArc(c.this.f1450a, 180.0f, 90.0f, true, paint);
                canvas.translate(width, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(c.this.f1450a, 180.0f, 90.0f, true, paint);
                canvas.translate(height, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(c.this.f1450a, 180.0f, 90.0f, true, paint);
                canvas.translate(width, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(c.this.f1450a, 180.0f, 90.0f, true, paint);
                canvas.restoreToCount(save);
                float f10 = (rectF.left + f8) - 1.0f;
                float f11 = rectF.top;
                canvas.drawRect(f10, f11, (rectF.right - f8) + 1.0f, f11 + f8, paint);
                float f12 = (rectF.left + f8) - 1.0f;
                float f13 = rectF.bottom;
                canvas.drawRect(f12, f13 - f8, (rectF.right - f8) + 1.0f, f13, paint);
            }
            canvas.drawRect(rectF.left, rectF.top + f6, rectF.right, rectF.bottom - f6, paint);
        }
    }

    c() {
    }

    private g p(Context context, ColorStateList colorStateList, float f6, float f7, float f8) {
        return new g(context.getResources(), colorStateList, f6, f7, f8);
    }

    private g q(d dVar) {
        return (g) dVar.f();
    }

    @Override // androidx.cardview.widget.e
    public void a(d dVar, Context context, ColorStateList colorStateList, float f6, float f7, float f8) {
        g p5 = p(context, colorStateList, f6, f7, f8);
        p5.m(dVar.d());
        dVar.c(p5);
        i(dVar);
    }

    @Override // androidx.cardview.widget.e
    public void b(d dVar, float f6) {
        q(dVar).p(f6);
        i(dVar);
    }

    @Override // androidx.cardview.widget.e
    public float c(d dVar) {
        return q(dVar).l();
    }

    @Override // androidx.cardview.widget.e
    public float d(d dVar) {
        return q(dVar).g();
    }

    @Override // androidx.cardview.widget.e
    public void e(d dVar) {
    }

    @Override // androidx.cardview.widget.e
    public void f(d dVar, float f6) {
        q(dVar).r(f6);
    }

    @Override // androidx.cardview.widget.e
    public float g(d dVar) {
        return q(dVar).i();
    }

    @Override // androidx.cardview.widget.e
    public ColorStateList h(d dVar) {
        return q(dVar).f();
    }

    @Override // androidx.cardview.widget.e
    public void i(d dVar) {
        Rect rect = new Rect();
        q(dVar).h(rect);
        dVar.b((int) Math.ceil(l(dVar)), (int) Math.ceil(k(dVar)));
        dVar.a(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // androidx.cardview.widget.e
    public void j() {
        g.f1465s = new a();
    }

    @Override // androidx.cardview.widget.e
    public float k(d dVar) {
        return q(dVar).j();
    }

    @Override // androidx.cardview.widget.e
    public float l(d dVar) {
        return q(dVar).k();
    }

    @Override // androidx.cardview.widget.e
    public void m(d dVar) {
        q(dVar).m(dVar.d());
        i(dVar);
    }

    @Override // androidx.cardview.widget.e
    public void n(d dVar, @q0 ColorStateList colorStateList) {
        q(dVar).o(colorStateList);
    }

    @Override // androidx.cardview.widget.e
    public void o(d dVar, float f6) {
        q(dVar).q(f6);
        i(dVar);
    }
}
