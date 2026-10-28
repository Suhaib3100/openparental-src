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
import androidx.core.view.x1;
import com.google.android.material.badge.BadgeDrawable;
import d.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public class LinearLayoutCompat extends ViewGroup {
    private static final int A = 3;
    private static final String B = "androidx.appcompat.widget.LinearLayoutCompat";

    /* renamed from: q, reason: collision with root package name */
    public static final int f1535q = 0;

    /* renamed from: r, reason: collision with root package name */
    public static final int f1536r = 1;

    /* renamed from: s, reason: collision with root package name */
    public static final int f1537s = 0;

    /* renamed from: t, reason: collision with root package name */
    public static final int f1538t = 1;

    /* renamed from: u, reason: collision with root package name */
    public static final int f1539u = 2;

    /* renamed from: v, reason: collision with root package name */
    public static final int f1540v = 4;

    /* renamed from: w, reason: collision with root package name */
    private static final int f1541w = 4;

    /* renamed from: x, reason: collision with root package name */
    private static final int f1542x = 0;

    /* renamed from: y, reason: collision with root package name */
    private static final int f1543y = 1;

    /* renamed from: z, reason: collision with root package name */
    private static final int f1544z = 2;

    /* renamed from: b, reason: collision with root package name */
    private boolean f1545b;

    /* renamed from: c, reason: collision with root package name */
    private int f1546c;

    /* renamed from: d, reason: collision with root package name */
    private int f1547d;

    /* renamed from: e, reason: collision with root package name */
    private int f1548e;

    /* renamed from: f, reason: collision with root package name */
    private int f1549f;

    /* renamed from: g, reason: collision with root package name */
    private int f1550g;

    /* renamed from: h, reason: collision with root package name */
    private float f1551h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f1552i;

    /* renamed from: j, reason: collision with root package name */
    private int[] f1553j;

    /* renamed from: k, reason: collision with root package name */
    private int[] f1554k;

    /* renamed from: l, reason: collision with root package name */
    private Drawable f1555l;

    /* renamed from: m, reason: collision with root package name */
    private int f1556m;

    /* renamed from: n, reason: collision with root package name */
    private int f1557n;

    /* renamed from: o, reason: collision with root package name */
    private int f1558o;

    /* renamed from: p, reason: collision with root package name */
    private int f1559p;

    public static class LayoutParams extends LinearLayout.LayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i4, int i5) {
            super(i4, i5);
        }

        public LayoutParams(int i4, int i5, float f4) {
            super(i4, i5, f4);
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

    private void R(View view, int i4, int i5, int i6, int i7) {
        view.layout(i4, i5, i6 + i4, i7 + i5);
    }

    private void o(int i4, int i5) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i6 = 0; i6 < i4; i6++) {
            View D = D(i6);
            if (D.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) D.getLayoutParams();
                if (((LinearLayout.LayoutParams) layoutParams).height == -1) {
                    int i7 = ((LinearLayout.LayoutParams) layoutParams).width;
                    ((LinearLayout.LayoutParams) layoutParams).width = D.getMeasuredWidth();
                    measureChildWithMargins(D, i5, 0, makeMeasureSpec, 0);
                    ((LinearLayout.LayoutParams) layoutParams).width = i7;
                }
            }
        }
    }

    private void p(int i4, int i5) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i6 = 0; i6 < i4; i6++) {
            View D = D(i6);
            if (D.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) D.getLayoutParams();
                if (((LinearLayout.LayoutParams) layoutParams).width == -1) {
                    int i7 = ((LinearLayout.LayoutParams) layoutParams).height;
                    ((LinearLayout.LayoutParams) layoutParams).height = D.getMeasuredHeight();
                    measureChildWithMargins(D, makeMeasureSpec, 0, i5, 0);
                    ((LinearLayout.LayoutParams) layoutParams).height = i7;
                }
            }
        }
    }

    int A(View view) {
        return 0;
    }

    public int B() {
        return this.f1548e;
    }

    public int C() {
        return this.f1558o;
    }

    View D(int i4) {
        return getChildAt(i4);
    }

    int E() {
        return getChildCount();
    }

    public float F() {
        return this.f1551h;
    }

    @androidx.annotation.c1({c1.a.LIBRARY})
    protected boolean G(int i4) {
        if (i4 == 0) {
            return (this.f1558o & 1) != 0;
        }
        if (i4 == getChildCount()) {
            return (this.f1558o & 4) != 0;
        }
        if ((this.f1558o & 2) == 0) {
            return false;
        }
        for (int i5 = i4 - 1; i5 >= 0; i5--) {
            if (getChildAt(i5).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    public boolean H() {
        return this.f1545b;
    }

    public boolean I() {
        return this.f1552i;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void J(int r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.J(int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void K(int r19, int r20, int r21, int r22) {
        /*
            r18 = this;
            r6 = r18
            int r7 = r18.getPaddingLeft()
            int r0 = r21 - r19
            int r1 = r18.getPaddingRight()
            int r8 = r0 - r1
            int r0 = r0 - r7
            int r1 = r18.getPaddingRight()
            int r9 = r0 - r1
            int r10 = r18.E()
            int r0 = r6.f1549f
            r1 = r0 & 112(0x70, float:1.57E-43)
            r2 = 8388615(0x800007, float:1.1754953E-38)
            r11 = r0 & r2
            r0 = 16
            r12 = 2
            if (r1 == r0) goto L3c
            r0 = 80
            if (r1 == r0) goto L30
            int r0 = r18.getPaddingTop()
            goto L48
        L30:
            int r0 = r18.getPaddingTop()
            int r0 = r0 + r22
            int r0 = r0 - r20
            int r1 = r6.f1550g
            int r0 = r0 - r1
            goto L48
        L3c:
            int r0 = r18.getPaddingTop()
            int r1 = r22 - r20
            int r2 = r6.f1550g
            int r0 = androidx.appcompat.widget.a.a(r1, r2, r12, r0)
        L48:
            r1 = 0
            r13 = r1
        L4a:
            if (r13 >= r10) goto Lcd
            android.view.View r14 = r6.D(r13)
            r15 = 1
            if (r14 != 0) goto L5a
            int r1 = r6.N(r13)
            int r0 = r0 + r1
            goto Lc9
        L5a:
            int r1 = r14.getVisibility()
            r2 = 8
            if (r1 == r2) goto Lc9
            int r4 = r14.getMeasuredWidth()
            int r16 = r14.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r1 = r14.getLayoutParams()
            r5 = r1
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r5 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r5
            int r1 = r5.gravity
            if (r1 >= 0) goto L76
            r1 = r11
        L76:
            int r2 = androidx.core.view.x1.c0(r18)
            int r1 = android.view.Gravity.getAbsoluteGravity(r1, r2)
            r1 = r1 & 7
            if (r1 == r15) goto L90
            r2 = 5
            if (r1 == r2) goto L8a
            int r1 = r5.leftMargin
            int r1 = r1 + r7
        L88:
            r2 = r1
            goto L9a
        L8a:
            int r1 = r8 - r4
            int r2 = r5.rightMargin
        L8e:
            int r1 = r1 - r2
            goto L88
        L90:
            int r1 = androidx.appcompat.widget.a.a(r9, r4, r12, r7)
            int r2 = r5.leftMargin
            int r1 = r1 + r2
            int r2 = r5.rightMargin
            goto L8e
        L9a:
            boolean r1 = r6.G(r13)
            if (r1 == 0) goto La3
            int r1 = r6.f1557n
            int r0 = r0 + r1
        La3:
            int r1 = r5.topMargin
            int r17 = r0 + r1
            int r0 = r6.z(r14)
            int r3 = r17 + r0
            r0 = r18
            r1 = r14
            r12 = r5
            r5 = r16
            r0.R(r1, r2, r3, r4, r5)
            int r0 = r12.bottomMargin
            int r16 = r16 + r0
            int r0 = r6.A(r14)
            int r16 = r16 + r0
            int r16 = r16 + r17
            int r0 = r6.u(r14, r13)
            int r13 = r13 + r0
            r0 = r16
        Lc9:
            int r13 = r13 + r15
            r12 = 2
            goto L4a
        Lcd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.K(int, int, int, int):void");
    }

    void L(View view, int i4, int i5, int i6, int i7, int i10) {
        measureChildWithMargins(view, i5, i6, i7, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:200:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void M(int r40, int r41) {
        /*
            Method dump skipped, instructions count: 1295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.M(int, int):void");
    }

    int N(int i4) {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x031d, code lost:
    
        if (((android.widget.LinearLayout.LayoutParams) r14).width == (-1)) goto L147;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void O(int r34, int r35) {
        /*
            Method dump skipped, instructions count: 912
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.O(int, int):void");
    }

    public void P(boolean z4) {
        this.f1545b = z4;
    }

    public void Q(int i4) {
        if (i4 >= 0 && i4 < getChildCount()) {
            this.f1546c = i4;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void S(Drawable drawable) {
        if (drawable == this.f1555l) {
            return;
        }
        this.f1555l = drawable;
        if (drawable != null) {
            this.f1556m = drawable.getIntrinsicWidth();
            this.f1557n = drawable.getIntrinsicHeight();
        } else {
            this.f1556m = 0;
            this.f1557n = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void T(int i4) {
        this.f1559p = i4;
    }

    public void U(@androidx.annotation.a0 int i4) {
        if (this.f1549f != i4) {
            if ((8388615 & i4) == 0) {
                i4 |= androidx.core.view.f0.f27129b;
            }
            if ((i4 & 112) == 0) {
                i4 |= 48;
            }
            this.f1549f = i4;
            requestLayout();
        }
    }

    public void V(int i4) {
        int i5 = i4 & androidx.core.view.f0.f27131d;
        int i6 = this.f1549f;
        if ((8388615 & i6) != i5) {
            this.f1549f = i5 | ((-8388616) & i6);
            requestLayout();
        }
    }

    public void W(boolean z4) {
        this.f1552i = z4;
    }

    public void X(int i4) {
        if (this.f1548e != i4) {
            this.f1548e = i4;
            requestLayout();
        }
    }

    public void Y(int i4) {
        if (i4 != this.f1558o) {
            requestLayout();
        }
        this.f1558o = i4;
    }

    public void Z(int i4) {
        int i5 = i4 & 112;
        int i6 = this.f1549f;
        if ((i6 & 112) != i5) {
            this.f1549f = i5 | (i6 & (-113));
            requestLayout();
        }
    }

    public void a0(float f4) {
        this.f1551h = Math.max(0.0f, f4);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.View
    public int getBaseline() {
        int i4;
        if (this.f1546c < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i5 = this.f1546c;
        if (childCount <= i5) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i5);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f1546c == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i6 = this.f1547d;
        if (this.f1548e == 1 && (i4 = this.f1549f & 112) != 48) {
            if (i4 == 16) {
                i6 = androidx.appcompat.widget.a.a(((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom(), this.f1550g, 2, i6);
            } else if (i4 == 80) {
                i6 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f1550g;
            }
        }
        return i6 + ((LinearLayout.LayoutParams) ((LayoutParams) childAt.getLayoutParams())).topMargin + baseline;
    }

    void k(Canvas canvas) {
        int right;
        int left;
        int i4;
        int E = E();
        boolean b5 = e1.b(this);
        for (int i5 = 0; i5 < E; i5++) {
            View D = D(i5);
            if (D != null && D.getVisibility() != 8 && G(i5)) {
                LayoutParams layoutParams = (LayoutParams) D.getLayoutParams();
                n(canvas, b5 ? D.getRight() + ((LinearLayout.LayoutParams) layoutParams).rightMargin : (D.getLeft() - ((LinearLayout.LayoutParams) layoutParams).leftMargin) - this.f1556m);
            }
        }
        if (G(E)) {
            View D2 = D(E - 1);
            if (D2 != null) {
                LayoutParams layoutParams2 = (LayoutParams) D2.getLayoutParams();
                if (b5) {
                    left = D2.getLeft() - ((LinearLayout.LayoutParams) layoutParams2).leftMargin;
                    i4 = this.f1556m;
                    right = left - i4;
                } else {
                    right = D2.getRight() + ((LinearLayout.LayoutParams) layoutParams2).rightMargin;
                }
            } else if (b5) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i4 = this.f1556m;
                right = left - i4;
            }
            n(canvas, right);
        }
    }

    void l(Canvas canvas) {
        int E = E();
        for (int i4 = 0; i4 < E; i4++) {
            View D = D(i4);
            if (D != null && D.getVisibility() != 8 && G(i4)) {
                m(canvas, (D.getTop() - ((LinearLayout.LayoutParams) ((LayoutParams) D.getLayoutParams())).topMargin) - this.f1557n);
            }
        }
        if (G(E)) {
            View D2 = D(E - 1);
            m(canvas, D2 == null ? (getHeight() - getPaddingBottom()) - this.f1557n : D2.getBottom() + ((LinearLayout.LayoutParams) ((LayoutParams) D2.getLayoutParams())).bottomMargin);
        }
    }

    void m(Canvas canvas, int i4) {
        this.f1555l.setBounds(getPaddingLeft() + this.f1559p, i4, (getWidth() - getPaddingRight()) - this.f1559p, this.f1557n + i4);
        this.f1555l.draw(canvas);
    }

    void n(Canvas canvas, int i4) {
        this.f1555l.setBounds(i4, getPaddingTop() + this.f1559p, this.f1556m + i4, (getHeight() - getPaddingBottom()) - this.f1559p);
        this.f1555l.draw(canvas);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f1555l == null) {
            return;
        }
        if (this.f1548e == 1) {
            l(canvas);
        } else {
            k(canvas);
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
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        if (this.f1548e == 1) {
            K(i4, i5, i6, i7);
        } else {
            J(i4, i5, i6, i7);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        if (this.f1548e == 1) {
            O(i4, i5);
        } else {
            M(i4, i5);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        int i4 = this.f1548e;
        if (i4 == 0) {
            return new LayoutParams(-2, -2);
        }
        if (i4 == 1) {
            return new LayoutParams(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public int t() {
        return this.f1546c;
    }

    int u(View view, int i4) {
        return 0;
    }

    public Drawable v() {
        return this.f1555l;
    }

    public int w() {
        return this.f1559p;
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public int x() {
        return this.f1556m;
    }

    @androidx.annotation.a0
    public int y() {
        return this.f1549f;
    }

    int z(View view) {
        return 0;
    }

    public LinearLayoutCompat(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinearLayoutCompat(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f1545b = true;
        this.f1546c = -1;
        this.f1547d = 0;
        this.f1549f = BadgeDrawable.f52614s;
        int[] iArr = a.m.L3;
        t0 G = t0.G(context, attributeSet, iArr, i4, 0);
        x1.F1(this, context, iArr, attributeSet, G.B(), i4, 0);
        int o4 = G.o(a.m.N3, -1);
        if (o4 >= 0) {
            X(o4);
        }
        int o5 = G.o(a.m.M3, -1);
        if (o5 >= 0) {
            U(o5);
        }
        boolean a5 = G.a(a.m.O3, true);
        if (!a5) {
            P(a5);
        }
        this.f1551h = G.j(a.m.Q3, -1.0f);
        this.f1546c = G.o(a.m.P3, -1);
        this.f1552i = G.a(a.m.T3, false);
        S(G.h(a.m.R3));
        this.f1558o = G.o(a.m.U3, 0);
        this.f1559p = G.g(a.m.S3, 0);
        G.I();
    }
}
