package com.flyco.tablayout;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.graphics.drawable.d;
import androidx.viewpager2.widget.ViewPager2;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.flyco.tablayout.b;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public class DiyTabLayout extends HorizontalScrollView {
    private static final int M2 = 0;
    private static final int N2 = 1;
    private static final int O2 = 2;
    private static final int P2 = 0;
    private static final int Q2 = 1;
    private static final int R2 = 2;
    private float A;
    private float B;
    private int C;
    private boolean D;
    private int E;
    private float F;
    private int G;
    private int H;
    private float I;
    private float J;
    private int K;
    private int L;
    private b8.b L2;
    private c M;
    private int N;
    private boolean O;
    private int P;
    private int Q;
    private float Q1;
    private boolean R;
    private Paint V1;

    /* renamed from: b, reason: collision with root package name */
    private Context f49163b;

    /* renamed from: c, reason: collision with root package name */
    private ViewPager2 f49164c;

    /* renamed from: d, reason: collision with root package name */
    private List<c> f49165d;

    /* renamed from: e, reason: collision with root package name */
    private LinearLayout f49166e;

    /* renamed from: f, reason: collision with root package name */
    private ViewPager2.j f49167f;

    /* renamed from: g, reason: collision with root package name */
    private int f49168g;

    /* renamed from: h, reason: collision with root package name */
    private float f49169h;

    /* renamed from: i, reason: collision with root package name */
    private int f49170i;

    /* renamed from: j, reason: collision with root package name */
    private Rect f49171j;

    /* renamed from: k, reason: collision with root package name */
    private Rect f49172k;

    /* renamed from: l, reason: collision with root package name */
    private GradientDrawable f49173l;

    /* renamed from: m, reason: collision with root package name */
    private Paint f49174m;

    /* renamed from: n, reason: collision with root package name */
    private Paint f49175n;

    /* renamed from: o, reason: collision with root package name */
    private Paint f49176o;

    /* renamed from: p, reason: collision with root package name */
    private Path f49177p;

    /* renamed from: q, reason: collision with root package name */
    private int f49178q;

    /* renamed from: r, reason: collision with root package name */
    private float f49179r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f49180s;

    /* renamed from: t, reason: collision with root package name */
    private float f49181t;

    /* renamed from: u, reason: collision with root package name */
    private int f49182u;

    /* renamed from: v, reason: collision with root package name */
    private float f49183v;

    /* renamed from: w, reason: collision with root package name */
    private float f49184w;

    /* renamed from: x, reason: collision with root package name */
    private float f49185x;

    /* renamed from: y, reason: collision with root package name */
    private float f49186y;

    /* renamed from: z, reason: collision with root package name */
    private float f49187z;

    class a extends ViewPager2.j {
        a() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.j
        public void onPageScrolled(int i4, float f4, int i5) {
            super.onPageScrolled(i4, f4, i5);
            DiyTabLayout.this.f49168g = i4;
            DiyTabLayout.this.f49169h = f4;
            DiyTabLayout.this.t();
            DiyTabLayout.this.invalidate();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.j
        public void onPageSelected(int i4) {
            super.onPageSelected(i4);
            DiyTabLayout.this.H(i4);
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int indexOfChild = DiyTabLayout.this.f49166e.indexOfChild(view);
            if (indexOfChild == -1 || DiyTabLayout.this.f49164c.h() == indexOfChild) {
                return;
            }
            if (DiyTabLayout.this.R) {
                DiyTabLayout.this.f49164c.B(indexOfChild, false);
            } else {
                DiyTabLayout.this.f49164c.B(indexOfChild, false);
            }
        }
    }

    public DiyTabLayout(Context context) {
        this(context, null, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H(int i4) {
        int i5 = 0;
        while (i5 < this.f49170i) {
            View childAt = this.f49166e.getChildAt(i5);
            TextView textView = (TextView) childAt.findViewById(b.g.X1);
            ImageView imageView = (ImageView) childAt.findViewById(b.g.I0);
            imageView.setColorFilter(s(this.f49165d.get(i5).a(), this.M.a()));
            if (textView != null) {
                int s4 = s(this.f49165d.get(i5).c(), this.M.c());
                int s5 = s(this.f49165d.get(i5).d(), this.M.d());
                imageView.setVisibility(i5 == i4 ? 0 : 8);
                if (i5 == i4) {
                    s4 = s5;
                }
                textView.setTextColor(s4);
                textView.setTextSize(0, i5 == i4 ? this.L : this.K);
                float f4 = this.f49179r;
                textView.setPadding((int) f4, 0, (int) f4, 0);
                if (this.O) {
                    textView.setText(textView.getText().toString().toUpperCase());
                }
                int i6 = this.N;
                if (i6 == 2) {
                    textView.getPaint().setFakeBoldText(true);
                } else if (i6 == 0) {
                    textView.getPaint().setFakeBoldText(false);
                }
            }
            i5++;
        }
    }

    private void h(int i4, List<c> list, View view) {
        TextView textView = (TextView) view.findViewById(b.g.X1);
        if (textView != null && list != null) {
            textView.setText(list.get(i4).b());
            if (list.size() > 0 && list.size() > i4) {
                textView.setTextColor(s(list.get(i4).c(), this.M.c()));
            }
        }
        view.setOnClickListener(new b());
        LinearLayout.LayoutParams layoutParams = this.f49180s ? new LinearLayout.LayoutParams(0, -1, 1.0f) : new LinearLayout.LayoutParams(-2, -1);
        if (this.f49181t > 0.0f) {
            layoutParams = new LinearLayout.LayoutParams((int) this.f49181t, -1);
        }
        this.f49166e.addView(view, i4, layoutParams);
    }

    private void i() {
        View childAt = this.f49166e.getChildAt(this.f49168g);
        float left = childAt.getLeft();
        float right = childAt.getRight();
        if (this.f49178q == 0 && this.D) {
            TextView textView = (TextView) childAt.findViewById(b.g.X1);
            this.V1.setTextSize(this.K);
            this.Q1 = ((right - left) - this.V1.measureText(textView.getText().toString())) / 2.0f;
        }
        int i4 = this.f49168g;
        if (i4 < this.f49170i - 1) {
            View childAt2 = this.f49166e.getChildAt(i4 + 1);
            float left2 = childAt2.getLeft();
            float right2 = childAt2.getRight();
            float f4 = this.f49169h;
            left = d.a(left2, left, f4, left);
            right = d.a(right2, right, f4, right);
            if (this.f49178q == 0 && this.D) {
                TextView textView2 = (TextView) childAt2.findViewById(b.g.X1);
                this.V1.setTextSize(this.K);
                float measureText = ((right2 - left2) - this.V1.measureText(textView2.getText().toString())) / 2.0f;
                float f5 = this.Q1;
                this.Q1 = d.a(measureText, f5, this.f49169h, f5);
            }
        }
        Rect rect = this.f49171j;
        int i5 = (int) left;
        rect.left = i5;
        int i6 = (int) right;
        rect.right = i6;
        if (this.f49178q == 0 && this.D) {
            float f6 = this.Q1;
            rect.left = (int) ((left + f6) - 1.0f);
            rect.right = (int) ((right - f6) - 1.0f);
        }
        Rect rect2 = this.f49172k;
        rect2.left = i5;
        rect2.right = i6;
        if (this.f49184w < 0.0f) {
            return;
        }
        float width = ((childAt.getWidth() - this.f49184w) / 2.0f) + childAt.getLeft();
        int i7 = this.f49168g;
        if (i7 < this.f49170i - 1) {
            View childAt3 = this.f49166e.getChildAt(i7 + 1);
            width += this.f49169h * ((childAt3.getWidth() / 2) + (childAt.getWidth() / 2));
        }
        Rect rect3 = this.f49171j;
        int i10 = (int) width;
        rect3.left = i10;
        rect3.right = (int) (i10 + this.f49184w);
    }

    private void r(Context context, AttributeSet attributeSet) {
        float f4;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.m.f49996m8);
        int i4 = obtainStyledAttributes.getInt(b.m.f50092y8, 0);
        this.f49178q = i4;
        this.f49182u = obtainStyledAttributes.getColor(b.m.f50028q8, Color.parseColor(i4 == 2 ? ProtectedSandApp.s("쌣") : ProtectedSandApp.s("쌤")));
        int i5 = b.m.f50052t8;
        int i6 = this.f49178q;
        if (i6 == 1) {
            f4 = 4.0f;
        } else {
            f4 = i6 == 2 ? -1 : 2;
        }
        this.f49183v = obtainStyledAttributes.getDimension(i5, j(f4));
        this.f49184w = obtainStyledAttributes.getDimension(b.m.f50100z8, j(this.f49178q == 1 ? 10.0f : -1.0f));
        this.f49185x = obtainStyledAttributes.getDimension(b.m.f50036r8, j(this.f49178q == 2 ? -1.0f : 0.0f));
        this.f49186y = obtainStyledAttributes.getDimension(b.m.f50068v8, j(0.0f));
        this.f49187z = obtainStyledAttributes.getDimension(b.m.f50084x8, j(this.f49178q == 2 ? 7.0f : 0.0f));
        this.A = obtainStyledAttributes.getDimension(b.m.f50076w8, j(0.0f));
        this.B = obtainStyledAttributes.getDimension(b.m.f50060u8, j(this.f49178q != 2 ? 0.0f : 7.0f));
        this.C = obtainStyledAttributes.getInt(b.m.f50044s8, 80);
        this.D = obtainStyledAttributes.getBoolean(b.m.A8, false);
        int i7 = b.m.K8;
        Resources resources = context.getResources();
        int i10 = b.d.M;
        this.E = obtainStyledAttributes.getColor(i7, resources.getColor(i10));
        this.F = obtainStyledAttributes.getDimension(b.m.M8, j(0.0f));
        this.G = obtainStyledAttributes.getInt(b.m.L8, 80);
        this.H = obtainStyledAttributes.getColor(b.m.f50004n8, context.getResources().getColor(i10));
        this.I = obtainStyledAttributes.getDimension(b.m.f50020p8, j(0.0f));
        this.J = obtainStyledAttributes.getDimension(b.m.f50012o8, j(12.0f));
        this.K = (int) obtainStyledAttributes.getDimension(b.m.J8, G(15.0f));
        this.L = (int) obtainStyledAttributes.getDimension(b.m.H8, G(14.0f));
        this.N = obtainStyledAttributes.getInt(b.m.F8, 1);
        this.O = obtainStyledAttributes.getBoolean(b.m.E8, false);
        this.f49180s = obtainStyledAttributes.getBoolean(b.m.C8, false);
        float dimension = obtainStyledAttributes.getDimension(b.m.D8, j(-1.0f));
        this.f49181t = dimension;
        this.f49179r = obtainStyledAttributes.getDimension(b.m.B8, (this.f49180s || dimension > 0.0f) ? j(0.0f) : j(8.0f));
        obtainStyledAttributes.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        LinearLayout linearLayout;
        if (this.f49170i <= 0 || (linearLayout = this.f49166e) == null) {
            return;
        }
        int width = (int) (this.f49169h * linearLayout.getChildAt(this.f49168g).getWidth());
        int left = this.f49166e.getChildAt(this.f49168g).getLeft() + width;
        if (this.f49168g > 0 || width > 0) {
            int width2 = left - ((getWidth() / 2) - getPaddingLeft());
            i();
            Rect rect = this.f49172k;
            left = androidx.appcompat.widget.a.a(rect.right, rect.left, 2, width2);
        }
        if (left != this.P) {
            this.P = left;
            scrollTo(left, 0);
        }
    }

    public void A(boolean z4) {
        this.R = z4;
    }

    public void B(int i4) {
        this.L = G(i4);
    }

    public void C(float f4) {
        this.K = G(f4);
    }

    public void D(List<c> list) {
        this.f49165d = list;
    }

    public void E(int i4) {
        this.G = i4;
        invalidate();
    }

    public void F(ViewPager2 viewPager2, List<c> list) {
        if (viewPager2 == null || viewPager2.g() == null) {
            throw new IllegalStateException(ProtectedSandApp.s("쌧"));
        }
        if (list == null || list.size() == 0) {
            throw new IllegalStateException(ProtectedSandApp.s("쌦"));
        }
        if (list.size() != viewPager2.g().getItemCount()) {
            throw new IllegalStateException(ProtectedSandApp.s("쌥"));
        }
        this.f49164c = viewPager2;
        ArrayList arrayList = new ArrayList();
        this.f49165d = arrayList;
        arrayList.addAll(list);
        this.f49164c.K(this.f49167f);
        this.f49164c.u(this.f49167f);
        q();
    }

    protected int G(float f4) {
        return (int) ((f4 * getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    protected int j(float f4) {
        return (int) ((f4 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public int k() {
        return this.f49168g;
    }

    public float l() {
        return this.f49183v;
    }

    public int m() {
        return this.f49170i;
    }

    public int n() {
        return this.L;
    }

    public float o() {
        return this.K;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isInEditMode() || this.f49170i <= 0) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        float f4 = this.I;
        if (f4 > 0.0f) {
            this.f49175n.setStrokeWidth(f4);
            this.f49175n.setColor(this.H);
            for (int i4 = 0; i4 < this.f49170i - 1; i4++) {
                View childAt = this.f49166e.getChildAt(i4);
                canvas.drawLine(childAt.getRight() + paddingLeft, this.J, childAt.getRight() + paddingLeft, height - this.J, this.f49175n);
            }
        }
        if (this.F > 0.0f) {
            this.f49174m.setColor(this.E);
            if (this.G == 80) {
                float f5 = height;
                canvas.drawRect(paddingLeft, f5 - this.F, this.f49166e.getWidth() + paddingLeft, f5, this.f49174m);
            } else {
                canvas.drawRect(paddingLeft, 0.0f, this.f49166e.getWidth() + paddingLeft, this.F, this.f49174m);
            }
        }
        i();
        int i5 = this.f49178q;
        if (i5 == 1) {
            if (this.f49183v > 0.0f) {
                this.f49176o.setColor(this.f49182u);
                this.f49177p.reset();
                float f6 = height;
                this.f49177p.moveTo(this.f49171j.left + paddingLeft, f6);
                Path path = this.f49177p;
                Rect rect = this.f49171j;
                path.lineTo((rect.right / 2) + (rect.left / 2) + paddingLeft, f6 - this.f49183v);
                this.f49177p.lineTo(paddingLeft + this.f49171j.right, f6);
                this.f49177p.close();
                canvas.drawPath(this.f49177p, this.f49176o);
                return;
            }
            return;
        }
        if (i5 == 2) {
            if (this.f49183v < 0.0f) {
                this.f49183v = (height - this.f49187z) - this.B;
            }
            float f7 = this.f49183v;
            if (f7 > 0.0f) {
                float f10 = this.f49185x;
                if (f10 < 0.0f || f10 > f7 / 2.0f) {
                    this.f49185x = f7 / 2.0f;
                }
                this.f49173l.setColor(this.f49182u);
                GradientDrawable gradientDrawable = this.f49173l;
                int i6 = ((int) this.f49186y) + paddingLeft + this.f49171j.left;
                float f11 = this.f49187z;
                gradientDrawable.setBounds(i6, (int) f11, (int) ((paddingLeft + r2.right) - this.A), (int) (f11 + this.f49183v));
                this.f49173l.setCornerRadius(this.f49185x);
                this.f49173l.draw(canvas);
                return;
            }
            return;
        }
        if (this.f49183v > 0.0f) {
            this.f49173l.setColor(this.f49182u);
            if (this.C == 80) {
                GradientDrawable gradientDrawable2 = this.f49173l;
                int i7 = ((int) this.f49186y) + paddingLeft;
                Rect rect2 = this.f49171j;
                int i10 = i7 + rect2.left;
                int i11 = height - ((int) this.f49183v);
                float f12 = this.B;
                gradientDrawable2.setBounds(i10, i11 - ((int) f12), (paddingLeft + rect2.right) - ((int) this.A), height - ((int) f12));
            } else {
                GradientDrawable gradientDrawable3 = this.f49173l;
                int i12 = ((int) this.f49186y) + paddingLeft;
                Rect rect3 = this.f49171j;
                int i13 = i12 + rect3.left;
                float f13 = this.f49187z;
                gradientDrawable3.setBounds(i13, (int) f13, (paddingLeft + rect3.right) - ((int) this.A), ((int) this.f49183v) + ((int) f13));
            }
            this.f49173l.setCornerRadius(this.f49185x);
            this.f49173l.draw(canvas);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f49168g = bundle.getInt(ProtectedSandApp.s("쌨"));
            parcelable = bundle.getParcelable(ProtectedSandApp.s("쌩"));
            if (this.f49168g != 0 && this.f49166e.getChildCount() > 0) {
                H(this.f49168g);
                t();
            }
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    protected Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(ProtectedSandApp.s("쌩"), super.onSaveInstanceState());
        bundle.putInt(ProtectedSandApp.s("쌨"), this.f49168g);
        return bundle;
    }

    public TextView p(int i4) {
        return (TextView) this.f49166e.getChildAt(i4).findViewById(b.g.X1);
    }

    public void q() {
        this.f49166e.removeAllViews();
        List<c> list = this.f49165d;
        this.f49170i = list == null ? this.f49164c.g().getItemCount() : list.size();
        for (int i4 = 0; i4 < this.f49170i; i4++) {
            h(i4, this.f49165d, View.inflate(this.f49163b, b.j.G, null));
        }
        H(this.f49168g);
    }

    public int s(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return Color.parseColor(str2);
        }
        try {
            return Color.parseColor(str);
        } catch (Exception unused) {
            return Color.parseColor(str2);
        }
    }

    public void u(int i4) {
        this.f49168g = i4;
        this.f49164c.B(i4, true);
    }

    public void v(int i4, boolean z4) {
        this.f49168g = i4;
        this.f49164c.B(i4, z4);
    }

    public void w(c cVar) {
        this.M = cVar;
    }

    public void x(float f4) {
        this.f49183v = j(f4);
        invalidate();
    }

    public void y(boolean z4) {
        this.D = z4;
        invalidate();
    }

    public void z(b8.b bVar) {
        this.L2 = bVar;
    }

    public DiyTabLayout(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f49171j = new Rect();
        this.f49172k = new Rect();
        this.f49173l = new GradientDrawable();
        this.f49174m = new Paint(1);
        this.f49175n = new Paint(1);
        this.f49176o = new Paint(1);
        this.f49177p = new Path();
        this.f49178q = 0;
        this.M = new c(ProtectedSandApp.s("쌝"), ProtectedSandApp.s("쌞"), "", ProtectedSandApp.s("쌜"));
        this.V1 = new Paint(1);
        setFillViewport(true);
        setWillNotDraw(false);
        setClipChildren(false);
        setClipToPadding(false);
        this.f49163b = context;
        LinearLayout linearLayout = new LinearLayout(context);
        this.f49166e = linearLayout;
        addView(linearLayout);
        r(context, attributeSet);
        String attributeValue = attributeSet.getAttributeValue(ProtectedSandApp.s("쌟"), ProtectedSandApp.s("쌠"));
        if (!attributeValue.equals(ProtectedSandApp.s("쌡")) && !attributeValue.equals(ProtectedSandApp.s("쌢"))) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.layout_height});
            this.Q = obtainStyledAttributes.getDimensionPixelSize(0, -2);
            obtainStyledAttributes.recycle();
        }
        this.f49167f = new a();
    }

    public DiyTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
