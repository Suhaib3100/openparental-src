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
import androidx.annotation.l;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.v;
import androidx.annotation.x;
import androidx.core.util.p;
import androidx.core.view.d0;
import androidx.core.view.k1;
import androidx.core.view.l1;
import androidx.core.view.n1;
import androidx.core.view.o1;
import androidx.core.view.v4;
import androidx.core.view.y1;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.badge.BadgeDrawable;
import j.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.io.k;

/* loaded from: classes3.dex */
public class CoordinatorLayout extends ViewGroup implements k1, l1 {
    static final String I = "CoordinatorLayout";
    static final String J;
    private static final int K = 0;
    private static final int L = 1;
    static final Class<?>[] M;
    static final ThreadLocal<Map<String, Constructor<Behavior>>> N;
    static final int O = 0;
    static final int P = 1;
    static final int Q = 2;
    static final Comparator<View> R;
    private static final p.a<Rect> S;
    private g A;
    private boolean B;
    private v4 C;
    private boolean D;
    private Drawable E;
    ViewGroup.OnHierarchyChangeListener F;
    private o1 G;
    private final n1 H;

    /* renamed from: o, reason: collision with root package name */
    private final List<View> f3912o;

    /* renamed from: p, reason: collision with root package name */
    private final androidx.coordinatorlayout.widget.a<View> f3913p;

    /* renamed from: q, reason: collision with root package name */
    private final List<View> f3914q;

    /* renamed from: r, reason: collision with root package name */
    private final List<View> f3915r;

    /* renamed from: s, reason: collision with root package name */
    private Paint f3916s;

    /* renamed from: t, reason: collision with root package name */
    private final int[] f3917t;

    /* renamed from: u, reason: collision with root package name */
    private final int[] f3918u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f3919v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f3920w;

    /* renamed from: x, reason: collision with root package name */
    private int[] f3921x;

    /* renamed from: y, reason: collision with root package name */
    private View f3922y;

    /* renamed from: z, reason: collision with root package name */
    private View f3923z;

    /* loaded from: classes.dex */
    public static abstract class Behavior<V extends View> {
        public Behavior() {
        }

        public static void F(@o0 View view, @q0 Object obj) {
            ((f) view.getLayoutParams()).f3944r = obj;
        }

        @q0
        public static Object e(@o0 View view) {
            return ((f) view.getLayoutParams()).f3944r;
        }

        @Deprecated
        public boolean A(@o0 CoordinatorLayout coordinatorLayout, @o0 V v5, @o0 View view, @o0 View view2, int i5) {
            return false;
        }

        public boolean B(@o0 CoordinatorLayout coordinatorLayout, @o0 V v5, @o0 View view, @o0 View view2, int i5, int i6) {
            if (i6 == 0) {
                return A(coordinatorLayout, v5, view, view2, i5);
            }
            return false;
        }

        @Deprecated
        public void C(@o0 CoordinatorLayout coordinatorLayout, @o0 V v5, @o0 View view) {
        }

        public void D(@o0 CoordinatorLayout coordinatorLayout, @o0 V v5, @o0 View view, int i5) {
            if (i5 == 0) {
                C(coordinatorLayout, v5, view);
            }
        }

        public boolean E(@o0 CoordinatorLayout coordinatorLayout, @o0 V v5, @o0 MotionEvent motionEvent) {
            return false;
        }

        public boolean a(@o0 CoordinatorLayout coordinatorLayout, @o0 V v5) {
            return d(coordinatorLayout, v5) > 0.0f;
        }

        public boolean b(@o0 CoordinatorLayout coordinatorLayout, @o0 V v5, @o0 Rect rect) {
            return false;
        }

        @l
        public int c(@o0 CoordinatorLayout coordinatorLayout, @o0 V v5) {
            return y1.f5758t;
        }

        @x(from = com.google.firebase.remoteconfig.p.f18289o, to = 1.0d)
        public float d(@o0 CoordinatorLayout coordinatorLayout, @o0 V v5) {
            return 0.0f;
        }

        public boolean f(@o0 CoordinatorLayout coordinatorLayout, @o0 V v5, @o0 View view) {
            return false;
        }

        @o0
        public v4 g(@o0 CoordinatorLayout coordinatorLayout, @o0 V v5, @o0 v4 v4Var) {
            return v4Var;
        }

        public void h(@o0 f fVar) {
        }

        public boolean i(@o0 CoordinatorLayout coordinatorLayout, @o0 V v5, @o0 View view) {
            return false;
        }

        public void j(@o0 CoordinatorLayout coordinatorLayout, @o0 V v5, @o0 View view) {
        }

        public void k() {
        }

        public boolean l(@o0 CoordinatorLayout coordinatorLayout, @o0 V v5, @o0 MotionEvent motionEvent) {
            return false;
        }

        public boolean m(@o0 CoordinatorLayout coordinatorLayout, @o0 V v5, int i5) {
            return false;
        }

        public boolean n(@o0 CoordinatorLayout coordinatorLayout, @o0 V v5, int i5, int i6, int i7, int i8) {
            return false;
        }

        public boolean o(@o0 CoordinatorLayout coordinatorLayout, @o0 V v5, @o0 View view, float f6, float f7, boolean z5) {
            return false;
        }

        public boolean p(@o0 CoordinatorLayout coordinatorLayout, @o0 V v5, @o0 View view, float f6, float f7) {
            return false;
        }

        @Deprecated
        public void q(@o0 CoordinatorLayout coordinatorLayout, @o0 V v5, @o0 View view, int i5, int i6, @o0 int[] iArr) {
        }

        public void r(@o0 CoordinatorLayout coordinatorLayout, @o0 V v5, @o0 View view, int i5, int i6, @o0 int[] iArr, int i7) {
            if (i7 == 0) {
                q(coordinatorLayout, v5, view, i5, i6, iArr);
            }
        }

        @Deprecated
        public void s(@o0 CoordinatorLayout coordinatorLayout, @o0 V v5, @o0 View view, int i5, int i6, int i7, int i8) {
        }

        @Deprecated
        public void t(@o0 CoordinatorLayout coordinatorLayout, @o0 V v5, @o0 View view, int i5, int i6, int i7, int i8, int i9) {
            if (i9 == 0) {
                s(coordinatorLayout, v5, view, i5, i6, i7, i8);
            }
        }

        public void u(@o0 CoordinatorLayout coordinatorLayout, @o0 V v5, @o0 View view, int i5, int i6, int i7, int i8, int i9, @o0 int[] iArr) {
            iArr[0] = iArr[0] + i7;
            iArr[1] = iArr[1] + i8;
            t(coordinatorLayout, v5, view, i5, i6, i7, i8, i9);
        }

        @Deprecated
        public void v(@o0 CoordinatorLayout coordinatorLayout, @o0 V v5, @o0 View view, @o0 View view2, int i5) {
        }

        public void w(@o0 CoordinatorLayout coordinatorLayout, @o0 V v5, @o0 View view, @o0 View view2, int i5, int i6) {
            if (i6 == 0) {
                v(coordinatorLayout, v5, view, view2, i5);
            }
        }

        public boolean x(@o0 CoordinatorLayout coordinatorLayout, @o0 V v5, @o0 Rect rect, boolean z5) {
            return false;
        }

        public void y(@o0 CoordinatorLayout coordinatorLayout, @o0 V v5, @o0 Parcelable parcelable) {
        }

        @q0
        public Parcelable z(@o0 CoordinatorLayout coordinatorLayout, @o0 V v5) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
        }
    }

    class a implements o1 {
        a() {
        }

        @Override // androidx.core.view.o1
        public v4 a(View view, v4 v4Var) {
            return CoordinatorLayout.this.n0(v4Var);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        @o0
        Behavior k();
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    /* loaded from: classes.dex */
    public @interface c {
        Class<? extends Behavior> value();
    }

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface d {
    }

    /* loaded from: classes.dex */
    private class e implements ViewGroup.OnHierarchyChangeListener {
        e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.F;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.V(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.F;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* loaded from: classes.dex */
    class g implements ViewTreeObserver.OnPreDrawListener {
        g() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.V(0);
            return true;
        }
    }

    /* loaded from: classes.dex */
    static class h implements Comparator<View> {
        h() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            float F0 = y1.F0(view);
            float F02 = y1.F0(view2);
            if (F0 > F02) {
                return -1;
            }
            return F0 < F02 ? 1 : 0;
        }
    }

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        J = r02 != null ? r02.getName() : null;
        R = new h();
        M = new Class[]{Context.class, AttributeSet.class};
        N = new ThreadLocal<>();
        S = new p.c(12);
    }

    public CoordinatorLayout(@o0 Context context) {
        this(context, null);
    }

    private void H(View view, int i5, Rect rect, Rect rect2, f fVar, int i6, int i7) {
        int i8 = fVar.f3929c;
        if (i8 == 0) {
            i8 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i8, i5);
        int absoluteGravity2 = Gravity.getAbsoluteGravity(g0(fVar.f3930d), i5);
        int i9 = absoluteGravity & 7;
        int i10 = absoluteGravity & 112;
        int i11 = absoluteGravity2 & 7;
        int i12 = absoluteGravity2 & 112;
        int width = i11 != 1 ? i11 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i12 != 16 ? i12 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i9 == 1) {
            width -= i6 / 2;
        } else if (i9 != 5) {
            width -= i6;
        }
        if (i10 == 16) {
            height -= i7 / 2;
        } else if (i10 != 80) {
            height -= i7;
        }
        rect2.set(width, height, i6 + width, i7 + height);
    }

    private int I(int i5) {
        int[] iArr = this.f3921x;
        if (iArr == null) {
            toString();
            return 0;
        }
        if (i5 >= 0 && i5 < iArr.length) {
            return iArr[i5];
        }
        toString();
        return 0;
    }

    private void N(List<View> list) {
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i5 = childCount - 1; i5 >= 0; i5--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i5) : i5));
        }
        Comparator<View> comparator = R;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    private boolean O(View view) {
        return this.f3913p.j(view);
    }

    private void Q(View view, int i5) {
        f fVar = (f) view.getLayoutParams();
        Rect g5 = g();
        g5.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
        if (this.C != null && y1.U(this) && !y1.U(view)) {
            g5.left = this.C.p() + g5.left;
            g5.top = this.C.r() + g5.top;
            g5.right -= this.C.q();
            g5.bottom -= this.C.o();
        }
        Rect g6 = g();
        d0.b(g0(fVar.f3929c), view.getMeasuredWidth(), view.getMeasuredHeight(), g5, g6, i5);
        view.layout(g6.left, g6.top, g6.right, g6.bottom);
        c0(g5);
        c0(g6);
    }

    private void R(View view, View view2, int i5) {
        Rect g5 = g();
        Rect g6 = g();
        try {
            F(view2, g5);
            G(view, i5, g5, g6);
            view.layout(g6.left, g6.top, g6.right, g6.bottom);
        } finally {
            c0(g5);
            c0(g6);
        }
    }

    private void S(View view, int i5, int i6) {
        f fVar = (f) view.getLayoutParams();
        int i7 = fVar.f3929c;
        if (i7 == 0) {
            i7 = BadgeDrawable.E;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i7, i6);
        int i8 = absoluteGravity & 7;
        int i9 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i6 == 1) {
            i5 = width - i5;
        }
        int I2 = I(i5) - measuredWidth;
        if (i8 == 1) {
            I2 += measuredWidth / 2;
        } else if (i8 == 5) {
            I2 += measuredWidth;
        }
        int i10 = 0;
        if (i9 == 16) {
            i10 = 0 + (measuredHeight / 2);
        } else if (i9 == 80) {
            i10 = measuredHeight + 0;
        }
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(I2, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(i10, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    private void T(View view, Rect rect, int i5) {
        boolean z5;
        boolean z6;
        int width;
        int i6;
        int i7;
        int i8;
        int height;
        int i9;
        int i10;
        int i11;
        if (y1.U0(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            f fVar = (f) view.getLayoutParams();
            Behavior f6 = fVar.f();
            Rect g5 = g();
            Rect g6 = g();
            g6.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (f6 == null || !f6.b(this, view, g5)) {
                g5.set(g6);
            } else if (!g6.contains(g5)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + g5.toShortString() + " | Bounds:" + g6.toShortString());
            }
            c0(g6);
            if (g5.isEmpty()) {
                c0(g5);
                return;
            }
            int absoluteGravity = Gravity.getAbsoluteGravity(fVar.f3934h, i5);
            boolean z7 = true;
            if ((absoluteGravity & 48) != 48 || (i10 = (g5.top - ((ViewGroup.MarginLayoutParams) fVar).topMargin) - fVar.f3936j) >= (i11 = rect.top)) {
                z5 = false;
            } else {
                j0(view, i11 - i10);
                z5 = true;
            }
            if ((absoluteGravity & 80) == 80 && (height = ((getHeight() - g5.bottom) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) + fVar.f3936j) < (i9 = rect.bottom)) {
                j0(view, height - i9);
                z5 = true;
            }
            if (!z5) {
                j0(view, 0);
            }
            if ((absoluteGravity & 3) != 3 || (i7 = (g5.left - ((ViewGroup.MarginLayoutParams) fVar).leftMargin) - fVar.f3935i) >= (i8 = rect.left)) {
                z6 = false;
            } else {
                i0(view, i8 - i7);
                z6 = true;
            }
            if ((absoluteGravity & 5) != 5 || (width = ((getWidth() - g5.right) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin) + fVar.f3935i) >= (i6 = rect.right)) {
                z7 = z6;
            } else {
                i0(view, width - i6);
            }
            if (!z7) {
                i0(view, 0);
            }
            c0(g5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static Behavior Y(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = J;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + k.f32026a + str;
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<Behavior>>> threadLocal = N;
            Map<String, Constructor<Behavior>> map = threadLocal.get();
            if (map == null) {
                map = new HashMap<>();
                threadLocal.set(map);
            }
            Constructor<Behavior> constructor = map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(M);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return constructor.newInstance(context, attributeSet);
        } catch (Exception e6) {
            throw new RuntimeException(androidx.constraintlayout.motion.widget.g.a("Could not inflate Behavior subclass ", str), e6);
        }
    }

    private boolean Z(MotionEvent motionEvent, int i5) {
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f3914q;
        N(list);
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z5 = false;
        boolean z6 = false;
        for (int i6 = 0; i6 < size; i6++) {
            View view = list.get(i6);
            f fVar = (f) view.getLayoutParams();
            Behavior f6 = fVar.f();
            if (!(z5 || z6) || actionMasked == 0) {
                if (!z5 && f6 != null) {
                    if (i5 == 0) {
                        z5 = f6.l(this, view, motionEvent);
                    } else if (i5 == 1) {
                        z5 = f6.E(this, view, motionEvent);
                    }
                    if (z5) {
                        this.f3922y = view;
                    }
                }
                boolean c6 = fVar.c();
                boolean j5 = fVar.j(this, view);
                z6 = j5 && !c6;
                if (j5 && !z6) {
                    break;
                }
            } else if (f6 != null) {
                if (motionEvent2 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i5 == 0) {
                    f6.l(this, view, motionEvent2);
                } else if (i5 == 1) {
                    f6.E(this, view, motionEvent2);
                }
            }
        }
        list.clear();
        return z5;
    }

    private void a0() {
        this.f3912o.clear();
        this.f3913p.c();
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            f L2 = L(childAt);
            L2.d(this, childAt);
            this.f3913p.b(childAt);
            for (int i6 = 0; i6 < childCount; i6++) {
                if (i6 != i5) {
                    View childAt2 = getChildAt(i6);
                    if (L2.b(this, childAt, childAt2)) {
                        if (!this.f3913p.d(childAt2)) {
                            this.f3913p.b(childAt2);
                        }
                        this.f3913p.a(childAt2, childAt);
                    }
                }
            }
        }
        this.f3912o.addAll(this.f3913p.i());
        Collections.reverse(this.f3912o);
    }

    private static void c0(@o0 Rect rect) {
        rect.setEmpty();
        S.a(rect);
    }

    private void e0(boolean z5) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            Behavior f6 = ((f) childAt.getLayoutParams()).f();
            if (f6 != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z5) {
                    f6.l(this, childAt, obtain);
                } else {
                    f6.E(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i6 = 0; i6 < childCount; i6++) {
            ((f) getChildAt(i6).getLayoutParams()).n();
        }
        this.f3922y = null;
        this.f3919v = false;
    }

    private static int f0(int i5) {
        if (i5 == 0) {
            return 17;
        }
        return i5;
    }

    @o0
    private static Rect g() {
        Rect b6 = S.b();
        return b6 == null ? new Rect() : b6;
    }

    private static int g0(int i5) {
        if ((i5 & 7) == 0) {
            i5 |= d0.f5464b;
        }
        return (i5 & 112) == 0 ? i5 | 48 : i5;
    }

    private static int h0(int i5) {
        return i5 == 0 ? BadgeDrawable.E : i5;
    }

    private void i0(View view, int i5) {
        f fVar = (f) view.getLayoutParams();
        int i6 = fVar.f3935i;
        if (i6 != i5) {
            y1.e1(view, i5 - i6);
            fVar.f3935i = i5;
        }
    }

    private void j0(View view, int i5) {
        f fVar = (f) view.getLayoutParams();
        int i6 = fVar.f3936j;
        if (i6 != i5) {
            y1.f1(view, i5 - i6);
            fVar.f3936j = i5;
        }
    }

    private static int n(int i5, int i6, int i7) {
        return i5 < i6 ? i6 : i5 > i7 ? i7 : i5;
    }

    private void o(f fVar, Rect rect, int i5, int i6) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i5) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i6) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        rect.set(max, max2, i5 + max, i6 + max2);
    }

    private void o0() {
        if (!y1.U(this)) {
            y1.a2(this, null);
            return;
        }
        if (this.G == null) {
            this.G = new a();
        }
        y1.a2(this, this.G);
        setSystemUiVisibility(1280);
    }

    private v4 p(v4 v4Var) {
        Behavior f6;
        if (v4Var.A()) {
            return v4Var;
        }
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (y1.U(childAt) && (f6 = ((f) childAt.getLayoutParams()).f()) != null) {
                v4Var = f6.g(this, childAt, v4Var);
                if (v4Var.A()) {
                    break;
                }
            }
        }
        return v4Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof f ? new f((f) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new f((ViewGroup.MarginLayoutParams) layoutParams) : new f(layoutParams);
    }

    void B(View view, boolean z5, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z5) {
            F(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @o0
    public List<View> C(@o0 View view) {
        List<View> h5 = this.f3913p.h(view);
        this.f3915r.clear();
        if (h5 != null) {
            this.f3915r.addAll(h5);
        }
        return this.f3915r;
    }

    @m1
    final List<View> D() {
        a0();
        return Collections.unmodifiableList(this.f3912o);
    }

    @o0
    public List<View> E(@o0 View view) {
        List g5 = this.f3913p.g(view);
        this.f3915r.clear();
        if (g5 != null) {
            this.f3915r.addAll(g5);
        }
        return this.f3915r;
    }

    void F(View view, Rect rect) {
        androidx.coordinatorlayout.widget.b.a(this, view, rect);
    }

    void G(View view, int i5, Rect rect, Rect rect2) {
        f fVar = (f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        H(view, i5, rect, rect2, fVar, measuredWidth, measuredHeight);
        o(fVar, rect2, measuredWidth, measuredHeight);
    }

    void J(View view, Rect rect) {
        rect.set(((f) view.getLayoutParams()).h());
    }

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public final v4 K() {
        return this.C;
    }

    /* JADX WARN: Multi-variable type inference failed */
    f L(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.f3928b) {
            if (view instanceof b) {
                fVar.q(((b) view).k());
                fVar.f3928b = true;
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
                        fVar.q(cVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception unused) {
                        cVar.value().getName();
                    }
                }
                fVar.f3928b = true;
            }
        }
        return fVar;
    }

    @q0
    public Drawable M() {
        return this.E;
    }

    public boolean P(@o0 View view, int i5, int i6) {
        Rect g5 = g();
        F(view, g5);
        try {
            return g5.contains(i5, i6);
        } finally {
            c0(g5);
        }
    }

    void U(View view, int i5) {
        Behavior f6;
        f fVar = (f) view.getLayoutParams();
        if (fVar.f3937k != null) {
            Rect g5 = g();
            Rect g6 = g();
            Rect g7 = g();
            F(fVar.f3937k, g5);
            B(view, false, g6);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            H(view, i5, g5, g7, fVar, measuredWidth, measuredHeight);
            boolean z5 = (g7.left == g6.left && g7.top == g6.top) ? false : true;
            o(fVar, g7, measuredWidth, measuredHeight);
            int i6 = g7.left - g6.left;
            int i7 = g7.top - g6.top;
            if (i6 != 0) {
                y1.e1(view, i6);
            }
            if (i7 != 0) {
                y1.f1(view, i7);
            }
            if (z5 && (f6 = fVar.f()) != null) {
                f6.i(this, view, fVar.f3937k);
            }
            c0(g5);
            c0(g6);
            c0(g7);
        }
    }

    final void V(int i5) {
        boolean z5;
        int Z = y1.Z(this);
        int size = this.f3912o.size();
        Rect g5 = g();
        Rect g6 = g();
        Rect g7 = g();
        for (int i6 = 0; i6 < size; i6++) {
            View view = this.f3912o.get(i6);
            f fVar = (f) view.getLayoutParams();
            if (i5 != 0 || view.getVisibility() != 8) {
                for (int i7 = 0; i7 < i6; i7++) {
                    if (fVar.f3938l == this.f3912o.get(i7)) {
                        U(view, Z);
                    }
                }
                B(view, true, g6);
                if (fVar.f3933g != 0 && !g6.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(fVar.f3933g, Z);
                    int i8 = absoluteGravity & 112;
                    if (i8 == 48) {
                        g5.top = Math.max(g5.top, g6.bottom);
                    } else if (i8 == 80) {
                        g5.bottom = Math.max(g5.bottom, getHeight() - g6.top);
                    }
                    int i9 = absoluteGravity & 7;
                    if (i9 == 3) {
                        g5.left = Math.max(g5.left, g6.right);
                    } else if (i9 == 5) {
                        g5.right = Math.max(g5.right, getWidth() - g6.left);
                    }
                }
                if (fVar.f3934h != 0 && view.getVisibility() == 0) {
                    T(view, g5, Z);
                }
                if (i5 != 2) {
                    J(view, g7);
                    if (!g7.equals(g6)) {
                        b0(view, g6);
                    }
                }
                for (int i10 = i6 + 1; i10 < size; i10++) {
                    View view2 = this.f3912o.get(i10);
                    f fVar2 = (f) view2.getLayoutParams();
                    Behavior f6 = fVar2.f();
                    if (f6 != null && f6.f(this, view2, view)) {
                        if (i5 == 0 && fVar2.g()) {
                            fVar2.l();
                        } else {
                            if (i5 != 2) {
                                z5 = f6.i(this, view2, view);
                            } else {
                                f6.j(this, view2, view);
                                z5 = true;
                            }
                            if (i5 == 1) {
                                fVar2.r(z5);
                            }
                        }
                    }
                }
            }
        }
        c0(g5);
        c0(g6);
        c0(g7);
    }

    public void W(@o0 View view, int i5) {
        f fVar = (f) view.getLayoutParams();
        if (fVar.a()) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        View view2 = fVar.f3937k;
        if (view2 != null) {
            R(view, view2, i5);
            return;
        }
        int i6 = fVar.f3931e;
        if (i6 >= 0) {
            S(view, i6, i5);
        } else {
            Q(view, i5);
        }
    }

    public void X(View view, int i5, int i6, int i7, int i8) {
        measureChildWithMargins(view, i5, i6, i7, i8);
    }

    void b0(View view, Rect rect) {
        ((f) view.getLayoutParams()).s(rect);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    void d0() {
        if (this.f3920w && this.A != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.A);
        }
        this.B = false;
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j5) {
        f fVar = (f) view.getLayoutParams();
        Behavior behavior = fVar.f3927a;
        if (behavior != null) {
            float d6 = behavior.d(this, view);
            if (d6 > 0.0f) {
                if (this.f3916s == null) {
                    this.f3916s = new Paint();
                }
                this.f3916s.setColor(fVar.f3927a.c(this, view));
                this.f3916s.setAlpha(n(Math.round(d6 * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.f3916s);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j5);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.E;
        boolean z5 = false;
        if (drawable != null && drawable.isStateful()) {
            z5 = false | drawable.setState(drawableState);
        }
        if (z5) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, androidx.core.view.m1
    public int getNestedScrollAxes() {
        return this.H.a();
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public void k0(@q0 Drawable drawable) {
        Drawable drawable2 = this.E;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.E = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.E.setState(getDrawableState());
                }
                androidx.core.graphics.drawable.d.m(this.E, y1.Z(this));
                this.E.setVisible(getVisibility() == 0, false);
                this.E.setCallback(this);
            }
            y1.n1(this);
        }
    }

    @Override // androidx.core.view.l1
    public void l(@o0 View view, int i5, int i6, int i7, int i8, int i9, @o0 int[] iArr) {
        Behavior f6;
        boolean z5;
        int min;
        int childCount = getChildCount();
        boolean z6 = false;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.k(i9) && (f6 = fVar.f()) != null) {
                    int[] iArr2 = this.f3917t;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    f6.u(this, childAt, view, i5, i6, i7, i8, i9, iArr2);
                    int[] iArr3 = this.f3917t;
                    i10 = i7 > 0 ? Math.max(i10, iArr3[0]) : Math.min(i10, iArr3[0]);
                    if (i8 > 0) {
                        z5 = true;
                        min = Math.max(i11, this.f3917t[1]);
                    } else {
                        z5 = true;
                        min = Math.min(i11, this.f3917t[1]);
                    }
                    i11 = min;
                    z6 = z5;
                }
            }
        }
        iArr[0] = iArr[0] + i10;
        iArr[1] = iArr[1] + i11;
        if (z6) {
            V(1);
        }
    }

    public void l0(@l int i5) {
        k0(new ColorDrawable(i5));
    }

    void m() {
        if (this.f3920w) {
            if (this.A == null) {
                this.A = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.A);
        }
        this.B = true;
    }

    public void m0(@v int i5) {
        k0(i5 != 0 ? androidx.core.content.d.i(getContext(), i5) : null);
    }

    final v4 n0(v4 v4Var) {
        if (androidx.core.util.l.a(this.C, v4Var)) {
            return v4Var;
        }
        this.C = v4Var;
        boolean z5 = v4Var != null && v4Var.r() > 0;
        this.D = z5;
        setWillNotDraw(!z5 && getBackground() == null);
        v4 p5 = p(v4Var);
        requestLayout();
        return p5;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        e0(false);
        if (this.B) {
            if (this.A == null) {
                this.A = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.A);
        }
        if (this.C == null && y1.U(this)) {
            y1.v1(this);
        }
        this.f3920w = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e0(false);
        if (this.B && this.A != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.A);
        }
        View view = this.f3923z;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f3920w = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.D || this.E == null) {
            return;
        }
        v4 v4Var = this.C;
        int r5 = v4Var != null ? v4Var.r() : 0;
        if (r5 > 0) {
            this.E.setBounds(0, 0, getWidth(), r5);
            this.E.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            e0(true);
        }
        boolean Z = Z(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            e0(true);
        }
        return Z;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z5, int i5, int i6, int i7, int i8) {
        Behavior f6;
        int Z = y1.Z(this);
        int size = this.f3912o.size();
        for (int i9 = 0; i9 < size; i9++) {
            View view = this.f3912o.get(i9);
            if (view.getVisibility() != 8 && ((f6 = ((f) view.getLayoutParams()).f()) == null || !f6.m(this, view, Z))) {
                W(view, Z);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x011b, code lost:
    
        if (r0.n(r30, r20, r11, r21, r23, 0) == false) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r31, int r32) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.m1
    public boolean onNestedFling(View view, float f6, float f7, boolean z5) {
        Behavior f8;
        int childCount = getChildCount();
        boolean z6 = false;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.k(0) && (f8 = fVar.f()) != null) {
                    z6 |= f8.o(this, childAt, view, f6, f7, z5);
                }
            }
        }
        if (z6) {
            V(1);
        }
        return z6;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.m1
    public boolean onNestedPreFling(View view, float f6, float f7) {
        Behavior f8;
        int childCount = getChildCount();
        boolean z5 = false;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.k(0) && (f8 = fVar.f()) != null) {
                    z5 |= f8.p(this, childAt, view, f6, f7);
                }
            }
        }
        return z5;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.m1
    public void onNestedPreScroll(View view, int i5, int i6, int[] iArr) {
        z(view, i5, i6, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.m1
    public void onNestedScroll(View view, int i5, int i6, int i7, int i8) {
        v(view, i5, i6, i7, i8, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.m1
    public void onNestedScrollAccepted(View view, View view2, int i5) {
        x(view, view2, i5, 0);
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
        SparseArray<Parcelable> sparseArray = savedState.f3924q;
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            int id = childAt.getId();
            Behavior f6 = L(childAt).f();
            if (id != -1 && f6 != null && (parcelable2 = sparseArray.get(id)) != null) {
                f6.y(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable z5;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            int id = childAt.getId();
            Behavior f6 = ((f) childAt.getLayoutParams()).f();
            if (id != -1 && f6 != null && (z5 = f6.z(this, childAt)) != null) {
                sparseArray.append(id, z5);
            }
        }
        savedState.f3924q = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.m1
    public boolean onStartNestedScroll(View view, View view2, int i5) {
        return w(view, view2, i5, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.m1
    public void onStopNestedScroll(View view) {
        y(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r3 != false) goto L8;
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
            android.view.View r3 = r0.f3922y
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L15
            boolean r3 = r0.Z(r1, r4)
            if (r3 == 0) goto L2b
            goto L16
        L15:
            r3 = r5
        L16:
            android.view.View r6 = r0.f3922y
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r6 = r6.f()
            if (r6 == 0) goto L2b
            android.view.View r7 = r0.f3922y
            boolean r6 = r6.E(r0, r7, r1)
            goto L2c
        L2b:
            r6 = r5
        L2c:
            android.view.View r7 = r0.f3922y
            r8 = 0
            if (r7 != 0) goto L37
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L4a
        L37:
            if (r3 == 0) goto L4a
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
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
            r0.e0(r5)
        L57:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void q(@o0 View view) {
        List g5 = this.f3913p.g(view);
        if (g5 == null || g5.isEmpty()) {
            return;
        }
        for (int i5 = 0; i5 < g5.size(); i5++) {
            View view2 = (View) g5.get(i5);
            Behavior f6 = ((f) view2.getLayoutParams()).f();
            if (f6 != null) {
                f6.i(this, view2, view);
            }
        }
    }

    public boolean r(@o0 View view, @o0 View view2) {
        boolean z5 = false;
        if (view.getVisibility() != 0 || view2.getVisibility() != 0) {
            return false;
        }
        Rect g5 = g();
        B(view, view.getParent() != this, g5);
        Rect g6 = g();
        B(view2, view2.getParent() != this, g6);
        try {
            if (g5.left <= g6.right && g5.top <= g6.bottom && g5.right >= g6.left) {
                if (g5.bottom >= g6.top) {
                    z5 = true;
                }
            }
            return z5;
        } finally {
            c0(g5);
            c0(g6);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z5) {
        Behavior f6 = ((f) view.getLayoutParams()).f();
        if (f6 == null || !f6.x(this, view, rect, z5)) {
            return super.requestChildRectangleOnScreen(view, rect, z5);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z5) {
        super.requestDisallowInterceptTouchEvent(z5);
        if (!z5 || this.f3919v) {
            return;
        }
        e0(false);
        this.f3919v = true;
    }

    void s() {
        int childCount = getChildCount();
        boolean z5 = false;
        int i5 = 0;
        while (true) {
            if (i5 >= childCount) {
                break;
            }
            if (O(getChildAt(i5))) {
                z5 = true;
                break;
            }
            i5++;
        }
        if (z5 != this.B) {
            if (z5) {
                m();
            } else {
                d0();
            }
        }
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z5) {
        super.setFitsSystemWindows(z5);
        o0();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.F = onHierarchyChangeListener;
    }

    @Override // android.view.View
    public void setVisibility(int i5) {
        super.setVisibility(i5);
        boolean z5 = i5 == 0;
        Drawable drawable = this.E;
        if (drawable == null || drawable.isVisible() == z5) {
            return;
        }
        this.E.setVisible(z5, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public f generateDefaultLayoutParams() {
        return new f(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public f generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    @Override // androidx.core.view.k1
    public void v(View view, int i5, int i6, int i7, int i8, int i9) {
        l(view, i5, i6, i7, i8, 0, this.f3918u);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.E;
    }

    @Override // androidx.core.view.k1
    public boolean w(View view, View view2, int i5, int i6) {
        int childCount = getChildCount();
        boolean z5 = false;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                Behavior f6 = fVar.f();
                if (f6 != null) {
                    boolean B = f6.B(this, childAt, view, view2, i5, i6);
                    z5 |= B;
                    fVar.t(i6, B);
                } else {
                    fVar.t(i6, false);
                }
            }
        }
        return z5;
    }

    @Override // androidx.core.view.k1
    public void x(View view, View view2, int i5, int i6) {
        Behavior f6;
        this.H.c(view, view2, i5, i6);
        this.f3923z = view2;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.k(i6) && (f6 = fVar.f()) != null) {
                f6.w(this, childAt, view, view2, i5, i6);
            }
        }
    }

    @Override // androidx.core.view.k1
    public void y(View view, int i5) {
        this.H.e(view, i5);
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.k(i5)) {
                Behavior f6 = fVar.f();
                if (f6 != null) {
                    f6.D(this, childAt, view, i5);
                }
                fVar.m(i5);
                fVar.l();
            }
        }
        this.f3923z = null;
    }

    @Override // androidx.core.view.k1
    public void z(View view, int i5, int i6, int[] iArr, int i7) {
        Behavior f6;
        int childCount = getChildCount();
        boolean z5 = false;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.k(i7) && (f6 = fVar.f()) != null) {
                    int[] iArr2 = this.f3917t;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    f6.r(this, childAt, view, i5, i6, iArr2, i7);
                    int[] iArr3 = this.f3917t;
                    i8 = i5 > 0 ? Math.max(i8, iArr3[0]) : Math.min(i8, iArr3[0]);
                    int[] iArr4 = this.f3917t;
                    i9 = i6 > 0 ? Math.max(i9, iArr4[1]) : Math.min(i9, iArr4[1]);
                    z5 = true;
                }
            }
        }
        iArr[0] = i8;
        iArr[1] = i9;
        if (z5) {
            V(1);
        }
    }

    public CoordinatorLayout(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.C0248a.f22766b);
    }

    public CoordinatorLayout(@o0 Context context, @q0 AttributeSet attributeSet, @androidx.annotation.f int i5) {
        super(context, attributeSet, i5);
        TypedArray obtainStyledAttributes;
        this.f3912o = new ArrayList();
        this.f3913p = new androidx.coordinatorlayout.widget.a<>();
        this.f3914q = new ArrayList();
        this.f3915r = new ArrayList();
        this.f3917t = new int[2];
        this.f3918u = new int[2];
        this.H = new n1(this);
        if (i5 == 0) {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.j.f22895g, 0, a.i.f22888h);
        } else {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.j.f22895g, i5, 0);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (i5 == 0) {
                saveAttributeDataForStyleable(context, a.j.f22895g, attributeSet, obtainStyledAttributes, 0, a.i.f22888h);
            } else {
                saveAttributeDataForStyleable(context, a.j.f22895g, attributeSet, obtainStyledAttributes, i5, 0);
            }
        }
        int resourceId = obtainStyledAttributes.getResourceId(a.j.f22896h, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f3921x = resources.getIntArray(resourceId);
            float f6 = resources.getDisplayMetrics().density;
            int length = this.f3921x.length;
            for (int i6 = 0; i6 < length; i6++) {
                this.f3921x[i6] = (int) (r12[i6] * f6);
            }
        }
        this.E = obtainStyledAttributes.getDrawable(a.j.f22897i);
        obtainStyledAttributes.recycle();
        o0();
        super.setOnHierarchyChangeListener(new e());
        if (y1.V(this) == 0) {
            y1.R1(this, 1);
        }
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: q, reason: collision with root package name */
        SparseArray<Parcelable> f3924q;

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

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f3924q = new SparseArray<>(readInt);
            for (int i5 = 0; i5 < readInt; i5++) {
                this.f3924q.append(iArr[i5], readParcelableArray[i5]);
            }
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i5) {
            super.writeToParcel(parcel, i5);
            SparseArray<Parcelable> sparseArray = this.f3924q;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i6 = 0; i6 < size; i6++) {
                iArr[i6] = this.f3924q.keyAt(i6);
                parcelableArr[i6] = this.f3924q.valueAt(i6);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i5);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* loaded from: classes.dex */
    public static class f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        Behavior f3927a;

        /* renamed from: b, reason: collision with root package name */
        boolean f3928b;

        /* renamed from: c, reason: collision with root package name */
        public int f3929c;

        /* renamed from: d, reason: collision with root package name */
        public int f3930d;

        /* renamed from: e, reason: collision with root package name */
        public int f3931e;

        /* renamed from: f, reason: collision with root package name */
        int f3932f;

        /* renamed from: g, reason: collision with root package name */
        public int f3933g;

        /* renamed from: h, reason: collision with root package name */
        public int f3934h;

        /* renamed from: i, reason: collision with root package name */
        int f3935i;

        /* renamed from: j, reason: collision with root package name */
        int f3936j;

        /* renamed from: k, reason: collision with root package name */
        View f3937k;

        /* renamed from: l, reason: collision with root package name */
        View f3938l;

        /* renamed from: m, reason: collision with root package name */
        private boolean f3939m;

        /* renamed from: n, reason: collision with root package name */
        private boolean f3940n;

        /* renamed from: o, reason: collision with root package name */
        private boolean f3941o;

        /* renamed from: p, reason: collision with root package name */
        private boolean f3942p;

        /* renamed from: q, reason: collision with root package name */
        final Rect f3943q;

        /* renamed from: r, reason: collision with root package name */
        Object f3944r;

        public f(int i5, int i6) {
            super(i5, i6);
            this.f3928b = false;
            this.f3929c = 0;
            this.f3930d = 0;
            this.f3931e = -1;
            this.f3932f = -1;
            this.f3933g = 0;
            this.f3934h = 0;
            this.f3943q = new Rect();
        }

        private void o(View view, CoordinatorLayout coordinatorLayout) {
            View findViewById = coordinatorLayout.findViewById(this.f3932f);
            this.f3937k = findViewById;
            if (findViewById == null) {
                if (!coordinatorLayout.isInEditMode()) {
                    throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f3932f) + " to anchor view " + view);
                }
                this.f3938l = null;
                this.f3937k = null;
                return;
            }
            if (findViewById == coordinatorLayout) {
                if (!coordinatorLayout.isInEditMode()) {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
                this.f3938l = null;
                this.f3937k = null;
                return;
            }
            for (ViewParent parent = findViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                if (parent == view) {
                    if (!coordinatorLayout.isInEditMode()) {
                        throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                    }
                    this.f3938l = null;
                    this.f3937k = null;
                    return;
                }
                if (parent instanceof View) {
                    findViewById = parent;
                }
            }
            this.f3938l = findViewById;
        }

        private boolean u(View view, int i5) {
            int absoluteGravity = Gravity.getAbsoluteGravity(((f) view.getLayoutParams()).f3933g, i5);
            return absoluteGravity != 0 && (Gravity.getAbsoluteGravity(this.f3934h, i5) & absoluteGravity) == absoluteGravity;
        }

        private boolean v(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f3937k.getId() != this.f3932f) {
                return false;
            }
            View view2 = this.f3937k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f3938l = null;
                    this.f3937k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
            }
            this.f3938l = view2;
            return true;
        }

        boolean a() {
            return this.f3937k == null && this.f3932f != -1;
        }

        boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            Behavior behavior;
            return view2 == this.f3938l || u(view2, y1.Z(coordinatorLayout)) || ((behavior = this.f3927a) != null && behavior.f(coordinatorLayout, view, view2));
        }

        boolean c() {
            if (this.f3927a == null) {
                this.f3939m = false;
            }
            return this.f3939m;
        }

        View d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f3932f == -1) {
                this.f3938l = null;
                this.f3937k = null;
                return null;
            }
            if (this.f3937k == null || !v(view, coordinatorLayout)) {
                o(view, coordinatorLayout);
            }
            return this.f3937k;
        }

        @androidx.annotation.d0
        public int e() {
            return this.f3932f;
        }

        @q0
        public Behavior f() {
            return this.f3927a;
        }

        boolean g() {
            return this.f3942p;
        }

        Rect h() {
            return this.f3943q;
        }

        void i() {
            this.f3938l = null;
            this.f3937k = null;
        }

        boolean j(CoordinatorLayout coordinatorLayout, View view) {
            boolean z5 = this.f3939m;
            if (z5) {
                return true;
            }
            Behavior behavior = this.f3927a;
            boolean a6 = (behavior != null ? behavior.a(coordinatorLayout, view) : false) | z5;
            this.f3939m = a6;
            return a6;
        }

        boolean k(int i5) {
            if (i5 == 0) {
                return this.f3940n;
            }
            if (i5 != 1) {
                return false;
            }
            return this.f3941o;
        }

        void l() {
            this.f3942p = false;
        }

        void m(int i5) {
            t(i5, false);
        }

        void n() {
            this.f3939m = false;
        }

        public void p(@androidx.annotation.d0 int i5) {
            i();
            this.f3932f = i5;
        }

        public void q(@q0 Behavior behavior) {
            Behavior behavior2 = this.f3927a;
            if (behavior2 != behavior) {
                if (behavior2 != null) {
                    behavior2.k();
                }
                this.f3927a = behavior;
                this.f3944r = null;
                this.f3928b = true;
                if (behavior != null) {
                    behavior.h(this);
                }
            }
        }

        void r(boolean z5) {
            this.f3942p = z5;
        }

        void s(Rect rect) {
            this.f3943q.set(rect);
        }

        void t(int i5, boolean z5) {
            if (i5 == 0) {
                this.f3940n = z5;
            } else {
                if (i5 != 1) {
                    return;
                }
                this.f3941o = z5;
            }
        }

        f(@o0 Context context, @q0 AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3928b = false;
            this.f3929c = 0;
            this.f3930d = 0;
            this.f3931e = -1;
            this.f3932f = -1;
            this.f3933g = 0;
            this.f3934h = 0;
            this.f3943q = new Rect();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.j.f22898j);
            this.f3929c = obtainStyledAttributes.getInteger(a.j.f22899k, 0);
            this.f3932f = obtainStyledAttributes.getResourceId(a.j.f22900l, -1);
            this.f3930d = obtainStyledAttributes.getInteger(a.j.f22901m, 0);
            this.f3931e = obtainStyledAttributes.getInteger(a.j.f22905q, -1);
            this.f3933g = obtainStyledAttributes.getInt(a.j.f22904p, 0);
            this.f3934h = obtainStyledAttributes.getInt(a.j.f22903o, 0);
            int i5 = a.j.f22902n;
            boolean hasValue = obtainStyledAttributes.hasValue(i5);
            this.f3928b = hasValue;
            if (hasValue) {
                this.f3927a = CoordinatorLayout.Y(context, attributeSet, obtainStyledAttributes.getString(i5));
            }
            obtainStyledAttributes.recycle();
            Behavior behavior = this.f3927a;
            if (behavior != null) {
                behavior.h(this);
            }
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.f3928b = false;
            this.f3929c = 0;
            this.f3930d = 0;
            this.f3931e = -1;
            this.f3932f = -1;
            this.f3933g = 0;
            this.f3934h = 0;
            this.f3943q = new Rect();
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f3928b = false;
            this.f3929c = 0;
            this.f3930d = 0;
            this.f3931e = -1;
            this.f3932f = -1;
            this.f3933g = 0;
            this.f3934h = 0;
            this.f3943q = new Rect();
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3928b = false;
            this.f3929c = 0;
            this.f3930d = 0;
            this.f3931e = -1;
            this.f3932f = -1;
            this.f3933g = 0;
            this.f3934h = 0;
            this.f3943q = new Rect();
        }
    }
}
