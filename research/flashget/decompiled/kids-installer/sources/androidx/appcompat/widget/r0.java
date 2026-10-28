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
public class r0 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {
    private static final int B = 200;

    /* renamed from: o, reason: collision with root package name */
    Runnable f1302o;

    /* renamed from: p, reason: collision with root package name */
    private c f1303p;

    /* renamed from: q, reason: collision with root package name */
    LinearLayoutCompat f1304q;

    /* renamed from: r, reason: collision with root package name */
    private Spinner f1305r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f1306s;

    /* renamed from: t, reason: collision with root package name */
    int f1307t;

    /* renamed from: u, reason: collision with root package name */
    int f1308u;

    /* renamed from: v, reason: collision with root package name */
    private int f1309v;

    /* renamed from: w, reason: collision with root package name */
    private int f1310w;

    /* renamed from: x, reason: collision with root package name */
    protected ViewPropertyAnimator f1311x;

    /* renamed from: y, reason: collision with root package name */
    protected final e f1312y;

    /* renamed from: z, reason: collision with root package name */
    private static final String f1301z = "ScrollingTabContainerView";
    private static final Interpolator A = new DecelerateInterpolator();

    /* compiled from: ScrollingTabContainerView.java */
    class a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ View f1313o;

        a(View view) {
            this.f1313o = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            r0.this.smoothScrollTo(this.f1313o.getLeft() - ((r0.this.getWidth() - this.f1313o.getWidth()) / 2), 0);
            r0.this.f1302o = null;
        }
    }

    /* compiled from: ScrollingTabContainerView.java */
    private class b extends BaseAdapter {
        b() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return r0.this.f1304q.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i5) {
            return ((d) r0.this.f1304q.getChildAt(i5)).b();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i5) {
            return i5;
        }

        @Override // android.widget.Adapter
        public View getView(int i5, View view, ViewGroup viewGroup) {
            if (view == null) {
                return r0.this.g((ActionBar.e) getItem(i5), true);
            }
            ((d) view).a((ActionBar.e) getItem(i5));
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
            int childCount = r0.this.f1304q.getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = r0.this.f1304q.getChildAt(i5);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* compiled from: ScrollingTabContainerView.java */
    private class d extends LinearLayout {

        /* renamed from: u, reason: collision with root package name */
        private static final String f1317u = "androidx.appcompat.app.ActionBar$Tab";

        /* renamed from: o, reason: collision with root package name */
        private final int[] f1318o;

        /* renamed from: p, reason: collision with root package name */
        private ActionBar.e f1319p;

        /* renamed from: q, reason: collision with root package name */
        private TextView f1320q;

        /* renamed from: r, reason: collision with root package name */
        private ImageView f1321r;

        /* renamed from: s, reason: collision with root package name */
        private View f1322s;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public d(android.content.Context r6, androidx.appcompat.app.ActionBar.e r7, boolean r8) {
            /*
                r4 = this;
                androidx.appcompat.widget.r0.this = r5
                int r5 = d.a.c.f21571h
                r0 = 0
                r4.<init>(r6, r0, r5)
                r1 = 1
                int[] r1 = new int[r1]
                r2 = 16842964(0x10100d4, float:2.3694152E-38)
                r3 = 0
                r1[r3] = r2
                r4.f1318o = r1
                r4.f1319p = r7
                androidx.appcompat.widget.z0 r5 = androidx.appcompat.widget.z0.G(r6, r0, r1, r5, r3)
                boolean r6 = r5.C(r3)
                if (r6 == 0) goto L26
                android.graphics.drawable.Drawable r6 = r5.h(r3)
                r4.setBackgroundDrawable(r6)
            L26:
                r5.I()
                if (r8 == 0) goto L31
                r5 = 8388627(0x800013, float:1.175497E-38)
                r4.setGravity(r5)
            L31:
                r4.c()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.r0.d.<init>(androidx.appcompat.widget.r0, android.content.Context, androidx.appcompat.app.ActionBar$e, boolean):void");
        }

        public void a(ActionBar.e eVar) {
            this.f1319p = eVar;
            c();
        }

        public ActionBar.e b() {
            return this.f1319p;
        }

        public void c() {
            ActionBar.e eVar = this.f1319p;
            View b6 = eVar.b();
            if (b6 != null) {
                ViewParent parent = b6.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(b6);
                    }
                    addView(b6);
                }
                this.f1322s = b6;
                TextView textView = this.f1320q;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f1321r;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f1321r.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f1322s;
            if (view != null) {
                removeView(view);
                this.f1322s = null;
            }
            Drawable c6 = eVar.c();
            CharSequence f6 = eVar.f();
            if (c6 != null) {
                if (this.f1321r == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext(), null);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.f1321r = appCompatImageView;
                }
                this.f1321r.setImageDrawable(c6);
                this.f1321r.setVisibility(0);
            } else {
                ImageView imageView2 = this.f1321r;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f1321r.setImageDrawable(null);
                }
            }
            boolean z5 = !TextUtils.isEmpty(f6);
            if (z5) {
                if (this.f1320q == null) {
                    AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null, a.c.f21577i);
                    appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView.setLayoutParams(layoutParams2);
                    addView(appCompatTextView);
                    this.f1320q = appCompatTextView;
                }
                this.f1320q.setText(f6);
                this.f1320q.setVisibility(0);
            } else {
                TextView textView2 = this.f1320q;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f1320q.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f1321r;
            if (imageView3 != null) {
                imageView3.setContentDescription(eVar.a());
            }
            c1.a(this, z5 ? null : eVar.a());
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
        public void onMeasure(int i5, int i6) {
            super.onMeasure(i5, i6);
            if (r0.this.f1307t > 0) {
                int measuredWidth = getMeasuredWidth();
                int i7 = r0.this.f1307t;
                if (measuredWidth > i7) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i7, androidx.constraintlayout.solver.widgets.analyzer.b.f2366g), i6);
                }
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z5) {
            boolean z6 = isSelected() != z5;
            super.setSelected(z5);
            if (z6 && z5) {
                sendAccessibilityEvent(4);
            }
        }
    }

    /* compiled from: ScrollingTabContainerView.java */
    protected class e extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        private boolean f1324a = false;

        /* renamed from: b, reason: collision with root package name */
        private int f1325b;

        protected e() {
        }

        public e a(ViewPropertyAnimator viewPropertyAnimator, int i5) {
            this.f1325b = i5;
            r0.this.f1311x = viewPropertyAnimator;
            return this;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f1324a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f1324a) {
                return;
            }
            r0 r0Var = r0.this;
            r0Var.f1311x = null;
            r0Var.setVisibility(this.f1325b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            r0.this.setVisibility(0);
            this.f1324a = false;
        }
    }

    public r0(@androidx.annotation.o0 Context context) {
        super(context);
        this.f1312y = new e();
        setHorizontalScrollBarEnabled(false);
        androidx.appcompat.view.a b6 = androidx.appcompat.view.a.b(context);
        n(b6.f());
        this.f1308u = b6.e();
        LinearLayoutCompat f6 = f();
        this.f1304q = f6;
        addView(f6, new ViewGroup.LayoutParams(-2, -1));
    }

    private Spinner e() {
        AppCompatSpinner appCompatSpinner = new AppCompatSpinner(getContext(), null, a.c.f21601m);
        appCompatSpinner.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
        appCompatSpinner.setOnItemSelectedListener(this);
        return appCompatSpinner;
    }

    private LinearLayoutCompat f() {
        LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(getContext(), null, a.c.f21565g);
        linearLayoutCompat.U(true);
        linearLayoutCompat.S(17);
        linearLayoutCompat.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
        return linearLayoutCompat;
    }

    private boolean h() {
        Spinner spinner = this.f1305r;
        return spinner != null && spinner.getParent() == this;
    }

    private void i() {
        if (h()) {
            return;
        }
        if (this.f1305r == null) {
            this.f1305r = e();
        }
        removeView(this.f1304q);
        addView(this.f1305r, new ViewGroup.LayoutParams(-2, -1));
        if (this.f1305r.getAdapter() == null) {
            this.f1305r.setAdapter((SpinnerAdapter) new b());
        }
        Runnable runnable = this.f1302o;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f1302o = null;
        }
        this.f1305r.setSelection(this.f1310w);
    }

    private boolean j() {
        if (!h()) {
            return false;
        }
        removeView(this.f1305r);
        addView(this.f1304q, new ViewGroup.LayoutParams(-2, -1));
        o(this.f1305r.getSelectedItemPosition());
        return false;
    }

    public void a(ActionBar.e eVar, int i5, boolean z5) {
        d g5 = g(eVar, false);
        this.f1304q.addView(g5, i5, new LinearLayoutCompat.LayoutParams(0, -1, 1.0f));
        Spinner spinner = this.f1305r;
        if (spinner != null) {
            ((b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (z5) {
            g5.setSelected(true);
        }
        if (this.f1306s) {
            requestLayout();
        }
    }

    public void b(ActionBar.e eVar, boolean z5) {
        d g5 = g(eVar, false);
        this.f1304q.addView(g5, new LinearLayoutCompat.LayoutParams(0, -1, 1.0f));
        Spinner spinner = this.f1305r;
        if (spinner != null) {
            ((b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (z5) {
            g5.setSelected(true);
        }
        if (this.f1306s) {
            requestLayout();
        }
    }

    public void c(int i5) {
        View childAt = this.f1304q.getChildAt(i5);
        Runnable runnable = this.f1302o;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        a aVar = new a(childAt);
        this.f1302o = aVar;
        post(aVar);
    }

    public void d(int i5) {
        ViewPropertyAnimator viewPropertyAnimator = this.f1311x;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        if (i5 != 0) {
            ViewPropertyAnimator alpha = animate().alpha(0.0f);
            alpha.setDuration(200L);
            alpha.setInterpolator(A);
            alpha.setListener(this.f1312y.a(alpha, i5));
            alpha.start();
            return;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        ViewPropertyAnimator alpha2 = animate().alpha(1.0f);
        alpha2.setDuration(200L);
        alpha2.setInterpolator(A);
        alpha2.setListener(this.f1312y.a(alpha2, i5));
        alpha2.start();
    }

    d g(ActionBar.e eVar, boolean z5) {
        d dVar = new d(this, getContext(), eVar, z5);
        if (z5) {
            dVar.setBackgroundDrawable(null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.f1309v));
        } else {
            dVar.setFocusable(true);
            if (this.f1303p == null) {
                this.f1303p = new c();
            }
            dVar.setOnClickListener(this.f1303p);
        }
        return dVar;
    }

    public void k() {
        this.f1304q.removeAllViews();
        Spinner spinner = this.f1305r;
        if (spinner != null) {
            ((b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.f1306s) {
            requestLayout();
        }
    }

    public void l(int i5) {
        this.f1304q.removeViewAt(i5);
        Spinner spinner = this.f1305r;
        if (spinner != null) {
            ((b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.f1306s) {
            requestLayout();
        }
    }

    public void m(boolean z5) {
        this.f1306s = z5;
    }

    public void n(int i5) {
        this.f1309v = i5;
        requestLayout();
    }

    public void o(int i5) {
        this.f1310w = i5;
        int childCount = this.f1304q.getChildCount();
        int i6 = 0;
        while (i6 < childCount) {
            View childAt = this.f1304q.getChildAt(i6);
            boolean z5 = i6 == i5;
            childAt.setSelected(z5);
            if (z5) {
                c(i5);
            }
            i6++;
        }
        Spinner spinner = this.f1305r;
        if (spinner == null || i5 < 0) {
            return;
        }
        spinner.setSelection(i5);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f1302o;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        androidx.appcompat.view.a b6 = androidx.appcompat.view.a.b(getContext());
        n(b6.f());
        this.f1308u = b6.e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f1302o;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i5, long j5) {
        ((d) view).b().g();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i5, int i6) {
        int mode = View.MeasureSpec.getMode(i5);
        boolean z5 = mode == 1073741824;
        setFillViewport(z5);
        int childCount = this.f1304q.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f1307t = -1;
        } else {
            if (childCount > 2) {
                this.f1307t = (int) (View.MeasureSpec.getSize(i5) * 0.4f);
            } else {
                this.f1307t = View.MeasureSpec.getSize(i5) / 2;
            }
            this.f1307t = Math.min(this.f1307t, this.f1308u);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f1309v, androidx.constraintlayout.solver.widgets.analyzer.b.f2366g);
        if (!z5 && this.f1306s) {
            this.f1304q.measure(0, makeMeasureSpec);
            if (this.f1304q.getMeasuredWidth() > View.MeasureSpec.getSize(i5)) {
                i();
            } else {
                j();
            }
        } else {
            j();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i5, makeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (!z5 || measuredWidth == measuredWidth2) {
            return;
        }
        o(this.f1310w);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void p(int i5) {
        ((d) this.f1304q.getChildAt(i5)).c();
        Spinner spinner = this.f1305r;
        if (spinner != null) {
            ((b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.f1306s) {
            requestLayout();
        }
    }
}
