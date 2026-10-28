package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.annotation.c1;
import androidx.annotation.d0;
import androidx.annotation.l;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x;
import androidx.core.util.v;
import androidx.core.view.a1;
import androidx.core.view.c1;
import androidx.core.view.d1;
import androidx.core.view.f0;
import androidx.core.view.j3;
import androidx.core.view.x1;
import androidx.core.view.z0;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.badge.BadgeDrawable;
import com.google.firebase.remoteconfig.p;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import y0.a;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements z0, a1 {
    static final ThreadLocal<Map<String, Constructor<Behavior>>> A;
    static final int B = 0;
    static final int C = 1;
    static final int D = 2;
    static final Comparator<View> E;
    private static final v.a<Rect> F;

    /* renamed from: v, reason: collision with root package name */
    static final String f25301v = "CoordinatorLayout";

    /* renamed from: w, reason: collision with root package name */
    static final String f25302w;

    /* renamed from: x, reason: collision with root package name */
    private static final int f25303x = 0;

    /* renamed from: y, reason: collision with root package name */
    private static final int f25304y = 1;

    /* renamed from: z, reason: collision with root package name */
    static final Class<?>[] f25305z;

    /* renamed from: b, reason: collision with root package name */
    private final List<View> f25306b;

    /* renamed from: c, reason: collision with root package name */
    private final androidx.coordinatorlayout.widget.b<View> f25307c;

    /* renamed from: d, reason: collision with root package name */
    private final List<View> f25308d;

    /* renamed from: e, reason: collision with root package name */
    private final List<View> f25309e;

    /* renamed from: f, reason: collision with root package name */
    private Paint f25310f;

    /* renamed from: g, reason: collision with root package name */
    private final int[] f25311g;

    /* renamed from: h, reason: collision with root package name */
    private final int[] f25312h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f25313i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f25314j;

    /* renamed from: k, reason: collision with root package name */
    private int[] f25315k;

    /* renamed from: l, reason: collision with root package name */
    private View f25316l;

    /* renamed from: m, reason: collision with root package name */
    private View f25317m;

    /* renamed from: n, reason: collision with root package name */
    private g f25318n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f25319o;

    /* renamed from: p, reason: collision with root package name */
    private j3 f25320p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f25321q;

    /* renamed from: r, reason: collision with root package name */
    private Drawable f25322r;

    /* renamed from: s, reason: collision with root package name */
    ViewGroup.OnHierarchyChangeListener f25323s;

    /* renamed from: t, reason: collision with root package name */
    private d1 f25324t;

    /* renamed from: u, reason: collision with root package name */
    private final c1 f25325u;

    public static abstract class Behavior<V extends View> {
        public Behavior() {
        }

        public static void F(@o0 View view, @q0 Object obj) {
            ((f) view.getLayoutParams()).f25346r = obj;
        }

        @q0
        public static Object e(@o0 View view) {
            return ((f) view.getLayoutParams()).f25346r;
        }

        @Deprecated
        public boolean A(@o0 CoordinatorLayout coordinatorLayout, @o0 V v4, @o0 View view, @o0 View view2, int i4) {
            return false;
        }

        public boolean B(@o0 CoordinatorLayout coordinatorLayout, @o0 V v4, @o0 View view, @o0 View view2, int i4, int i5) {
            if (i5 == 0) {
                return A(coordinatorLayout, v4, view, view2, i4);
            }
            return false;
        }

        @Deprecated
        public void C(@o0 CoordinatorLayout coordinatorLayout, @o0 V v4, @o0 View view) {
        }

        public void D(@o0 CoordinatorLayout coordinatorLayout, @o0 V v4, @o0 View view, int i4) {
            if (i4 == 0) {
                C(coordinatorLayout, v4, view);
            }
        }

        public boolean E(@o0 CoordinatorLayout coordinatorLayout, @o0 V v4, @o0 MotionEvent motionEvent) {
            return false;
        }

        public boolean a(@o0 CoordinatorLayout coordinatorLayout, @o0 V v4) {
            return d(coordinatorLayout, v4) > 0.0f;
        }

        public boolean b(@o0 CoordinatorLayout coordinatorLayout, @o0 V v4, @o0 Rect rect) {
            return false;
        }

        @l
        public int c(@o0 CoordinatorLayout coordinatorLayout, @o0 V v4) {
            return x1.f27484y;
        }

        @x(from = p.f60679p, to = 1.0d)
        public float d(@o0 CoordinatorLayout coordinatorLayout, @o0 V v4) {
            return 0.0f;
        }

        public boolean f(@o0 CoordinatorLayout coordinatorLayout, @o0 V v4, @o0 View view) {
            return false;
        }

        @o0
        public j3 g(@o0 CoordinatorLayout coordinatorLayout, @o0 V v4, @o0 j3 j3Var) {
            return j3Var;
        }

        public void h(@o0 f fVar) {
        }

        public boolean i(@o0 CoordinatorLayout coordinatorLayout, @o0 V v4, @o0 View view) {
            return false;
        }

        public void j(@o0 CoordinatorLayout coordinatorLayout, @o0 V v4, @o0 View view) {
        }

        public void k() {
        }

        public boolean l(@o0 CoordinatorLayout coordinatorLayout, @o0 V v4, @o0 MotionEvent motionEvent) {
            return false;
        }

        public boolean m(@o0 CoordinatorLayout coordinatorLayout, @o0 V v4, int i4) {
            return false;
        }

        public boolean n(@o0 CoordinatorLayout coordinatorLayout, @o0 V v4, int i4, int i5, int i6, int i7) {
            return false;
        }

        public boolean o(@o0 CoordinatorLayout coordinatorLayout, @o0 V v4, @o0 View view, float f4, float f5, boolean z4) {
            return false;
        }

        public boolean p(@o0 CoordinatorLayout coordinatorLayout, @o0 V v4, @o0 View view, float f4, float f5) {
            return false;
        }

        @Deprecated
        public void q(@o0 CoordinatorLayout coordinatorLayout, @o0 V v4, @o0 View view, int i4, int i5, @o0 int[] iArr) {
        }

        public void r(@o0 CoordinatorLayout coordinatorLayout, @o0 V v4, @o0 View view, int i4, int i5, @o0 int[] iArr, int i6) {
            if (i6 == 0) {
                q(coordinatorLayout, v4, view, i4, i5, iArr);
            }
        }

        @Deprecated
        public void s(@o0 CoordinatorLayout coordinatorLayout, @o0 V v4, @o0 View view, int i4, int i5, int i6, int i7) {
        }

        @Deprecated
        public void t(@o0 CoordinatorLayout coordinatorLayout, @o0 V v4, @o0 View view, int i4, int i5, int i6, int i7, int i10) {
            if (i10 == 0) {
                s(coordinatorLayout, v4, view, i4, i5, i6, i7);
            }
        }

        public void u(@o0 CoordinatorLayout coordinatorLayout, @o0 V v4, @o0 View view, int i4, int i5, int i6, int i7, int i10, @o0 int[] iArr) {
            iArr[0] = iArr[0] + i6;
            iArr[1] = iArr[1] + i7;
            t(coordinatorLayout, v4, view, i4, i5, i6, i7, i10);
        }

        @Deprecated
        public void v(@o0 CoordinatorLayout coordinatorLayout, @o0 V v4, @o0 View view, @o0 View view2, int i4) {
        }

        public void w(@o0 CoordinatorLayout coordinatorLayout, @o0 V v4, @o0 View view, @o0 View view2, int i4, int i5) {
            if (i5 == 0) {
                v(coordinatorLayout, v4, view, view2, i4);
            }
        }

        public boolean x(@o0 CoordinatorLayout coordinatorLayout, @o0 V v4, @o0 Rect rect, boolean z4) {
            return false;
        }

        public void y(@o0 CoordinatorLayout coordinatorLayout, @o0 V v4, @o0 Parcelable parcelable) {
        }

        @q0
        public Parcelable z(@o0 CoordinatorLayout coordinatorLayout, @o0 V v4) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
        }
    }

    class a implements d1 {
        a() {
        }

        @Override // androidx.core.view.d1
        public j3 a(View view, j3 j3Var) {
            return CoordinatorLayout.this.k0(j3Var);
        }
    }

    public interface b {
        @o0
        Behavior b();
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    public @interface c {
        Class<? extends Behavior> value();
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    private class e implements ViewGroup.OnHierarchyChangeListener {
        e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f25323s;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.S(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f25323s;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    class g implements ViewTreeObserver.OnPreDrawListener {
        g() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.S(0);
            return true;
        }
    }

    static class h implements Comparator<View> {
        h() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            float I0 = x1.I0(view);
            float I02 = x1.I0(view2);
            if (I0 > I02) {
                return -1;
            }
            return I0 < I02 ? 1 : 0;
        }
    }

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        f25302w = r02 != null ? r02.getName() : null;
        E = new h();
        f25305z = new Class[]{Context.class, AttributeSet.class};
        A = new ThreadLocal<>();
        F = new v.c(12);
    }

    public CoordinatorLayout(@o0 Context context) {
        this(context, null);
    }

    private void E(View view, int i4, Rect rect, Rect rect2, f fVar, int i5, int i6) {
        int absoluteGravity = Gravity.getAbsoluteGravity(c0(fVar.f25331c), i4);
        int absoluteGravity2 = Gravity.getAbsoluteGravity(d0(fVar.f25332d), i4);
        int i7 = absoluteGravity & 7;
        int i10 = absoluteGravity & 112;
        int i11 = absoluteGravity2 & 7;
        int i12 = absoluteGravity2 & 112;
        int width = i11 != 1 ? i11 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i12 != 16 ? i12 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i7 == 1) {
            width -= i5 / 2;
        } else if (i7 != 5) {
            width -= i5;
        }
        if (i10 == 16) {
            height -= i6 / 2;
        } else if (i10 != 80) {
            height -= i6;
        }
        rect2.set(width, height, i5 + width, i6 + height);
    }

    private int F(int i4) {
        int[] iArr = this.f25315k;
        if (iArr == null) {
            toString();
            return 0;
        }
        if (i4 >= 0 && i4 < iArr.length) {
            return iArr[i4];
        }
        toString();
        return 0;
    }

    private void K(List<View> list) {
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i4) : i4));
        }
        Comparator<View> comparator = E;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    private boolean L(View view) {
        return this.f25307c.j(view);
    }

    private void N(View view, int i4) {
        f fVar = (f) view.getLayoutParams();
        Rect d5 = d();
        d5.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
        if (this.f25320p != null && x1.W(this) && !view.getFitsSystemWindows()) {
            d5.left = this.f25320p.p() + d5.left;
            d5.top = this.f25320p.r() + d5.top;
            d5.right -= this.f25320p.q();
            d5.bottom -= this.f25320p.o();
        }
        Rect d6 = d();
        Gravity.apply(d0(fVar.f25331c), view.getMeasuredWidth(), view.getMeasuredHeight(), d5, d6, i4);
        view.layout(d6.left, d6.top, d6.right, d6.bottom);
        Z(d5);
        Z(d6);
    }

    private void O(View view, View view2, int i4) {
        Rect d5 = d();
        Rect d6 = d();
        try {
            C(view2, d5);
            D(view, i4, d5, d6);
            view.layout(d6.left, d6.top, d6.right, d6.bottom);
        } finally {
            Z(d5);
            Z(d6);
        }
    }

    private void P(View view, int i4, int i5) {
        f fVar = (f) view.getLayoutParams();
        int absoluteGravity = Gravity.getAbsoluteGravity(e0(fVar.f25331c), i5);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i5 == 1) {
            i4 = width - i4;
        }
        int F2 = F(i4) - measuredWidth;
        if (i6 == 1) {
            F2 += measuredWidth / 2;
        } else if (i6 == 5) {
            F2 += measuredWidth;
        }
        int i10 = i7 != 16 ? i7 != 80 ? 0 : measuredHeight : measuredHeight / 2;
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(F2, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(i10, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    private void Q(View view, Rect rect, int i4) {
        boolean z4;
        boolean z5;
        int width;
        int i5;
        int i6;
        int i7;
        int height;
        int i10;
        int i11;
        int i12;
        if (x1.Y0(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            f fVar = (f) view.getLayoutParams();
            Behavior f4 = fVar.f();
            Rect d5 = d();
            Rect d6 = d();
            d6.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (f4 == null || !f4.b(this, view, d5)) {
                d5.set(d6);
            } else if (!d6.contains(d5)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + d5.toShortString() + " | Bounds:" + d6.toShortString());
            }
            Z(d6);
            if (d5.isEmpty()) {
                Z(d5);
                return;
            }
            int absoluteGravity = Gravity.getAbsoluteGravity(fVar.f25336h, i4);
            boolean z6 = true;
            if ((absoluteGravity & 48) != 48 || (i11 = (d5.top - ((ViewGroup.MarginLayoutParams) fVar).topMargin) - fVar.f25338j) >= (i12 = rect.top)) {
                z4 = false;
            } else {
                g0(view, i12 - i11);
                z4 = true;
            }
            if ((absoluteGravity & 80) == 80 && (height = ((getHeight() - d5.bottom) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) + fVar.f25338j) < (i10 = rect.bottom)) {
                g0(view, height - i10);
                z4 = true;
            }
            if (!z4) {
                g0(view, 0);
            }
            if ((absoluteGravity & 3) != 3 || (i6 = (d5.left - ((ViewGroup.MarginLayoutParams) fVar).leftMargin) - fVar.f25337i) >= (i7 = rect.left)) {
                z5 = false;
            } else {
                f0(view, i7 - i6);
                z5 = true;
            }
            if ((absoluteGravity & 5) != 5 || (width = ((getWidth() - d5.right) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin) + fVar.f25337i) >= (i5 = rect.right)) {
                z6 = z5;
            } else {
                f0(view, width - i5);
            }
            if (!z6) {
                f0(view, 0);
            }
            Z(d5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static Behavior V(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = f25302w;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<Behavior>>> threadLocal = A;
            Map<String, Constructor<Behavior>> map = threadLocal.get();
            if (map == null) {
                map = new HashMap<>();
                threadLocal.set(map);
            }
            Constructor<Behavior> constructor = map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f25305z);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return constructor.newInstance(context, attributeSet);
        } catch (Exception e4) {
            throw new RuntimeException(androidx.constraintlayout.core.motion.key.c.a("Could not inflate Behavior subclass ", str), e4);
        }
    }

    private boolean W(MotionEvent motionEvent, int i4) {
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f25308d;
        K(list);
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z4 = false;
        boolean z5 = false;
        for (int i5 = 0; i5 < size; i5++) {
            View view = list.get(i5);
            f fVar = (f) view.getLayoutParams();
            Behavior f4 = fVar.f();
            if (!(z4 || z5) || actionMasked == 0) {
                if (!z4 && f4 != null) {
                    if (i4 == 0) {
                        z4 = f4.l(this, view, motionEvent);
                    } else if (i4 == 1) {
                        z4 = f4.E(this, view, motionEvent);
                    }
                    if (z4) {
                        this.f25316l = view;
                    }
                }
                boolean c5 = fVar.c();
                boolean j4 = fVar.j(this, view);
                z5 = j4 && !c5;
                if (j4 && !z5) {
                    break;
                }
            } else if (f4 != null) {
                if (motionEvent2 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i4 == 0) {
                    f4.l(this, view, motionEvent2);
                } else if (i4 == 1) {
                    f4.E(this, view, motionEvent2);
                }
            }
        }
        list.clear();
        return z4;
    }

    private void X() {
        this.f25306b.clear();
        this.f25307c.c();
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            f I = I(childAt);
            I.d(this, childAt);
            this.f25307c.b(childAt);
            for (int i5 = 0; i5 < childCount; i5++) {
                if (i5 != i4) {
                    View childAt2 = getChildAt(i5);
                    if (I.b(this, childAt, childAt2)) {
                        if (!this.f25307c.d(childAt2)) {
                            this.f25307c.b(childAt2);
                        }
                        this.f25307c.a(childAt2, childAt);
                    }
                }
            }
        }
        this.f25306b.addAll(this.f25307c.i());
        Collections.reverse(this.f25306b);
    }

    private static void Z(@o0 Rect rect) {
        rect.setEmpty();
        F.release(rect);
    }

    private void b0(boolean z4) {
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            Behavior f4 = ((f) childAt.getLayoutParams()).f();
            if (f4 != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z4) {
                    f4.l(this, childAt, obtain);
                } else {
                    f4.E(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            ((f) getChildAt(i5).getLayoutParams()).n();
        }
        this.f25316l = null;
        this.f25313i = false;
    }

    private static int c0(int i4) {
        if (i4 == 0) {
            return 17;
        }
        return i4;
    }

    @o0
    private static Rect d() {
        Rect acquire = F.acquire();
        return acquire == null ? new Rect() : acquire;
    }

    private static int d0(int i4) {
        if ((i4 & 7) == 0) {
            i4 |= f0.f27129b;
        }
        return (i4 & 112) == 0 ? i4 | 48 : i4;
    }

    private static int e0(int i4) {
        return i4 == 0 ? BadgeDrawable.f52613r : i4;
    }

    private void f0(View view, int i4) {
        f fVar = (f) view.getLayoutParams();
        int i5 = fVar.f25337i;
        if (i5 != i4) {
            x1.i1(view, i4 - i5);
            fVar.f25337i = i4;
        }
    }

    private void g0(View view, int i4) {
        f fVar = (f) view.getLayoutParams();
        int i5 = fVar.f25338j;
        if (i5 != i4) {
            x1.j1(view, i4 - i5);
            fVar.f25338j = i4;
        }
    }

    private void l0() {
        if (!x1.W(this)) {
            x1.k2(this, null);
            return;
        }
        if (this.f25324t == null) {
            this.f25324t = new a();
        }
        x1.k2(this, this.f25324t);
        setSystemUiVisibility(1280);
    }

    private static int m(int i4, int i5, int i6) {
        return i4 < i5 ? i5 : i4 > i6 ? i6 : i4;
    }

    private void n(f fVar, Rect rect, int i4, int i5) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i4) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i5) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        rect.set(max, max2, i4 + max, i5 + max2);
    }

    private j3 o(j3 j3Var) {
        Behavior f4;
        if (j3Var.A()) {
            return j3Var;
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (x1.W(childAt) && (f4 = ((f) childAt.getLayoutParams()).f()) != null) {
                j3Var = f4.g(this, childAt, j3Var);
                if (j3Var.A()) {
                    break;
                }
            }
        }
        return j3Var;
    }

    @m1
    final List<View> A() {
        X();
        return Collections.unmodifiableList(this.f25306b);
    }

    @o0
    public List<View> B(@o0 View view) {
        List g4 = this.f25307c.g(view);
        this.f25309e.clear();
        if (g4 != null) {
            this.f25309e.addAll(g4);
        }
        return this.f25309e;
    }

    void C(View view, Rect rect) {
        androidx.coordinatorlayout.widget.c.a(this, view, rect);
    }

    void D(View view, int i4, Rect rect, Rect rect2) {
        f fVar = (f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        E(view, i4, rect, rect2, fVar, measuredWidth, measuredHeight);
        n(fVar, rect2, measuredWidth, measuredHeight);
    }

    void G(View view, Rect rect) {
        rect.set(((f) view.getLayoutParams()).h());
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public final j3 H() {
        return this.f25320p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    f I(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.f25330b) {
            if (view instanceof b) {
                fVar.q(((b) view).b());
                fVar.f25330b = true;
            } else {
                c cVar = null;
                for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    cVar = (c) cls.getAnnotation(c.class);
                    if (cVar != null) {
                        break;
                    }
                }
                if (cVar != null) {
                    try {
                        fVar.q(cVar.value().getDeclaredConstructor(null).newInstance(null));
                    } catch (Exception unused) {
                        cVar.value().getName();
                    }
                }
                fVar.f25330b = true;
            }
        }
        return fVar;
    }

    @q0
    public Drawable J() {
        return this.f25322r;
    }

    public boolean M(@o0 View view, int i4, int i5) {
        Rect d5 = d();
        C(view, d5);
        try {
            return d5.contains(i4, i5);
        } finally {
            Z(d5);
        }
    }

    void R(View view, int i4) {
        Behavior f4;
        f fVar = (f) view.getLayoutParams();
        if (fVar.f25339k != null) {
            Rect d5 = d();
            Rect d6 = d();
            Rect d7 = d();
            C(fVar.f25339k, d5);
            w(view, false, d6);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            E(view, i4, d5, d7, fVar, measuredWidth, measuredHeight);
            boolean z4 = (d7.left == d6.left && d7.top == d6.top) ? false : true;
            n(fVar, d7, measuredWidth, measuredHeight);
            int i5 = d7.left - d6.left;
            int i6 = d7.top - d6.top;
            if (i5 != 0) {
                x1.i1(view, i5);
            }
            if (i6 != 0) {
                x1.j1(view, i6);
            }
            if (z4 && (f4 = fVar.f()) != null) {
                f4.i(this, view, fVar.f25339k);
            }
            Z(d5);
            Z(d6);
            Z(d7);
        }
    }

    final void S(int i4) {
        boolean z4;
        int c02 = x1.c0(this);
        int size = this.f25306b.size();
        Rect d5 = d();
        Rect d6 = d();
        Rect d7 = d();
        for (int i5 = 0; i5 < size; i5++) {
            View view = this.f25306b.get(i5);
            f fVar = (f) view.getLayoutParams();
            if (i4 != 0 || view.getVisibility() != 8) {
                for (int i6 = 0; i6 < i5; i6++) {
                    if (fVar.f25340l == this.f25306b.get(i6)) {
                        R(view, c02);
                    }
                }
                w(view, true, d6);
                if (fVar.f25335g != 0 && !d6.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(fVar.f25335g, c02);
                    int i7 = absoluteGravity & 112;
                    if (i7 == 48) {
                        d5.top = Math.max(d5.top, d6.bottom);
                    } else if (i7 == 80) {
                        d5.bottom = Math.max(d5.bottom, getHeight() - d6.top);
                    }
                    int i10 = absoluteGravity & 7;
                    if (i10 == 3) {
                        d5.left = Math.max(d5.left, d6.right);
                    } else if (i10 == 5) {
                        d5.right = Math.max(d5.right, getWidth() - d6.left);
                    }
                }
                if (fVar.f25336h != 0 && view.getVisibility() == 0) {
                    Q(view, d5, c02);
                }
                if (i4 != 2) {
                    G(view, d7);
                    if (!d7.equals(d6)) {
                        Y(view, d6);
                    }
                }
                for (int i11 = i5 + 1; i11 < size; i11++) {
                    View view2 = this.f25306b.get(i11);
                    f fVar2 = (f) view2.getLayoutParams();
                    Behavior f4 = fVar2.f();
                    if (f4 != null && f4.f(this, view2, view)) {
                        if (i4 == 0 && fVar2.g()) {
                            fVar2.l();
                        } else {
                            if (i4 != 2) {
                                z4 = f4.i(this, view2, view);
                            } else {
                                f4.j(this, view2, view);
                                z4 = true;
                            }
                            if (i4 == 1) {
                                fVar2.r(z4);
                            }
                        }
                    }
                }
            }
        }
        Z(d5);
        Z(d6);
        Z(d7);
    }

    public void T(@o0 View view, int i4) {
        f fVar = (f) view.getLayoutParams();
        if (fVar.a()) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        View view2 = fVar.f25339k;
        if (view2 != null) {
            O(view, view2, i4);
            return;
        }
        int i5 = fVar.f25333e;
        if (i5 >= 0) {
            P(view, i5, i4);
        } else {
            N(view, i4);
        }
    }

    public void U(View view, int i4, int i5, int i6, int i7) {
        measureChildWithMargins(view, i4, i5, i6, i7);
    }

    void Y(View view, Rect rect) {
        ((f) view.getLayoutParams()).s(rect);
    }

    void a0() {
        if (this.f25314j && this.f25318n != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f25318n);
        }
        this.f25319o = false;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j4) {
        f fVar = (f) view.getLayoutParams();
        Behavior behavior = fVar.f25329a;
        if (behavior != null) {
            float d5 = behavior.d(this, view);
            if (d5 > 0.0f) {
                if (this.f25310f == null) {
                    this.f25310f = new Paint();
                }
                this.f25310f.setColor(fVar.f25329a.c(this, view));
                this.f25310f.setAlpha(m(Math.round(d5 * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.f25310f);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j4);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f25322r;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    void e() {
        if (this.f25314j) {
            if (this.f25318n == null) {
                this.f25318n = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f25318n);
        }
        this.f25319o = true;
    }

    @Override // android.view.ViewGroup, androidx.core.view.b1
    public int getNestedScrollAxes() {
        return this.f25325u.a();
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public void h0(@q0 Drawable drawable) {
        Drawable drawable2 = this.f25322r;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f25322r = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.f25322r.setState(getDrawableState());
                }
                this.f25322r.setLayoutDirection(x1.c0(this));
                this.f25322r.setVisible(getVisibility() == 0, false);
                this.f25322r.setCallback(this);
            }
            x1.t1(this);
        }
    }

    public void i0(@l int i4) {
        h0(new ColorDrawable(i4));
    }

    public void j0(@androidx.annotation.v int i4) {
        h0(i4 != 0 ? androidx.core.content.d.getDrawable(getContext(), i4) : null);
    }

    final j3 k0(j3 j3Var) {
        if (Objects.equals(this.f25320p, j3Var)) {
            return j3Var;
        }
        this.f25320p = j3Var;
        boolean z4 = false;
        boolean z5 = j3Var != null && j3Var.r() > 0;
        this.f25321q = z5;
        if (!z5 && getBackground() == null) {
            z4 = true;
        }
        setWillNotDraw(z4);
        j3 o4 = o(j3Var);
        requestLayout();
        return o4;
    }

    @Override // androidx.core.view.a1
    public void o0(@o0 View view, int i4, int i5, int i6, int i7, int i10, @o0 int[] iArr) {
        Behavior f4;
        boolean z4;
        int min;
        int childCount = getChildCount();
        boolean z5 = false;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.k(i10) && (f4 = fVar.f()) != null) {
                    int[] iArr2 = this.f25311g;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    f4.u(this, childAt, view, i4, i5, i6, i7, i10, iArr2);
                    int[] iArr3 = this.f25311g;
                    i11 = i6 > 0 ? Math.max(i11, iArr3[0]) : Math.min(i11, iArr3[0]);
                    if (i7 > 0) {
                        z4 = true;
                        min = Math.max(i12, this.f25311g[1]);
                    } else {
                        z4 = true;
                        min = Math.min(i12, this.f25311g[1]);
                    }
                    i12 = min;
                    z5 = z4;
                }
            }
        }
        iArr[0] = iArr[0] + i11;
        iArr[1] = iArr[1] + i12;
        if (z5) {
            S(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        b0(false);
        if (this.f25319o) {
            if (this.f25318n == null) {
                this.f25318n = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f25318n);
        }
        if (this.f25320p == null && x1.W(this)) {
            x1.B1(this);
        }
        this.f25314j = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b0(false);
        if (this.f25319o && this.f25318n != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f25318n);
        }
        View view = this.f25317m;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f25314j = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f25321q || this.f25322r == null) {
            return;
        }
        j3 j3Var = this.f25320p;
        int r4 = j3Var != null ? j3Var.r() : 0;
        if (r4 > 0) {
            this.f25322r.setBounds(0, 0, getWidth(), r4);
            this.f25322r.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            b0(true);
        }
        boolean W = W(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            b0(true);
        }
        return W;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        Behavior f4;
        int c02 = x1.c0(this);
        int size = this.f25306b.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view = this.f25306b.get(i10);
            if (view.getVisibility() != 8 && ((f4 = ((f) view.getLayoutParams()).f()) == null || !f4.m(this, view, c02))) {
                T(view, c02);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x011c, code lost:
    
        if (r0.n(r30, r20, r11, r21, r23, 0) == false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r31, int r32) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.b1
    public boolean onNestedFling(View view, float f4, float f5, boolean z4) {
        Behavior f6;
        int childCount = getChildCount();
        boolean z5 = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.k(0) && (f6 = fVar.f()) != null) {
                    z5 |= f6.o(this, childAt, view, f4, f5, z4);
                }
            }
        }
        if (z5) {
            S(1);
        }
        return z5;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.b1
    public boolean onNestedPreFling(View view, float f4, float f5) {
        Behavior f6;
        int childCount = getChildCount();
        boolean z4 = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.k(0) && (f6 = fVar.f()) != null) {
                    z4 |= f6.p(this, childAt, view, f4, f5);
                }
            }
        }
        return z4;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.b1
    public void onNestedPreScroll(View view, int i4, int i5, int[] iArr) {
        y(view, i4, i5, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.b1
    public void onNestedScroll(View view, int i4, int i5, int i6, int i7) {
        q0(view, i4, i5, i6, i7, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.b1
    public void onNestedScrollAccepted(View view, View view2, int i4) {
        u(view, view2, i4, 0);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        SparseArray<Parcelable> sparseArray = savedState.f25326d;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            int id2 = childAt.getId();
            Behavior f4 = I(childAt).f();
            if (id2 != -1 && f4 != null && (parcelable2 = sparseArray.get(id2)) != null) {
                f4.y(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable z4;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            int id2 = childAt.getId();
            Behavior f4 = ((f) childAt.getLayoutParams()).f();
            if (id2 != -1 && f4 != null && (z4 = f4.z(this, childAt)) != null) {
                sparseArray.append(id2, z4);
            }
        }
        savedState.f25326d = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.b1
    public boolean onStartNestedScroll(View view, View view2, int i4) {
        return s0(view, view2, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.b1
    public void onStopNestedScroll(View view) {
        x(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r3 != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f25316l
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L17
            boolean r3 = r0.W(r1, r4)
            if (r3 == 0) goto L15
            goto L18
        L15:
            r6 = r5
            goto L2c
        L17:
            r3 = r5
        L18:
            android.view.View r6 = r0.f25316l
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r6 = r6.f()
            if (r6 == 0) goto L15
            android.view.View r7 = r0.f25316l
            boolean r6 = r6.E(r0, r7, r1)
        L2c:
            android.view.View r7 = r0.f25316l
            r8 = 0
            if (r7 != 0) goto L37
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L4a
        L37:
            if (r3 == 0) goto L4a
            long r11 = android.os.SystemClock.uptimeMillis()
            r15 = 0
            r16 = 0
            r13 = 3
            r14 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L4a:
            if (r8 == 0) goto L4f
            r8.recycle()
        L4f:
            if (r2 == r4) goto L54
            r1 = 3
            if (r2 != r1) goto L57
        L54:
            r0.b0(r5)
        L57:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void p(@o0 View view) {
        List g4 = this.f25307c.g(view);
        if (g4 == null || g4.isEmpty()) {
            return;
        }
        for (int i4 = 0; i4 < g4.size(); i4++) {
            View view2 = (View) g4.get(i4);
            Behavior f4 = ((f) view2.getLayoutParams()).f();
            if (f4 != null) {
                f4.i(this, view2, view);
            }
        }
    }

    public boolean q(@o0 View view, @o0 View view2) {
        boolean z4 = false;
        if (view.getVisibility() != 0 || view2.getVisibility() != 0) {
            return false;
        }
        Rect d5 = d();
        w(view, view.getParent() != this, d5);
        Rect d6 = d();
        w(view2, view2.getParent() != this, d6);
        try {
            if (d5.left <= d6.right && d5.top <= d6.bottom && d5.right >= d6.left) {
                if (d5.bottom >= d6.top) {
                    z4 = true;
                }
            }
            return z4;
        } finally {
            Z(d5);
            Z(d6);
        }
    }

    @Override // androidx.core.view.z0
    public void q0(View view, int i4, int i5, int i6, int i7, int i10) {
        o0(view, i4, i5, i6, i7, 0, this.f25312h);
    }

    void r() {
        int childCount = getChildCount();
        boolean z4 = false;
        int i4 = 0;
        while (true) {
            if (i4 >= childCount) {
                break;
            }
            if (this.f25307c.j(getChildAt(i4))) {
                z4 = true;
                break;
            }
            i4++;
        }
        if (z4 != this.f25319o) {
            if (z4) {
                e();
            } else {
                a0();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z4) {
        Behavior f4 = ((f) view.getLayoutParams()).f();
        if (f4 == null || !f4.x(this, view, rect, z4)) {
            return super.requestChildRectangleOnScreen(view, rect, z4);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z4) {
        super.requestDisallowInterceptTouchEvent(z4);
        if (!z4 || this.f25313i) {
            return;
        }
        b0(false);
        this.f25313i = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public f generateDefaultLayoutParams() {
        return new f(-2, -2);
    }

    @Override // androidx.core.view.z0
    public boolean s0(View view, View view2, int i4, int i5) {
        int childCount = getChildCount();
        boolean z4 = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                Behavior f4 = fVar.f();
                if (f4 != null) {
                    boolean B2 = f4.B(this, childAt, view, view2, i4, i5);
                    z4 |= B2;
                    fVar.t(i5, B2);
                } else {
                    fVar.t(i5, false);
                }
            }
        }
        return z4;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z4) {
        super.setFitsSystemWindows(z4);
        l0();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f25323s = onHierarchyChangeListener;
    }

    @Override // android.view.View
    public void setVisibility(int i4) {
        super.setVisibility(i4);
        boolean z4 = i4 == 0;
        Drawable drawable = this.f25322r;
        if (drawable == null || drawable.isVisible() == z4) {
            return;
        }
        this.f25322r.setVisible(z4, false);
    }

    @Override // android.view.ViewGroup
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public f generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    @Override // androidx.core.view.z0
    public void u(View view, View view2, int i4, int i5) {
        Behavior f4;
        this.f25325u.c(view, view2, i4, i5);
        this.f25317m = view2;
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.k(i5) && (f4 = fVar.f()) != null) {
                f4.w(this, childAt, view, view2, i4, i5);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof f ? new f((f) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new f((ViewGroup.MarginLayoutParams) layoutParams) : new f(layoutParams);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f25322r;
    }

    void w(View view, boolean z4, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z4) {
            C(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @Override // androidx.core.view.z0
    public void x(View view, int i4) {
        this.f25325u.e(view, i4);
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.k(i4)) {
                Behavior f4 = fVar.f();
                if (f4 != null) {
                    f4.D(this, childAt, view, i4);
                }
                fVar.m(i4);
                fVar.l();
            }
        }
        this.f25317m = null;
    }

    @Override // androidx.core.view.z0
    public void y(View view, int i4, int i5, int[] iArr, int i6) {
        Behavior f4;
        int childCount = getChildCount();
        boolean z4 = false;
        int i7 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.k(i6) && (f4 = fVar.f()) != null) {
                    int[] iArr2 = this.f25311g;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    f4.r(this, childAt, view, i4, i5, iArr2, i6);
                    int[] iArr3 = this.f25311g;
                    i7 = i4 > 0 ? Math.max(i7, iArr3[0]) : Math.min(i7, iArr3[0]);
                    int[] iArr4 = this.f25311g;
                    i10 = i5 > 0 ? Math.max(i10, iArr4[1]) : Math.min(i10, iArr4[1]);
                    z4 = true;
                }
            }
        }
        iArr[0] = i7;
        iArr[1] = i10;
        if (z4) {
            S(1);
        }
    }

    @o0
    public List<View> z(@o0 View view) {
        List<View> h4 = this.f25307c.h(view);
        this.f25309e.clear();
        if (h4 != null) {
            this.f25309e.addAll(h4);
        }
        return this.f25309e;
    }

    public CoordinatorLayout(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.C1407a.f93141b);
    }

    public CoordinatorLayout(@o0 Context context, @q0 AttributeSet attributeSet, @androidx.annotation.f int i4) {
        super(context, attributeSet, i4);
        TypedArray obtainStyledAttributes;
        this.f25306b = new ArrayList();
        this.f25307c = new androidx.coordinatorlayout.widget.b<>();
        this.f25308d = new ArrayList();
        this.f25309e = new ArrayList();
        this.f25311g = new int[2];
        this.f25312h = new int[2];
        this.f25325u = new androidx.core.view.c1();
        if (i4 == 0) {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.j.f93271g, 0, a.i.f93263h);
        } else {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.j.f93271g, i4, 0);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (i4 == 0) {
                saveAttributeDataForStyleable(context, a.j.f93271g, attributeSet, obtainStyledAttributes, 0, a.i.f93263h);
            } else {
                saveAttributeDataForStyleable(context, a.j.f93271g, attributeSet, obtainStyledAttributes, i4, 0);
            }
        }
        int resourceId = obtainStyledAttributes.getResourceId(a.j.f93272h, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f25315k = resources.getIntArray(resourceId);
            float f4 = resources.getDisplayMetrics().density;
            int length = this.f25315k.length;
            for (int i5 = 0; i5 < length; i5++) {
                this.f25315k[i5] = (int) (r12[i5] * f4);
            }
        }
        this.f25322r = obtainStyledAttributes.getDrawable(a.j.f93273i);
        obtainStyledAttributes.recycle();
        l0();
        super.setOnHierarchyChangeListener(new e());
        if (x1.X(this) == 0) {
            setImportantForAccessibility(1);
        }
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: d, reason: collision with root package name */
        SparseArray<Parcelable> f25326d;

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

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f25326d = new SparseArray<>(readInt);
            for (int i4 = 0; i4 < readInt; i4++) {
                this.f25326d.append(iArr[i4], readParcelableArray[i4]);
            }
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            SparseArray<Parcelable> sparseArray = this.f25326d;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i5 = 0; i5 < size; i5++) {
                iArr[i5] = this.f25326d.keyAt(i5);
                parcelableArr[i5] = this.f25326d.valueAt(i5);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i4);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public static class f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        Behavior f25329a;

        /* renamed from: b, reason: collision with root package name */
        boolean f25330b;

        /* renamed from: c, reason: collision with root package name */
        public int f25331c;

        /* renamed from: d, reason: collision with root package name */
        public int f25332d;

        /* renamed from: e, reason: collision with root package name */
        public int f25333e;

        /* renamed from: f, reason: collision with root package name */
        int f25334f;

        /* renamed from: g, reason: collision with root package name */
        public int f25335g;

        /* renamed from: h, reason: collision with root package name */
        public int f25336h;

        /* renamed from: i, reason: collision with root package name */
        int f25337i;

        /* renamed from: j, reason: collision with root package name */
        int f25338j;

        /* renamed from: k, reason: collision with root package name */
        View f25339k;

        /* renamed from: l, reason: collision with root package name */
        View f25340l;

        /* renamed from: m, reason: collision with root package name */
        private boolean f25341m;

        /* renamed from: n, reason: collision with root package name */
        private boolean f25342n;

        /* renamed from: o, reason: collision with root package name */
        private boolean f25343o;

        /* renamed from: p, reason: collision with root package name */
        private boolean f25344p;

        /* renamed from: q, reason: collision with root package name */
        final Rect f25345q;

        /* renamed from: r, reason: collision with root package name */
        Object f25346r;

        public f(int i4, int i5) {
            super(i4, i5);
            this.f25330b = false;
            this.f25331c = 0;
            this.f25332d = 0;
            this.f25333e = -1;
            this.f25334f = -1;
            this.f25335g = 0;
            this.f25336h = 0;
            this.f25345q = new Rect();
        }

        private void o(View view, CoordinatorLayout coordinatorLayout) {
            View findViewById = coordinatorLayout.findViewById(this.f25334f);
            this.f25339k = findViewById;
            if (findViewById == null) {
                if (!coordinatorLayout.isInEditMode()) {
                    throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f25334f) + " to anchor view " + view);
                }
                this.f25340l = null;
                this.f25339k = null;
                return;
            }
            if (findViewById == coordinatorLayout) {
                if (!coordinatorLayout.isInEditMode()) {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
                this.f25340l = null;
                this.f25339k = null;
                return;
            }
            for (ViewParent parent = findViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                if (parent == view) {
                    if (!coordinatorLayout.isInEditMode()) {
                        throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                    }
                    this.f25340l = null;
                    this.f25339k = null;
                    return;
                }
                if (parent instanceof View) {
                    findViewById = parent;
                }
            }
            this.f25340l = findViewById;
        }

        private boolean u(View view, int i4) {
            int absoluteGravity = Gravity.getAbsoluteGravity(((f) view.getLayoutParams()).f25335g, i4);
            return absoluteGravity != 0 && (Gravity.getAbsoluteGravity(this.f25336h, i4) & absoluteGravity) == absoluteGravity;
        }

        private boolean v(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f25339k.getId() != this.f25334f) {
                return false;
            }
            View view2 = this.f25339k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f25340l = null;
                    this.f25339k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
            }
            this.f25340l = view2;
            return true;
        }

        boolean a() {
            return this.f25339k == null && this.f25334f != -1;
        }

        boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            Behavior behavior;
            return view2 == this.f25340l || u(view2, x1.c0(coordinatorLayout)) || ((behavior = this.f25329a) != null && behavior.f(coordinatorLayout, view, view2));
        }

        boolean c() {
            if (this.f25329a == null) {
                this.f25341m = false;
            }
            return this.f25341m;
        }

        View d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f25334f == -1) {
                this.f25340l = null;
                this.f25339k = null;
                return null;
            }
            if (this.f25339k == null || !v(view, coordinatorLayout)) {
                o(view, coordinatorLayout);
            }
            return this.f25339k;
        }

        @d0
        public int e() {
            return this.f25334f;
        }

        @q0
        public Behavior f() {
            return this.f25329a;
        }

        boolean g() {
            return this.f25344p;
        }

        Rect h() {
            return this.f25345q;
        }

        void i() {
            this.f25340l = null;
            this.f25339k = null;
        }

        boolean j(CoordinatorLayout coordinatorLayout, View view) {
            boolean z4 = this.f25341m;
            if (z4) {
                return true;
            }
            Behavior behavior = this.f25329a;
            boolean a5 = (behavior != null ? behavior.a(coordinatorLayout, view) : false) | z4;
            this.f25341m = a5;
            return a5;
        }

        boolean k(int i4) {
            if (i4 == 0) {
                return this.f25342n;
            }
            if (i4 != 1) {
                return false;
            }
            return this.f25343o;
        }

        void l() {
            this.f25344p = false;
        }

        void m(int i4) {
            t(i4, false);
        }

        void n() {
            this.f25341m = false;
        }

        public void p(@d0 int i4) {
            i();
            this.f25334f = i4;
        }

        public void q(@q0 Behavior behavior) {
            Behavior behavior2 = this.f25329a;
            if (behavior2 != behavior) {
                if (behavior2 != null) {
                    behavior2.k();
                }
                this.f25329a = behavior;
                this.f25346r = null;
                this.f25330b = true;
                if (behavior != null) {
                    behavior.h(this);
                }
            }
        }

        void r(boolean z4) {
            this.f25344p = z4;
        }

        void s(Rect rect) {
            this.f25345q.set(rect);
        }

        void t(int i4, boolean z4) {
            if (i4 == 0) {
                this.f25342n = z4;
            } else {
                if (i4 != 1) {
                    return;
                }
                this.f25343o = z4;
            }
        }

        f(@o0 Context context, @q0 AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f25330b = false;
            this.f25331c = 0;
            this.f25332d = 0;
            this.f25333e = -1;
            this.f25334f = -1;
            this.f25335g = 0;
            this.f25336h = 0;
            this.f25345q = new Rect();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.j.f93274j);
            this.f25331c = obtainStyledAttributes.getInteger(a.j.f93275k, 0);
            this.f25334f = obtainStyledAttributes.getResourceId(a.j.f93276l, -1);
            this.f25332d = obtainStyledAttributes.getInteger(a.j.f93277m, 0);
            this.f25333e = obtainStyledAttributes.getInteger(a.j.f93281q, -1);
            this.f25335g = obtainStyledAttributes.getInt(a.j.f93280p, 0);
            this.f25336h = obtainStyledAttributes.getInt(a.j.f93279o, 0);
            int i4 = a.j.f93278n;
            boolean hasValue = obtainStyledAttributes.hasValue(i4);
            this.f25330b = hasValue;
            if (hasValue) {
                this.f25329a = CoordinatorLayout.V(context, attributeSet, obtainStyledAttributes.getString(i4));
            }
            obtainStyledAttributes.recycle();
            Behavior behavior = this.f25329a;
            if (behavior != null) {
                behavior.h(this);
            }
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.f25330b = false;
            this.f25331c = 0;
            this.f25332d = 0;
            this.f25333e = -1;
            this.f25334f = -1;
            this.f25335g = 0;
            this.f25336h = 0;
            this.f25345q = new Rect();
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f25330b = false;
            this.f25331c = 0;
            this.f25332d = 0;
            this.f25333e = -1;
            this.f25334f = -1;
            this.f25335g = 0;
            this.f25336h = 0;
            this.f25345q = new Rect();
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f25330b = false;
            this.f25331c = 0;
            this.f25332d = 0;
            this.f25333e = -1;
            this.f25334f = -1;
            this.f25335g = 0;
            this.f25336h = 0;
            this.f25345q = new Rect();
        }
    }
}
