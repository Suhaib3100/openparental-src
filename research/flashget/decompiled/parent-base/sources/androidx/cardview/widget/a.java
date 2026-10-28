package androidx.cardview.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.annotation.x0;
import androidx.cardview.widget.g;

/* compiled from: CardViewApi17Impl.java */
@x0(17)
/* loaded from: classes.dex */
class a extends c {

    /* compiled from: CardViewApi17Impl.java */
    /* renamed from: androidx.cardview.widget.a$a, reason: collision with other inner class name */
    class C0023a implements g.a {
        C0023a() {
        }

        @Override // androidx.cardview.widget.g.a
        public void a(Canvas canvas, RectF rectF, float f4, Paint paint) {
            canvas.drawRoundRect(rectF, f4, f4, paint);
        }
    }

    a() {
    }

    @Override // androidx.cardview.widget.c, androidx.cardview.widget.e
    public void l() {
        g.f2139s = new C0023a();
    }
}
