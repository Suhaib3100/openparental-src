package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.annotation.c1;
import androidx.core.view.y1;
import com.google.android.material.badge.BadgeDrawable;
import d.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public class LinearLayoutCompat extends ViewGroup {
    public static final int D = 0;
    public static final int E = 1;
    public static final int F = 0;
    public static final int G = 1;
    public static final int H = 2;
    public static final int I = 4;
    private static final int J = 4;
    private static final int K = 0;
    private static final int L = 1;
    private static final int M = 2;
    private static final int N = 3;
    private static final String O = "androidx.appcompat.widget.LinearLayoutCompat";
    private int A;
    private int B;
    private int C;

    /* renamed from: o, reason: collision with root package name */
    private boolean f939o;

    /* renamed from: p, reason: collision with root package name */
    private int f940p;

    /* renamed from: q, reason: collision with root package name */
    private int f941q;

    /* renamed from: r, reason: collision with root package name */
    private int f942r;

    /* renamed from: s, reason: collision with root package name */
    private int f943s;

    /* renamed from: t, reason: collision with root package name */
    private int f944t;

    /* renamed from: u, reason: collision with root package name */
    private float f945u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f946v;

    /* renamed from: w, reason: collision with root package name */
    private int[] f947w;

    /* renamed from: x, reason: collision with root package name */
    private int[] f948x;

    /* renamed from: y, reason: collision with root package name */
    private Drawable f949y;

    /* renamed from: z, reason: collision with root package name */
    private int f950z;

    public static class LayoutParams extends LinearLayout.LayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i5, int i6) {
            super(i5, i6);
        }

        public LayoutParams(int i5, int i6, float f6) {
            super(i5, i6, f6);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public LinearLayoutCompat(@androidx.annotation.o0 Context context) {
        this(context, null);
    }

    private void P(View view, int i5, int i6, int i7, int i8) {
        view.layout(i5, i6, i7 + i5, i8 + i6);
    }

    private void m(int i5, int i6) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), androidx.constraintlayout.solver.widgets.analyzer.b.f2366g);
        for (int i7 = 0; i7 < i5; i7++) {
            View B = B(i7);
            if (B.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) B.getLayoutParams();
                if (((LinearLayout.LayoutParams) layoutParams).height == -1) {
                    int i8 = ((LinearLayout.LayoutParams) layoutParams).width;
                    ((LinearLayout.LayoutParams) layoutParams).width = B.getMeasuredWidth();
                    measureChildWithMargins(B, i6, 0, makeMeasureSpec, 0);
                    ((LinearLayout.LayoutParams) layoutParams).width = i8;
                }
            }
        }
    }

    private void n(int i5, int i6) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), androidx.constraintlayout.solver.widgets.analyzer.b.f2366g);
        for (int i7 = 0; i7 < i5; i7++) {
            View B = B(i7);
            if (B.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) B.getLayoutParams();
                if (((LinearLayout.LayoutParams) layoutParams).width == -1) {
                    int i8 = ((LinearLayout.LayoutParams) layoutParams).height;
                    ((LinearLayout.LayoutParams) layoutParams).height = B.getMeasuredHeight();
                    measureChildWithMargins(B, makeMeasureSpec, 0, i6, 0);
                    ((LinearLayout.LayoutParams) layoutParams).height = i8;
                }
            }
        }
    }

    public int A() {
        return this.B;
    }

    View B(int i5) {
        return getChildAt(i5);
    }

    int C() {
        return getChildCount();
    }

    public float D() {
        return this.f945u;
    }

    @androidx.annotation.c1({c1.a.LIBRARY})
    protected boolean E(int i5) {
        if (i5 == 0) {
            return (this.B & 1) != 0;
        }
        if (i5 == getChildCount()) {
            return (this.B & 4) != 0;
        }
        if ((this.B & 2) == 0) {
            return false;
        }
        for (int i6 = i5 - 1; i6 >= 0; i6--) {
            if (getChildAt(i6).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    public boolean F() {
        return this.f939o;
    }

    public boolean G() {
        return this.f946v;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void H(int r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.H(int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void I(int r18, int r19, int r20, int r21) {
        /*
            r17 = this;
            r6 = r17
            int r7 = r17.getPaddingLeft()
            int r0 = r20 - r18
            int r1 = r17.getPaddingRight()
            int r8 = r0 - r1
            int r0 = r0 - r7
            int r1 = r17.getPaddingRight()
            int r9 = r0 - r1
            int r10 = r17.C()
            int r0 = r6.f943s
            r1 = r0 & 112(0x70, float:1.57E-43)
            r2 = 8388615(0x800007, float:1.1754953E-38)
            r11 = r0 & r2
            r0 = 16
            if (r1 == r0) goto L3b
            r0 = 80
            if (r1 == r0) goto L2f
            int r0 = r17.getPaddingTop()
            goto L47
        L2f:
            int r0 = r17.getPaddingTop()
            int r0 = r0 + r21
            int r0 = r0 - r19
            int r1 = r6.f944t
            int r0 = r0 - r1
            goto L47
        L3b:
            int r0 = r17.getPaddingTop()
            int r1 = r21 - r19
            int r2 = r6.f944t
            int r1 = r1 - r2
            int r1 = r1 / 2
            int r0 = r0 + r1
        L47:
            r1 = 0
            r12 = r1
        L49:
            if (r12 >= r10) goto Lc9
            android.view.View r13 = r6.B(r12)
            r14 = 1
            if (r13 != 0) goto L59
            int r1 = r6.L(r12)
            int r0 = r0 + r1
            goto Lc6
        L59:
            int r1 = r13.getVisibility()
            r2 = 8
            if (r1 == r2) goto Lc6
            int r4 = r13.getMeasuredWidth()
            int r15 = r13.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r1 = r13.getLayoutParams()
            r5 = r1
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r5 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r5
            int r1 = r5.gravity
            if (r1 >= 0) goto L75
            r1 = r11
        L75:
            int r2 = androidx.core.view.y1.Z(r17)
            int r1 = android.view.Gravity.getAbsoluteGravity(r1, r2)
            r1 = r1 & 7
            if (r1 == r14) goto L8d
            r2 = 5
            if (r1 == r2) goto L88
            int r1 = r5.leftMargin
            int r1 = r1 + r7
            goto L98
        L88:
            int r1 = r8 - r4
            int r2 = r5.rightMargin
            goto L97
        L8d:
            int r1 = r9 - r4
            int r1 = r1 / 2
            int r1 = r1 + r7
            int r2 = r5.leftMargin
            int r1 = r1 + r2
            int r2 = r5.rightMargin
        L97:
            int r1 = r1 - r2
        L98:
            r2 = r1
            boolean r1 = r6.E(r12)
            if (r1 == 0) goto La2
            int r1 = r6.A
            int r0 = r0 + r1
        La2:
            int r1 = r5.topMargin
            int r16 = r0 + r1
            int r0 = r6.x(r13)
            int r3 = r16 + r0
            r0 = r17
            r1 = r13
            r14 = r5
            r5 = r15
            r0.P(r1, r2, r3, r4, r5)
            int r0 = r14.bottomMargin
            int r15 = r15 + r0
            int r0 = r6.y(r13)
            int r15 = r15 + r0
            int r15 = r15 + r16
            int r0 = r6.s(r13, r12)
            int r12 = r12 + r0
            r0 = r15
            r1 = 1
            goto Lc7
        Lc6:
            r1 = r14
        Lc7:
            int r12 = r12 + r1
            goto L49
        Lc9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.I(int, int, int, int):void");
    }

    void J(View view, int i5, int i6, int i7, int i8, int i9) {
        measureChildWithMargins(view, i6, i7, i8, i9);
    }

    /* JADX WARN: Removed duplicated region for block: B:195:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void K(int r39, int r40) {
        /*
            Method dump skipped, instructions count: 1293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.K(int, int):void");
    }

    int L(int i5) {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:158:0x0327  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void M(int r34, int r35) {
        /*
            Method dump skipped, instructions count: 916
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.M(int, int):void");
    }

    public void N(boolean z5) {
        this.f939o = z5;
    }

    public void O(int i5) {
        if (i5 >= 0 && i5 < getChildCount()) {
            this.f940p = i5;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void Q(Drawable drawable) {
        if (drawable == this.f949y) {
            return;
        }
        this.f949y = drawable;
        if (drawable != null) {
            this.f950z = drawable.getIntrinsicWidth();
            this.A = drawable.getIntrinsicHeight();
        } else {
            this.f950z = 0;
            this.A = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void R(int i5) {
        this.C = i5;
    }

    public void S(int i5) {
        if (this.f943s != i5) {
            if ((8388615 & i5) == 0) {
                i5 |= androidx.core.view.d0.f5464b;
            }
            if ((i5 & 112) == 0) {
                i5 |= 48;
            }
            this.f943s = i5;
            requestLayout();
        }
    }

    public void T(int i5) {
        int i6 = i5 & androidx.core.view.d0.f5466d;
        int i7 = this.f943s;
        if ((8388615 & i7) != i6) {
            this.f943s = i6 | ((-8388616) & i7);
            requestLayout();
        }
    }

    public void U(boolean z5) {
        this.f946v = z5;
    }

    public void V(int i5) {
        if (this.f942r != i5) {
            this.f942r = i5;
            requestLayout();
        }
    }

    public void W(int i5) {
        if (i5 != this.B) {
            requestLayout();
        }
        this.B = i5;
    }

    public void X(int i5) {
        int i6 = i5 & 112;
        int i7 = this.f943s;
        if ((i7 & 112) != i6) {
            this.f943s = i6 | (i7 & (-113));
            requestLayout();
        }
    }

    public void Y(float f6) {
        this.f945u = Math.max(0.0f, f6);
    }

    void b(Canvas canvas) {
        int right;
        int left;
        int i5;
        int C = C();
        boolean b6 = g1.b(this);
        for (int i6 = 0; i6 < C; i6++) {
            View B = B(i6);
            if (B != null && B.getVisibility() != 8 && E(i6)) {
                LayoutParams layoutParams = (LayoutParams) B.getLayoutParams();
                j(canvas, b6 ? B.getRight() + ((LinearLayout.LayoutParams) layoutParams).rightMargin : (B.getLeft() - ((LinearLayout.LayoutParams) layoutParams).leftMargin) - this.f950z);
            }
        }
        if (E(C)) {
            View B2 = B(C - 1);
            if (B2 != null) {
                LayoutParams layoutParams2 = (LayoutParams) B2.getLayoutParams();
                if (b6) {
                    left = B2.getLeft() - ((LinearLayout.LayoutParams) layoutParams2).leftMargin;
                    i5 = this.f950z;
                    right = left - i5;
                } else {
                    right = B2.getRight() + ((LinearLayout.LayoutParams) layoutParams2).rightMargin;
                }
            } else if (b6) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i5 = this.f950z;
                right = left - i5;
            }
            j(canvas, right);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    void f(Canvas canvas) {
        int C = C();
        for (int i5 = 0; i5 < C; i5++) {
            View B = B(i5);
            if (B != null && B.getVisibility() != 8 && E(i5)) {
                i(canvas, (B.getTop() - ((LinearLayout.LayoutParams) ((LayoutParams) B.getLayoutParams())).topMargin) - this.A);
            }
        }
        if (E(C)) {
            View B2 = B(C - 1);
            i(canvas, B2 == null ? (getHeight() - getPaddingBottom()) - this.A : B2.getBottom() + ((LinearLayout.LayoutParams) ((LayoutParams) B2.getLayoutParams())).bottomMargin);
        }
    }

    @Override // android.view.View
    public int getBaseline() {
        int i5;
        if (this.f940p < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i6 = this.f940p;
        if (childCount <= i6) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i6);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f940p == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i7 = this.f941q;
        if (this.f942r == 1 && (i5 = this.f943s & 112) != 48) {
            if (i5 == 16) {
                i7 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f944t) / 2;
            } else if (i5 == 80) {
                i7 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f944t;
            }
        }
        return i7 + ((LinearLayout.LayoutParams) ((LayoutParams) childAt.getLayoutParams())).topMargin + baseline;
    }

    void i(Canvas canvas, int i5) {
        this.f949y.setBounds(getPaddingLeft() + this.C, i5, (getWidth() - getPaddingRight()) - this.C, this.A + i5);
        this.f949y.draw(canvas);
    }

    void j(Canvas canvas, int i5) {
        this.f949y.setBounds(i5, getPaddingTop() + this.C, this.f950z + i5, (getHeight() - getPaddingBottom()) - this.C);
        this.f949y.draw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        int i5 = this.f942r;
        if (i5 == 0) {
            return new LayoutParams(-2, -2);
        }
        if (i5 == 1) {
            return new LayoutParams(-1, -2);
        }
        return null;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f949y == null) {
            return;
        }
        if (this.f942r == 1) {
            f(canvas);
        } else {
            b(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z5, int i5, int i6, int i7, int i8) {
        if (this.f942r == 1) {
            I(i5, i6, i7, i8);
        } else {
            H(i5, i6, i7, i8);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i5, int i6) {
        if (this.f942r == 1) {
            M(i5, i6);
        } else {
            K(i5, i6);
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public int r() {
        return this.f940p;
    }

    int s(View view, int i5) {
        return 0;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public Drawable t() {
        return this.f949y;
    }

    public int u() {
        return this.C;
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public int v() {
        return this.f950z;
    }

    public int w() {
        return this.f943s;
    }

    int x(View view) {
        return 0;
    }

    int y(View view) {
        return 0;
    }

    public int z() {
        return this.f942r;
    }

    public LinearLayoutCompat(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinearLayoutCompat(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.f939o = true;
        this.f940p = -1;
        this.f941q = 0;
        this.f943s = BadgeDrawable.F;
        int[] iArr = a.n.P4;
        z0 G2 = z0.G(context, attributeSet, iArr, i5, 0);
        y1.z1(this, context, iArr, attributeSet, G2.B(), i5, 0);
        int o5 = G2.o(a.n.R4, -1);
        if (o5 >= 0) {
            V(o5);
        }
        int o6 = G2.o(a.n.Q4, -1);
        if (o6 >= 0) {
            S(o6);
        }
        boolean a6 = G2.a(a.n.S4, true);
        if (!a6) {
            N(a6);
        }
        this.f945u = G2.j(a.n.U4, -1.0f);
        this.f940p = G2.o(a.n.T4, -1);
        this.f946v = G2.a(a.n.X4, false);
        Q(G2.h(a.n.V4));
        this.B = G2.o(a.n.Y4, 0);
        this.C = G2.g(a.n.W4, 0);
        G2.I();
    }
}
