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
import androidx.core.util.p;
import androidx.core.view.accessibility.g0;
import androidx.core.view.d0;
import androidx.core.view.i0;
import androidx.core.view.s1;
import androidx.core.view.y1;
import androidx.core.widget.s;
import androidx.viewpager.widget.ViewPager;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.internal.v;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import n1.a;

@ViewPager.e
/* loaded from: classes2.dex */
public class TabLayout extends HorizontalScrollView {
    public static final int A0 = 1;
    public static final int B0 = 2;
    public static final int C0 = 3;
    public static final int D0 = 0;
    public static final int E0 = 1;

    /* renamed from: i0, reason: collision with root package name */
    @r(unit = 0)
    private static final int f14283i0 = 72;

    /* renamed from: j0, reason: collision with root package name */
    @r(unit = 0)
    static final int f14284j0 = 8;

    /* renamed from: k0, reason: collision with root package name */
    @r(unit = 0)
    private static final int f14285k0 = 48;

    /* renamed from: l0, reason: collision with root package name */
    @r(unit = 0)
    private static final int f14286l0 = 56;

    /* renamed from: m0, reason: collision with root package name */
    @r(unit = 0)
    static final int f14287m0 = 16;

    /* renamed from: n0, reason: collision with root package name */
    private static final int f14288n0 = -1;

    /* renamed from: o0, reason: collision with root package name */
    private static final int f14289o0 = 300;

    /* renamed from: r0, reason: collision with root package name */
    public static final int f14292r0 = 0;

    /* renamed from: s0, reason: collision with root package name */
    public static final int f14293s0 = 1;

    /* renamed from: t0, reason: collision with root package name */
    public static final int f14294t0 = 2;

    /* renamed from: u0, reason: collision with root package name */
    public static final int f14295u0 = 0;

    /* renamed from: v0, reason: collision with root package name */
    public static final int f14296v0 = 1;

    /* renamed from: w0, reason: collision with root package name */
    public static final int f14297w0 = 0;

    /* renamed from: x0, reason: collision with root package name */
    public static final int f14298x0 = 1;

    /* renamed from: y0, reason: collision with root package name */
    public static final int f14299y0 = 2;

    /* renamed from: z0, reason: collision with root package name */
    public static final int f14300z0 = 0;
    private int A;
    PorterDuff.Mode B;
    float C;
    float D;
    final int E;
    int F;
    private final int G;
    private final int H;
    private final int I;
    private int J;
    int K;
    int L;
    int M;
    int N;
    boolean O;
    boolean P;
    int Q;
    boolean R;
    private com.google.android.material.tabs.b S;

    @q0
    private c T;
    private final ArrayList<c> U;

    @q0
    private c V;
    private ValueAnimator W;

    /* renamed from: a0, reason: collision with root package name */
    @q0
    ViewPager f14301a0;

    /* renamed from: b0, reason: collision with root package name */
    @q0
    private androidx.viewpager.widget.a f14302b0;

    /* renamed from: c0, reason: collision with root package name */
    private DataSetObserver f14303c0;

    /* renamed from: d0, reason: collision with root package name */
    private m f14304d0;

    /* renamed from: e0, reason: collision with root package name */
    private b f14305e0;

    /* renamed from: f0, reason: collision with root package name */
    private boolean f14306f0;

    /* renamed from: g0, reason: collision with root package name */
    private final p.a<n> f14307g0;

    /* renamed from: o, reason: collision with root package name */
    private final ArrayList<i> f14308o;

    /* renamed from: p, reason: collision with root package name */
    @q0
    private i f14309p;

    /* renamed from: q, reason: collision with root package name */
    @o0
    final h f14310q;

    /* renamed from: r, reason: collision with root package name */
    int f14311r;

    /* renamed from: s, reason: collision with root package name */
    int f14312s;

    /* renamed from: t, reason: collision with root package name */
    int f14313t;

    /* renamed from: u, reason: collision with root package name */
    int f14314u;

    /* renamed from: v, reason: collision with root package name */
    int f14315v;

    /* renamed from: w, reason: collision with root package name */
    ColorStateList f14316w;

    /* renamed from: x, reason: collision with root package name */
    ColorStateList f14317x;

    /* renamed from: y, reason: collision with root package name */
    ColorStateList f14318y;

    /* renamed from: z, reason: collision with root package name */
    @o0
    Drawable f14319z;

    /* renamed from: q0, reason: collision with root package name */
    private static final String f14291q0 = ProtectedSandApp.s("ቸ");

    /* renamed from: h0, reason: collision with root package name */
    private static final int f14282h0 = a.n.Aa;

    /* renamed from: p0, reason: collision with root package name */
    private static final p.a<i> f14290p0 = new p.c(16);

    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@o0 ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    /* loaded from: classes3.dex */
    private class b implements ViewPager.h {

        /* renamed from: a, reason: collision with root package name */
        private boolean f14321a;

        b() {
        }

        void a(boolean z5) {
            this.f14321a = z5;
        }

        @Override // androidx.viewpager.widget.ViewPager.h
        public void b(@o0 ViewPager viewPager, @q0 androidx.viewpager.widget.a aVar, @q0 androidx.viewpager.widget.a aVar2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f14301a0 == viewPager) {
                tabLayout.g0(aVar2, this.f14321a);
            }
        }
    }

    @Deprecated
    public interface c<T extends i> {
        void a(T t5);

        void b(T t5);

        void c(T t5);
    }

    public @interface d {
    }

    @c1({c1.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }

    /* loaded from: classes3.dex */
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

        /* renamed from: o, reason: collision with root package name */
        ValueAnimator f14324o;

        /* renamed from: p, reason: collision with root package name */
        int f14325p;

        /* renamed from: q, reason: collision with root package name */
        float f14326q;

        /* renamed from: r, reason: collision with root package name */
        private int f14327r;

        class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ View f14329a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f14330b;

            a(View view, View view2) {
                this.f14329a = view;
                this.f14330b = view2;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(@o0 ValueAnimator valueAnimator) {
                h.this.h(this.f14329a, this.f14330b, valueAnimator.getAnimatedFraction());
            }
        }

        class b extends AnimatorListenerAdapter {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f14332a;

            b(int i5) {
                this.f14332a = i5;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                h.this.f14325p = this.f14332a;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                h.this.f14325p = this.f14332a;
            }
        }

        h(Context context) {
            super(context);
            this.f14325p = -1;
            this.f14327r = -1;
            setWillNotDraw(false);
        }

        private void e() {
            View childAt = getChildAt(this.f14325p);
            com.google.android.material.tabs.b bVar = TabLayout.this.S;
            TabLayout tabLayout = TabLayout.this;
            bVar.d(tabLayout, childAt, tabLayout.f14319z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h(View view, View view2, float f6) {
            if (view != null && view.getWidth() > 0) {
                com.google.android.material.tabs.b bVar = TabLayout.this.S;
                TabLayout tabLayout = TabLayout.this;
                bVar.c(tabLayout, view, view2, f6, tabLayout.f14319z);
            } else {
                Drawable drawable = TabLayout.this.f14319z;
                drawable.setBounds(-1, drawable.getBounds().top, -1, TabLayout.this.f14319z.getBounds().bottom);
            }
            y1.n1(this);
        }

        private void i(boolean z5, int i5, int i6) {
            View childAt = getChildAt(this.f14325p);
            View childAt2 = getChildAt(i5);
            if (childAt2 == null) {
                e();
                return;
            }
            a aVar = new a(childAt, childAt2);
            if (!z5) {
                this.f14324o.removeAllUpdateListeners();
                this.f14324o.addUpdateListener(aVar);
                return;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f14324o = valueAnimator;
            valueAnimator.setInterpolator(com.google.android.material.animation.a.f12779b);
            valueAnimator.setDuration(i6);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(aVar);
            valueAnimator.addListener(new b(i5));
            valueAnimator.start();
        }

        void b(int i5, int i6) {
            ValueAnimator valueAnimator = this.f14324o;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f14324o.cancel();
            }
            i(true, i5, i6);
        }

        boolean c() {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                if (getChildAt(i5).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        float d() {
            return this.f14325p + this.f14326q;
        }

        @Override // android.view.View
        public void draw(@o0 Canvas canvas) {
            int height;
            int height2 = TabLayout.this.f14319z.getBounds().height();
            if (height2 < 0) {
                height2 = TabLayout.this.f14319z.getIntrinsicHeight();
            }
            int i5 = TabLayout.this.M;
            if (i5 == 0) {
                height = getHeight() - height2;
                height2 = getHeight();
            } else if (i5 != 1) {
                height = 0;
                if (i5 != 2) {
                    height2 = i5 != 3 ? 0 : getHeight();
                }
            } else {
                height = (getHeight() - height2) / 2;
                height2 = (getHeight() + height2) / 2;
            }
            if (TabLayout.this.f14319z.getBounds().width() > 0) {
                Rect bounds = TabLayout.this.f14319z.getBounds();
                TabLayout.this.f14319z.setBounds(bounds.left, height, bounds.right, height2);
                TabLayout tabLayout = TabLayout.this;
                Drawable drawable = tabLayout.f14319z;
                if (tabLayout.A != 0) {
                    androidx.core.graphics.drawable.d.n(drawable, TabLayout.this.A);
                }
                drawable.draw(canvas);
            }
            super.draw(canvas);
        }

        void f(int i5, float f6) {
            ValueAnimator valueAnimator = this.f14324o;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f14324o.cancel();
            }
            this.f14325p = i5;
            this.f14326q = f6;
            h(getChildAt(i5), getChildAt(this.f14325p + 1), this.f14326q);
        }

        void g(int i5) {
            Rect bounds = TabLayout.this.f14319z.getBounds();
            TabLayout.this.f14319z.setBounds(bounds.left, 0, bounds.right, i5);
            requestLayout();
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z5, int i5, int i6, int i7, int i8) {
            super.onLayout(z5, i5, i6, i7, i8);
            ValueAnimator valueAnimator = this.f14324o;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                e();
            } else {
                i(false, this.f14325p, -1);
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        protected void onMeasure(int i5, int i6) {
            super.onMeasure(i5, i6);
            if (View.MeasureSpec.getMode(i5) != 1073741824) {
                return;
            }
            TabLayout tabLayout = TabLayout.this;
            boolean z5 = true;
            if (tabLayout.K == 1 || tabLayout.N == 2) {
                int childCount = getChildCount();
                int i7 = 0;
                for (int i8 = 0; i8 < childCount; i8++) {
                    View childAt = getChildAt(i8);
                    if (childAt.getVisibility() == 0) {
                        i7 = Math.max(i7, childAt.getMeasuredWidth());
                    }
                }
                if (i7 <= 0) {
                    return;
                }
                if (i7 * childCount <= getMeasuredWidth() - (((int) v.e(getContext(), 16)) * 2)) {
                    boolean z6 = false;
                    for (int i9 = 0; i9 < childCount; i9++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i9).getLayoutParams();
                        if (layoutParams.width != i7 || layoutParams.weight != 0.0f) {
                            layoutParams.width = i7;
                            layoutParams.weight = 0.0f;
                            z6 = true;
                        }
                    }
                    z5 = z6;
                } else {
                    TabLayout tabLayout2 = TabLayout.this;
                    tabLayout2.K = 0;
                    tabLayout2.I0(false);
                }
                if (z5) {
                    super.onMeasure(i5, i6);
                }
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onRtlPropertiesChanged(int i5) {
            super.onRtlPropertiesChanged(i5);
        }
    }

    public static class i {

        /* renamed from: k, reason: collision with root package name */
        public static final int f14334k = -1;

        /* renamed from: a, reason: collision with root package name */
        @q0
        private Object f14335a;

        /* renamed from: b, reason: collision with root package name */
        @q0
        private Drawable f14336b;

        /* renamed from: c, reason: collision with root package name */
        @q0
        private CharSequence f14337c;

        /* renamed from: d, reason: collision with root package name */
        @q0
        private CharSequence f14338d;

        /* renamed from: f, reason: collision with root package name */
        @q0
        private View f14340f;

        /* renamed from: h, reason: collision with root package name */
        @q0
        public TabLayout f14342h;

        /* renamed from: i, reason: collision with root package name */
        @o0
        public n f14343i;

        /* renamed from: e, reason: collision with root package name */
        private int f14339e = -1;

        /* renamed from: g, reason: collision with root package name */
        @d
        private int f14341g = 1;

        /* renamed from: j, reason: collision with root package name */
        private int f14344j = -1;

        @o0
        public i A(@d int i5) {
            this.f14341g = i5;
            TabLayout tabLayout = this.f14342h;
            if (tabLayout.K == 1 || tabLayout.N == 2) {
                tabLayout.I0(true);
            }
            E();
            if (com.google.android.material.badge.a.f12931a && this.f14343i.t() && this.f14343i.f14352s.isVisible()) {
                this.f14343i.invalidate();
            }
            return this;
        }

        @o0
        public i B(@q0 Object obj) {
            this.f14335a = obj;
            return this;
        }

        @o0
        public i C(@g1 int i5) {
            TabLayout tabLayout = this.f14342h;
            if (tabLayout != null) {
                return D(tabLayout.getResources().getText(i5));
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("ቱ"));
        }

        @o0
        public i D(@q0 CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f14338d) && !TextUtils.isEmpty(charSequence)) {
                this.f14343i.setContentDescription(charSequence);
            }
            this.f14337c = charSequence;
            E();
            return this;
        }

        void E() {
            n nVar = this.f14343i;
            if (nVar != null) {
                nVar.D();
            }
        }

        @q0
        public BadgeDrawable e() {
            return n.h(this.f14343i);
        }

        @q0
        public CharSequence f() {
            n nVar = this.f14343i;
            if (nVar == null) {
                return null;
            }
            return nVar.getContentDescription();
        }

        @q0
        public View g() {
            return this.f14340f;
        }

        @q0
        public Drawable h() {
            return this.f14336b;
        }

        public int i() {
            return this.f14344j;
        }

        @o0
        public BadgeDrawable j() {
            return this.f14343i.r();
        }

        public int k() {
            return this.f14339e;
        }

        @d
        public int l() {
            return this.f14341g;
        }

        @q0
        public Object m() {
            return this.f14335a;
        }

        @q0
        public CharSequence n() {
            return this.f14337c;
        }

        public boolean o() {
            TabLayout tabLayout = this.f14342h;
            if (tabLayout != null) {
                return tabLayout.A() == this.f14339e;
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("ቲ"));
        }

        public void p() {
            this.f14343i.w();
        }

        void q() {
            this.f14342h = null;
            this.f14343i = null;
            this.f14335a = null;
            this.f14336b = null;
            this.f14344j = -1;
            this.f14337c = null;
            this.f14338d = null;
            this.f14339e = -1;
            this.f14340f = null;
        }

        public void r() {
            TabLayout tabLayout = this.f14342h;
            if (tabLayout == null) {
                throw new IllegalArgumentException(ProtectedSandApp.s("ታ"));
            }
            tabLayout.a0(this);
        }

        @o0
        public i s(@g1 int i5) {
            TabLayout tabLayout = this.f14342h;
            if (tabLayout != null) {
                return t(tabLayout.getResources().getText(i5));
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("ቴ"));
        }

        @o0
        public i t(@q0 CharSequence charSequence) {
            this.f14338d = charSequence;
            E();
            return this;
        }

        @o0
        public i u(@j0 int i5) {
            return v(LayoutInflater.from(this.f14343i.getContext()).inflate(i5, (ViewGroup) this.f14343i, false));
        }

        @o0
        public i v(@q0 View view) {
            this.f14340f = view;
            E();
            return this;
        }

        @o0
        public i w(@androidx.annotation.v int i5) {
            TabLayout tabLayout = this.f14342h;
            if (tabLayout != null) {
                return x(androidx.appcompat.content.res.a.d(tabLayout.getContext(), i5));
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("ት"));
        }

        @o0
        public i x(@q0 Drawable drawable) {
            this.f14336b = drawable;
            TabLayout tabLayout = this.f14342h;
            if (tabLayout.K == 1 || tabLayout.N == 2) {
                tabLayout.I0(true);
            }
            E();
            if (com.google.android.material.badge.a.f12931a && this.f14343i.t() && this.f14343i.f14352s.isVisible()) {
                this.f14343i.invalidate();
            }
            return this;
        }

        @o0
        public i y(int i5) {
            this.f14344j = i5;
            n nVar = this.f14343i;
            if (nVar != null) {
                nVar.setId(i5);
            }
            return this;
        }

        void z(int i5) {
            this.f14339e = i5;
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

    /* loaded from: classes3.dex */
    public static class m implements ViewPager.i {

        /* renamed from: a, reason: collision with root package name */
        @o0
        private final WeakReference<TabLayout> f14345a;

        /* renamed from: b, reason: collision with root package name */
        private int f14346b;

        /* renamed from: c, reason: collision with root package name */
        private int f14347c;

        public m(TabLayout tabLayout) {
            this.f14345a = new WeakReference<>(tabLayout);
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void a(int i5, float f6, int i6) {
            TabLayout tabLayout = this.f14345a.get();
            if (tabLayout != null) {
                int i7 = this.f14347c;
                tabLayout.j0(i5, f6, i7 != 2 || this.f14346b == 1, (i7 == 2 && this.f14346b == 0) ? false : true);
            }
        }

        void b() {
            this.f14347c = 0;
            this.f14346b = 0;
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void c(int i5) {
            this.f14346b = this.f14347c;
            this.f14347c = i5;
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void d(int i5) {
            TabLayout tabLayout = this.f14345a.get();
            if (tabLayout == null || tabLayout.A() == i5 || i5 >= tabLayout.C()) {
                return;
            }
            int i6 = this.f14347c;
            tabLayout.b0(tabLayout.B(i5), i6 == 0 || (i6 == 2 && this.f14346b == 0));
        }
    }

    public final class n extends LinearLayout {

        /* renamed from: o, reason: collision with root package name */
        private i f14348o;

        /* renamed from: p, reason: collision with root package name */
        private TextView f14349p;

        /* renamed from: q, reason: collision with root package name */
        private ImageView f14350q;

        /* renamed from: r, reason: collision with root package name */
        @q0
        private View f14351r;

        /* renamed from: s, reason: collision with root package name */
        @q0
        private BadgeDrawable f14352s;

        /* renamed from: t, reason: collision with root package name */
        @q0
        private View f14353t;

        /* renamed from: u, reason: collision with root package name */
        @q0
        private TextView f14354u;

        /* renamed from: v, reason: collision with root package name */
        @q0
        private ImageView f14355v;

        /* renamed from: w, reason: collision with root package name */
        @q0
        private Drawable f14356w;

        /* renamed from: x, reason: collision with root package name */
        private int f14357x;

        class a implements View.OnLayoutChangeListener {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ View f14359o;

            a(View view) {
                this.f14359o = view;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
                if (this.f14359o.getVisibility() == 0) {
                    n.this.C(this.f14359o);
                }
            }
        }

        public n(@o0 Context context) {
            super(context);
            this.f14357x = 2;
            E(context);
            y1.d2(this, TabLayout.this.f14311r, TabLayout.this.f14312s, TabLayout.this.f14313t, TabLayout.this.f14314u);
            setGravity(17);
            setOrientation(!TabLayout.this.O ? 1 : 0);
            setClickable(true);
            y1.g2(this, s1.c(getContext(), s1.f5664e));
        }

        private void A() {
            if (t()) {
                k(true);
                View view = this.f14351r;
                if (view != null) {
                    com.google.android.material.badge.a.g(this.f14352s, view);
                    this.f14351r = null;
                }
            }
        }

        private void B() {
            i iVar;
            i iVar2;
            if (t()) {
                if (this.f14353t != null) {
                    A();
                    return;
                }
                if (this.f14350q != null && (iVar2 = this.f14348o) != null && iVar2.h() != null) {
                    View view = this.f14351r;
                    ImageView imageView = this.f14350q;
                    if (view == imageView) {
                        C(imageView);
                        return;
                    } else {
                        A();
                        z(this.f14350q);
                        return;
                    }
                }
                if (this.f14349p == null || (iVar = this.f14348o) == null || iVar.l() != 1) {
                    A();
                    return;
                }
                View view2 = this.f14351r;
                TextView textView = this.f14349p;
                if (view2 == textView) {
                    C(textView);
                } else {
                    A();
                    z(this.f14349p);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void C(@o0 View view) {
            if (t() && view == this.f14351r) {
                com.google.android.material.badge.a.j(this.f14352s, view, q(view));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0, types: [android.graphics.drawable.RippleDrawable] */
        public void E(Context context) {
            int i5 = TabLayout.this.E;
            if (i5 != 0) {
                Drawable d6 = androidx.appcompat.content.res.a.d(context, i5);
                this.f14356w = d6;
                if (d6 != null && d6.isStateful()) {
                    this.f14356w.setState(getDrawableState());
                }
            } else {
                this.f14356w = null;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(0);
            if (TabLayout.this.f14318y != null) {
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setCornerRadius(1.0E-5f);
                gradientDrawable2.setColor(-1);
                ColorStateList a6 = com.google.android.material.ripple.b.a(TabLayout.this.f14318y);
                boolean z5 = TabLayout.this.R;
                if (z5) {
                    gradientDrawable = null;
                }
                gradientDrawable = new RippleDrawable(a6, gradientDrawable, z5 ? null : gradientDrawable2);
            }
            y1.I1(this, gradientDrawable);
            TabLayout.this.invalidate();
        }

        private void G(@q0 TextView textView, @q0 ImageView imageView) {
            i iVar = this.f14348o;
            Drawable mutate = (iVar == null || iVar.h() == null) ? null : this.f14348o.h().mutate();
            i iVar2 = this.f14348o;
            CharSequence n5 = iVar2 != null ? iVar2.n() : null;
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
            boolean z5 = !TextUtils.isEmpty(n5);
            if (textView != null) {
                if (z5) {
                    textView.setText(n5);
                    if (this.f14348o.f14341g == 1) {
                        textView.setVisibility(0);
                    } else {
                        textView.setVisibility(8);
                    }
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText((CharSequence) null);
                }
            }
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int e6 = (z5 && imageView.getVisibility() == 0) ? (int) v.e(getContext(), 8) : 0;
                if (TabLayout.this.O) {
                    if (e6 != i0.b(marginLayoutParams)) {
                        i0.g(marginLayoutParams, e6);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (e6 != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = e6;
                    i0.g(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            i iVar3 = this.f14348o;
            CharSequence charSequence = iVar3 != null ? iVar3.f14338d : null;
            if (!z5) {
                n5 = charSequence;
            }
            androidx.appcompat.widget.c1.a(this, n5);
        }

        static BadgeDrawable h(n nVar) {
            return nVar.f14352s;
        }

        private void i(@q0 View view) {
            if (view == null) {
                return;
            }
            view.addOnLayoutChangeListener(new a(view));
        }

        private float j(@o0 Layout layout, int i5, float f6) {
            return (f6 / layout.getPaint().getTextSize()) * layout.getLineWidth(i5);
        }

        private void k(boolean z5) {
            setClipChildren(z5);
            setClipToPadding(z5);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(z5);
                viewGroup.setClipToPadding(z5);
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
            Drawable drawable = this.f14356w;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.f14356w.draw(canvas);
            }
        }

        @q0
        private BadgeDrawable n() {
            return this.f14352s;
        }

        @q0
        private FrameLayout q(@o0 View view) {
            if ((view == this.f14350q || view == this.f14349p) && com.google.android.material.badge.a.f12931a) {
                return (FrameLayout) view.getParent();
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @o0
        public BadgeDrawable r() {
            if (this.f14352s == null) {
                this.f14352s = BadgeDrawable.d(getContext());
            }
            B();
            BadgeDrawable badgeDrawable = this.f14352s;
            if (badgeDrawable != null) {
                return badgeDrawable;
            }
            throw new IllegalStateException(ProtectedSandApp.s("ቶ"));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean t() {
            return this.f14352s != null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void u() {
            FrameLayout frameLayout;
            if (com.google.android.material.badge.a.f12931a) {
                frameLayout = l();
                addView(frameLayout, 0);
            } else {
                frameLayout = this;
            }
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(a.k.H, (ViewGroup) frameLayout, false);
            this.f14350q = imageView;
            frameLayout.addView(imageView, 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void v() {
            FrameLayout frameLayout;
            if (com.google.android.material.badge.a.f12931a) {
                frameLayout = l();
                addView(frameLayout);
            } else {
                frameLayout = this;
            }
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(a.k.I, (ViewGroup) frameLayout, false);
            this.f14349p = textView;
            frameLayout.addView(textView);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void w() {
            if (this.f14351r != null) {
                A();
            }
            this.f14352s = null;
        }

        private void z(@q0 View view) {
            if (t() && view != null) {
                k(false);
                com.google.android.material.badge.a.b(this.f14352s, view, q(view));
                this.f14351r = view;
            }
        }

        final void D() {
            i iVar = this.f14348o;
            Drawable drawable = null;
            View g5 = iVar != null ? iVar.g() : null;
            if (g5 != null) {
                ViewParent parent = g5.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(g5);
                    }
                    addView(g5);
                }
                this.f14353t = g5;
                TextView textView = this.f14349p;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f14350q;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f14350q.setImageDrawable(null);
                }
                TextView textView2 = (TextView) g5.findViewById(R.id.text1);
                this.f14354u = textView2;
                if (textView2 != null) {
                    this.f14357x = s.k(textView2);
                }
                this.f14355v = (ImageView) g5.findViewById(R.id.icon);
            } else {
                View view = this.f14353t;
                if (view != null) {
                    removeView(view);
                    this.f14353t = null;
                }
                this.f14354u = null;
                this.f14355v = null;
            }
            if (this.f14353t == null) {
                if (this.f14350q == null) {
                    u();
                }
                if (iVar != null && iVar.h() != null) {
                    drawable = iVar.h().mutate();
                }
                if (drawable != null) {
                    androidx.core.graphics.drawable.d.o(drawable, TabLayout.this.f14317x);
                    PorterDuff.Mode mode = TabLayout.this.B;
                    if (mode != null) {
                        androidx.core.graphics.drawable.d.p(drawable, mode);
                    }
                }
                if (this.f14349p == null) {
                    v();
                    this.f14357x = s.k(this.f14349p);
                }
                this.f14349p.setTextAppearance(TabLayout.this.f14315v);
                ColorStateList colorStateList = TabLayout.this.f14316w;
                if (colorStateList != null) {
                    this.f14349p.setTextColor(colorStateList);
                }
                G(this.f14349p, this.f14350q);
                B();
                i(this.f14350q);
                i(this.f14349p);
            } else {
                TextView textView3 = this.f14354u;
                if (textView3 != null || this.f14355v != null) {
                    G(textView3, this.f14355v);
                }
            }
            if (iVar != null && !TextUtils.isEmpty(iVar.f14338d)) {
                setContentDescription(iVar.f14338d);
            }
            setSelected(iVar != null && iVar.o());
        }

        final void F() {
            setOrientation(!TabLayout.this.O ? 1 : 0);
            TextView textView = this.f14354u;
            if (textView == null && this.f14355v == null) {
                G(this.f14349p, this.f14350q);
            } else {
                G(textView, this.f14355v);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f14356w;
            boolean z5 = false;
            if (drawable != null && drawable.isStateful()) {
                z5 = false | this.f14356w.setState(drawableState);
            }
            if (z5) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        int o() {
            View[] viewArr = {this.f14349p, this.f14350q, this.f14353t};
            int i5 = 0;
            int i6 = 0;
            boolean z5 = false;
            for (int i7 = 0; i7 < 3; i7++) {
                View view = viewArr[i7];
                if (view != null && view.getVisibility() == 0) {
                    i6 = z5 ? Math.min(i6, view.getTop()) : view.getTop();
                    i5 = z5 ? Math.max(i5, view.getBottom()) : view.getBottom();
                    z5 = true;
                }
            }
            return i5 - i6;
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(@o0 AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            BadgeDrawable badgeDrawable = this.f14352s;
            if (badgeDrawable != null && badgeDrawable.isVisible()) {
                accessibilityNodeInfo.setContentDescription(((Object) getContentDescription()) + ProtectedSandApp.s("ቷ") + ((Object) this.f14352s.o()));
            }
            g0 X1 = g0.X1(accessibilityNodeInfo);
            X1.Z0(g0.c.h(0, 1, this.f14348o.k(), 1, false, isSelected()));
            if (isSelected()) {
                X1.X0(false);
                X1.K0(g0.a.f5377j);
            }
            X1.D1(getResources().getString(a.m.P));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i5, int i6) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i5);
            int mode = View.MeasureSpec.getMode(i5);
            int H = TabLayout.this.H();
            if (H > 0 && (mode == 0 || size > H)) {
                i5 = View.MeasureSpec.makeMeasureSpec(TabLayout.this.F, Integer.MIN_VALUE);
            }
            super.onMeasure(i5, i6);
            if (this.f14349p != null) {
                float f6 = TabLayout.this.C;
                int i7 = this.f14357x;
                ImageView imageView = this.f14350q;
                boolean z5 = true;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f14349p;
                    if (textView != null && textView.getLineCount() > 1) {
                        f6 = TabLayout.this.D;
                    }
                } else {
                    i7 = 1;
                }
                float textSize = this.f14349p.getTextSize();
                int lineCount = this.f14349p.getLineCount();
                int k5 = s.k(this.f14349p);
                if (f6 != textSize || (k5 >= 0 && i7 != k5)) {
                    if (TabLayout.this.N == 1 && f6 > textSize && lineCount == 1 && ((layout = this.f14349p.getLayout()) == null || j(layout, 0, f6) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                        z5 = false;
                    }
                    if (z5) {
                        this.f14349p.setTextSize(0, f6);
                        this.f14349p.setMaxLines(i7);
                        super.onMeasure(i5, i6);
                    }
                }
            }
        }

        int p() {
            View[] viewArr = {this.f14349p, this.f14350q, this.f14353t};
            int i5 = 0;
            int i6 = 0;
            boolean z5 = false;
            for (int i7 = 0; i7 < 3; i7++) {
                View view = viewArr[i7];
                if (view != null && view.getVisibility() == 0) {
                    i6 = z5 ? Math.min(i6, view.getLeft()) : view.getLeft();
                    i5 = z5 ? Math.max(i5, view.getRight()) : view.getRight();
                    z5 = true;
                }
            }
            return i5 - i6;
        }

        @Override // android.view.View
        public boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f14348o == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            this.f14348o.r();
            return true;
        }

        @q0
        public i s() {
            return this.f14348o;
        }

        @Override // android.view.View
        public void setSelected(boolean z5) {
            if (isSelected() != z5) {
            }
            super.setSelected(z5);
            TextView textView = this.f14349p;
            if (textView != null) {
                textView.setSelected(z5);
            }
            ImageView imageView = this.f14350q;
            if (imageView != null) {
                imageView.setSelected(z5);
            }
            View view = this.f14353t;
            if (view != null) {
                view.setSelected(z5);
            }
        }

        void x() {
            y(null);
            setSelected(false);
        }

        void y(@q0 i iVar) {
            if (iVar != this.f14348o) {
                this.f14348o = iVar;
                D();
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class o implements f {

        /* renamed from: a, reason: collision with root package name */
        private final ViewPager f14361a;

        public o(ViewPager viewPager) {
            this.f14361a = viewPager;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(i iVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(@o0 i iVar) {
            this.f14361a.Y(iVar.k());
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(i iVar) {
        }
    }

    public TabLayout(@o0 Context context) {
        this(context, null);
    }

    private void F0(@q0 ViewPager viewPager, boolean z5, boolean z6) {
        ViewPager viewPager2 = this.f14301a0;
        if (viewPager2 != null) {
            m mVar = this.f14304d0;
            if (mVar != null) {
                viewPager2.T(mVar);
            }
            b bVar = this.f14305e0;
            if (bVar != null) {
                this.f14301a0.S(bVar);
            }
        }
        c cVar = this.V;
        if (cVar != null) {
            V(cVar);
            this.V = null;
        }
        if (viewPager != null) {
            this.f14301a0 = viewPager;
            if (this.f14304d0 == null) {
                this.f14304d0 = new m(this);
            }
            this.f14304d0.b();
            viewPager.c(this.f14304d0);
            o oVar = new o(viewPager);
            this.V = oVar;
            c(oVar);
            androidx.viewpager.widget.a u5 = viewPager.u();
            if (u5 != null) {
                g0(u5, z5);
            }
            if (this.f14305e0 == null) {
                this.f14305e0 = new b();
            }
            this.f14305e0.a(z5);
            viewPager.b(this.f14305e0);
            i0(viewPager.x(), 0.0f, true);
        } else {
            this.f14301a0 = null;
            g0(null, false);
        }
        this.f14306f0 = z6;
    }

    private void G0() {
        int size = this.f14308o.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.f14308o.get(i5).E();
        }
    }

    private void H0(@o0 LinearLayout.LayoutParams layoutParams) {
        if (this.N == 1 && this.K == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
    }

    private int I() {
        int i5 = this.G;
        if (i5 != -1) {
            return i5;
        }
        int i6 = this.N;
        if (i6 == 0 || i6 == 2) {
            return this.I;
        }
        return 0;
    }

    private int L() {
        return Math.max(0, ((this.f14310q.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void Z(int i5) {
        n nVar = (n) this.f14310q.getChildAt(i5);
        this.f14310q.removeViewAt(i5);
        if (nVar != null) {
            nVar.x();
            this.f14307g0.a(nVar);
        }
        requestLayout();
    }

    private void i(@o0 TabItem tabItem) {
        i R = R();
        CharSequence charSequence = tabItem.f14279o;
        if (charSequence != null) {
            R.D(charSequence);
        }
        Drawable drawable = tabItem.f14280p;
        if (drawable != null) {
            R.x(drawable);
        }
        int i5 = tabItem.f14281q;
        if (i5 != 0) {
            R.u(i5);
        }
        if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
            R.t(tabItem.getContentDescription());
        }
        e(R);
    }

    private void j(@o0 i iVar) {
        n nVar = iVar.f14343i;
        nVar.setSelected(false);
        nVar.setActivated(false);
        this.f14310q.addView(nVar, iVar.k(), s());
    }

    private void k(View view) {
        if (!(view instanceof TabItem)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ቹ"));
        }
        i((TabItem) view);
    }

    private void l(int i5) {
        if (i5 == -1) {
            return;
        }
        if (getWindowToken() == null || !y1.U0(this) || this.f14310q.c()) {
            i0(i5, 0.0f, true);
            return;
        }
        int scrollX = getScrollX();
        int o5 = o(i5, 0.0f);
        if (scrollX != o5) {
            y();
            this.W.setIntValues(scrollX, o5);
            this.W.start();
        }
        this.f14310q.b(i5, this.L);
    }

    private void m(int i5) {
        if (i5 != 0) {
            if (i5 == 1) {
                this.f14310q.setGravity(1);
                return;
            } else if (i5 != 2) {
                return;
            }
        }
        this.f14310q.setGravity(d0.f5464b);
    }

    private void n() {
        int i5 = this.N;
        y1.d2(this.f14310q, (i5 == 0 || i5 == 2) ? Math.max(0, this.J - this.f14311r) : 0, 0, 0, 0);
        int i6 = this.N;
        if (i6 == 0) {
            m(this.K);
        } else if (i6 == 1 || i6 == 2) {
            this.f14310q.setGravity(1);
        }
        I0(true);
    }

    private int o(int i5, float f6) {
        int i6 = this.N;
        if (i6 != 0 && i6 != 2) {
            return 0;
        }
        View childAt = this.f14310q.getChildAt(i5);
        int i7 = i5 + 1;
        View childAt2 = i7 < this.f14310q.getChildCount() ? this.f14310q.getChildAt(i7) : null;
        int width = childAt != null ? childAt.getWidth() : 0;
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i8 = (int) ((width + width2) * 0.5f * f6);
        return y1.Z(this) == 0 ? left + i8 : left - i8;
    }

    private void p0(int i5) {
        int childCount = this.f14310q.getChildCount();
        if (i5 < childCount) {
            int i6 = 0;
            while (i6 < childCount) {
                View childAt = this.f14310q.getChildAt(i6);
                boolean z5 = true;
                childAt.setSelected(i6 == i5);
                if (i6 != i5) {
                    z5 = false;
                }
                childAt.setActivated(z5);
                i6++;
            }
        }
    }

    private void q(@o0 i iVar, int i5) {
        iVar.z(i5);
        this.f14308o.add(i5, iVar);
        int size = this.f14308o.size();
        while (true) {
            i5++;
            if (i5 >= size) {
                return;
            } else {
                this.f14308o.get(i5).z(i5);
            }
        }
    }

    @o0
    private static ColorStateList r(int i5, int i6) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i6, i5});
    }

    @o0
    private LinearLayout.LayoutParams s() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        H0(layoutParams);
        return layoutParams;
    }

    @o0
    private n u(@o0 i iVar) {
        p.a<n> aVar = this.f14307g0;
        n b6 = aVar != null ? aVar.b() : null;
        if (b6 == null) {
            b6 = new n(getContext());
        }
        b6.y(iVar);
        b6.setFocusable(true);
        b6.setMinimumWidth(I());
        if (TextUtils.isEmpty(iVar.f14338d)) {
            b6.setContentDescription(iVar.f14337c);
        } else {
            b6.setContentDescription(iVar.f14338d);
        }
        return b6;
    }

    private void v(@o0 i iVar) {
        for (int size = this.U.size() - 1; size >= 0; size--) {
            this.U.get(size).a(iVar);
        }
    }

    private void w(@o0 i iVar) {
        for (int size = this.U.size() - 1; size >= 0; size--) {
            this.U.get(size).b(iVar);
        }
    }

    private void x(@o0 i iVar) {
        for (int size = this.U.size() - 1; size >= 0; size--) {
            this.U.get(size).c(iVar);
        }
    }

    private void y() {
        if (this.W == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.W = valueAnimator;
            valueAnimator.setInterpolator(com.google.android.material.animation.a.f12779b);
            this.W.setDuration(this.L);
            this.W.addUpdateListener(new a());
        }
    }

    @r(unit = 0)
    private int z() {
        int size = this.f14308o.size();
        boolean z5 = false;
        int i5 = 0;
        while (true) {
            if (i5 < size) {
                i iVar = this.f14308o.get(i5);
                if (iVar != null && iVar.h() != null && !TextUtils.isEmpty(iVar.n())) {
                    z5 = true;
                    break;
                }
                i5++;
            } else {
                break;
            }
        }
        return (!z5 || this.O) ? 48 : 72;
    }

    public int A() {
        i iVar = this.f14309p;
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
    public i B(int i5) {
        if (i5 < 0 || i5 >= C()) {
            return null;
        }
        return this.f14308o.get(i5);
    }

    public void B0(boolean z5) {
        if (this.R != z5) {
            this.R = z5;
            for (int i5 = 0; i5 < this.f14310q.getChildCount(); i5++) {
                View childAt = this.f14310q.getChildAt(i5);
                if (childAt instanceof n) {
                    ((n) childAt).E(getContext());
                }
            }
        }
    }

    public int C() {
        return this.f14308o.size();
    }

    public void C0(@androidx.annotation.h int i5) {
        B0(getResources().getBoolean(i5));
    }

    public int D() {
        return this.K;
    }

    public void D0(@q0 ViewPager viewPager) {
        E0(viewPager, true);
    }

    @q0
    public ColorStateList E() {
        return this.f14317x;
    }

    public void E0(@q0 ViewPager viewPager, boolean z5) {
        F0(viewPager, z5, false);
    }

    public int F() {
        return this.Q;
    }

    public int G() {
        return this.M;
    }

    int H() {
        return this.F;
    }

    void I0(boolean z5) {
        for (int i5 = 0; i5 < this.f14310q.getChildCount(); i5++) {
            View childAt = this.f14310q.getChildAt(i5);
            childAt.setMinimumWidth(I());
            H0((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z5) {
                childAt.requestLayout();
            }
        }
    }

    public int J() {
        return this.N;
    }

    @q0
    public ColorStateList K() {
        return this.f14318y;
    }

    @o0
    public Drawable M() {
        return this.f14319z;
    }

    @q0
    public ColorStateList N() {
        return this.f14316w;
    }

    public boolean O() {
        return this.R;
    }

    public boolean P() {
        return this.O;
    }

    public boolean Q() {
        return this.P;
    }

    @o0
    public i R() {
        i t5 = t();
        t5.f14342h = this;
        t5.f14343i = u(t5);
        if (t5.f14344j != -1) {
            t5.f14343i.setId(t5.f14344j);
        }
        return t5;
    }

    void S() {
        int x5;
        U();
        androidx.viewpager.widget.a aVar = this.f14302b0;
        if (aVar != null) {
            int h5 = aVar.h();
            for (int i5 = 0; i5 < h5; i5++) {
                h(R().D(this.f14302b0.j(i5)), false);
            }
            ViewPager viewPager = this.f14301a0;
            if (viewPager == null || h5 <= 0 || (x5 = viewPager.x()) == A() || x5 >= C()) {
                return;
            }
            a0(B(x5));
        }
    }

    protected boolean T(i iVar) {
        return f14290p0.a(iVar);
    }

    public void U() {
        for (int childCount = this.f14310q.getChildCount() - 1; childCount >= 0; childCount--) {
            Z(childCount);
        }
        Iterator<i> it = this.f14308o.iterator();
        while (it.hasNext()) {
            i next = it.next();
            it.remove();
            next.q();
            T(next);
        }
        this.f14309p = null;
    }

    @Deprecated
    public void V(@q0 c cVar) {
        this.U.remove(cVar);
    }

    public void W(@o0 f fVar) {
        V(fVar);
    }

    public void X(@o0 i iVar) {
        if (iVar.f14342h != this) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ቺ"));
        }
        Y(iVar.k());
    }

    public void Y(int i5) {
        i iVar = this.f14309p;
        int k5 = iVar != null ? iVar.k() : 0;
        Z(i5);
        i remove = this.f14308o.remove(i5);
        if (remove != null) {
            remove.q();
            T(remove);
        }
        int size = this.f14308o.size();
        for (int i6 = i5; i6 < size; i6++) {
            this.f14308o.get(i6).z(i6);
        }
        if (k5 == i5) {
            a0(this.f14308o.isEmpty() ? null : this.f14308o.get(Math.max(0, i5 - 1)));
        }
    }

    public void a0(@q0 i iVar) {
        b0(iVar, true);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        k(view);
    }

    public void b0(@q0 i iVar, boolean z5) {
        i iVar2 = this.f14309p;
        if (iVar2 == iVar) {
            if (iVar2 != null) {
                v(iVar);
                l(iVar.k());
                return;
            }
            return;
        }
        int k5 = iVar != null ? iVar.k() : -1;
        if (z5) {
            if ((iVar2 == null || iVar2.k() == -1) && k5 != -1) {
                i0(k5, 0.0f, true);
            } else {
                l(k5);
            }
            if (k5 != -1) {
                p0(k5);
            }
        }
        this.f14309p = iVar;
        if (iVar2 != null) {
            x(iVar2);
        }
        if (iVar != null) {
            w(iVar);
        }
    }

    @Deprecated
    public void c(@q0 c cVar) {
        if (this.U.contains(cVar)) {
            return;
        }
        this.U.add(cVar);
    }

    public void c0(boolean z5) {
        if (this.O != z5) {
            this.O = z5;
            for (int i5 = 0; i5 < this.f14310q.getChildCount(); i5++) {
                View childAt = this.f14310q.getChildAt(i5);
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

    public void d0(@androidx.annotation.h int i5) {
        c0(getResources().getBoolean(i5));
    }

    public void e(@o0 i iVar) {
        h(iVar, this.f14308o.isEmpty());
    }

    @Deprecated
    public void e0(@q0 c cVar) {
        c cVar2 = this.T;
        if (cVar2 != null) {
            V(cVar2);
        }
        this.T = cVar;
        if (cVar != null) {
            c(cVar);
        }
    }

    public void f(@o0 i iVar, int i5) {
        g(iVar, i5, this.f14308o.isEmpty());
    }

    @Deprecated
    public void f0(@q0 f fVar) {
        e0(fVar);
    }

    public void g(@o0 i iVar, int i5, boolean z5) {
        if (iVar.f14342h != this) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ቻ"));
        }
        q(iVar, i5);
        j(iVar);
        if (z5) {
            iVar.r();
        }
    }

    void g0(@q0 androidx.viewpager.widget.a aVar, boolean z5) {
        DataSetObserver dataSetObserver;
        androidx.viewpager.widget.a aVar2 = this.f14302b0;
        if (aVar2 != null && (dataSetObserver = this.f14303c0) != null) {
            aVar2.x(dataSetObserver);
        }
        this.f14302b0 = aVar;
        if (z5 && aVar != null) {
            if (this.f14303c0 == null) {
                this.f14303c0 = new g();
            }
            aVar.p(this.f14303c0);
        }
        S();
    }

    public void h(@o0 i iVar, boolean z5) {
        g(iVar, this.f14308o.size(), z5);
    }

    void h0(Animator.AnimatorListener animatorListener) {
        y();
        this.W.addListener(animatorListener);
    }

    public void i0(int i5, float f6, boolean z5) {
        j0(i5, f6, z5, true);
    }

    public void j0(int i5, float f6, boolean z5, boolean z6) {
        int round = Math.round(i5 + f6);
        if (round < 0 || round >= this.f14310q.getChildCount()) {
            return;
        }
        if (z6) {
            this.f14310q.f(i5, f6);
        }
        ValueAnimator valueAnimator = this.W;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.W.cancel();
        }
        scrollTo(o(i5, f6), 0);
        if (z5) {
            p0(round);
        }
    }

    public void k0(@androidx.annotation.v int i5) {
        if (i5 != 0) {
            l0(androidx.appcompat.content.res.a.d(getContext(), i5));
        } else {
            l0(null);
        }
    }

    public void l0(@q0 Drawable drawable) {
        if (this.f14319z != drawable) {
            if (drawable == null) {
                drawable = new GradientDrawable();
            }
            this.f14319z = drawable;
        }
    }

    public void m0(@androidx.annotation.l int i5) {
        this.A = i5;
    }

    public void n0(int i5) {
        if (this.M != i5) {
            this.M = i5;
            y1.n1(this.f14310q);
        }
    }

    @Deprecated
    public void o0(int i5) {
        this.f14310q.g(i5);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.google.android.material.shape.k.e(this);
        if (this.f14301a0 == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                F0((ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f14306f0) {
            D0(null);
            this.f14306f0 = false;
        }
    }

    @Override // android.view.View
    protected void onDraw(@o0 Canvas canvas) {
        for (int i5 = 0; i5 < this.f14310q.getChildCount(); i5++) {
            View childAt = this.f14310q.getChildAt(i5);
            if (childAt instanceof n) {
                ((n) childAt).m(canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@o0 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        g0.X1(accessibilityNodeInfo).Y0(g0.b.f(1, C(), false, 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0073, code lost:
    
        if (r0 != 2) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007e, code lost:
    
        if (r7.getMeasuredWidth() != getMeasuredWidth()) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0080, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008a, code lost:
    
        if (r7.getMeasuredWidth() < getMeasuredWidth()) goto L29;
     */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            int r1 = r6.z()
            float r0 = com.google.android.material.internal.v.e(r0, r1)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = 0
            r5 = 1
            if (r1 == r2) goto L2e
            if (r1 == 0) goto L1f
            goto L41
        L1f:
            int r8 = r6.getPaddingTop()
            int r8 = r8 + r0
            int r0 = r6.getPaddingBottom()
            int r0 = r0 + r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            goto L41
        L2e:
            int r1 = r6.getChildCount()
            if (r1 != r5) goto L41
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            if (r1 < r0) goto L41
            android.view.View r1 = r6.getChildAt(r4)
            r1.setMinimumHeight(r0)
        L41:
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            if (r1 == 0) goto L5f
            int r1 = r6.H
            if (r1 <= 0) goto L50
            goto L5d
        L50:
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r2 = 56
            float r1 = com.google.android.material.internal.v.e(r1, r2)
            float r0 = r0 - r1
            int r1 = (int) r0
        L5d:
            r6.F = r1
        L5f:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto Lad
            android.view.View r7 = r6.getChildAt(r4)
            int r0 = r6.N
            if (r0 == 0) goto L82
            if (r0 == r5) goto L76
            r1 = 2
            if (r0 == r1) goto L82
            goto L8d
        L76:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 == r1) goto L8d
        L80:
            r4 = r5
            goto L8d
        L82:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 >= r1) goto L8d
            goto L80
        L8d:
            if (r4 == 0) goto Lad
            int r0 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            int r1 = r1 + r0
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            int r0 = r0.height
            int r8 = android.view.ViewGroup.getChildMeasureSpec(r8, r1, r0)
            int r0 = r6.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            r7.measure(r0, r8)
        Lad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    public void p() {
        this.U.clear();
    }

    public void q0(int i5) {
        if (this.K != i5) {
            this.K = i5;
            n();
        }
    }

    public void r0(@q0 ColorStateList colorStateList) {
        if (this.f14317x != colorStateList) {
            this.f14317x = colorStateList;
            G0();
        }
    }

    public void s0(@androidx.annotation.n int i5) {
        r0(androidx.appcompat.content.res.a.c(getContext(), i5));
    }

    @Override // android.view.View
    @x0(21)
    public void setElevation(float f6) {
        super.setElevation(f6);
        com.google.android.material.shape.k.d(this, f6);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return L() > 0;
    }

    protected i t() {
        i b6 = f14290p0.b();
        return b6 == null ? new i() : b6;
    }

    public void t0(int i5) {
        this.Q = i5;
        if (i5 == 0) {
            this.S = new com.google.android.material.tabs.b();
        } else {
            if (i5 == 1) {
                this.S = new com.google.android.material.tabs.a();
                return;
            }
            throw new IllegalArgumentException(i5 + ProtectedSandApp.s("ቼ"));
        }
    }

    public void u0(boolean z5) {
        this.P = z5;
        y1.n1(this.f14310q);
    }

    public void v0(int i5) {
        if (i5 != this.N) {
            this.N = i5;
            n();
        }
    }

    public void w0(@q0 ColorStateList colorStateList) {
        if (this.f14318y != colorStateList) {
            this.f14318y = colorStateList;
            for (int i5 = 0; i5 < this.f14310q.getChildCount(); i5++) {
                View childAt = this.f14310q.getChildAt(i5);
                if (childAt instanceof n) {
                    ((n) childAt).E(getContext());
                }
            }
        }
    }

    public void x0(@androidx.annotation.n int i5) {
        w0(androidx.appcompat.content.res.a.c(getContext(), i5));
    }

    public void y0(int i5, int i6) {
        z0(r(i5, i6));
    }

    public void z0(@q0 ColorStateList colorStateList) {
        if (this.f14316w != colorStateList) {
            this.f14316w = colorStateList;
            G0();
        }
    }

    public TabLayout(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.Yd);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i5) {
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
    public TabLayout(@androidx.annotation.o0 android.content.Context r12, @androidx.annotation.q0 android.util.AttributeSet r13, int r14) {
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
    public void addView(View view, int i5, ViewGroup.LayoutParams layoutParams) {
        k(view);
    }
}
