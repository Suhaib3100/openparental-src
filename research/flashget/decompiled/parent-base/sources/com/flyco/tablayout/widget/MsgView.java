package com.flyco.tablayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.flyco.tablayout.b;

/* loaded from: classes5.dex */
public class MsgView extends TextView {

    /* renamed from: b, reason: collision with root package name */
    private Context f50107b;

    /* renamed from: c, reason: collision with root package name */
    private GradientDrawable f50108c;

    /* renamed from: d, reason: collision with root package name */
    private int f50109d;

    /* renamed from: e, reason: collision with root package name */
    private int f50110e;

    /* renamed from: f, reason: collision with root package name */
    private int f50111f;

    /* renamed from: g, reason: collision with root package name */
    private int f50112g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f50113h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f50114i;

    public MsgView(Context context) {
        this(context, null);
    }

    private void h(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.m.y6);
        this.f50109d = obtainStyledAttributes.getColor(b.m.z6, 0);
        this.f50110e = obtainStyledAttributes.getDimensionPixelSize(b.m.A6, 0);
        this.f50111f = obtainStyledAttributes.getDimensionPixelSize(b.m.E6, 0);
        this.f50112g = obtainStyledAttributes.getColor(b.m.D6, 0);
        this.f50113h = obtainStyledAttributes.getBoolean(b.m.B6, false);
        this.f50114i = obtainStyledAttributes.getBoolean(b.m.C6, false);
        obtainStyledAttributes.recycle();
    }

    private void k(GradientDrawable gradientDrawable, int i4, int i5) {
        gradientDrawable.setColor(i4);
        gradientDrawable.setCornerRadius(this.f50110e);
        gradientDrawable.setStroke(this.f50111f, i5);
    }

    protected int a(float f4) {
        return (int) ((f4 * this.f50107b.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public int b() {
        return this.f50109d;
    }

    public int c() {
        return this.f50110e;
    }

    public int d() {
        return this.f50112g;
    }

    public int e() {
        return this.f50111f;
    }

    public boolean f() {
        return this.f50113h;
    }

    public boolean g() {
        return this.f50114i;
    }

    public void i() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        k(this.f50108c, this.f50109d, this.f50112g);
        stateListDrawable.addState(new int[]{-16842919}, this.f50108c);
        setBackground(stateListDrawable);
    }

    public void j(int i4) {
        this.f50110e = a(i4);
        i();
    }

    public void l(boolean z4) {
        this.f50113h = z4;
        i();
    }

    public void m(boolean z4) {
        this.f50114i = z4;
        i();
    }

    public void n(int i4) {
        this.f50112g = i4;
        i();
    }

    public void o(int i4) {
        this.f50111f = a(i4);
        i();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        if (f()) {
            j(getHeight() / 2);
        } else {
            i();
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i4, int i5) {
        if (!g() || getWidth() <= 0 || getHeight() <= 0) {
            super.onMeasure(i4, i5);
        } else {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(getWidth(), getHeight()), 1073741824);
            super.onMeasure(makeMeasureSpec, makeMeasureSpec);
        }
    }

    protected int p(float f4) {
        return (int) ((f4 * this.f50107b.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i4) {
        this.f50109d = i4;
        i();
    }

    public MsgView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MsgView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f50108c = new GradientDrawable();
        this.f50107b = context;
        h(context, attributeSet);
    }
}
