package androidx.viewpager2.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
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
import androidx.annotation.g0;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.u0;
import androidx.annotation.x0;
import androidx.core.view.accessibility.h0;
import androidx.core.view.accessibility.o0;
import androidx.core.view.x1;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a0;
import com.google.android.material.badge.BadgeDrawable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import m3.a;

/* loaded from: classes3.dex */
public final class ViewPager2 extends ViewGroup {
    public static final int A = -1;
    static boolean B = true;

    /* renamed from: v, reason: collision with root package name */
    public static final int f35600v = 0;

    /* renamed from: w, reason: collision with root package name */
    public static final int f35601w = 1;

    /* renamed from: x, reason: collision with root package name */
    public static final int f35602x = 0;

    /* renamed from: y, reason: collision with root package name */
    public static final int f35603y = 1;

    /* renamed from: z, reason: collision with root package name */
    public static final int f35604z = 2;

    /* renamed from: b, reason: collision with root package name */
    private final Rect f35605b;

    /* renamed from: c, reason: collision with root package name */
    private final Rect f35606c;

    /* renamed from: d, reason: collision with root package name */
    private androidx.viewpager2.widget.b f35607d;

    /* renamed from: e, reason: collision with root package name */
    int f35608e;

    /* renamed from: f, reason: collision with root package name */
    boolean f35609f;

    /* renamed from: g, reason: collision with root package name */
    private RecyclerView.j f35610g;

    /* renamed from: h, reason: collision with root package name */
    LinearLayoutManager f35611h;

    /* renamed from: i, reason: collision with root package name */
    private int f35612i;

    /* renamed from: j, reason: collision with root package name */
    private Parcelable f35613j;

    /* renamed from: k, reason: collision with root package name */
    RecyclerView f35614k;

    /* renamed from: l, reason: collision with root package name */
    private a0 f35615l;

    /* renamed from: m, reason: collision with root package name */
    androidx.viewpager2.widget.g f35616m;

    /* renamed from: n, reason: collision with root package name */
    private androidx.viewpager2.widget.b f35617n;

    /* renamed from: o, reason: collision with root package name */
    private androidx.viewpager2.widget.d f35618o;

    /* renamed from: p, reason: collision with root package name */
    private androidx.viewpager2.widget.f f35619p;

    /* renamed from: q, reason: collision with root package name */
    private RecyclerView.m f35620q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f35621r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f35622s;

    /* renamed from: t, reason: collision with root package name */
    private int f35623t;

    /* renamed from: u, reason: collision with root package name */
    e f35624u;

    class a extends g {
        a() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g, androidx.recyclerview.widget.RecyclerView.j
        public void a() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.f35609f = true;
            viewPager2.f35616m.l();
        }
    }

    class b extends j {
        b() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.j
        public void onPageScrollStateChanged(int i4) {
            if (i4 == 0) {
                ViewPager2.this.L();
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.j
        public void onPageSelected(int i4) {
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.f35608e != i4) {
                viewPager2.f35608e = i4;
                viewPager2.f35624u.r();
            }
        }
    }

    class c extends j {
        c() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.j
        public void onPageSelected(int i4) {
            ViewPager2.this.clearFocus();
            if (ViewPager2.this.hasFocus()) {
                ViewPager2.this.f35614k.requestFocus(2);
            }
        }
    }

    class d implements RecyclerView.p {
        d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public void a(@o0 View view) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public void b(@o0 View view) {
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

        boolean b(int i4) {
            return false;
        }

        boolean c(int i4, Bundle bundle) {
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

        void j(@o0 h0 h0Var) {
        }

        void k(@o0 View view, @o0 h0 h0Var) {
        }

        boolean l(int i4) {
            throw new IllegalStateException("Not implemented.");
        }

        boolean m(int i4, Bundle bundle) {
            throw new IllegalStateException("Not implemented.");
        }

        void n() {
        }

        CharSequence o() {
            throw new IllegalStateException("Not implemented.");
        }

        void p(@o0 AccessibilityEvent accessibilityEvent) {
        }

        void q() {
        }

        void r() {
        }

        void s() {
        }

        void t() {
        }

        /* synthetic */ e(ViewPager2 viewPager2, a aVar) {
            this();
        }
    }

    class f extends e {
        f() {
            super(ViewPager2.this, null);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean b(int i4) {
            return (i4 == 8192 || i4 == 4096) && !ViewPager2.this.s();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean d() {
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void j(@o0 h0 h0Var) {
            if (ViewPager2.this.s()) {
                return;
            }
            h0Var.V0(h0.a.f27019s);
            h0Var.V0(h0.a.f27018r);
            h0Var.X1(false);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean l(int i4) {
            if (b(i4)) {
                return false;
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public CharSequence o() {
            if (d()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }
    }

    private static abstract class g extends RecyclerView.j {
        private g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public abstract void a();

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void b(int i4, int i5) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void c(int i4, int i5, @q0 Object obj) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void d(int i4, int i5) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void e(int i4, int i5, int i6) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void f(int i4, int i5) {
            a();
        }

        g(a aVar) {
        }
    }

    private class h extends LinearLayoutManager {
        h(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        protected void calculateExtraLayoutSpace(@o0 RecyclerView.a0 a0Var, @o0 int[] iArr) {
            int k4 = ViewPager2.this.k();
            if (k4 == -1) {
                super.calculateExtraLayoutSpace(a0Var, iArr);
                return;
            }
            int m4 = ViewPager2.this.m() * k4;
            iArr[0] = m4;
            iArr[1] = m4;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public void onInitializeAccessibilityNodeInfo(@o0 RecyclerView.v vVar, @o0 RecyclerView.a0 a0Var, @o0 h0 h0Var) {
            super.onInitializeAccessibilityNodeInfo(vVar, a0Var, h0Var);
            ViewPager2.this.f35624u.j(h0Var);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public void onInitializeAccessibilityNodeInfoForItem(@o0 RecyclerView.v vVar, @o0 RecyclerView.a0 a0Var, @o0 View view, @o0 h0 h0Var) {
            ViewPager2.this.f35624u.k(view, h0Var);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public boolean performAccessibilityAction(@o0 RecyclerView.v vVar, @o0 RecyclerView.a0 a0Var, int i4, @q0 Bundle bundle) {
            return ViewPager2.this.f35624u.b(i4) ? ViewPager2.this.f35624u.l(i4) : super.performAccessibilityAction(vVar, a0Var, i4, bundle);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public boolean requestChildRectangleOnScreen(@o0 RecyclerView recyclerView, @o0 View view, @o0 Rect rect, boolean z4, boolean z5) {
            return false;
        }
    }

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    @g0(from = 1)
    @Retention(RetentionPolicy.SOURCE)
    public @interface i {
    }

    public static abstract class j {
        public void onPageScrollStateChanged(int i4) {
        }

        public void onPageScrolled(int i4, float f4, @u0 int i5) {
        }

        public void onPageSelected(int i4) {
        }
    }

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface k {
    }

    class l extends e {

        /* renamed from: b, reason: collision with root package name */
        private final androidx.core.view.accessibility.o0 f35635b;

        /* renamed from: c, reason: collision with root package name */
        private final androidx.core.view.accessibility.o0 f35636c;

        /* renamed from: d, reason: collision with root package name */
        private RecyclerView.j f35637d;

        class a implements androidx.core.view.accessibility.o0 {
            a() {
            }

            @Override // androidx.core.view.accessibility.o0
            public boolean a(@o0 View view, @q0 o0.a aVar) {
                l.this.x(((ViewPager2) view).f35608e + 1);
                return true;
            }
        }

        class b implements androidx.core.view.accessibility.o0 {
            b() {
            }

            @Override // androidx.core.view.accessibility.o0
            public boolean a(@androidx.annotation.o0 View view, @q0 o0.a aVar) {
                l.this.x(((ViewPager2) view).f35608e - 1);
                return true;
            }
        }

        class c extends g {
            c() {
            }

            @Override // androidx.viewpager2.widget.ViewPager2.g, androidx.recyclerview.widget.RecyclerView.j
            public void a() {
                l.this.y();
            }
        }

        l() {
            super(ViewPager2.this, null);
            this.f35635b = new a();
            this.f35636c = new b();
        }

        private void u(h0 h0Var) {
            int i4;
            int i5;
            if (ViewPager2.this.f35614k.getAdapter() != null) {
                i5 = 1;
                if (ViewPager2.this.l() == 1) {
                    i5 = ViewPager2.this.f35614k.getAdapter().getItemCount();
                    i4 = 1;
                } else {
                    i4 = ViewPager2.this.f35614k.getAdapter().getItemCount();
                }
            } else {
                i4 = 0;
                i5 = 0;
            }
            h0Var.l1(h0.f.h(i5, i4, false, 0));
        }

        private void v(View view, h0 h0Var) {
            h0Var.m1(h0.g.j(ViewPager2.this.l() == 1 ? ViewPager2.this.f35611h.getPosition(view) : 0, 1, ViewPager2.this.l() == 0 ? ViewPager2.this.f35611h.getPosition(view) : 0, 1, false, false));
        }

        private void w(h0 h0Var) {
            int itemCount;
            RecyclerView.h adapter = ViewPager2.this.f35614k.getAdapter();
            if (adapter == null || (itemCount = adapter.getItemCount()) == 0 || !ViewPager2.this.s()) {
                return;
            }
            if (ViewPager2.this.f35608e > 0) {
                h0Var.a(8192);
            }
            if (ViewPager2.this.f35608e < itemCount - 1) {
                h0Var.a(4096);
            }
            h0Var.X1(true);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean a() {
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean c(int i4, Bundle bundle) {
            return i4 == 8192 || i4 == 4096;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void e(@q0 RecyclerView.h<?> hVar) {
            y();
            if (hVar != null) {
                hVar.registerAdapterDataObserver(this.f35637d);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void f(@q0 RecyclerView.h<?> hVar) {
            if (hVar != null) {
                hVar.unregisterAdapterDataObserver(this.f35637d);
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
        public void h(@androidx.annotation.o0 androidx.viewpager2.widget.b bVar, @androidx.annotation.o0 RecyclerView recyclerView) {
            x1.Z1(recyclerView, 2);
            this.f35637d = new c();
            if (ViewPager2.this.getImportantForAccessibility() == 0) {
                ViewPager2.this.setImportantForAccessibility(1);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void i(AccessibilityNodeInfo accessibilityNodeInfo) {
            h0 r22 = h0.r2(accessibilityNodeInfo);
            u(r22);
            w(r22);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        void k(@androidx.annotation.o0 View view, @androidx.annotation.o0 h0 h0Var) {
            v(view, h0Var);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean m(int i4, Bundle bundle) {
            if (!c(i4, bundle)) {
                throw new IllegalStateException();
            }
            x(i4 == 8192 ? ViewPager2.this.f35608e - 1 : ViewPager2.this.f35608e + 1);
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void n() {
            y();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void p(@androidx.annotation.o0 AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName(g());
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void q() {
            y();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void r() {
            y();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void s() {
            y();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void t() {
            y();
        }

        void x(int i4) {
            if (ViewPager2.this.s()) {
                ViewPager2.this.C(i4, true);
            }
        }

        void y() {
            int itemCount;
            ViewPager2 viewPager2 = ViewPager2.this;
            int i4 = R.id.accessibilityActionPageLeft;
            x1.x1(viewPager2, R.id.accessibilityActionPageLeft);
            x1.x1(viewPager2, R.id.accessibilityActionPageRight);
            x1.x1(viewPager2, R.id.accessibilityActionPageUp);
            x1.x1(viewPager2, R.id.accessibilityActionPageDown);
            if (ViewPager2.this.f35614k.getAdapter() == null || (itemCount = ViewPager2.this.f35614k.getAdapter().getItemCount()) == 0 || !ViewPager2.this.s()) {
                return;
            }
            if (ViewPager2.this.l() != 0) {
                if (ViewPager2.this.f35608e < itemCount - 1) {
                    x1.A1(viewPager2, new h0.a(R.id.accessibilityActionPageDown, null), null, this.f35635b);
                }
                if (ViewPager2.this.f35608e > 0) {
                    x1.A1(viewPager2, new h0.a(R.id.accessibilityActionPageUp, null), null, this.f35636c);
                    return;
                }
                return;
            }
            boolean r4 = ViewPager2.this.r();
            int i5 = r4 ? 16908360 : 16908361;
            if (r4) {
                i4 = 16908361;
            }
            if (ViewPager2.this.f35608e < itemCount - 1) {
                x1.A1(viewPager2, new h0.a(i5, null), null, this.f35635b);
            }
            if (ViewPager2.this.f35608e > 0) {
                x1.A1(viewPager2, new h0.a(i4, null), null, this.f35636c);
            }
        }
    }

    public interface m {
        void a(@androidx.annotation.o0 View view, float f4);
    }

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

    private class o extends RecyclerView {
        o(@androidx.annotation.o0 Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        @x0(23)
        public CharSequence getAccessibilityClassName() {
            return ViewPager2.this.f35624u.d() ? ViewPager2.this.f35624u.o() : super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(@androidx.annotation.o0 AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(ViewPager2.this.f35608e);
            accessibilityEvent.setToIndex(ViewPager2.this.f35608e);
            ViewPager2.this.f35624u.p(accessibilityEvent);
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

        /* renamed from: b, reason: collision with root package name */
        private final int f35644b;

        /* renamed from: c, reason: collision with root package name */
        private final RecyclerView f35645c;

        q(int i4, RecyclerView recyclerView) {
            this.f35644b = i4;
            this.f35645c = recyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f35645c.smoothScrollToPosition(this.f35644b);
        }
    }

    public ViewPager2(@androidx.annotation.o0 Context context) {
        super(context);
        this.f35605b = new Rect();
        this.f35606c = new Rect();
        this.f35607d = new androidx.viewpager2.widget.b(3);
        this.f35609f = false;
        this.f35610g = new a();
        this.f35612i = -1;
        this.f35620q = null;
        this.f35621r = false;
        this.f35622s = true;
        this.f35623t = -1;
        o(context, null);
    }

    private void F(Context context, AttributeSet attributeSet) {
        int[] iArr = a.C1273a.f81497a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        x1.F1(this, context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        try {
            E(obtainStyledAttributes.getInt(a.C1273a.f81498b, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private void J(@q0 RecyclerView.h<?> hVar) {
        if (hVar != null) {
            hVar.unregisterAdapterDataObserver(this.f35610g);
        }
    }

    private RecyclerView.p e() {
        return new d();
    }

    private void o(Context context, AttributeSet attributeSet) {
        this.f35624u = B ? new l() : new f();
        o oVar = new o(context);
        this.f35614k = oVar;
        oVar.setId(x1.D());
        this.f35614k.setDescendantFocusability(131072);
        h hVar = new h(context);
        this.f35611h = hVar;
        this.f35614k.setLayoutManager(hVar);
        this.f35614k.setScrollingTouchSlop(1);
        F(context, attributeSet);
        this.f35614k.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f35614k.addOnChildAttachStateChangeListener(new d());
        androidx.viewpager2.widget.g gVar = new androidx.viewpager2.widget.g(this);
        this.f35616m = gVar;
        this.f35618o = new androidx.viewpager2.widget.d(this, gVar, this.f35614k);
        n nVar = new n();
        this.f35615l = nVar;
        nVar.b(this.f35614k);
        this.f35614k.addOnScrollListener(this.f35616m);
        androidx.viewpager2.widget.b bVar = new androidx.viewpager2.widget.b(3);
        this.f35617n = bVar;
        this.f35616m.p(bVar);
        b bVar2 = new b();
        c cVar = new c();
        this.f35617n.a(bVar2);
        this.f35617n.a(cVar);
        this.f35624u.h(this.f35617n, this.f35614k);
        this.f35617n.a(this.f35607d);
        androidx.viewpager2.widget.f fVar = new androidx.viewpager2.widget.f(this.f35611h);
        this.f35619p = fVar;
        this.f35617n.a(fVar);
        RecyclerView recyclerView = this.f35614k;
        attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
    }

    private void t(@q0 RecyclerView.h<?> hVar) {
        if (hVar != null) {
            hVar.registerAdapterDataObserver(this.f35610g);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void y() {
        RecyclerView.h adapter;
        if (this.f35612i == -1 || (adapter = this.f35614k.getAdapter()) == 0) {
            return;
        }
        Parcelable parcelable = this.f35613j;
        if (parcelable != null) {
            if (adapter instanceof androidx.viewpager2.adapter.b) {
                ((androidx.viewpager2.adapter.b) adapter).c(parcelable);
            }
            this.f35613j = null;
        }
        int max = Math.max(0, Math.min(this.f35612i, adapter.getItemCount() - 1));
        this.f35608e = max;
        this.f35612i = -1;
        this.f35614k.scrollToPosition(max);
        this.f35624u.n();
    }

    public void A(int i4) {
        B(i4, true);
    }

    public void B(int i4, boolean z4) {
        if (this.f35618o.f()) {
            throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
        }
        C(i4, z4);
    }

    void C(int i4, boolean z4) {
        RecyclerView.h adapter = this.f35614k.getAdapter();
        if (adapter == null) {
            if (this.f35612i != -1) {
                this.f35612i = Math.max(i4, 0);
                return;
            }
            return;
        }
        if (adapter.getItemCount() <= 0) {
            return;
        }
        int min = Math.min(Math.max(i4, 0), adapter.getItemCount() - 1);
        if (min == this.f35608e && this.f35616m.i()) {
            return;
        }
        int i5 = this.f35608e;
        if (min == i5 && z4) {
            return;
        }
        double d5 = i5;
        this.f35608e = min;
        this.f35624u.r();
        if (!this.f35616m.i()) {
            d5 = this.f35616m.e();
        }
        this.f35616m.n(min, z4);
        if (!z4) {
            this.f35614k.scrollToPosition(min);
            return;
        }
        double d6 = min;
        if (Math.abs(d6 - d5) <= 3.0d) {
            this.f35614k.smoothScrollToPosition(min);
            return;
        }
        this.f35614k.scrollToPosition(d6 > d5 ? min - 3 : min + 3);
        RecyclerView recyclerView = this.f35614k;
        recyclerView.post(new q(min, recyclerView));
    }

    public void D(int i4) {
        if (i4 < 1 && i4 != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.f35623t = i4;
        this.f35614k.requestLayout();
    }

    public void E(int i4) {
        this.f35611h.setOrientation(i4);
        this.f35624u.s();
    }

    public void G(@q0 m mVar) {
        if (mVar != null) {
            if (!this.f35621r) {
                this.f35620q = this.f35614k.getItemAnimator();
                this.f35621r = true;
            }
            this.f35614k.setItemAnimator(null);
        } else if (this.f35621r) {
            this.f35614k.setItemAnimator(this.f35620q);
            this.f35620q = null;
            this.f35621r = false;
        }
        if (mVar == this.f35619p.a()) {
            return;
        }
        this.f35619p.b(mVar);
        x();
    }

    public void H(boolean z4) {
        this.f35622s = z4;
        this.f35624u.t();
    }

    void I() {
        View h4 = this.f35615l.h(this.f35611h);
        if (h4 == null) {
            return;
        }
        int[] c5 = this.f35615l.c(this.f35611h, h4);
        int i4 = c5[0];
        if (i4 == 0 && c5[1] == 0) {
            return;
        }
        this.f35614k.smoothScrollBy(i4, c5[1]);
    }

    public void K(@androidx.annotation.o0 j jVar) {
        this.f35607d.b(jVar);
    }

    void L() {
        a0 a0Var = this.f35615l;
        if (a0Var == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View h4 = a0Var.h(this.f35611h);
        if (h4 == null) {
            return;
        }
        int position = this.f35611h.getPosition(h4);
        if (position != this.f35608e && this.f35616m.f() == 0) {
            this.f35617n.onPageSelected(position);
        }
        this.f35609f = false;
    }

    public void a(@androidx.annotation.o0 RecyclerView.o oVar) {
        this.f35614k.addItemDecoration(oVar);
    }

    public void b(@androidx.annotation.o0 RecyclerView.o oVar, int i4) {
        this.f35614k.addItemDecoration(oVar, i4);
    }

    public boolean c() {
        return this.f35618o.b();
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i4) {
        return this.f35614k.canScrollHorizontally(i4);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i4) {
        return this.f35614k.canScrollVertically(i4);
    }

    public boolean d() {
        return this.f35618o.d();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i4 = ((SavedState) parcelable).f35625b;
            sparseArray.put(this.f35614k.getId(), sparseArray.get(i4));
            sparseArray.remove(i4);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        y();
    }

    public boolean f(@u0 @SuppressLint({"SupportAnnotationUsage"}) float f4) {
        return this.f35618o.e(f4);
    }

    @q0
    public RecyclerView.h g() {
        return this.f35614k.getAdapter();
    }

    @Override // android.view.ViewGroup, android.view.View
    @x0(23)
    public CharSequence getAccessibilityClassName() {
        return this.f35624u.a() ? this.f35624u.g() : super.getAccessibilityClassName();
    }

    public int h() {
        return this.f35608e;
    }

    @androidx.annotation.o0
    public RecyclerView.o i(int i4) {
        return this.f35614k.getItemDecorationAt(i4);
    }

    public int j() {
        return this.f35614k.getItemDecorationCount();
    }

    public int k() {
        return this.f35623t;
    }

    public int l() {
        return this.f35611h.getOrientation() == 1 ? 1 : 0;
    }

    int m() {
        int height;
        int paddingBottom;
        RecyclerView recyclerView = this.f35614k;
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
        return this.f35616m.f();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f35624u.i(accessibilityNodeInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        int measuredWidth = this.f35614k.getMeasuredWidth();
        int measuredHeight = this.f35614k.getMeasuredHeight();
        this.f35605b.left = getPaddingLeft();
        this.f35605b.right = (i6 - i4) - getPaddingRight();
        this.f35605b.top = getPaddingTop();
        this.f35605b.bottom = (i7 - i5) - getPaddingBottom();
        Gravity.apply(BadgeDrawable.f52614s, measuredWidth, measuredHeight, this.f35605b, this.f35606c);
        RecyclerView recyclerView = this.f35614k;
        Rect rect = this.f35606c;
        recyclerView.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.f35609f) {
            L();
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        measureChild(this.f35614k, i4, i5);
        int measuredWidth = this.f35614k.getMeasuredWidth();
        int measuredHeight = this.f35614k.getMeasuredHeight();
        int measuredState = this.f35614k.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + measuredHeight;
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i4, measuredState), View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i5, measuredState << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f35612i = savedState.f35626c;
        this.f35613j = savedState.f35627d;
    }

    @Override // android.view.View
    @q0
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f35625b = this.f35614k.getId();
        int i4 = this.f35612i;
        if (i4 == -1) {
            i4 = this.f35608e;
        }
        savedState.f35626c = i4;
        Parcelable parcelable = this.f35613j;
        if (parcelable != null) {
            savedState.f35627d = parcelable;
        } else {
            Object adapter = this.f35614k.getAdapter();
            if (adapter instanceof androidx.viewpager2.adapter.b) {
                savedState.f35627d = ((androidx.viewpager2.adapter.b) adapter).a();
            }
        }
        return savedState;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    public void p() {
        this.f35614k.invalidateItemDecorations();
    }

    @Override // android.view.View
    @x0(16)
    public boolean performAccessibilityAction(int i4, @q0 Bundle bundle) {
        return this.f35624u.c(i4, bundle) ? this.f35624u.m(i4, bundle) : super.performAccessibilityAction(i4, bundle);
    }

    public boolean q() {
        return this.f35618o.f();
    }

    boolean r() {
        return this.f35611h.getLayoutDirection() == 1;
    }

    public boolean s() {
        return this.f35622s;
    }

    @Override // android.view.View
    @x0(17)
    public void setLayoutDirection(int i4) {
        super.setLayoutDirection(i4);
        this.f35624u.q();
    }

    public void u(@androidx.annotation.o0 j jVar) {
        this.f35607d.a(jVar);
    }

    public void v(@androidx.annotation.o0 RecyclerView.o oVar) {
        this.f35614k.removeItemDecoration(oVar);
    }

    public void w(int i4) {
        this.f35614k.removeItemDecorationAt(i4);
    }

    public void x() {
        if (this.f35619p.a() == null) {
            return;
        }
        double e4 = this.f35616m.e();
        int i4 = (int) e4;
        float f4 = (float) (e4 - i4);
        this.f35619p.onPageScrolled(i4, f4, Math.round(m() * f4));
    }

    public void z(@q0 RecyclerView.h hVar) {
        RecyclerView.h adapter = this.f35614k.getAdapter();
        this.f35624u.f(adapter);
        J(adapter);
        this.f35614k.setAdapter(hVar);
        this.f35608e = 0;
        y();
        this.f35624u.e(hVar);
        t(hVar);
    }

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        int f35625b;

        /* renamed from: c, reason: collision with root package name */
        int f35626c;

        /* renamed from: d, reason: collision with root package name */
        Parcelable f35627d;

        class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return createFromParcel(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i4) {
                return new SavedState[i4];
            }
        }

        @SuppressLint({"ClassVerificationFailure"})
        @x0(24)
        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            a(parcel, classLoader);
        }

        private void a(Parcel parcel, ClassLoader classLoader) {
            this.f35625b = parcel.readInt();
            this.f35626c = parcel.readInt();
            this.f35627d = parcel.readParcelable(classLoader);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeInt(this.f35625b);
            parcel.writeInt(this.f35626c);
            parcel.writeParcelable(this.f35627d, i4);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            a(parcel, null);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public ViewPager2(@androidx.annotation.o0 Context context, @q0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35605b = new Rect();
        this.f35606c = new Rect();
        this.f35607d = new androidx.viewpager2.widget.b(3);
        this.f35609f = false;
        this.f35610g = new a();
        this.f35612i = -1;
        this.f35620q = null;
        this.f35621r = false;
        this.f35622s = true;
        this.f35623t = -1;
        o(context, attributeSet);
    }

    public ViewPager2(@androidx.annotation.o0 Context context, @q0 AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f35605b = new Rect();
        this.f35606c = new Rect();
        this.f35607d = new androidx.viewpager2.widget.b(3);
        this.f35609f = false;
        this.f35610g = new a();
        this.f35612i = -1;
        this.f35620q = null;
        this.f35621r = false;
        this.f35622s = true;
        this.f35623t = -1;
        o(context, attributeSet);
    }

    @SuppressLint({"ClassVerificationFailure"})
    @x0(21)
    public ViewPager2(@androidx.annotation.o0 Context context, @q0 AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        this.f35605b = new Rect();
        this.f35606c = new Rect();
        this.f35607d = new androidx.viewpager2.widget.b(3);
        this.f35609f = false;
        this.f35610g = new a();
        this.f35612i = -1;
        this.f35620q = null;
        this.f35621r = false;
        this.f35622s = true;
        this.f35623t = -1;
        o(context, attributeSet);
    }
}
