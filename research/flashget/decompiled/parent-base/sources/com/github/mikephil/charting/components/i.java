package com.github.mikephil.charting.components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.data.Entry;
import java.lang.ref.WeakReference;

/* compiled from: MarkerView.java */
/* loaded from: classes5.dex */
public class i extends RelativeLayout implements d {

    /* renamed from: b, reason: collision with root package name */
    private com.github.mikephil.charting.utils.g f50339b;

    /* renamed from: c, reason: collision with root package name */
    private com.github.mikephil.charting.utils.g f50340c;

    /* renamed from: d, reason: collision with root package name */
    private WeakReference<Chart> f50341d;

    public i(Context context, int i4) {
        super(context);
        this.f50339b = new com.github.mikephil.charting.utils.g();
        this.f50340c = new com.github.mikephil.charting.utils.g();
        h(i4);
    }

    private void h(int i4) {
        View inflate = LayoutInflater.from(getContext()).inflate(i4, this);
        inflate.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        inflate.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        inflate.layout(0, 0, inflate.getMeasuredWidth(), inflate.getMeasuredHeight());
    }

    @Override // com.github.mikephil.charting.components.d
    public void a(Canvas canvas, float f4, float f5) {
        com.github.mikephil.charting.utils.g b5 = b(f4, f5);
        int save = canvas.save();
        canvas.translate(f4 + b5.f50636d, f5 + b5.f50637e);
        draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // com.github.mikephil.charting.components.d
    public com.github.mikephil.charting.utils.g b(float f4, float f5) {
        com.github.mikephil.charting.utils.g offset = getOffset();
        com.github.mikephil.charting.utils.g gVar = this.f50340c;
        gVar.f50636d = offset.f50636d;
        gVar.f50637e = offset.f50637e;
        Chart d5 = d();
        float width = getWidth();
        float height = getHeight();
        com.github.mikephil.charting.utils.g gVar2 = this.f50340c;
        float f6 = gVar2.f50636d;
        if (f4 + f6 < 0.0f) {
            gVar2.f50636d = -f4;
        } else if (d5 != null && f4 + width + f6 > d5.getWidth()) {
            this.f50340c.f50636d = (d5.getWidth() - f4) - width;
        }
        com.github.mikephil.charting.utils.g gVar3 = this.f50340c;
        float f7 = gVar3.f50637e;
        if (f5 + f7 < 0.0f) {
            gVar3.f50637e = -f5;
        } else if (d5 != null && f5 + height + f7 > d5.getHeight()) {
            this.f50340c.f50637e = (d5.getHeight() - f5) - height;
        }
        return this.f50340c;
    }

    @Override // com.github.mikephil.charting.components.d
    public void c(Entry entry, com.github.mikephil.charting.highlight.d dVar) {
        measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    public Chart d() {
        WeakReference<Chart> weakReference = this.f50341d;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public void e(Chart chart) {
        this.f50341d = new WeakReference<>(chart);
    }

    public void f(float f4, float f5) {
        com.github.mikephil.charting.utils.g gVar = this.f50339b;
        gVar.f50636d = f4;
        gVar.f50637e = f5;
    }

    public void g(com.github.mikephil.charting.utils.g gVar) {
        this.f50339b = gVar;
        if (gVar == null) {
            this.f50339b = new com.github.mikephil.charting.utils.g();
        }
    }

    @Override // com.github.mikephil.charting.components.d
    public com.github.mikephil.charting.utils.g getOffset() {
        return this.f50339b;
    }
}
