package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.l;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.u0;
import l.a;

/* loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* renamed from: i, reason: collision with root package name */
    private static final int[] f2112i = {R.attr.colorBackground};

    /* renamed from: j, reason: collision with root package name */
    private static final e f2113j;

    /* renamed from: b, reason: collision with root package name */
    private boolean f2114b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f2115c;

    /* renamed from: d, reason: collision with root package name */
    int f2116d;

    /* renamed from: e, reason: collision with root package name */
    int f2117e;

    /* renamed from: f, reason: collision with root package name */
    final Rect f2118f;

    /* renamed from: g, reason: collision with root package name */
    final Rect f2119g;

    /* renamed from: h, reason: collision with root package name */
    private final d f2120h;

    class a implements d {

        /* renamed from: a, reason: collision with root package name */
        private Drawable f2121a;

        a() {
        }

        @Override // androidx.cardview.widget.d
        public void b(int i4, int i5, int i6, int i7) {
            CardView.this.f2119g.set(i4, i5, i6, i7);
            CardView cardView = CardView.this;
            Rect rect = cardView.f2118f;
            CardView.super.setPadding(i4 + rect.left, i5 + rect.top, i6 + rect.right, i7 + rect.bottom);
        }

        @Override // androidx.cardview.widget.d
        public void c(Drawable drawable) {
            this.f2121a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        @Override // androidx.cardview.widget.d
        public boolean d() {
            return CardView.this.y();
        }

        @Override // androidx.cardview.widget.d
        public Drawable e() {
            return this.f2121a;
        }

        @Override // androidx.cardview.widget.d
        public void f(int i4, int i5) {
            CardView cardView = CardView.this;
            if (i4 > cardView.f2116d) {
                CardView.super.setMinimumWidth(i4);
            }
            CardView cardView2 = CardView.this;
            if (i5 > cardView2.f2117e) {
                CardView.super.setMinimumHeight(i5);
            }
        }

        @Override // androidx.cardview.widget.d
        public boolean g() {
            return CardView.this.w();
        }

        @Override // androidx.cardview.widget.d
        public View h() {
            return CardView.this;
        }
    }

    static {
        b bVar = new b();
        f2113j = bVar;
        bVar.l();
    }

    public CardView(@o0 Context context) {
        this(context, null);
    }

    public void A(@q0 ColorStateList colorStateList) {
        f2113j.n(this.f2120h, colorStateList);
    }

    public void B(float f4) {
        f2113j.c(this.f2120h, f4);
    }

    public void C(@u0 int i4, @u0 int i5, @u0 int i6, @u0 int i7) {
        this.f2118f.set(i4, i5, i6, i7);
        f2113j.k(this.f2120h);
    }

    public void D(float f4) {
        f2113j.o(this.f2120h, f4);
    }

    public void E(boolean z4) {
        if (z4 != this.f2115c) {
            this.f2115c = z4;
            f2113j.g(this.f2120h);
        }
    }

    public void F(float f4) {
        f2113j.a(this.f2120h, f4);
    }

    public void G(boolean z4) {
        if (this.f2114b != z4) {
            this.f2114b = z4;
            f2113j.j(this.f2120h);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i4, int i5) {
        if (f2113j instanceof b) {
            super.onMeasure(i4, i5);
            return;
        }
        int mode = View.MeasureSpec.getMode(i4);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            i4 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.m(this.f2120h)), View.MeasureSpec.getSize(i4)), mode);
        }
        int mode2 = View.MeasureSpec.getMode(i5);
        if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
            i5 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.f(this.f2120h)), View.MeasureSpec.getSize(i5)), mode2);
        }
        super.onMeasure(i4, i5);
    }

    @o0
    public ColorStateList p() {
        return f2113j.e(this.f2120h);
    }

    public float q() {
        return f2113j.i(this.f2120h);
    }

    @u0
    public int r() {
        return this.f2118f.bottom;
    }

    @u0
    public int s() {
        return this.f2118f.left;
    }

    @Override // android.view.View
    public void setMinimumHeight(int i4) {
        this.f2117e = i4;
        super.setMinimumHeight(i4);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i4) {
        this.f2116d = i4;
        super.setMinimumWidth(i4);
    }

    @Override // android.view.View
    public void setPadding(int i4, int i5, int i6, int i7) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i4, int i5, int i6, int i7) {
    }

    @u0
    public int t() {
        return this.f2118f.right;
    }

    @u0
    public int u() {
        return this.f2118f.top;
    }

    public float v() {
        return f2113j.d(this.f2120h);
    }

    public boolean w() {
        return this.f2115c;
    }

    public float x() {
        return f2113j.b(this.f2120h);
    }

    public boolean y() {
        return this.f2114b;
    }

    public void z(@l int i4) {
        f2113j.n(this.f2120h, ColorStateList.valueOf(i4));
    }

    public CardView(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.C1268a.f81213g);
    }

    public CardView(@o0 Context context, @q0 AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        int color;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.f2118f = rect;
        this.f2119g = new Rect();
        a aVar = new a();
        this.f2120h = aVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.e.f81230a, i4, a.d.f81227b);
        int i5 = a.e.f81233d;
        if (obtainStyledAttributes.hasValue(i5)) {
            valueOf = obtainStyledAttributes.getColorStateList(i5);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f2112i);
            int color2 = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(a.b.f81220b);
            } else {
                color = getResources().getColor(a.b.f81219a);
            }
            valueOf = ColorStateList.valueOf(color);
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(a.e.f81234e, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(a.e.f81235f, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(a.e.f81236g, 0.0f);
        this.f2114b = obtainStyledAttributes.getBoolean(a.e.f81238i, false);
        this.f2115c = obtainStyledAttributes.getBoolean(a.e.f81237h, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(a.e.f81239j, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(a.e.f81241l, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(a.e.f81243n, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(a.e.f81242m, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(a.e.f81240k, dimensionPixelSize);
        float f4 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f2116d = obtainStyledAttributes.getDimensionPixelSize(a.e.f81231b, 0);
        this.f2117e = obtainStyledAttributes.getDimensionPixelSize(a.e.f81232c, 0);
        obtainStyledAttributes.recycle();
        f2113j.h(aVar, context, colorStateList, dimension, dimension2, f4);
    }
}
