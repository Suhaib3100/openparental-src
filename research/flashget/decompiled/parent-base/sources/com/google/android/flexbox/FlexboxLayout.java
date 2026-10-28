package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.q0;
import androidx.core.view.x1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.flexbox.h;
import j4.o;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public class FlexboxLayout extends ViewGroup implements d {

    /* renamed from: s, reason: collision with root package name */
    public static final int f52327s = 0;

    /* renamed from: t, reason: collision with root package name */
    public static final int f52328t = 1;

    /* renamed from: u, reason: collision with root package name */
    public static final int f52329u = 2;

    /* renamed from: v, reason: collision with root package name */
    public static final int f52330v = 4;

    /* renamed from: b, reason: collision with root package name */
    private int f52331b;

    /* renamed from: c, reason: collision with root package name */
    private int f52332c;

    /* renamed from: d, reason: collision with root package name */
    private int f52333d;

    /* renamed from: e, reason: collision with root package name */
    private int f52334e;

    /* renamed from: f, reason: collision with root package name */
    private int f52335f;

    /* renamed from: g, reason: collision with root package name */
    private int f52336g;

    /* renamed from: h, reason: collision with root package name */
    @q0
    private Drawable f52337h;

    /* renamed from: i, reason: collision with root package name */
    @q0
    private Drawable f52338i;

    /* renamed from: j, reason: collision with root package name */
    private int f52339j;

    /* renamed from: k, reason: collision with root package name */
    private int f52340k;

    /* renamed from: l, reason: collision with root package name */
    private int f52341l;

    /* renamed from: m, reason: collision with root package name */
    private int f52342m;

    /* renamed from: n, reason: collision with root package name */
    private int[] f52343n;

    /* renamed from: o, reason: collision with root package name */
    private SparseIntArray f52344o;

    /* renamed from: p, reason: collision with root package name */
    private h f52345p;

    /* renamed from: q, reason: collision with root package name */
    private List<f> f52346q;

    /* renamed from: r, reason: collision with root package name */
    private h.a f52347r;

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public FlexboxLayout(Context context) {
        this(context, null);
    }

    private boolean C(int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            if (this.f52346q.get(i5).d() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean D(int i4, int i5) {
        for (int i6 = 1; i6 <= i5; i6++) {
            View L = L(i4 - i6);
            if (L != null && L.getVisibility() != 8) {
                return false;
            }
        }
        return true;
    }

    private void E(Canvas canvas, boolean z4, boolean z5) {
        int paddingLeft = getPaddingLeft();
        int max = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.f52346q.size();
        for (int i4 = 0; i4 < size; i4++) {
            f fVar = this.f52346q.get(i4);
            for (int i5 = 0; i5 < fVar.f52426h; i5++) {
                int i6 = fVar.f52433o + i5;
                View L = L(i6);
                if (L != null && L.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) L.getLayoutParams();
                    if (O(i6, i5)) {
                        H(canvas, z4 ? L.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : (L.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.f52342m, fVar.f52420b, fVar.f52425g);
                    }
                    if (i5 == fVar.f52426h - 1 && (this.f52340k & 4) > 0) {
                        H(canvas, z4 ? (L.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.f52342m : L.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, fVar.f52420b, fVar.f52425g);
                    }
                }
            }
            if (P(i4)) {
                G(canvas, paddingLeft, z5 ? fVar.f52422d : fVar.f52420b - this.f52341l, max);
            }
            if (Q(i4) && (this.f52339j & 4) > 0) {
                G(canvas, paddingLeft, z5 ? fVar.f52420b - this.f52341l : fVar.f52422d, max);
            }
        }
    }

    private void F(Canvas canvas, boolean z4, boolean z5) {
        int paddingTop = getPaddingTop();
        int max = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.f52346q.size();
        for (int i4 = 0; i4 < size; i4++) {
            f fVar = this.f52346q.get(i4);
            for (int i5 = 0; i5 < fVar.f52426h; i5++) {
                int i6 = fVar.f52433o + i5;
                View L = L(i6);
                if (L != null && L.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) L.getLayoutParams();
                    if (O(i6, i5)) {
                        G(canvas, fVar.f52419a, z5 ? L.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : (L.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.f52341l, fVar.f52425g);
                    }
                    if (i5 == fVar.f52426h - 1 && (this.f52339j & 4) > 0) {
                        G(canvas, fVar.f52419a, z5 ? (L.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.f52341l : L.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, fVar.f52425g);
                    }
                }
            }
            if (P(i4)) {
                H(canvas, z4 ? fVar.f52421c : fVar.f52419a - this.f52342m, paddingTop, max);
            }
            if (Q(i4) && (this.f52340k & 4) > 0) {
                H(canvas, z4 ? fVar.f52419a - this.f52342m : fVar.f52421c, paddingTop, max);
            }
        }
    }

    private void G(Canvas canvas, int i4, int i5, int i6) {
        Drawable drawable = this.f52337h;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i4, i5, i6 + i4, this.f52341l + i5);
        this.f52337h.draw(canvas);
    }

    private void H(Canvas canvas, int i4, int i5, int i6) {
        Drawable drawable = this.f52338i;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i4, i5, this.f52342m + i4, i6 + i5);
        this.f52338i.draw(canvas);
    }

    private boolean O(int i4, int i5) {
        return D(i4, i5) ? A() ? (this.f52340k & 1) != 0 : (this.f52339j & 1) != 0 : A() ? (this.f52340k & 2) != 0 : (this.f52339j & 2) != 0;
    }

    private boolean P(int i4) {
        if (i4 < 0 || i4 >= this.f52346q.size()) {
            return false;
        }
        return C(i4) ? A() ? (this.f52339j & 1) != 0 : (this.f52340k & 1) != 0 : A() ? (this.f52339j & 2) != 0 : (this.f52340k & 2) != 0;
    }

    private boolean Q(int i4) {
        if (i4 < 0 || i4 >= this.f52346q.size()) {
            return false;
        }
        for (int i5 = i4 + 1; i5 < this.f52346q.size(); i5++) {
            if (this.f52346q.get(i5).d() > 0) {
                return false;
            }
        }
        return A() ? (this.f52339j & 4) != 0 : (this.f52340k & 4) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0191  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void R(boolean r29, int r30, int r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 561
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.R(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0187  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void S(boolean r30, boolean r31, int r32, int r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 543
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.S(boolean, boolean, int, int, int, int):void");
    }

    private void T(int i4, int i5) {
        this.f52346q.clear();
        this.f52347r.a();
        this.f52345p.c(this.f52347r, i4, i5);
        this.f52346q = this.f52347r.f52448a;
        this.f52345p.p(i4, i5);
        if (this.f52334e == 3) {
            for (f fVar : this.f52346q) {
                int i6 = Integer.MIN_VALUE;
                for (int i7 = 0; i7 < fVar.f52426h; i7++) {
                    View L = L(fVar.f52433o + i7);
                    if (L != null && L.getVisibility() != 8) {
                        LayoutParams layoutParams = (LayoutParams) L.getLayoutParams();
                        i6 = this.f52332c != 2 ? Math.max(i6, L.getMeasuredHeight() + Math.max(fVar.f52430l - L.getBaseline(), ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) : Math.max(i6, L.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + Math.max(L.getBaseline() + (fVar.f52430l - L.getMeasuredHeight()), ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin));
                    }
                }
                fVar.f52425g = i6;
            }
        }
        this.f52345p.o(i4, i5, getPaddingBottom() + getPaddingTop());
        this.f52345p.X();
        Y(this.f52331b, i4, i5, this.f52347r.f52449b);
    }

    private void U(int i4, int i5) {
        this.f52346q.clear();
        this.f52347r.a();
        this.f52345p.f(this.f52347r, i4, i5);
        this.f52346q = this.f52347r.f52448a;
        this.f52345p.p(i4, i5);
        this.f52345p.o(i4, i5, getPaddingRight() + getPaddingLeft());
        this.f52345p.X();
        Y(this.f52331b, i4, i5, this.f52347r.f52449b);
    }

    private void Y(int i4, int i5, int i6, int i7) {
        int paddingBottom;
        int e4;
        int resolveSizeAndState;
        int resolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        int mode2 = View.MeasureSpec.getMode(i6);
        int size2 = View.MeasureSpec.getSize(i6);
        if (i4 == 0 || i4 == 1) {
            paddingBottom = getPaddingBottom() + getPaddingTop() + w();
            e4 = e();
        } else {
            if (i4 != 2 && i4 != 3) {
                throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("욬"), i4));
            }
            paddingBottom = e();
            e4 = getPaddingRight() + getPaddingLeft() + w();
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < e4) {
                i7 = View.combineMeasuredStates(i7, 16777216);
            } else {
                size = e4;
            }
            resolveSizeAndState = View.resolveSizeAndState(size, i5, i7);
        } else if (mode == 0) {
            resolveSizeAndState = View.resolveSizeAndState(e4, i5, i7);
        } else {
            if (mode != 1073741824) {
                throw new IllegalStateException(android.support.v4.media.a.a(ProtectedSandApp.s("욭"), mode));
            }
            if (size < e4) {
                i7 = View.combineMeasuredStates(i7, 16777216);
            }
            resolveSizeAndState = View.resolveSizeAndState(size, i5, i7);
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < paddingBottom) {
                i7 = View.combineMeasuredStates(i7, 256);
            } else {
                size2 = paddingBottom;
            }
            resolveSizeAndState2 = View.resolveSizeAndState(size2, i6, i7);
        } else if (mode2 == 0) {
            resolveSizeAndState2 = View.resolveSizeAndState(paddingBottom, i6, i7);
        } else {
            if (mode2 != 1073741824) {
                throw new IllegalStateException(android.support.v4.media.a.a(ProtectedSandApp.s("욮"), mode2));
            }
            if (size2 < paddingBottom) {
                i7 = View.combineMeasuredStates(i7, 256);
            }
            resolveSizeAndState2 = View.resolveSizeAndState(size2, i6, i7);
        }
        setMeasuredDimension(resolveSizeAndState, resolveSizeAndState2);
    }

    private void c0() {
        if (this.f52337h == null && this.f52338i == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
    }

    @Override // com.google.android.flexbox.d
    public boolean A() {
        int i4 = this.f52331b;
        return i4 == 0 || i4 == 1;
    }

    @Override // com.google.android.flexbox.d
    public int B() {
        return this.f52333d;
    }

    @Override // android.view.ViewGroup
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @q0
    public Drawable J() {
        return this.f52337h;
    }

    @q0
    public Drawable K() {
        return this.f52338i;
    }

    public View L(int i4) {
        if (i4 < 0) {
            return null;
        }
        int[] iArr = this.f52343n;
        if (i4 >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i4]);
    }

    public int M() {
        return this.f52339j;
    }

    public int N() {
        return this.f52340k;
    }

    public void V(Drawable drawable) {
        W(drawable);
        X(drawable);
    }

    public void W(@q0 Drawable drawable) {
        if (drawable == this.f52337h) {
            return;
        }
        this.f52337h = drawable;
        if (drawable != null) {
            this.f52341l = drawable.getIntrinsicHeight();
        } else {
            this.f52341l = 0;
        }
        c0();
        requestLayout();
    }

    public void X(@q0 Drawable drawable) {
        if (drawable == this.f52338i) {
            return;
        }
        this.f52338i = drawable;
        if (drawable != null) {
            this.f52342m = drawable.getIntrinsicWidth();
        } else {
            this.f52342m = 0;
        }
        c0();
        requestLayout();
    }

    public void Z(int i4) {
        b0(i4);
        a0(i4);
    }

    @Override // com.google.android.flexbox.d
    public int a() {
        return getChildCount();
    }

    public void a0(int i4) {
        if (i4 != this.f52339j) {
            this.f52339j = i4;
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        if (this.f52344o == null) {
            this.f52344o = new SparseIntArray(getChildCount());
        }
        this.f52343n = this.f52345p.n(view, i4, layoutParams, this.f52344o);
        super.addView(view, i4, layoutParams);
    }

    @Override // com.google.android.flexbox.d
    public void b(View view, int i4, int i5, f fVar) {
        if (O(i4, i5)) {
            if (A()) {
                int i6 = fVar.f52423e;
                int i7 = this.f52342m;
                fVar.f52423e = i6 + i7;
                fVar.f52424f += i7;
                return;
            }
            int i10 = fVar.f52423e;
            int i11 = this.f52341l;
            fVar.f52423e = i10 + i11;
            fVar.f52424f += i11;
        }
    }

    public void b0(int i4) {
        if (i4 != this.f52340k) {
            this.f52340k = i4;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.d
    public int c() {
        return this.f52331b;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // com.google.android.flexbox.d
    public int d() {
        return this.f52336g;
    }

    @Override // com.google.android.flexbox.d
    public int e() {
        Iterator<f> it = this.f52346q.iterator();
        int i4 = Integer.MIN_VALUE;
        while (it.hasNext()) {
            i4 = Math.max(i4, it.next().f52423e);
        }
        return i4;
    }

    @Override // com.google.android.flexbox.d
    public int f(int i4, int i5, int i6) {
        return ViewGroup.getChildMeasureSpec(i4, i5, i6);
    }

    @Override // com.google.android.flexbox.d
    public List<f> g() {
        ArrayList arrayList = new ArrayList(this.f52346q.size());
        for (f fVar : this.f52346q) {
            if (fVar.d() != 0) {
                arrayList.add(fVar);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.flexbox.d
    public View h(int i4) {
        return getChildAt(i4);
    }

    @Override // com.google.android.flexbox.d
    public List<f> i() {
        return this.f52346q;
    }

    @Override // com.google.android.flexbox.d
    public int j(int i4, int i5, int i6) {
        return ViewGroup.getChildMeasureSpec(i4, i5, i6);
    }

    @Override // com.google.android.flexbox.d
    public int k() {
        return this.f52335f;
    }

    @Override // com.google.android.flexbox.d
    public void l(int i4) {
        if (this.f52331b != i4) {
            this.f52331b = i4;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.d
    public void m(int i4) {
        if (this.f52332c != i4) {
            this.f52332c = i4;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.d
    public void n(int i4) {
        if (this.f52336g != i4) {
            this.f52336g = i4;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.d
    public void o(int i4) {
        if (this.f52335f != i4) {
            this.f52335f = i4;
            requestLayout();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f52338i == null && this.f52337h == null) {
            return;
        }
        if (this.f52339j == 0 && this.f52340k == 0) {
            return;
        }
        int c02 = x1.c0(this);
        int i4 = this.f52331b;
        if (i4 == 0) {
            E(canvas, c02 == 1, this.f52332c == 2);
            return;
        }
        if (i4 == 1) {
            E(canvas, c02 != 1, this.f52332c == 2);
            return;
        }
        if (i4 == 2) {
            boolean z4 = c02 == 1;
            if (this.f52332c == 2) {
                z4 = !z4;
            }
            F(canvas, z4, false);
            return;
        }
        if (i4 != 3) {
            return;
        }
        boolean z5 = c02 == 1;
        if (this.f52332c == 2) {
            z5 = !z5;
        }
        F(canvas, z5, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        boolean z5;
        int c02 = x1.c0(this);
        int i10 = this.f52331b;
        if (i10 == 0) {
            R(c02 == 1, i4, i5, i6, i7);
            return;
        }
        if (i10 == 1) {
            R(c02 != 1, i4, i5, i6, i7);
            return;
        }
        if (i10 == 2) {
            z5 = c02 == 1;
            S(this.f52332c == 2 ? !z5 : z5, false, i4, i5, i6, i7);
        } else if (i10 == 3) {
            z5 = c02 == 1;
            S(this.f52332c == 2 ? !z5 : z5, true, i4, i5, i6, i7);
        } else {
            throw new IllegalStateException(ProtectedSandApp.s("욯") + this.f52331b);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        if (this.f52344o == null) {
            this.f52344o = new SparseIntArray(getChildCount());
        }
        if (this.f52345p.O(this.f52344o)) {
            this.f52343n = this.f52345p.m(this.f52344o);
        }
        int i6 = this.f52331b;
        if (i6 == 0 || i6 == 1) {
            T(i4, i5);
        } else if (i6 == 2 || i6 == 3) {
            U(i4, i5);
        } else {
            throw new IllegalStateException(ProtectedSandApp.s("우") + this.f52331b);
        }
    }

    @Override // com.google.android.flexbox.d
    public int p(View view) {
        return 0;
    }

    @Override // com.google.android.flexbox.d
    public int q() {
        return this.f52332c;
    }

    @Override // com.google.android.flexbox.d
    public void r(f fVar) {
        if (A()) {
            if ((this.f52340k & 4) > 0) {
                int i4 = fVar.f52423e;
                int i5 = this.f52342m;
                fVar.f52423e = i4 + i5;
                fVar.f52424f += i5;
                return;
            }
            return;
        }
        if ((this.f52339j & 4) > 0) {
            int i6 = fVar.f52423e;
            int i7 = this.f52341l;
            fVar.f52423e = i6 + i7;
            fVar.f52424f += i7;
        }
    }

    @Override // com.google.android.flexbox.d
    public void s(int i4) {
        if (this.f52334e != i4) {
            this.f52334e = i4;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.d
    public View t(int i4) {
        return L(i4);
    }

    @Override // com.google.android.flexbox.d
    public int u() {
        return this.f52334e;
    }

    @Override // com.google.android.flexbox.d
    public void v(int i4, View view) {
    }

    @Override // com.google.android.flexbox.d
    public int w() {
        int size = this.f52346q.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            f fVar = this.f52346q.get(i5);
            if (P(i5)) {
                i4 += A() ? this.f52341l : this.f52342m;
            }
            if (Q(i5)) {
                i4 += A() ? this.f52341l : this.f52342m;
            }
            i4 += fVar.f52425g;
        }
        return i4;
    }

    @Override // com.google.android.flexbox.d
    public int x(View view, int i4, int i5) {
        int i6;
        int i7;
        if (A()) {
            i6 = O(i4, i5) ? this.f52342m : 0;
            if ((this.f52340k & 4) <= 0) {
                return i6;
            }
            i7 = this.f52342m;
        } else {
            i6 = O(i4, i5) ? this.f52341l : 0;
            if ((this.f52339j & 4) <= 0) {
                return i6;
            }
            i7 = this.f52341l;
        }
        return i6 + i7;
    }

    @Override // com.google.android.flexbox.d
    public void y(int i4) {
        if (this.f52333d != i4) {
            this.f52333d = i4;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.d
    public void z(List<f> list) {
        this.f52346q = list;
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f52336g = -1;
        this.f52345p = new h(this);
        this.f52346q = new ArrayList();
        this.f52347r = new h.a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o.r.Mi, i4, 0);
        this.f52331b = obtainStyledAttributes.getInt(o.r.Si, 0);
        this.f52332c = obtainStyledAttributes.getInt(o.r.Ti, 0);
        this.f52333d = obtainStyledAttributes.getInt(o.r.Ui, 0);
        this.f52334e = obtainStyledAttributes.getInt(o.r.Oi, 0);
        this.f52335f = obtainStyledAttributes.getInt(o.r.Ni, 0);
        this.f52336g = obtainStyledAttributes.getInt(o.r.Vi, -1);
        Drawable drawable = obtainStyledAttributes.getDrawable(o.r.Pi);
        if (drawable != null) {
            W(drawable);
            X(drawable);
        }
        Drawable drawable2 = obtainStyledAttributes.getDrawable(o.r.Qi);
        if (drawable2 != null) {
            W(drawable2);
        }
        Drawable drawable3 = obtainStyledAttributes.getDrawable(o.r.Ri);
        if (drawable3 != null) {
            X(drawable3);
        }
        int i5 = obtainStyledAttributes.getInt(o.r.Wi, 0);
        if (i5 != 0) {
            this.f52340k = i5;
            this.f52339j = i5;
        }
        int i6 = obtainStyledAttributes.getInt(o.r.Yi, 0);
        if (i6 != 0) {
            this.f52340k = i6;
        }
        int i7 = obtainStyledAttributes.getInt(o.r.Xi, 0);
        if (i7 != 0) {
            this.f52339j = i7;
        }
        obtainStyledAttributes.recycle();
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        private int f52348b;

        /* renamed from: c, reason: collision with root package name */
        private float f52349c;

        /* renamed from: d, reason: collision with root package name */
        private float f52350d;

        /* renamed from: e, reason: collision with root package name */
        private int f52351e;

        /* renamed from: f, reason: collision with root package name */
        private float f52352f;

        /* renamed from: g, reason: collision with root package name */
        private int f52353g;

        /* renamed from: h, reason: collision with root package name */
        private int f52354h;

        /* renamed from: i, reason: collision with root package name */
        private int f52355i;

        /* renamed from: j, reason: collision with root package name */
        private int f52356j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f52357k;

        class a implements Parcelable.Creator<LayoutParams> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public LayoutParams createFromParcel(Parcel parcel) {
                return new LayoutParams(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public LayoutParams[] newArray(int i4) {
                return new LayoutParams[i4];
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f52348b = 1;
            this.f52349c = 0.0f;
            this.f52350d = 1.0f;
            this.f52351e = -1;
            this.f52352f = -1.0f;
            this.f52353g = -1;
            this.f52354h = -1;
            this.f52355i = 16777215;
            this.f52356j = 16777215;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o.r.Zi);
            this.f52348b = obtainStyledAttributes.getInt(o.r.ij, 1);
            this.f52349c = obtainStyledAttributes.getFloat(o.r.cj, 0.0f);
            this.f52350d = obtainStyledAttributes.getFloat(o.r.dj, 1.0f);
            this.f52351e = obtainStyledAttributes.getInt(o.r.aj, -1);
            this.f52352f = obtainStyledAttributes.getFraction(o.r.bj, 1, 1, -1.0f);
            this.f52353g = obtainStyledAttributes.getDimensionPixelSize(o.r.hj, -1);
            this.f52354h = obtainStyledAttributes.getDimensionPixelSize(o.r.gj, -1);
            this.f52355i = obtainStyledAttributes.getDimensionPixelSize(o.r.fj, 16777215);
            this.f52356j = obtainStyledAttributes.getDimensionPixelSize(o.r.ej, 16777215);
            this.f52357k = obtainStyledAttributes.getBoolean(o.r.jj, false);
            obtainStyledAttributes.recycle();
        }

        @Override // com.google.android.flexbox.FlexItem
        public void B2(float f4) {
            this.f52350d = f4;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void F3(int i4) {
            this.f52351e = i4;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int G() {
            return this.f52353g;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void H2(int i4) {
            this.f52353g = i4;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int I2() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void K(int i4) {
            this.f52356j = i4;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int M2() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void U0(int i4) {
            this.f52354h = i4;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void a2(float f4) {
            this.f52349c = f4;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float d1() {
            return this.f52349c;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void f2(float f4) {
            this.f52352f = f4;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getHeight() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMaxHeight() {
            return this.f52356j;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMaxWidth() {
            return this.f52355i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getOrder() {
            return this.f52348b;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getWidth() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void i(int i4) {
            this.f52348b = i4;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float k1() {
            return this.f52352f;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int l() {
            return this.f52351e;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float m() {
            return this.f52350d;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void q(int i4) {
            this.f52355i = i4;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void s(boolean z4) {
            this.f52357k = z4;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int s3() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setHeight(int i4) {
            ((ViewGroup.MarginLayoutParams) this).height = i4;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setWidth(int i4) {
            ((ViewGroup.MarginLayoutParams) this).width = i4;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int u0() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int u3() {
            return this.f52354h;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            parcel.writeInt(this.f52348b);
            parcel.writeFloat(this.f52349c);
            parcel.writeFloat(this.f52350d);
            parcel.writeInt(this.f52351e);
            parcel.writeFloat(this.f52352f);
            parcel.writeInt(this.f52353g);
            parcel.writeInt(this.f52354h);
            parcel.writeInt(this.f52355i);
            parcel.writeInt(this.f52356j);
            parcel.writeByte(this.f52357k ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        @Override // com.google.android.flexbox.FlexItem
        public boolean y1() {
            return this.f52357k;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.f52348b = 1;
            this.f52349c = 0.0f;
            this.f52350d = 1.0f;
            this.f52351e = -1;
            this.f52352f = -1.0f;
            this.f52353g = -1;
            this.f52354h = -1;
            this.f52355i = 16777215;
            this.f52356j = 16777215;
            this.f52348b = layoutParams.f52348b;
            this.f52349c = layoutParams.f52349c;
            this.f52350d = layoutParams.f52350d;
            this.f52351e = layoutParams.f52351e;
            this.f52352f = layoutParams.f52352f;
            this.f52353g = layoutParams.f52353g;
            this.f52354h = layoutParams.f52354h;
            this.f52355i = layoutParams.f52355i;
            this.f52356j = layoutParams.f52356j;
            this.f52357k = layoutParams.f52357k;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f52348b = 1;
            this.f52349c = 0.0f;
            this.f52350d = 1.0f;
            this.f52351e = -1;
            this.f52352f = -1.0f;
            this.f52353g = -1;
            this.f52354h = -1;
            this.f52355i = 16777215;
            this.f52356j = 16777215;
        }

        public LayoutParams(int i4, int i5) {
            super(new ViewGroup.LayoutParams(i4, i5));
            this.f52348b = 1;
            this.f52349c = 0.0f;
            this.f52350d = 1.0f;
            this.f52351e = -1;
            this.f52352f = -1.0f;
            this.f52353g = -1;
            this.f52354h = -1;
            this.f52355i = 16777215;
            this.f52356j = 16777215;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f52348b = 1;
            this.f52349c = 0.0f;
            this.f52350d = 1.0f;
            this.f52351e = -1;
            this.f52352f = -1.0f;
            this.f52353g = -1;
            this.f52354h = -1;
            this.f52355i = 16777215;
            this.f52356j = 16777215;
        }

        protected LayoutParams(Parcel parcel) {
            super(0, 0);
            this.f52348b = 1;
            this.f52349c = 0.0f;
            this.f52350d = 1.0f;
            this.f52351e = -1;
            this.f52352f = -1.0f;
            this.f52353g = -1;
            this.f52354h = -1;
            this.f52355i = 16777215;
            this.f52356j = 16777215;
            this.f52348b = parcel.readInt();
            this.f52349c = parcel.readFloat();
            this.f52350d = parcel.readFloat();
            this.f52351e = parcel.readInt();
            this.f52352f = parcel.readFloat();
            this.f52353g = parcel.readInt();
            this.f52354h = parcel.readInt();
            this.f52355i = parcel.readInt();
            this.f52356j = parcel.readInt();
            this.f52357k = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }
    }
}
