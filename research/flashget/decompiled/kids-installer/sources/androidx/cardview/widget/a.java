package androidx.cardview.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.annotation.x0;
import androidx.cardview.widget.g;

/* compiled from: CardViewApi17Impl.java */
@x0(17)
/* loaded from: classes3.dex */
class a extends c {

    /* compiled from: CardViewApi17Impl.java */
    /* renamed from: androidx.cardview.widget.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class C0014a implements g.a {
        C0014a() {
        }

        @Override // androidx.cardview.widget.g.a
        public void a(Canvas canvas, RectF rectF, float f6, Paint paint) {
            canvas.drawRoundRect(rectF, f6, f6, paint);
        }
    }

    a() {
    }

    @Override // androidx.cardview.widget.c, androidx.cardview.widget.e
    public void j() {
        g.f1465s = new C0014a();
    }
}
