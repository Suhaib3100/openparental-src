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
import androidx.compose.runtime.z4;
import androidx.core.view.accessibility.h0;
import androidx.core.view.d1;
import androidx.core.view.j3;
import androidx.core.view.x1;
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

/* loaded from: classes3.dex */
public class ViewPager extends ViewGroup {
    private static final boolean Y2 = false;
    private static final boolean Z2 = false;

    /* renamed from: a3, reason: collision with root package name */
    private static final int f35503a3 = 1;

    /* renamed from: b3, reason: collision with root package name */
    private static final int f35504b3 = 600;

    /* renamed from: c3, reason: collision with root package name */
    private static final int f35505c3 = 25;

    /* renamed from: d3, reason: collision with root package name */
    private static final int f35506d3 = 16;

    /* renamed from: e3, reason: collision with root package name */
    private static final int f35507e3 = 400;

    /* renamed from: i3, reason: collision with root package name */
    private static final int f35511i3 = -1;

    /* renamed from: j3, reason: collision with root package name */
    private static final int f35512j3 = 2;

    /* renamed from: k3, reason: collision with root package name */
    private static final int f35513k3 = 0;

    /* renamed from: l3, reason: collision with root package name */
    private static final int f35514l3 = 1;

    /* renamed from: m3, reason: collision with root package name */
    private static final int f35515m3 = 2;

    /* renamed from: o3, reason: collision with root package name */
    public static final int f35517o3 = 0;

    /* renamed from: p3, reason: collision with root package name */
    public static final int f35518p3 = 1;

    /* renamed from: q3, reason: collision with root package name */
    public static final int f35519q3 = 2;
    private boolean A;
    private int B;
    private int C;
    private int D;
    private float E;
    private float F;
    private float G;
    private float H;
    private int I;
    private VelocityTracker J;
    private int K;
    private int L;
    private boolean L2;
    private int M;
    private int M2;
    private int N;
    private List<i> N2;
    private boolean O;
    private i O2;
    private long P;
    private i P2;
    private EdgeEffect Q;
    private boolean Q1;
    private List<h> Q2;
    private EdgeEffect R;
    private j R2;
    private int S2;
    private int T2;
    private ArrayList<View> U2;
    private boolean V1;
    private final Runnable V2;
    private int W2;

    /* renamed from: b, reason: collision with root package name */
    private int f35520b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList<f> f35521c;

    /* renamed from: d, reason: collision with root package name */
    private final f f35522d;

    /* renamed from: e, reason: collision with root package name */
    private final Rect f35523e;

    /* renamed from: f, reason: collision with root package name */
    androidx.viewpager.widget.a f35524f;

    /* renamed from: g, reason: collision with root package name */
    int f35525g;

    /* renamed from: h, reason: collision with root package name */
    private int f35526h;

    /* renamed from: i, reason: collision with root package name */
    private Parcelable f35527i;

    /* renamed from: j, reason: collision with root package name */
    private ClassLoader f35528j;

    /* renamed from: k, reason: collision with root package name */
    private Scroller f35529k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f35530l;

    /* renamed from: m, reason: collision with root package name */
    private k f35531m;

    /* renamed from: n, reason: collision with root package name */
    private int f35532n;

    /* renamed from: o, reason: collision with root package name */
    private Drawable f35533o;

    /* renamed from: p, reason: collision with root package name */
    private int f35534p;

    /* renamed from: q, reason: collision with root package name */
    private int f35535q;

    /* renamed from: r, reason: collision with root package name */
    private float f35536r;

    /* renamed from: s, reason: collision with root package name */
    private float f35537s;

    /* renamed from: t, reason: collision with root package name */
    private int f35538t;

    /* renamed from: u, reason: collision with root package name */
    private int f35539u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f35540v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f35541w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f35542x;

    /* renamed from: y, reason: collision with root package name */
    private int f35543y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f35544z;
    private static final String X2 = "ViewPager";

    /* renamed from: f3, reason: collision with root package name */
    static final int[] f35508f3 = {R.attr.layout_gravity};

    /* renamed from: g3, reason: collision with root package name */
    private static final Comparator<f> f35509g3 = new a();

    /* renamed from: h3, reason: collision with root package name */
    private static final Interpolator f35510h3 = new b();

    /* renamed from: n3, reason: collision with root package name */
    private static final m f35516n3 = new m();

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: d, reason: collision with root package name */
        int f35551d;

        /* renamed from: e, reason: collision with root package name */
        Parcelable f35552e;

        /* renamed from: f, reason: collision with root package name */
        ClassLoader f35553f;

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

            public SavedState[] c(int i4) {
                return new SavedState[i4];
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i4) {
                return new SavedState[i4];
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
            return android.support.v4.media.b.a(sb, this.f35551d, "}");
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeInt(this.f35551d);
            parcel.writeParcelable(this.f35552e, i4);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f35551d = parcel.readInt();
            this.f35552e = parcel.readParcelable(classLoader);
            this.f35553f = classLoader;
        }
    }

    static class a implements Comparator<f> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(f fVar, f fVar2) {
            return fVar.f35558b - fVar2.f35558b;
        }
    }

    static class b implements Interpolator {
        b() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f4) {
            float f5 = f4 - 1.0f;
            return (f5 * f5 * f5 * f5 * f5) + 1.0f;
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

    class d implements d1 {

        /* renamed from: b, reason: collision with root package name */
        private final Rect f35555b = new Rect();

        d() {
        }

        @Override // androidx.core.view.d1
        public j3 a(View view, j3 j3Var) {
            j3 k12 = x1.k1(view, j3Var);
            if (k12.A()) {
                return k12;
            }
            Rect rect = this.f35555b;
            rect.left = k12.p();
            rect.top = k12.r();
            rect.right = k12.q();
            rect.bottom = k12.o();
            int childCount = ViewPager.this.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                j3 p4 = x1.p(ViewPager.this.getChildAt(i4), k12);
                rect.left = Math.min(p4.p(), rect.left);
                rect.top = Math.min(p4.r(), rect.top);
                rect.right = Math.min(p4.q(), rect.right);
                rect.bottom = Math.min(p4.o(), rect.bottom);
            }
            return k12.D(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface e {
    }

    static class f {

        /* renamed from: a, reason: collision with root package name */
        Object f35557a;

        /* renamed from: b, reason: collision with root package name */
        int f35558b;

        /* renamed from: c, reason: collision with root package name */
        boolean f35559c;

        /* renamed from: d, reason: collision with root package name */
        float f35560d;

        /* renamed from: e, reason: collision with root package name */
        float f35561e;

        f() {
        }
    }

    class g extends androidx.core.view.a {
        g() {
        }

        private boolean r() {
            androidx.viewpager.widget.a aVar = ViewPager.this.f35524f;
            return aVar != null && aVar.h() > 1;
        }

        @Override // androidx.core.view.a
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            androidx.viewpager.widget.a aVar;
            super.h(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(r());
            if (accessibilityEvent.getEventType() != 4096 || (aVar = ViewPager.this.f35524f) == null) {
                return;
            }
            accessibilityEvent.setItemCount(aVar.h());
            accessibilityEvent.setFromIndex(ViewPager.this.f35525g);
            accessibilityEvent.setToIndex(ViewPager.this.f35525g);
        }

        @Override // androidx.core.view.a
        public void i(View view, h0 h0Var) {
            super.i(view, h0Var);
            h0Var.j1(ViewPager.class.getName());
            h0Var.X1(r());
            if (ViewPager.this.canScrollHorizontally(1)) {
                h0Var.a(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                h0Var.a(8192);
            }
        }

        @Override // androidx.core.view.a
        public boolean m(View view, int i4, Bundle bundle) {
            if (super.m(view, i4, bundle)) {
                return true;
            }
            if (i4 == 4096) {
                if (!ViewPager.this.canScrollHorizontally(1)) {
                    return false;
                }
                ViewPager viewPager = ViewPager.this;
                viewPager.Y(viewPager.f35525g + 1);
                return true;
            }
            if (i4 != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                return false;
            }
            ViewPager viewPager2 = ViewPager.this;
            viewPager2.Y(viewPager2.f35525g - 1);
            return true;
        }
    }

    public interface h {
        void b(@o0 ViewPager viewPager, @q0 androidx.viewpager.widget.a aVar, @q0 androidx.viewpager.widget.a aVar2);
    }

    public interface i {
        void a(int i4, float f4, @u0 int i5);

        void c(int i4);

        void d(int i4);
    }

    public interface j {
        void a(@o0 View view, float f4);
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

    public static class l implements i {
        @Override // androidx.viewpager.widget.ViewPager.i
        public void a(int i4, float f4, int i5) {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void c(int i4) {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void d(int i4) {
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
            boolean z4 = layoutParams.f35545a;
            return z4 != layoutParams2.f35545a ? z4 ? 1 : -1 : layoutParams.f35549e - layoutParams2.f35549e;
        }
    }

    public ViewPager(@o0 Context context) {
        super(context);
        this.f35521c = new ArrayList<>();
        this.f35522d = new f();
        this.f35523e = new Rect();
        this.f35526h = -1;
        this.f35527i = null;
        this.f35528j = null;
        this.f35536r = -3.4028235E38f;
        this.f35537s = Float.MAX_VALUE;
        this.f35543y = 1;
        this.I = -1;
        this.Q1 = true;
        this.V1 = false;
        this.V2 = new c();
        this.W2 = 0;
        E();
    }

    private f C() {
        int i4;
        int w4 = w();
        float f4 = 0.0f;
        float scrollX = w4 > 0 ? getScrollX() / w4 : 0.0f;
        float f5 = w4 > 0 ? this.f35532n / w4 : 0.0f;
        int i5 = 0;
        boolean z4 = true;
        f fVar = null;
        int i6 = -1;
        float f6 = 0.0f;
        while (i5 < this.f35521c.size()) {
            f fVar2 = this.f35521c.get(i5);
            if (!z4 && fVar2.f35558b != (i4 = i6 + 1)) {
                fVar2 = this.f35522d;
                fVar2.f35561e = f4 + f6 + f5;
                fVar2.f35558b = i4;
                fVar2.f35560d = this.f35524f.k(i4);
                i5--;
            }
            f fVar3 = fVar2;
            f4 = fVar3.f35561e;
            float f7 = fVar3.f35560d + f4 + f5;
            if (!z4 && scrollX < f4) {
                return fVar;
            }
            if (scrollX < f7 || i5 == this.f35521c.size() - 1) {
                return fVar3;
            }
            int i7 = fVar3.f35558b;
            float f10 = fVar3.f35560d;
            i5++;
            z4 = false;
            i6 = i7;
            f6 = f10;
            fVar = fVar3;
        }
        return fVar;
    }

    private static boolean F(@o0 View view) {
        return view.getClass().getAnnotation(e.class) != null;
    }

    private boolean H(float f4, float f5) {
        return (f4 < ((float) this.C) && f5 > 0.0f) || (f4 > ((float) (getWidth() - this.C)) && f5 < 0.0f);
    }

    private void J(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.I) {
            int i4 = actionIndex == 0 ? 1 : 0;
            this.E = motionEvent.getX(i4);
            this.I = motionEvent.getPointerId(i4);
            VelocityTracker velocityTracker = this.J;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private boolean M(int i4) {
        if (this.f35521c.size() == 0) {
            if (this.Q1) {
                return false;
            }
            this.L2 = false;
            I(0, 0.0f, 0);
            if (this.L2) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        f C = C();
        int w4 = w();
        int i5 = this.f35532n;
        int i6 = w4 + i5;
        float f4 = w4;
        int i7 = C.f35558b;
        float f5 = ((i4 / f4) - C.f35561e) / (C.f35560d + (i5 / f4));
        this.L2 = false;
        I(i7, f5, (int) (i6 * f5));
        if (this.L2) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private boolean N(float f4) {
        boolean z4;
        boolean z5;
        float f5 = this.E - f4;
        this.E = f4;
        float scrollX = getScrollX() + f5;
        float w4 = w();
        float f6 = this.f35536r * w4;
        float f7 = this.f35537s * w4;
        boolean z6 = false;
        f fVar = this.f35521c.get(0);
        f fVar2 = (f) z4.a(this.f35521c, 1);
        if (fVar.f35558b != 0) {
            f6 = fVar.f35561e * w4;
            z4 = false;
        } else {
            z4 = true;
        }
        if (fVar2.f35558b != this.f35524f.h() - 1) {
            f7 = fVar2.f35561e * w4;
            z5 = false;
        } else {
            z5 = true;
        }
        if (scrollX < f6) {
            if (z4) {
                this.Q.onPull(Math.abs(f6 - scrollX) / w4);
                z6 = true;
            }
            scrollX = f6;
        } else if (scrollX > f7) {
            if (z5) {
                this.R.onPull(Math.abs(scrollX - f7) / w4);
                z6 = true;
            }
            scrollX = f7;
        }
        int i4 = (int) scrollX;
        this.E = (scrollX - i4) + this.E;
        scrollTo(i4, getScrollY());
        M(i4);
        return z6;
    }

    private void Q(int i4, int i5, int i6, int i7) {
        if (i5 > 0 && !this.f35521c.isEmpty()) {
            if (!this.f35529k.isFinished()) {
                this.f35529k.setFinalX(x() * w());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i5 - getPaddingLeft()) - getPaddingRight()) + i7)) * (((i4 - getPaddingLeft()) - getPaddingRight()) + i6)), getScrollY());
                return;
            }
        }
        f D = D(this.f35525g);
        int min = (int) ((D != null ? Math.min(D.f35561e, this.f35537s) : 0.0f) * ((i4 - getPaddingLeft()) - getPaddingRight()));
        if (min != getScrollX()) {
            i(false);
            scrollTo(min, getScrollY());
        }
    }

    private void R() {
        int i4 = 0;
        while (i4 < getChildCount()) {
            if (!((LayoutParams) getChildAt(i4).getLayoutParams()).f35545a) {
                removeViewAt(i4);
                i4--;
            }
            i4++;
        }
    }

    private void U(boolean z4) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z4);
        }
    }

    private boolean V() {
        this.I = -1;
        q();
        this.Q.onRelease();
        this.R.onRelease();
        return this.Q.isFinished() || this.R.isFinished();
    }

    private void W(int i4, boolean z4, int i5, boolean z5) {
        int i6;
        f D = D(i4);
        if (D != null) {
            i6 = (int) (Math.max(this.f35536r, Math.min(D.f35561e, this.f35537s)) * w());
        } else {
            i6 = 0;
        }
        if (z4) {
            n0(i6, 0, i5);
            if (z5) {
                m(i4);
                return;
            }
            return;
        }
        if (z5) {
            m(i4);
        }
        i(false);
        scrollTo(i6, 0);
        M(i6);
    }

    private void f(f fVar, int i4, f fVar2) {
        int i5;
        int i6;
        f fVar3;
        f fVar4;
        int h4 = this.f35524f.h();
        int w4 = w();
        float f4 = w4 > 0 ? this.f35532n / w4 : 0.0f;
        if (fVar2 != null) {
            int i7 = fVar2.f35558b;
            int i10 = fVar.f35558b;
            if (i7 < i10) {
                float f5 = fVar2.f35561e + fVar2.f35560d + f4;
                int i11 = i7 + 1;
                int i12 = 0;
                while (i11 <= fVar.f35558b && i12 < this.f35521c.size()) {
                    f fVar5 = this.f35521c.get(i12);
                    while (true) {
                        fVar4 = fVar5;
                        if (i11 <= fVar4.f35558b || i12 >= this.f35521c.size() - 1) {
                            break;
                        }
                        i12++;
                        fVar5 = this.f35521c.get(i12);
                    }
                    while (i11 < fVar4.f35558b) {
                        f5 += this.f35524f.k(i11) + f4;
                        i11++;
                    }
                    fVar4.f35561e = f5;
                    f5 += fVar4.f35560d + f4;
                    i11++;
                }
            } else if (i7 > i10) {
                int size = this.f35521c.size() - 1;
                float f6 = fVar2.f35561e;
                while (true) {
                    i7--;
                    if (i7 < fVar.f35558b || size < 0) {
                        break;
                    }
                    f fVar6 = this.f35521c.get(size);
                    while (true) {
                        fVar3 = fVar6;
                        if (i7 >= fVar3.f35558b || size <= 0) {
                            break;
                        }
                        size--;
                        fVar6 = this.f35521c.get(size);
                    }
                    while (i7 > fVar3.f35558b) {
                        f6 -= this.f35524f.k(i7) + f4;
                        i7--;
                    }
                    f6 -= fVar3.f35560d + f4;
                    fVar3.f35561e = f6;
                }
            }
        }
        int size2 = this.f35521c.size();
        float f7 = fVar.f35561e;
        int i13 = fVar.f35558b;
        int i14 = i13 - 1;
        this.f35536r = i13 == 0 ? f7 : -3.4028235E38f;
        int i15 = h4 - 1;
        this.f35537s = i13 == i15 ? (fVar.f35560d + f7) - 1.0f : Float.MAX_VALUE;
        int i16 = i4 - 1;
        while (i16 >= 0) {
            f fVar7 = this.f35521c.get(i16);
            while (true) {
                i6 = fVar7.f35558b;
                if (i14 <= i6) {
                    break;
                }
                f7 -= this.f35524f.k(i14) + f4;
                i14--;
            }
            f7 -= fVar7.f35560d + f4;
            fVar7.f35561e = f7;
            if (i6 == 0) {
                this.f35536r = f7;
            }
            i16--;
            i14--;
        }
        float f10 = fVar.f35561e + fVar.f35560d + f4;
        int i17 = fVar.f35558b + 1;
        int i18 = i4 + 1;
        while (i18 < size2) {
            f fVar8 = this.f35521c.get(i18);
            while (true) {
                i5 = fVar8.f35558b;
                if (i17 >= i5) {
                    break;
                }
                f10 += this.f35524f.k(i17) + f4;
                i17++;
            }
            if (i5 == i15) {
                this.f35537s = (fVar8.f35560d + f10) - 1.0f;
            }
            fVar8.f35561e = f10;
            f10 += fVar8.f35560d + f4;
            i18++;
            i17++;
        }
        this.V1 = false;
    }

    private void i(boolean z4) {
        boolean z5 = this.W2 == 2;
        if (z5) {
            l0(false);
            if (!this.f35529k.isFinished()) {
                this.f35529k.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f35529k.getCurrX();
                int currY = this.f35529k.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        M(currX);
                    }
                }
            }
        }
        this.f35542x = false;
        for (int i4 = 0; i4 < this.f35521c.size(); i4++) {
            f fVar = this.f35521c.get(i4);
            if (fVar.f35559c) {
                fVar.f35559c = false;
                z5 = true;
            }
        }
        if (z5) {
            if (z4) {
                x1.v1(this, this.V2);
            } else {
                this.V2.run();
            }
        }
    }

    private int k(int i4, float f4, int i5, int i6) {
        if (Math.abs(i6) <= this.M || Math.abs(i5) <= this.K) {
            i4 += (int) (f4 + (i4 >= this.f35525g ? 0.4f : 0.6f));
        } else if (i5 <= 0) {
            i4++;
        }
        if (this.f35521c.size() > 0) {
            return Math.max(this.f35521c.get(0).f35558b, Math.min(i4, ((f) z4.a(this.f35521c, 1)).f35558b));
        }
        return i4;
    }

    private void l(int i4, float f4, int i5) {
        i iVar = this.O2;
        if (iVar != null) {
            iVar.a(i4, f4, i5);
        }
        List<i> list = this.N2;
        if (list != null) {
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                i iVar2 = this.N2.get(i6);
                if (iVar2 != null) {
                    iVar2.a(i4, f4, i5);
                }
            }
        }
        i iVar3 = this.P2;
        if (iVar3 != null) {
            iVar3.a(i4, f4, i5);
        }
    }

    private void l0(boolean z4) {
        if (this.f35541w != z4) {
            this.f35541w = z4;
        }
    }

    private void m(int i4) {
        i iVar = this.O2;
        if (iVar != null) {
            iVar.d(i4);
        }
        List<i> list = this.N2;
        if (list != null) {
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                i iVar2 = this.N2.get(i5);
                if (iVar2 != null) {
                    iVar2.d(i4);
                }
            }
        }
        i iVar3 = this.P2;
        if (iVar3 != null) {
            iVar3.d(i4);
        }
    }

    private void n(int i4) {
        i iVar = this.O2;
        if (iVar != null) {
            iVar.c(i4);
        }
        List<i> list = this.N2;
        if (list != null) {
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                i iVar2 = this.N2.get(i5);
                if (iVar2 != null) {
                    iVar2.c(i4);
                }
            }
        }
        i iVar3 = this.P2;
        if (iVar3 != null) {
            iVar3.c(i4);
        }
    }

    private void o0() {
        if (this.T2 != 0) {
            ArrayList<View> arrayList = this.U2;
            if (arrayList == null) {
                this.U2 = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                this.U2.add(getChildAt(i4));
            }
            Collections.sort(this.U2, f35516n3);
        }
    }

    private void p(boolean z4) {
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            getChildAt(i4).setLayerType(z4 ? this.S2 : 0, null);
        }
    }

    private void q() {
        this.f35544z = false;
        this.A = false;
        VelocityTracker velocityTracker = this.J;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.J = null;
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
        for (int i4 = 0; i4 < this.f35521c.size(); i4++) {
            f fVar = this.f35521c.get(i4);
            if (this.f35524f.n(view, fVar.f35557a)) {
                return fVar;
            }
        }
        return null;
    }

    f D(int i4) {
        for (int i5 = 0; i5 < this.f35521c.size(); i5++) {
            f fVar = this.f35521c.get(i5);
            if (fVar.f35558b == i4) {
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
        this.f35529k = new Scroller(context, f35510h3);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f4 = context.getResources().getDisplayMetrics().density;
        this.D = viewConfiguration.getScaledPagingTouchSlop();
        this.K = (int) (400.0f * f4);
        this.L = viewConfiguration.getScaledMaximumFlingVelocity();
        this.Q = new EdgeEffect(context);
        this.R = new EdgeEffect(context);
        this.M = (int) (25.0f * f4);
        this.N = (int) (2.0f * f4);
        this.B = (int) (f4 * 16.0f);
        x1.H1(this, new g());
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        x1.k2(this, new d());
    }

    public boolean G() {
        return this.O;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    @androidx.annotation.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void I(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.M2
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L6c
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = r1
        L1b:
            if (r7 >= r6) goto L6c
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r9 = (androidx.viewpager.widget.ViewPager.LayoutParams) r9
            boolean r10 = r9.f35545a
            if (r10 != 0) goto L2c
            goto L69
        L2c:
            int r9 = r9.f35546b
            r9 = r9 & 7
            if (r9 == r2) goto L50
            r10 = 3
            if (r9 == r10) goto L4a
            r10 = 5
            if (r9 == r10) goto L3a
            r9 = r3
            goto L5d
        L3a:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
        L46:
            r11 = r9
            r9 = r3
            r3 = r11
            goto L5d
        L4a:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L5d
        L50:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
            goto L46
        L5d:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L68
            r8.offsetLeftAndRight(r3)
        L68:
            r3 = r9
        L69:
            int r7 = r7 + 1
            goto L1b
        L6c:
            r12.l(r13, r14, r15)
            androidx.viewpager.widget.ViewPager$j r13 = r12.R2
            if (r13 == 0) goto La0
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L7b:
            if (r1 >= r14) goto La0
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r0 = (androidx.viewpager.widget.ViewPager.LayoutParams) r0
            boolean r0 = r0.f35545a
            if (r0 == 0) goto L8c
            goto L9d
        L8c:
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.w()
            float r3 = (float) r3
            float r0 = r0 / r3
            androidx.viewpager.widget.ViewPager$j r3 = r12.R2
            r3.a(r15, r0)
        L9d:
            int r1 = r1 + 1
            goto L7b
        La0:
            r12.L2 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.I(int, float, int):void");
    }

    boolean K() {
        int i4 = this.f35525g;
        if (i4 <= 0) {
            return false;
        }
        Z(i4 - 1, true);
        return true;
    }

    boolean L() {
        androidx.viewpager.widget.a aVar = this.f35524f;
        if (aVar == null || this.f35525g >= aVar.h() - 1) {
            return false;
        }
        Z(this.f35525g + 1, true);
        return true;
    }

    void O() {
        P(this.f35525g);
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
            Method dump skipped, instructions count: 603
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.P(int):void");
    }

    public void S(@o0 h hVar) {
        List<h> list = this.Q2;
        if (list != null) {
            list.remove(hVar);
        }
    }

    public void T(@o0 i iVar) {
        List<i> list = this.N2;
        if (list != null) {
            list.remove(iVar);
        }
    }

    public void X(@q0 androidx.viewpager.widget.a aVar) {
        androidx.viewpager.widget.a aVar2 = this.f35524f;
        if (aVar2 != null) {
            aVar2.u(null);
            this.f35524f.w(this);
            for (int i4 = 0; i4 < this.f35521c.size(); i4++) {
                f fVar = this.f35521c.get(i4);
                this.f35524f.e(this, fVar.f35558b, fVar.f35557a);
            }
            this.f35524f.g(this);
            this.f35521c.clear();
            R();
            this.f35525g = 0;
            scrollTo(0, 0);
        }
        androidx.viewpager.widget.a aVar3 = this.f35524f;
        this.f35524f = aVar;
        this.f35520b = 0;
        if (aVar != null) {
            if (this.f35531m == null) {
                this.f35531m = new k();
            }
            this.f35524f.u(this.f35531m);
            this.f35542x = false;
            boolean z4 = this.Q1;
            this.Q1 = true;
            this.f35520b = this.f35524f.h();
            if (this.f35526h >= 0) {
                this.f35524f.q(this.f35527i, this.f35528j);
                a0(this.f35526h, false, true);
                this.f35526h = -1;
                this.f35527i = null;
                this.f35528j = null;
            } else if (z4) {
                requestLayout();
            } else {
                O();
            }
        }
        List<h> list = this.Q2;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.Q2.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.Q2.get(i5).b(this, aVar3, aVar);
        }
    }

    public void Y(int i4) {
        this.f35542x = false;
        a0(i4, !this.Q1, false);
    }

    public void Z(int i4, boolean z4) {
        this.f35542x = false;
        a0(i4, z4, false);
    }

    f a(int i4, int i5) {
        f fVar = new f();
        fVar.f35558b = i4;
        fVar.f35557a = this.f35524f.m(this, i4);
        fVar.f35560d = this.f35524f.k(i4);
        if (i5 < 0 || i5 >= this.f35521c.size()) {
            this.f35521c.add(fVar);
        } else {
            this.f35521c.add(i5, fVar);
        }
        return fVar;
    }

    void a0(int i4, boolean z4, boolean z5) {
        b0(i4, z4, z5, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i4, int i5) {
        f B;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i6 = 0; i6 < getChildCount(); i6++) {
                View childAt = getChildAt(i6);
                if (childAt.getVisibility() == 0 && (B = B(childAt)) != null && B.f35558b == this.f35525g) {
                    childAt.addFocusables(arrayList, i4, i5);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i5 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        f B;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() == 0 && (B = B(childAt)) != null && B.f35558b == this.f35525g) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        boolean F = layoutParams2.f35545a | F(view);
        layoutParams2.f35545a = F;
        if (!this.f35540v) {
            super.addView(view, i4, layoutParams);
        } else {
            if (F) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            layoutParams2.f35548d = true;
            addViewInLayout(view, i4, layoutParams);
        }
    }

    public void b(@o0 h hVar) {
        if (this.Q2 == null) {
            this.Q2 = new ArrayList();
        }
        this.Q2.add(hVar);
    }

    void b0(int i4, boolean z4, boolean z5, int i5) {
        androidx.viewpager.widget.a aVar = this.f35524f;
        if (aVar == null || aVar.h() <= 0) {
            l0(false);
            return;
        }
        if (!z5 && this.f35525g == i4 && this.f35521c.size() != 0) {
            l0(false);
            return;
        }
        if (i4 < 0) {
            i4 = 0;
        } else if (i4 >= this.f35524f.h()) {
            i4 = this.f35524f.h() - 1;
        }
        int i6 = this.f35543y;
        int i7 = this.f35525g;
        if (i4 > i7 + i6 || i4 < i7 - i6) {
            for (int i10 = 0; i10 < this.f35521c.size(); i10++) {
                this.f35521c.get(i10).f35559c = true;
            }
        }
        boolean z6 = this.f35525g != i4;
        if (!this.Q1) {
            P(i4);
            W(i4, z4, i5, z6);
        } else {
            this.f35525g = i4;
            if (z6) {
                m(i4);
            }
            requestLayout();
        }
    }

    public void c(@o0 i iVar) {
        if (this.N2 == null) {
            this.N2 = new ArrayList();
        }
        this.N2.add(iVar);
    }

    i c0(i iVar) {
        i iVar2 = this.P2;
        this.P2 = iVar;
        return iVar2;
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i4) {
        if (this.f35524f == null) {
            return false;
        }
        int w4 = w();
        int scrollX = getScrollX();
        return i4 < 0 ? scrollX > ((int) (((float) w4) * this.f35536r)) : i4 > 0 && scrollX < ((int) (((float) w4) * this.f35537s));
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f35530l = true;
        if (this.f35529k.isFinished() || !this.f35529k.computeScrollOffset()) {
            i(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f35529k.getCurrX();
        int currY = this.f35529k.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!M(currX)) {
                this.f35529k.abortAnimation();
                scrollTo(0, currY);
            }
        }
        x1.t1(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean d(int r5) {
        /*
            r4 = this;
            android.view.View r0 = r4.findFocus()
            r1 = 0
            if (r0 != r4) goto L9
        L7:
            r0 = r1
            goto L48
        L9:
            if (r0 == 0) goto L48
            android.view.ViewParent r2 = r0.getParent()
        Lf:
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L1b
            if (r2 != r4) goto L16
            goto L48
        L16:
            android.view.ViewParent r2 = r2.getParent()
            goto Lf
        L1b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
        L2f:
            boolean r3 = r0 instanceof android.view.ViewGroup
            if (r3 == 0) goto L7
            java.lang.String r3 = " => "
            r2.append(r3)
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
            goto L2f
        L48:
            android.view.FocusFinder r1 = android.view.FocusFinder.getInstance()
            android.view.View r1 = r1.findNextFocus(r4, r0, r5)
            r2 = 66
            r3 = 17
            if (r1 == 0) goto L98
            if (r1 == r0) goto L98
            if (r5 != r3) goto L78
            android.graphics.Rect r2 = r4.f35523e
            android.graphics.Rect r2 = r4.v(r2, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r4.f35523e
            android.graphics.Rect r3 = r4.v(r3, r0)
            int r3 = r3.left
            if (r0 == 0) goto L73
            if (r2 < r3) goto L73
            boolean r0 = r4.K()
            goto Laf
        L73:
            boolean r0 = r1.requestFocus()
            goto Laf
        L78:
            if (r5 != r2) goto La4
            android.graphics.Rect r2 = r4.f35523e
            android.graphics.Rect r2 = r4.v(r2, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r4.f35523e
            android.graphics.Rect r3 = r4.v(r3, r0)
            int r3 = r3.left
            if (r0 == 0) goto L93
            if (r2 > r3) goto L93
            boolean r0 = r4.L()
            goto Laf
        L93:
            boolean r0 = r1.requestFocus()
            goto Laf
        L98:
            if (r5 == r3) goto Lab
            r0 = 1
            if (r5 != r0) goto L9e
            goto Lab
        L9e:
            if (r5 == r2) goto La6
            r0 = 2
            if (r5 != r0) goto La4
            goto La6
        La4:
            r0 = 0
            goto Laf
        La6:
            boolean r0 = r4.L()
            goto Laf
        Lab:
            boolean r0 = r4.K()
        Laf:
            if (r0 == 0) goto Lb8
            int r5 = android.view.SoundEffectConstants.getContantForFocusDirection(r5)
            r4.playSoundEffect(r5)
        Lb8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.d(int):boolean");
    }

    public void d0(int i4) {
        if (i4 < 1) {
            i4 = 1;
        }
        if (i4 != this.f35543y) {
            this.f35543y = i4;
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
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() == 0 && (B = B(childAt)) != null && B.f35558b == this.f35525g && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
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
        boolean z4 = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (aVar = this.f35524f) != null && aVar.h() > 1)) {
            if (!this.Q.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.f35536r * width);
                this.Q.setSize(height, width);
                z4 = this.Q.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.R.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.f35537s + 1.0f)) * width2);
                this.R.setSize(height2, width2);
                z4 |= this.R.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.Q.finish();
            this.R.finish();
        }
        if (z4) {
            x1.t1(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f35533o;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public boolean e() {
        if (this.f35544z) {
            return false;
        }
        this.O = true;
        k0(1);
        this.E = 0.0f;
        this.G = 0.0f;
        VelocityTracker velocityTracker = this.J;
        if (velocityTracker == null) {
            this.J = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
        this.J.addMovement(obtain);
        obtain.recycle();
        this.P = uptimeMillis;
        return true;
    }

    @Deprecated
    public void e0(i iVar) {
        this.O2 = iVar;
    }

    public void f0(int i4) {
        int i5 = this.f35532n;
        this.f35532n = i4;
        int width = getWidth();
        Q(width, width, i4, i5);
        requestLayout();
    }

    protected boolean g(View view, boolean z4, int i4, int i5, int i6) {
        int i7;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i10 = i5 + scrollX;
                if (i10 >= childAt.getLeft() && i10 < childAt.getRight() && (i7 = i6 + scrollY) >= childAt.getTop() && i7 < childAt.getBottom() && g(childAt, true, i4, i10 - childAt.getLeft(), i7 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z4 && view.canScrollHorizontally(-i4);
    }

    public void g0(@v int i4) {
        h0(androidx.core.content.d.getDrawable(getContext(), i4));
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
    protected int getChildDrawingOrder(int i4, int i5) {
        if (this.T2 == 2) {
            i5 = (i4 - 1) - i5;
        }
        return ((LayoutParams) this.U2.get(i5).getLayoutParams()).f35550f;
    }

    public void h() {
        List<i> list = this.N2;
        if (list != null) {
            list.clear();
        }
    }

    public void h0(@q0 Drawable drawable) {
        this.f35533o = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void i0(boolean z4, @q0 j jVar) {
        j0(z4, jVar, 2);
    }

    void j() {
        int h4 = this.f35524f.h();
        this.f35520b = h4;
        boolean z4 = this.f35521c.size() < (this.f35543y * 2) + 1 && this.f35521c.size() < h4;
        int i4 = this.f35525g;
        int i5 = 0;
        boolean z5 = false;
        while (i5 < this.f35521c.size()) {
            f fVar = this.f35521c.get(i5);
            int i6 = this.f35524f.i(fVar.f35557a);
            if (i6 != -1) {
                if (i6 == -2) {
                    this.f35521c.remove(i5);
                    i5--;
                    if (!z5) {
                        this.f35524f.w(this);
                        z5 = true;
                    }
                    this.f35524f.e(this, fVar.f35558b, fVar.f35557a);
                    int i7 = this.f35525g;
                    if (i7 == fVar.f35558b) {
                        i4 = Math.max(0, Math.min(i7, h4 - 1));
                    }
                } else {
                    int i10 = fVar.f35558b;
                    if (i10 != i6) {
                        if (i10 == this.f35525g) {
                            i4 = i6;
                        }
                        fVar.f35558b = i6;
                    }
                }
                z4 = true;
            }
            i5++;
        }
        if (z5) {
            this.f35524f.g(this);
        }
        Collections.sort(this.f35521c, f35509g3);
        if (z4) {
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i11).getLayoutParams();
                if (!layoutParams.f35545a) {
                    layoutParams.f35547c = 0.0f;
                }
            }
            a0(i4, false, true);
            requestLayout();
        }
    }

    public void j0(boolean z4, @q0 j jVar, int i4) {
        boolean z5 = jVar != null;
        boolean z6 = z5 != (this.R2 != null);
        this.R2 = jVar;
        setChildrenDrawingOrderEnabled(z5);
        if (z5) {
            this.T2 = z4 ? 2 : 1;
            this.S2 = i4;
        } else {
            this.T2 = 0;
        }
        if (z6) {
            O();
        }
    }

    void k0(int i4) {
        if (this.W2 == i4) {
            return;
        }
        this.W2 = i4;
        if (this.R2 != null) {
            p(i4 != 0);
        }
        n(i4);
    }

    void m0(int i4, int i5) {
        n0(i4, i5, 0);
    }

    void n0(int i4, int i5, int i6) {
        int scrollX;
        if (getChildCount() == 0) {
            l0(false);
            return;
        }
        Scroller scroller = this.f35529k;
        if (scroller == null || scroller.isFinished()) {
            scrollX = getScrollX();
        } else {
            scrollX = this.f35530l ? this.f35529k.getCurrX() : this.f35529k.getStartX();
            this.f35529k.abortAnimation();
            l0(false);
        }
        int i7 = scrollX;
        int scrollY = getScrollY();
        int i10 = i4 - i7;
        int i11 = i5 - scrollY;
        if (i10 == 0 && i11 == 0) {
            i(false);
            O();
            k0(0);
            return;
        }
        l0(true);
        k0(2);
        int w4 = w();
        int i12 = w4 / 2;
        float f4 = w4;
        float f5 = i12;
        float o4 = (o(Math.min(1.0f, (Math.abs(i10) * 1.0f) / f4)) * f5) + f5;
        int abs = Math.abs(i6);
        int min = Math.min(abs > 0 ? Math.round(Math.abs(o4 / abs) * 1000.0f) * 4 : (int) (((Math.abs(i10) / ((this.f35524f.k(this.f35525g) * f4) + this.f35532n)) + 1.0f) * 100.0f), 600);
        this.f35530l = false;
        this.f35529k.startScroll(i7, scrollY, i10, i11, min);
        x1.t1(this);
    }

    float o(float f4) {
        return (float) Math.sin((f4 - 0.5f) * 0.47123894f);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Q1 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.V2);
        Scroller scroller = this.f35529k;
        if (scroller != null && !scroller.isFinished()) {
            this.f35529k.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int i4;
        float f4;
        float f5;
        super.onDraw(canvas);
        if (this.f35532n <= 0 || this.f35533o == null || this.f35521c.size() <= 0 || this.f35524f == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f6 = this.f35532n / width;
        int i5 = 0;
        f fVar = this.f35521c.get(0);
        float f7 = fVar.f35561e;
        int size = this.f35521c.size();
        int i6 = fVar.f35558b;
        int i7 = this.f35521c.get(size - 1).f35558b;
        while (i6 < i7) {
            while (true) {
                i4 = fVar.f35558b;
                if (i6 <= i4 || i5 >= size) {
                    break;
                }
                i5++;
                fVar = this.f35521c.get(i5);
            }
            if (i6 == i4) {
                float f10 = fVar.f35561e;
                float f11 = fVar.f35560d;
                f4 = (f10 + f11) * width;
                f7 = f10 + f11 + f6;
            } else {
                float k4 = this.f35524f.k(i6);
                f4 = (f7 + k4) * width;
                f7 = k4 + f6 + f7;
            }
            if (this.f35532n + f4 > scrollX) {
                f5 = f6;
                this.f35533o.setBounds(Math.round(f4), this.f35534p, Math.round(this.f35532n + f4), this.f35535q);
                this.f35533o.draw(canvas);
            } else {
                f5 = f6;
            }
            if (f4 > scrollX + r2) {
                return;
            }
            i6++;
            f6 = f5;
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
            if (this.f35544z) {
                return true;
            }
            if (this.A) {
                return false;
            }
        }
        if (action == 0) {
            float x4 = motionEvent.getX();
            this.G = x4;
            this.E = x4;
            float y4 = motionEvent.getY();
            this.H = y4;
            this.F = y4;
            this.I = motionEvent.getPointerId(0);
            this.A = false;
            this.f35530l = true;
            this.f35529k.computeScrollOffset();
            if (this.W2 != 2 || Math.abs(this.f35529k.getFinalX() - this.f35529k.getCurrX()) <= this.N) {
                i(false);
                this.f35544z = false;
            } else {
                this.f35529k.abortAnimation();
                this.f35542x = false;
                O();
                this.f35544z = true;
                U(true);
                k0(1);
            }
        } else if (action == 2) {
            int i4 = this.I;
            if (i4 != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i4);
                float x5 = motionEvent.getX(findPointerIndex);
                float f4 = x5 - this.E;
                float abs = Math.abs(f4);
                float y5 = motionEvent.getY(findPointerIndex);
                float abs2 = Math.abs(y5 - this.H);
                if (f4 != 0.0f && !H(this.E, f4) && g(this, false, (int) f4, (int) x5, (int) y5)) {
                    this.E = x5;
                    this.F = y5;
                    this.A = true;
                    return false;
                }
                int i5 = this.D;
                if (abs > i5 && abs * 0.5f > abs2) {
                    this.f35544z = true;
                    U(true);
                    k0(1);
                    float f5 = this.G;
                    float f6 = this.D;
                    this.E = f4 > 0.0f ? f5 + f6 : f5 - f6;
                    this.F = y5;
                    l0(true);
                } else if (abs2 > i5) {
                    this.A = true;
                }
                if (this.f35544z && N(x5)) {
                    x1.t1(this);
                }
            }
        } else if (action == 6) {
            J(motionEvent);
        }
        if (this.J == null) {
            this.J = VelocityTracker.obtain();
        }
        this.J.addMovement(motionEvent);
        return this.f35544z;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        LayoutParams layoutParams;
        LayoutParams layoutParams2;
        int i6;
        setMeasuredDimension(View.getDefaultSize(0, i4), View.getDefaultSize(0, i5));
        int measuredWidth = getMeasuredWidth();
        this.C = Math.min(measuredWidth / 10, this.B);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i7 = 0;
        while (true) {
            boolean z4 = true;
            int i10 = 1073741824;
            if (i7 >= childCount) {
                break;
            }
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8 && (layoutParams2 = (LayoutParams) childAt.getLayoutParams()) != null && layoutParams2.f35545a) {
                int i11 = layoutParams2.f35546b;
                int i12 = i11 & 7;
                int i13 = i11 & 112;
                boolean z5 = i13 == 48 || i13 == 80;
                if (i12 != 3 && i12 != 5) {
                    z4 = false;
                }
                int i14 = Integer.MIN_VALUE;
                if (z5) {
                    i6 = Integer.MIN_VALUE;
                    i14 = 1073741824;
                } else {
                    i6 = z4 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i15 = ((ViewGroup.LayoutParams) layoutParams2).width;
                if (i15 != -2) {
                    if (i15 == -1) {
                        i15 = paddingLeft;
                    }
                    i14 = 1073741824;
                } else {
                    i15 = paddingLeft;
                }
                int i16 = ((ViewGroup.LayoutParams) layoutParams2).height;
                if (i16 == -2) {
                    i16 = measuredHeight;
                    i10 = i6;
                } else if (i16 == -1) {
                    i16 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i15, i14), View.MeasureSpec.makeMeasureSpec(i16, i10));
                if (z5) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z4) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i7++;
        }
        this.f35538t = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f35539u = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f35540v = true;
        O();
        this.f35540v = false;
        int childCount2 = getChildCount();
        for (int i17 = 0; i17 < childCount2; i17++) {
            View childAt2 = getChildAt(i17);
            if (childAt2.getVisibility() != 8 && ((layoutParams = (LayoutParams) childAt2.getLayoutParams()) == null || !layoutParams.f35545a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * layoutParams.f35547c), 1073741824), this.f35539u);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i4, Rect rect) {
        int i5;
        int i6;
        int i7;
        f B;
        int childCount = getChildCount();
        if ((i4 & 2) != 0) {
            i6 = childCount;
            i5 = 0;
            i7 = 1;
        } else {
            i5 = childCount - 1;
            i6 = -1;
            i7 = -1;
        }
        while (i5 != i6) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() == 0 && (B = B(childAt)) != null && B.f35558b == this.f35525g && childAt.requestFocus(i4, rect)) {
                return true;
            }
            i5 += i7;
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
        androidx.viewpager.widget.a aVar = this.f35524f;
        if (aVar != null) {
            aVar.q(savedState.f35552e, savedState.f35553f);
            a0(savedState.f35551d, false, true);
        } else {
            this.f35526h = savedState.f35551d;
            this.f35527i = savedState.f35552e;
            this.f35528j = savedState.f35553f;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f35551d = this.f35525g;
        androidx.viewpager.widget.a aVar = this.f35524f;
        if (aVar != null) {
            savedState.f35552e = aVar.r();
        }
        return savedState;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        if (i4 != i6) {
            int i10 = this.f35532n;
            Q(i4, i6, i10, i10);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        androidx.viewpager.widget.a aVar;
        if (this.O) {
            return true;
        }
        boolean z4 = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (aVar = this.f35524f) == null || aVar.h() == 0) {
            return false;
        }
        if (this.J == null) {
            this.J = VelocityTracker.obtain();
        }
        this.J.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f35529k.abortAnimation();
            this.f35542x = false;
            O();
            float x4 = motionEvent.getX();
            this.G = x4;
            this.E = x4;
            float y4 = motionEvent.getY();
            this.H = y4;
            this.F = y4;
            this.I = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.f35544z) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.I);
                    if (findPointerIndex == -1) {
                        z4 = V();
                    } else {
                        float x5 = motionEvent.getX(findPointerIndex);
                        float abs = Math.abs(x5 - this.E);
                        float y5 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y5 - this.F);
                        if (abs > this.D && abs > abs2) {
                            this.f35544z = true;
                            U(true);
                            float f4 = this.G;
                            this.E = x5 - f4 > 0.0f ? f4 + this.D : f4 - this.D;
                            this.F = y5;
                            k0(1);
                            l0(true);
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.f35544z) {
                    z4 = N(motionEvent.getX(motionEvent.findPointerIndex(this.I)));
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    this.E = motionEvent.getX(actionIndex);
                    this.I = motionEvent.getPointerId(actionIndex);
                } else if (action == 6) {
                    J(motionEvent);
                    this.E = motionEvent.getX(motionEvent.findPointerIndex(this.I));
                }
            } else if (this.f35544z) {
                W(this.f35525g, true, 0, false);
                z4 = V();
            }
        } else if (this.f35544z) {
            VelocityTracker velocityTracker = this.J;
            velocityTracker.computeCurrentVelocity(1000, this.L);
            int xVelocity = (int) velocityTracker.getXVelocity(this.I);
            this.f35542x = true;
            int w4 = w();
            int scrollX = getScrollX();
            f C = C();
            float f5 = w4;
            b0(k(C.f35558b, ((scrollX / f5) - C.f35561e) / (C.f35560d + (this.f35532n / f5)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.I)) - this.G)), true, true, xVelocity);
            z4 = V();
        }
        if (z4) {
            x1.t1(this);
        }
        return true;
    }

    public void r() {
        if (!this.O) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (this.f35524f != null) {
            VelocityTracker velocityTracker = this.J;
            velocityTracker.computeCurrentVelocity(1000, this.L);
            int xVelocity = (int) velocityTracker.getXVelocity(this.I);
            this.f35542x = true;
            int w4 = w();
            int scrollX = getScrollX();
            f C = C();
            b0(k(C.f35558b, ((scrollX / w4) - C.f35561e) / C.f35560d, xVelocity, (int) (this.E - this.G)), true, true, xVelocity);
        }
        q();
        this.O = false;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.f35540v) {
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

    public void t(float f4) {
        if (!this.O) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (this.f35524f == null) {
            return;
        }
        this.E += f4;
        float scrollX = getScrollX() - f4;
        float w4 = w();
        float f5 = this.f35536r * w4;
        float f6 = this.f35537s * w4;
        f fVar = this.f35521c.get(0);
        f fVar2 = (f) z4.a(this.f35521c, 1);
        if (fVar.f35558b != 0) {
            f5 = fVar.f35561e * w4;
        }
        if (fVar2.f35558b != this.f35524f.h() - 1) {
            f6 = fVar2.f35561e * w4;
        }
        if (scrollX < f5) {
            scrollX = f5;
        } else if (scrollX > f6) {
            scrollX = f6;
        }
        int i4 = (int) scrollX;
        this.E = (scrollX - i4) + this.E;
        scrollTo(i4, getScrollY());
        M(i4);
        MotionEvent obtain = MotionEvent.obtain(this.P, SystemClock.uptimeMillis(), 2, this.E, 0.0f, 0);
        this.J.addMovement(obtain);
        obtain.recycle();
    }

    @q0
    public androidx.viewpager.widget.a u() {
        return this.f35524f;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f35533o;
    }

    public int x() {
        return this.f35525g;
    }

    public int y() {
        return this.f35543y;
    }

    public int z() {
        return this.f35532n;
    }

    public static class LayoutParams extends ViewGroup.LayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public boolean f35545a;

        /* renamed from: b, reason: collision with root package name */
        public int f35546b;

        /* renamed from: c, reason: collision with root package name */
        float f35547c;

        /* renamed from: d, reason: collision with root package name */
        boolean f35548d;

        /* renamed from: e, reason: collision with root package name */
        int f35549e;

        /* renamed from: f, reason: collision with root package name */
        int f35550f;

        public LayoutParams() {
            super(-1, -1);
            this.f35547c = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f35547c = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f35508f3);
            this.f35546b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public ViewPager(@o0 Context context, @q0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35521c = new ArrayList<>();
        this.f35522d = new f();
        this.f35523e = new Rect();
        this.f35526h = -1;
        this.f35527i = null;
        this.f35528j = null;
        this.f35536r = -3.4028235E38f;
        this.f35537s = Float.MAX_VALUE;
        this.f35543y = 1;
        this.I = -1;
        this.Q1 = true;
        this.V1 = false;
        this.V2 = new c();
        this.W2 = 0;
        E();
    }
}
