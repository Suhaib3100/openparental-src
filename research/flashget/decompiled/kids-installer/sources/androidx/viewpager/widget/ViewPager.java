package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.u0;
import androidx.annotation.v;
import androidx.core.view.accessibility.g0;
import androidx.core.view.o1;
import androidx.core.view.v4;
import androidx.core.view.y1;
import androidx.customview.view.AbsSavedState;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public class ViewPager extends ViewGroup {
    private static final int A0 = 600;
    private static final int B0 = 25;
    private static final int C0 = 16;
    private static final int D0 = 400;
    private static final int H0 = -1;
    private static final int I0 = 2;
    private static final int J0 = 0;
    private static final int K0 = 1;
    private static final int L0 = 2;
    public static final int N0 = 0;
    public static final int O0 = 1;
    public static final int P0 = 2;

    /* renamed from: x0, reason: collision with root package name */
    private static final boolean f10360x0 = false;

    /* renamed from: y0, reason: collision with root package name */
    private static final boolean f10361y0 = false;

    /* renamed from: z0, reason: collision with root package name */
    private static final int f10362z0 = 1;
    private int A;
    private Drawable B;
    private int C;
    private int D;
    private float E;
    private float F;
    private int G;
    private int H;
    private boolean I;
    private boolean J;
    private boolean K;
    private int L;
    private boolean M;
    private boolean N;
    private int O;
    private int P;
    private int Q;
    private float R;
    private float S;
    private float T;
    private float U;
    private int V;
    private VelocityTracker W;

    /* renamed from: a0, reason: collision with root package name */
    private int f10363a0;

    /* renamed from: b0, reason: collision with root package name */
    private int f10364b0;

    /* renamed from: c0, reason: collision with root package name */
    private int f10365c0;

    /* renamed from: d0, reason: collision with root package name */
    private int f10366d0;

    /* renamed from: e0, reason: collision with root package name */
    private boolean f10367e0;

    /* renamed from: f0, reason: collision with root package name */
    private long f10368f0;

    /* renamed from: g0, reason: collision with root package name */
    private EdgeEffect f10369g0;

    /* renamed from: h0, reason: collision with root package name */
    private EdgeEffect f10370h0;

    /* renamed from: i0, reason: collision with root package name */
    private boolean f10371i0;

    /* renamed from: j0, reason: collision with root package name */
    private boolean f10372j0;

    /* renamed from: k0, reason: collision with root package name */
    private boolean f10373k0;

    /* renamed from: l0, reason: collision with root package name */
    private int f10374l0;

    /* renamed from: m0, reason: collision with root package name */
    private List<i> f10375m0;

    /* renamed from: n0, reason: collision with root package name */
    private i f10376n0;

    /* renamed from: o, reason: collision with root package name */
    private int f10377o;

    /* renamed from: o0, reason: collision with root package name */
    private i f10378o0;

    /* renamed from: p, reason: collision with root package name */
    private final ArrayList<f> f10379p;

    /* renamed from: p0, reason: collision with root package name */
    private List<h> f10380p0;

    /* renamed from: q, reason: collision with root package name */
    private final f f10381q;

    /* renamed from: q0, reason: collision with root package name */
    private j f10382q0;

    /* renamed from: r, reason: collision with root package name */
    private final Rect f10383r;

    /* renamed from: r0, reason: collision with root package name */
    private int f10384r0;

    /* renamed from: s, reason: collision with root package name */
    androidx.viewpager.widget.a f10385s;

    /* renamed from: s0, reason: collision with root package name */
    private int f10386s0;

    /* renamed from: t, reason: collision with root package name */
    int f10387t;

    /* renamed from: t0, reason: collision with root package name */
    private ArrayList<View> f10388t0;

    /* renamed from: u, reason: collision with root package name */
    private int f10389u;

    /* renamed from: u0, reason: collision with root package name */
    private final Runnable f10390u0;

    /* renamed from: v, reason: collision with root package name */
    private Parcelable f10391v;

    /* renamed from: v0, reason: collision with root package name */
    private int f10392v0;

    /* renamed from: w, reason: collision with root package name */
    private ClassLoader f10393w;

    /* renamed from: x, reason: collision with root package name */
    private Scroller f10394x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f10395y;

    /* renamed from: z, reason: collision with root package name */
    private k f10396z;

    /* renamed from: w0, reason: collision with root package name */
    private static final String f10359w0 = "ViewPager";
    static final int[] E0 = {R.attr.layout_gravity};
    private static final Comparator<f> F0 = new a();
    private static final Interpolator G0 = new b();
    private static final m M0 = new m();

    /* loaded from: classes3.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: q, reason: collision with root package name */
        int f10403q;

        /* renamed from: r, reason: collision with root package name */
        Parcelable f10404r;

        /* renamed from: s, reason: collision with root package name */
        ClassLoader f10405s;

        /* loaded from: classes.dex */
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

        public SavedState(@o0 Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("FragmentPager.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" position=");
            return androidx.constraintlayout.solver.e.a(sb, this.f10403q, "}");
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i5) {
            super.writeToParcel(parcel, i5);
            parcel.writeInt(this.f10403q);
            parcel.writeParcelable(this.f10404r, i5);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f10403q = parcel.readInt();
            this.f10404r = parcel.readParcelable(classLoader);
            this.f10405s = classLoader;
        }
    }

    static class a implements Comparator<f> {
        a() {
        }

        public int a(f fVar, f fVar2) {
            return fVar.f10410b - fVar2.f10410b;
        }

        @Override // java.util.Comparator
        public int compare(f fVar, f fVar2) {
            return fVar.f10410b - fVar2.f10410b;
        }
    }

    static class b implements Interpolator {
        b() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f6) {
            float f7 = f6 - 1.0f;
            return (f7 * f7 * f7 * f7 * f7) + 1.0f;
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewPager.this.k0(0);
            ViewPager.this.O();
        }
    }

    /* loaded from: classes3.dex */
    class d implements o1 {

        /* renamed from: a, reason: collision with root package name */
        private final Rect f10407a = new Rect();

        d() {
        }

        @Override // androidx.core.view.o1
        public v4 a(View view, v4 v4Var) {
            v4 g12 = y1.g1(view, v4Var);
            if (g12.A()) {
                return g12;
            }
            Rect rect = this.f10407a;
            rect.left = g12.p();
            rect.top = g12.r();
            rect.right = g12.q();
            rect.bottom = g12.o();
            int childCount = ViewPager.this.getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                v4 p5 = y1.p(ViewPager.this.getChildAt(i5), g12);
                rect.left = Math.min(p5.p(), rect.left);
                rect.top = Math.min(p5.r(), rect.top);
                rect.right = Math.min(p5.q(), rect.right);
                rect.bottom = Math.min(p5.o(), rect.bottom);
            }
            return g12.D(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface e {
    }

    static class f {

        /* renamed from: a, reason: collision with root package name */
        Object f10409a;

        /* renamed from: b, reason: collision with root package name */
        int f10410b;

        /* renamed from: c, reason: collision with root package name */
        boolean f10411c;

        /* renamed from: d, reason: collision with root package name */
        float f10412d;

        /* renamed from: e, reason: collision with root package name */
        float f10413e;

        f() {
        }
    }

    /* loaded from: classes3.dex */
    class g extends androidx.core.view.a {
        g() {
        }

        private boolean n() {
            androidx.viewpager.widget.a aVar = ViewPager.this.f10385s;
            return aVar != null && aVar.h() > 1;
        }

        @Override // androidx.core.view.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            androidx.viewpager.widget.a aVar;
            super.f(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(n());
            if (accessibilityEvent.getEventType() != 4096 || (aVar = ViewPager.this.f10385s) == null) {
                return;
            }
            accessibilityEvent.setItemCount(aVar.h());
            accessibilityEvent.setFromIndex(ViewPager.this.f10387t);
            accessibilityEvent.setToIndex(ViewPager.this.f10387t);
        }

        @Override // androidx.core.view.a
        public void g(View view, g0 g0Var) {
            super.g(view, g0Var);
            g0Var.W0(ViewPager.class.getName());
            g0Var.F1(n());
            if (ViewPager.this.canScrollHorizontally(1)) {
                g0Var.a(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                g0Var.a(8192);
            }
        }

        @Override // androidx.core.view.a
        public boolean j(View view, int i5, Bundle bundle) {
            if (super.j(view, i5, bundle)) {
                return true;
            }
            if (i5 == 4096) {
                if (!ViewPager.this.canScrollHorizontally(1)) {
                    return false;
                }
                ViewPager viewPager = ViewPager.this;
                viewPager.Y(viewPager.f10387t + 1);
                return true;
            }
            if (i5 != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                return false;
            }
            ViewPager viewPager2 = ViewPager.this;
            viewPager2.Y(viewPager2.f10387t - 1);
            return true;
        }
    }

    public interface h {
        void b(@o0 ViewPager viewPager, @q0 androidx.viewpager.widget.a aVar, @q0 androidx.viewpager.widget.a aVar2);
    }

    public interface i {
        void a(int i5, float f6, @u0 int i6);

        void c(int i5);

        void d(int i5);
    }

    public interface j {
        void a(@o0 View view, float f6);
    }

    private class k extends DataSetObserver {
        k() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            ViewPager.this.j();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ViewPager.this.j();
        }
    }

    /* loaded from: classes3.dex */
    public static class l implements i {
        @Override // androidx.viewpager.widget.ViewPager.i
        public void a(int i5, float f6, int i6) {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void c(int i5) {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void d(int i5) {
        }
    }

    static class m implements Comparator<View> {
        m() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
            boolean z5 = layoutParams.f10397a;
            return z5 != layoutParams2.f10397a ? z5 ? 1 : -1 : layoutParams.f10401e - layoutParams2.f10401e;
        }
    }

    public ViewPager(@o0 Context context) {
        super(context);
        this.f10379p = new ArrayList<>();
        this.f10381q = new f();
        this.f10383r = new Rect();
        this.f10389u = -1;
        this.f10391v = null;
        this.f10393w = null;
        this.E = -3.4028235E38f;
        this.F = Float.MAX_VALUE;
        this.L = 1;
        this.V = -1;
        this.f10371i0 = true;
        this.f10372j0 = false;
        this.f10390u0 = new c();
        this.f10392v0 = 0;
        E();
    }

    private f C() {
        int i5;
        int w5 = w();
        float f6 = 0.0f;
        float scrollX = w5 > 0 ? getScrollX() / w5 : 0.0f;
        float f7 = w5 > 0 ? this.A / w5 : 0.0f;
        int i6 = 0;
        boolean z5 = true;
        f fVar = null;
        int i7 = -1;
        float f8 = 0.0f;
        while (i6 < this.f10379p.size()) {
            f fVar2 = this.f10379p.get(i6);
            if (!z5 && fVar2.f10410b != (i5 = i7 + 1)) {
                fVar2 = this.f10381q;
                fVar2.f10413e = f6 + f8 + f7;
                fVar2.f10410b = i5;
                fVar2.f10412d = this.f10385s.k(i5);
                i6--;
            }
            f fVar3 = fVar2;
            f6 = fVar3.f10413e;
            float f9 = fVar3.f10412d + f6 + f7;
            if (!z5 && scrollX < f6) {
                return fVar;
            }
            if (scrollX < f9 || i6 == this.f10379p.size() - 1) {
                return fVar3;
            }
            int i8 = fVar3.f10410b;
            float f10 = fVar3.f10412d;
            i6++;
            z5 = false;
            i7 = i8;
            f8 = f10;
            fVar = fVar3;
        }
        return fVar;
    }

    private static boolean F(@o0 View view) {
        return view.getClass().getAnnotation(e.class) != null;
    }

    private boolean H(float f6, float f7) {
        return (f6 < ((float) this.P) && f7 > 0.0f) || (f6 > ((float) (getWidth() - this.P)) && f7 < 0.0f);
    }

    private void J(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.V) {
            int i5 = actionIndex == 0 ? 1 : 0;
            this.R = motionEvent.getX(i5);
            this.V = motionEvent.getPointerId(i5);
            VelocityTracker velocityTracker = this.W;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private boolean M(int i5) {
        if (this.f10379p.size() == 0) {
            if (this.f10371i0) {
                return false;
            }
            this.f10373k0 = false;
            I(0, 0.0f, 0);
            if (this.f10373k0) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        f C = C();
        int w5 = w();
        int i6 = this.A;
        int i7 = w5 + i6;
        float f6 = w5;
        int i8 = C.f10410b;
        float f7 = ((i5 / f6) - C.f10413e) / (C.f10412d + (i6 / f6));
        this.f10373k0 = false;
        I(i8, f7, (int) (i7 * f7));
        if (this.f10373k0) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private boolean N(float f6) {
        boolean z5;
        boolean z6;
        float f7 = this.R - f6;
        this.R = f6;
        float scrollX = getScrollX() + f7;
        float w5 = w();
        float f8 = this.E * w5;
        float f9 = this.F * w5;
        boolean z7 = false;
        f fVar = this.f10379p.get(0);
        ArrayList<f> arrayList = this.f10379p;
        f fVar2 = arrayList.get(arrayList.size() - 1);
        if (fVar.f10410b != 0) {
            f8 = fVar.f10413e * w5;
            z5 = false;
        } else {
            z5 = true;
        }
        if (fVar2.f10410b != this.f10385s.h() - 1) {
            f9 = fVar2.f10413e * w5;
            z6 = false;
        } else {
            z6 = true;
        }
        if (scrollX < f8) {
            if (z5) {
                this.f10369g0.onPull(Math.abs(f8 - scrollX) / w5);
                z7 = true;
            }
            scrollX = f8;
        } else if (scrollX > f9) {
            if (z6) {
                this.f10370h0.onPull(Math.abs(scrollX - f9) / w5);
                z7 = true;
            }
            scrollX = f9;
        }
        int i5 = (int) scrollX;
        this.R = (scrollX - i5) + this.R;
        scrollTo(i5, getScrollY());
        M(i5);
        return z7;
    }

    private void Q(int i5, int i6, int i7, int i8) {
        if (i6 > 0 && !this.f10379p.isEmpty()) {
            if (!this.f10394x.isFinished()) {
                this.f10394x.setFinalX(x() * w());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i6 - getPaddingLeft()) - getPaddingRight()) + i8)) * (((i5 - getPaddingLeft()) - getPaddingRight()) + i7)), getScrollY());
                return;
            }
        }
        f D = D(this.f10387t);
        int min = (int) ((D != null ? Math.min(D.f10413e, this.F) : 0.0f) * ((i5 - getPaddingLeft()) - getPaddingRight()));
        if (min != getScrollX()) {
            i(false);
            scrollTo(min, getScrollY());
        }
    }

    private void R() {
        int i5 = 0;
        while (i5 < getChildCount()) {
            if (!((LayoutParams) getChildAt(i5).getLayoutParams()).f10397a) {
                removeViewAt(i5);
                i5--;
            }
            i5++;
        }
    }

    private void U(boolean z5) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z5);
        }
    }

    private boolean V() {
        this.V = -1;
        q();
        this.f10369g0.onRelease();
        this.f10370h0.onRelease();
        return this.f10369g0.isFinished() || this.f10370h0.isFinished();
    }

    private void W(int i5, boolean z5, int i6, boolean z6) {
        int i7;
        f D = D(i5);
        if (D != null) {
            i7 = (int) (Math.max(this.E, Math.min(D.f10413e, this.F)) * w());
        } else {
            i7 = 0;
        }
        if (z5) {
            n0(i7, 0, i6);
            if (z6) {
                m(i5);
                return;
            }
            return;
        }
        if (z6) {
            m(i5);
        }
        i(false);
        scrollTo(i7, 0);
        M(i7);
    }

    private void f(f fVar, int i5, f fVar2) {
        int i6;
        int i7;
        f fVar3;
        f fVar4;
        int h5 = this.f10385s.h();
        int w5 = w();
        float f6 = w5 > 0 ? this.A / w5 : 0.0f;
        if (fVar2 != null) {
            int i8 = fVar2.f10410b;
            int i9 = fVar.f10410b;
            if (i8 < i9) {
                float f7 = fVar2.f10413e + fVar2.f10412d + f6;
                int i10 = i8 + 1;
                int i11 = 0;
                while (i10 <= fVar.f10410b && i11 < this.f10379p.size()) {
                    f fVar5 = this.f10379p.get(i11);
                    while (true) {
                        fVar4 = fVar5;
                        if (i10 <= fVar4.f10410b || i11 >= this.f10379p.size() - 1) {
                            break;
                        }
                        i11++;
                        fVar5 = this.f10379p.get(i11);
                    }
                    while (i10 < fVar4.f10410b) {
                        f7 += this.f10385s.k(i10) + f6;
                        i10++;
                    }
                    fVar4.f10413e = f7;
                    f7 += fVar4.f10412d + f6;
                    i10++;
                }
            } else if (i8 > i9) {
                int size = this.f10379p.size() - 1;
                float f8 = fVar2.f10413e;
                while (true) {
                    i8--;
                    if (i8 < fVar.f10410b || size < 0) {
                        break;
                    }
                    f fVar6 = this.f10379p.get(size);
                    while (true) {
                        fVar3 = fVar6;
                        if (i8 >= fVar3.f10410b || size <= 0) {
                            break;
                        }
                        size--;
                        fVar6 = this.f10379p.get(size);
                    }
                    while (i8 > fVar3.f10410b) {
                        f8 -= this.f10385s.k(i8) + f6;
                        i8--;
                    }
                    f8 -= fVar3.f10412d + f6;
                    fVar3.f10413e = f8;
                }
            }
        }
        int size2 = this.f10379p.size();
        float f9 = fVar.f10413e;
        int i12 = fVar.f10410b;
        int i13 = i12 - 1;
        this.E = i12 == 0 ? f9 : -3.4028235E38f;
        int i14 = h5 - 1;
        this.F = i12 == i14 ? (fVar.f10412d + f9) - 1.0f : Float.MAX_VALUE;
        int i15 = i5 - 1;
        while (i15 >= 0) {
            f fVar7 = this.f10379p.get(i15);
            while (true) {
                i7 = fVar7.f10410b;
                if (i13 <= i7) {
                    break;
                }
                f9 -= this.f10385s.k(i13) + f6;
                i13--;
            }
            f9 -= fVar7.f10412d + f6;
            fVar7.f10413e = f9;
            if (i7 == 0) {
                this.E = f9;
            }
            i15--;
            i13--;
        }
        float f10 = fVar.f10413e + fVar.f10412d + f6;
        int i16 = fVar.f10410b + 1;
        int i17 = i5 + 1;
        while (i17 < size2) {
            f fVar8 = this.f10379p.get(i17);
            while (true) {
                i6 = fVar8.f10410b;
                if (i16 >= i6) {
                    break;
                }
                f10 += this.f10385s.k(i16) + f6;
                i16++;
            }
            if (i6 == i14) {
                this.F = (fVar8.f10412d + f10) - 1.0f;
            }
            fVar8.f10413e = f10;
            f10 += fVar8.f10412d + f6;
            i17++;
            i16++;
        }
        this.f10372j0 = false;
    }

    private void i(boolean z5) {
        boolean z6 = this.f10392v0 == 2;
        if (z6) {
            l0(false);
            if (!this.f10394x.isFinished()) {
                this.f10394x.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f10394x.getCurrX();
                int currY = this.f10394x.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        M(currX);
                    }
                }
            }
        }
        this.K = false;
        for (int i5 = 0; i5 < this.f10379p.size(); i5++) {
            f fVar = this.f10379p.get(i5);
            if (fVar.f10411c) {
                fVar.f10411c = false;
                z6 = true;
            }
        }
        if (z6) {
            if (z5) {
                y1.p1(this, this.f10390u0);
            } else {
                this.f10390u0.run();
            }
        }
    }

    private int k(int i5, float f6, int i6, int i7) {
        if (Math.abs(i7) <= this.f10365c0 || Math.abs(i6) <= this.f10363a0) {
            i5 += (int) (f6 + (i5 >= this.f10387t ? 0.4f : 0.6f));
        } else if (i6 <= 0) {
            i5++;
        }
        if (this.f10379p.size() <= 0) {
            return i5;
        }
        return Math.max(this.f10379p.get(0).f10410b, Math.min(i5, this.f10379p.get(r4.size() - 1).f10410b));
    }

    private void l(int i5, float f6, int i6) {
        i iVar = this.f10376n0;
        if (iVar != null) {
            iVar.a(i5, f6, i6);
        }
        List<i> list = this.f10375m0;
        if (list != null) {
            int size = list.size();
            for (int i7 = 0; i7 < size; i7++) {
                i iVar2 = this.f10375m0.get(i7);
                if (iVar2 != null) {
                    iVar2.a(i5, f6, i6);
                }
            }
        }
        i iVar3 = this.f10378o0;
        if (iVar3 != null) {
            iVar3.a(i5, f6, i6);
        }
    }

    private void l0(boolean z5) {
        if (this.J != z5) {
            this.J = z5;
        }
    }

    private void m(int i5) {
        i iVar = this.f10376n0;
        if (iVar != null) {
            iVar.d(i5);
        }
        List<i> list = this.f10375m0;
        if (list != null) {
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                i iVar2 = this.f10375m0.get(i6);
                if (iVar2 != null) {
                    iVar2.d(i5);
                }
            }
        }
        i iVar3 = this.f10378o0;
        if (iVar3 != null) {
            iVar3.d(i5);
        }
    }

    private void n(int i5) {
        i iVar = this.f10376n0;
        if (iVar != null) {
            iVar.c(i5);
        }
        List<i> list = this.f10375m0;
        if (list != null) {
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                i iVar2 = this.f10375m0.get(i6);
                if (iVar2 != null) {
                    iVar2.c(i5);
                }
            }
        }
        i iVar3 = this.f10378o0;
        if (iVar3 != null) {
            iVar3.c(i5);
        }
    }

    private void o0() {
        if (this.f10386s0 != 0) {
            ArrayList<View> arrayList = this.f10388t0;
            if (arrayList == null) {
                this.f10388t0 = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                this.f10388t0.add(getChildAt(i5));
            }
            Collections.sort(this.f10388t0, M0);
        }
    }

    private void p(boolean z5) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            getChildAt(i5).setLayerType(z5 ? this.f10384r0 : 0, null);
        }
    }

    private void q() {
        this.M = false;
        this.N = false;
        VelocityTracker velocityTracker = this.W;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.W = null;
        }
    }

    private Rect v(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    private int w() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    f A(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent == this) {
                return B(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    f B(View view) {
        for (int i5 = 0; i5 < this.f10379p.size(); i5++) {
            f fVar = this.f10379p.get(i5);
            if (this.f10385s.n(view, fVar.f10409a)) {
                return fVar;
            }
        }
        return null;
    }

    f D(int i5) {
        for (int i6 = 0; i6 < this.f10379p.size(); i6++) {
            f fVar = this.f10379p.get(i6);
            if (fVar.f10410b == i5) {
                return fVar;
            }
        }
        return null;
    }

    void E() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f10394x = new Scroller(context, G0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f6 = context.getResources().getDisplayMetrics().density;
        this.Q = viewConfiguration.getScaledPagingTouchSlop();
        this.f10363a0 = (int) (400.0f * f6);
        this.f10364b0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f10369g0 = new EdgeEffect(context);
        this.f10370h0 = new EdgeEffect(context);
        this.f10365c0 = (int) (25.0f * f6);
        this.f10366d0 = (int) (2.0f * f6);
        this.O = (int) (f6 * 16.0f);
        y1.B1(this, new g());
        if (y1.V(this) == 0) {
            y1.R1(this, 1);
        }
        y1.a2(this, new d());
    }

    public boolean G() {
        return this.f10367e0;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    @androidx.annotation.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void I(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.f10374l0
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L6b
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = r1
        L1b:
            if (r7 >= r6) goto L6b
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r9 = (androidx.viewpager.widget.ViewPager.LayoutParams) r9
            boolean r10 = r9.f10397a
            if (r10 != 0) goto L2c
            goto L68
        L2c:
            int r9 = r9.f10398b
            r9 = r9 & 7
            if (r9 == r2) goto L4d
            r10 = 3
            if (r9 == r10) goto L47
            r10 = 5
            if (r9 == r10) goto L3a
            r9 = r3
            goto L5c
        L3a:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
            goto L59
        L47:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L5c
        L4d:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
        L59:
            r11 = r9
            r9 = r3
            r3 = r11
        L5c:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L67
            r8.offsetLeftAndRight(r3)
        L67:
            r3 = r9
        L68:
            int r7 = r7 + 1
            goto L1b
        L6b:
            r12.l(r13, r14, r15)
            androidx.viewpager.widget.ViewPager$j r13 = r12.f10382q0
            if (r13 == 0) goto L9f
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L7a:
            if (r1 >= r14) goto L9f
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r0 = (androidx.viewpager.widget.ViewPager.LayoutParams) r0
            boolean r0 = r0.f10397a
            if (r0 == 0) goto L8b
            goto L9c
        L8b:
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.w()
            float r3 = (float) r3
            float r0 = r0 / r3
            androidx.viewpager.widget.ViewPager$j r3 = r12.f10382q0
            r3.a(r15, r0)
        L9c:
            int r1 = r1 + 1
            goto L7a
        L9f:
            r12.f10373k0 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.I(int, float, int):void");
    }

    boolean K() {
        int i5 = this.f10387t;
        if (i5 <= 0) {
            return false;
        }
        Z(i5 - 1, true);
        return true;
    }

    boolean L() {
        androidx.viewpager.widget.a aVar = this.f10385s;
        if (aVar == null || this.f10387t >= aVar.h() - 1) {
            return false;
        }
        Z(this.f10387t + 1, true);
        return true;
    }

    void O() {
        P(this.f10387t);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
    
        if (r9 == r10) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
    
        r8 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void P(int r18) {
        /*
            Method dump skipped, instructions count: 611
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.P(int):void");
    }

    public void S(@o0 h hVar) {
        List<h> list = this.f10380p0;
        if (list != null) {
            list.remove(hVar);
        }
    }

    public void T(@o0 i iVar) {
        List<i> list = this.f10375m0;
        if (list != null) {
            list.remove(iVar);
        }
    }

    public void X(@q0 androidx.viewpager.widget.a aVar) {
        androidx.viewpager.widget.a aVar2 = this.f10385s;
        if (aVar2 != null) {
            aVar2.u(null);
            this.f10385s.w(this);
            for (int i5 = 0; i5 < this.f10379p.size(); i5++) {
                f fVar = this.f10379p.get(i5);
                this.f10385s.e(this, fVar.f10410b, fVar.f10409a);
            }
            this.f10385s.g(this);
            this.f10379p.clear();
            R();
            this.f10387t = 0;
            scrollTo(0, 0);
        }
        androidx.viewpager.widget.a aVar3 = this.f10385s;
        this.f10385s = aVar;
        this.f10377o = 0;
        if (aVar != null) {
            if (this.f10396z == null) {
                this.f10396z = new k();
            }
            this.f10385s.u(this.f10396z);
            this.K = false;
            boolean z5 = this.f10371i0;
            this.f10371i0 = true;
            this.f10377o = this.f10385s.h();
            if (this.f10389u >= 0) {
                this.f10385s.q(this.f10391v, this.f10393w);
                a0(this.f10389u, false, true);
                this.f10389u = -1;
                this.f10391v = null;
                this.f10393w = null;
            } else if (z5) {
                requestLayout();
            } else {
                O();
            }
        }
        List<h> list = this.f10380p0;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.f10380p0.size();
        for (int i6 = 0; i6 < size; i6++) {
            this.f10380p0.get(i6).b(this, aVar3, aVar);
        }
    }

    public void Y(int i5) {
        this.K = false;
        a0(i5, !this.f10371i0, false);
    }

    public void Z(int i5, boolean z5) {
        this.K = false;
        a0(i5, z5, false);
    }

    f a(int i5, int i6) {
        f fVar = new f();
        fVar.f10410b = i5;
        fVar.f10409a = this.f10385s.m(this, i5);
        fVar.f10412d = this.f10385s.k(i5);
        if (i6 < 0 || i6 >= this.f10379p.size()) {
            this.f10379p.add(fVar);
        } else {
            this.f10379p.add(i6, fVar);
        }
        return fVar;
    }

    void a0(int i5, boolean z5, boolean z6) {
        b0(i5, z5, z6, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i5, int i6) {
        f B;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i7 = 0; i7 < getChildCount(); i7++) {
                View childAt = getChildAt(i7);
                if (childAt.getVisibility() == 0 && (B = B(childAt)) != null && B.f10410b == this.f10387t) {
                    childAt.addFocusables(arrayList, i5, i6);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i6 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        f B;
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() == 0 && (B = B(childAt)) != null && B.f10410b == this.f10387t) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i5, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        boolean F = layoutParams2.f10397a | F(view);
        layoutParams2.f10397a = F;
        if (!this.I) {
            super.addView(view, i5, layoutParams);
        } else {
            if (F) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            layoutParams2.f10400d = true;
            addViewInLayout(view, i5, layoutParams);
        }
    }

    public void b(@o0 h hVar) {
        if (this.f10380p0 == null) {
            this.f10380p0 = new ArrayList();
        }
        this.f10380p0.add(hVar);
    }

    void b0(int i5, boolean z5, boolean z6, int i6) {
        androidx.viewpager.widget.a aVar = this.f10385s;
        if (aVar == null || aVar.h() <= 0) {
            l0(false);
            return;
        }
        if (!z6 && this.f10387t == i5 && this.f10379p.size() != 0) {
            l0(false);
            return;
        }
        if (i5 < 0) {
            i5 = 0;
        } else if (i5 >= this.f10385s.h()) {
            i5 = this.f10385s.h() - 1;
        }
        int i7 = this.L;
        int i8 = this.f10387t;
        if (i5 > i8 + i7 || i5 < i8 - i7) {
            for (int i9 = 0; i9 < this.f10379p.size(); i9++) {
                this.f10379p.get(i9).f10411c = true;
            }
        }
        boolean z7 = this.f10387t != i5;
        if (!this.f10371i0) {
            P(i5);
            W(i5, z5, i6, z7);
        } else {
            this.f10387t = i5;
            if (z7) {
                m(i5);
            }
            requestLayout();
        }
    }

    public void c(@o0 i iVar) {
        if (this.f10375m0 == null) {
            this.f10375m0 = new ArrayList();
        }
        this.f10375m0.add(iVar);
    }

    i c0(i iVar) {
        i iVar2 = this.f10378o0;
        this.f10378o0 = iVar;
        return iVar2;
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i5) {
        if (this.f10385s == null) {
            return false;
        }
        int w5 = w();
        int scrollX = getScrollX();
        return i5 < 0 ? scrollX > ((int) (((float) w5) * this.E)) : i5 > 0 && scrollX < ((int) (((float) w5) * this.F));
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f10395y = true;
        if (this.f10394x.isFinished() || !this.f10394x.computeScrollOffset()) {
            i(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f10394x.getCurrX();
        int currY = this.f10394x.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!M(currX)) {
                this.f10394x.abortAnimation();
                scrollTo(0, currY);
            }
        }
        y1.n1(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean d(int r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.findFocus()
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != r6) goto Lb
        L9:
            r0 = r3
            goto L41
        Lb:
            if (r0 == 0) goto L41
            android.view.ViewParent r4 = r0.getParent()
        L11:
            boolean r5 = r4 instanceof android.view.ViewGroup
            if (r5 == 0) goto L1e
            if (r4 != r6) goto L19
            r4 = r1
            goto L1f
        L19:
            android.view.ViewParent r4 = r4.getParent()
            goto L11
        L1e:
            r4 = r2
        L1f:
            if (r4 != 0) goto L41
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
        L35:
            boolean r4 = r0 instanceof android.view.ViewGroup
            if (r4 == 0) goto L9
            r0.getClass()
            android.view.ViewParent r0 = r0.getParent()
            goto L35
        L41:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            android.view.View r3 = r3.findNextFocus(r6, r0, r7)
            r4 = 66
            r5 = 17
            if (r3 == 0) goto L92
            if (r3 == r0) goto L92
            if (r7 != r5) goto L72
            android.graphics.Rect r1 = r6.f10383r
            android.graphics.Rect r1 = r6.v(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.f10383r
            android.graphics.Rect r2 = r6.v(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L6c
            if (r1 < r2) goto L6c
            boolean r0 = r6.K()
            goto L70
        L6c:
            boolean r0 = r3.requestFocus()
        L70:
            r2 = r0
            goto La5
        L72:
            if (r7 != r4) goto La5
            android.graphics.Rect r1 = r6.f10383r
            android.graphics.Rect r1 = r6.v(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.f10383r
            android.graphics.Rect r2 = r6.v(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L8d
            if (r1 > r2) goto L8d
            boolean r0 = r6.L()
            goto L70
        L8d:
            boolean r0 = r3.requestFocus()
            goto L70
        L92:
            if (r7 == r5) goto La1
            if (r7 != r1) goto L97
            goto La1
        L97:
            if (r7 == r4) goto L9c
            r0 = 2
            if (r7 != r0) goto La5
        L9c:
            boolean r2 = r6.L()
            goto La5
        La1:
            boolean r2 = r6.K()
        La5:
            if (r2 == 0) goto Lae
            int r7 = android.view.SoundEffectConstants.getContantForFocusDirection(r7)
            r6.playSoundEffect(r7)
        Lae:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.d(int):boolean");
    }

    public void d0(int i5) {
        if (i5 < 1) {
            i5 = 1;
        }
        if (i5 != this.L) {
            this.L = i5;
            O();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || s(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        f B;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() == 0 && (B = B(childAt)) != null && B.f10410b == this.f10387t && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        androidx.viewpager.widget.a aVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z5 = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (aVar = this.f10385s) != null && aVar.h() > 1)) {
            if (!this.f10369g0.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.E * width);
                this.f10369g0.setSize(height, width);
                z5 = false | this.f10369g0.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.f10370h0.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.F + 1.0f)) * width2);
                this.f10370h0.setSize(height2, width2);
                z5 |= this.f10370h0.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.f10369g0.finish();
            this.f10370h0.finish();
        }
        if (z5) {
            y1.n1(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.B;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public boolean e() {
        if (this.M) {
            return false;
        }
        this.f10367e0 = true;
        k0(1);
        this.R = 0.0f;
        this.T = 0.0f;
        VelocityTracker velocityTracker = this.W;
        if (velocityTracker == null) {
            this.W = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
        this.W.addMovement(obtain);
        obtain.recycle();
        this.f10368f0 = uptimeMillis;
        return true;
    }

    @Deprecated
    public void e0(i iVar) {
        this.f10376n0 = iVar;
    }

    public void f0(int i5) {
        int i6 = this.A;
        this.A = i5;
        int width = getWidth();
        Q(width, width, i5, i6);
        requestLayout();
    }

    protected boolean g(View view, boolean z5, int i5, int i6, int i7) {
        int i8;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i9 = i6 + scrollX;
                if (i9 >= childAt.getLeft() && i9 < childAt.getRight() && (i8 = i7 + scrollY) >= childAt.getTop() && i8 < childAt.getBottom() && g(childAt, true, i5, i9 - childAt.getLeft(), i8 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z5 && view.canScrollHorizontally(-i5);
    }

    public void g0(@v int i5) {
        h0(androidx.core.content.d.i(getContext(), i5));
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i5, int i6) {
        if (this.f10386s0 == 2) {
            i6 = (i5 - 1) - i6;
        }
        return ((LayoutParams) this.f10388t0.get(i6).getLayoutParams()).f10402f;
    }

    public void h() {
        List<i> list = this.f10375m0;
        if (list != null) {
            list.clear();
        }
    }

    public void h0(@q0 Drawable drawable) {
        this.B = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void i0(boolean z5, @q0 j jVar) {
        j0(z5, jVar, 2);
    }

    void j() {
        int h5 = this.f10385s.h();
        this.f10377o = h5;
        boolean z5 = this.f10379p.size() < (this.L * 2) + 1 && this.f10379p.size() < h5;
        int i5 = this.f10387t;
        int i6 = 0;
        boolean z6 = false;
        while (i6 < this.f10379p.size()) {
            f fVar = this.f10379p.get(i6);
            int i7 = this.f10385s.i(fVar.f10409a);
            if (i7 != -1) {
                if (i7 == -2) {
                    this.f10379p.remove(i6);
                    i6--;
                    if (!z6) {
                        this.f10385s.w(this);
                        z6 = true;
                    }
                    this.f10385s.e(this, fVar.f10410b, fVar.f10409a);
                    int i8 = this.f10387t;
                    if (i8 == fVar.f10410b) {
                        i5 = Math.max(0, Math.min(i8, h5 - 1));
                    }
                } else {
                    int i9 = fVar.f10410b;
                    if (i9 != i7) {
                        if (i9 == this.f10387t) {
                            i5 = i7;
                        }
                        fVar.f10410b = i7;
                    }
                }
                z5 = true;
            }
            i6++;
        }
        if (z6) {
            this.f10385s.g(this);
        }
        Collections.sort(this.f10379p, F0);
        if (z5) {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i10).getLayoutParams();
                if (!layoutParams.f10397a) {
                    layoutParams.f10399c = 0.0f;
                }
            }
            a0(i5, false, true);
            requestLayout();
        }
    }

    public void j0(boolean z5, @q0 j jVar, int i5) {
        boolean z6 = jVar != null;
        boolean z7 = z6 != (this.f10382q0 != null);
        this.f10382q0 = jVar;
        setChildrenDrawingOrderEnabled(z6);
        if (z6) {
            this.f10386s0 = z5 ? 2 : 1;
            this.f10384r0 = i5;
        } else {
            this.f10386s0 = 0;
        }
        if (z7) {
            O();
        }
    }

    void k0(int i5) {
        if (this.f10392v0 == i5) {
            return;
        }
        this.f10392v0 = i5;
        if (this.f10382q0 != null) {
            p(i5 != 0);
        }
        n(i5);
    }

    void m0(int i5, int i6) {
        n0(i5, i6, 0);
    }

    void n0(int i5, int i6, int i7) {
        int scrollX;
        if (getChildCount() == 0) {
            l0(false);
            return;
        }
        Scroller scroller = this.f10394x;
        if ((scroller == null || scroller.isFinished()) ? false : true) {
            scrollX = this.f10395y ? this.f10394x.getCurrX() : this.f10394x.getStartX();
            this.f10394x.abortAnimation();
            l0(false);
        } else {
            scrollX = getScrollX();
        }
        int i8 = scrollX;
        int scrollY = getScrollY();
        int i9 = i5 - i8;
        int i10 = i6 - scrollY;
        if (i9 == 0 && i10 == 0) {
            i(false);
            O();
            k0(0);
            return;
        }
        l0(true);
        k0(2);
        int w5 = w();
        int i11 = w5 / 2;
        float f6 = w5;
        float f7 = i11;
        float o5 = (o(Math.min(1.0f, (Math.abs(i9) * 1.0f) / f6)) * f7) + f7;
        int abs = Math.abs(i7);
        int min = Math.min(abs > 0 ? Math.round(Math.abs(o5 / abs) * 1000.0f) * 4 : (int) (((Math.abs(i9) / ((this.f10385s.k(this.f10387t) * f6) + this.A)) + 1.0f) * 100.0f), A0);
        this.f10395y = false;
        this.f10394x.startScroll(i8, scrollY, i9, i10, min);
        y1.n1(this);
    }

    float o(float f6) {
        return (float) Math.sin((f6 - 0.5f) * 0.47123894f);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f10371i0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f10390u0);
        Scroller scroller = this.f10394x;
        if (scroller != null && !scroller.isFinished()) {
            this.f10394x.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int i5;
        float f6;
        float f7;
        super.onDraw(canvas);
        if (this.A <= 0 || this.B == null || this.f10379p.size() <= 0 || this.f10385s == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f8 = this.A / width;
        int i6 = 0;
        f fVar = this.f10379p.get(0);
        float f9 = fVar.f10413e;
        int size = this.f10379p.size();
        int i7 = fVar.f10410b;
        int i8 = this.f10379p.get(size - 1).f10410b;
        while (i7 < i8) {
            while (true) {
                i5 = fVar.f10410b;
                if (i7 <= i5 || i6 >= size) {
                    break;
                }
                i6++;
                fVar = this.f10379p.get(i6);
            }
            if (i7 == i5) {
                float f10 = fVar.f10413e;
                float f11 = fVar.f10412d;
                f6 = (f10 + f11) * width;
                f9 = f10 + f11 + f8;
            } else {
                float k5 = this.f10385s.k(i7);
                f6 = (f9 + k5) * width;
                f9 = k5 + f8 + f9;
            }
            if (this.A + f6 > scrollX) {
                f7 = f8;
                this.B.setBounds(Math.round(f6), this.C, Math.round(this.A + f6), this.D);
                this.B.draw(canvas);
            } else {
                f7 = f8;
            }
            if (f6 > scrollX + r2) {
                return;
            }
            i7++;
            f8 = f7;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            V();
            return false;
        }
        if (action != 0) {
            if (this.M) {
                return true;
            }
            if (this.N) {
                return false;
            }
        }
        if (action == 0) {
            float x5 = motionEvent.getX();
            this.T = x5;
            this.R = x5;
            float y5 = motionEvent.getY();
            this.U = y5;
            this.S = y5;
            this.V = motionEvent.getPointerId(0);
            this.N = false;
            this.f10395y = true;
            this.f10394x.computeScrollOffset();
            if (this.f10392v0 != 2 || Math.abs(this.f10394x.getFinalX() - this.f10394x.getCurrX()) <= this.f10366d0) {
                i(false);
                this.M = false;
            } else {
                this.f10394x.abortAnimation();
                this.K = false;
                O();
                this.M = true;
                U(true);
                k0(1);
            }
        } else if (action == 2) {
            int i5 = this.V;
            if (i5 != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i5);
                float x6 = motionEvent.getX(findPointerIndex);
                float f6 = x6 - this.R;
                float abs = Math.abs(f6);
                float y6 = motionEvent.getY(findPointerIndex);
                float abs2 = Math.abs(y6 - this.U);
                if (f6 != 0.0f && !H(this.R, f6) && g(this, false, (int) f6, (int) x6, (int) y6)) {
                    this.R = x6;
                    this.S = y6;
                    this.N = true;
                    return false;
                }
                int i6 = this.Q;
                if (abs > i6 && abs * 0.5f > abs2) {
                    this.M = true;
                    U(true);
                    k0(1);
                    float f7 = this.T;
                    float f8 = this.Q;
                    this.R = f6 > 0.0f ? f7 + f8 : f7 - f8;
                    this.S = y6;
                    l0(true);
                } else if (abs2 > i6) {
                    this.N = true;
                }
                if (this.M && N(x6)) {
                    y1.n1(this);
                }
            }
        } else if (action == 6) {
            J(motionEvent);
        }
        if (this.W == null) {
            this.W = VelocityTracker.obtain();
        }
        this.W.addMovement(motionEvent);
        return this.M;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected void onMeasure(int i5, int i6) {
        LayoutParams layoutParams;
        LayoutParams layoutParams2;
        int i7;
        setMeasuredDimension(View.getDefaultSize(0, i5), View.getDefaultSize(0, i6));
        int measuredWidth = getMeasuredWidth();
        this.P = Math.min(measuredWidth / 10, this.O);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i8 = 0;
        while (true) {
            boolean z5 = true;
            int i9 = androidx.constraintlayout.solver.widgets.analyzer.b.f2366g;
            if (i8 >= childCount) {
                break;
            }
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8 && (layoutParams2 = (LayoutParams) childAt.getLayoutParams()) != null && layoutParams2.f10397a) {
                int i10 = layoutParams2.f10398b;
                int i11 = i10 & 7;
                int i12 = i10 & 112;
                boolean z6 = i12 == 48 || i12 == 80;
                if (i11 != 3 && i11 != 5) {
                    z5 = false;
                }
                int i13 = Integer.MIN_VALUE;
                if (z6) {
                    i7 = Integer.MIN_VALUE;
                    i13 = 1073741824;
                } else {
                    i7 = z5 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i14 = ((ViewGroup.LayoutParams) layoutParams2).width;
                if (i14 != -2) {
                    if (i14 == -1) {
                        i14 = paddingLeft;
                    }
                    i13 = 1073741824;
                } else {
                    i14 = paddingLeft;
                }
                int i15 = ((ViewGroup.LayoutParams) layoutParams2).height;
                if (i15 == -2) {
                    i15 = measuredHeight;
                    i9 = i7;
                } else if (i15 == -1) {
                    i15 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i14, i13), View.MeasureSpec.makeMeasureSpec(i15, i9));
                if (z6) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z5) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i8++;
        }
        this.G = View.MeasureSpec.makeMeasureSpec(paddingLeft, androidx.constraintlayout.solver.widgets.analyzer.b.f2366g);
        this.H = View.MeasureSpec.makeMeasureSpec(measuredHeight, androidx.constraintlayout.solver.widgets.analyzer.b.f2366g);
        this.I = true;
        O();
        this.I = false;
        int childCount2 = getChildCount();
        for (int i16 = 0; i16 < childCount2; i16++) {
            View childAt2 = getChildAt(i16);
            if (childAt2.getVisibility() != 8 && ((layoutParams = (LayoutParams) childAt2.getLayoutParams()) == null || !layoutParams.f10397a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * layoutParams.f10399c), androidx.constraintlayout.solver.widgets.analyzer.b.f2366g), this.H);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i5, Rect rect) {
        int i6;
        int i7;
        int i8;
        f B;
        int childCount = getChildCount();
        if ((i5 & 2) != 0) {
            i7 = childCount;
            i6 = 0;
            i8 = 1;
        } else {
            i6 = childCount - 1;
            i7 = -1;
            i8 = -1;
        }
        while (i6 != i7) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() == 0 && (B = B(childAt)) != null && B.f10410b == this.f10387t && childAt.requestFocus(i5, rect)) {
                return true;
            }
            i6 += i8;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        androidx.viewpager.widget.a aVar = this.f10385s;
        if (aVar != null) {
            aVar.q(savedState.f10404r, savedState.f10405s);
            a0(savedState.f10403q, false, true);
        } else {
            this.f10389u = savedState.f10403q;
            this.f10391v = savedState.f10404r;
            this.f10393w = savedState.f10405s;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f10403q = this.f10387t;
        androidx.viewpager.widget.a aVar = this.f10385s;
        if (aVar != null) {
            savedState.f10404r = aVar.r();
        }
        return savedState;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i5, int i6, int i7, int i8) {
        super.onSizeChanged(i5, i6, i7, i8);
        if (i5 != i7) {
            int i9 = this.A;
            Q(i5, i7, i9, i9);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        androidx.viewpager.widget.a aVar;
        if (this.f10367e0) {
            return true;
        }
        boolean z5 = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (aVar = this.f10385s) == null || aVar.h() == 0) {
            return false;
        }
        if (this.W == null) {
            this.W = VelocityTracker.obtain();
        }
        this.W.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f10394x.abortAnimation();
            this.K = false;
            O();
            float x5 = motionEvent.getX();
            this.T = x5;
            this.R = x5;
            float y5 = motionEvent.getY();
            this.U = y5;
            this.S = y5;
            this.V = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.M) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.V);
                    if (findPointerIndex == -1) {
                        z5 = V();
                    } else {
                        float x6 = motionEvent.getX(findPointerIndex);
                        float abs = Math.abs(x6 - this.R);
                        float y6 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y6 - this.S);
                        if (abs > this.Q && abs > abs2) {
                            this.M = true;
                            U(true);
                            float f6 = this.T;
                            this.R = x6 - f6 > 0.0f ? f6 + this.Q : f6 - this.Q;
                            this.S = y6;
                            k0(1);
                            l0(true);
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.M) {
                    z5 = false | N(motionEvent.getX(motionEvent.findPointerIndex(this.V)));
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    this.R = motionEvent.getX(actionIndex);
                    this.V = motionEvent.getPointerId(actionIndex);
                } else if (action == 6) {
                    J(motionEvent);
                    this.R = motionEvent.getX(motionEvent.findPointerIndex(this.V));
                }
            } else if (this.M) {
                W(this.f10387t, true, 0, false);
                z5 = V();
            }
        } else if (this.M) {
            VelocityTracker velocityTracker = this.W;
            velocityTracker.computeCurrentVelocity(1000, this.f10364b0);
            int xVelocity = (int) velocityTracker.getXVelocity(this.V);
            this.K = true;
            int w5 = w();
            int scrollX = getScrollX();
            f C = C();
            float f7 = w5;
            b0(k(C.f10410b, ((scrollX / f7) - C.f10413e) / (C.f10412d + (this.A / f7)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.V)) - this.T)), true, true, xVelocity);
            z5 = V();
        }
        if (z5) {
            y1.n1(this);
        }
        return true;
    }

    public void r() {
        if (!this.f10367e0) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (this.f10385s != null) {
            VelocityTracker velocityTracker = this.W;
            velocityTracker.computeCurrentVelocity(1000, this.f10364b0);
            int xVelocity = (int) velocityTracker.getXVelocity(this.V);
            this.K = true;
            int w5 = w();
            int scrollX = getScrollX();
            f C = C();
            b0(k(C.f10410b, ((scrollX / w5) - C.f10413e) / C.f10412d, xVelocity, (int) (this.R - this.T)), true, true, xVelocity);
        }
        q();
        this.f10367e0 = false;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.I) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public boolean s(@o0 KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 21) {
                return keyEvent.hasModifiers(2) ? K() : d(17);
            }
            if (keyCode == 22) {
                return keyEvent.hasModifiers(2) ? L() : d(66);
            }
            if (keyCode == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return d(2);
                }
                if (keyEvent.hasModifiers(1)) {
                    return d(1);
                }
            }
        }
        return false;
    }

    public void t(float f6) {
        if (!this.f10367e0) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (this.f10385s == null) {
            return;
        }
        this.R += f6;
        float scrollX = getScrollX() - f6;
        float w5 = w();
        float f7 = this.E * w5;
        float f8 = this.F * w5;
        f fVar = this.f10379p.get(0);
        f fVar2 = this.f10379p.get(r4.size() - 1);
        if (fVar.f10410b != 0) {
            f7 = fVar.f10413e * w5;
        }
        if (fVar2.f10410b != this.f10385s.h() - 1) {
            f8 = fVar2.f10413e * w5;
        }
        if (scrollX < f7) {
            scrollX = f7;
        } else if (scrollX > f8) {
            scrollX = f8;
        }
        int i5 = (int) scrollX;
        this.R = (scrollX - i5) + this.R;
        scrollTo(i5, getScrollY());
        M(i5);
        MotionEvent obtain = MotionEvent.obtain(this.f10368f0, SystemClock.uptimeMillis(), 2, this.R, 0.0f, 0);
        this.W.addMovement(obtain);
        obtain.recycle();
    }

    @q0
    public androidx.viewpager.widget.a u() {
        return this.f10385s;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.B;
    }

    public int x() {
        return this.f10387t;
    }

    public int y() {
        return this.L;
    }

    public int z() {
        return this.A;
    }

    public static class LayoutParams extends ViewGroup.LayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public boolean f10397a;

        /* renamed from: b, reason: collision with root package name */
        public int f10398b;

        /* renamed from: c, reason: collision with root package name */
        float f10399c;

        /* renamed from: d, reason: collision with root package name */
        boolean f10400d;

        /* renamed from: e, reason: collision with root package name */
        int f10401e;

        /* renamed from: f, reason: collision with root package name */
        int f10402f;

        public LayoutParams() {
            super(-1, -1);
            this.f10399c = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f10399c = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.E0);
            this.f10398b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public ViewPager(@o0 Context context, @q0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10379p = new ArrayList<>();
        this.f10381q = new f();
        this.f10383r = new Rect();
        this.f10389u = -1;
        this.f10391v = null;
        this.f10393w = null;
        this.E = -3.4028235E38f;
        this.F = Float.MAX_VALUE;
        this.L = 1;
        this.V = -1;
        this.f10371i0 = true;
        this.f10372j0 = false;
        this.f10390u0 = new c();
        this.f10392v0 = 0;
        E();
    }
}
