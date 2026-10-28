package androidx.swiperefreshlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.ListView;
import androidx.annotation.l;
import androidx.annotation.m1;
import androidx.annotation.n;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.u0;
import androidx.compose.animation.z0;
import androidx.core.view.b1;
import androidx.core.view.c1;
import androidx.core.view.x0;
import androidx.core.view.x1;
import androidx.core.view.y0;
import com.google.firebase.remoteconfig.p;

/* loaded from: classes3.dex */
public class SwipeRefreshLayout extends ViewGroup implements b1, x0 {
    private static final int M2 = 255;
    private static final int N2 = 76;
    private static final float O2 = 2.0f;
    public static final int P = 0;
    private static final int P2 = -1;
    public static final int Q = 1;

    @m1
    static final int Q1 = 40;
    private static final float Q2 = 0.5f;
    public static final int R = -1;
    private static final float R2 = 0.8f;
    private static final int S2 = 150;
    private static final int T2 = 300;
    private static final int U2 = 200;

    @m1
    static final int V1 = 56;
    private static final int V2 = 200;
    private static final int W2 = -328966;
    private static final int X2 = 64;
    int A;
    int B;
    androidx.swiperefreshlayout.widget.b C;
    private Animation D;
    private Animation E;
    private Animation F;
    private Animation G;
    private Animation H;
    boolean I;
    private int J;
    boolean K;
    private i L;
    private Animation.AnimationListener M;
    private final Animation N;
    private final Animation O;

    /* renamed from: b, reason: collision with root package name */
    private View f34120b;

    /* renamed from: c, reason: collision with root package name */
    j f34121c;

    /* renamed from: d, reason: collision with root package name */
    boolean f34122d;

    /* renamed from: e, reason: collision with root package name */
    private int f34123e;

    /* renamed from: f, reason: collision with root package name */
    private float f34124f;

    /* renamed from: g, reason: collision with root package name */
    private float f34125g;

    /* renamed from: h, reason: collision with root package name */
    private final c1 f34126h;

    /* renamed from: i, reason: collision with root package name */
    private final y0 f34127i;

    /* renamed from: j, reason: collision with root package name */
    private final int[] f34128j;

    /* renamed from: k, reason: collision with root package name */
    private final int[] f34129k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f34130l;

    /* renamed from: m, reason: collision with root package name */
    private int f34131m;

    /* renamed from: n, reason: collision with root package name */
    int f34132n;

    /* renamed from: o, reason: collision with root package name */
    private float f34133o;

    /* renamed from: p, reason: collision with root package name */
    private float f34134p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f34135q;

    /* renamed from: r, reason: collision with root package name */
    private int f34136r;

    /* renamed from: s, reason: collision with root package name */
    boolean f34137s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f34138t;

    /* renamed from: u, reason: collision with root package name */
    private final DecelerateInterpolator f34139u;

    /* renamed from: v, reason: collision with root package name */
    androidx.swiperefreshlayout.widget.a f34140v;

    /* renamed from: w, reason: collision with root package name */
    private int f34141w;

    /* renamed from: x, reason: collision with root package name */
    protected int f34142x;

    /* renamed from: y, reason: collision with root package name */
    float f34143y;

    /* renamed from: z, reason: collision with root package name */
    protected int f34144z;
    private static final String L2 = "SwipeRefreshLayout";
    private static final int[] Y2 = {R.attr.enabled};

    class a implements Animation.AnimationListener {
        a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            j jVar;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.f34122d) {
                swipeRefreshLayout.o();
                return;
            }
            swipeRefreshLayout.C.setAlpha(255);
            SwipeRefreshLayout.this.C.start();
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            if (swipeRefreshLayout2.I && (jVar = swipeRefreshLayout2.f34121c) != null) {
                jVar.a();
            }
            SwipeRefreshLayout swipeRefreshLayout3 = SwipeRefreshLayout.this;
            swipeRefreshLayout3.f34132n = swipeRefreshLayout3.f34140v.getTop();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    class b extends Animation {
        b() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f4, Transformation transformation) {
            SwipeRefreshLayout.this.p(f4);
        }
    }

    class c extends Animation {
        c() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f4, Transformation transformation) {
            SwipeRefreshLayout.this.p(1.0f - f4);
        }
    }

    class d extends Animation {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f34148b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f34149c;

        d(int i4, int i5) {
            this.f34148b = i4;
            this.f34149c = i5;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f4, Transformation transformation) {
            SwipeRefreshLayout.this.C.setAlpha((int) (((this.f34149c - r0) * f4) + this.f34148b));
        }
    }

    class e implements Animation.AnimationListener {
        e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (swipeRefreshLayout.f34137s) {
                return;
            }
            swipeRefreshLayout.O(null);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    class f extends Animation {
        f() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f4, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            int abs = !swipeRefreshLayout.K ? swipeRefreshLayout.A - Math.abs(swipeRefreshLayout.f34144z) : swipeRefreshLayout.A;
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            SwipeRefreshLayout.this.J((swipeRefreshLayout2.f34142x + ((int) ((abs - r1) * f4))) - swipeRefreshLayout2.f34140v.getTop());
            SwipeRefreshLayout.this.C.v(1.0f - f4);
        }
    }

    class g extends Animation {
        g() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f4, Transformation transformation) {
            SwipeRefreshLayout.this.m(f4);
        }
    }

    class h extends Animation {
        h() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f4, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            float f5 = swipeRefreshLayout.f34143y;
            swipeRefreshLayout.p(((-f5) * f4) + f5);
            SwipeRefreshLayout.this.m(f4);
        }
    }

    public interface i {
        boolean a(@o0 SwipeRefreshLayout swipeRefreshLayout, @q0 View view);
    }

    public interface j {
        void a();
    }

    public SwipeRefreshLayout(@o0 Context context) {
        this(context, null);
    }

    private void G(boolean z4, boolean z5) {
        if (this.f34122d != z4) {
            this.I = z5;
            e();
            this.f34122d = z4;
            if (z4) {
                a(this.f34132n, this.M);
            } else {
                O(this.M);
            }
        }
    }

    private Animation K(int i4, int i5) {
        d dVar = new d(i4, i5);
        dVar.setDuration(300L);
        this.f34140v.b(null);
        this.f34140v.clearAnimation();
        this.f34140v.startAnimation(dVar);
        return dVar;
    }

    private void L(float f4) {
        float f5 = this.f34134p;
        float f6 = f4 - f5;
        int i4 = this.f34123e;
        if (f6 <= i4 || this.f34135q) {
            return;
        }
        this.f34133o = f5 + i4;
        this.f34135q = true;
        this.C.setAlpha(76);
    }

    private void M() {
        this.G = K(this.C.getAlpha(), 255);
    }

    private void N() {
        this.F = K(this.C.getAlpha(), 76);
    }

    private void P(int i4, Animation.AnimationListener animationListener) {
        this.f34142x = i4;
        this.f34143y = this.f34140v.getScaleX();
        h hVar = new h();
        this.H = hVar;
        hVar.setDuration(150L);
        if (animationListener != null) {
            this.f34140v.b(animationListener);
        }
        this.f34140v.clearAnimation();
        this.f34140v.startAnimation(this.H);
    }

    private void Q(Animation.AnimationListener animationListener) {
        this.f34140v.setVisibility(0);
        this.C.setAlpha(255);
        b bVar = new b();
        this.D = bVar;
        bVar.setDuration(this.f34131m);
        if (animationListener != null) {
            this.f34140v.b(animationListener);
        }
        this.f34140v.clearAnimation();
        this.f34140v.startAnimation(this.D);
    }

    private void a(int i4, Animation.AnimationListener animationListener) {
        this.f34142x = i4;
        this.N.reset();
        this.N.setDuration(200L);
        this.N.setInterpolator(this.f34139u);
        if (animationListener != null) {
            this.f34140v.b(animationListener);
        }
        this.f34140v.clearAnimation();
        this.f34140v.startAnimation(this.N);
    }

    private void b(int i4, Animation.AnimationListener animationListener) {
        if (this.f34137s) {
            P(i4, animationListener);
            return;
        }
        this.f34142x = i4;
        this.O.reset();
        this.O.setDuration(200L);
        this.O.setInterpolator(this.f34139u);
        if (animationListener != null) {
            this.f34140v.b(animationListener);
        }
        this.f34140v.clearAnimation();
        this.f34140v.startAnimation(this.O);
    }

    private void d() {
        this.f34140v = new androidx.swiperefreshlayout.widget.a(getContext(), W2);
        androidx.swiperefreshlayout.widget.b bVar = new androidx.swiperefreshlayout.widget.b(getContext());
        this.C = bVar;
        bVar.F(1);
        this.f34140v.setImageDrawable(this.C);
        this.f34140v.setVisibility(8);
        addView(this.f34140v);
    }

    private void e() {
        if (this.f34120b == null) {
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                if (!childAt.equals(this.f34140v)) {
                    this.f34120b = childAt;
                    return;
                }
            }
        }
    }

    private void f(float f4) {
        if (f4 > this.f34124f) {
            G(true, true);
            return;
        }
        this.f34122d = false;
        this.C.C(0.0f, 0.0f);
        b(this.f34132n, !this.f34137s ? new e() : null);
        this.C.u(false);
    }

    private boolean j(Animation animation) {
        return (animation == null || !animation.hasStarted() || animation.hasEnded()) ? false : true;
    }

    private void l(float f4) {
        this.C.u(true);
        float min = Math.min(1.0f, Math.abs(f4 / this.f34124f));
        float max = (((float) Math.max(min - 0.4d, p.f60679p)) * 5.0f) / 3.0f;
        float abs = Math.abs(f4) - this.f34124f;
        int i4 = this.B;
        if (i4 <= 0) {
            i4 = this.K ? this.A - this.f34144z : this.A;
        }
        float f5 = i4;
        double max2 = Math.max(0.0f, Math.min(abs, f5 * 2.0f) / f5) / 4.0f;
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i5 = this.f34144z + ((int) ((f5 * min) + (f5 * pow * 2.0f)));
        if (this.f34140v.getVisibility() != 0) {
            this.f34140v.setVisibility(0);
        }
        if (!this.f34137s) {
            this.f34140v.setScaleX(1.0f);
            this.f34140v.setScaleY(1.0f);
        }
        if (this.f34137s) {
            p(Math.min(1.0f, f4 / this.f34124f));
        }
        if (f4 < this.f34124f) {
            if (this.C.getAlpha() > 76 && !j(this.F)) {
                N();
            }
        } else if (this.C.getAlpha() < 255 && !j(this.G)) {
            M();
        }
        this.C.C(0.0f, Math.min(R2, max * R2));
        this.C.v(Math.min(1.0f, max));
        this.C.z(z0.a(pow, 2.0f, (max * 0.4f) - 0.25f, 0.5f));
        J(i5 - this.f34132n);
    }

    private void n(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f34136r) {
            this.f34136r = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    private void t(int i4) {
        this.f34140v.getBackground().setAlpha(i4);
        this.C.setAlpha(i4);
    }

    @Deprecated
    public void A(int i4) {
        C(i4);
    }

    public void B(@l int i4) {
        this.f34140v.setBackgroundColor(i4);
    }

    public void C(@n int i4) {
        B(androidx.core.content.d.getColor(getContext(), i4));
    }

    public void D(boolean z4, int i4) {
        this.A = i4;
        this.f34137s = z4;
        this.f34140v.invalidate();
    }

    public void E(boolean z4, int i4, int i5) {
        this.f34137s = z4;
        this.f34144z = i4;
        this.A = i5;
        this.K = true;
        o();
        this.f34122d = false;
    }

    public void F(boolean z4) {
        if (!z4 || this.f34122d == z4) {
            G(z4, false);
            return;
        }
        this.f34122d = z4;
        J((!this.K ? this.A + this.f34144z : this.A) - this.f34132n);
        this.I = false;
        Q(this.M);
    }

    public void H(int i4) {
        if (i4 == 0 || i4 == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i4 == 0) {
                this.J = (int) (displayMetrics.density * 56.0f);
            } else {
                this.J = (int) (displayMetrics.density * 40.0f);
            }
            this.f34140v.setImageDrawable(null);
            this.C.F(i4);
            this.f34140v.setImageDrawable(this.C);
        }
    }

    public void I(@u0 int i4) {
        this.B = i4;
    }

    void J(int i4) {
        this.f34140v.bringToFront();
        x1.j1(this.f34140v, i4);
        this.f34132n = this.f34140v.getTop();
    }

    void O(Animation.AnimationListener animationListener) {
        c cVar = new c();
        this.E = cVar;
        cVar.setDuration(150L);
        this.f34140v.b(animationListener);
        this.f34140v.clearAnimation();
        this.f34140v.startAnimation(this.E);
    }

    public boolean c() {
        i iVar = this.L;
        if (iVar != null) {
            return iVar.a(this, this.f34120b);
        }
        View view = this.f34120b;
        return view instanceof ListView ? ((ListView) view).canScrollList(-1) : view.canScrollVertically(-1);
    }

    @Override // android.view.View, androidx.core.view.x0
    public boolean dispatchNestedFling(float f4, float f5, boolean z4) {
        return this.f34127i.a(f4, f5, z4);
    }

    @Override // android.view.View, androidx.core.view.x0
    public boolean dispatchNestedPreFling(float f4, float f5) {
        return this.f34127i.b(f4, f5);
    }

    @Override // android.view.View, androidx.core.view.x0
    public boolean dispatchNestedPreScroll(int i4, int i5, int[] iArr, int[] iArr2) {
        return this.f34127i.c(i4, i5, iArr, iArr2);
    }

    @Override // android.view.View, androidx.core.view.x0
    public boolean dispatchNestedScroll(int i4, int i5, int i6, int i7, int[] iArr) {
        return this.f34127i.f(i4, i5, i6, i7, iArr);
    }

    public int g() {
        return this.J;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i4, int i5) {
        int i6 = this.f34141w;
        return i6 < 0 ? i5 : i5 == i4 + (-1) ? i6 : i5 >= i6 ? i5 + 1 : i5;
    }

    @Override // android.view.ViewGroup, androidx.core.view.b1
    public int getNestedScrollAxes() {
        return this.f34126h.a();
    }

    public int h() {
        return this.A;
    }

    @Override // android.view.View, androidx.core.view.x0
    public boolean hasNestedScrollingParent() {
        return this.f34127i.k();
    }

    public int i() {
        return this.f34144z;
    }

    @Override // android.view.View, androidx.core.view.x0
    public boolean isNestedScrollingEnabled() {
        return this.f34127i.m();
    }

    public boolean k() {
        return this.f34122d;
    }

    void m(float f4) {
        J((this.f34142x + ((int) ((this.f34144z - r0) * f4))) - this.f34140v.getTop());
    }

    void o() {
        this.f34140v.clearAnimation();
        this.C.stop();
        this.f34140v.setVisibility(8);
        t(255);
        if (this.f34137s) {
            p(0.0f);
        } else {
            J(this.f34144z - this.f34132n);
        }
        this.f34132n = this.f34140v.getTop();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        o();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int findPointerIndex;
        e();
        int actionMasked = motionEvent.getActionMasked();
        if (this.f34138t && actionMasked == 0) {
            this.f34138t = false;
        }
        if (!isEnabled() || this.f34138t || c() || this.f34122d || this.f34130l) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i4 = this.f34136r;
                    if (i4 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i4)) < 0) {
                        return false;
                    }
                    L(motionEvent.getY(findPointerIndex));
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        n(motionEvent);
                    }
                }
            }
            this.f34135q = false;
            this.f34136r = -1;
        } else {
            J(this.f34144z - this.f34140v.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.f34136r = pointerId;
            this.f34135q = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.f34134p = motionEvent.getY(findPointerIndex2);
        }
        return this.f34135q;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f34120b == null) {
            e();
        }
        View view = this.f34120b;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.f34140v.getMeasuredWidth();
        int measuredHeight2 = this.f34140v.getMeasuredHeight();
        int i10 = measuredWidth / 2;
        int i11 = measuredWidth2 / 2;
        int i12 = this.f34132n;
        this.f34140v.layout(i10 - i11, i12, i10 + i11, measuredHeight2 + i12);
    }

    @Override // android.view.View
    public void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        if (this.f34120b == null) {
            e();
        }
        View view = this.f34120b;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.f34140v.measure(View.MeasureSpec.makeMeasureSpec(this.J, 1073741824), View.MeasureSpec.makeMeasureSpec(this.J, 1073741824));
        this.f34141w = -1;
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            if (getChildAt(i6) == this.f34140v) {
                this.f34141w = i6;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.b1
    public boolean onNestedFling(View view, float f4, float f5, boolean z4) {
        return dispatchNestedFling(f4, f5, z4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.b1
    public boolean onNestedPreFling(View view, float f4, float f5) {
        return dispatchNestedPreFling(f4, f5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.b1
    public void onNestedPreScroll(View view, int i4, int i5, int[] iArr) {
        if (i5 > 0) {
            float f4 = this.f34125g;
            if (f4 > 0.0f) {
                float f5 = i5;
                if (f5 > f4) {
                    iArr[1] = i5 - ((int) f4);
                    this.f34125g = 0.0f;
                } else {
                    this.f34125g = f4 - f5;
                    iArr[1] = i5;
                }
                l(this.f34125g);
            }
        }
        if (this.K && i5 > 0 && this.f34125g == 0.0f && Math.abs(i5 - iArr[1]) > 0) {
            this.f34140v.setVisibility(8);
        }
        int[] iArr2 = this.f34128j;
        if (dispatchNestedPreScroll(i4 - iArr[0], i5 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.b1
    public void onNestedScroll(View view, int i4, int i5, int i6, int i7) {
        dispatchNestedScroll(i4, i5, i6, i7, this.f34129k);
        if (i7 + this.f34129k[1] >= 0 || c()) {
            return;
        }
        float abs = this.f34125g + Math.abs(r11);
        this.f34125g = abs;
        l(abs);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.b1
    public void onNestedScrollAccepted(View view, View view2, int i4) {
        this.f34126h.b(view, view2, i4);
        startNestedScroll(i4 & 2);
        this.f34125g = 0.0f;
        this.f34130l = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.b1
    public boolean onStartNestedScroll(View view, View view2, int i4) {
        return (!isEnabled() || this.f34138t || this.f34122d || (i4 & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.b1
    public void onStopNestedScroll(View view) {
        this.f34126h.d(view);
        this.f34130l = false;
        float f4 = this.f34125g;
        if (f4 > 0.0f) {
            f(f4);
            this.f34125g = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f34138t && actionMasked == 0) {
            this.f34138t = false;
        }
        if (!isEnabled() || this.f34138t || c() || this.f34122d || this.f34130l) {
            return false;
        }
        if (actionMasked == 0) {
            this.f34136r = motionEvent.getPointerId(0);
            this.f34135q = false;
        } else {
            if (actionMasked == 1) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f34136r);
                if (findPointerIndex < 0) {
                    return false;
                }
                if (this.f34135q) {
                    float y4 = (motionEvent.getY(findPointerIndex) - this.f34133o) * 0.5f;
                    this.f34135q = false;
                    f(y4);
                }
                this.f34136r = -1;
                return false;
            }
            if (actionMasked == 2) {
                int findPointerIndex2 = motionEvent.findPointerIndex(this.f34136r);
                if (findPointerIndex2 < 0) {
                    return false;
                }
                float y5 = motionEvent.getY(findPointerIndex2);
                L(y5);
                if (this.f34135q) {
                    float f4 = (y5 - this.f34133o) * 0.5f;
                    if (f4 <= 0.0f) {
                        return false;
                    }
                    l(f4);
                }
            } else {
                if (actionMasked == 3) {
                    return false;
                }
                if (actionMasked == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (actionIndex < 0) {
                        return false;
                    }
                    this.f34136r = motionEvent.getPointerId(actionIndex);
                } else if (actionMasked == 6) {
                    n(motionEvent);
                }
            }
        }
        return true;
    }

    void p(float f4) {
        this.f34140v.setScaleX(f4);
        this.f34140v.setScaleY(f4);
    }

    @Deprecated
    public void q(@n int... iArr) {
        s(iArr);
    }

    public void r(@l int... iArr) {
        e();
        this.C.y(iArr);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z4) {
        View view = this.f34120b;
        if (view == null || x1.a1(view)) {
            super.requestDisallowInterceptTouchEvent(z4);
        }
    }

    public void s(@n int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i4 = 0; i4 < iArr.length; i4++) {
            iArr2[i4] = androidx.core.content.d.getColor(context, iArr[i4]);
        }
        r(iArr2);
    }

    @Override // android.view.View
    public void setEnabled(boolean z4) {
        super.setEnabled(z4);
        if (z4) {
            return;
        }
        o();
    }

    @Override // android.view.View, androidx.core.view.x0
    public void setNestedScrollingEnabled(boolean z4) {
        this.f34127i.p(z4);
    }

    @Override // android.view.View, androidx.core.view.x0
    public boolean startNestedScroll(int i4) {
        return this.f34127i.r(i4);
    }

    @Override // android.view.View, androidx.core.view.x0
    public void stopNestedScroll() {
        this.f34127i.t();
    }

    public void v(int i4) {
        this.f34124f = i4;
    }

    public void w(@q0 i iVar) {
        this.L = iVar;
    }

    public void z(@q0 j jVar) {
        this.f34121c = jVar;
    }

    public SwipeRefreshLayout(@o0 Context context, @q0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f34122d = false;
        this.f34124f = -1.0f;
        this.f34128j = new int[2];
        this.f34129k = new int[2];
        this.f34136r = -1;
        this.f34141w = -1;
        this.M = new a();
        this.N = new f();
        this.O = new g();
        this.f34123e = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f34131m = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.f34139u = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.J = (int) (displayMetrics.density * 40.0f);
        d();
        setChildrenDrawingOrderEnabled(true);
        int i4 = (int) (displayMetrics.density * 64.0f);
        this.A = i4;
        this.f34124f = i4;
        this.f34126h = new c1();
        this.f34127i = new y0(this);
        setNestedScrollingEnabled(true);
        int i5 = -this.J;
        this.f34132n = i5;
        this.f34144z = i5;
        m(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Y2);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }
}
