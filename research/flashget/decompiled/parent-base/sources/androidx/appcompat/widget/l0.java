package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.annotation.c1;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.LinearLayoutCompat;
import d.a;

/* compiled from: ScrollingTabContainerView.java */
@androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class l0 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: m, reason: collision with root package name */
    private static final String f1905m = "ScrollingTabContainerView";

    /* renamed from: n, reason: collision with root package name */
    private static final Interpolator f1906n = new DecelerateInterpolator();

    /* renamed from: o, reason: collision with root package name */
    private static final int f1907o = 200;

    /* renamed from: b, reason: collision with root package name */
    Runnable f1908b;

    /* renamed from: c, reason: collision with root package name */
    private c f1909c;

    /* renamed from: d, reason: collision with root package name */
    LinearLayoutCompat f1910d;

    /* renamed from: e, reason: collision with root package name */
    private Spinner f1911e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f1912f;

    /* renamed from: g, reason: collision with root package name */
    int f1913g;

    /* renamed from: h, reason: collision with root package name */
    int f1914h;

    /* renamed from: i, reason: collision with root package name */
    private int f1915i;

    /* renamed from: j, reason: collision with root package name */
    private int f1916j;

    /* renamed from: k, reason: collision with root package name */
    protected ViewPropertyAnimator f1917k;

    /* renamed from: l, reason: collision with root package name */
    protected final e f1918l;

    /* compiled from: ScrollingTabContainerView.java */
    class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f1919b;

        a(View view) {
            this.f1919b = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            l0.this.smoothScrollTo(this.f1919b.getLeft() - ((l0.this.getWidth() - this.f1919b.getWidth()) / 2), 0);
            l0.this.f1908b = null;
        }
    }

    /* compiled from: ScrollingTabContainerView.java */
    private class b extends BaseAdapter {
        b() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return l0.this.f1910d.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i4) {
            return ((d) l0.this.f1910d.getChildAt(i4)).b();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i4) {
            return i4;
        }

        @Override // android.widget.Adapter
        public View getView(int i4, View view, ViewGroup viewGroup) {
            if (view == null) {
                return l0.this.g((ActionBar.e) getItem(i4), true);
            }
            ((d) view).a((ActionBar.e) getItem(i4));
            return view;
        }
    }

    /* compiled from: ScrollingTabContainerView.java */
    private class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((d) view).b().g();
            int childCount = l0.this.f1910d.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = l0.this.f1910d.getChildAt(i4);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* compiled from: ScrollingTabContainerView.java */
    private class d extends LinearLayout {

        /* renamed from: h, reason: collision with root package name */
        private static final String f1923h = "androidx.appcompat.app.ActionBar$Tab";

        /* renamed from: b, reason: collision with root package name */
        private final int[] f1924b;

        /* renamed from: c, reason: collision with root package name */
        private ActionBar.e f1925c;

        /* renamed from: d, reason: collision with root package name */
        private TextView f1926d;

        /* renamed from: e, reason: collision with root package name */
        private ImageView f1927e;

        /* renamed from: f, reason: collision with root package name */
        private View f1928f;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public d(android.content.Context r4, androidx.appcompat.app.ActionBar.e r5, boolean r6) {
            /*
                r2 = this;
                androidx.appcompat.widget.l0.this = r3
                int r3 = d.a.b.f72983h
                r0 = 0
                r2.<init>(r4, r0, r3)
                r1 = 16842964(0x10100d4, float:2.3694152E-38)
                int[] r1 = new int[]{r1}
                r2.f1924b = r1
                r2.f1925c = r5
                r5 = 0
                androidx.appcompat.widget.t0 r3 = androidx.appcompat.widget.t0.G(r4, r0, r1, r3, r5)
                boolean r4 = r3.C(r5)
                if (r4 == 0) goto L25
                android.graphics.drawable.Drawable r4 = r3.h(r5)
                r2.setBackgroundDrawable(r4)
            L25:
                r3.I()
                if (r6 == 0) goto L30
                r3 = 8388627(0x800013, float:1.175497E-38)
                r2.setGravity(r3)
            L30:
                r2.c()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.l0.d.<init>(androidx.appcompat.widget.l0, android.content.Context, androidx.appcompat.app.ActionBar$e, boolean):void");
        }

        public void a(ActionBar.e eVar) {
            this.f1925c = eVar;
            c();
        }

        public ActionBar.e b() {
            return this.f1925c;
        }

        public void c() {
            ActionBar.e eVar = this.f1925c;
            View b5 = eVar.b();
            if (b5 != null) {
                ViewParent parent = b5.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(b5);
                    }
                    addView(b5);
                }
                this.f1928f = b5;
                TextView textView = this.f1926d;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f1927e;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f1927e.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f1928f;
            if (view != null) {
                removeView(view);
                this.f1928f = null;
            }
            Drawable c5 = eVar.c();
            CharSequence f4 = eVar.f();
            if (c5 != null) {
                if (this.f1927e == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.f1927e = appCompatImageView;
                }
                this.f1927e.setImageDrawable(c5);
                this.f1927e.setVisibility(0);
            } else {
                ImageView imageView2 = this.f1927e;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f1927e.setImageDrawable(null);
                }
            }
            boolean isEmpty = TextUtils.isEmpty(f4);
            if (isEmpty) {
                TextView textView2 = this.f1926d;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f1926d.setText((CharSequence) null);
                }
            } else {
                if (this.f1926d == null) {
                    AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null, a.b.f72988i);
                    appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView.setLayoutParams(layoutParams2);
                    addView(appCompatTextView);
                    this.f1926d = appCompatTextView;
                }
                this.f1926d.setText(f4);
                this.f1926d.setVisibility(0);
            }
            ImageView imageView3 = this.f1927e;
            if (imageView3 != null) {
                imageView3.setContentDescription(eVar.a());
            }
            y0.a(this, isEmpty ? eVar.a() : null);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i4, int i5) {
            super.onMeasure(i4, i5);
            if (l0.this.f1913g > 0) {
                int measuredWidth = getMeasuredWidth();
                int i6 = l0.this.f1913g;
                if (measuredWidth > i6) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i6, 1073741824), i5);
                }
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z4) {
            boolean z5 = isSelected() != z4;
            super.setSelected(z4);
            if (z5 && z4) {
                sendAccessibilityEvent(4);
            }
        }
    }

    /* compiled from: ScrollingTabContainerView.java */
    protected class e extends AnimatorListenerAdapter {

        /* renamed from: b, reason: collision with root package name */
        private boolean f1930b = false;

        /* renamed from: c, reason: collision with root package name */
        private int f1931c;

        protected e() {
        }

        public e a(ViewPropertyAnimator viewPropertyAnimator, int i4) {
            this.f1931c = i4;
            l0.this.f1917k = viewPropertyAnimator;
            return this;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f1930b = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f1930b) {
                return;
            }
            l0 l0Var = l0.this;
            l0Var.f1917k = null;
            l0Var.setVisibility(this.f1931c);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            l0.this.setVisibility(0);
            this.f1930b = false;
        }
    }

    public l0(@androidx.annotation.o0 Context context) {
        super(context);
        this.f1918l = new e();
        setHorizontalScrollBarEnabled(false);
        androidx.appcompat.view.a b5 = androidx.appcompat.view.a.b(context);
        n(b5.f());
        this.f1914h = b5.e();
        LinearLayoutCompat f4 = f();
        this.f1910d = f4;
        addView(f4, new ViewGroup.LayoutParams(-2, -1));
    }

    private Spinner e() {
        AppCompatSpinner appCompatSpinner = new AppCompatSpinner(getContext(), null, a.b.f73008m);
        appCompatSpinner.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
        appCompatSpinner.setOnItemSelectedListener(this);
        return appCompatSpinner;
    }

    private LinearLayoutCompat f() {
        LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(getContext(), null, a.b.f72978g);
        linearLayoutCompat.W(true);
        linearLayoutCompat.U(17);
        linearLayoutCompat.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
        return linearLayoutCompat;
    }

    private boolean h() {
        Spinner spinner = this.f1911e;
        return spinner != null && spinner.getParent() == this;
    }

    private void i() {
        if (h()) {
            return;
        }
        if (this.f1911e == null) {
            this.f1911e = e();
        }
        removeView(this.f1910d);
        addView(this.f1911e, new ViewGroup.LayoutParams(-2, -1));
        if (this.f1911e.getAdapter() == null) {
            this.f1911e.setAdapter((SpinnerAdapter) new b());
        }
        Runnable runnable = this.f1908b;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f1908b = null;
        }
        this.f1911e.setSelection(this.f1916j);
    }

    private boolean j() {
        if (!h()) {
            return false;
        }
        removeView(this.f1911e);
        addView(this.f1910d, new ViewGroup.LayoutParams(-2, -1));
        o(this.f1911e.getSelectedItemPosition());
        return false;
    }

    public void a(ActionBar.e eVar, int i4, boolean z4) {
        d g4 = g(eVar, false);
        this.f1910d.addView(g4, i4, new LinearLayoutCompat.LayoutParams(0, -1, 1.0f));
        Spinner spinner = this.f1911e;
        if (spinner != null) {
            ((b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (z4) {
            g4.setSelected(true);
        }
        if (this.f1912f) {
            requestLayout();
        }
    }

    public void b(ActionBar.e eVar, boolean z4) {
        d g4 = g(eVar, false);
        this.f1910d.addView(g4, new LinearLayoutCompat.LayoutParams(0, -1, 1.0f));
        Spinner spinner = this.f1911e;
        if (spinner != null) {
            ((b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (z4) {
            g4.setSelected(true);
        }
        if (this.f1912f) {
            requestLayout();
        }
    }

    public void c(int i4) {
        View childAt = this.f1910d.getChildAt(i4);
        Runnable runnable = this.f1908b;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        a aVar = new a(childAt);
        this.f1908b = aVar;
        post(aVar);
    }

    public void d(int i4) {
        ViewPropertyAnimator viewPropertyAnimator = this.f1917k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        if (i4 != 0) {
            ViewPropertyAnimator alpha = animate().alpha(0.0f);
            alpha.setDuration(200L);
            alpha.setInterpolator(f1906n);
            alpha.setListener(this.f1918l.a(alpha, i4));
            alpha.start();
            return;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        ViewPropertyAnimator alpha2 = animate().alpha(1.0f);
        alpha2.setDuration(200L);
        alpha2.setInterpolator(f1906n);
        alpha2.setListener(this.f1918l.a(alpha2, i4));
        alpha2.start();
    }

    d g(ActionBar.e eVar, boolean z4) {
        d dVar = new d(this, getContext(), eVar, z4);
        if (z4) {
            dVar.setBackgroundDrawable(null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.f1915i));
        } else {
            dVar.setFocusable(true);
            if (this.f1909c == null) {
                this.f1909c = new c();
            }
            dVar.setOnClickListener(this.f1909c);
        }
        return dVar;
    }

    public void k() {
        this.f1910d.removeAllViews();
        Spinner spinner = this.f1911e;
        if (spinner != null) {
            ((b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.f1912f) {
            requestLayout();
        }
    }

    public void l(int i4) {
        this.f1910d.removeViewAt(i4);
        Spinner spinner = this.f1911e;
        if (spinner != null) {
            ((b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.f1912f) {
            requestLayout();
        }
    }

    public void m(boolean z4) {
        this.f1912f = z4;
    }

    public void n(int i4) {
        this.f1915i = i4;
        requestLayout();
    }

    public void o(int i4) {
        this.f1916j = i4;
        int childCount = this.f1910d.getChildCount();
        int i5 = 0;
        while (i5 < childCount) {
            View childAt = this.f1910d.getChildAt(i5);
            boolean z4 = i5 == i4;
            childAt.setSelected(z4);
            if (z4) {
                c(i4);
            }
            i5++;
        }
        Spinner spinner = this.f1911e;
        if (spinner == null || i4 < 0) {
            return;
        }
        spinner.setSelection(i4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f1908b;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        androidx.appcompat.view.a b5 = androidx.appcompat.view.a.b(getContext());
        n(b5.f());
        this.f1914h = b5.e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f1908b;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i4, long j4) {
        ((d) view).b().g();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i4, int i5) {
        int mode = View.MeasureSpec.getMode(i4);
        boolean z4 = mode == 1073741824;
        setFillViewport(z4);
        int childCount = this.f1910d.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f1913g = -1;
        } else {
            if (childCount > 2) {
                this.f1913g = (int) (View.MeasureSpec.getSize(i4) * 0.4f);
            } else {
                this.f1913g = View.MeasureSpec.getSize(i4) / 2;
            }
            this.f1913g = Math.min(this.f1913g, this.f1914h);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f1915i, 1073741824);
        if (z4 || !this.f1912f) {
            j();
        } else {
            this.f1910d.measure(0, makeMeasureSpec);
            if (this.f1910d.getMeasuredWidth() > View.MeasureSpec.getSize(i4)) {
                i();
            } else {
                j();
            }
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i4, makeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (!z4 || measuredWidth == measuredWidth2) {
            return;
        }
        o(this.f1916j);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void p(int i4) {
        ((d) this.f1910d.getChildAt(i4)).c();
        Spinner spinner = this.f1911e;
        if (spinner != null) {
            ((b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.f1912f) {
            requestLayout();
        }
    }
}
