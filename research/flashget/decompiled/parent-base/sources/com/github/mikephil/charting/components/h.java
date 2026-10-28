package com.github.mikephil.charting.components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.data.Entry;
import java.lang.ref.WeakReference;

/* compiled from: MarkerImage.java */
/* loaded from: classes5.dex */
public class h implements d {

    /* renamed from: b, reason: collision with root package name */
    private Context f50332b;

    /* renamed from: c, reason: collision with root package name */
    private Drawable f50333c;

    /* renamed from: f, reason: collision with root package name */
    private WeakReference<Chart> f50336f;

    /* renamed from: d, reason: collision with root package name */
    private com.github.mikephil.charting.utils.g f50334d = new com.github.mikephil.charting.utils.g();

    /* renamed from: e, reason: collision with root package name */
    private com.github.mikephil.charting.utils.g f50335e = new com.github.mikephil.charting.utils.g();

    /* renamed from: g, reason: collision with root package name */
    private com.github.mikephil.charting.utils.c f50337g = new com.github.mikephil.charting.utils.c();

    /* renamed from: h, reason: collision with root package name */
    private Rect f50338h = new Rect();

    public h(Context context, int i4) {
        this.f50332b = context;
        this.f50333c = context.getResources().getDrawable(i4, null);
    }

    @Override // com.github.mikephil.charting.components.d
    public void a(Canvas canvas, float f4, float f5) {
        if (this.f50333c == null) {
            return;
        }
        com.github.mikephil.charting.utils.g b5 = b(f4, f5);
        com.github.mikephil.charting.utils.c cVar = this.f50337g;
        float f6 = cVar.f50628d;
        float f7 = cVar.f50629e;
        if (f6 == 0.0f) {
            f6 = this.f50333c.getIntrinsicWidth();
        }
        if (f7 == 0.0f) {
            f7 = this.f50333c.getIntrinsicHeight();
        }
        this.f50333c.copyBounds(this.f50338h);
        Drawable drawable = this.f50333c;
        Rect rect = this.f50338h;
        int i4 = rect.left;
        int i5 = rect.top;
        drawable.setBounds(i4, i5, ((int) f6) + i4, ((int) f7) + i5);
        int save = canvas.save();
        canvas.translate(f4 + b5.f50636d, f5 + b5.f50637e);
        this.f50333c.draw(canvas);
        canvas.restoreToCount(save);
        this.f50333c.setBounds(this.f50338h);
    }

    @Override // com.github.mikephil.charting.components.d
    public com.github.mikephil.charting.utils.g b(float f4, float f5) {
        Drawable drawable;
        Drawable drawable2;
        com.github.mikephil.charting.utils.g offset = getOffset();
        com.github.mikephil.charting.utils.g gVar = this.f50335e;
        gVar.f50636d = offset.f50636d;
        gVar.f50637e = offset.f50637e;
        Chart d5 = d();
        com.github.mikephil.charting.utils.c cVar = this.f50337g;
        float f6 = cVar.f50628d;
        float f7 = cVar.f50629e;
        if (f6 == 0.0f && (drawable2 = this.f50333c) != null) {
            f6 = drawable2.getIntrinsicWidth();
        }
        if (f7 == 0.0f && (drawable = this.f50333c) != null) {
            f7 = drawable.getIntrinsicHeight();
        }
        com.github.mikephil.charting.utils.g gVar2 = this.f50335e;
        float f10 = gVar2.f50636d;
        if (f4 + f10 < 0.0f) {
            gVar2.f50636d = -f4;
        } else if (d5 != null && f4 + f6 + f10 > d5.getWidth()) {
            this.f50335e.f50636d = (d5.getWidth() - f4) - f6;
        }
        com.github.mikephil.charting.utils.g gVar3 = this.f50335e;
        float f11 = gVar3.f50637e;
        if (f5 + f11 < 0.0f) {
            gVar3.f50637e = -f5;
        } else if (d5 != null && f5 + f7 + f11 > d5.getHeight()) {
            this.f50335e.f50637e = (d5.getHeight() - f5) - f7;
        }
        return this.f50335e;
    }

    @Override // com.github.mikephil.charting.components.d
    public void c(Entry entry, com.github.mikephil.charting.highlight.d dVar) {
    }

    public Chart d() {
        WeakReference<Chart> weakReference = this.f50336f;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public com.github.mikephil.charting.utils.c e() {
        return this.f50337g;
    }

    public void f(Chart chart) {
        this.f50336f = new WeakReference<>(chart);
    }

    public void g(float f4, float f5) {
        com.github.mikephil.charting.utils.g gVar = this.f50334d;
        gVar.f50636d = f4;
        gVar.f50637e = f5;
    }

    @Override // com.github.mikephil.charting.components.d
    public com.github.mikephil.charting.utils.g getOffset() {
        return this.f50334d;
    }

    public void h(com.github.mikephil.charting.utils.g gVar) {
        this.f50334d = gVar;
        if (gVar == null) {
            this.f50334d = new com.github.mikephil.charting.utils.g();
        }
    }

    public void i(com.github.mikephil.charting.utils.c cVar) {
        this.f50337g = cVar;
        if (cVar == null) {
            this.f50337g = new com.github.mikephil.charting.utils.c();
        }
    }
}
