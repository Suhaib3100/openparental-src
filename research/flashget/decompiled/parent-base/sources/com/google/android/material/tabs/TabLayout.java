package com.google.android.material.tabs;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.c1;
import androidx.annotation.g1;
import androidx.annotation.j0;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.r;
import androidx.annotation.x0;
import androidx.appcompat.widget.y0;
import androidx.core.util.v;
import androidx.core.view.accessibility.h0;
import androidx.core.view.f0;
import androidx.core.view.h1;
import androidx.core.view.x1;
import androidx.viewpager.widget.ViewPager;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.material.badge.BadgeDrawable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import s8.a;

@ViewPager.e
/* loaded from: classes6.dex */
public class TabLayout extends HorizontalScrollView {

    @r(unit = 0)
    private static final int L2 = 48;

    @r(unit = 0)
    private static final int M2 = 56;

    @r(unit = 0)
    static final int N2 = 16;
    private static final int O2 = -1;
    private static final int P2 = 300;

    @r(unit = 0)
    private static final int Q1 = 72;
    public static final int S2 = 0;
    public static final int T2 = 1;
    public static final int U2 = 2;

    @r(unit = 0)
    static final int V1 = 8;
    public static final int V2 = 0;
    public static final int W2 = 1;
    public static final int X2 = 0;
    public static final int Y2 = 1;
    public static final int Z2 = 2;

    /* renamed from: a3, reason: collision with root package name */
    public static final int f54144a3 = 0;

    /* renamed from: b3, reason: collision with root package name */
    public static final int f54145b3 = 1;

    /* renamed from: c3, reason: collision with root package name */
    public static final int f54146c3 = 2;

    /* renamed from: d3, reason: collision with root package name */
    public static final int f54147d3 = 3;

    /* renamed from: e3, reason: collision with root package name */
    public static final int f54148e3 = 0;

    /* renamed from: f3, reason: collision with root package name */
    public static final int f54149f3 = 1;
    int A;
    boolean B;
    boolean C;
    int D;
    boolean E;
    private com.google.android.material.tabs.b F;

    @q0
    private c G;
    private final ArrayList<c> H;

    @q0
    private c I;
    private ValueAnimator J;

    @q0
    ViewPager K;

    @q0
    private androidx.viewpager.widget.a L;
    private DataSetObserver M;
    private m N;
    private b O;
    private boolean P;
    private final v.a<n> Q;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<i> f54150b;

    /* renamed from: c, reason: collision with root package name */
    @q0
    private i f54151c;

    /* renamed from: d, reason: collision with root package name */
    @o0
    final h f54152d;

    /* renamed from: e, reason: collision with root package name */
    int f54153e;

    /* renamed from: f, reason: collision with root package name */
    int f54154f;

    /* renamed from: g, reason: collision with root package name */
    int f54155g;

    /* renamed from: h, reason: collision with root package name */
    int f54156h;

    /* renamed from: i, reason: collision with root package name */
    int f54157i;

    /* renamed from: j, reason: collision with root package name */
    ColorStateList f54158j;

    /* renamed from: k, reason: collision with root package name */
    ColorStateList f54159k;

    /* renamed from: l, reason: collision with root package name */
    ColorStateList f54160l;

    /* renamed from: m, reason: collision with root package name */
    @o0
    Drawable f54161m;

    /* renamed from: n, reason: collision with root package name */
    private int f54162n;

    /* renamed from: o, reason: collision with root package name */
    PorterDuff.Mode f54163o;

    /* renamed from: p, reason: collision with root package name */
    float f54164p;

    /* renamed from: q, reason: collision with root package name */
    float f54165q;

    /* renamed from: r, reason: collision with root package name */
    final int f54166r;

    /* renamed from: s, reason: collision with root package name */
    int f54167s;

    /* renamed from: t, reason: collision with root package name */
    private final int f54168t;

    /* renamed from: u, reason: collision with root package name */
    private final int f54169u;

    /* renamed from: v, reason: collision with root package name */
    private final int f54170v;

    /* renamed from: w, reason: collision with root package name */
    private int f54171w;

    /* renamed from: x, reason: collision with root package name */
    int f54172x;

    /* renamed from: y, reason: collision with root package name */
    int f54173y;

    /* renamed from: z, reason: collision with root package name */
    int f54174z;
    private static final String R2 = ProtectedSandApp.s("\uf236");
    private static final int R = a.n.Aa;
    private static final v.a<i> Q2 = new v.c(16);

    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@o0 ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    private class b implements ViewPager.h {

        /* renamed from: a, reason: collision with root package name */
        private boolean f54176a;

        b() {
        }

        void a(boolean z4) {
            this.f54176a = z4;
        }

        @Override // androidx.viewpager.widget.ViewPager.h
        public void b(@o0 ViewPager viewPager, @q0 androidx.viewpager.widget.a aVar, @q0 androidx.viewpager.widget.a aVar2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.K == viewPager) {
                tabLayout.g0(aVar2, this.f54176a);
            }
        }
    }

    @Deprecated
    public interface c<T extends i> {
        void a(T t4);

        void b(T t4);

        void c(T t4);
    }

    public @interface d {
    }

    @c1({c1.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }

    public interface f extends c<i> {
    }

    private class g extends DataSetObserver {
        g() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            TabLayout.this.S();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            TabLayout.this.S();
        }
    }

    class h extends LinearLayout {

        /* renamed from: b, reason: collision with root package name */
        ValueAnimator f54179b;

        /* renamed from: c, reason: collision with root package name */
        int f54180c;

        /* renamed from: d, reason: collision with root package name */
        float f54181d;

        /* renamed from: e, reason: collision with root package name */
        private int f54182e;

        class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f54184b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ View f54185c;

            a(View view, View view2) {
                this.f54184b = view;
                this.f54185c = view2;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(@o0 ValueAnimator valueAnimator) {
                h.this.h(this.f54184b, this.f54185c, valueAnimator.getAnimatedFraction());
            }
        }

        class b extends AnimatorListenerAdapter {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f54187b;

            b(int i4) {
                this.f54187b = i4;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                h.this.f54180c = this.f54187b;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                h.this.f54180c = this.f54187b;
            }
        }

        h(Context context) {
            super(context);
            this.f54180c = -1;
            this.f54182e = -1;
            setWillNotDraw(false);
        }

        private void e() {
            View childAt = getChildAt(this.f54180c);
            com.google.android.material.tabs.b bVar = TabLayout.this.F;
            TabLayout tabLayout = TabLayout.this;
            bVar.d(tabLayout, childAt, tabLayout.f54161m);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h(View view, View view2, float f4) {
            if (view == null || view.getWidth() <= 0) {
                Drawable drawable = TabLayout.this.f54161m;
                drawable.setBounds(-1, drawable.getBounds().top, -1, TabLayout.this.f54161m.getBounds().bottom);
            } else {
                com.google.android.material.tabs.b bVar = TabLayout.this.F;
                TabLayout tabLayout = TabLayout.this;
                bVar.c(tabLayout, view, view2, f4, tabLayout.f54161m);
            }
            x1.t1(this);
        }

        private void i(boolean z4, int i4, int i5) {
            View childAt = getChildAt(this.f54180c);
            View childAt2 = getChildAt(i4);
            if (childAt2 == null) {
                e();
                return;
            }
            a aVar = new a(childAt, childAt2);
            if (!z4) {
                this.f54179b.removeAllUpdateListeners();
                this.f54179b.addUpdateListener(aVar);
                return;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f54179b = valueAnimator;
            valueAnimator.setInterpolator(com.google.android.material.animation.a.f52467b);
            valueAnimator.setDuration(i5);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(aVar);
            valueAnimator.addListener(new b(i4));
            valueAnimator.start();
        }

        void b(int i4, int i5) {
            ValueAnimator valueAnimator = this.f54179b;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f54179b.cancel();
            }
            i(true, i4, i5);
        }

        boolean c() {
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                if (getChildAt(i4).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        float d() {
            return this.f54180c + this.f54181d;
        }

        @Override // android.view.View
        public void draw(@o0 Canvas canvas) {
            int height;
            int height2 = TabLayout.this.f54161m.getBounds().height();
            if (height2 < 0) {
                height2 = TabLayout.this.f54161m.getIntrinsicHeight();
            }
            int i4 = TabLayout.this.f54174z;
            if (i4 == 0) {
                height = getHeight() - height2;
                height2 = getHeight();
            } else if (i4 != 1) {
                height = 0;
                if (i4 != 2) {
                    height2 = i4 != 3 ? 0 : getHeight();
                }
            } else {
                height = (getHeight() - height2) / 2;
                height2 = (getHeight() + height2) / 2;
            }
            if (TabLayout.this.f54161m.getBounds().width() > 0) {
                Rect bounds = TabLayout.this.f54161m.getBounds();
                TabLayout.this.f54161m.setBounds(bounds.left, height, bounds.right, height2);
                TabLayout tabLayout = TabLayout.this;
                Drawable drawable = tabLayout.f54161m;
                if (tabLayout.f54162n != 0) {
                    drawable.setTint(TabLayout.this.f54162n);
                }
                drawable.draw(canvas);
            }
            super.draw(canvas);
        }

        void f(int i4, float f4) {
            ValueAnimator valueAnimator = this.f54179b;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f54179b.cancel();
            }
            this.f54180c = i4;
            this.f54181d = f4;
            h(getChildAt(i4), getChildAt(this.f54180c + 1), this.f54181d);
        }

        void g(int i4) {
            Rect bounds = TabLayout.this.f54161m.getBounds();
            TabLayout.this.f54161m.setBounds(bounds.left, 0, bounds.right, i4);
            requestLayout();
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
            super.onLayout(z4, i4, i5, i6, i7);
            ValueAnimator valueAnimator = this.f54179b;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                e();
            } else {
                i(false, this.f54180c, -1);
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        protected void onMeasure(int i4, int i5) {
            super.onMeasure(i4, i5);
            if (View.MeasureSpec.getMode(i4) != 1073741824) {
                return;
            }
            TabLayout tabLayout = TabLayout.this;
            boolean z4 = true;
            if (tabLayout.f54172x == 1 || tabLayout.A == 2) {
                int childCount = getChildCount();
                int i6 = 0;
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = getChildAt(i7);
                    if (childAt.getVisibility() == 0) {
                        i6 = Math.max(i6, childAt.getMeasuredWidth());
                    }
                }
                if (i6 <= 0) {
                    return;
                }
                if (i6 * childCount <= getMeasuredWidth() - (((int) com.google.android.material.internal.v.e(getContext(), 16)) * 2)) {
                    boolean z5 = false;
                    for (int i10 = 0; i10 < childCount; i10++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i10).getLayoutParams();
                        if (layoutParams.width != i6 || layoutParams.weight != 0.0f) {
                            layoutParams.width = i6;
                            layoutParams.weight = 0.0f;
                            z5 = true;
                        }
                    }
                    z4 = z5;
                } else {
                    TabLayout tabLayout2 = TabLayout.this;
                    tabLayout2.f54172x = 0;
                    tabLayout2.I0(false);
                }
                if (z4) {
                    super.onMeasure(i4, i5);
                }
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onRtlPropertiesChanged(int i4) {
            super.onRtlPropertiesChanged(i4);
        }
    }

    public static class i {

        /* renamed from: k, reason: collision with root package name */
        public static final int f54189k = -1;

        /* renamed from: a, reason: collision with root package name */
        @q0
        private Object f54190a;

        /* renamed from: b, reason: collision with root package name */
        @q0
        private Drawable f54191b;

        /* renamed from: c, reason: collision with root package name */
        @q0
        private CharSequence f54192c;

        /* renamed from: d, reason: collision with root package name */
        @q0
        private CharSequence f54193d;

        /* renamed from: f, reason: collision with root package name */
        @q0
        private View f54195f;

        /* renamed from: h, reason: collision with root package name */
        @q0
        public TabLayout f54197h;

        /* renamed from: i, reason: collision with root package name */
        @o0
        public n f54198i;

        /* renamed from: e, reason: collision with root package name */
        private int f54194e = -1;

        /* renamed from: g, reason: collision with root package name */
        @d
        private int f54196g = 1;

        /* renamed from: j, reason: collision with root package name */
        private int f54199j = -1;

        @o0
        public i A(@d int i4) {
            this.f54196g = i4;
            TabLayout tabLayout = this.f54197h;
            if (tabLayout.f54172x == 1 || tabLayout.A == 2) {
                tabLayout.I0(true);
            }
            E();
            if (com.google.android.material.badge.a.f52655a && this.f54198i.t() && this.f54198i.f54207f.isVisible()) {
                this.f54198i.invalidate();
            }
            return this;
        }

        @o0
        public i B(@q0 Object obj) {
            this.f54190a = obj;
            return this;
        }

        @o0
        public i C(@g1 int i4) {
            TabLayout tabLayout = this.f54197h;
            if (tabLayout != null) {
                return D(tabLayout.getResources().getText(i4));
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("\uf233"));
        }

        @o0
        public i D(@q0 CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f54193d) && !TextUtils.isEmpty(charSequence)) {
                this.f54198i.setContentDescription(charSequence);
            }
            this.f54192c = charSequence;
            E();
            return this;
        }

        void E() {
            n nVar = this.f54198i;
            if (nVar != null) {
                nVar.D();
            }
        }

        @q0
        public BadgeDrawable e() {
            return n.h(this.f54198i);
        }

        @q0
        public CharSequence f() {
            n nVar = this.f54198i;
            if (nVar == null) {
                return null;
            }
            return nVar.getContentDescription();
        }

        @q0
        public View g() {
            return this.f54195f;
        }

        @q0
        public Drawable h() {
            return this.f54191b;
        }

        public int i() {
            return this.f54199j;
        }

        @o0
        public BadgeDrawable j() {
            return this.f54198i.r();
        }

        public int k() {
            return this.f54194e;
        }

        @d
        public int l() {
            return this.f54196g;
        }

        @q0
        public Object m() {
            return this.f54190a;
        }

        @q0
        public CharSequence n() {
            return this.f54192c;
        }

        public boolean o() {
            TabLayout tabLayout = this.f54197h;
            if (tabLayout != null) {
                return tabLayout.A() == this.f54194e;
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("\uf233"));
        }

        public void p() {
            this.f54198i.w();
        }

        void q() {
            this.f54197h = null;
            this.f54198i = null;
            this.f54190a = null;
            this.f54191b = null;
            this.f54199j = -1;
            this.f54192c = null;
            this.f54193d = null;
            this.f54194e = -1;
            this.f54195f = null;
        }

        public void r() {
            TabLayout tabLayout = this.f54197h;
            if (tabLayout == null) {
                throw new IllegalArgumentException(ProtectedSandApp.s("\uf233"));
            }
            tabLayout.a0(this);
        }

        @o0
        public i s(@g1 int i4) {
            TabLayout tabLayout = this.f54197h;
            if (tabLayout != null) {
                return t(tabLayout.getResources().getText(i4));
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("\uf233"));
        }

        @o0
        public i t(@q0 CharSequence charSequence) {
            this.f54193d = charSequence;
            E();
            return this;
        }

        @o0
        public i u(@j0 int i4) {
            return v(LayoutInflater.from(this.f54198i.getContext()).inflate(i4, (ViewGroup) this.f54198i, false));
        }

        @o0
        public i v(@q0 View view) {
            this.f54195f = view;
            E();
            return this;
        }

        @o0
        public i w(@androidx.annotation.v int i4) {
            TabLayout tabLayout = this.f54197h;
            if (tabLayout != null) {
                return x(e.a.b(tabLayout.getContext(), i4));
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("\uf233"));
        }

        @o0
        public i x(@q0 Drawable drawable) {
            this.f54191b = drawable;
            TabLayout tabLayout = this.f54197h;
            if (tabLayout.f54172x == 1 || tabLayout.A == 2) {
                tabLayout.I0(true);
            }
            E();
            if (com.google.android.material.badge.a.f52655a && this.f54198i.t() && this.f54198i.f54207f.isVisible()) {
                this.f54198i.invalidate();
            }
            return this;
        }

        @o0
        public i y(int i4) {
            this.f54199j = i4;
            n nVar = this.f54198i;
            if (nVar != null) {
                nVar.setId(i4);
            }
            return this;
        }

        void z(int i4) {
            this.f54194e = i4;
        }
    }

    @c1({c1.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface j {
    }

    @c1({c1.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface k {
    }

    @c1({c1.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface l {
    }

    public static class m implements ViewPager.i {

        /* renamed from: a, reason: collision with root package name */
        @o0
        private final WeakReference<TabLayout> f54200a;

        /* renamed from: b, reason: collision with root package name */
        private int f54201b;

        /* renamed from: c, reason: collision with root package name */
        private int f54202c;

        public m(TabLayout tabLayout) {
            this.f54200a = new WeakReference<>(tabLayout);
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void a(int i4, float f4, int i5) {
            TabLayout tabLayout = this.f54200a.get();
            if (tabLayout != null) {
                int i6 = this.f54202c;
                tabLayout.j0(i4, f4, i6 != 2 || this.f54201b == 1, (i6 == 2 && this.f54201b == 0) ? false : true);
            }
        }

        void b() {
            this.f54202c = 0;
            this.f54201b = 0;
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void c(int i4) {
            this.f54201b = this.f54202c;
            this.f54202c = i4;
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void d(int i4) {
            TabLayout tabLayout = this.f54200a.get();
            if (tabLayout == null || tabLayout.A() == i4 || i4 >= tabLayout.C()) {
                return;
            }
            int i5 = this.f54202c;
            tabLayout.b0(tabLayout.B(i4), i5 == 0 || (i5 == 2 && this.f54201b == 0));
        }
    }

    public final class n extends LinearLayout {

        /* renamed from: b, reason: collision with root package name */
        private i f54203b;

        /* renamed from: c, reason: collision with root package name */
        private TextView f54204c;

        /* renamed from: d, reason: collision with root package name */
        private ImageView f54205d;

        /* renamed from: e, reason: collision with root package name */
        @q0
        private View f54206e;

        /* renamed from: f, reason: collision with root package name */
        @q0
        private BadgeDrawable f54207f;

        /* renamed from: g, reason: collision with root package name */
        @q0
        private View f54208g;

        /* renamed from: h, reason: collision with root package name */
        @q0
        private TextView f54209h;

        /* renamed from: i, reason: collision with root package name */
        @q0
        private ImageView f54210i;

        /* renamed from: j, reason: collision with root package name */
        @q0
        private Drawable f54211j;

        /* renamed from: k, reason: collision with root package name */
        private int f54212k;

        class a implements View.OnLayoutChangeListener {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f54214b;

            a(View view) {
                this.f54214b = view;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i4, int i5, int i6, int i7, int i10, int i11, int i12, int i13) {
                if (this.f54214b.getVisibility() == 0) {
                    n.this.C(this.f54214b);
                }
            }
        }

        public n(@o0 Context context) {
            super(context);
            this.f54212k = 2;
            E(context);
            x1.n2(this, TabLayout.this.f54153e, TabLayout.this.f54154f, TabLayout.this.f54155g, TabLayout.this.f54156h);
            setGravity(17);
            setOrientation(!TabLayout.this.B ? 1 : 0);
            setClickable(true);
            x1.q2(this, h1.c(getContext(), 1002));
        }

        private void A() {
            if (t()) {
                k(true);
                View view = this.f54206e;
                if (view != null) {
                    com.google.android.material.badge.a.g(this.f54207f, view);
                    this.f54206e = null;
                }
            }
        }

        private void B() {
            i iVar;
            i iVar2;
            if (t()) {
                if (this.f54208g != null) {
                    A();
                    return;
                }
                if (this.f54205d != null && (iVar2 = this.f54203b) != null && iVar2.h() != null) {
                    View view = this.f54206e;
                    ImageView imageView = this.f54205d;
                    if (view == imageView) {
                        C(imageView);
                        return;
                    } else {
                        A();
                        z(this.f54205d);
                        return;
                    }
                }
                if (this.f54204c == null || (iVar = this.f54203b) == null || iVar.l() != 1) {
                    A();
                    return;
                }
                View view2 = this.f54206e;
                TextView textView = this.f54204c;
                if (view2 == textView) {
                    C(textView);
                } else {
                    A();
                    z(this.f54204c);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void C(@o0 View view) {
            if (t() && view == this.f54206e) {
                com.google.android.material.badge.a.j(this.f54207f, view, q(view));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0, types: [android.graphics.drawable.RippleDrawable] */
        public void E(Context context) {
            int i4 = TabLayout.this.f54166r;
            if (i4 != 0) {
                Drawable b5 = e.a.b(context, i4);
                this.f54211j = b5;
                if (b5 != null && b5.isStateful()) {
                    this.f54211j.setState(getDrawableState());
                }
            } else {
                this.f54211j = null;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(0);
            if (TabLayout.this.f54160l != null) {
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setCornerRadius(1.0E-5f);
                gradientDrawable2.setColor(-1);
                ColorStateList a5 = com.google.android.material.ripple.b.a(TabLayout.this.f54160l);
                boolean z4 = TabLayout.this.E;
                if (z4) {
                    gradientDrawable = null;
                }
                gradientDrawable = new RippleDrawable(a5, gradientDrawable, z4 ? null : gradientDrawable2);
            }
            x1.P1(this, gradientDrawable);
            TabLayout.this.invalidate();
        }

        private void G(@q0 TextView textView, @q0 ImageView imageView) {
            i iVar = this.f54203b;
            Drawable mutate = (iVar == null || iVar.h() == null) ? null : this.f54203b.h().mutate();
            i iVar2 = this.f54203b;
            CharSequence n4 = iVar2 != null ? iVar2.n() : null;
            if (imageView != null) {
                if (mutate != null) {
                    imageView.setImageDrawable(mutate);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean isEmpty = TextUtils.isEmpty(n4);
            if (textView != null) {
                if (isEmpty) {
                    textView.setVisibility(8);
                    textView.setText((CharSequence) null);
                } else {
                    textView.setText(n4);
                    if (this.f54203b.f54196g == 1) {
                        textView.setVisibility(0);
                    } else {
                        textView.setVisibility(8);
                    }
                    setVisibility(0);
                }
            }
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int e4 = (isEmpty || imageView.getVisibility() != 0) ? 0 : (int) com.google.android.material.internal.v.e(getContext(), 8);
                if (TabLayout.this.B) {
                    if (e4 != marginLayoutParams.getMarginEnd()) {
                        marginLayoutParams.setMarginEnd(e4);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (e4 != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = e4;
                    marginLayoutParams.setMarginEnd(0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            i iVar3 = this.f54203b;
            CharSequence charSequence = iVar3 != null ? iVar3.f54193d : null;
            if (isEmpty) {
                n4 = charSequence;
            }
            y0.a(this, n4);
        }

        static BadgeDrawable h(n nVar) {
            return nVar.f54207f;
        }

        private void i(@q0 View view) {
            if (view == null) {
                return;
            }
            view.addOnLayoutChangeListener(new a(view));
        }

        private float j(@o0 Layout layout, int i4, float f4) {
            return (f4 / layout.getPaint().getTextSize()) * layout.getLineWidth(i4);
        }

        private void k(boolean z4) {
            setClipChildren(z4);
            setClipToPadding(z4);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(z4);
                viewGroup.setClipToPadding(z4);
            }
        }

        @o0
        private FrameLayout l() {
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            return frameLayout;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void m(@o0 Canvas canvas) {
            Drawable drawable = this.f54211j;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.f54211j.draw(canvas);
            }
        }

        @q0
        private BadgeDrawable n() {
            return this.f54207f;
        }

        @q0
        private FrameLayout q(@o0 View view) {
            if ((view == this.f54205d || view == this.f54204c) && com.google.android.material.badge.a.f52655a) {
                return (FrameLayout) view.getParent();
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @o0
        public BadgeDrawable r() {
            if (this.f54207f == null) {
                this.f54207f = BadgeDrawable.d(getContext());
            }
            B();
            BadgeDrawable badgeDrawable = this.f54207f;
            if (badgeDrawable != null) {
                return badgeDrawable;
            }
            throw new IllegalStateException(ProtectedSandApp.s("\uf234"));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean t() {
            return this.f54207f != null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void u() {
            FrameLayout frameLayout;
            if (com.google.android.material.badge.a.f52655a) {
                frameLayout = l();
                addView(frameLayout, 0);
            } else {
                frameLayout = this;
            }
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(a.k.H, (ViewGroup) frameLayout, false);
            this.f54205d = imageView;
            frameLayout.addView(imageView, 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void v() {
            FrameLayout frameLayout;
            if (com.google.android.material.badge.a.f52655a) {
                frameLayout = l();
                addView(frameLayout);
            } else {
                frameLayout = this;
            }
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(a.k.I, (ViewGroup) frameLayout, false);
            this.f54204c = textView;
            frameLayout.addView(textView);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void w() {
            if (this.f54206e != null) {
                A();
            }
            this.f54207f = null;
        }

        private void z(@q0 View view) {
            if (t() && view != null) {
                k(false);
                com.google.android.material.badge.a.b(this.f54207f, view, q(view));
                this.f54206e = view;
            }
        }

        final void D() {
            i iVar = this.f54203b;
            Drawable drawable = null;
            View g4 = iVar != null ? iVar.g() : null;
            if (g4 != null) {
                ViewParent parent = g4.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(g4);
                    }
                    addView(g4);
                }
                this.f54208g = g4;
                TextView textView = this.f54204c;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f54205d;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f54205d.setImageDrawable(null);
                }
                TextView textView2 = (TextView) g4.findViewById(R.id.text1);
                this.f54209h = textView2;
                if (textView2 != null) {
                    this.f54212k = textView2.getMaxLines();
                }
                this.f54210i = (ImageView) g4.findViewById(R.id.icon);
            } else {
                View view = this.f54208g;
                if (view != null) {
                    removeView(view);
                    this.f54208g = null;
                }
                this.f54209h = null;
                this.f54210i = null;
            }
            if (this.f54208g == null) {
                if (this.f54205d == null) {
                    u();
                }
                if (iVar != null && iVar.h() != null) {
                    drawable = iVar.h().mutate();
                }
                if (drawable != null) {
                    drawable.setTintList(TabLayout.this.f54159k);
                    PorterDuff.Mode mode = TabLayout.this.f54163o;
                    if (mode != null) {
                        drawable.setTintMode(mode);
                    }
                }
                if (this.f54204c == null) {
                    v();
                    this.f54212k = this.f54204c.getMaxLines();
                }
                this.f54204c.setTextAppearance(TabLayout.this.f54157i);
                ColorStateList colorStateList = TabLayout.this.f54158j;
                if (colorStateList != null) {
                    this.f54204c.setTextColor(colorStateList);
                }
                G(this.f54204c, this.f54205d);
                B();
                i(this.f54205d);
                i(this.f54204c);
            } else {
                TextView textView3 = this.f54209h;
                if (textView3 != null || this.f54210i != null) {
                    G(textView3, this.f54210i);
                }
            }
            if (iVar != null && !TextUtils.isEmpty(iVar.f54193d)) {
                setContentDescription(iVar.f54193d);
            }
            setSelected(iVar != null && iVar.o());
        }

        final void F() {
            setOrientation(!TabLayout.this.B ? 1 : 0);
            TextView textView = this.f54209h;
            if (textView == null && this.f54210i == null) {
                G(this.f54204c, this.f54205d);
            } else {
                G(textView, this.f54210i);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f54211j;
            if ((drawable == null || !drawable.isStateful()) ? false : this.f54211j.setState(drawableState)) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        int o() {
            View[] viewArr = {this.f54204c, this.f54205d, this.f54208g};
            int i4 = 0;
            int i5 = 0;
            boolean z4 = false;
            for (int i6 = 0; i6 < 3; i6++) {
                View view = viewArr[i6];
                if (view != null && view.getVisibility() == 0) {
                    i5 = z4 ? Math.min(i5, view.getTop()) : view.getTop();
                    i4 = z4 ? Math.max(i4, view.getBottom()) : view.getBottom();
                    z4 = true;
                }
            }
            return i4 - i5;
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(@o0 AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            BadgeDrawable badgeDrawable = this.f54207f;
            if (badgeDrawable != null && badgeDrawable.isVisible()) {
                accessibilityNodeInfo.setContentDescription(((Object) getContentDescription()) + ProtectedSandApp.s("\uf235") + ((Object) this.f54207f.o()));
            }
            h0 r22 = h0.r2(accessibilityNodeInfo);
            r22.m1(h0.g.j(0, 1, this.f54203b.k(), 1, false, isSelected()));
            if (isSelected()) {
                r22.k1(false);
                r22.V0(h0.a.f27010j);
            }
            r22.V1(getResources().getString(a.m.P));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i4, int i5) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i4);
            int mode = View.MeasureSpec.getMode(i4);
            int H = TabLayout.this.H();
            if (H > 0 && (mode == 0 || size > H)) {
                i4 = View.MeasureSpec.makeMeasureSpec(TabLayout.this.f54167s, Integer.MIN_VALUE);
            }
            super.onMeasure(i4, i5);
            if (this.f54204c != null) {
                float f4 = TabLayout.this.f54164p;
                int i6 = this.f54212k;
                ImageView imageView = this.f54205d;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f54204c;
                    if (textView != null && textView.getLineCount() > 1) {
                        f4 = TabLayout.this.f54165q;
                    }
                } else {
                    i6 = 1;
                }
                float textSize = this.f54204c.getTextSize();
                int lineCount = this.f54204c.getLineCount();
                int maxLines = this.f54204c.getMaxLines();
                if (f4 != textSize || (maxLines >= 0 && i6 != maxLines)) {
                    if (TabLayout.this.A != 1 || f4 <= textSize || lineCount != 1 || ((layout = this.f54204c.getLayout()) != null && j(layout, 0, f4) <= (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                        this.f54204c.setTextSize(0, f4);
                        this.f54204c.setMaxLines(i6);
                        super.onMeasure(i4, i5);
                    }
                }
            }
        }

        int p() {
            View[] viewArr = {this.f54204c, this.f54205d, this.f54208g};
            int i4 = 0;
            int i5 = 0;
            boolean z4 = false;
            for (int i6 = 0; i6 < 3; i6++) {
                View view = viewArr[i6];
                if (view != null && view.getVisibility() == 0) {
                    i5 = z4 ? Math.min(i5, view.getLeft()) : view.getLeft();
                    i4 = z4 ? Math.max(i4, view.getRight()) : view.getRight();
                    z4 = true;
                }
            }
            return i4 - i5;
        }

        @Override // android.view.View
        public boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f54203b == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            this.f54203b.r();
            return true;
        }

        @q0
        public i s() {
            return this.f54203b;
        }

        @Override // android.view.View
        public void setSelected(boolean z4) {
            isSelected();
            super.setSelected(z4);
            TextView textView = this.f54204c;
            if (textView != null) {
                textView.setSelected(z4);
            }
            ImageView imageView = this.f54205d;
            if (imageView != null) {
                imageView.setSelected(z4);
            }
            View view = this.f54208g;
            if (view != null) {
                view.setSelected(z4);
            }
        }

        void x() {
            y(null);
            setSelected(false);
        }

        void y(@q0 i iVar) {
            if (iVar != this.f54203b) {
                this.f54203b = iVar;
                D();
            }
        }
    }

    public static class o implements f {

        /* renamed from: a, reason: collision with root package name */
        private final ViewPager f54216a;

        public o(ViewPager viewPager) {
            this.f54216a = viewPager;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(@o0 i iVar) {
            this.f54216a.Y(iVar.k());
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(i iVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(i iVar) {
        }
    }

    public TabLayout(@o0 Context context) {
        this(context, null);
    }

    private void F0(@q0 ViewPager viewPager, boolean z4, boolean z5) {
        ViewPager viewPager2 = this.K;
        if (viewPager2 != null) {
            m mVar = this.N;
            if (mVar != null) {
                viewPager2.T(mVar);
            }
            b bVar = this.O;
            if (bVar != null) {
                this.K.S(bVar);
            }
        }
        c cVar = this.I;
        if (cVar != null) {
            V(cVar);
            this.I = null;
        }
        if (viewPager != null) {
            this.K = viewPager;
            if (this.N == null) {
                this.N = new m(this);
            }
            this.N.b();
            viewPager.c(this.N);
            o oVar = new o(viewPager);
            this.I = oVar;
            c(oVar);
            androidx.viewpager.widget.a u4 = viewPager.u();
            if (u4 != null) {
                g0(u4, z4);
            }
            if (this.O == null) {
                this.O = new b();
            }
            this.O.a(z4);
            viewPager.b(this.O);
            i0(viewPager.x(), 0.0f, true);
        } else {
            this.K = null;
            g0(null, false);
        }
        this.P = z5;
    }

    private void G0() {
        int size = this.f54150b.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f54150b.get(i4).E();
        }
    }

    private void H0(@o0 LinearLayout.LayoutParams layoutParams) {
        if (this.A == 1 && this.f54172x == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
    }

    private int I() {
        int i4 = this.f54168t;
        if (i4 != -1) {
            return i4;
        }
        int i5 = this.A;
        if (i5 == 0 || i5 == 2) {
            return this.f54170v;
        }
        return 0;
    }

    private int L() {
        return Math.max(0, ((this.f54152d.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void Z(int i4) {
        n nVar = (n) this.f54152d.getChildAt(i4);
        this.f54152d.removeViewAt(i4);
        if (nVar != null) {
            nVar.x();
            this.Q.release(nVar);
        }
        requestLayout();
    }

    private void i(@o0 TabItem tabItem) {
        i R3 = R();
        CharSequence charSequence = tabItem.f54141b;
        if (charSequence != null) {
            R3.D(charSequence);
        }
        Drawable drawable = tabItem.f54142c;
        if (drawable != null) {
            R3.x(drawable);
        }
        int i4 = tabItem.f54143d;
        if (i4 != 0) {
            R3.u(i4);
        }
        if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
            R3.t(tabItem.getContentDescription());
        }
        e(R3);
    }

    private void j(@o0 i iVar) {
        n nVar = iVar.f54198i;
        nVar.setSelected(false);
        nVar.setActivated(false);
        this.f54152d.addView(nVar, iVar.k(), s());
    }

    private void k(View view) {
        if (!(view instanceof TabItem)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\uf237"));
        }
        i((TabItem) view);
    }

    private void l(int i4) {
        if (i4 == -1) {
            return;
        }
        if (getWindowToken() == null || !x1.Y0(this) || this.f54152d.c()) {
            i0(i4, 0.0f, true);
            return;
        }
        int scrollX = getScrollX();
        int o4 = o(i4, 0.0f);
        if (scrollX != o4) {
            y();
            this.J.setIntValues(scrollX, o4);
            this.J.start();
        }
        this.f54152d.b(i4, this.f54173y);
    }

    private void m(int i4) {
        if (i4 != 0) {
            if (i4 == 1) {
                this.f54152d.setGravity(1);
                return;
            } else if (i4 != 2) {
                return;
            }
        }
        this.f54152d.setGravity(f0.f27129b);
    }

    private void n() {
        int i4 = this.A;
        x1.n2(this.f54152d, (i4 == 0 || i4 == 2) ? Math.max(0, this.f54171w - this.f54153e) : 0, 0, 0, 0);
        int i5 = this.A;
        if (i5 == 0) {
            m(this.f54172x);
        } else if (i5 == 1 || i5 == 2) {
            this.f54152d.setGravity(1);
        }
        I0(true);
    }

    private int o(int i4, float f4) {
        int i5 = this.A;
        if (i5 != 0 && i5 != 2) {
            return 0;
        }
        View childAt = this.f54152d.getChildAt(i4);
        int i6 = i4 + 1;
        View childAt2 = i6 < this.f54152d.getChildCount() ? this.f54152d.getChildAt(i6) : null;
        int width = childAt != null ? childAt.getWidth() : 0;
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i7 = (int) ((width + width2) * 0.5f * f4);
        return x1.c0(this) == 0 ? left + i7 : left - i7;
    }

    private void p0(int i4) {
        int childCount = this.f54152d.getChildCount();
        if (i4 < childCount) {
            int i5 = 0;
            while (i5 < childCount) {
                View childAt = this.f54152d.getChildAt(i5);
                boolean z4 = true;
                childAt.setSelected(i5 == i4);
                if (i5 != i4) {
                    z4 = false;
                }
                childAt.setActivated(z4);
                i5++;
            }
        }
    }

    private void q(@o0 i iVar, int i4) {
        iVar.z(i4);
        this.f54150b.add(i4, iVar);
        int size = this.f54150b.size();
        while (true) {
            i4++;
            if (i4 >= size) {
                return;
            } else {
                this.f54150b.get(i4).z(i4);
            }
        }
    }

    @o0
    private static ColorStateList r(int i4, int i5) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i5, i4});
    }

    @o0
    private LinearLayout.LayoutParams s() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        H0(layoutParams);
        return layoutParams;
    }

    @o0
    private n u(@o0 i iVar) {
        v.a<n> aVar = this.Q;
        n acquire = aVar != null ? aVar.acquire() : null;
        if (acquire == null) {
            acquire = new n(getContext());
        }
        acquire.y(iVar);
        acquire.setFocusable(true);
        acquire.setMinimumWidth(I());
        if (TextUtils.isEmpty(iVar.f54193d)) {
            acquire.setContentDescription(iVar.f54192c);
        } else {
            acquire.setContentDescription(iVar.f54193d);
        }
        return acquire;
    }

    private void v(@o0 i iVar) {
        for (int size = this.H.size() - 1; size >= 0; size--) {
            this.H.get(size).c(iVar);
        }
    }

    private void w(@o0 i iVar) {
        for (int size = this.H.size() - 1; size >= 0; size--) {
            this.H.get(size).a(iVar);
        }
    }

    private void x(@o0 i iVar) {
        for (int size = this.H.size() - 1; size >= 0; size--) {
            this.H.get(size).b(iVar);
        }
    }

    private void y() {
        if (this.J == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.J = valueAnimator;
            valueAnimator.setInterpolator(com.google.android.material.animation.a.f52467b);
            this.J.setDuration(this.f54173y);
            this.J.addUpdateListener(new a());
        }
    }

    @r(unit = 0)
    private int z() {
        int size = this.f54150b.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                break;
            }
            i iVar = this.f54150b.get(i4);
            if (iVar == null || iVar.h() == null || TextUtils.isEmpty(iVar.n())) {
                i4++;
            } else if (!this.B) {
                return 72;
            }
        }
        return 48;
    }

    public int A() {
        i iVar = this.f54151c;
        if (iVar != null) {
            return iVar.k();
        }
        return -1;
    }

    @Deprecated
    public void A0(@q0 androidx.viewpager.widget.a aVar) {
        g0(aVar, false);
    }

    @q0
    public i B(int i4) {
        if (i4 < 0 || i4 >= C()) {
            return null;
        }
        return this.f54150b.get(i4);
    }

    public void B0(boolean z4) {
        if (this.E != z4) {
            this.E = z4;
            for (int i4 = 0; i4 < this.f54152d.getChildCount(); i4++) {
                View childAt = this.f54152d.getChildAt(i4);
                if (childAt instanceof n) {
                    ((n) childAt).E(getContext());
                }
            }
        }
    }

    public int C() {
        return this.f54150b.size();
    }

    public void C0(@androidx.annotation.h int i4) {
        B0(getResources().getBoolean(i4));
    }

    public int D() {
        return this.f54172x;
    }

    public void D0(@q0 ViewPager viewPager) {
        E0(viewPager, true);
    }

    @q0
    public ColorStateList E() {
        return this.f54159k;
    }

    public void E0(@q0 ViewPager viewPager, boolean z4) {
        F0(viewPager, z4, false);
    }

    public int F() {
        return this.D;
    }

    public int G() {
        return this.f54174z;
    }

    int H() {
        return this.f54167s;
    }

    void I0(boolean z4) {
        for (int i4 = 0; i4 < this.f54152d.getChildCount(); i4++) {
            View childAt = this.f54152d.getChildAt(i4);
            childAt.setMinimumWidth(I());
            H0((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z4) {
                childAt.requestLayout();
            }
        }
    }

    public int J() {
        return this.A;
    }

    @q0
    public ColorStateList K() {
        return this.f54160l;
    }

    @o0
    public Drawable M() {
        return this.f54161m;
    }

    @q0
    public ColorStateList N() {
        return this.f54158j;
    }

    public boolean O() {
        return this.E;
    }

    public boolean P() {
        return this.B;
    }

    public boolean Q() {
        return this.C;
    }

    @o0
    public i R() {
        i t4 = t();
        t4.f54197h = this;
        t4.f54198i = u(t4);
        if (t4.f54199j != -1) {
            t4.f54198i.setId(t4.f54199j);
        }
        return t4;
    }

    void S() {
        int x4;
        U();
        androidx.viewpager.widget.a aVar = this.L;
        if (aVar != null) {
            int h4 = aVar.h();
            for (int i4 = 0; i4 < h4; i4++) {
                h(R().D(this.L.j(i4)), false);
            }
            ViewPager viewPager = this.K;
            if (viewPager == null || h4 <= 0 || (x4 = viewPager.x()) == A() || x4 >= C()) {
                return;
            }
            a0(B(x4));
        }
    }

    protected boolean T(i iVar) {
        return Q2.release(iVar);
    }

    public void U() {
        for (int childCount = this.f54152d.getChildCount() - 1; childCount >= 0; childCount--) {
            Z(childCount);
        }
        Iterator<i> it = this.f54150b.iterator();
        while (it.hasNext()) {
            i next = it.next();
            it.remove();
            next.q();
            T(next);
        }
        this.f54151c = null;
    }

    @Deprecated
    public void V(@q0 c cVar) {
        this.H.remove(cVar);
    }

    public void W(@o0 f fVar) {
        V(fVar);
    }

    public void X(@o0 i iVar) {
        if (iVar.f54197h != this) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\uf238"));
        }
        Y(iVar.k());
    }

    public void Y(int i4) {
        i iVar = this.f54151c;
        int k4 = iVar != null ? iVar.k() : 0;
        Z(i4);
        i remove = this.f54150b.remove(i4);
        if (remove != null) {
            remove.q();
            T(remove);
        }
        int size = this.f54150b.size();
        for (int i5 = i4; i5 < size; i5++) {
            this.f54150b.get(i5).z(i5);
        }
        if (k4 == i4) {
            a0(this.f54150b.isEmpty() ? null : this.f54150b.get(Math.max(0, i4 - 1)));
        }
    }

    public void a0(@q0 i iVar) {
        b0(iVar, true);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        k(view);
    }

    public void b0(@q0 i iVar, boolean z4) {
        i iVar2 = this.f54151c;
        if (iVar2 == iVar) {
            if (iVar2 != null) {
                v(iVar);
                l(iVar.k());
                return;
            }
            return;
        }
        int k4 = iVar != null ? iVar.k() : -1;
        if (z4) {
            if ((iVar2 == null || iVar2.k() == -1) && k4 != -1) {
                i0(k4, 0.0f, true);
            } else {
                l(k4);
            }
            if (k4 != -1) {
                p0(k4);
            }
        }
        this.f54151c = iVar;
        if (iVar2 != null) {
            x(iVar2);
        }
        if (iVar != null) {
            w(iVar);
        }
    }

    @Deprecated
    public void c(@q0 c cVar) {
        if (this.H.contains(cVar)) {
            return;
        }
        this.H.add(cVar);
    }

    public void c0(boolean z4) {
        if (this.B != z4) {
            this.B = z4;
            for (int i4 = 0; i4 < this.f54152d.getChildCount(); i4++) {
                View childAt = this.f54152d.getChildAt(i4);
                if (childAt instanceof n) {
                    ((n) childAt).F();
                }
            }
            n();
        }
    }

    public void d(@o0 f fVar) {
        c(fVar);
    }

    public void d0(@androidx.annotation.h int i4) {
        c0(getResources().getBoolean(i4));
    }

    public void e(@o0 i iVar) {
        h(iVar, this.f54150b.isEmpty());
    }

    @Deprecated
    public void e0(@q0 c cVar) {
        c cVar2 = this.G;
        if (cVar2 != null) {
            V(cVar2);
        }
        this.G = cVar;
        if (cVar != null) {
            c(cVar);
        }
    }

    public void f(@o0 i iVar, int i4) {
        g(iVar, i4, this.f54150b.isEmpty());
    }

    @Deprecated
    public void f0(@q0 f fVar) {
        e0(fVar);
    }

    public void g(@o0 i iVar, int i4, boolean z4) {
        if (iVar.f54197h != this) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\uf239"));
        }
        q(iVar, i4);
        j(iVar);
        if (z4) {
            iVar.r();
        }
    }

    void g0(@q0 androidx.viewpager.widget.a aVar, boolean z4) {
        DataSetObserver dataSetObserver;
        androidx.viewpager.widget.a aVar2 = this.L;
        if (aVar2 != null && (dataSetObserver = this.M) != null) {
            aVar2.x(dataSetObserver);
        }
        this.L = aVar;
        if (z4 && aVar != null) {
            if (this.M == null) {
                this.M = new g();
            }
            aVar.p(this.M);
        }
        S();
    }

    public void h(@o0 i iVar, boolean z4) {
        g(iVar, this.f54150b.size(), z4);
    }

    void h0(Animator.AnimatorListener animatorListener) {
        y();
        this.J.addListener(animatorListener);
    }

    public void i0(int i4, float f4, boolean z4) {
        j0(i4, f4, z4, true);
    }

    public void j0(int i4, float f4, boolean z4, boolean z5) {
        int round = Math.round(i4 + f4);
        if (round < 0 || round >= this.f54152d.getChildCount()) {
            return;
        }
        if (z5) {
            this.f54152d.f(i4, f4);
        }
        ValueAnimator valueAnimator = this.J;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.J.cancel();
        }
        scrollTo(o(i4, f4), 0);
        if (z4) {
            p0(round);
        }
    }

    public void k0(@androidx.annotation.v int i4) {
        if (i4 != 0) {
            l0(e.a.b(getContext(), i4));
        } else {
            l0(null);
        }
    }

    public void l0(@q0 Drawable drawable) {
        if (this.f54161m != drawable) {
            if (drawable == null) {
                drawable = new GradientDrawable();
            }
            this.f54161m = drawable;
        }
    }

    public void m0(@androidx.annotation.l int i4) {
        this.f54162n = i4;
    }

    public void n0(int i4) {
        if (this.f54174z != i4) {
            this.f54174z = i4;
            x1.t1(this.f54152d);
        }
    }

    @Deprecated
    public void o0(int i4) {
        this.f54152d.g(i4);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.google.android.material.shape.k.e(this);
        if (this.K == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                F0((ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.P) {
            D0(null);
            this.P = false;
        }
    }

    @Override // android.view.View
    protected void onDraw(@o0 Canvas canvas) {
        for (int i4 = 0; i4 < this.f54152d.getChildCount(); i4++) {
            View childAt = this.f54152d.getChildAt(i4);
            if (childAt instanceof n) {
                ((n) childAt).m(canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@o0 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        h0.r2(accessibilityNodeInfo).l1(h0.f.h(1, C(), false, 1));
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i4, int i5) {
        int round = Math.round(com.google.android.material.internal.v.e(getContext(), z()));
        int mode = View.MeasureSpec.getMode(i5);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i5 = View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + round, 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i5) >= round) {
            getChildAt(0).setMinimumHeight(round);
        }
        int size = View.MeasureSpec.getSize(i4);
        if (View.MeasureSpec.getMode(i4) != 0) {
            int i6 = this.f54169u;
            if (i6 <= 0) {
                i6 = (int) (size - com.google.android.material.internal.v.e(getContext(), 56));
            }
            this.f54167s = i6;
        }
        super.onMeasure(i4, i5);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i7 = this.A;
            if (i7 != 0) {
                if (i7 == 1) {
                    if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                        return;
                    }
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i5, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
                }
                if (i7 != 2) {
                    return;
                }
            }
            if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i5, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
        }
    }

    public void p() {
        this.H.clear();
    }

    public void q0(int i4) {
        if (this.f54172x != i4) {
            this.f54172x = i4;
            n();
        }
    }

    public void r0(@q0 ColorStateList colorStateList) {
        if (this.f54159k != colorStateList) {
            this.f54159k = colorStateList;
            G0();
        }
    }

    public void s0(@androidx.annotation.n int i4) {
        r0(androidx.core.content.d.getColorStateList(getContext(), i4));
    }

    @Override // android.view.View
    @x0(21)
    public void setElevation(float f4) {
        super.setElevation(f4);
        com.google.android.material.shape.k.d(this, f4);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return L() > 0;
    }

    protected i t() {
        i acquire = Q2.acquire();
        return acquire == null ? new i() : acquire;
    }

    public void t0(int i4) {
        this.D = i4;
        if (i4 == 0) {
            this.F = new com.google.android.material.tabs.b();
        } else {
            if (i4 == 1) {
                this.F = new com.google.android.material.tabs.a();
                return;
            }
            throw new IllegalArgumentException(i4 + ProtectedSandApp.s("\uf23a"));
        }
    }

    public void u0(boolean z4) {
        this.C = z4;
        x1.t1(this.f54152d);
    }

    public void v0(int i4) {
        if (i4 != this.A) {
            this.A = i4;
            n();
        }
    }

    public void w0(@q0 ColorStateList colorStateList) {
        if (this.f54160l != colorStateList) {
            this.f54160l = colorStateList;
            for (int i4 = 0; i4 < this.f54152d.getChildCount(); i4++) {
                View childAt = this.f54152d.getChildAt(i4);
                if (childAt instanceof n) {
                    ((n) childAt).E(getContext());
                }
            }
        }
    }

    public void x0(@androidx.annotation.n int i4) {
        w0(androidx.core.content.d.getColorStateList(getContext(), i4));
    }

    public void y0(int i4, int i5) {
        z0(r(i4, i5));
    }

    public void z0(@q0 ColorStateList colorStateList) {
        if (this.f54158j != colorStateList) {
            this.f54158j = colorStateList;
            G0();
        }
    }

    public TabLayout(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.Xd);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i4) {
        k(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TabLayout(@androidx.annotation.o0 android.content.Context r11, @androidx.annotation.q0 android.util.AttributeSet r12, int r13) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        k(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        k(view);
    }
}
