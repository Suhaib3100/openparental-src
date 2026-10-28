package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.accessibility.g0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public class GridLayoutManager extends LinearLayoutManager {
    private static final boolean X = false;
    private static final String Y = "GridLayoutManager";
    public static final int Z = -1;
    boolean O;
    int P;
    int[] Q;
    View[] R;
    final SparseIntArray S;
    final SparseIntArray T;
    b U;
    final Rect V;
    private boolean W;

    public static final class a extends b {
        @Override // androidx.recyclerview.widget.GridLayoutManager.b
        public int e(int i5, int i6) {
            return i5 % i6;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.b
        public int f(int i5) {
            return 1;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {

        /* renamed from: a, reason: collision with root package name */
        final SparseIntArray f8829a = new SparseIntArray();

        /* renamed from: b, reason: collision with root package name */
        final SparseIntArray f8830b = new SparseIntArray();

        /* renamed from: c, reason: collision with root package name */
        private boolean f8831c = false;

        /* renamed from: d, reason: collision with root package name */
        private boolean f8832d = false;

        static int a(SparseIntArray sparseIntArray, int i5) {
            int size = sparseIntArray.size() - 1;
            int i6 = 0;
            while (i6 <= size) {
                int i7 = (i6 + size) >>> 1;
                if (sparseIntArray.keyAt(i7) < i5) {
                    i6 = i7 + 1;
                } else {
                    size = i7 - 1;
                }
            }
            int i8 = i6 - 1;
            if (i8 < 0 || i8 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i8);
        }

        int b(int i5, int i6) {
            if (!this.f8832d) {
                return d(i5, i6);
            }
            int i7 = this.f8830b.get(i5, -1);
            if (i7 != -1) {
                return i7;
            }
            int d6 = d(i5, i6);
            this.f8830b.put(i5, d6);
            return d6;
        }

        int c(int i5, int i6) {
            if (!this.f8831c) {
                return e(i5, i6);
            }
            int i7 = this.f8829a.get(i5, -1);
            if (i7 != -1) {
                return i7;
            }
            int e6 = e(i5, i6);
            this.f8829a.put(i5, e6);
            return e6;
        }

        public int d(int i5, int i6) {
            int i7;
            int i8;
            int i9;
            int a6;
            if (!this.f8832d || (a6 = a(this.f8830b, i5)) == -1) {
                i7 = 0;
                i8 = 0;
                i9 = 0;
            } else {
                i8 = this.f8830b.get(a6);
                i9 = a6 + 1;
                i7 = f(a6) + c(a6, i6);
                if (i7 == i6) {
                    i8++;
                    i7 = 0;
                }
            }
            int f6 = f(i5);
            while (i9 < i5) {
                int f7 = f(i9);
                i7 += f7;
                if (i7 == i6) {
                    i8++;
                    i7 = 0;
                } else if (i7 > i6) {
                    i8++;
                    i7 = f7;
                }
                i9++;
            }
            return i7 + f6 > i6 ? i8 + 1 : i8;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x002b -> B:10:0x0030). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x002d -> B:10:0x0030). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x002f -> B:10:0x0030). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int e(int r6, int r7) {
            /*
                r5 = this;
                int r0 = r5.f(r6)
                r1 = 0
                if (r0 != r7) goto L8
                return r1
            L8:
                boolean r2 = r5.f8831c
                if (r2 == 0) goto L20
                android.util.SparseIntArray r2 = r5.f8829a
                int r2 = a(r2, r6)
                if (r2 < 0) goto L20
                android.util.SparseIntArray r3 = r5.f8829a
                int r3 = r3.get(r2)
                int r4 = r5.f(r2)
                int r4 = r4 + r3
                goto L30
            L20:
                r2 = r1
                r4 = r2
            L22:
                if (r2 >= r6) goto L33
                int r3 = r5.f(r2)
                int r4 = r4 + r3
                if (r4 != r7) goto L2d
                r4 = r1
                goto L30
            L2d:
                if (r4 <= r7) goto L30
                r4 = r3
            L30:
                int r2 = r2 + 1
                goto L22
            L33:
                int r0 = r0 + r4
                if (r0 > r7) goto L37
                return r4
            L37:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.b.e(int, int):int");
        }

        public abstract int f(int i5);

        public void g() {
            this.f8830b.clear();
        }

        public void h() {
            this.f8829a.clear();
        }

        public boolean i() {
            return this.f8832d;
        }

        public boolean j() {
            return this.f8831c;
        }

        public void k(boolean z5) {
            if (!z5) {
                this.f8830b.clear();
            }
            this.f8832d = z5;
        }

        public void l(boolean z5) {
            if (!z5) {
                this.f8830b.clear();
            }
            this.f8831c = z5;
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i5, int i6) {
        super(context, attributeSet, i5, i6);
        this.O = false;
        this.P = -1;
        this.S = new SparseIntArray();
        this.T = new SparseIntArray();
        this.U = new a();
        this.V = new Rect();
        M3(RecyclerView.LayoutManager.t0(context, attributeSet, i5, i6).f8956b);
    }

    private void A3(RecyclerView.v vVar, RecyclerView.a0 a0Var, LinearLayoutManager.a aVar, int i5) {
        boolean z5 = i5 == 1;
        int F3 = F3(vVar, a0Var, aVar.f8845b);
        if (z5) {
            while (F3 > 0) {
                int i6 = aVar.f8845b;
                if (i6 <= 0) {
                    return;
                }
                int i7 = i6 - 1;
                aVar.f8845b = i7;
                F3 = F3(vVar, a0Var, i7);
            }
            return;
        }
        int d6 = a0Var.d() - 1;
        int i8 = aVar.f8845b;
        while (i8 < d6) {
            int i9 = i8 + 1;
            int F32 = F3(vVar, a0Var, i9);
            if (F32 <= F3) {
                break;
            }
            i8 = i9;
            F3 = F32;
        }
        aVar.f8845b = i8;
    }

    private void B3() {
        View[] viewArr = this.R;
        if (viewArr == null || viewArr.length != this.P) {
            this.R = new View[this.P];
        }
    }

    private int E3(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i5) {
        if (!a0Var.j()) {
            return this.U.b(i5, this.P);
        }
        int g5 = vVar.g(i5);
        if (g5 == -1) {
            return 0;
        }
        return this.U.b(g5, this.P);
    }

    private int F3(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i5) {
        if (!a0Var.j()) {
            return this.U.c(i5, this.P);
        }
        int i6 = this.T.get(i5, -1);
        if (i6 != -1) {
            return i6;
        }
        int g5 = vVar.g(i5);
        if (g5 == -1) {
            return 0;
        }
        return this.U.c(g5, this.P);
    }

    private int G3(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i5) {
        if (!a0Var.j()) {
            return this.U.f(i5);
        }
        int i6 = this.S.get(i5, -1);
        if (i6 != -1) {
            return i6;
        }
        int g5 = vVar.g(i5);
        if (g5 == -1) {
            return 1;
        }
        return this.U.f(g5);
    }

    private void I3(float f6, int i5) {
        v3(Math.max(Math.round(f6 * this.P), i5));
    }

    private void K3(View view, int i5, boolean z5) {
        int i6;
        int i7;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect = layoutParams.f8962b;
        int i8 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        int i9 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        int C3 = C3(layoutParams.f8827e, layoutParams.f8828f);
        if (this.f8833s == 1) {
            i7 = RecyclerView.LayoutManager.R(C3, i5, i9, ((ViewGroup.MarginLayoutParams) layoutParams).width, false);
            i6 = RecyclerView.LayoutManager.R(this.f8835u.o(), f0(), i8, ((ViewGroup.MarginLayoutParams) layoutParams).height, true);
        } else {
            int R = RecyclerView.LayoutManager.R(C3, i5, i8, ((ViewGroup.MarginLayoutParams) layoutParams).height, false);
            int R2 = RecyclerView.LayoutManager.R(this.f8835u.o(), A0(), i9, ((ViewGroup.MarginLayoutParams) layoutParams).width, true);
            i6 = R;
            i7 = R2;
        }
        L3(view, i7, i6, z5);
    }

    private void L3(View view, int i5, int i6, boolean z5) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (z5 ? e2(view, i5, i6, layoutParams) : c2(view, i5, i6, layoutParams)) {
            view.measure(i5, i6);
        }
    }

    private void P3() {
        int e02;
        int r02;
        if (M2() == 1) {
            e02 = z0() - p0();
            r02 = o0();
        } else {
            e02 = e0() - m0();
            r02 = r0();
        }
        v3(e02 - r02);
    }

    private void t3(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i5, boolean z5) {
        int i6;
        int i7;
        int i8;
        int i9 = 0;
        if (z5) {
            i8 = 1;
            i7 = i5;
            i6 = 0;
        } else {
            i6 = i5 - 1;
            i7 = -1;
            i8 = -1;
        }
        while (i6 != i7) {
            View view = this.R[i6];
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int G3 = G3(vVar, a0Var, s0(view));
            layoutParams.f8828f = G3;
            layoutParams.f8827e = i9;
            i9 += G3;
            i6 += i8;
        }
    }

    private void u3() {
        int Q = Q();
        for (int i5 = 0; i5 < Q; i5++) {
            LayoutParams layoutParams = (LayoutParams) P(i5).getLayoutParams();
            int d6 = layoutParams.d();
            this.S.put(d6, layoutParams.k());
            this.T.put(d6, layoutParams.j());
        }
    }

    private void v3(int i5) {
        this.Q = w3(this.Q, this.P, i5);
    }

    static int[] w3(int[] iArr, int i5, int i6) {
        int i7;
        if (iArr == null || iArr.length != i5 + 1 || iArr[iArr.length - 1] != i6) {
            iArr = new int[i5 + 1];
        }
        int i8 = 0;
        iArr[0] = 0;
        int i9 = i6 / i5;
        int i10 = i6 % i5;
        int i11 = 0;
        for (int i12 = 1; i12 <= i5; i12++) {
            i8 += i10;
            if (i8 <= 0 || i5 - i8 >= i10) {
                i7 = i9;
            } else {
                i7 = i9 + 1;
                i8 -= i5;
            }
            i11 += i7;
            iArr[i12] = i11;
        }
        return iArr;
    }

    private void x3() {
        this.S.clear();
        this.T.clear();
    }

    private int y3(RecyclerView.a0 a0Var) {
        if (Q() != 0 && a0Var.d() != 0) {
            r2();
            boolean R2 = R2();
            View w22 = w2(!R2, true);
            View v22 = v2(!R2, true);
            if (w22 != null && v22 != null) {
                int b6 = this.U.b(s0(w22), this.P);
                int b7 = this.U.b(s0(v22), this.P);
                int max = this.f8838x ? Math.max(0, ((this.U.b(a0Var.d() - 1, this.P) + 1) - Math.max(b6, b7)) - 1) : Math.max(0, Math.min(b6, b7));
                if (R2) {
                    return Math.round((max * (Math.abs(this.f8835u.d(v22) - this.f8835u.g(w22)) / ((this.U.b(s0(v22), this.P) - this.U.b(s0(w22), this.P)) + 1))) + (this.f8835u.n() - this.f8835u.g(w22)));
                }
                return max;
            }
        }
        return 0;
    }

    private int z3(RecyclerView.a0 a0Var) {
        if (Q() != 0 && a0Var.d() != 0) {
            r2();
            View w22 = w2(!R2(), true);
            View v22 = v2(!R2(), true);
            if (w22 != null && v22 != null) {
                if (!R2()) {
                    return this.U.b(a0Var.d() - 1, this.P) + 1;
                }
                int d6 = this.f8835u.d(v22) - this.f8835u.g(w22);
                int b6 = this.U.b(s0(w22), this.P);
                return (int) ((d6 / ((this.U.b(s0(v22), this.P) - b6) + 1)) * (this.U.b(a0Var.d() - 1, this.P) + 1));
            }
        }
        return 0;
    }

    int C3(int i5, int i6) {
        if (this.f8833s != 1 || !Q2()) {
            int[] iArr = this.Q;
            return iArr[i6 + i5] - iArr[i5];
        }
        int[] iArr2 = this.Q;
        int i7 = this.P;
        return iArr2[i7 - i5] - iArr2[(i7 - i5) - i6];
    }

    public int D3() {
        return this.P;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    View F2(RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z5, boolean z6) {
        int i5;
        int i6;
        int Q = Q();
        int i7 = 1;
        if (z6) {
            i6 = Q() - 1;
            i5 = -1;
            i7 = -1;
        } else {
            i5 = Q;
            i6 = 0;
        }
        int d6 = a0Var.d();
        r2();
        int n5 = this.f8835u.n();
        int i8 = this.f8835u.i();
        View view = null;
        View view2 = null;
        while (i6 != i5) {
            View P = P(i6);
            int s02 = s0(P);
            if (s02 >= 0 && s02 < d6 && F3(vVar, a0Var, s02) == 0) {
                if (((RecyclerView.LayoutParams) P.getLayoutParams()).g()) {
                    if (view2 == null) {
                        view2 = P;
                    }
                } else {
                    if (this.f8835u.g(P) < i8 && this.f8835u.d(P) >= n5) {
                        return P;
                    }
                    if (view == null) {
                        view = P;
                    }
                }
            }
            i6 += i7;
        }
        return view != null ? view : view2;
    }

    public b H3() {
        return this.U;
    }

    public boolean J3() {
        return this.W;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams K() {
        return this.f8833s == 0 ? new LayoutParams(-2, -1) : new LayoutParams(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams L(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams M(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public void M3(int i5) {
        if (i5 == this.P) {
            return;
        }
        this.O = true;
        if (i5 < 1) {
            throw new IllegalArgumentException(androidx.appcompat.view.menu.s.a("Span count should be at least 1. Provided ", i5));
        }
        this.P = i5;
        this.U.h();
        N1();
    }

    public void N3(b bVar) {
        this.U = bVar;
    }

    public void O3(boolean z5) {
        this.W = z5;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int Q1(int i5, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        P3();
        B3();
        return super.Q1(i5, vVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int S1(int i5, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        P3();
        B3();
        return super.S1(i5, vVar, a0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0094, code lost:
    
        r21.f8850b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0096, code lost:
    
        return;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void S2(androidx.recyclerview.widget.RecyclerView.v r18, androidx.recyclerview.widget.RecyclerView.a0 r19, androidx.recyclerview.widget.LinearLayoutManager.c r20, androidx.recyclerview.widget.LinearLayoutManager.b r21) {
        /*
            Method dump skipped, instructions count: 539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.S2(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0, androidx.recyclerview.widget.LinearLayoutManager$c, androidx.recyclerview.widget.LinearLayoutManager$b):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int V(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.f8833s == 1) {
            return this.P;
        }
        if (a0Var.d() < 1) {
            return 0;
        }
        return E3(vVar, a0Var, a0Var.d() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void V2(RecyclerView.v vVar, RecyclerView.a0 a0Var, LinearLayoutManager.a aVar, int i5) {
        P3();
        if (a0Var.d() > 0 && !a0Var.j()) {
            A3(vVar, a0Var, aVar, i5);
        }
        B3();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void Y1(Rect rect, int i5, int i6) {
        int q5;
        int q6;
        if (this.Q == null) {
            super.Y1(rect, i5, i6);
        }
        int p02 = p0() + o0();
        int m02 = m0() + r0();
        if (this.f8833s == 1) {
            q6 = RecyclerView.LayoutManager.q(i6, rect.height() + m02, k0());
            int[] iArr = this.Q;
            q5 = RecyclerView.LayoutManager.q(i5, iArr[iArr.length - 1] + p02, l0());
        } else {
            q5 = RecyclerView.LayoutManager.q(i5, rect.width() + p02, l0());
            int[] iArr2 = this.Q;
            q6 = RecyclerView.LayoutManager.q(i6, iArr2[iArr2.length - 1] + m02, k0());
        }
        X1(q5, q6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d6, code lost:
    
        if (r13 == (r2 > r15)) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00f6, code lost:
    
        if (r13 == (r2 > r7)) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0107  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View a1(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.v r26, androidx.recyclerview.widget.RecyclerView.a0 r27) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.a1(android.view.View, int, androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0):android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void g1(RecyclerView.v vVar, RecyclerView.a0 a0Var, View view, androidx.core.view.accessibility.g0 g0Var) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof LayoutParams)) {
            super.f1(view, g0Var);
            return;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        int E3 = E3(vVar, a0Var, layoutParams2.d());
        if (this.f8833s == 0) {
            g0Var.Z0(g0.c.h(layoutParams2.j(), layoutParams2.k(), E3, 1, false, false));
        } else {
            g0Var.Z0(g0.c.h(E3, 1, layoutParams2.j(), layoutParams2.k(), false, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void i1(RecyclerView recyclerView, int i5, int i6) {
        this.U.h();
        this.U.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void j1(RecyclerView recyclerView) {
        this.U.h();
        this.U.g();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean j2() {
        return this.D == null && !this.O;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void j3(boolean z5) {
        if (z5) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.j3(false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void k1(RecyclerView recyclerView, int i5, int i6, int i7) {
        this.U.h();
        this.U.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void l1(RecyclerView recyclerView, int i5, int i6) {
        this.U.h();
        this.U.g();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void l2(RecyclerView.a0 a0Var, LinearLayoutManager.c cVar, RecyclerView.LayoutManager.c cVar2) {
        int i5 = this.P;
        for (int i6 = 0; i6 < this.P && cVar.c(a0Var) && i5 > 0; i6++) {
            int i7 = cVar.f8863d;
            cVar2.a(i7, Math.max(0, cVar.f8866g));
            i5 -= this.U.f(i7);
            cVar.f8863d += cVar.f8864e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void n1(RecyclerView recyclerView, int i5, int i6, Object obj) {
        this.U.h();
        this.U.g();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void o1(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (a0Var.j()) {
            u3();
        }
        super.o1(vVar, a0Var);
        x3();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean p(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void p1(RecyclerView.a0 a0Var) {
        super.p1(a0Var);
        this.O = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int u(RecyclerView.a0 a0Var) {
        return this.W ? y3(a0Var) : super.u(a0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int v(RecyclerView.a0 a0Var) {
        return this.W ? z3(a0Var) : super.v(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int v0(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.f8833s == 0) {
            return this.P;
        }
        if (a0Var.d() < 1) {
            return 0;
        }
        return E3(vVar, a0Var, a0Var.d() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int x(RecyclerView.a0 a0Var) {
        return this.W ? y3(a0Var) : super.x(a0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int y(RecyclerView.a0 a0Var) {
        return this.W ? z3(a0Var) : super.y(a0Var);
    }

    public static class LayoutParams extends RecyclerView.LayoutParams {

        /* renamed from: g, reason: collision with root package name */
        public static final int f8826g = -1;

        /* renamed from: e, reason: collision with root package name */
        int f8827e;

        /* renamed from: f, reason: collision with root package name */
        int f8828f;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f8827e = -1;
            this.f8828f = 0;
        }

        public int j() {
            return this.f8827e;
        }

        public int k() {
            return this.f8828f;
        }

        public LayoutParams(int i5, int i6) {
            super(i5, i6);
            this.f8827e = -1;
            this.f8828f = 0;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f8827e = -1;
            this.f8828f = 0;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f8827e = -1;
            this.f8828f = 0;
        }

        public LayoutParams(RecyclerView.LayoutParams layoutParams) {
            super(layoutParams);
            this.f8827e = -1;
            this.f8828f = 0;
        }
    }

    public GridLayoutManager(Context context, int i5) {
        super(context);
        this.O = false;
        this.P = -1;
        this.S = new SparseIntArray();
        this.T = new SparseIntArray();
        this.U = new a();
        this.V = new Rect();
        M3(i5);
    }

    public GridLayoutManager(Context context, int i5, int i6, boolean z5) {
        super(context, i6, z5);
        this.O = false;
        this.P = -1;
        this.S = new SparseIntArray();
        this.T = new SparseIntArray();
        this.U = new a();
        this.V = new Rect();
        M3(i5);
    }
}
