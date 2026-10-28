package com.google.android.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.o0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.s;
import androidx.recyclerview.widget.z;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.flexbox.h;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public class FlexboxLayoutManager extends RecyclerView.LayoutManager implements d, RecyclerView.z.b {
    private static final String B = ProtectedSandApp.s("웃");
    private static final Rect C = new Rect();
    private static final boolean D = false;
    static final /* synthetic */ boolean E = false;
    private h.a A;

    /* renamed from: b, reason: collision with root package name */
    private int f52358b;

    /* renamed from: c, reason: collision with root package name */
    private int f52359c;

    /* renamed from: d, reason: collision with root package name */
    private int f52360d;

    /* renamed from: e, reason: collision with root package name */
    private int f52361e;

    /* renamed from: f, reason: collision with root package name */
    private int f52362f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f52363g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f52364h;

    /* renamed from: i, reason: collision with root package name */
    private List<f> f52365i;

    /* renamed from: j, reason: collision with root package name */
    private final h f52366j;

    /* renamed from: k, reason: collision with root package name */
    private RecyclerView.v f52367k;

    /* renamed from: l, reason: collision with root package name */
    private RecyclerView.a0 f52368l;

    /* renamed from: m, reason: collision with root package name */
    private b f52369m;

    /* renamed from: n, reason: collision with root package name */
    private a f52370n;

    /* renamed from: o, reason: collision with root package name */
    private z f52371o;

    /* renamed from: p, reason: collision with root package name */
    private z f52372p;

    /* renamed from: q, reason: collision with root package name */
    private SavedState f52373q;

    /* renamed from: r, reason: collision with root package name */
    private int f52374r;

    /* renamed from: s, reason: collision with root package name */
    private int f52375s;

    /* renamed from: t, reason: collision with root package name */
    private int f52376t;

    /* renamed from: u, reason: collision with root package name */
    private int f52377u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f52378v;

    /* renamed from: w, reason: collision with root package name */
    private SparseArray<View> f52379w;

    /* renamed from: x, reason: collision with root package name */
    private final Context f52380x;

    /* renamed from: y, reason: collision with root package name */
    private View f52381y;

    /* renamed from: z, reason: collision with root package name */
    private int f52382z;

    private class a {

        /* renamed from: i, reason: collision with root package name */
        static final /* synthetic */ boolean f52394i = false;

        /* renamed from: a, reason: collision with root package name */
        private int f52395a;

        /* renamed from: b, reason: collision with root package name */
        private int f52396b;

        /* renamed from: c, reason: collision with root package name */
        private int f52397c;

        /* renamed from: d, reason: collision with root package name */
        private int f52398d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f52399e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f52400f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f52401g;

        /* JADX INFO: Access modifiers changed from: private */
        public void q() {
            if (FlexboxLayoutManager.this.A() || !FlexboxLayoutManager.this.f52363g) {
                this.f52397c = this.f52399e ? FlexboxLayoutManager.this.f52371o.i() : FlexboxLayoutManager.this.f52371o.n();
            } else {
                this.f52397c = this.f52399e ? FlexboxLayoutManager.this.f52371o.i() : FlexboxLayoutManager.this.getWidth() - FlexboxLayoutManager.this.f52371o.n();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void r(View view) {
            z zVar = FlexboxLayoutManager.this.f52359c == 0 ? FlexboxLayoutManager.this.f52372p : FlexboxLayoutManager.this.f52371o;
            if (FlexboxLayoutManager.this.A() || !FlexboxLayoutManager.this.f52363g) {
                if (this.f52399e) {
                    this.f52397c = zVar.p() + zVar.d(view);
                } else {
                    this.f52397c = zVar.g(view);
                }
            } else if (this.f52399e) {
                this.f52397c = zVar.p() + zVar.g(view);
            } else {
                this.f52397c = zVar.d(view);
            }
            this.f52395a = FlexboxLayoutManager.this.getPosition(view);
            this.f52401g = false;
            int[] iArr = FlexboxLayoutManager.this.f52366j.f52445c;
            int i4 = this.f52395a;
            if (i4 == -1) {
                i4 = 0;
            }
            int i5 = iArr[i4];
            this.f52396b = i5 != -1 ? i5 : 0;
            if (FlexboxLayoutManager.this.f52365i.size() > this.f52396b) {
                this.f52395a = ((f) FlexboxLayoutManager.this.f52365i.get(this.f52396b)).f52433o;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s() {
            this.f52395a = -1;
            this.f52396b = -1;
            this.f52397c = Integer.MIN_VALUE;
            this.f52400f = false;
            this.f52401g = false;
            if (FlexboxLayoutManager.this.A()) {
                if (FlexboxLayoutManager.this.f52359c == 0) {
                    this.f52399e = FlexboxLayoutManager.this.f52358b == 1;
                    return;
                } else {
                    this.f52399e = FlexboxLayoutManager.this.f52359c == 2;
                    return;
                }
            }
            if (FlexboxLayoutManager.this.f52359c == 0) {
                this.f52399e = FlexboxLayoutManager.this.f52358b == 3;
            } else {
                this.f52399e = FlexboxLayoutManager.this.f52359c == 2;
            }
        }

        @o0
        public String toString() {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("운"));
            sb.append(this.f52395a);
            sb.append(ProtectedSandApp.s("욵"));
            sb.append(this.f52396b);
            sb.append(ProtectedSandApp.s("욶"));
            sb.append(this.f52397c);
            sb.append(ProtectedSandApp.s("욷"));
            sb.append(this.f52398d);
            sb.append(ProtectedSandApp.s("울"));
            sb.append(this.f52399e);
            sb.append(ProtectedSandApp.s("욹"));
            sb.append(this.f52400f);
            sb.append(ProtectedSandApp.s("욺"));
            return androidx.compose.animation.l.a(sb, this.f52401g, '}');
        }

        private a() {
            this.f52398d = 0;
        }
    }

    private static class b {

        /* renamed from: k, reason: collision with root package name */
        private static final int f52403k = Integer.MIN_VALUE;

        /* renamed from: l, reason: collision with root package name */
        private static final int f52404l = -1;

        /* renamed from: m, reason: collision with root package name */
        private static final int f52405m = 1;

        /* renamed from: n, reason: collision with root package name */
        private static final int f52406n = 1;

        /* renamed from: a, reason: collision with root package name */
        private int f52407a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f52408b;

        /* renamed from: c, reason: collision with root package name */
        private int f52409c;

        /* renamed from: d, reason: collision with root package name */
        private int f52410d;

        /* renamed from: e, reason: collision with root package name */
        private int f52411e;

        /* renamed from: f, reason: collision with root package name */
        private int f52412f;

        /* renamed from: g, reason: collision with root package name */
        private int f52413g;

        /* renamed from: h, reason: collision with root package name */
        private int f52414h;

        /* renamed from: i, reason: collision with root package name */
        private int f52415i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f52416j;

        /* JADX INFO: Access modifiers changed from: private */
        public boolean u(RecyclerView.a0 a0Var, List<f> list) {
            int i4;
            int i5 = this.f52410d;
            return i5 >= 0 && i5 < a0Var.d() && (i4 = this.f52409c) >= 0 && i4 < list.size();
        }

        @o0
        public String toString() {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("욻"));
            sb.append(this.f52407a);
            sb.append(ProtectedSandApp.s("욼"));
            sb.append(this.f52409c);
            sb.append(ProtectedSandApp.s("욽"));
            sb.append(this.f52410d);
            sb.append(ProtectedSandApp.s("욾"));
            sb.append(this.f52411e);
            sb.append(ProtectedSandApp.s("욿"));
            sb.append(this.f52412f);
            sb.append(ProtectedSandApp.s("움"));
            sb.append(this.f52413g);
            sb.append(ProtectedSandApp.s("웁"));
            sb.append(this.f52414h);
            sb.append(ProtectedSandApp.s("웂"));
            return androidx.view.e.a(sb, this.f52415i, '}');
        }

        private b() {
            this.f52414h = 1;
            this.f52415i = 1;
        }
    }

    public FlexboxLayoutManager(Context context) {
        this(context, 0, 1);
    }

    private boolean J(View view, int i4) {
        return (A() || !this.f52363g) ? this.f52371o.g(view) >= this.f52371o.h() - i4 : this.f52371o.d(view) <= i4;
    }

    private boolean K(View view, int i4) {
        return (A() || !this.f52363g) ? this.f52371o.d(view) <= i4 : this.f52371o.h() - this.f52371o.g(view) <= i4;
    }

    private void L() {
        this.f52365i.clear();
        this.f52370n.s();
        this.f52370n.f52398d = 0;
    }

    private void M() {
        if (this.f52371o != null) {
            return;
        }
        if (A()) {
            if (this.f52359c == 0) {
                this.f52371o = z.a(this);
                this.f52372p = z.c(this);
                return;
            } else {
                this.f52371o = z.c(this);
                this.f52372p = z.a(this);
                return;
            }
        }
        if (this.f52359c == 0) {
            this.f52371o = z.c(this);
            this.f52372p = z.a(this);
        } else {
            this.f52371o = z.a(this);
            this.f52372p = z.c(this);
        }
    }

    private int N(RecyclerView.v vVar, RecyclerView.a0 a0Var, b bVar) {
        if (bVar.f52412f != Integer.MIN_VALUE) {
            if (bVar.f52407a < 0) {
                bVar.f52412f += bVar.f52407a;
            }
            g0(vVar, bVar);
        }
        int i4 = bVar.f52407a;
        int i5 = bVar.f52407a;
        boolean A = A();
        int i6 = 0;
        while (true) {
            if ((i5 > 0 || this.f52369m.f52408b) && bVar.u(a0Var, this.f52365i)) {
                f fVar = this.f52365i.get(bVar.f52409c);
                bVar.f52410d = fVar.f52433o;
                i6 += d0(fVar, bVar);
                if (A || !this.f52363g) {
                    bVar.f52411e = (fVar.a() * bVar.f52415i) + bVar.f52411e;
                } else {
                    bVar.f52411e -= fVar.a() * bVar.f52415i;
                }
                i5 -= fVar.a();
            }
        }
        bVar.f52407a -= i6;
        if (bVar.f52412f != Integer.MIN_VALUE) {
            bVar.f52412f += i6;
            if (bVar.f52407a < 0) {
                bVar.f52412f += bVar.f52407a;
            }
            g0(vVar, bVar);
        }
        return i4 - bVar.f52407a;
    }

    private View O(int i4) {
        View T = T(0, getChildCount(), i4);
        if (T == null) {
            return null;
        }
        int i5 = this.f52366j.f52445c[getPosition(T)];
        if (i5 == -1) {
            return null;
        }
        return P(T, this.f52365i.get(i5));
    }

    private View P(View view, f fVar) {
        boolean A = A();
        int i4 = fVar.f52426h;
        for (int i5 = 1; i5 < i4; i5++) {
            View childAt = getChildAt(i5);
            if (childAt != null && childAt.getVisibility() != 8) {
                if (!this.f52363g || A) {
                    if (this.f52371o.g(view) <= this.f52371o.g(childAt)) {
                    }
                    view = childAt;
                } else {
                    if (this.f52371o.d(view) >= this.f52371o.d(childAt)) {
                    }
                    view = childAt;
                }
            }
        }
        return view;
    }

    private View Q(int i4) {
        View T = T(getChildCount() - 1, -1, i4);
        if (T == null) {
            return null;
        }
        return R(T, this.f52365i.get(this.f52366j.f52445c[getPosition(T)]));
    }

    private View R(View view, f fVar) {
        boolean A = A();
        int childCount = (getChildCount() - fVar.f52426h) - 1;
        for (int childCount2 = getChildCount() - 2; childCount2 > childCount; childCount2--) {
            View childAt = getChildAt(childCount2);
            if (childAt != null && childAt.getVisibility() != 8) {
                if (!this.f52363g || A) {
                    if (this.f52371o.d(view) >= this.f52371o.d(childAt)) {
                    }
                    view = childAt;
                } else {
                    if (this.f52371o.g(view) <= this.f52371o.g(childAt)) {
                    }
                    view = childAt;
                }
            }
        }
        return view;
    }

    private View S(int i4, int i5, boolean z4) {
        int i6 = i5 > i4 ? 1 : -1;
        while (i4 != i5) {
            View childAt = getChildAt(i4);
            if (c0(childAt, z4)) {
                return childAt;
            }
            i4 += i6;
        }
        return null;
    }

    private View T(int i4, int i5, int i6) {
        int position;
        M();
        ensureLayoutState();
        int n4 = this.f52371o.n();
        int i7 = this.f52371o.i();
        int i10 = i5 > i4 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i4 != i5) {
            View childAt = getChildAt(i4);
            if (childAt != null && (position = getPosition(childAt)) >= 0 && position < i6) {
                if (((RecyclerView.LayoutParams) childAt.getLayoutParams()).g()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.f52371o.g(childAt) >= n4 && this.f52371o.d(childAt) <= i7) {
                        return childAt;
                    }
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            i4 += i10;
        }
        return view != null ? view : view2;
    }

    private int U(View view) {
        return getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).bottomMargin;
    }

    private int V(View view) {
        return getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).leftMargin;
    }

    private int W(View view) {
        return getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).rightMargin;
    }

    private int X(View view) {
        return getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).topMargin;
    }

    private int Z(int i4, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (getChildCount() == 0 || i4 == 0) {
            return 0;
        }
        M();
        int i5 = 1;
        this.f52369m.f52416j = true;
        boolean z4 = !A() && this.f52363g;
        if (!z4 ? i4 <= 0 : i4 >= 0) {
            i5 = -1;
        }
        int abs = Math.abs(i4);
        q0(i5, abs);
        int N = this.f52369m.f52412f + N(vVar, a0Var, this.f52369m);
        if (N < 0) {
            return 0;
        }
        if (z4) {
            if (abs > N) {
                i4 = (-i5) * N;
            }
        } else if (abs > N) {
            i4 = i5 * N;
        }
        this.f52371o.t(-i4);
        this.f52369m.f52413g = i4;
        return i4;
    }

    private int a0(int i4) {
        int i5;
        if (getChildCount() == 0 || i4 == 0) {
            return 0;
        }
        M();
        boolean A = A();
        View view = this.f52381y;
        int width = A ? view.getWidth() : view.getHeight();
        int width2 = A ? getWidth() : getHeight();
        if (getLayoutDirection() == 1) {
            int abs = Math.abs(i4);
            if (i4 < 0) {
                i5 = Math.min((width2 + this.f52370n.f52398d) - width, abs);
            } else {
                if (this.f52370n.f52398d + i4 <= 0) {
                    return i4;
                }
                i5 = this.f52370n.f52398d;
            }
        } else {
            if (i4 > 0) {
                return Math.min((width2 - this.f52370n.f52398d) - width, i4);
            }
            if (this.f52370n.f52398d + i4 >= 0) {
                return i4;
            }
            i5 = this.f52370n.f52398d;
        }
        return -i5;
    }

    private boolean c0(View view, boolean z4) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        int V = V(view);
        int X = X(view);
        int W = W(view);
        int U = U(view);
        return z4 ? (paddingLeft <= V && width >= W) && (paddingTop <= X && height >= U) : (V >= width || W >= paddingLeft) && (X >= height || U >= paddingTop);
    }

    private int computeScrollExtent(RecyclerView.a0 a0Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        int d5 = a0Var.d();
        M();
        View O = O(d5);
        View Q = Q(d5);
        if (a0Var.d() == 0 || O == null || Q == null) {
            return 0;
        }
        return Math.min(this.f52371o.o(), this.f52371o.d(Q) - this.f52371o.g(O));
    }

    private int computeScrollOffset(RecyclerView.a0 a0Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        int d5 = a0Var.d();
        View O = O(d5);
        View Q = Q(d5);
        if (a0Var.d() != 0 && O != null && Q != null) {
            int position = getPosition(O);
            int position2 = getPosition(Q);
            int abs = Math.abs(this.f52371o.d(Q) - this.f52371o.g(O));
            int i4 = this.f52366j.f52445c[position];
            if (i4 != 0 && i4 != -1) {
                return Math.round((i4 * (abs / ((r4[position2] - i4) + 1))) + (this.f52371o.n() - this.f52371o.g(O)));
            }
        }
        return 0;
    }

    private int computeScrollRange(RecyclerView.a0 a0Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        int d5 = a0Var.d();
        View O = O(d5);
        View Q = Q(d5);
        if (a0Var.d() == 0 || O == null || Q == null) {
            return 0;
        }
        int findFirstVisibleItemPosition = findFirstVisibleItemPosition();
        return (int) ((Math.abs(this.f52371o.d(Q) - this.f52371o.g(O)) / ((findLastVisibleItemPosition() - findFirstVisibleItemPosition) + 1)) * a0Var.d());
    }

    private int d0(f fVar, b bVar) {
        return A() ? e0(fVar, bVar) : f0(fVar, bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int e0(com.google.android.flexbox.f r22, com.google.android.flexbox.FlexboxLayoutManager.b r23) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.e0(com.google.android.flexbox.f, com.google.android.flexbox.FlexboxLayoutManager$b):int");
    }

    private void ensureLayoutState() {
        if (this.f52369m == null) {
            this.f52369m = new b();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int f0(com.google.android.flexbox.f r26, com.google.android.flexbox.FlexboxLayoutManager.b r27) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.f0(com.google.android.flexbox.f, com.google.android.flexbox.FlexboxLayoutManager$b):int");
    }

    private int fixLayoutEndGap(int i4, RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z4) {
        int i5;
        int i6;
        if (A() || !this.f52363g) {
            int i7 = this.f52371o.i() - i4;
            if (i7 <= 0) {
                return 0;
            }
            i5 = -Z(-i7, vVar, a0Var);
        } else {
            int n4 = i4 - this.f52371o.n();
            if (n4 <= 0) {
                return 0;
            }
            i5 = Z(n4, vVar, a0Var);
        }
        int i10 = i4 + i5;
        if (!z4 || (i6 = this.f52371o.i() - i10) <= 0) {
            return i5;
        }
        this.f52371o.t(i6);
        return i6 + i5;
    }

    private int fixLayoutStartGap(int i4, RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z4) {
        int i5;
        int n4;
        if (A() || !this.f52363g) {
            int n5 = i4 - this.f52371o.n();
            if (n5 <= 0) {
                return 0;
            }
            i5 = -Z(n5, vVar, a0Var);
        } else {
            int i6 = this.f52371o.i() - i4;
            if (i6 <= 0) {
                return 0;
            }
            i5 = Z(-i6, vVar, a0Var);
        }
        int i7 = i4 + i5;
        if (!z4 || (n4 = i7 - this.f52371o.n()) <= 0) {
            return i5;
        }
        this.f52371o.t(-n4);
        return i5 - n4;
    }

    private void g0(RecyclerView.v vVar, b bVar) {
        if (bVar.f52416j) {
            if (bVar.f52415i == -1) {
                h0(vVar, bVar);
            } else {
                i0(vVar, bVar);
            }
        }
    }

    private View getChildClosestToStart() {
        return getChildAt(0);
    }

    private void h0(RecyclerView.v vVar, b bVar) {
        int childCount;
        int i4;
        View childAt;
        int i5;
        if (bVar.f52412f < 0 || (childCount = getChildCount()) == 0 || (childAt = getChildAt(childCount - 1)) == null || (i5 = this.f52366j.f52445c[getPosition(childAt)]) == -1) {
            return;
        }
        f fVar = this.f52365i.get(i5);
        int i6 = i4;
        while (true) {
            if (i6 < 0) {
                break;
            }
            View childAt2 = getChildAt(i6);
            if (childAt2 != null) {
                if (!J(childAt2, bVar.f52412f)) {
                    break;
                }
                if (fVar.f52433o != getPosition(childAt2)) {
                    continue;
                } else if (i5 <= 0) {
                    childCount = i6;
                    break;
                } else {
                    i5 += bVar.f52415i;
                    fVar = this.f52365i.get(i5);
                    childCount = i6;
                }
            }
            i6--;
        }
        recycleChildren(vVar, childCount, i4);
    }

    private void i0(RecyclerView.v vVar, b bVar) {
        int childCount;
        View childAt;
        if (bVar.f52412f < 0 || (childCount = getChildCount()) == 0 || (childAt = getChildAt(0)) == null) {
            return;
        }
        int i4 = this.f52366j.f52445c[getPosition(childAt)];
        int i5 = -1;
        if (i4 == -1) {
            return;
        }
        f fVar = this.f52365i.get(i4);
        int i6 = 0;
        while (true) {
            if (i6 >= childCount) {
                break;
            }
            View childAt2 = getChildAt(i6);
            if (childAt2 != null) {
                if (!K(childAt2, bVar.f52412f)) {
                    break;
                }
                if (fVar.f52434p != getPosition(childAt2)) {
                    continue;
                } else if (i4 >= this.f52365i.size() - 1) {
                    i5 = i6;
                    break;
                } else {
                    i4 += bVar.f52415i;
                    fVar = this.f52365i.get(i4);
                    i5 = i6;
                }
            }
            i6++;
        }
        recycleChildren(vVar, 0, i5);
    }

    private static boolean isMeasurementUpToDate(int i4, int i5, int i6) {
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        if (i6 > 0 && i4 != i6) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i4;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i4;
        }
        return true;
    }

    private void j0() {
        int heightMode = A() ? getHeightMode() : getWidthMode();
        this.f52369m.f52408b = heightMode == 0 || heightMode == Integer.MIN_VALUE;
    }

    private void k0() {
        int layoutDirection = getLayoutDirection();
        int i4 = this.f52358b;
        if (i4 == 0) {
            this.f52363g = layoutDirection == 1;
            this.f52364h = this.f52359c == 2;
            return;
        }
        if (i4 == 1) {
            this.f52363g = layoutDirection != 1;
            this.f52364h = this.f52359c == 2;
            return;
        }
        if (i4 == 2) {
            boolean z4 = layoutDirection == 1;
            this.f52363g = z4;
            if (this.f52359c == 2) {
                this.f52363g = !z4;
            }
            this.f52364h = false;
            return;
        }
        if (i4 != 3) {
            this.f52363g = false;
            this.f52364h = false;
            return;
        }
        boolean z5 = layoutDirection == 1;
        this.f52363g = z5;
        if (this.f52359c == 2) {
            this.f52363g = !z5;
        }
        this.f52364h = true;
    }

    private boolean l0(RecyclerView.a0 a0Var, a aVar) {
        if (getChildCount() == 0) {
            return false;
        }
        View Q = aVar.f52399e ? Q(a0Var.d()) : O(a0Var.d());
        if (Q == null) {
            return false;
        }
        aVar.r(Q);
        if (a0Var.j() || !supportsPredictiveItemAnimations()) {
            return true;
        }
        if (this.f52371o.g(Q) < this.f52371o.i() && this.f52371o.d(Q) >= this.f52371o.n()) {
            return true;
        }
        aVar.f52397c = aVar.f52399e ? this.f52371o.i() : this.f52371o.n();
        return true;
    }

    private boolean m0(RecyclerView.a0 a0Var, a aVar, SavedState savedState) {
        int i4;
        View childAt;
        if (!a0Var.j() && (i4 = this.f52374r) != -1) {
            if (i4 >= 0 && i4 < a0Var.d()) {
                aVar.f52395a = this.f52374r;
                aVar.f52396b = this.f52366j.f52445c[aVar.f52395a];
                SavedState savedState2 = this.f52373q;
                if (savedState2 != null && savedState2.g(a0Var.d())) {
                    aVar.f52397c = this.f52371o.n() + savedState.f52393c;
                    aVar.f52401g = true;
                    aVar.f52396b = -1;
                    return true;
                }
                if (this.f52375s != Integer.MIN_VALUE) {
                    if (A() || !this.f52363g) {
                        aVar.f52397c = this.f52371o.n() + this.f52375s;
                    } else {
                        aVar.f52397c = this.f52375s - this.f52371o.j();
                    }
                    return true;
                }
                View findViewByPosition = findViewByPosition(this.f52374r);
                if (findViewByPosition == null) {
                    if (getChildCount() > 0 && (childAt = getChildAt(0)) != null) {
                        aVar.f52399e = this.f52374r < getPosition(childAt);
                    }
                    aVar.q();
                } else {
                    if (this.f52371o.e(findViewByPosition) > this.f52371o.o()) {
                        aVar.q();
                        return true;
                    }
                    if (this.f52371o.g(findViewByPosition) - this.f52371o.n() < 0) {
                        aVar.f52397c = this.f52371o.n();
                        aVar.f52399e = false;
                        return true;
                    }
                    if (this.f52371o.i() - this.f52371o.d(findViewByPosition) < 0) {
                        aVar.f52397c = this.f52371o.i();
                        aVar.f52399e = true;
                        return true;
                    }
                    aVar.f52397c = aVar.f52399e ? this.f52371o.p() + this.f52371o.d(findViewByPosition) : this.f52371o.g(findViewByPosition);
                }
                return true;
            }
            this.f52374r = -1;
            this.f52375s = Integer.MIN_VALUE;
        }
        return false;
    }

    private void n0(RecyclerView.a0 a0Var, a aVar) {
        if (m0(a0Var, aVar, this.f52373q) || l0(a0Var, aVar)) {
            return;
        }
        aVar.q();
        aVar.f52395a = 0;
        aVar.f52396b = 0;
    }

    private void o0(int i4) {
        if (i4 >= findLastVisibleItemPosition()) {
            return;
        }
        int childCount = getChildCount();
        this.f52366j.t(childCount);
        this.f52366j.u(childCount);
        this.f52366j.s(childCount);
        if (i4 >= this.f52366j.f52445c.length) {
            return;
        }
        this.f52382z = i4;
        View childClosestToStart = getChildClosestToStart();
        if (childClosestToStart == null) {
            return;
        }
        this.f52374r = getPosition(childClosestToStart);
        if (A() || !this.f52363g) {
            this.f52375s = this.f52371o.g(childClosestToStart) - this.f52371o.n();
        } else {
            this.f52375s = this.f52371o.j() + this.f52371o.d(childClosestToStart);
        }
    }

    private void p0(int i4) {
        int i5;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getWidth(), getWidthMode());
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getHeight(), getHeightMode());
        int width = getWidth();
        int height = getHeight();
        boolean z4 = false;
        if (A()) {
            int i6 = this.f52376t;
            if (i6 != Integer.MIN_VALUE && i6 != width) {
                z4 = true;
            }
            i5 = this.f52369m.f52408b ? this.f52380x.getResources().getDisplayMetrics().heightPixels : this.f52369m.f52407a;
        } else {
            int i7 = this.f52377u;
            if (i7 != Integer.MIN_VALUE && i7 != height) {
                z4 = true;
            }
            i5 = this.f52369m.f52408b ? this.f52380x.getResources().getDisplayMetrics().widthPixels : this.f52369m.f52407a;
        }
        int i10 = i5;
        this.f52376t = width;
        this.f52377u = height;
        int i11 = this.f52382z;
        if (i11 == -1 && (this.f52374r != -1 || z4)) {
            if (this.f52370n.f52399e) {
                return;
            }
            this.f52365i.clear();
            this.A.a();
            if (A()) {
                this.f52366j.e(this.A, makeMeasureSpec, makeMeasureSpec2, i10, this.f52370n.f52395a, this.f52365i);
            } else {
                this.f52366j.h(this.A, makeMeasureSpec, makeMeasureSpec2, i10, this.f52370n.f52395a, this.f52365i);
            }
            this.f52365i = this.A.f52448a;
            this.f52366j.p(makeMeasureSpec, makeMeasureSpec2);
            this.f52366j.X();
            a aVar = this.f52370n;
            aVar.f52396b = this.f52366j.f52445c[aVar.f52395a];
            this.f52369m.f52409c = this.f52370n.f52396b;
            return;
        }
        int min = i11 != -1 ? Math.min(i11, this.f52370n.f52395a) : this.f52370n.f52395a;
        this.A.a();
        if (A()) {
            if (this.f52365i.size() > 0) {
                this.f52366j.j(this.f52365i, min);
                this.f52366j.b(this.A, makeMeasureSpec, makeMeasureSpec2, i10, min, this.f52370n.f52395a, this.f52365i);
            } else {
                this.f52366j.s(i4);
                this.f52366j.d(this.A, makeMeasureSpec, makeMeasureSpec2, i10, 0, this.f52365i);
            }
        } else if (this.f52365i.size() > 0) {
            this.f52366j.j(this.f52365i, min);
            this.f52366j.b(this.A, makeMeasureSpec2, makeMeasureSpec, i10, min, this.f52370n.f52395a, this.f52365i);
        } else {
            this.f52366j.s(i4);
            this.f52366j.g(this.A, makeMeasureSpec, makeMeasureSpec2, i10, 0, this.f52365i);
        }
        this.f52365i = this.A.f52448a;
        this.f52366j.q(makeMeasureSpec, makeMeasureSpec2, min);
        this.f52366j.Y(min);
    }

    private void q0(int i4, int i5) {
        this.f52369m.f52415i = i4;
        boolean A = A();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getWidth(), getWidthMode());
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getHeight(), getHeightMode());
        boolean z4 = !A && this.f52363g;
        if (i4 == 1) {
            View childAt = getChildAt(getChildCount() - 1);
            if (childAt == null) {
                return;
            }
            this.f52369m.f52411e = this.f52371o.d(childAt);
            int position = getPosition(childAt);
            View R = R(childAt, this.f52365i.get(this.f52366j.f52445c[position]));
            this.f52369m.f52414h = 1;
            b bVar = this.f52369m;
            bVar.f52410d = position + bVar.f52414h;
            if (this.f52366j.f52445c.length <= this.f52369m.f52410d) {
                this.f52369m.f52409c = -1;
            } else {
                b bVar2 = this.f52369m;
                bVar2.f52409c = this.f52366j.f52445c[bVar2.f52410d];
            }
            if (z4) {
                this.f52369m.f52411e = this.f52371o.g(R);
                this.f52369m.f52412f = this.f52371o.n() + (-this.f52371o.g(R));
                b bVar3 = this.f52369m;
                bVar3.f52412f = Math.max(bVar3.f52412f, 0);
            } else {
                this.f52369m.f52411e = this.f52371o.d(R);
                this.f52369m.f52412f = this.f52371o.d(R) - this.f52371o.i();
            }
            if ((this.f52369m.f52409c == -1 || this.f52369m.f52409c > this.f52365i.size() - 1) && this.f52369m.f52410d <= a()) {
                int i6 = i5 - this.f52369m.f52412f;
                this.A.a();
                if (i6 > 0) {
                    if (A) {
                        this.f52366j.d(this.A, makeMeasureSpec, makeMeasureSpec2, i6, this.f52369m.f52410d, this.f52365i);
                    } else {
                        this.f52366j.g(this.A, makeMeasureSpec, makeMeasureSpec2, i6, this.f52369m.f52410d, this.f52365i);
                    }
                    this.f52366j.q(makeMeasureSpec, makeMeasureSpec2, this.f52369m.f52410d);
                    this.f52366j.Y(this.f52369m.f52410d);
                }
            }
        } else {
            View childAt2 = getChildAt(0);
            if (childAt2 == null) {
                return;
            }
            this.f52369m.f52411e = this.f52371o.g(childAt2);
            int position2 = getPosition(childAt2);
            View P = P(childAt2, this.f52365i.get(this.f52366j.f52445c[position2]));
            this.f52369m.f52414h = 1;
            int i7 = this.f52366j.f52445c[position2];
            if (i7 == -1) {
                i7 = 0;
            }
            if (i7 > 0) {
                this.f52369m.f52410d = position2 - this.f52365i.get(i7 - 1).c();
            } else {
                this.f52369m.f52410d = -1;
            }
            this.f52369m.f52409c = i7 > 0 ? i7 - 1 : 0;
            if (z4) {
                this.f52369m.f52411e = this.f52371o.d(P);
                this.f52369m.f52412f = this.f52371o.d(P) - this.f52371o.i();
                b bVar4 = this.f52369m;
                bVar4.f52412f = Math.max(bVar4.f52412f, 0);
            } else {
                this.f52369m.f52411e = this.f52371o.g(P);
                this.f52369m.f52412f = this.f52371o.n() + (-this.f52371o.g(P));
            }
        }
        b bVar5 = this.f52369m;
        bVar5.f52407a = i5 - bVar5.f52412f;
    }

    private void r0(a aVar, boolean z4, boolean z5) {
        if (z5) {
            j0();
        } else {
            this.f52369m.f52408b = false;
        }
        if (A() || !this.f52363g) {
            this.f52369m.f52407a = this.f52371o.i() - aVar.f52397c;
        } else {
            this.f52369m.f52407a = aVar.f52397c - getPaddingRight();
        }
        this.f52369m.f52410d = aVar.f52395a;
        this.f52369m.f52414h = 1;
        this.f52369m.f52415i = 1;
        this.f52369m.f52411e = aVar.f52397c;
        this.f52369m.f52412f = Integer.MIN_VALUE;
        this.f52369m.f52409c = aVar.f52396b;
        if (!z4 || this.f52365i.size() <= 1 || aVar.f52396b < 0 || aVar.f52396b >= this.f52365i.size() - 1) {
            return;
        }
        f fVar = this.f52365i.get(aVar.f52396b);
        this.f52369m.f52409c++;
        b bVar = this.f52369m;
        bVar.f52410d = fVar.c() + bVar.f52410d;
    }

    private void recycleChildren(RecyclerView.v vVar, int i4, int i5) {
        while (i5 >= i4) {
            removeAndRecycleViewAt(i5, vVar);
            i5--;
        }
    }

    private void s0(a aVar, boolean z4, boolean z5) {
        if (z5) {
            j0();
        } else {
            this.f52369m.f52408b = false;
        }
        if (A() || !this.f52363g) {
            this.f52369m.f52407a = aVar.f52397c - this.f52371o.n();
        } else {
            this.f52369m.f52407a = (this.f52381y.getWidth() - aVar.f52397c) - this.f52371o.n();
        }
        this.f52369m.f52410d = aVar.f52395a;
        this.f52369m.f52414h = 1;
        this.f52369m.f52415i = -1;
        this.f52369m.f52411e = aVar.f52397c;
        this.f52369m.f52412f = Integer.MIN_VALUE;
        this.f52369m.f52409c = aVar.f52396b;
        if (!z4 || aVar.f52396b <= 0 || this.f52365i.size() <= aVar.f52396b) {
            return;
        }
        f fVar = this.f52365i.get(aVar.f52396b);
        this.f52369m.f52409c--;
        this.f52369m.f52410d -= fVar.c();
    }

    private boolean shouldMeasureChild(View view, int i4, int i5, RecyclerView.LayoutParams layoutParams) {
        return (!view.isLayoutRequested() && isMeasurementCacheEnabled() && isMeasurementUpToDate(view.getWidth(), i4, ((ViewGroup.MarginLayoutParams) layoutParams).width) && isMeasurementUpToDate(view.getHeight(), i5, ((ViewGroup.MarginLayoutParams) layoutParams).height)) ? false : true;
    }

    @Override // com.google.android.flexbox.d
    public boolean A() {
        int i4 = this.f52358b;
        return i4 == 0 || i4 == 1;
    }

    @Override // com.google.android.flexbox.d
    public int B() {
        return this.f52360d;
    }

    int Y(int i4) {
        return this.f52366j.f52445c[i4];
    }

    @Override // com.google.android.flexbox.d
    public int a() {
        return this.f52368l.d();
    }

    @Override // com.google.android.flexbox.d
    public void b(View view, int i4, int i5, f fVar) {
        calculateItemDecorationsForChild(view, C);
        if (A()) {
            int rightDecorationWidth = getRightDecorationWidth(view) + getLeftDecorationWidth(view);
            fVar.f52423e += rightDecorationWidth;
            fVar.f52424f += rightDecorationWidth;
            return;
        }
        int bottomDecorationHeight = getBottomDecorationHeight(view) + getTopDecorationHeight(view);
        fVar.f52423e += bottomDecorationHeight;
        fVar.f52424f += bottomDecorationHeight;
    }

    boolean b0() {
        return this.f52363g;
    }

    @Override // com.google.android.flexbox.d
    public int c() {
        return this.f52358b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        if (this.f52359c == 0) {
            return A();
        }
        if (A()) {
            int width = getWidth();
            View view = this.f52381y;
            if (width <= (view != null ? view.getWidth() : 0)) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        if (this.f52359c == 0) {
            return !A();
        }
        if (A()) {
            return true;
        }
        int height = getHeight();
        View view = this.f52381y;
        return height > (view != null ? view.getHeight() : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollExtent(@o0 RecyclerView.a0 a0Var) {
        return computeScrollExtent(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(@o0 RecyclerView.a0 a0Var) {
        return computeScrollOffset(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(@o0 RecyclerView.a0 a0Var) {
        return computeScrollRange(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z.b
    public PointF computeScrollVectorForPosition(int i4) {
        View childAt;
        if (getChildCount() == 0 || (childAt = getChildAt(0)) == null) {
            return null;
        }
        int i5 = i4 < getPosition(childAt) ? -1 : 1;
        return A() ? new PointF(0.0f, i5) : new PointF(i5, 0.0f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollExtent(@o0 RecyclerView.a0 a0Var) {
        return computeScrollExtent(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(@o0 RecyclerView.a0 a0Var) {
        return computeScrollOffset(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(@o0 RecyclerView.a0 a0Var) {
        return computeScrollRange(a0Var);
    }

    @Override // com.google.android.flexbox.d
    public int d() {
        return this.f52362f;
    }

    @Override // com.google.android.flexbox.d
    public int e() {
        if (this.f52365i.size() == 0) {
            return 0;
        }
        int size = this.f52365i.size();
        int i4 = Integer.MIN_VALUE;
        for (int i5 = 0; i5 < size; i5++) {
            i4 = Math.max(i4, this.f52365i.get(i5).f52423e);
        }
        return i4;
    }

    @Override // com.google.android.flexbox.d
    public int f(int i4, int i5, int i6) {
        return RecyclerView.LayoutManager.getChildMeasureSpec(getWidth(), getWidthMode(), i5, i6, canScrollHorizontally());
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View S = S(0, getChildCount(), true);
        if (S == null) {
            return -1;
        }
        return getPosition(S);
    }

    public int findFirstVisibleItemPosition() {
        View S = S(0, getChildCount(), false);
        if (S == null) {
            return -1;
        }
        return getPosition(S);
    }

    public int findLastCompletelyVisibleItemPosition() {
        View S = S(getChildCount() - 1, -1, true);
        if (S == null) {
            return -1;
        }
        return getPosition(S);
    }

    public int findLastVisibleItemPosition() {
        View S = S(getChildCount() - 1, -1, false);
        if (S == null) {
            return -1;
        }
        return getPosition(S);
    }

    @Override // com.google.android.flexbox.d
    @o0
    public List<f> g() {
        ArrayList arrayList = new ArrayList(this.f52365i.size());
        int size = this.f52365i.size();
        for (int i4 = 0; i4 < size; i4++) {
            f fVar = this.f52365i.get(i4);
            if (fVar.c() != 0) {
                arrayList.add(fVar);
            }
        }
        return arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    public boolean getRecycleChildrenOnDetach() {
        return this.f52378v;
    }

    @Override // com.google.android.flexbox.d
    public View h(int i4) {
        View view = this.f52379w.get(i4);
        return view != null ? view : this.f52367k.p(i4);
    }

    @Override // com.google.android.flexbox.d
    public List<f> i() {
        return this.f52365i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    @Override // com.google.android.flexbox.d
    public int j(int i4, int i5, int i6) {
        return RecyclerView.LayoutManager.getChildMeasureSpec(getHeight(), getHeightMode(), i5, i6, canScrollVertically());
    }

    @Override // com.google.android.flexbox.d
    public int k() {
        return 5;
    }

    @Override // com.google.android.flexbox.d
    public void l(int i4) {
        if (this.f52358b != i4) {
            removeAllViews();
            this.f52358b = i4;
            this.f52371o = null;
            this.f52372p = null;
            L();
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.d
    public void m(int i4) {
        if (i4 == 2) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("웅"));
        }
        int i5 = this.f52359c;
        if (i5 != i4) {
            if (i5 == 0 || i4 == 0) {
                removeAllViews();
                L();
            }
            this.f52359c = i4;
            this.f52371o = null;
            this.f52372p = null;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.d
    public void n(int i4) {
        if (this.f52362f != i4) {
            this.f52362f = i4;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.d
    public void o(int i4) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("웆"));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAdapterChanged(RecyclerView.h hVar, RecyclerView.h hVar2) {
        removeAllViews();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        this.f52381y = (View) recyclerView.getParent();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.v vVar) {
        super.onDetachedFromWindow(recyclerView, vVar);
        if (this.f52378v) {
            removeAndRecycleAllViews(vVar);
            vVar.d();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsAdded(@o0 RecyclerView recyclerView, int i4, int i5) {
        super.onItemsAdded(recyclerView, i4, i5);
        o0(i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsMoved(@o0 RecyclerView recyclerView, int i4, int i5, int i6) {
        super.onItemsMoved(recyclerView, i4, i5, i6);
        o0(Math.min(i4, i5));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsRemoved(@o0 RecyclerView recyclerView, int i4, int i5) {
        super.onItemsRemoved(recyclerView, i4, i5);
        o0(i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsUpdated(@o0 RecyclerView recyclerView, int i4, int i5, Object obj) {
        super.onItemsUpdated(recyclerView, i4, i5, obj);
        o0(i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        int i4;
        int i5;
        this.f52367k = vVar;
        this.f52368l = a0Var;
        int d5 = a0Var.d();
        if (d5 == 0 && a0Var.j()) {
            return;
        }
        k0();
        M();
        ensureLayoutState();
        this.f52366j.t(d5);
        this.f52366j.u(d5);
        this.f52366j.s(d5);
        this.f52369m.f52416j = false;
        SavedState savedState = this.f52373q;
        if (savedState != null && savedState.g(d5)) {
            this.f52374r = this.f52373q.f52392b;
        }
        if (!this.f52370n.f52400f || this.f52374r != -1 || this.f52373q != null) {
            this.f52370n.s();
            n0(a0Var, this.f52370n);
            this.f52370n.f52400f = true;
        }
        detachAndScrapAttachedViews(vVar);
        if (this.f52370n.f52399e) {
            s0(this.f52370n, false, true);
        } else {
            r0(this.f52370n, false, true);
        }
        p0(d5);
        N(vVar, a0Var, this.f52369m);
        if (this.f52370n.f52399e) {
            i5 = this.f52369m.f52411e;
            r0(this.f52370n, true, false);
            N(vVar, a0Var, this.f52369m);
            i4 = this.f52369m.f52411e;
        } else {
            i4 = this.f52369m.f52411e;
            s0(this.f52370n, true, false);
            N(vVar, a0Var, this.f52369m);
            i5 = this.f52369m.f52411e;
        }
        if (getChildCount() > 0) {
            if (this.f52370n.f52399e) {
                fixLayoutStartGap(i5 + fixLayoutEndGap(i4, vVar, a0Var, true), vVar, a0Var, false);
            } else {
                fixLayoutEndGap(i4 + fixLayoutStartGap(i5, vVar, a0Var, true), vVar, a0Var, false);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.a0 a0Var) {
        super.onLayoutCompleted(a0Var);
        this.f52373q = null;
        this.f52374r = -1;
        this.f52375s = Integer.MIN_VALUE;
        this.f52382z = -1;
        this.f52370n.s();
        this.f52379w.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f52373q = (SavedState) parcelable;
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public Parcelable onSaveInstanceState() {
        if (this.f52373q != null) {
            return new SavedState(this.f52373q);
        }
        SavedState savedState = new SavedState();
        if (getChildCount() > 0) {
            View childClosestToStart = getChildClosestToStart();
            savedState.f52392b = getPosition(childClosestToStart);
            savedState.f52393c = this.f52371o.g(childClosestToStart) - this.f52371o.n();
        } else {
            SavedState.f(savedState);
        }
        return savedState;
    }

    @Override // com.google.android.flexbox.d
    public int p(View view) {
        int leftDecorationWidth;
        int rightDecorationWidth;
        if (A()) {
            leftDecorationWidth = getTopDecorationHeight(view);
            rightDecorationWidth = getBottomDecorationHeight(view);
        } else {
            leftDecorationWidth = getLeftDecorationWidth(view);
            rightDecorationWidth = getRightDecorationWidth(view);
        }
        return rightDecorationWidth + leftDecorationWidth;
    }

    @Override // com.google.android.flexbox.d
    public int q() {
        return this.f52359c;
    }

    @Override // com.google.android.flexbox.d
    public void r(f fVar) {
    }

    @Override // com.google.android.flexbox.d
    public void s(int i4) {
        int i5 = this.f52361e;
        if (i5 != i4) {
            if (i5 == 4 || i4 == 4) {
                removeAllViews();
                L();
            }
            this.f52361e = i4;
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i4, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (!A() || this.f52359c == 0) {
            int Z = Z(i4, vVar, a0Var);
            this.f52379w.clear();
            return Z;
        }
        int a02 = a0(i4);
        this.f52370n.f52398d += a02;
        this.f52372p.t(-a02);
        return a02;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i4) {
        this.f52374r = i4;
        this.f52375s = Integer.MIN_VALUE;
        SavedState savedState = this.f52373q;
        if (savedState != null) {
            SavedState.f(savedState);
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i4, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (A() || (this.f52359c == 0 && !A())) {
            int Z = Z(i4, vVar, a0Var);
            this.f52379w.clear();
            return Z;
        }
        int a02 = a0(i4);
        this.f52370n.f52398d += a02;
        this.f52372p.t(-a02);
        return a02;
    }

    public void setRecycleChildrenOnDetach(boolean z4) {
        this.f52378v = z4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i4) {
        s sVar = new s(recyclerView.getContext());
        sVar.setTargetPosition(i4);
        startSmoothScroll(sVar);
    }

    @Override // com.google.android.flexbox.d
    public View t(int i4) {
        return h(i4);
    }

    @Override // com.google.android.flexbox.d
    public int u() {
        return this.f52361e;
    }

    @Override // com.google.android.flexbox.d
    public void v(int i4, View view) {
        this.f52379w.put(i4, view);
    }

    @Override // com.google.android.flexbox.d
    public int w() {
        int size = this.f52365i.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 += this.f52365i.get(i5).f52425g;
        }
        return i4;
    }

    @Override // com.google.android.flexbox.d
    public int x(View view, int i4, int i5) {
        int topDecorationHeight;
        int bottomDecorationHeight;
        if (A()) {
            topDecorationHeight = getLeftDecorationWidth(view);
            bottomDecorationHeight = getRightDecorationWidth(view);
        } else {
            topDecorationHeight = getTopDecorationHeight(view);
            bottomDecorationHeight = getBottomDecorationHeight(view);
        }
        return bottomDecorationHeight + topDecorationHeight;
    }

    @Override // com.google.android.flexbox.d
    public void y(int i4) {
        if (this.f52360d != i4) {
            this.f52360d = i4;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.d
    public void z(List<f> list) {
        this.f52365i = list;
    }

    private static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        private int f52392b;

        /* renamed from: c, reason: collision with root package name */
        private int f52393c;

        class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i4) {
                return new SavedState[i4];
            }
        }

        static void f(SavedState savedState) {
            savedState.f52392b = -1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean g(int i4) {
            int i5 = this.f52392b;
            return i5 >= 0 && i5 < i4;
        }

        private void h() {
            this.f52392b = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @o0
        public String toString() {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("욲"));
            sb.append(this.f52392b);
            sb.append(ProtectedSandApp.s("욳"));
            return androidx.view.e.a(sb, this.f52393c, '}');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            parcel.writeInt(this.f52392b);
            parcel.writeInt(this.f52393c);
        }

        SavedState() {
        }

        private SavedState(Parcel parcel) {
            this.f52392b = parcel.readInt();
            this.f52393c = parcel.readInt();
        }

        private SavedState(SavedState savedState) {
            this.f52392b = savedState.f52392b;
            this.f52393c = savedState.f52393c;
        }
    }

    public FlexboxLayoutManager(Context context, int i4) {
        this(context, i4, 1);
    }

    public FlexboxLayoutManager(Context context, int i4, int i5) {
        this.f52362f = -1;
        this.f52365i = new ArrayList();
        this.f52366j = new h(this);
        this.f52370n = new a();
        this.f52374r = -1;
        this.f52375s = Integer.MIN_VALUE;
        this.f52376t = Integer.MIN_VALUE;
        this.f52377u = Integer.MIN_VALUE;
        this.f52379w = new SparseArray<>();
        this.f52382z = -1;
        this.A = new h.a();
        l(i4);
        m(i5);
        s(4);
        this.f52380x = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsUpdated(@o0 RecyclerView recyclerView, int i4, int i5) {
        super.onItemsUpdated(recyclerView, i4, i5);
        o0(i4);
    }

    public static class LayoutParams extends RecyclerView.LayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new a();

        /* renamed from: f, reason: collision with root package name */
        private float f52383f;

        /* renamed from: g, reason: collision with root package name */
        private float f52384g;

        /* renamed from: h, reason: collision with root package name */
        private int f52385h;

        /* renamed from: i, reason: collision with root package name */
        private float f52386i;

        /* renamed from: j, reason: collision with root package name */
        private int f52387j;

        /* renamed from: k, reason: collision with root package name */
        private int f52388k;

        /* renamed from: l, reason: collision with root package name */
        private int f52389l;

        /* renamed from: m, reason: collision with root package name */
        private int f52390m;

        /* renamed from: n, reason: collision with root package name */
        private boolean f52391n;

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
            this.f52383f = 0.0f;
            this.f52384g = 1.0f;
            this.f52385h = -1;
            this.f52386i = -1.0f;
            this.f52389l = 16777215;
            this.f52390m = 16777215;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void B2(float f4) {
            this.f52384g = f4;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void F3(int i4) {
            this.f52385h = i4;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int G() {
            return this.f52387j;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void H2(int i4) {
            this.f52387j = i4;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int I2() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void K(int i4) {
            this.f52390m = i4;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int M2() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void U0(int i4) {
            this.f52388k = i4;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void a2(float f4) {
            this.f52383f = f4;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float d1() {
            return this.f52383f;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void f2(float f4) {
            this.f52386i = f4;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getHeight() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMaxHeight() {
            return this.f52390m;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMaxWidth() {
            return this.f52389l;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getOrder() {
            return 1;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getWidth() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void i(int i4) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("욱"));
        }

        @Override // com.google.android.flexbox.FlexItem
        public float k1() {
            return this.f52386i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int l() {
            return this.f52385h;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float m() {
            return this.f52384g;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void q(int i4) {
            this.f52389l = i4;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void s(boolean z4) {
            this.f52391n = z4;
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
            return this.f52388k;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            parcel.writeFloat(this.f52383f);
            parcel.writeFloat(this.f52384g);
            parcel.writeInt(this.f52385h);
            parcel.writeFloat(this.f52386i);
            parcel.writeInt(this.f52387j);
            parcel.writeInt(this.f52388k);
            parcel.writeInt(this.f52389l);
            parcel.writeInt(this.f52390m);
            parcel.writeByte(this.f52391n ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        @Override // com.google.android.flexbox.FlexItem
        public boolean y1() {
            return this.f52391n;
        }

        public LayoutParams(int i4, int i5) {
            super(i4, i5);
            this.f52383f = 0.0f;
            this.f52384g = 1.0f;
            this.f52385h = -1;
            this.f52386i = -1.0f;
            this.f52389l = 16777215;
            this.f52390m = 16777215;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f52383f = 0.0f;
            this.f52384g = 1.0f;
            this.f52385h = -1;
            this.f52386i = -1.0f;
            this.f52389l = 16777215;
            this.f52390m = 16777215;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f52383f = 0.0f;
            this.f52384g = 1.0f;
            this.f52385h = -1;
            this.f52386i = -1.0f;
            this.f52389l = 16777215;
            this.f52390m = 16777215;
        }

        public LayoutParams(RecyclerView.LayoutParams layoutParams) {
            super(layoutParams);
            this.f52383f = 0.0f;
            this.f52384g = 1.0f;
            this.f52385h = -1;
            this.f52386i = -1.0f;
            this.f52389l = 16777215;
            this.f52390m = 16777215;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((RecyclerView.LayoutParams) layoutParams);
            this.f52383f = 0.0f;
            this.f52384g = 1.0f;
            this.f52385h = -1;
            this.f52386i = -1.0f;
            this.f52389l = 16777215;
            this.f52390m = 16777215;
            this.f52383f = layoutParams.f52383f;
            this.f52384g = layoutParams.f52384g;
            this.f52385h = layoutParams.f52385h;
            this.f52386i = layoutParams.f52386i;
            this.f52387j = layoutParams.f52387j;
            this.f52388k = layoutParams.f52388k;
            this.f52389l = layoutParams.f52389l;
            this.f52390m = layoutParams.f52390m;
            this.f52391n = layoutParams.f52391n;
        }

        protected LayoutParams(Parcel parcel) {
            super(-2, -2);
            this.f52383f = 0.0f;
            this.f52384g = 1.0f;
            this.f52385h = -1;
            this.f52386i = -1.0f;
            this.f52389l = 16777215;
            this.f52390m = 16777215;
            this.f52383f = parcel.readFloat();
            this.f52384g = parcel.readFloat();
            this.f52385h = parcel.readInt();
            this.f52386i = parcel.readFloat();
            this.f52387j = parcel.readInt();
            this.f52388k = parcel.readInt();
            this.f52389l = parcel.readInt();
            this.f52390m = parcel.readInt();
            this.f52391n = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i4, int i5) {
        this.f52362f = -1;
        this.f52365i = new ArrayList();
        this.f52366j = new h(this);
        this.f52370n = new a();
        this.f52374r = -1;
        this.f52375s = Integer.MIN_VALUE;
        this.f52376t = Integer.MIN_VALUE;
        this.f52377u = Integer.MIN_VALUE;
        this.f52379w = new SparseArray<>();
        this.f52382z = -1;
        this.A = new h.a();
        RecyclerView.LayoutManager.Properties properties = RecyclerView.LayoutManager.getProperties(context, attributeSet, i4, i5);
        int i6 = properties.f32886a;
        if (i6 != 0) {
            if (i6 == 1) {
                if (properties.f32888c) {
                    l(3);
                } else {
                    l(2);
                }
            }
        } else if (properties.f32888c) {
            l(1);
        } else {
            l(0);
        }
        m(1);
        s(4);
        this.f52380x = context;
    }
}
