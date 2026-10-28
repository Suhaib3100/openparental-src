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
import i.a;

/* loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* renamed from: v, reason: collision with root package name */
    private static final int[] f1438v = {R.attr.colorBackground};

    /* renamed from: w, reason: collision with root package name */
    private static final e f1439w;

    /* renamed from: o, reason: collision with root package name */
    private boolean f1440o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f1441p;

    /* renamed from: q, reason: collision with root package name */
    int f1442q;

    /* renamed from: r, reason: collision with root package name */
    int f1443r;

    /* renamed from: s, reason: collision with root package name */
    final Rect f1444s;

    /* renamed from: t, reason: collision with root package name */
    final Rect f1445t;

    /* renamed from: u, reason: collision with root package name */
    private final d f1446u;

    /* loaded from: classes2.dex */
    class a implements d {

        /* renamed from: a, reason: collision with root package name */
        private Drawable f1447a;

        a() {
        }

        @Override // androidx.cardview.widget.d
        public void a(int i5, int i6, int i7, int i8) {
            CardView.this.f1445t.set(i5, i6, i7, i8);
            CardView cardView = CardView.this;
            Rect rect = cardView.f1444s;
            CardView.super.setPadding(i5 + rect.left, i6 + rect.top, i7 + rect.right, i8 + rect.bottom);
        }

        @Override // androidx.cardview.widget.d
        public void b(int i5, int i6) {
            CardView cardView = CardView.this;
            if (i5 > cardView.f1442q) {
                CardView.super.setMinimumWidth(i5);
            }
            CardView cardView2 = CardView.this;
            if (i6 > cardView2.f1443r) {
                CardView.super.setMinimumHeight(i6);
            }
        }

        @Override // androidx.cardview.widget.d
        public void c(Drawable drawable) {
            this.f1447a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        @Override // androidx.cardview.widget.d
        public boolean d() {
            return CardView.this.w();
        }

        @Override // androidx.cardview.widget.d
        public boolean e() {
            return CardView.this.y();
        }

        @Override // androidx.cardview.widget.d
        public Drawable f() {
            return this.f1447a;
        }

        @Override // androidx.cardview.widget.d
        public View g() {
            return CardView.this;
        }
    }

    static {
        b bVar = new b();
        f1439w = bVar;
        bVar.j();
    }

    public CardView(@o0 Context context) {
        this(context, null);
    }

    public void A(@q0 ColorStateList colorStateList) {
        f1439w.n(this.f1446u, colorStateList);
    }

    public void B(float f6) {
        f1439w.f(this.f1446u, f6);
    }

    public void C(@u0 int i5, @u0 int i6, @u0 int i7, @u0 int i8) {
        this.f1444s.set(i5, i6, i7, i8);
        f1439w.i(this.f1446u);
    }

    public void D(float f6) {
        f1439w.o(this.f1446u, f6);
    }

    public void E(boolean z5) {
        if (z5 != this.f1441p) {
            this.f1441p = z5;
            f1439w.m(this.f1446u);
        }
    }

    public void F(float f6) {
        f1439w.b(this.f1446u, f6);
    }

    public void G(boolean z5) {
        if (this.f1440o != z5) {
            this.f1440o = z5;
            f1439w.e(this.f1446u);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i5, int i6) {
        if (f1439w instanceof b) {
            super.onMeasure(i5, i6);
            return;
        }
        int mode = View.MeasureSpec.getMode(i5);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            i5 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.l(this.f1446u)), View.MeasureSpec.getSize(i5)), mode);
        }
        int mode2 = View.MeasureSpec.getMode(i6);
        if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
            i6 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.k(this.f1446u)), View.MeasureSpec.getSize(i6)), mode2);
        }
        super.onMeasure(i5, i6);
    }

    @o0
    public ColorStateList p() {
        return f1439w.h(this.f1446u);
    }

    public float q() {
        return f1439w.c(this.f1446u);
    }

    @u0
    public int r() {
        return this.f1444s.bottom;
    }

    @u0
    public int s() {
        return this.f1444s.left;
    }

    @Override // android.view.View
    public void setMinimumHeight(int i5) {
        this.f1443r = i5;
        super.setMinimumHeight(i5);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i5) {
        this.f1442q = i5;
        super.setMinimumWidth(i5);
    }

    @Override // android.view.View
    public void setPadding(int i5, int i6, int i7, int i8) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i5, int i6, int i7, int i8) {
    }

    @u0
    public int t() {
        return this.f1444s.right;
    }

    @u0
    public int u() {
        return this.f1444s.top;
    }

    public float v() {
        return f1439w.g(this.f1446u);
    }

    public boolean w() {
        return this.f1441p;
    }

    public float x() {
        return f1439w.d(this.f1446u);
    }

    public boolean y() {
        return this.f1440o;
    }

    public void z(@l int i5) {
        f1439w.n(this.f1446u, ColorStateList.valueOf(i5));
    }

    public CardView(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.C0247a.f22732g);
    }

    public CardView(@o0 Context context, @q0 AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        int color;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.f1444s = rect;
        this.f1445t = new Rect();
        a aVar = new a();
        this.f1446u = aVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.e.f22749a, i5, a.d.f22746b);
        int i6 = a.e.f22752d;
        if (obtainStyledAttributes.hasValue(i6)) {
            valueOf = obtainStyledAttributes.getColorStateList(i6);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f1438v);
            int color2 = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(a.b.f22739b);
            } else {
                color = getResources().getColor(a.b.f22738a);
            }
            valueOf = ColorStateList.valueOf(color);
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(a.e.f22753e, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(a.e.f22754f, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(a.e.f22755g, 0.0f);
        this.f1440o = obtainStyledAttributes.getBoolean(a.e.f22757i, false);
        this.f1441p = obtainStyledAttributes.getBoolean(a.e.f22756h, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(a.e.f22758j, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(a.e.f22760l, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(a.e.f22762n, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(a.e.f22761m, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(a.e.f22759k, dimensionPixelSize);
        float f6 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f1442q = obtainStyledAttributes.getDimensionPixelSize(a.e.f22750b, 0);
        this.f1443r = obtainStyledAttributes.getDimensionPixelSize(a.e.f22751c, 0);
        obtainStyledAttributes.recycle();
        f1439w.a(aVar, context, colorStateList, dimension, dimension2, f6);
    }
}
