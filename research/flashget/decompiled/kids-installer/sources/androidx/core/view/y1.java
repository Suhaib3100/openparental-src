package androidx.core.view;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.c1;
import androidx.core.view.a;
import androidx.core.view.accessibility.g0;
import androidx.core.view.v4;
import androidx.core.view.y1;
import androidx.core.view.y3;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import k.a;

/* compiled from: ViewCompat.java */
@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes.dex */
public class y1 {
    public static final int A = 1;
    public static final int B = 1;
    public static final int C = 2;
    public static final int D = 4;
    public static final int E = 8;
    public static final int F = 16;
    public static final int G = 32;
    private static Field I = null;
    private static boolean J = false;
    private static Field K = null;
    private static boolean L = false;
    private static Method M = null;
    private static Method N = null;
    private static boolean O = false;
    private static WeakHashMap<View, String> P = null;
    private static Method R = null;
    private static Field S = null;
    private static ThreadLocal<Rect> U = null;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final int f5740b = 0;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final int f5741c = 1;

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final int f5742d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f5743e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final int f5744f = 1;

    /* renamed from: g, reason: collision with root package name */
    public static final int f5745g = 2;

    /* renamed from: h, reason: collision with root package name */
    public static final int f5746h = 4;

    /* renamed from: i, reason: collision with root package name */
    public static final int f5747i = 0;

    /* renamed from: j, reason: collision with root package name */
    public static final int f5748j = 1;

    /* renamed from: k, reason: collision with root package name */
    public static final int f5749k = 2;

    /* renamed from: l, reason: collision with root package name */
    @Deprecated
    public static final int f5750l = 0;

    /* renamed from: m, reason: collision with root package name */
    @Deprecated
    public static final int f5751m = 1;

    /* renamed from: n, reason: collision with root package name */
    @Deprecated
    public static final int f5752n = 2;

    /* renamed from: o, reason: collision with root package name */
    public static final int f5753o = 0;

    /* renamed from: p, reason: collision with root package name */
    public static final int f5754p = 1;

    /* renamed from: q, reason: collision with root package name */
    public static final int f5755q = 2;

    /* renamed from: r, reason: collision with root package name */
    public static final int f5756r = 3;

    /* renamed from: s, reason: collision with root package name */
    @Deprecated
    public static final int f5757s = 16777215;

    /* renamed from: t, reason: collision with root package name */
    @Deprecated
    public static final int f5758t = -16777216;

    /* renamed from: u, reason: collision with root package name */
    @Deprecated
    public static final int f5759u = 16;

    /* renamed from: v, reason: collision with root package name */
    @Deprecated
    public static final int f5760v = 16777216;

    /* renamed from: w, reason: collision with root package name */
    public static final int f5761w = 0;

    /* renamed from: x, reason: collision with root package name */
    public static final int f5762x = 1;

    /* renamed from: y, reason: collision with root package name */
    public static final int f5763y = 2;

    /* renamed from: z, reason: collision with root package name */
    public static final int f5764z = 0;

    /* renamed from: a, reason: collision with root package name */
    private static final String f5739a = "ViewCompat";
    private static final AtomicInteger H = new AtomicInteger(1);
    private static WeakHashMap<View, r3> Q = null;
    private static boolean T = false;
    private static final int[] V = {a.e.f22975b, a.e.f22977c, a.e.f22999n, a.e.f23017y, a.e.B, a.e.C, a.e.D, a.e.E, a.e.F, a.e.G, a.e.f22979d, a.e.f22981e, a.e.f22983f, a.e.f22985g, a.e.f22987h, a.e.f22989i, a.e.f22991j, a.e.f22993k, a.e.f22995l, a.e.f22997m, a.e.f23001o, a.e.f23003p, a.e.f23005q, a.e.f23007r, a.e.f23009s, a.e.f23011t, a.e.f23013u, a.e.f23014v, a.e.f23015w, a.e.f23016x, a.e.f23018z, a.e.A};
    private static final q1 W = new q1() { // from class: androidx.core.view.x1
        @Override // androidx.core.view.q1
        public final g a(g gVar) {
            return y1.a(gVar);
        }
    };
    private static final e X = new e();

    /* compiled from: ViewCompat.java */
    /* loaded from: classes3.dex */
    class a extends f<Boolean> {
        a(int i5, Class cls, int i6) {
            super(i5, cls, 0, i6);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.y1.f
        @androidx.annotation.x0(28)
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Boolean d(@androidx.annotation.o0 View view) {
            return Boolean.valueOf(q.d(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.y1.f
        @androidx.annotation.x0(28)
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void e(@androidx.annotation.o0 View view, Boolean bool) {
            q.i(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.y1.f
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean h(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* compiled from: ViewCompat.java */
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface a0 {
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes3.dex */
    class b extends f<CharSequence> {
        b(int i5, Class cls, int i6, int i7) {
            super(i5, cls, i6, i7);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.y1.f
        @androidx.annotation.x0(28)
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public CharSequence d(View view) {
            return q.b(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.y1.f
        @androidx.annotation.x0(28)
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void e(View view, CharSequence charSequence) {
            q.h(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.y1.f
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* compiled from: ViewCompat.java */
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface b0 {
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes3.dex */
    class c extends f<CharSequence> {
        c(int i5, Class cls, int i6, int i7) {
            super(i5, cls, i6, i7);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.y1.f
        @androidx.annotation.x0(30)
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public CharSequence d(View view) {
            return s.a(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.y1.f
        @androidx.annotation.x0(30)
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void e(View view, CharSequence charSequence) {
            s.c(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.y1.f
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* compiled from: ViewCompat.java */
    static class c0 {

        /* renamed from: d, reason: collision with root package name */
        private static final ArrayList<WeakReference<View>> f5765d = new ArrayList<>();

        /* renamed from: a, reason: collision with root package name */
        @androidx.annotation.q0
        private WeakHashMap<View, Boolean> f5766a = null;

        /* renamed from: b, reason: collision with root package name */
        private SparseArray<WeakReference<View>> f5767b = null;

        /* renamed from: c, reason: collision with root package name */
        private WeakReference<KeyEvent> f5768c = null;

        c0() {
        }

        static c0 a(View view) {
            int i5 = a.e.f23000n0;
            c0 c0Var = (c0) view.getTag(i5);
            if (c0Var != null) {
                return c0Var;
            }
            c0 c0Var2 = new c0();
            view.setTag(i5, c0Var2);
            return c0Var2;
        }

        @androidx.annotation.q0
        private View c(View view, KeyEvent keyEvent) {
            View c6;
            WeakHashMap<View, Boolean> weakHashMap = this.f5766a;
            if (weakHashMap == null || !weakHashMap.containsKey(view)) {
                return null;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                do {
                    childCount--;
                    if (childCount >= 0) {
                        c6 = c(viewGroup.getChildAt(childCount), keyEvent);
                    }
                } while (c6 == null);
                return c6;
            }
            if (e(view, keyEvent)) {
                return view;
            }
            return null;
        }

        private SparseArray<WeakReference<View>> d() {
            if (this.f5767b == null) {
                this.f5767b = new SparseArray<>();
            }
            return this.f5767b;
        }

        private boolean e(@androidx.annotation.o0 View view, @androidx.annotation.o0 KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(a.e.f23002o0);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((z) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        private void g() {
            WeakHashMap<View, Boolean> weakHashMap = this.f5766a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = f5765d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                if (this.f5766a == null) {
                    this.f5766a = new WeakHashMap<>();
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ArrayList<WeakReference<View>> arrayList2 = f5765d;
                    View view = arrayList2.get(size).get();
                    if (view == null) {
                        arrayList2.remove(size);
                    } else {
                        this.f5766a.put(view, Boolean.TRUE);
                        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                            this.f5766a.put((View) parent, Boolean.TRUE);
                        }
                    }
                }
            }
        }

        static void h(View view) {
            ArrayList<WeakReference<View>> arrayList = f5765d;
            synchronized (arrayList) {
                Iterator<WeakReference<View>> it = arrayList.iterator();
                while (it.hasNext()) {
                    if (it.next().get() == view) {
                        return;
                    }
                }
                f5765d.add(new WeakReference<>(view));
            }
        }

        static void i(View view) {
            synchronized (f5765d) {
                int i5 = 0;
                while (true) {
                    ArrayList<WeakReference<View>> arrayList = f5765d;
                    if (i5 >= arrayList.size()) {
                        return;
                    }
                    if (arrayList.get(i5).get() == view) {
                        arrayList.remove(i5);
                        return;
                    }
                    i5++;
                }
            }
        }

        boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View c6 = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (c6 != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference<>(c6));
                }
            }
            return c6 != null;
        }

        boolean f(KeyEvent keyEvent) {
            WeakReference<View> weakReference;
            int indexOfKey;
            WeakReference<KeyEvent> weakReference2 = this.f5768c;
            if (weakReference2 != null && weakReference2.get() == keyEvent) {
                return false;
            }
            this.f5768c = new WeakReference<>(keyEvent);
            SparseArray<WeakReference<View>> d6 = d();
            if (keyEvent.getAction() != 1 || (indexOfKey = d6.indexOfKey(keyEvent.getKeyCode())) < 0) {
                weakReference = null;
            } else {
                weakReference = d6.valueAt(indexOfKey);
                d6.removeAt(indexOfKey);
            }
            if (weakReference == null) {
                weakReference = d6.get(keyEvent.getKeyCode());
            }
            if (weakReference == null) {
                return false;
            }
            View view = weakReference.get();
            if (view != null && y1.O0(view)) {
                e(view, keyEvent);
            }
            return true;
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes3.dex */
    class d extends f<Boolean> {
        d(int i5, Class cls, int i6) {
            super(i5, cls, 0, i6);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.y1.f
        @androidx.annotation.x0(28)
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Boolean d(View view) {
            return Boolean.valueOf(q.c(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.y1.f
        @androidx.annotation.x0(28)
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void e(View view, Boolean bool) {
            q.g(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.y1.f
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean h(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* compiled from: ViewCompat.java */
    static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: o, reason: collision with root package name */
        private final WeakHashMap<View, Boolean> f5769o = new WeakHashMap<>();

        e() {
        }

        @androidx.annotation.x0(19)
        private void b(View view, boolean z5) {
            boolean z6 = view.isShown() && view.getWindowVisibility() == 0;
            if (z5 != z6) {
                y1.d1(view, z6 ? 16 : 32);
                this.f5769o.put(view, Boolean.valueOf(z6));
            }
        }

        @androidx.annotation.x0(19)
        private void c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @androidx.annotation.x0(19)
        private void e(View view) {
            h.o(view.getViewTreeObserver(), this);
        }

        @androidx.annotation.x0(19)
        void a(View view) {
            this.f5769o.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (k.b(view)) {
                c(view);
            }
        }

        @androidx.annotation.x0(19)
        void d(View view) {
            this.f5769o.remove(view);
            view.removeOnAttachStateChangeListener(this);
            e(view);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        @androidx.annotation.x0(19)
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry<View, Boolean> entry : this.f5769o.entrySet()) {
                    b(entry.getKey(), entry.getValue().booleanValue());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        @androidx.annotation.x0(19)
        public void onViewAttachedToWindow(View view) {
            c(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* compiled from: ViewCompat.java */
    static abstract class f<T> {

        /* renamed from: a, reason: collision with root package name */
        private final int f5770a;

        /* renamed from: b, reason: collision with root package name */
        private final Class<T> f5771b;

        /* renamed from: c, reason: collision with root package name */
        private final int f5772c;

        /* renamed from: d, reason: collision with root package name */
        private final int f5773d;

        f(int i5, Class<T> cls, int i6) {
            this(i5, cls, 0, i6);
        }

        private boolean b() {
            return true;
        }

        private boolean c() {
            return Build.VERSION.SDK_INT >= this.f5772c;
        }

        boolean a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        abstract T d(View view);

        abstract void e(View view, T t5);

        T f(View view) {
            if (c()) {
                return d(view);
            }
            T t5 = (T) view.getTag(this.f5770a);
            if (this.f5771b.isInstance(t5)) {
                return t5;
            }
            return null;
        }

        void g(View view, T t5) {
            if (c()) {
                e(view, t5);
            } else if (h(f(view), t5)) {
                y1.C(view);
                view.setTag(this.f5770a, t5);
                y1.d1(view, this.f5773d);
            }
        }

        boolean h(T t5, T t6) {
            return !t6.equals(t5);
        }

        f(int i5, Class<T> cls, int i6, int i7) {
            this.f5770a = i5;
            this.f5771b = cls;
            this.f5773d = i6;
            this.f5772c = i7;
        }
    }

    /* compiled from: ViewCompat.java */
    @androidx.annotation.x0(15)
    static class g {
        private g() {
        }

        @androidx.annotation.u
        static boolean a(@androidx.annotation.o0 View view) {
            return view.hasOnClickListeners();
        }
    }

    /* compiled from: ViewCompat.java */
    @androidx.annotation.x0(16)
    static class h {
        private h() {
        }

        @androidx.annotation.u
        static AccessibilityNodeProvider a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        @androidx.annotation.u
        static boolean b(View view) {
            return view.getFitsSystemWindows();
        }

        @androidx.annotation.u
        static int c(View view) {
            return view.getImportantForAccessibility();
        }

        @androidx.annotation.u
        static int d(View view) {
            return view.getMinimumHeight();
        }

        @androidx.annotation.u
        static int e(View view) {
            return view.getMinimumWidth();
        }

        @androidx.annotation.u
        static ViewParent f(View view) {
            return view.getParentForAccessibility();
        }

        @androidx.annotation.u
        static int g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        @androidx.annotation.u
        static boolean h(View view) {
            return view.hasOverlappingRendering();
        }

        @androidx.annotation.u
        static boolean i(View view) {
            return view.hasTransientState();
        }

        @androidx.annotation.u
        static boolean j(View view, int i5, Bundle bundle) {
            return view.performAccessibilityAction(i5, bundle);
        }

        @androidx.annotation.u
        static void k(View view) {
            view.postInvalidateOnAnimation();
        }

        @androidx.annotation.u
        static void l(View view, int i5, int i6, int i7, int i8) {
            view.postInvalidateOnAnimation(i5, i6, i7, i8);
        }

        @androidx.annotation.u
        static void m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        @androidx.annotation.u
        static void n(View view, Runnable runnable, long j5) {
            view.postOnAnimationDelayed(runnable, j5);
        }

        @androidx.annotation.u
        static void o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        @androidx.annotation.u
        static void p(View view) {
            view.requestFitSystemWindows();
        }

        @androidx.annotation.u
        static void q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        @androidx.annotation.u
        static void r(View view, boolean z5) {
            view.setHasTransientState(z5);
        }

        @androidx.annotation.u
        static void s(View view, int i5) {
            view.setImportantForAccessibility(i5);
        }
    }

    /* compiled from: ViewCompat.java */
    @androidx.annotation.x0(17)
    static class i {
        private i() {
        }

        @androidx.annotation.u
        static int a() {
            return View.generateViewId();
        }

        @androidx.annotation.u
        static Display b(@androidx.annotation.o0 View view) {
            return view.getDisplay();
        }

        @androidx.annotation.u
        static int c(View view) {
            return view.getLabelFor();
        }

        @androidx.annotation.u
        static int d(View view) {
            return view.getLayoutDirection();
        }

        @androidx.annotation.u
        static int e(View view) {
            return view.getPaddingEnd();
        }

        @androidx.annotation.u
        static int f(View view) {
            return view.getPaddingStart();
        }

        @androidx.annotation.u
        static boolean g(View view) {
            return view.isPaddingRelative();
        }

        @androidx.annotation.u
        static void h(View view, int i5) {
            view.setLabelFor(i5);
        }

        @androidx.annotation.u
        static void i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        @androidx.annotation.u
        static void j(View view, int i5) {
            view.setLayoutDirection(i5);
        }

        @androidx.annotation.u
        static void k(View view, int i5, int i6, int i7, int i8) {
            view.setPaddingRelative(i5, i6, i7, i8);
        }
    }

    /* compiled from: ViewCompat.java */
    @androidx.annotation.x0(18)
    static class j {
        private j() {
        }

        @androidx.annotation.u
        static Rect a(@androidx.annotation.o0 View view) {
            return view.getClipBounds();
        }

        @androidx.annotation.u
        static boolean b(@androidx.annotation.o0 View view) {
            return view.isInLayout();
        }

        @androidx.annotation.u
        static void c(@androidx.annotation.o0 View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    /* compiled from: ViewCompat.java */
    @androidx.annotation.x0(19)
    static class k {
        private k() {
        }

        @androidx.annotation.u
        static int a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        @androidx.annotation.u
        static boolean b(@androidx.annotation.o0 View view) {
            return view.isAttachedToWindow();
        }

        @androidx.annotation.u
        static boolean c(@androidx.annotation.o0 View view) {
            return view.isLaidOut();
        }

        @androidx.annotation.u
        static boolean d(@androidx.annotation.o0 View view) {
            return view.isLayoutDirectionResolved();
        }

        @androidx.annotation.u
        static void e(ViewParent viewParent, View view, View view2, int i5) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i5);
        }

        @androidx.annotation.u
        static void f(View view, int i5) {
            view.setAccessibilityLiveRegion(i5);
        }

        @androidx.annotation.u
        static void g(AccessibilityEvent accessibilityEvent, int i5) {
            accessibilityEvent.setContentChangeTypes(i5);
        }
    }

    /* compiled from: ViewCompat.java */
    @androidx.annotation.x0(20)
    static class l {
        private l() {
        }

        @androidx.annotation.u
        static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        @androidx.annotation.u
        static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        @androidx.annotation.u
        static void c(View view) {
            view.requestApplyInsets();
        }
    }

    /* compiled from: ViewCompat.java */
    @androidx.annotation.x0(21)
    private static class m {

        /* compiled from: ViewCompat.java */
        class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a, reason: collision with root package name */
            v4 f5774a = null;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f5775b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ o1 f5776c;

            a(View view, o1 o1Var) {
                this.f5775b = view;
                this.f5776c = o1Var;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                v4 L = v4.L(windowInsets, view);
                int i5 = Build.VERSION.SDK_INT;
                if (i5 < 30) {
                    m.a(windowInsets, this.f5775b);
                    if (L.equals(this.f5774a)) {
                        return this.f5776c.a(view, L).J();
                    }
                }
                this.f5774a = L;
                v4 a6 = this.f5776c.a(view, L);
                if (i5 >= 30) {
                    return a6.J();
                }
                y1.v1(view);
                return a6.J();
            }
        }

        private m() {
        }

        @androidx.annotation.u
        static void a(@androidx.annotation.o0 WindowInsets windowInsets, @androidx.annotation.o0 View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(a.e.f23004p0);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        @androidx.annotation.u
        static v4 b(@androidx.annotation.o0 View view, @androidx.annotation.o0 v4 v4Var, @androidx.annotation.o0 Rect rect) {
            WindowInsets J = v4Var.J();
            if (J != null) {
                return v4.L(view.computeSystemWindowInsets(J, rect), view);
            }
            rect.setEmpty();
            return v4Var;
        }

        @androidx.annotation.u
        static boolean c(@androidx.annotation.o0 View view, float f6, float f7, boolean z5) {
            return view.dispatchNestedFling(f6, f7, z5);
        }

        @androidx.annotation.u
        static boolean d(@androidx.annotation.o0 View view, float f6, float f7) {
            return view.dispatchNestedPreFling(f6, f7);
        }

        @androidx.annotation.u
        static boolean e(View view, int i5, int i6, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i5, i6, iArr, iArr2);
        }

        @androidx.annotation.u
        static boolean f(View view, int i5, int i6, int i7, int i8, int[] iArr) {
            return view.dispatchNestedScroll(i5, i6, i7, i8, iArr);
        }

        @androidx.annotation.u
        static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        @androidx.annotation.u
        static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        @androidx.annotation.u
        static float i(View view) {
            return view.getElevation();
        }

        @androidx.annotation.q0
        @androidx.annotation.u
        public static v4 j(@androidx.annotation.o0 View view) {
            return v4.a.a(view);
        }

        @androidx.annotation.u
        static String k(View view) {
            return view.getTransitionName();
        }

        @androidx.annotation.u
        static float l(View view) {
            return view.getTranslationZ();
        }

        @androidx.annotation.u
        static float m(@androidx.annotation.o0 View view) {
            return view.getZ();
        }

        @androidx.annotation.u
        static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        @androidx.annotation.u
        static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        @androidx.annotation.u
        static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        @androidx.annotation.u
        static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        @androidx.annotation.u
        static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        @androidx.annotation.u
        static void s(View view, float f6) {
            view.setElevation(f6);
        }

        @androidx.annotation.u
        static void t(View view, boolean z5) {
            view.setNestedScrollingEnabled(z5);
        }

        @androidx.annotation.u
        static void u(@androidx.annotation.o0 View view, @androidx.annotation.q0 o1 o1Var) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(a.e.f22988h0, o1Var);
            }
            if (o1Var == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(a.e.f23004p0));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, o1Var));
            }
        }

        @androidx.annotation.u
        static void v(View view, String str) {
            view.setTransitionName(str);
        }

        @androidx.annotation.u
        static void w(View view, float f6) {
            view.setTranslationZ(f6);
        }

        @androidx.annotation.u
        static void x(@androidx.annotation.o0 View view, float f6) {
            view.setZ(f6);
        }

        @androidx.annotation.u
        static boolean y(View view, int i5) {
            return view.startNestedScroll(i5);
        }

        @androidx.annotation.u
        static void z(View view) {
            view.stopNestedScroll();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ViewCompat.java */
    @androidx.annotation.x0(23)
    static class n {
        private n() {
        }

        @androidx.annotation.q0
        public static v4 a(@androidx.annotation.o0 View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            v4 K = v4.K(rootWindowInsets);
            K.H(K);
            K.d(view.getRootView());
            return K;
        }

        @androidx.annotation.u
        static int b(@androidx.annotation.o0 View view) {
            return view.getScrollIndicators();
        }

        @androidx.annotation.u
        static void c(@androidx.annotation.o0 View view, int i5) {
            view.setScrollIndicators(i5);
        }

        @androidx.annotation.u
        static void d(@androidx.annotation.o0 View view, int i5, int i6) {
            view.setScrollIndicators(i5, i6);
        }
    }

    /* compiled from: ViewCompat.java */
    @androidx.annotation.x0(24)
    static class o {
        private o() {
        }

        @androidx.annotation.u
        static void a(@androidx.annotation.o0 View view) {
            view.cancelDragAndDrop();
        }

        @androidx.annotation.u
        static void b(View view) {
            view.dispatchFinishTemporaryDetach();
        }

        @androidx.annotation.u
        static void c(View view) {
            view.dispatchStartTemporaryDetach();
        }

        @androidx.annotation.u
        static void d(@androidx.annotation.o0 View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }

        @androidx.annotation.u
        static boolean e(@androidx.annotation.o0 View view, @androidx.annotation.q0 ClipData clipData, @androidx.annotation.o0 View.DragShadowBuilder dragShadowBuilder, @androidx.annotation.q0 Object obj, int i5) {
            return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i5);
        }

        @androidx.annotation.u
        static void f(@androidx.annotation.o0 View view, @androidx.annotation.o0 View.DragShadowBuilder dragShadowBuilder) {
            view.updateDragShadow(dragShadowBuilder);
        }
    }

    /* compiled from: ViewCompat.java */
    @androidx.annotation.x0(26)
    static class p {
        private p() {
        }

        @androidx.annotation.u
        static void a(@androidx.annotation.o0 View view, Collection<View> collection, int i5) {
            view.addKeyboardNavigationClusters(collection, i5);
        }

        @androidx.annotation.u
        static int b(View view) {
            int importantForAutofill;
            importantForAutofill = view.getImportantForAutofill();
            return importantForAutofill;
        }

        @androidx.annotation.u
        static int c(@androidx.annotation.o0 View view) {
            int nextClusterForwardId;
            nextClusterForwardId = view.getNextClusterForwardId();
            return nextClusterForwardId;
        }

        @androidx.annotation.u
        static boolean d(@androidx.annotation.o0 View view) {
            boolean hasExplicitFocusable;
            hasExplicitFocusable = view.hasExplicitFocusable();
            return hasExplicitFocusable;
        }

        @androidx.annotation.u
        static boolean e(@androidx.annotation.o0 View view) {
            boolean isFocusedByDefault;
            isFocusedByDefault = view.isFocusedByDefault();
            return isFocusedByDefault;
        }

        @androidx.annotation.u
        static boolean f(View view) {
            boolean isImportantForAutofill;
            isImportantForAutofill = view.isImportantForAutofill();
            return isImportantForAutofill;
        }

        @androidx.annotation.u
        static boolean g(@androidx.annotation.o0 View view) {
            boolean isKeyboardNavigationCluster;
            isKeyboardNavigationCluster = view.isKeyboardNavigationCluster();
            return isKeyboardNavigationCluster;
        }

        @androidx.annotation.u
        static View h(@androidx.annotation.o0 View view, View view2, int i5) {
            View keyboardNavigationClusterSearch;
            keyboardNavigationClusterSearch = view.keyboardNavigationClusterSearch(view2, i5);
            return keyboardNavigationClusterSearch;
        }

        @androidx.annotation.u
        static boolean i(@androidx.annotation.o0 View view) {
            boolean restoreDefaultFocus;
            restoreDefaultFocus = view.restoreDefaultFocus();
            return restoreDefaultFocus;
        }

        @androidx.annotation.u
        static void j(@androidx.annotation.o0 View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        @androidx.annotation.u
        static void k(@androidx.annotation.o0 View view, boolean z5) {
            view.setFocusedByDefault(z5);
        }

        @androidx.annotation.u
        static void l(View view, int i5) {
            view.setImportantForAutofill(i5);
        }

        @androidx.annotation.u
        static void m(@androidx.annotation.o0 View view, boolean z5) {
            view.setKeyboardNavigationCluster(z5);
        }

        @androidx.annotation.u
        static void n(View view, int i5) {
            view.setNextClusterForwardId(i5);
        }

        @androidx.annotation.u
        static void o(@androidx.annotation.o0 View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* compiled from: ViewCompat.java */
    @androidx.annotation.x0(28)
    static class q {
        private q() {
        }

        @androidx.annotation.u
        static void a(@androidx.annotation.o0 View view, @androidx.annotation.o0 final z zVar) {
            int i5 = a.e.f23002o0;
            androidx.collection.i iVar = (androidx.collection.i) view.getTag(i5);
            if (iVar == null) {
                iVar = new androidx.collection.i();
                view.setTag(i5, iVar);
            }
            Objects.requireNonNull(zVar);
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener() { // from class: androidx.core.view.w2
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    return y1.z.this.onUnhandledKeyEvent(view2, keyEvent);
                }
            };
            iVar.put(zVar, onUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        @androidx.annotation.u
        static CharSequence b(View view) {
            CharSequence accessibilityPaneTitle;
            accessibilityPaneTitle = view.getAccessibilityPaneTitle();
            return accessibilityPaneTitle;
        }

        @androidx.annotation.u
        static boolean c(View view) {
            boolean isAccessibilityHeading;
            isAccessibilityHeading = view.isAccessibilityHeading();
            return isAccessibilityHeading;
        }

        @androidx.annotation.u
        static boolean d(View view) {
            boolean isScreenReaderFocusable;
            isScreenReaderFocusable = view.isScreenReaderFocusable();
            return isScreenReaderFocusable;
        }

        @androidx.annotation.u
        static void e(@androidx.annotation.o0 View view, @androidx.annotation.o0 z zVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            androidx.collection.i iVar = (androidx.collection.i) view.getTag(a.e.f23002o0);
            if (iVar == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) iVar.get(zVar)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        @androidx.annotation.u
        static <T> T f(View view, int i5) {
            KeyEvent.Callback requireViewById;
            requireViewById = view.requireViewById(i5);
            return (T) requireViewById;
        }

        @androidx.annotation.u
        static void g(View view, boolean z5) {
            view.setAccessibilityHeading(z5);
        }

        @androidx.annotation.u
        static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        @androidx.annotation.u
        static void i(View view, boolean z5) {
            view.setScreenReaderFocusable(z5);
        }
    }

    /* compiled from: ViewCompat.java */
    @androidx.annotation.x0(29)
    private static class r {
        private r() {
        }

        @androidx.annotation.u
        static View.AccessibilityDelegate a(View view) {
            View.AccessibilityDelegate accessibilityDelegate;
            accessibilityDelegate = view.getAccessibilityDelegate();
            return accessibilityDelegate;
        }

        @androidx.annotation.u
        static List<Rect> b(View view) {
            List<Rect> systemGestureExclusionRects;
            systemGestureExclusionRects = view.getSystemGestureExclusionRects();
            return systemGestureExclusionRects;
        }

        @androidx.annotation.u
        static void c(@androidx.annotation.o0 View view, @androidx.annotation.o0 Context context, @androidx.annotation.o0 int[] iArr, @androidx.annotation.q0 AttributeSet attributeSet, @androidx.annotation.o0 TypedArray typedArray, int i5, int i6) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i5, i6);
        }

        @androidx.annotation.u
        static void d(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    /* compiled from: ViewCompat.java */
    @androidx.annotation.x0(30)
    private static class s {
        private s() {
        }

        @androidx.annotation.u
        static CharSequence a(View view) {
            CharSequence stateDescription;
            stateDescription = view.getStateDescription();
            return stateDescription;
        }

        @androidx.annotation.q0
        public static z5 b(@androidx.annotation.o0 View view) {
            WindowInsetsController windowInsetsController;
            windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return z5.l(windowInsetsController);
            }
            return null;
        }

        @androidx.annotation.u
        static void c(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* compiled from: ViewCompat.java */
    @androidx.annotation.x0(31)
    private static final class t {
        private t() {
        }

        @androidx.annotation.q0
        @androidx.annotation.u
        public static String[] a(@androidx.annotation.o0 View view) {
            String[] receiveContentMimeTypes;
            receiveContentMimeTypes = view.getReceiveContentMimeTypes();
            return receiveContentMimeTypes;
        }

        @androidx.annotation.q0
        @androidx.annotation.u
        public static androidx.core.view.g b(@androidx.annotation.o0 View view, @androidx.annotation.o0 androidx.core.view.g gVar) {
            ContentInfo performReceiveContent;
            ContentInfo l5 = gVar.l();
            performReceiveContent = view.performReceiveContent(l5);
            if (performReceiveContent == null) {
                return null;
            }
            return performReceiveContent == l5 ? gVar : androidx.core.view.g.m(performReceiveContent);
        }

        @androidx.annotation.u
        public static void c(@androidx.annotation.o0 View view, @androidx.annotation.q0 String[] strArr, @androidx.annotation.q0 p1 p1Var) {
            if (p1Var == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new y(p1Var));
            }
        }
    }

    /* compiled from: ViewCompat.java */
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface u {
    }

    /* compiled from: ViewCompat.java */
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface v {
    }

    /* compiled from: ViewCompat.java */
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface w {
    }

    /* compiled from: ViewCompat.java */
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface x {
    }

    /* compiled from: ViewCompat.java */
    @androidx.annotation.x0(31)
    private static final class y implements OnReceiveContentListener {

        /* renamed from: a, reason: collision with root package name */
        @androidx.annotation.o0
        private final p1 f5777a;

        y(@androidx.annotation.o0 p1 p1Var) {
            this.f5777a = p1Var;
        }

        @Override // android.view.OnReceiveContentListener
        @androidx.annotation.q0
        public ContentInfo onReceiveContent(@androidx.annotation.o0 View view, @androidx.annotation.o0 ContentInfo contentInfo) {
            androidx.core.view.g m5 = androidx.core.view.g.m(contentInfo);
            androidx.core.view.g a6 = this.f5777a.a(view, m5);
            if (a6 == null) {
                return null;
            }
            return a6 == m5 ? contentInfo : a6.l();
        }
    }

    /* compiled from: ViewCompat.java */
    public interface z {
        boolean onUnhandledKeyEvent(@androidx.annotation.o0 View view, @androidx.annotation.o0 KeyEvent keyEvent);
    }

    @Deprecated
    protected y1() {
    }

    @androidx.annotation.l1
    static boolean A(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return c0.a(view).f(keyEvent);
    }

    public static float A0(@androidx.annotation.o0 View view) {
        return m.l(view);
    }

    private static f<Boolean> A1() {
        return new a(a.e.f22994k0, Boolean.class, 28);
    }

    @Deprecated
    public static void A2(View view, float f6) {
        view.setY(f6);
    }

    public static void B(@androidx.annotation.o0 View view) {
        C(view);
    }

    @androidx.annotation.q0
    @Deprecated
    public static z5 B0(@androidx.annotation.o0 View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return s.b(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return new z5(window, view);
                }
                return null;
            }
        }
        return null;
    }

    public static void B1(@androidx.annotation.o0 View view, @androidx.annotation.q0 androidx.core.view.a aVar) {
        if (aVar == null && (F(view) instanceof a.C0053a)) {
            aVar = new androidx.core.view.a();
        }
        view.setAccessibilityDelegate(aVar == null ? null : aVar.d());
    }

    public static void B2(@androidx.annotation.o0 View view, float f6) {
        m.x(view, f6);
    }

    static void C(@androidx.annotation.o0 View view) {
        androidx.core.view.a E2 = E(view);
        if (E2 == null) {
            E2 = new androidx.core.view.a();
        }
        B1(view, E2);
    }

    @Deprecated
    public static int C0(@androidx.annotation.o0 View view) {
        return h.g(view);
    }

    @androidx.annotation.l1
    public static void C1(@androidx.annotation.o0 View view, boolean z5) {
        b().g(view, Boolean.valueOf(z5));
    }

    public static boolean C2(@androidx.annotation.o0 View view, @androidx.annotation.q0 ClipData clipData, @androidx.annotation.o0 View.DragShadowBuilder dragShadowBuilder, @androidx.annotation.q0 Object obj, int i5) {
        return o.e(view, clipData, dragShadowBuilder, obj, i5);
    }

    public static int D() {
        return i.a();
    }

    @Deprecated
    public static float D0(View view) {
        return view.getX();
    }

    public static void D1(@androidx.annotation.o0 View view, int i5) {
        k.f(view, i5);
    }

    public static boolean D2(@androidx.annotation.o0 View view, int i5) {
        return m.y(view, i5);
    }

    @androidx.annotation.q0
    public static androidx.core.view.a E(@androidx.annotation.o0 View view) {
        View.AccessibilityDelegate F2 = F(view);
        if (F2 == null) {
            return null;
        }
        return F2 instanceof a.C0053a ? ((a.C0053a) F2).f5304a : new androidx.core.view.a(F2);
    }

    @Deprecated
    public static float E0(View view) {
        return view.getY();
    }

    @androidx.annotation.l1
    public static void E1(@androidx.annotation.o0 View view, @androidx.annotation.q0 CharSequence charSequence) {
        k1().g(view, charSequence);
        if (charSequence != null) {
            X.a(view);
        } else {
            X.d(view);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean E2(@androidx.annotation.o0 View view, int i5, int i6) {
        if (view instanceof g1) {
            return ((g1) view).f(i5, i6);
        }
        if (i6 == 0) {
            return m.y(view, i5);
        }
        return false;
    }

    @androidx.annotation.q0
    private static View.AccessibilityDelegate F(@androidx.annotation.o0 View view) {
        return Build.VERSION.SDK_INT >= 29 ? r.a(view) : G(view);
    }

    public static float F0(@androidx.annotation.o0 View view) {
        return m.m(view);
    }

    @Deprecated
    public static void F1(View view, boolean z5) {
        view.setActivated(z5);
    }

    private static f<CharSequence> F2() {
        return new c(a.e.f22996l0, CharSequence.class, 64, 30);
    }

    @androidx.annotation.q0
    private static View.AccessibilityDelegate G(@androidx.annotation.o0 View view) {
        if (T) {
            return null;
        }
        if (S == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                S = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                T = true;
                return null;
            }
        }
        try {
            Object obj = S.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            T = true;
            return null;
        }
    }

    public static boolean G0(@androidx.annotation.o0 View view) {
        return F(view) != null;
    }

    @Deprecated
    public static void G1(View view, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f6) {
        view.setAlpha(f6);
    }

    public static void G2(@androidx.annotation.o0 View view) {
        m.z(view);
    }

    public static int H(@androidx.annotation.o0 View view) {
        return k.a(view);
    }

    public static boolean H0(@androidx.annotation.o0 View view) {
        return Build.VERSION.SDK_INT >= 26 ? p.d(view) : view.hasFocusable();
    }

    public static void H1(@androidx.annotation.o0 View view, @androidx.annotation.q0 String... strArr) {
        if (Build.VERSION.SDK_INT >= 26) {
            p.j(view, strArr);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void H2(@androidx.annotation.o0 View view, int i5) {
        if (view instanceof g1) {
            ((g1) view).g(i5);
        } else if (i5 == 0) {
            m.z(view);
        }
    }

    @androidx.annotation.q0
    public static androidx.core.view.accessibility.k0 I(@androidx.annotation.o0 View view) {
        AccessibilityNodeProvider a6 = h.a(view);
        if (a6 != null) {
            return new androidx.core.view.accessibility.k0(a6);
        }
        return null;
    }

    public static boolean I0(@androidx.annotation.o0 View view) {
        return m.n(view);
    }

    public static void I1(@androidx.annotation.o0 View view, @androidx.annotation.q0 Drawable drawable) {
        h.q(view, drawable);
    }

    private static void I2(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    @androidx.annotation.q0
    @androidx.annotation.l1
    public static CharSequence J(@androidx.annotation.o0 View view) {
        return k1().f(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean J0(@androidx.annotation.o0 View view, int i5) {
        if (view instanceof g1) {
            ((g1) view).d(i5);
            return false;
        }
        if (i5 == 0) {
            return m.n(view);
        }
        return false;
    }

    public static void J1(@androidx.annotation.o0 View view, @androidx.annotation.q0 ColorStateList colorStateList) {
        m.q(view, colorStateList);
    }

    public static void J2(@androidx.annotation.o0 View view, @androidx.annotation.o0 View.DragShadowBuilder dragShadowBuilder) {
        o.f(view, dragShadowBuilder);
    }

    private static List<g0.a> K(View view) {
        int i5 = a.e.f22980d0;
        ArrayList arrayList = (ArrayList) view.getTag(i5);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(i5, arrayList2);
        return arrayList2;
    }

    public static boolean K0(@androidx.annotation.o0 View view) {
        return g.a(view);
    }

    public static void K1(@androidx.annotation.o0 View view, @androidx.annotation.q0 PorterDuff.Mode mode) {
        m.r(view, mode);
    }

    @Deprecated
    public static float L(View view) {
        return view.getAlpha();
    }

    public static boolean L0(@androidx.annotation.o0 View view) {
        return h.h(view);
    }

    @SuppressLint({"BanUncheckedReflection"})
    @Deprecated
    public static void L1(ViewGroup viewGroup, boolean z5) {
        if (R == null) {
            try {
                R = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
            }
            R.setAccessible(true);
        }
        try {
            R.invoke(viewGroup, Boolean.valueOf(z5));
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
        }
    }

    private static int M(View view, @androidx.annotation.o0 CharSequence charSequence) {
        List<g0.a> K2 = K(view);
        for (int i5 = 0; i5 < K2.size(); i5++) {
            if (TextUtils.equals(charSequence, K2.get(i5).c())) {
                return K2.get(i5).b();
            }
        }
        int i6 = -1;
        int i7 = 0;
        while (true) {
            int[] iArr = V;
            if (i7 >= iArr.length || i6 != -1) {
                break;
            }
            int i8 = iArr[i7];
            boolean z5 = true;
            for (int i9 = 0; i9 < K2.size(); i9++) {
                z5 &= K2.get(i9).b() != i8;
            }
            if (z5) {
                i6 = i8;
            }
            i7++;
        }
        return i6;
    }

    public static boolean M0(@androidx.annotation.o0 View view) {
        return h.i(view);
    }

    public static void M1(@androidx.annotation.o0 View view, @androidx.annotation.q0 Rect rect) {
        j.c(view, rect);
    }

    @androidx.annotation.q0
    public static ColorStateList N(@androidx.annotation.o0 View view) {
        return m.g(view);
    }

    @androidx.annotation.l1
    public static boolean N0(@androidx.annotation.o0 View view) {
        Boolean f6 = b().f(view);
        return f6 != null && f6.booleanValue();
    }

    public static void N1(@androidx.annotation.o0 View view, float f6) {
        m.s(view, f6);
    }

    @androidx.annotation.q0
    public static PorterDuff.Mode O(@androidx.annotation.o0 View view) {
        return m.h(view);
    }

    public static boolean O0(@androidx.annotation.o0 View view) {
        return k.b(view);
    }

    @Deprecated
    public static void O1(View view, boolean z5) {
        view.setFitsSystemWindows(z5);
    }

    @androidx.annotation.q0
    public static Rect P(@androidx.annotation.o0 View view) {
        return j.a(view);
    }

    public static boolean P0(@androidx.annotation.o0 View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return p.e(view);
        }
        return false;
    }

    public static void P1(@androidx.annotation.o0 View view, boolean z5) {
        if (Build.VERSION.SDK_INT >= 26) {
            p.k(view, z5);
        }
    }

    @androidx.annotation.q0
    public static Display Q(@androidx.annotation.o0 View view) {
        return i.b(view);
    }

    public static boolean Q0(@androidx.annotation.o0 View view) {
        return m.o(view);
    }

    public static void Q1(@androidx.annotation.o0 View view, boolean z5) {
        h.r(view, z5);
    }

    public static float R(@androidx.annotation.o0 View view) {
        return m.i(view);
    }

    public static boolean R0(@androidx.annotation.o0 View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return p.f(view);
        }
        return true;
    }

    @androidx.annotation.l1
    public static void R1(@androidx.annotation.o0 View view, int i5) {
        h.s(view, i5);
    }

    private static Rect S() {
        if (U == null) {
            U = new ThreadLocal<>();
        }
        Rect rect = U.get();
        if (rect == null) {
            rect = new Rect();
            U.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static boolean S0(@androidx.annotation.o0 View view) {
        return j.b(view);
    }

    public static void S1(@androidx.annotation.o0 View view, int i5) {
        if (Build.VERSION.SDK_INT >= 26) {
            p.l(view, i5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static q1 T(@androidx.annotation.o0 View view) {
        return view instanceof q1 ? (q1) view : W;
    }

    public static boolean T0(@androidx.annotation.o0 View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return p.g(view);
        }
        return false;
    }

    public static void T1(@androidx.annotation.o0 View view, boolean z5) {
        if (Build.VERSION.SDK_INT >= 26) {
            p.m(view, z5);
        }
    }

    public static boolean U(@androidx.annotation.o0 View view) {
        return h.b(view);
    }

    public static boolean U0(@androidx.annotation.o0 View view) {
        return k.c(view);
    }

    public static void U1(@androidx.annotation.o0 View view, @androidx.annotation.d0 int i5) {
        i.h(view, i5);
    }

    public static int V(@androidx.annotation.o0 View view) {
        return h.c(view);
    }

    public static boolean V0(@androidx.annotation.o0 View view) {
        return k.d(view);
    }

    public static void V1(@androidx.annotation.o0 View view, @androidx.annotation.q0 Paint paint) {
        i.i(view, paint);
    }

    @SuppressLint({"InlinedApi"})
    public static int W(@androidx.annotation.o0 View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return p.b(view);
        }
        return 0;
    }

    public static boolean W0(@androidx.annotation.o0 View view) {
        return m.p(view);
    }

    @Deprecated
    public static void W1(View view, int i5, Paint paint) {
        view.setLayerType(i5, paint);
    }

    public static int X(@androidx.annotation.o0 View view) {
        return i.c(view);
    }

    @Deprecated
    public static boolean X0(View view) {
        return view.isOpaque();
    }

    public static void X1(@androidx.annotation.o0 View view, int i5) {
        i.j(view, i5);
    }

    @Deprecated
    public static int Y(View view) {
        return view.getLayerType();
    }

    public static boolean Y0(@androidx.annotation.o0 View view) {
        return i.g(view);
    }

    public static void Y1(@androidx.annotation.o0 View view, boolean z5) {
        m.t(view, z5);
    }

    public static int Z(@androidx.annotation.o0 View view) {
        return i.d(view);
    }

    @androidx.annotation.l1
    public static boolean Z0(@androidx.annotation.o0 View view) {
        Boolean f6 = A1().f(view);
        return f6 != null && f6.booleanValue();
    }

    public static void Z1(@androidx.annotation.o0 View view, int i5) {
        if (Build.VERSION.SDK_INT >= 26) {
            p.n(view, i5);
        }
    }

    public static /* synthetic */ androidx.core.view.g a(androidx.core.view.g gVar) {
        return gVar;
    }

    @androidx.annotation.q0
    @Deprecated
    public static Matrix a0(View view) {
        return view.getMatrix();
    }

    @Deprecated
    public static void a1(View view) {
        view.jumpDrawablesToCurrentState();
    }

    public static void a2(@androidx.annotation.o0 View view, @androidx.annotation.q0 o1 o1Var) {
        m.u(view, o1Var);
    }

    private static f<Boolean> b() {
        return new d(a.e.f22984f0, Boolean.class, 28);
    }

    @Deprecated
    public static int b0(View view) {
        return view.getMeasuredHeightAndState();
    }

    @androidx.annotation.q0
    public static View b1(@androidx.annotation.o0 View view, @androidx.annotation.q0 View view2, int i5) {
        if (Build.VERSION.SDK_INT >= 26) {
            return p.h(view, view2, i5);
        }
        return null;
    }

    public static void b2(@androidx.annotation.o0 View view, @androidx.annotation.q0 String[] strArr, @androidx.annotation.q0 p1 p1Var) {
        if (Build.VERSION.SDK_INT >= 31) {
            t.c(view, strArr, p1Var);
            return;
        }
        if (strArr == null || strArr.length == 0) {
            strArr = null;
        }
        boolean z5 = false;
        if (p1Var != null) {
            androidx.core.util.q.b(strArr != null, "When the listener is set, MIME types must also be set");
        }
        if (strArr != null) {
            int length = strArr.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    break;
                }
                if (strArr[i5].startsWith("*")) {
                    z5 = true;
                    break;
                }
                i5++;
            }
            androidx.core.util.q.b(!z5, "A MIME type set here must not start with *: " + Arrays.toString(strArr));
        }
        view.setTag(a.e.f22992j0, strArr);
        view.setTag(a.e.f22990i0, p1Var);
    }

    public static int c(@androidx.annotation.o0 View view, @androidx.annotation.o0 CharSequence charSequence, @androidx.annotation.o0 androidx.core.view.accessibility.m0 m0Var) {
        int M2 = M(view, charSequence);
        if (M2 != -1) {
            d(view, new g0.a(M2, charSequence, m0Var));
        }
        return M2;
    }

    @Deprecated
    public static int c0(View view) {
        return view.getMeasuredState();
    }

    private static /* synthetic */ androidx.core.view.g c1(androidx.core.view.g gVar) {
        return gVar;
    }

    @Deprecated
    public static void c2(View view, int i5) {
        view.setOverScrollMode(i5);
    }

    private static void d(@androidx.annotation.o0 View view, @androidx.annotation.o0 g0.a aVar) {
        C(view);
        s1(aVar.b(), view);
        K(view).add(aVar);
        d1(view, 0);
    }

    @Deprecated
    public static int d0(View view) {
        return view.getMeasuredWidthAndState();
    }

    @androidx.annotation.x0(19)
    static void d1(View view, int i5) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z5 = J(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (k.a(view) != 0 || z5) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z5 ? 32 : 2048);
                k.g(obtain, i5);
                if (z5) {
                    obtain.getText().add(J(view));
                    x2(view);
                }
                view.sendAccessibilityEventUnchecked(obtain);
                return;
            }
            if (i5 != 32) {
                if (view.getParent() != null) {
                    try {
                        k.e(view.getParent(), view, view, i5);
                        return;
                    } catch (AbstractMethodError unused) {
                        view.getParent().getClass();
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(obtain2);
            obtain2.setEventType(32);
            k.g(obtain2, i5);
            obtain2.setSource(view);
            view.onPopulateAccessibilityEvent(obtain2);
            obtain2.getText().add(J(view));
            accessibilityManager.sendAccessibilityEvent(obtain2);
        }
    }

    public static void d2(@androidx.annotation.o0 View view, @androidx.annotation.u0 int i5, @androidx.annotation.u0 int i6, @androidx.annotation.u0 int i7, @androidx.annotation.u0 int i8) {
        i.k(view, i5, i6, i7, i8);
    }

    public static void e(@androidx.annotation.o0 View view, @androidx.annotation.o0 Collection<View> collection, int i5) {
        if (Build.VERSION.SDK_INT >= 26) {
            p.a(view, collection, i5);
        }
    }

    public static int e0(@androidx.annotation.o0 View view) {
        return h.d(view);
    }

    public static void e1(@androidx.annotation.o0 View view, int i5) {
        view.offsetLeftAndRight(i5);
    }

    @Deprecated
    public static void e2(View view, float f6) {
        view.setPivotX(f6);
    }

    public static void f(@androidx.annotation.o0 View view, @androidx.annotation.o0 z zVar) {
        if (Build.VERSION.SDK_INT >= 28) {
            q.a(view, zVar);
            return;
        }
        int i5 = a.e.f23002o0;
        ArrayList arrayList = (ArrayList) view.getTag(i5);
        if (arrayList == null) {
            arrayList = new ArrayList();
            view.setTag(i5, arrayList);
        }
        arrayList.add(zVar);
        if (arrayList.size() == 1) {
            c0.h(view);
        }
    }

    public static int f0(@androidx.annotation.o0 View view) {
        return h.e(view);
    }

    public static void f1(@androidx.annotation.o0 View view, int i5) {
        view.offsetTopAndBottom(i5);
    }

    @Deprecated
    public static void f2(View view, float f6) {
        view.setPivotY(f6);
    }

    @androidx.annotation.o0
    public static r3 g(@androidx.annotation.o0 View view) {
        if (Q == null) {
            Q = new WeakHashMap<>();
        }
        r3 r3Var = Q.get(view);
        if (r3Var != null) {
            return r3Var;
        }
        r3 r3Var2 = new r3(view);
        Q.put(view, r3Var2);
        return r3Var2;
    }

    public static int g0(@androidx.annotation.o0 View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return p.c(view);
        }
        return -1;
    }

    @androidx.annotation.o0
    public static v4 g1(@androidx.annotation.o0 View view, @androidx.annotation.o0 v4 v4Var) {
        WindowInsets J2 = v4Var.J();
        if (J2 != null) {
            WindowInsets b6 = l.b(view, J2);
            if (!b6.equals(J2)) {
                return v4.L(b6, view);
            }
        }
        return v4Var;
    }

    public static void g2(@androidx.annotation.o0 View view, @androidx.annotation.q0 s1 s1Var) {
        o.d(view, (PointerIcon) (s1Var != null ? s1Var.b() : null));
    }

    private static void h() {
        try {
            M = View.class.getDeclaredMethod("dispatchStartTemporaryDetach", new Class[0]);
            N = View.class.getDeclaredMethod("dispatchFinishTemporaryDetach", new Class[0]);
        } catch (NoSuchMethodException unused) {
        }
        O = true;
    }

    @androidx.annotation.q0
    public static String[] h0(@androidx.annotation.o0 View view) {
        return Build.VERSION.SDK_INT >= 31 ? t.a(view) : (String[]) view.getTag(a.e.f22992j0);
    }

    @Deprecated
    public static void h1(View view, AccessibilityEvent accessibilityEvent) {
        view.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    @Deprecated
    public static void h2(View view, float f6) {
        view.setRotation(f6);
    }

    @Deprecated
    public static boolean i(View view, int i5) {
        return view.canScrollHorizontally(i5);
    }

    @Deprecated
    public static int i0(View view) {
        return view.getOverScrollMode();
    }

    public static void i1(@androidx.annotation.o0 View view, @androidx.annotation.o0 androidx.core.view.accessibility.g0 g0Var) {
        view.onInitializeAccessibilityNodeInfo(g0Var.W1());
    }

    @Deprecated
    public static void i2(View view, float f6) {
        view.setRotationX(f6);
    }

    @Deprecated
    public static boolean j(View view, int i5) {
        return view.canScrollVertically(i5);
    }

    @androidx.annotation.u0
    public static int j0(@androidx.annotation.o0 View view) {
        return i.e(view);
    }

    @Deprecated
    public static void j1(View view, AccessibilityEvent accessibilityEvent) {
        view.onPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Deprecated
    public static void j2(View view, float f6) {
        view.setRotationY(f6);
    }

    public static void k(@androidx.annotation.o0 View view) {
        o.a(view);
    }

    @androidx.annotation.u0
    public static int k0(@androidx.annotation.o0 View view) {
        return i.f(view);
    }

    private static f<CharSequence> k1() {
        return new b(a.e.f22986g0, CharSequence.class, 8, 28);
    }

    @Deprecated
    public static void k2(View view, boolean z5) {
        view.setSaveFromParentEnabled(z5);
    }

    @Deprecated
    public static int l(int i5, int i6) {
        return View.combineMeasuredStates(i5, i6);
    }

    @androidx.annotation.q0
    public static ViewParent l0(@androidx.annotation.o0 View view) {
        return h.f(view);
    }

    public static boolean l1(@androidx.annotation.o0 View view, int i5, @androidx.annotation.q0 Bundle bundle) {
        return h.j(view, i5, bundle);
    }

    @Deprecated
    public static void l2(View view, float f6) {
        view.setScaleX(f6);
    }

    private static void m(View view, int i5) {
        view.offsetLeftAndRight(i5);
        if (view.getVisibility() == 0) {
            I2(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                I2((View) parent);
            }
        }
    }

    @Deprecated
    public static float m0(View view) {
        return view.getPivotX();
    }

    @androidx.annotation.q0
    public static androidx.core.view.g m1(@androidx.annotation.o0 View view, @androidx.annotation.o0 androidx.core.view.g gVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Objects.toString(gVar);
            view.getClass();
            view.getId();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return t.b(view, gVar);
        }
        p1 p1Var = (p1) view.getTag(a.e.f22990i0);
        if (p1Var == null) {
            return T(view).a(gVar);
        }
        androidx.core.view.g a6 = p1Var.a(view, gVar);
        if (a6 == null) {
            return null;
        }
        return T(view).a(a6);
    }

    @Deprecated
    public static void m2(View view, float f6) {
        view.setScaleY(f6);
    }

    private static void n(View view, int i5) {
        view.offsetTopAndBottom(i5);
        if (view.getVisibility() == 0) {
            I2(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                I2((View) parent);
            }
        }
    }

    @Deprecated
    public static float n0(View view) {
        return view.getPivotY();
    }

    public static void n1(@androidx.annotation.o0 View view) {
        h.k(view);
    }

    @androidx.annotation.l1
    public static void n2(@androidx.annotation.o0 View view, boolean z5) {
        A1().g(view, Boolean.valueOf(z5));
    }

    @androidx.annotation.o0
    public static v4 o(@androidx.annotation.o0 View view, @androidx.annotation.o0 v4 v4Var, @androidx.annotation.o0 Rect rect) {
        return m.b(view, v4Var, rect);
    }

    @androidx.annotation.q0
    public static v4 o0(@androidx.annotation.o0 View view) {
        return n.a(view);
    }

    public static void o1(@androidx.annotation.o0 View view, int i5, int i6, int i7, int i8) {
        h.l(view, i5, i6, i7, i8);
    }

    public static void o2(@androidx.annotation.o0 View view, int i5) {
        n.c(view, i5);
    }

    @androidx.annotation.o0
    public static v4 p(@androidx.annotation.o0 View view, @androidx.annotation.o0 v4 v4Var) {
        WindowInsets J2 = v4Var.J();
        if (J2 != null) {
            WindowInsets a6 = l.a(view, J2);
            if (!a6.equals(J2)) {
                return v4.L(a6, view);
            }
        }
        return v4Var;
    }

    @Deprecated
    public static float p0(View view) {
        return view.getRotation();
    }

    public static void p1(@androidx.annotation.o0 View view, @androidx.annotation.o0 Runnable runnable) {
        h.m(view, runnable);
    }

    public static void p2(@androidx.annotation.o0 View view, int i5, int i6) {
        n.d(view, i5, i6);
    }

    public static void q(@androidx.annotation.o0 View view) {
        o.b(view);
    }

    @Deprecated
    public static float q0(View view) {
        return view.getRotationX();
    }

    @SuppressLint({"LambdaLast"})
    public static void q1(@androidx.annotation.o0 View view, @androidx.annotation.o0 Runnable runnable, long j5) {
        h.n(view, runnable, j5);
    }

    @androidx.annotation.l1
    public static void q2(@androidx.annotation.o0 View view, @androidx.annotation.q0 CharSequence charSequence) {
        F2().g(view, charSequence);
    }

    public static boolean r(@androidx.annotation.o0 View view, float f6, float f7, boolean z5) {
        return m.c(view, f6, f7, z5);
    }

    @Deprecated
    public static float r0(View view) {
        return view.getRotationY();
    }

    public static void r1(@androidx.annotation.o0 View view, int i5) {
        s1(i5, view);
        d1(view, 0);
    }

    public static void r2(@androidx.annotation.o0 View view, @androidx.annotation.o0 List<Rect> list) {
        if (Build.VERSION.SDK_INT >= 29) {
            r.d(view, list);
        }
    }

    public static boolean s(@androidx.annotation.o0 View view, float f6, float f7) {
        return m.d(view, f6, f7);
    }

    @Deprecated
    public static float s0(View view) {
        return view.getScaleX();
    }

    private static void s1(int i5, View view) {
        List<g0.a> K2 = K(view);
        for (int i6 = 0; i6 < K2.size(); i6++) {
            if (K2.get(i6).b() == i5) {
                K2.remove(i6);
                return;
            }
        }
    }

    public static void s2(@androidx.annotation.o0 View view, @androidx.annotation.q0 CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            p.o(view, charSequence);
        }
    }

    public static boolean t(@androidx.annotation.o0 View view, int i5, int i6, @androidx.annotation.q0 int[] iArr, @androidx.annotation.q0 int[] iArr2) {
        return m.e(view, i5, i6, iArr, iArr2);
    }

    @Deprecated
    public static float t0(View view) {
        return view.getScaleY();
    }

    public static void t1(@androidx.annotation.o0 View view, @androidx.annotation.o0 z zVar) {
        if (Build.VERSION.SDK_INT >= 28) {
            q.e(view, zVar);
            return;
        }
        ArrayList arrayList = (ArrayList) view.getTag(a.e.f23002o0);
        if (arrayList != null) {
            arrayList.remove(zVar);
            if (arrayList.size() == 0) {
                c0.i(view);
            }
        }
    }

    public static void t2(@androidx.annotation.o0 View view, @androidx.annotation.q0 String str) {
        m.v(view, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean u(@androidx.annotation.o0 View view, int i5, int i6, @androidx.annotation.q0 int[] iArr, @androidx.annotation.q0 int[] iArr2, int i7) {
        if (view instanceof g1) {
            return ((g1) view).b(i5, i6, iArr, iArr2, i7);
        }
        if (i7 == 0) {
            return m.e(view, i5, i6, iArr, iArr2);
        }
        return false;
    }

    public static int u0(@androidx.annotation.o0 View view) {
        return n.b(view);
    }

    public static void u1(@androidx.annotation.o0 View view, @androidx.annotation.o0 g0.a aVar, @androidx.annotation.q0 CharSequence charSequence, @androidx.annotation.q0 androidx.core.view.accessibility.m0 m0Var) {
        if (m0Var == null && charSequence == null) {
            r1(view, aVar.b());
        } else {
            d(view, aVar.a(charSequence, m0Var));
        }
    }

    @Deprecated
    public static void u2(View view, float f6) {
        view.setTranslationX(f6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void v(@androidx.annotation.o0 View view, int i5, int i6, int i7, int i8, @androidx.annotation.q0 int[] iArr, int i9, @androidx.annotation.o0 int[] iArr2) {
        if (view instanceof h1) {
            ((h1) view).c(i5, i6, i7, i8, iArr, i9, iArr2);
        } else {
            x(view, i5, i6, i7, i8, iArr, i9);
        }
    }

    @androidx.annotation.q0
    @androidx.annotation.l1
    public static CharSequence v0(@androidx.annotation.o0 View view) {
        return F2().f(view);
    }

    public static void v1(@androidx.annotation.o0 View view) {
        l.c(view);
    }

    @Deprecated
    public static void v2(View view, float f6) {
        view.setTranslationY(f6);
    }

    public static boolean w(@androidx.annotation.o0 View view, int i5, int i6, int i7, int i8, @androidx.annotation.q0 int[] iArr) {
        return m.f(view, i5, i6, i7, i8, iArr);
    }

    @androidx.annotation.o0
    public static List<Rect> w0(@androidx.annotation.o0 View view) {
        return Build.VERSION.SDK_INT >= 29 ? r.b(view) : Collections.emptyList();
    }

    @androidx.annotation.o0
    public static <T extends View> T w1(@androidx.annotation.o0 View view, @androidx.annotation.d0 int i5) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) q.f(view, i5);
        }
        T t5 = (T) view.findViewById(i5);
        if (t5 != null) {
            return t5;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this View");
    }

    public static void w2(@androidx.annotation.o0 View view, float f6) {
        m.w(view, f6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean x(@androidx.annotation.o0 View view, int i5, int i6, int i7, int i8, @androidx.annotation.q0 int[] iArr, int i9) {
        if (view instanceof g1) {
            return ((g1) view).a(i5, i6, i7, i8, iArr, i9);
        }
        if (i9 == 0) {
            return m.f(view, i5, i6, i7, i8, iArr);
        }
        return false;
    }

    @androidx.annotation.q0
    public static String x0(@androidx.annotation.o0 View view) {
        return m.k(view);
    }

    @Deprecated
    public static int x1(int i5, int i6, int i7) {
        return View.resolveSizeAndState(i5, i6, i7);
    }

    private static void x2(View view) {
        if (h.c(view) == 0) {
            h.s(view, 1);
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (h.c((View) parent) == 4) {
                h.s(view, 2);
                return;
            }
        }
    }

    public static void y(@androidx.annotation.o0 View view) {
        o.c(view);
    }

    @Deprecated
    public static float y0(View view) {
        return view.getTranslationX();
    }

    public static boolean y1(@androidx.annotation.o0 View view) {
        return Build.VERSION.SDK_INT >= 26 ? p.i(view) : view.requestFocus();
    }

    public static void y2(@androidx.annotation.o0 View view, @androidx.annotation.q0 y3.b bVar) {
        y3.h(view, bVar);
    }

    @androidx.annotation.l1
    static boolean z(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return c0.a(view).b(view, keyEvent);
    }

    @Deprecated
    public static float z0(View view) {
        return view.getTranslationY();
    }

    public static void z1(@androidx.annotation.o0 View view, @androidx.annotation.o0 @SuppressLint({"ContextFirst"}) Context context, @androidx.annotation.o0 int[] iArr, @androidx.annotation.q0 AttributeSet attributeSet, @androidx.annotation.o0 TypedArray typedArray, int i5, int i6) {
        if (Build.VERSION.SDK_INT >= 29) {
            r.c(view, context, iArr, attributeSet, typedArray, i5, i6);
        }
    }

    @Deprecated
    public static void z2(View view, float f6) {
        view.setX(f6);
    }
}
