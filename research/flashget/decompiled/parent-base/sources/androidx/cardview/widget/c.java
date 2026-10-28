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
/* loaded from: classes.dex */
class c implements e {

    /* renamed from: a, reason: collision with root package name */
    final RectF f2124a = new RectF();

    /* compiled from: CardViewBaseImpl.java */
    class a implements g.a {
        a() {
        }

        @Override // androidx.cardview.widget.g.a
        public void a(Canvas canvas, RectF rectF, float f4, Paint paint) {
            float f5 = 2.0f * f4;
            float width = (rectF.width() - f5) - 1.0f;
            float height = (rectF.height() - f5) - 1.0f;
            if (f4 >= 1.0f) {
                float f6 = f4 + 0.5f;
                float f7 = -f6;
                c.this.f2124a.set(f7, f7, f6, f6);
                int save = canvas.save();
                canvas.translate(rectF.left + f6, rectF.top + f6);
                canvas.drawArc(c.this.f2124a, 180.0f, 90.0f, true, paint);
                canvas.translate(width, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(c.this.f2124a, 180.0f, 90.0f, true, paint);
                canvas.translate(height, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(c.this.f2124a, 180.0f, 90.0f, true, paint);
                canvas.translate(width, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(c.this.f2124a, 180.0f, 90.0f, true, paint);
                canvas.restoreToCount(save);
                float f10 = (rectF.left + f6) - 1.0f;
                float f11 = rectF.top;
                canvas.drawRect(f10, f11, (rectF.right - f6) + 1.0f, f11 + f6, paint);
                float f12 = (rectF.left + f6) - 1.0f;
                float f13 = rectF.bottom;
                canvas.drawRect(f12, f13 - f6, (rectF.right - f6) + 1.0f, f13, paint);
            }
            canvas.drawRect(rectF.left, rectF.top + f4, rectF.right, rectF.bottom - f4, paint);
        }
    }

    c() {
    }

    private g p(Context context, ColorStateList colorStateList, float f4, float f5, float f6) {
        return new g(context.getResources(), colorStateList, f4, f5, f6);
    }

    private g q(d dVar) {
        return (g) dVar.e();
    }

    @Override // androidx.cardview.widget.e
    public void a(d dVar, float f4) {
        ((g) dVar.e()).p(f4);
        k(dVar);
    }

    @Override // androidx.cardview.widget.e
    public float b(d dVar) {
        return ((g) dVar.e()).g();
    }

    @Override // androidx.cardview.widget.e
    public void c(d dVar, float f4) {
        ((g) dVar.e()).r(f4);
    }

    @Override // androidx.cardview.widget.e
    public float d(d dVar) {
        return ((g) dVar.e()).i();
    }

    @Override // androidx.cardview.widget.e
    public ColorStateList e(d dVar) {
        return ((g) dVar.e()).f();
    }

    @Override // androidx.cardview.widget.e
    public float f(d dVar) {
        return ((g) dVar.e()).j();
    }

    @Override // androidx.cardview.widget.e
    public void g(d dVar) {
        ((g) dVar.e()).m(dVar.g());
        k(dVar);
    }

    @Override // androidx.cardview.widget.e
    public void h(d dVar, Context context, ColorStateList colorStateList, float f4, float f5, float f6) {
        g p4 = p(context, colorStateList, f4, f5, f6);
        p4.m(dVar.g());
        dVar.c(p4);
        k(dVar);
    }

    @Override // androidx.cardview.widget.e
    public float i(d dVar) {
        return ((g) dVar.e()).l();
    }

    @Override // androidx.cardview.widget.e
    public void j(d dVar) {
    }

    @Override // androidx.cardview.widget.e
    public void k(d dVar) {
        Rect rect = new Rect();
        ((g) dVar.e()).h(rect);
        dVar.f((int) Math.ceil(m(dVar)), (int) Math.ceil(f(dVar)));
        dVar.b(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // androidx.cardview.widget.e
    public void l() {
        g.f2139s = new a();
    }

    @Override // androidx.cardview.widget.e
    public float m(d dVar) {
        return ((g) dVar.e()).k();
    }

    @Override // androidx.cardview.widget.e
    public void n(d dVar, @q0 ColorStateList colorStateList) {
        ((g) dVar.e()).o(colorStateList);
    }

    @Override // androidx.cardview.widget.e
    public void o(d dVar, float f4) {
        ((g) dVar.e()).q(f4);
        k(dVar);
    }
}
