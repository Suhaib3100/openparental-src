package androidx.viewpager2.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.u0;
import androidx.annotation.x0;
import androidx.core.view.accessibility.g0;
import androidx.core.view.accessibility.m0;
import androidx.core.view.y1;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a0;
import com.google.android.material.badge.BadgeDrawable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import v0.a;

/* loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {
    public static final int I = 0;
    public static final int J = 1;
    public static final int K = 0;
    public static final int L = 1;
    public static final int M = 2;
    public static final int N = -1;
    static boolean O = true;
    private androidx.viewpager2.widget.b A;
    private androidx.viewpager2.widget.d B;
    private androidx.viewpager2.widget.f C;
    private RecyclerView.m D;
    private boolean E;
    private boolean F;
    private int G;
    e H;

    /* renamed from: o, reason: collision with root package name */
    private final Rect f10452o;

    /* renamed from: p, reason: collision with root package name */
    private final Rect f10453p;

    /* renamed from: q, reason: collision with root package name */
    private androidx.viewpager2.widget.b f10454q;

    /* renamed from: r, reason: collision with root package name */
    int f10455r;

    /* renamed from: s, reason: collision with root package name */
    boolean f10456s;

    /* renamed from: t, reason: collision with root package name */
    private RecyclerView.j f10457t;

    /* renamed from: u, reason: collision with root package name */
    private LinearLayoutManager f10458u;

    /* renamed from: v, reason: collision with root package name */
    private int f10459v;

    /* renamed from: w, reason: collision with root package name */
    private Parcelable f10460w;

    /* renamed from: x, reason: collision with root package name */
    RecyclerView f10461x;

    /* renamed from: y, reason: collision with root package name */
    private a0 f10462y;

    /* renamed from: z, reason: collision with root package name */
    androidx.viewpager2.widget.g f10463z;

    /* loaded from: classes3.dex */
    class a extends g {
        a() {
            super(null);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g, androidx.recyclerview.widget.RecyclerView.j
        public void a() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.f10456s = true;
            viewPager2.f10463z.n();
        }
    }

    /* loaded from: classes3.dex */
    class b extends j {
        b() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.j
        public void a(int i5) {
            if (i5 == 0) {
                ViewPager2.this.L();
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.j
        public void c(int i5) {
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.f10455r != i5) {
                viewPager2.f10455r = i5;
                viewPager2.H.q();
            }
        }
    }

    /* loaded from: classes3.dex */
    class c extends j {
        c() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.j
        public void c(int i5) {
            ViewPager2.this.clearFocus();
            if (ViewPager2.this.hasFocus()) {
                ViewPager2.this.f10461x.requestFocus(2);
            }
        }
    }

    /* loaded from: classes3.dex */
    class d implements RecyclerView.p {
        d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public void b(@o0 View view) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public void d(@o0 View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            if (((ViewGroup.MarginLayoutParams) layoutParams).width != -1 || ((ViewGroup.MarginLayoutParams) layoutParams).height != -1) {
                throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
            }
        }
    }

    private abstract class e {
        private e() {
        }

        boolean a() {
            return false;
        }

        boolean b(int i5) {
            return false;
        }

        boolean c(int i5, Bundle bundle) {
            return false;
        }

        boolean d() {
            return false;
        }

        void e(@q0 RecyclerView.h<?> hVar) {
        }

        void f(@q0 RecyclerView.h<?> hVar) {
        }

        String g() {
            throw new IllegalStateException("Not implemented.");
        }

        void h(@o0 androidx.viewpager2.widget.b bVar, @o0 RecyclerView recyclerView) {
        }

        void i(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        void j(@o0 g0 g0Var) {
        }

        boolean k(int i5) {
            throw new IllegalStateException("Not implemented.");
        }

        boolean l(int i5, Bundle bundle) {
            throw new IllegalStateException("Not implemented.");
        }

        void m() {
        }

        CharSequence n() {
            throw new IllegalStateException("Not implemented.");
        }

        void o(@o0 AccessibilityEvent accessibilityEvent) {
        }

        void p() {
        }

        void q() {
        }

        void r() {
        }

        void s() {
        }

        /* synthetic */ e(ViewPager2 viewPager2, a aVar) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    class f extends e {
        f() {
            super(ViewPager2.this, null);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean b(int i5) {
            return (i5 == 8192 || i5 == 4096) && !ViewPager2.this.s();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean d() {
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void j(@o0 g0 g0Var) {
            if (ViewPager2.this.s()) {
                return;
            }
            g0Var.K0(g0.a.f5386s);
            g0Var.K0(g0.a.f5385r);
            g0Var.F1(false);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean k(int i5) {
            if (b(i5)) {
                return false;
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public CharSequence n() {
            if (d()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }
    }

    /* loaded from: classes3.dex */
    private static abstract class g extends RecyclerView.j {
        private g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public abstract void a();

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void b(int i5, int i6) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void c(int i5, int i6, @q0 Object obj) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void d(int i5, int i6) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void e(int i5, int i6, int i7) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void f(int i5, int i6) {
            a();
        }

        g(a aVar) {
        }
    }

    /* loaded from: classes3.dex */
    private class h extends LinearLayoutManager {
        h(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public boolean M1(@o0 RecyclerView recyclerView, @o0 View view, @o0 Rect rect, boolean z5, boolean z6) {
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public void e1(@o0 RecyclerView.v vVar, @o0 RecyclerView.a0 a0Var, @o0 g0 g0Var) {
            super.e1(vVar, a0Var, g0Var);
            ViewPager2.this.H.j(g0Var);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        protected void k2(@o0 RecyclerView.a0 a0Var, @o0 int[] iArr) {
            int k5 = ViewPager2.this.k();
            if (k5 == -1) {
                super.k2(a0Var, iArr);
                return;
            }
            int m5 = ViewPager2.this.m() * k5;
            iArr[0] = m5;
            iArr[1] = m5;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public boolean y1(@o0 RecyclerView.v vVar, @o0 RecyclerView.a0 a0Var, int i5, @q0 Bundle bundle) {
            return ViewPager2.this.H.b(i5) ? ViewPager2.this.H.k(i5) : super.y1(vVar, a0Var, i5, bundle);
        }
    }

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.g0(from = 1)
    @Retention(RetentionPolicy.SOURCE)
    public @interface i {
    }

    public static abstract class j {
        public void a(int i5) {
        }

        public void b(int i5, float f6, @u0 int i6) {
        }

        public void c(int i5) {
        }
    }

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface k {
    }

    /* loaded from: classes3.dex */
    class l extends e {

        /* renamed from: b, reason: collision with root package name */
        private final m0 f10473b;

        /* renamed from: c, reason: collision with root package name */
        private final m0 f10474c;

        /* renamed from: d, reason: collision with root package name */
        private RecyclerView.j f10475d;

        class a implements m0 {
            a() {
            }

            @Override // androidx.core.view.accessibility.m0
            public boolean a(@o0 View view, @q0 m0.a aVar) {
                l.this.v(((ViewPager2) view).f10455r + 1);
                return true;
            }
        }

        class b implements m0 {
            b() {
            }

            @Override // androidx.core.view.accessibility.m0
            public boolean a(@o0 View view, @q0 m0.a aVar) {
                l.this.v(((ViewPager2) view).f10455r - 1);
                return true;
            }
        }

        class c extends g {
            c() {
                super(null);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.g, androidx.recyclerview.widget.RecyclerView.j
            public void a() {
                l.this.w();
            }
        }

        l() {
            super(ViewPager2.this, null);
            this.f10473b = new a();
            this.f10474c = new b();
        }

        private void t(AccessibilityNodeInfo accessibilityNodeInfo) {
            int i5;
            int i6;
            if (ViewPager2.this.g() == null) {
                i5 = 0;
                i6 = 0;
            } else if (ViewPager2.this.l() == 1) {
                i5 = ViewPager2.this.g().g();
                i6 = 0;
            } else {
                i6 = ViewPager2.this.g().g();
                i5 = 0;
            }
            g0.X1(accessibilityNodeInfo).Y0(g0.b.f(i5, i6, false, 0));
        }

        private void u(AccessibilityNodeInfo accessibilityNodeInfo) {
            int g5;
            RecyclerView.h g6 = ViewPager2.this.g();
            if (g6 == null || (g5 = g6.g()) == 0 || !ViewPager2.this.s()) {
                return;
            }
            if (ViewPager2.this.f10455r > 0) {
                accessibilityNodeInfo.addAction(8192);
            }
            if (ViewPager2.this.f10455r < g5 - 1) {
                accessibilityNodeInfo.addAction(4096);
            }
            accessibilityNodeInfo.setScrollable(true);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean a() {
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean c(int i5, Bundle bundle) {
            return i5 == 8192 || i5 == 4096;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void e(@q0 RecyclerView.h<?> hVar) {
            w();
            if (hVar != null) {
                hVar.F(this.f10475d);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void f(@q0 RecyclerView.h<?> hVar) {
            if (hVar != null) {
                hVar.I(this.f10475d);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public String g() {
            if (a()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void h(@o0 androidx.viewpager2.widget.b bVar, @o0 RecyclerView recyclerView) {
            y1.R1(recyclerView, 2);
            this.f10475d = new c();
            if (y1.V(ViewPager2.this) == 0) {
                y1.R1(ViewPager2.this, 1);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void i(AccessibilityNodeInfo accessibilityNodeInfo) {
            t(accessibilityNodeInfo);
            u(accessibilityNodeInfo);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean l(int i5, Bundle bundle) {
            if (!c(i5, bundle)) {
                throw new IllegalStateException();
            }
            v(i5 == 8192 ? ViewPager2.this.f10455r - 1 : ViewPager2.this.f10455r + 1);
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void m() {
            w();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void o(@o0 AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName(g());
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void p() {
            w();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void q() {
            w();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void r() {
            w();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void s() {
            w();
        }

        void v(int i5) {
            if (ViewPager2.this.s()) {
                ViewPager2.this.C(i5, true);
            }
        }

        void w() {
            int g5;
            ViewPager2 viewPager2 = ViewPager2.this;
            int i5 = R.id.accessibilityActionPageLeft;
            y1.r1(viewPager2, R.id.accessibilityActionPageLeft);
            y1.r1(viewPager2, R.id.accessibilityActionPageRight);
            y1.r1(viewPager2, R.id.accessibilityActionPageUp);
            y1.r1(viewPager2, R.id.accessibilityActionPageDown);
            if (ViewPager2.this.g() == null || (g5 = ViewPager2.this.g().g()) == 0 || !ViewPager2.this.s()) {
                return;
            }
            if (ViewPager2.this.l() != 0) {
                if (ViewPager2.this.f10455r < g5 - 1) {
                    y1.u1(viewPager2, new g0.a(R.id.accessibilityActionPageDown, null), null, this.f10473b);
                }
                if (ViewPager2.this.f10455r > 0) {
                    y1.u1(viewPager2, new g0.a(R.id.accessibilityActionPageUp, null), null, this.f10474c);
                    return;
                }
                return;
            }
            boolean r5 = ViewPager2.this.r();
            int i6 = r5 ? 16908360 : 16908361;
            if (r5) {
                i5 = 16908361;
            }
            if (ViewPager2.this.f10455r < g5 - 1) {
                y1.u1(viewPager2, new g0.a(i6, null), null, this.f10473b);
            }
            if (ViewPager2.this.f10455r > 0) {
                y1.u1(viewPager2, new g0.a(i5, null), null, this.f10474c);
            }
        }
    }

    public interface m {
        void a(@o0 View view, float f6);
    }

    /* loaded from: classes3.dex */
    private class n extends a0 {
        n() {
        }

        @Override // androidx.recyclerview.widget.a0, androidx.recyclerview.widget.e0
        @q0
        public View h(RecyclerView.LayoutManager layoutManager) {
            if (ViewPager2.this.q()) {
                return null;
            }
            return super.h(layoutManager);
        }
    }

    /* loaded from: classes4.dex */
    private class o extends RecyclerView {
        o(@o0 Context context) {
            super(context, null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        @x0(23)
        public CharSequence getAccessibilityClassName() {
            return ViewPager2.this.H.d() ? ViewPager2.this.H.n() : "androidx.recyclerview.widget.RecyclerView";
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(@o0 AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(ViewPager2.this.f10455r);
            accessibilityEvent.setToIndex(ViewPager2.this.f10455r);
            ViewPager2.this.H.o(accessibilityEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.s() && super.onInterceptTouchEvent(motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.s() && super.onTouchEvent(motionEvent);
        }
    }

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface p {
    }

    private static class q implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        private final int f10481o;

        /* renamed from: p, reason: collision with root package name */
        private final RecyclerView f10482p;

        q(int i5, RecyclerView recyclerView) {
            this.f10481o = i5;
            this.f10482p = recyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f10482p.u2(this.f10481o);
        }
    }

    public ViewPager2(@o0 Context context) {
        super(context);
        this.f10452o = new Rect();
        this.f10453p = new Rect();
        this.f10454q = new androidx.viewpager2.widget.b(3);
        this.f10456s = false;
        this.f10457t = new a();
        this.f10459v = -1;
        this.D = null;
        this.E = false;
        this.F = true;
        this.G = -1;
        o(context, null);
    }

    private void F(Context context, AttributeSet attributeSet) {
        int[] iArr = a.j.f33866c0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        }
        try {
            E(obtainStyledAttributes.getInt(a.j.f33868d0, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private void J(@q0 RecyclerView.h<?> hVar) {
        if (hVar != null) {
            hVar.I(this.f10457t);
        }
    }

    private RecyclerView.p e() {
        return new d();
    }

    private void o(Context context, AttributeSet attributeSet) {
        this.H = O ? new l() : new f();
        o oVar = new o(context);
        this.f10461x = oVar;
        oVar.setId(y1.D());
        this.f10461x.setDescendantFocusability(131072);
        h hVar = new h(context);
        this.f10458u = hVar;
        this.f10461x.g2(hVar);
        this.f10461x.n2(1);
        F(context, attributeSet);
        this.f10461x.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f10461x.q(new d());
        androidx.viewpager2.widget.g gVar = new androidx.viewpager2.widget.g(this);
        this.f10463z = gVar;
        this.B = new androidx.viewpager2.widget.d(this, gVar, this.f10461x);
        n nVar = new n();
        this.f10462y = nVar;
        nVar.b(this.f10461x);
        this.f10461x.s(this.f10463z);
        androidx.viewpager2.widget.b bVar = new androidx.viewpager2.widget.b(3);
        this.A = bVar;
        this.f10463z.r(bVar);
        b bVar2 = new b();
        c cVar = new c();
        this.A.d(bVar2);
        this.A.d(cVar);
        this.H.h(this.A, this.f10461x);
        this.A.d(this.f10454q);
        androidx.viewpager2.widget.f fVar = new androidx.viewpager2.widget.f(this.f10458u);
        this.C = fVar;
        this.A.d(fVar);
        RecyclerView recyclerView = this.f10461x;
        attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
    }

    private void t(@q0 RecyclerView.h<?> hVar) {
        if (hVar != null) {
            hVar.F(this.f10457t);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void y() {
        RecyclerView.h g5;
        if (this.f10459v == -1 || (g5 = g()) == 0) {
            return;
        }
        Parcelable parcelable = this.f10460w;
        if (parcelable != null) {
            if (g5 instanceof androidx.viewpager2.adapter.b) {
                ((androidx.viewpager2.adapter.b) g5).b(parcelable);
            }
            this.f10460w = null;
        }
        int max = Math.max(0, Math.min(this.f10459v, g5.g() - 1));
        this.f10455r = max;
        this.f10459v = -1;
        this.f10461x.V1(max);
        this.H.m();
    }

    public void A(int i5) {
        B(i5, true);
    }

    public void B(int i5, boolean z5) {
        if (q()) {
            throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
        }
        C(i5, z5);
    }

    void C(int i5, boolean z5) {
        RecyclerView.h g5 = g();
        if (g5 == null) {
            if (this.f10459v != -1) {
                this.f10459v = Math.max(i5, 0);
                return;
            }
            return;
        }
        if (g5.g() <= 0) {
            return;
        }
        int min = Math.min(Math.max(i5, 0), g5.g() - 1);
        if (min == this.f10455r && this.f10463z.k()) {
            return;
        }
        int i6 = this.f10455r;
        if (min == i6 && z5) {
            return;
        }
        double d6 = i6;
        this.f10455r = min;
        this.H.q();
        if (!this.f10463z.k()) {
            d6 = this.f10463z.g();
        }
        this.f10463z.p(min, z5);
        if (!z5) {
            this.f10461x.V1(min);
            return;
        }
        double d7 = min;
        if (Math.abs(d7 - d6) <= 3.0d) {
            this.f10461x.u2(min);
            return;
        }
        this.f10461x.V1(d7 > d6 ? min - 3 : min + 3);
        RecyclerView recyclerView = this.f10461x;
        recyclerView.post(new q(min, recyclerView));
    }

    public void D(int i5) {
        if (i5 < 1 && i5 != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.G = i5;
        this.f10461x.requestLayout();
    }

    public void E(int i5) {
        this.f10458u.f3(i5);
        this.H.r();
    }

    public void G(@q0 m mVar) {
        if (mVar != null) {
            if (!this.E) {
                this.D = this.f10461x.D0();
                this.E = true;
            }
            this.f10461x.d2(null);
        } else if (this.E) {
            this.f10461x.d2(this.D);
            this.D = null;
            this.E = false;
        }
        if (mVar == this.C.d()) {
            return;
        }
        this.C.e(mVar);
        x();
    }

    public void H(boolean z5) {
        this.F = z5;
        this.H.s();
    }

    void I() {
        View h5 = this.f10462y.h(this.f10458u);
        if (h5 == null) {
            return;
        }
        int[] c6 = this.f10462y.c(this.f10458u, h5);
        int i5 = c6[0];
        if (i5 == 0 && c6[1] == 0) {
            return;
        }
        this.f10461x.q2(i5, c6[1]);
    }

    public void K(@o0 j jVar) {
        this.f10454q.e(jVar);
    }

    void L() {
        a0 a0Var = this.f10462y;
        if (a0Var == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View h5 = a0Var.h(this.f10458u);
        if (h5 == null) {
            return;
        }
        int s02 = this.f10458u.s0(h5);
        if (s02 != this.f10455r && n() == 0) {
            this.A.c(s02);
        }
        this.f10456s = false;
    }

    public void a(@o0 RecyclerView.o oVar) {
        this.f10461x.o(oVar);
    }

    public void b(@o0 RecyclerView.o oVar, int i5) {
        this.f10461x.p(oVar, i5);
    }

    public boolean c() {
        return this.B.b();
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i5) {
        return this.f10461x.canScrollHorizontally(i5);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i5) {
        return this.f10461x.canScrollVertically(i5);
    }

    public boolean d() {
        return this.B.d();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i5 = ((SavedState) parcelable).f10464o;
            sparseArray.put(this.f10461x.getId(), sparseArray.get(i5));
            sparseArray.remove(i5);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        y();
    }

    public boolean f(@u0 @SuppressLint({"SupportAnnotationUsage"}) float f6) {
        return this.B.e(f6);
    }

    @q0
    public RecyclerView.h g() {
        return this.f10461x.o0();
    }

    @Override // android.view.ViewGroup, android.view.View
    @x0(23)
    public CharSequence getAccessibilityClassName() {
        return this.H.a() ? this.H.g() : super.getAccessibilityClassName();
    }

    public int h() {
        return this.f10455r;
    }

    @o0
    public RecyclerView.o i(int i5) {
        return this.f10461x.F0(i5);
    }

    public int j() {
        return this.f10461x.G0();
    }

    public int k() {
        return this.G;
    }

    public int l() {
        return this.f10458u.M2();
    }

    int m() {
        int height;
        int paddingBottom;
        RecyclerView recyclerView = this.f10461x;
        if (l() == 0) {
            height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            height = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int n() {
        return this.f10463z.h();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.H.i(accessibilityNodeInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z5, int i5, int i6, int i7, int i8) {
        int measuredWidth = this.f10461x.getMeasuredWidth();
        int measuredHeight = this.f10461x.getMeasuredHeight();
        this.f10452o.left = getPaddingLeft();
        this.f10452o.right = (i7 - i5) - getPaddingRight();
        this.f10452o.top = getPaddingTop();
        this.f10452o.bottom = (i8 - i6) - getPaddingBottom();
        Gravity.apply(BadgeDrawable.F, measuredWidth, measuredHeight, this.f10452o, this.f10453p);
        RecyclerView recyclerView = this.f10461x;
        Rect rect = this.f10453p;
        recyclerView.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.f10456s) {
            L();
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i5, int i6) {
        measureChild(this.f10461x, i5, i6);
        int measuredWidth = this.f10461x.getMeasuredWidth();
        int measuredHeight = this.f10461x.getMeasuredHeight();
        int measuredState = this.f10461x.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + measuredHeight;
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i5, measuredState), View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i6, measuredState << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f10459v = savedState.f10465p;
        this.f10460w = savedState.f10466q;
    }

    @Override // android.view.View
    @q0
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f10464o = this.f10461x.getId();
        int i5 = this.f10459v;
        if (i5 == -1) {
            i5 = this.f10455r;
        }
        savedState.f10465p = i5;
        Parcelable parcelable = this.f10460w;
        if (parcelable != null) {
            savedState.f10466q = parcelable;
        } else {
            Object o02 = this.f10461x.o0();
            if (o02 instanceof androidx.viewpager2.adapter.b) {
                savedState.f10466q = ((androidx.viewpager2.adapter.b) o02).a();
            }
        }
        return savedState;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    public void p() {
        this.f10461x.Z0();
    }

    @Override // android.view.View
    @x0(16)
    public boolean performAccessibilityAction(int i5, Bundle bundle) {
        return this.H.c(i5, bundle) ? this.H.l(i5, bundle) : super.performAccessibilityAction(i5, bundle);
    }

    public boolean q() {
        return this.B.f();
    }

    boolean r() {
        return this.f10458u.i0() == 1;
    }

    public boolean s() {
        return this.F;
    }

    @Override // android.view.View
    @x0(17)
    public void setLayoutDirection(int i5) {
        super.setLayoutDirection(i5);
        this.H.p();
    }

    public void u(@o0 j jVar) {
        this.f10454q.d(jVar);
    }

    public void v(@o0 RecyclerView.o oVar) {
        this.f10461x.H1(oVar);
    }

    public void w(int i5) {
        this.f10461x.I1(i5);
    }

    public void x() {
        if (this.C.d() == null) {
            return;
        }
        double g5 = this.f10463z.g();
        int i5 = (int) g5;
        float f6 = (float) (g5 - i5);
        this.C.b(i5, f6, Math.round(m() * f6));
    }

    public void z(@q0 RecyclerView.h hVar) {
        RecyclerView.h o02 = this.f10461x.o0();
        this.H.f(o02);
        J(o02);
        this.f10461x.X1(hVar);
        this.f10455r = 0;
        y();
        this.H.e(hVar);
        t(hVar);
    }

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: o, reason: collision with root package name */
        int f10464o;

        /* renamed from: p, reason: collision with root package name */
        int f10465p;

        /* renamed from: q, reason: collision with root package name */
        Parcelable f10466q;

        static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            public SavedState b(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public SavedState[] c(int i5) {
                return new SavedState[i5];
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i5) {
                return new SavedState[i5];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        }

        @x0(24)
        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            a(parcel, classLoader);
        }

        private void a(Parcel parcel, ClassLoader classLoader) {
            this.f10464o = parcel.readInt();
            this.f10465p = parcel.readInt();
            this.f10466q = parcel.readParcelable(classLoader);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i5) {
            super.writeToParcel(parcel, i5);
            parcel.writeInt(this.f10464o);
            parcel.writeInt(this.f10465p);
            parcel.writeParcelable(this.f10466q, i5);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            a(parcel, null);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public ViewPager2(@o0 Context context, @q0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10452o = new Rect();
        this.f10453p = new Rect();
        this.f10454q = new androidx.viewpager2.widget.b(3);
        this.f10456s = false;
        this.f10457t = new a();
        this.f10459v = -1;
        this.D = null;
        this.E = false;
        this.F = true;
        this.G = -1;
        o(context, attributeSet);
    }

    public ViewPager2(@o0 Context context, @q0 AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.f10452o = new Rect();
        this.f10453p = new Rect();
        this.f10454q = new androidx.viewpager2.widget.b(3);
        this.f10456s = false;
        this.f10457t = new a();
        this.f10459v = -1;
        this.D = null;
        this.E = false;
        this.F = true;
        this.G = -1;
        o(context, attributeSet);
    }

    @x0(21)
    public ViewPager2(@o0 Context context, @q0 AttributeSet attributeSet, int i5, int i6) {
        super(context, attributeSet, i5, i6);
        this.f10452o = new Rect();
        this.f10453p = new Rect();
        this.f10454q = new androidx.viewpager2.widget.b(3);
        this.f10456s = false;
        this.f10457t = new a();
        this.f10459v = -1;
        this.D = null;
        this.E = false;
        this.F = true;
        this.G = -1;
        o(context, attributeSet);
    }
}
