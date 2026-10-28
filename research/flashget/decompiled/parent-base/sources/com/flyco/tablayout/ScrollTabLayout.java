package com.flyco.tablayout;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.j0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.flyco.tablayout.b;
import com.flyco.tablayout.widget.MsgView;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public class ScrollTabLayout extends HorizontalScrollView {
    private static final int H = 0;
    private static final int I = 1;
    private static final int J = 2;
    private Paint A;
    private SparseArray<Boolean> B;
    private b8.b C;
    private int D;
    private int E;
    private Drawable F;

    @j0
    private int G;

    /* renamed from: b, reason: collision with root package name */
    private Context f49190b;

    /* renamed from: c, reason: collision with root package name */
    private ArrayList<String> f49191c;

    /* renamed from: d, reason: collision with root package name */
    private LinearLayout f49192d;

    /* renamed from: e, reason: collision with root package name */
    private int f49193e;

    /* renamed from: f, reason: collision with root package name */
    private int f49194f;

    /* renamed from: g, reason: collision with root package name */
    private Paint f49195g;

    /* renamed from: h, reason: collision with root package name */
    private Paint f49196h;

    /* renamed from: i, reason: collision with root package name */
    private float f49197i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f49198j;

    /* renamed from: k, reason: collision with root package name */
    private float f49199k;

    /* renamed from: l, reason: collision with root package name */
    private int f49200l;

    /* renamed from: m, reason: collision with root package name */
    private float f49201m;

    /* renamed from: n, reason: collision with root package name */
    private int f49202n;

    /* renamed from: o, reason: collision with root package name */
    private int f49203o;

    /* renamed from: p, reason: collision with root package name */
    private float f49204p;

    /* renamed from: q, reason: collision with root package name */
    private float f49205q;

    /* renamed from: r, reason: collision with root package name */
    private float f49206r;

    /* renamed from: s, reason: collision with root package name */
    private float f49207s;

    /* renamed from: t, reason: collision with root package name */
    private int f49208t;

    /* renamed from: u, reason: collision with root package name */
    private int f49209u;

    /* renamed from: v, reason: collision with root package name */
    private int f49210v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f49211w;

    /* renamed from: x, reason: collision with root package name */
    private int f49212x;

    /* renamed from: y, reason: collision with root package name */
    private int f49213y;

    /* renamed from: z, reason: collision with root package name */
    private float f49214z;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int indexOfChild = ScrollTabLayout.this.f49192d.indexOfChild(view);
            if (indexOfChild == -1) {
                if (ScrollTabLayout.this.C != null) {
                    ScrollTabLayout.this.C.a(indexOfChild);
                }
            } else {
                ScrollTabLayout.this.d0(indexOfChild);
                ScrollTabLayout.this.f49193e = indexOfChild;
                ScrollTabLayout.this.D();
                if (ScrollTabLayout.this.C != null) {
                    ScrollTabLayout.this.C.b(indexOfChild);
                }
            }
        }
    }

    public ScrollTabLayout(Context context) {
        this(context, null, 0);
    }

    private void C(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.m.b7);
        int i4 = b.m.s7;
        Resources resources = context.getResources();
        int i5 = b.d.M;
        this.f49200l = obtainStyledAttributes.getColor(i4, resources.getColor(i5));
        this.f49201m = obtainStyledAttributes.getDimension(b.m.u7, h(0.0f));
        this.f49202n = obtainStyledAttributes.getInt(b.m.t7, 80);
        this.f49203o = obtainStyledAttributes.getColor(b.m.c7, context.getResources().getColor(i5));
        this.f49204p = obtainStyledAttributes.getDimension(b.m.e7, h(0.0f));
        this.f49205q = obtainStyledAttributes.getDimension(b.m.d7, h(12.0f));
        this.f49206r = obtainStyledAttributes.getDimension(b.m.r7, c0(14.0f));
        this.f49207s = obtainStyledAttributes.getDimension(b.m.p7, c0(14.0f));
        this.f49208t = obtainStyledAttributes.getColor(b.m.o7, context.getResources().getColor(i5));
        this.f49209u = obtainStyledAttributes.getColor(b.m.q7, Color.parseColor(ProtectedSandApp.s("쌮")));
        this.f49210v = obtainStyledAttributes.getInt(b.m.n7, 0);
        this.f49211w = obtainStyledAttributes.getBoolean(b.m.m7, false);
        this.f49198j = obtainStyledAttributes.getBoolean(b.m.k7, false);
        float dimension = obtainStyledAttributes.getDimension(b.m.l7, h(-1.0f));
        this.f49199k = dimension;
        this.f49197i = obtainStyledAttributes.getDimension(b.m.j7, (this.f49198j || dimension > 0.0f) ? h(0.0f) : h(20.0f));
        this.F = obtainStyledAttributes.getDrawable(b.m.f7);
        this.E = (int) obtainStyledAttributes.getDimension(b.m.h7, h(3.0f));
        this.D = (int) obtainStyledAttributes.getDimension(b.m.i7, h(10.0f));
        obtainStyledAttributes.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D() {
        if (this.f49194f <= 0) {
            return;
        }
        int left = this.f49192d.getChildAt(this.f49193e).getLeft();
        if (this.f49193e > 0) {
            left -= (getWidth() / 2) - getPaddingLeft();
        }
        if (left != this.f49212x) {
            this.f49212x = left;
            scrollTo(left, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0(int i4) {
        int i5 = 0;
        while (i5 < this.f49194f) {
            View childAt = this.f49192d.getChildAt(i5);
            boolean z4 = i5 == i4;
            TextView textView = (TextView) childAt.findViewById(b.g.X1);
            View findViewById = childAt.findViewById(b.g.I0);
            if (textView != null) {
                textView.setTextColor(z4 ? this.f49208t : this.f49209u);
                textView.setTextSize(0, z4 ? this.f49207s : this.f49206r);
                findViewById.setVisibility(z4 ? 0 : 8);
                if (this.f49210v == 1) {
                    textView.getPaint().setFakeBoldText(z4);
                }
            }
            i5++;
        }
    }

    private void e0() {
        int i4 = 0;
        while (i4 < this.f49194f) {
            View childAt = this.f49192d.getChildAt(i4);
            TextView textView = (TextView) childAt.findViewById(b.g.X1);
            View findViewById = childAt.findViewById(b.g.I0);
            if (textView != null) {
                findViewById.setVisibility(i4 == this.f49193e ? 0 : 8);
                textView.setTextColor(i4 == this.f49193e ? this.f49208t : this.f49209u);
                textView.setTextSize(0, i4 == this.f49193e ? this.f49207s : this.f49206r);
                float f4 = this.f49197i;
                textView.setPadding((int) f4, 0, (int) f4, 0);
                if (this.f49211w) {
                    textView.setText(textView.getText().toString().toUpperCase());
                }
                int i5 = this.f49210v;
                if (i5 == 2) {
                    textView.getPaint().setFakeBoldText(true);
                } else if (i5 == 0) {
                    textView.getPaint().setFakeBoldText(false);
                }
            }
            i4++;
        }
    }

    private void g(int i4, String str, View view) {
        TextView textView = (TextView) view.findViewById(b.g.X1);
        View findViewById = view.findViewById(b.g.I0);
        Drawable drawable = this.F;
        if (drawable != null) {
            findViewById.setBackground(drawable);
        }
        if (this.D != 0 || this.E != 0) {
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            layoutParams.width = this.D;
            layoutParams.height = this.E;
            findViewById.setLayoutParams(layoutParams);
        }
        if (textView != null && str != null) {
            textView.setText(str);
        }
        view.setOnClickListener(new a());
        LinearLayout.LayoutParams layoutParams2 = this.f49198j ? new LinearLayout.LayoutParams(0, -1, 1.0f) : new LinearLayout.LayoutParams(-2, -1);
        if (this.f49199k > 0.0f) {
            layoutParams2 = new LinearLayout.LayoutParams((int) this.f49199k, -1);
        }
        this.f49192d.addView(view, i4, layoutParams2);
    }

    public boolean A() {
        return this.f49211w;
    }

    public void B() {
        this.f49192d.removeAllViews();
        this.f49194f = this.f49191c.size();
        for (int i4 = 0; i4 < this.f49194f; i4++) {
            g(i4, this.f49191c.get(i4).toString(), View.inflate(this.f49190b, this.G, null));
        }
        e0();
    }

    public void E(int i4) {
        this.f49193e = i4;
    }

    public void F(int i4) {
        this.f49203o = i4;
        invalidate();
    }

    public void G(float f4) {
        this.f49205q = h(f4);
        invalidate();
    }

    public void H(float f4) {
        this.f49204p = h(f4);
        invalidate();
    }

    public void I(Drawable drawable) {
        this.F = drawable;
    }

    public void J(int i4, int i5) {
        this.D = h(i4);
        this.E = h(i5);
    }

    public void K(@j0 int i4) {
        this.G = i4;
    }

    public void L(int i4, float f4, float f5) {
        int i5 = this.f49194f;
        if (i4 >= i5) {
            i4 = i5 - 1;
        }
        View childAt = this.f49192d.getChildAt(i4);
        MsgView msgView = (MsgView) childAt.findViewById(b.g.f49639h1);
        if (msgView != null) {
            TextView textView = (TextView) childAt.findViewById(b.g.X1);
            this.A.setTextSize(this.f49206r);
            float measureText = this.A.measureText(textView.getText().toString());
            float descent = this.A.descent() - this.A.ascent();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) msgView.getLayoutParams();
            float f6 = this.f49199k;
            marginLayoutParams.setMarginStart(f6 >= 0.0f ? (int) ((measureText / 2.0f) + (f6 / 2.0f) + h(f4)) : (int) (this.f49197i + measureText + h(f4)));
            int i6 = this.f49213y;
            marginLayoutParams.topMargin = i6 > 0 ? (((int) (i6 - descent)) / 2) - h(f5) : 0;
            msgView.setLayoutParams(marginLayoutParams);
        }
    }

    public void M(b8.b bVar) {
        this.C = bVar;
    }

    public void N(float f4) {
        this.f49197i = h(f4);
        e0();
    }

    public void O(boolean z4) {
        this.f49198j = z4;
        e0();
    }

    public void P(float f4) {
        this.f49199k = h(f4);
        e0();
    }

    public void Q(ArrayList<String> arrayList) {
        this.f49191c = arrayList;
    }

    public void R(boolean z4) {
        this.f49211w = z4;
        e0();
    }

    public void S(int i4) {
        this.f49210v = i4;
        e0();
    }

    public void T(int i4) {
        this.f49208t = i4;
        e0();
    }

    public void U(float f4) {
        this.f49207s = c0(f4);
        e0();
    }

    public void V(int i4) {
        this.f49209u = i4;
        e0();
    }

    public void W(float f4) {
        this.f49206r = c0(f4);
        e0();
    }

    public void X(int i4) {
        this.f49200l = i4;
        invalidate();
    }

    public void Y(int i4) {
        this.f49202n = i4;
        invalidate();
    }

    public void Z(float f4) {
        this.f49201m = h(f4);
        invalidate();
    }

    public void a0(int i4) {
        int i5 = this.f49194f;
        if (i4 >= i5) {
            i4 = i5 - 1;
        }
        b0(i4, 0);
    }

    public void b0(int i4, int i5) {
        int i6 = this.f49194f;
        if (i4 >= i6) {
            i4 = i6 - 1;
        }
        MsgView msgView = (MsgView) this.f49192d.getChildAt(i4).findViewById(b.g.f49639h1);
        if (msgView != null) {
            c8.b.b(msgView, i5);
            if (this.B.get(i4) == null || !this.B.get(i4).booleanValue()) {
                L(i4, 4.0f, 2.0f);
                this.B.put(i4, Boolean.TRUE);
            }
        }
    }

    protected int c0(float f4) {
        return (int) ((f4 * this.f49190b.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public void f(String str) {
        View inflate = View.inflate(this.f49190b, this.G, null);
        ArrayList<String> arrayList = this.f49191c;
        if (arrayList != null) {
            arrayList.add(str);
        }
        g(this.f49194f, this.f49191c.get(this.f49194f).toString(), inflate);
        this.f49194f = this.f49191c.size();
        e0();
    }

    protected int h(float f4) {
        return (int) ((f4 * this.f49190b.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public int i() {
        return this.f49193e;
    }

    public int j() {
        return this.f49203o;
    }

    public float k() {
        return this.f49205q;
    }

    public float l() {
        return this.f49204p;
    }

    public MsgView m(int i4) {
        int i5 = this.f49194f;
        if (i4 >= i5) {
            i4 = i5 - 1;
        }
        return (MsgView) this.f49192d.getChildAt(i4).findViewById(b.g.f49639h1);
    }

    public int n() {
        return this.f49194f;
    }

    public float o() {
        return this.f49197i;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isInEditMode() || this.f49194f <= 0) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        float f4 = this.f49204p;
        if (f4 > 0.0f) {
            this.f49196h.setStrokeWidth(f4);
            this.f49196h.setColor(this.f49203o);
            for (int i4 = 0; i4 < this.f49194f - 1; i4++) {
                View childAt = this.f49192d.getChildAt(i4);
                canvas.drawLine(childAt.getRight() + paddingLeft, this.f49205q, childAt.getRight() + paddingLeft, height - this.f49205q, this.f49196h);
            }
        }
        if (this.f49201m > 0.0f) {
            this.f49195g.setColor(this.f49200l);
            if (this.f49202n != 80) {
                canvas.drawRect(paddingLeft, 0.0f, this.f49192d.getWidth() + paddingLeft, this.f49201m, this.f49195g);
            } else {
                float f5 = height;
                canvas.drawRect(paddingLeft, f5 - this.f49201m, this.f49192d.getWidth() + paddingLeft, f5, this.f49195g);
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f49193e = bundle.getInt(ProtectedSandApp.s("쌯"));
            parcelable = bundle.getParcelable(ProtectedSandApp.s("쌰"));
            if (this.f49193e != 0 && this.f49192d.getChildCount() > 0) {
                d0(this.f49193e);
                D();
            }
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    protected Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(ProtectedSandApp.s("쌰"), super.onSaveInstanceState());
        bundle.putInt(ProtectedSandApp.s("쌯"), this.f49193e);
        return bundle;
    }

    public float p() {
        return this.f49199k;
    }

    public int q() {
        return this.f49210v;
    }

    public int r() {
        return this.f49208t;
    }

    public float s() {
        return this.f49207s;
    }

    public int t() {
        return this.f49209u;
    }

    public float u() {
        return this.f49206r;
    }

    public TextView v(int i4) {
        return (TextView) this.f49192d.getChildAt(i4).findViewById(b.g.X1);
    }

    public int w() {
        return this.f49200l;
    }

    public float x() {
        return this.f49201m;
    }

    public void y(int i4) {
        int i5 = this.f49194f;
        if (i4 >= i5) {
            i4 = i5 - 1;
        }
        MsgView msgView = (MsgView) this.f49192d.getChildAt(i4).findViewById(b.g.f49639h1);
        if (msgView != null) {
            msgView.setVisibility(8);
        }
    }

    public boolean z() {
        return this.f49198j;
    }

    public ScrollTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScrollTabLayout(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f49191c = new ArrayList<>();
        this.f49195g = new Paint(1);
        this.f49196h = new Paint(1);
        this.A = new Paint(1);
        this.B = new SparseArray<>();
        this.G = b.j.D;
        setFillViewport(true);
        setWillNotDraw(false);
        setClipChildren(false);
        setClipToPadding(false);
        this.f49190b = context;
        LinearLayout linearLayout = new LinearLayout(context);
        this.f49192d = linearLayout;
        addView(linearLayout);
        C(context, attributeSet);
        String attributeValue = attributeSet.getAttributeValue(ProtectedSandApp.s("쌪"), ProtectedSandApp.s("쌫"));
        if (attributeValue.equals(ProtectedSandApp.s("쌬")) || attributeValue.equals(ProtectedSandApp.s("쌭"))) {
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.layout_height});
        this.f49213y = obtainStyledAttributes.getDimensionPixelSize(0, -2);
        obtainStyledAttributes.recycle();
    }
}
