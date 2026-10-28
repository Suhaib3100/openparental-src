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
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.o0;
import androidx.appcompat.graphics.drawable.d;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.flyco.tablayout.b;
import com.flyco.tablayout.widget.MsgView;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes5.dex */
public class SlidingTabLayout extends HorizontalScrollView {
    private static final int O2 = 0;
    private static final int P2 = 1;
    private static final int Q2 = 2;
    public static final int R2 = 0;
    public static final int S2 = 1;
    public static final int T2 = 2;
    private float A;
    private int B;
    private boolean C;
    private int D;
    private float E;
    private int F;
    private int G;
    private float H;
    private float I;
    private float J;
    private float K;
    private int L;
    private Paint L2;
    private int M;
    private SparseArray<Boolean> M2;
    private int N;
    private b8.b N2;
    private boolean O;
    private int P;
    private int Q;
    private ViewPager2.j Q1;
    private boolean R;
    private float V1;

    /* renamed from: b, reason: collision with root package name */
    private Context f49246b;

    /* renamed from: c, reason: collision with root package name */
    private ViewPager2 f49247c;

    /* renamed from: d, reason: collision with root package name */
    private ArrayList<String> f49248d;

    /* renamed from: e, reason: collision with root package name */
    private LinearLayout f49249e;

    /* renamed from: f, reason: collision with root package name */
    private int f49250f;

    /* renamed from: g, reason: collision with root package name */
    private float f49251g;

    /* renamed from: h, reason: collision with root package name */
    private int f49252h;

    /* renamed from: i, reason: collision with root package name */
    private Rect f49253i;

    /* renamed from: j, reason: collision with root package name */
    private Rect f49254j;

    /* renamed from: k, reason: collision with root package name */
    private GradientDrawable f49255k;

    /* renamed from: l, reason: collision with root package name */
    private Paint f49256l;

    /* renamed from: m, reason: collision with root package name */
    private Paint f49257m;

    /* renamed from: n, reason: collision with root package name */
    private Paint f49258n;

    /* renamed from: o, reason: collision with root package name */
    private Path f49259o;

    /* renamed from: p, reason: collision with root package name */
    private int f49260p;

    /* renamed from: q, reason: collision with root package name */
    private float f49261q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f49262r;

    /* renamed from: s, reason: collision with root package name */
    private float f49263s;

    /* renamed from: t, reason: collision with root package name */
    private int f49264t;

    /* renamed from: u, reason: collision with root package name */
    private float f49265u;

    /* renamed from: v, reason: collision with root package name */
    private float f49266v;

    /* renamed from: w, reason: collision with root package name */
    private float f49267w;

    /* renamed from: x, reason: collision with root package name */
    private float f49268x;

    /* renamed from: y, reason: collision with root package name */
    private float f49269y;

    /* renamed from: z, reason: collision with root package name */
    private float f49270z;

    class a extends ViewPager2.j {
        a() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.j
        public void onPageScrolled(int i4, float f4, int i5) {
            super.onPageScrolled(i4, f4, i5);
            SlidingTabLayout.this.f49250f = i4;
            SlidingTabLayout.this.f49251g = f4;
            SlidingTabLayout.this.P();
            SlidingTabLayout.this.invalidate();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.j
        public void onPageSelected(int i4) {
            super.onPageSelected(i4);
            SlidingTabLayout.this.z0(i4);
        }
    }

    class b implements View.OnClickListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f49272b;

        b(int i4) {
            this.f49272b = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f49272b != -1) {
                if (SlidingTabLayout.this.f49247c.h() == this.f49272b) {
                    if (SlidingTabLayout.this.N2 != null) {
                        SlidingTabLayout.this.N2.a(this.f49272b);
                    }
                } else {
                    if (SlidingTabLayout.this.R) {
                        SlidingTabLayout.this.f49247c.B(this.f49272b, false);
                    } else {
                        SlidingTabLayout.this.f49247c.B(this.f49272b, true);
                    }
                    if (SlidingTabLayout.this.N2 != null) {
                        SlidingTabLayout.this.N2.b(this.f49272b);
                    }
                }
            }
        }
    }

    public SlidingTabLayout(Context context) {
        this(context, null, 0);
    }

    private void A0() {
        int i4 = 0;
        while (i4 < this.f49252h) {
            TextView textView = (TextView) this.f49249e.getChildAt(i4).findViewById(b.g.X1);
            if (textView != null) {
                textView.setTextColor(i4 == this.f49250f ? this.L : this.M);
                textView.setTextSize(0, i4 == this.f49250f ? this.K : this.J);
                float f4 = this.f49261q;
                textView.setPadding((int) f4, 0, (int) f4, 0);
                if (this.O) {
                    textView.setText(textView.getText().toString().toUpperCase());
                }
                int i5 = this.N;
                if (i5 == 2) {
                    textView.getPaint().setFakeBoldText(true);
                } else if (i5 == 0) {
                    textView.getPaint().setFakeBoldText(false);
                }
            }
            i4++;
        }
    }

    private void O(Context context, AttributeSet attributeSet) {
        float f4;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.m.f49996m8);
        int i4 = obtainStyledAttributes.getInt(b.m.f50092y8, 0);
        this.f49260p = i4;
        this.f49264t = obtainStyledAttributes.getColor(b.m.f50028q8, Color.parseColor(i4 == 2 ? ProtectedSandApp.s("쌽") : ProtectedSandApp.s("쌾")));
        int i5 = b.m.f50052t8;
        int i6 = this.f49260p;
        if (i6 == 1) {
            f4 = 4.0f;
        } else {
            f4 = i6 == 2 ? -1 : 2;
        }
        this.f49265u = obtainStyledAttributes.getDimension(i5, k(f4));
        this.f49266v = obtainStyledAttributes.getDimension(b.m.f50100z8, k(this.f49260p == 1 ? 10.0f : -1.0f));
        this.f49267w = obtainStyledAttributes.getDimension(b.m.f50036r8, k(this.f49260p == 2 ? -1.0f : 0.0f));
        this.f49268x = obtainStyledAttributes.getDimension(b.m.f50068v8, k(0.0f));
        this.f49269y = obtainStyledAttributes.getDimension(b.m.f50084x8, k(0.0f));
        this.f49270z = obtainStyledAttributes.getDimension(b.m.f50076w8, k(0.0f));
        this.A = obtainStyledAttributes.getDimension(b.m.f50060u8, k(this.f49260p == 2 ? 7.0f : 0.0f));
        this.B = obtainStyledAttributes.getInt(b.m.f50044s8, 80);
        this.C = obtainStyledAttributes.getBoolean(b.m.A8, false);
        int i7 = b.m.K8;
        Resources resources = context.getResources();
        int i10 = b.d.M;
        this.D = obtainStyledAttributes.getColor(i7, resources.getColor(i10));
        this.E = obtainStyledAttributes.getDimension(b.m.M8, k(0.0f));
        this.F = obtainStyledAttributes.getInt(b.m.L8, 80);
        this.G = obtainStyledAttributes.getColor(b.m.f50004n8, context.getResources().getColor(i10));
        this.H = obtainStyledAttributes.getDimension(b.m.f50020p8, k(0.0f));
        this.I = obtainStyledAttributes.getDimension(b.m.f50012o8, k(12.0f));
        this.J = obtainStyledAttributes.getDimension(b.m.J8, y0(14.0f));
        this.K = obtainStyledAttributes.getDimension(b.m.H8, y0(14.0f));
        int i11 = b.m.G8;
        String s4 = ProtectedSandApp.s("쌿");
        this.L = obtainStyledAttributes.getColor(i11, Color.parseColor(s4));
        this.M = obtainStyledAttributes.getColor(b.m.I8, Color.parseColor(s4));
        this.N = obtainStyledAttributes.getInt(b.m.F8, 0);
        this.O = obtainStyledAttributes.getBoolean(b.m.E8, false);
        this.f49262r = obtainStyledAttributes.getBoolean(b.m.C8, false);
        float dimension = obtainStyledAttributes.getDimension(b.m.D8, k(-1.0f));
        this.f49263s = dimension;
        this.f49261q = obtainStyledAttributes.getDimension(b.m.B8, (this.f49262r || dimension > 0.0f) ? k(0.0f) : k(20.0f));
        obtainStyledAttributes.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P() {
        if (this.f49252h <= 0) {
            return;
        }
        int width = (int) (this.f49251g * this.f49249e.getChildAt(this.f49250f).getWidth());
        int left = this.f49249e.getChildAt(this.f49250f).getLeft() + width;
        if (this.f49250f > 0 || width > 0) {
            int width2 = left - ((getWidth() / 2) - getPaddingLeft());
            j();
            Rect rect = this.f49254j;
            left = androidx.appcompat.widget.a.a(rect.right, rect.left, 2, width2);
        }
        if (left != this.P) {
            this.P = left;
            scrollTo(left, 0);
        }
    }

    private void i(int i4, String str, View view) {
        TextView textView = (TextView) view.findViewById(b.g.X1);
        if (textView != null && str != null) {
            textView.setText(str);
        }
        view.setOnClickListener(new b(i4));
        LinearLayout.LayoutParams layoutParams = this.f49262r ? new LinearLayout.LayoutParams(0, -1, 1.0f) : new LinearLayout.LayoutParams(-2, -1);
        if (this.f49263s > 0.0f) {
            layoutParams = new LinearLayout.LayoutParams((int) this.f49263s, -1);
        }
        this.f49249e.addView(view, i4, layoutParams);
    }

    private void j() {
        View childAt = this.f49249e.getChildAt(this.f49250f);
        float left = childAt.getLeft();
        float right = childAt.getRight();
        if (this.f49260p == 0 && this.C) {
            TextView textView = (TextView) childAt.findViewById(b.g.X1);
            this.L2.setTextSize(this.J);
            this.V1 = ((right - left) - this.L2.measureText(textView.getText().toString())) / 2.0f;
        }
        int i4 = this.f49250f;
        if (i4 < this.f49252h - 1) {
            View childAt2 = this.f49249e.getChildAt(i4 + 1);
            float left2 = childAt2.getLeft();
            float right2 = childAt2.getRight();
            float f4 = this.f49251g;
            left = d.a(left2, left, f4, left);
            right = d.a(right2, right, f4, right);
            if (this.f49260p == 0 && this.C) {
                TextView textView2 = (TextView) childAt2.findViewById(b.g.X1);
                this.L2.setTextSize(this.J);
                float measureText = ((right2 - left2) - this.L2.measureText(textView2.getText().toString())) / 2.0f;
                float f5 = this.V1;
                this.V1 = d.a(measureText, f5, this.f49251g, f5);
            }
        }
        Rect rect = this.f49253i;
        int i5 = (int) left;
        rect.left = i5;
        int i6 = (int) right;
        rect.right = i6;
        if (this.f49260p == 0 && this.C) {
            float f6 = this.V1;
            rect.left = (int) ((left + f6) - 1.0f);
            rect.right = (int) ((right - f6) - 1.0f);
        }
        Rect rect2 = this.f49254j;
        rect2.left = i5;
        rect2.right = i6;
        if (this.f49266v < 0.0f) {
            return;
        }
        float width = ((childAt.getWidth() - this.f49266v) / 2.0f) + childAt.getLeft();
        int i7 = this.f49250f;
        if (i7 < this.f49252h - 1) {
            View childAt3 = this.f49249e.getChildAt(i7 + 1);
            width += this.f49251g * ((childAt3.getWidth() / 2) + (childAt.getWidth() / 2));
        }
        Rect rect3 = this.f49253i;
        int i10 = (int) width;
        rect3.left = i10;
        rect3.right = (int) (i10 + this.f49266v);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z0(int i4) {
        int i5 = 0;
        while (i5 < this.f49252h) {
            View childAt = this.f49249e.getChildAt(i5);
            boolean z4 = i5 == i4;
            TextView textView = (TextView) childAt.findViewById(b.g.X1);
            if (textView != null) {
                textView.setTextColor(z4 ? this.L : this.M);
                textView.setTextSize(0, z4 ? this.K : this.J);
                if (this.N == 1) {
                    textView.getPaint().setFakeBoldText(z4);
                }
            }
            i5++;
        }
    }

    public float A() {
        return this.f49261q;
    }

    public float B() {
        return this.f49263s;
    }

    public int C() {
        return this.N;
    }

    public int D() {
        return this.L;
    }

    public float E() {
        return this.K;
    }

    public int F() {
        return this.M;
    }

    public float G() {
        return this.J;
    }

    public TextView H(int i4) {
        return (TextView) this.f49249e.getChildAt(i4).findViewById(b.g.X1);
    }

    public int I() {
        return this.D;
    }

    public float J() {
        return this.E;
    }

    public void K(int i4) {
        int i5 = this.f49252h;
        if (i4 >= i5) {
            i4 = i5 - 1;
        }
        MsgView msgView = (MsgView) this.f49249e.getChildAt(i4).findViewById(b.g.f49639h1);
        if (msgView != null) {
            msgView.setVisibility(8);
        }
    }

    public boolean L() {
        return this.f49262r;
    }

    public boolean M() {
        return this.O;
    }

    public void N() {
        this.f49249e.removeAllViews();
        ArrayList<String> arrayList = this.f49248d;
        this.f49252h = arrayList == null ? this.f49247c.g().getItemCount() : arrayList.size();
        for (int i4 = 0; i4 < this.f49252h; i4++) {
            i(i4, this.f49248d.get(i4).toString(), View.inflate(this.f49246b, b.j.E, null));
        }
        A0();
    }

    public void Q(int i4) {
        this.f49250f = i4;
        this.f49247c.B(i4, true);
    }

    public void R(int i4, boolean z4) {
        this.f49250f = i4;
        this.f49247c.B(i4, z4);
    }

    public void S(int i4) {
        this.G = i4;
        invalidate();
    }

    public void T(float f4) {
        this.I = k(f4);
        invalidate();
    }

    public void U(float f4) {
        this.H = k(f4);
        invalidate();
    }

    public void V(int i4) {
        this.f49264t = i4;
        invalidate();
    }

    public void W(float f4) {
        this.f49267w = k(f4);
        invalidate();
    }

    public void X(int i4) {
        this.B = i4;
        invalidate();
    }

    public void Y(float f4) {
        this.f49265u = k(f4);
        invalidate();
    }

    public void Z(float f4, float f5, float f6, float f7) {
        this.f49268x = k(f4);
        this.f49269y = k(f5);
        this.f49270z = k(f6);
        this.A = k(f7);
        invalidate();
    }

    public void a0(int i4) {
        this.f49260p = i4;
        invalidate();
    }

    public void b0(float f4) {
        this.f49266v = k(f4);
        invalidate();
    }

    public void c0(boolean z4) {
        this.C = z4;
        invalidate();
    }

    public void d0(int i4, float f4, float f5) {
        int i5 = this.f49252h;
        if (i4 >= i5) {
            i4 = i5 - 1;
        }
        View childAt = this.f49249e.getChildAt(i4);
        MsgView msgView = (MsgView) childAt.findViewById(b.g.f49639h1);
        if (msgView != null) {
            TextView textView = (TextView) childAt.findViewById(b.g.X1);
            this.L2.setTextSize(this.J);
            float measureText = this.L2.measureText(textView.getText().toString()) + textView.getLeft();
            float descent = this.L2.descent() - this.L2.ascent();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) msgView.getLayoutParams();
            float f6 = this.f49263s;
            marginLayoutParams.setMarginStart(f6 > 0.0f ? (int) ((measureText / 2.0f) + (f6 / 2.0f) + k(f4)) : (int) (this.f49261q + measureText + k(f4)));
            int i6 = this.Q;
            marginLayoutParams.topMargin = i6 > 0 ? (((int) (i6 - descent)) / 2) - k(f5) : 0;
            msgView.setLayoutParams(marginLayoutParams);
        }
    }

    public void e0(b8.b bVar) {
        this.N2 = bVar;
    }

    public void f0(boolean z4) {
        this.R = z4;
    }

    public void g0(float f4) {
        this.f49261q = k(f4);
        A0();
    }

    public void h(String str) {
        View inflate = View.inflate(this.f49246b, b.j.E, null);
        ArrayList<String> arrayList = this.f49248d;
        if (arrayList != null) {
            arrayList.add(str);
        }
        i(this.f49252h, this.f49248d.get(this.f49252h).toString(), inflate);
        ArrayList<String> arrayList2 = this.f49248d;
        this.f49252h = arrayList2 == null ? this.f49247c.g().getItemCount() : arrayList2.size();
        A0();
    }

    public void h0(boolean z4) {
        this.f49262r = z4;
        A0();
    }

    public void i0(float f4) {
        this.f49263s = k(f4);
        A0();
    }

    public void j0(ArrayList<String> arrayList) {
        this.f49248d = arrayList;
    }

    protected int k(float f4) {
        return (int) ((f4 * this.f49246b.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void k0(boolean z4) {
        this.O = z4;
        A0();
    }

    public int l() {
        return this.f49250f;
    }

    public void l0(int i4) {
        this.N = i4;
        A0();
    }

    public int m() {
        return this.G;
    }

    public void m0(int i4) {
        this.L = i4;
        A0();
    }

    public float n() {
        return this.I;
    }

    public void n0(float f4) {
        this.K = y0(f4);
        A0();
    }

    public float o() {
        return this.H;
    }

    public void o0(int i4) {
        this.M = i4;
        A0();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isInEditMode() || this.f49252h <= 0) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        float f4 = this.H;
        if (f4 > 0.0f) {
            this.f49257m.setStrokeWidth(f4);
            this.f49257m.setColor(this.G);
            for (int i4 = 0; i4 < this.f49252h - 1; i4++) {
                View childAt = this.f49249e.getChildAt(i4);
                canvas.drawLine(childAt.getRight() + paddingLeft, this.I, childAt.getRight() + paddingLeft, height - this.I, this.f49257m);
            }
        }
        if (this.E > 0.0f) {
            this.f49256l.setColor(this.D);
            if (this.F == 80) {
                float f5 = height;
                canvas.drawRect(paddingLeft, f5 - this.E, this.f49249e.getWidth() + paddingLeft, f5, this.f49256l);
            } else {
                canvas.drawRect(paddingLeft, 0.0f, this.f49249e.getWidth() + paddingLeft, this.E, this.f49256l);
            }
        }
        j();
        int i5 = this.f49260p;
        if (i5 == 1) {
            if (this.f49265u > 0.0f) {
                this.f49258n.setColor(this.f49264t);
                this.f49259o.reset();
                float f6 = height;
                this.f49259o.moveTo(this.f49253i.left + paddingLeft, f6);
                Path path = this.f49259o;
                Rect rect = this.f49253i;
                path.lineTo((rect.right / 2) + (rect.left / 2) + paddingLeft, f6 - this.f49265u);
                this.f49259o.lineTo(paddingLeft + this.f49253i.right, f6);
                this.f49259o.close();
                canvas.drawPath(this.f49259o, this.f49258n);
                return;
            }
            return;
        }
        if (i5 == 2) {
            if (this.f49265u < 0.0f) {
                this.f49265u = (height - this.f49269y) - this.A;
            }
            float f7 = height;
            this.f49265u = f7;
            if (f7 > 0.0f) {
                float f10 = this.f49267w;
                if (f10 < 0.0f || f10 > f7 / 2.0f) {
                    this.f49267w = f7 / 2.0f;
                }
                this.f49267w = f7;
                this.f49255k.setColor(this.f49264t);
                GradientDrawable gradientDrawable = this.f49255k;
                Rect rect2 = this.f49253i;
                gradientDrawable.setBounds(rect2.left, rect2.top, rect2.right, (int) this.f49265u);
                this.f49255k.setCornerRadius(this.f49267w);
                this.f49255k.draw(canvas);
                return;
            }
            return;
        }
        if (this.f49265u > 0.0f) {
            this.f49255k.setColor(this.f49264t);
            if (this.B == 80) {
                GradientDrawable gradientDrawable2 = this.f49255k;
                int i6 = ((int) this.f49268x) + paddingLeft;
                Rect rect3 = this.f49253i;
                int i7 = i6 + rect3.left;
                int i10 = height - ((int) this.f49265u);
                float f11 = this.A;
                gradientDrawable2.setBounds(i7, i10 - ((int) f11), (paddingLeft + rect3.right) - ((int) this.f49270z), height - ((int) f11));
            } else {
                GradientDrawable gradientDrawable3 = this.f49255k;
                int i11 = ((int) this.f49268x) + paddingLeft;
                Rect rect4 = this.f49253i;
                int i12 = i11 + rect4.left;
                float f12 = this.f49269y;
                gradientDrawable3.setBounds(i12, (int) f12, (paddingLeft + rect4.right) - ((int) this.f49270z), ((int) this.f49265u) + ((int) f12));
            }
            this.f49255k.setCornerRadius(this.f49267w);
            this.f49255k.draw(canvas);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f49250f = bundle.getInt(ProtectedSandApp.s("썀"));
            parcelable = bundle.getParcelable(ProtectedSandApp.s("썁"));
            if (this.f49250f != 0 && this.f49249e.getChildCount() > 0) {
                z0(this.f49250f);
                P();
            }
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    protected Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(ProtectedSandApp.s("썁"), super.onSaveInstanceState());
        bundle.putInt(ProtectedSandApp.s("썀"), this.f49250f);
        return bundle;
    }

    public int p() {
        return this.f49264t;
    }

    public void p0(float f4) {
        this.J = y0(f4);
        A0();
    }

    public float q() {
        return this.f49267w;
    }

    public void q0(int i4) {
        this.D = i4;
        invalidate();
    }

    public float r() {
        return this.f49265u;
    }

    public void r0(int i4) {
        this.F = i4;
        invalidate();
    }

    public float s() {
        return this.A;
    }

    public void s0(float f4) {
        this.E = k(f4);
        invalidate();
    }

    public float t() {
        return this.f49268x;
    }

    public void t0(@o0 Fragment fragment, ViewPager2 viewPager2, String[] strArr, ArrayList<Fragment> arrayList) {
        if (viewPager2 == null) {
            throw new IllegalStateException(ProtectedSandApp.s("썃"));
        }
        if (strArr == null || strArr.length == 0) {
            throw new IllegalStateException(ProtectedSandApp.s("썂"));
        }
        this.f49248d.clear();
        Collections.addAll(this.f49248d, strArr);
        this.f49247c = viewPager2;
        viewPager2.z(new c(fragment, arrayList));
        this.f49247c.K(this.Q1);
        this.f49247c.u(this.Q1);
        N();
    }

    public float u() {
        return this.f49270z;
    }

    public void u0(FragmentActivity fragmentActivity, ViewPager2 viewPager2, String[] strArr, ArrayList<Fragment> arrayList) {
        if (viewPager2 == null) {
            throw new IllegalStateException(ProtectedSandApp.s("썃"));
        }
        if (strArr == null || strArr.length == 0) {
            throw new IllegalStateException(ProtectedSandApp.s("썂"));
        }
        this.f49248d.clear();
        Collections.addAll(this.f49248d, strArr);
        this.f49247c = viewPager2;
        viewPager2.z(new c(fragmentActivity, arrayList));
        this.f49247c.K(this.Q1);
        this.f49247c.u(this.Q1);
        N();
    }

    public float v() {
        return this.f49269y;
    }

    public void v0(ViewPager2 viewPager2, String[] strArr) {
        if (viewPager2 == null || viewPager2.g() == null) {
            throw new IllegalStateException(ProtectedSandApp.s("썅"));
        }
        if (strArr == null || strArr.length == 0) {
            throw new IllegalStateException(ProtectedSandApp.s("썂"));
        }
        if (strArr.length != viewPager2.g().getItemCount()) {
            throw new IllegalStateException(ProtectedSandApp.s("썄"));
        }
        this.f49247c = viewPager2;
        ArrayList<String> arrayList = new ArrayList<>();
        this.f49248d = arrayList;
        Collections.addAll(arrayList, strArr);
        this.f49247c.K(this.Q1);
        this.f49247c.u(this.Q1);
        N();
    }

    public int w() {
        return this.f49260p;
    }

    public void w0(int i4) {
        int i5 = this.f49252h;
        if (i4 >= i5) {
            i4 = i5 - 1;
        }
        x0(i4, 0);
    }

    public float x() {
        return this.f49266v;
    }

    public void x0(int i4, int i5) {
        int i6 = this.f49252h;
        if (i4 >= i6) {
            i4 = i6 - 1;
        }
        MsgView msgView = (MsgView) this.f49249e.getChildAt(i4).findViewById(b.g.f49639h1);
        if (msgView != null) {
            c8.b.b(msgView, i5);
            if (this.M2.get(i4) == null || !this.M2.get(i4).booleanValue()) {
                d0(i4, 4.0f, 2.0f);
                this.M2.put(i4, Boolean.TRUE);
            }
        }
    }

    public MsgView y(int i4) {
        int i5 = this.f49252h;
        if (i4 >= i5) {
            i4 = i5 - 1;
        }
        return (MsgView) this.f49249e.getChildAt(i4).findViewById(b.g.f49639h1);
    }

    protected int y0(float f4) {
        return (int) ((f4 * this.f49246b.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public int z() {
        return this.f49252h;
    }

    public SlidingTabLayout(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f49248d = new ArrayList<>();
        this.f49253i = new Rect();
        this.f49254j = new Rect();
        this.f49255k = new GradientDrawable();
        this.f49256l = new Paint(1);
        this.f49257m = new Paint(1);
        this.f49258n = new Paint(1);
        this.f49259o = new Path();
        this.f49260p = 0;
        this.L2 = new Paint(1);
        this.M2 = new SparseArray<>();
        setFillViewport(true);
        setWillNotDraw(false);
        setClipChildren(false);
        setClipToPadding(false);
        this.f49246b = context;
        LinearLayout linearLayout = new LinearLayout(context);
        this.f49249e = linearLayout;
        addView(linearLayout);
        O(context, attributeSet);
        String attributeValue = attributeSet.getAttributeValue(ProtectedSandApp.s("쌹"), ProtectedSandApp.s("쌺"));
        if (!attributeValue.equals(ProtectedSandApp.s("쌻")) && !attributeValue.equals(ProtectedSandApp.s("쌼"))) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.layout_height});
            this.Q = obtainStyledAttributes.getDimensionPixelSize(0, -2);
            obtainStyledAttributes.recycle();
        }
        this.Q1 = new a();
    }

    class c extends FragmentStateAdapter {

        /* renamed from: n, reason: collision with root package name */
        private ArrayList<Fragment> f49274n;

        public c(@o0 FragmentActivity fragmentActivity, ArrayList<Fragment> arrayList) {
            super(fragmentActivity);
            new ArrayList();
            this.f49274n = arrayList;
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        @o0
        public Fragment f(int i4) {
            return this.f49274n.get(i4);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            return this.f49274n.size();
        }

        public c(@o0 Fragment fragment, ArrayList<Fragment> arrayList) {
            super(fragment);
            new ArrayList();
            this.f49274n = arrayList;
        }
    }

    public SlidingTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
