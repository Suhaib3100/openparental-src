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
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.annotation.c1;
import androidx.core.view.a;
import androidx.core.view.accessibility.h0;
import androidx.core.view.j3;
import androidx.core.view.o2;
import androidx.core.view.x1;
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
import z0.a;

/* compiled from: ViewCompat.java */
@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes3.dex */
public class x1 {

    @Deprecated
    public static final int A = 16777216;
    public static final int B = 0;
    public static final int C = 1;
    public static final int D = 2;
    public static final int E = 0;
    public static final int F = 1;
    public static final int G = 1;
    public static final int H = 2;
    public static final int I = 4;
    public static final int J = 8;
    public static final int K = 16;
    public static final int L = 32;
    private static Method M = null;
    private static Method N = null;
    private static boolean O = false;
    private static WeakHashMap<View, String> P = null;
    private static WeakHashMap<View, i2> Q = null;
    private static Method R = null;
    private static Field S = null;
    private static boolean T = false;
    private static ThreadLocal<Rect> U = null;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final int f27461b = 0;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final int f27462c = 1;

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final int f27463d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f27464e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final int f27465f = 1;

    /* renamed from: g, reason: collision with root package name */
    public static final int f27466g = 2;

    /* renamed from: h, reason: collision with root package name */
    public static final int f27467h = 4;

    /* renamed from: i, reason: collision with root package name */
    public static final int f27468i = 8;

    /* renamed from: j, reason: collision with root package name */
    @Deprecated
    public static final int f27469j = 0;

    /* renamed from: k, reason: collision with root package name */
    @Deprecated
    public static final int f27470k = 1;

    /* renamed from: l, reason: collision with root package name */
    @Deprecated
    public static final int f27471l = 2;

    /* renamed from: m, reason: collision with root package name */
    @Deprecated
    public static final int f27472m = 4;

    /* renamed from: n, reason: collision with root package name */
    public static final int f27473n = 0;

    /* renamed from: o, reason: collision with root package name */
    public static final int f27474o = 1;

    /* renamed from: p, reason: collision with root package name */
    public static final int f27475p = 2;

    /* renamed from: q, reason: collision with root package name */
    @Deprecated
    public static final int f27476q = 0;

    /* renamed from: r, reason: collision with root package name */
    @Deprecated
    public static final int f27477r = 1;

    /* renamed from: s, reason: collision with root package name */
    @Deprecated
    public static final int f27478s = 2;

    /* renamed from: t, reason: collision with root package name */
    @Deprecated
    public static final int f27479t = 0;

    /* renamed from: u, reason: collision with root package name */
    @Deprecated
    public static final int f27480u = 1;

    /* renamed from: v, reason: collision with root package name */
    @Deprecated
    public static final int f27481v = 2;

    /* renamed from: w, reason: collision with root package name */
    @Deprecated
    public static final int f27482w = 3;

    /* renamed from: x, reason: collision with root package name */
    @Deprecated
    public static final int f27483x = 16777215;

    /* renamed from: y, reason: collision with root package name */
    @Deprecated
    public static final int f27484y = -16777216;

    /* renamed from: z, reason: collision with root package name */
    @Deprecated
    public static final int f27485z = 16;

    /* renamed from: a, reason: collision with root package name */
    private static final String f27460a = "ViewCompat";
    private static final int[] V = {a.e.f93558b, a.e.f93560c, a.e.f93582n, a.e.f93602y, a.e.B, a.e.C, a.e.D, a.e.E, a.e.F, a.e.G, a.e.f93562d, a.e.f93564e, a.e.f93566f, a.e.f93568g, a.e.f93570h, a.e.f93572i, a.e.f93574j, a.e.f93576k, a.e.f93578l, a.e.f93580m, a.e.f93584o, a.e.f93586p, a.e.f93588q, a.e.f93590r, a.e.f93592s, a.e.f93594t, a.e.f93596u, a.e.f93598v, a.e.f93600w, a.e.f93601x, a.e.f93603z, a.e.A};
    private static final f1 W = new w1();
    private static final e X = new e();

    /* compiled from: ViewCompat.java */
    class a extends f<Boolean> {
        a(int i4, Class cls, int i5) {
            super(i4, cls, 0, i5);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.x1.f
        @androidx.annotation.x0(28)
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean c(@androidx.annotation.o0 View view) {
            return Boolean.valueOf(l.d(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.x1.f
        @androidx.annotation.x0(28)
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(@androidx.annotation.o0 View view, Boolean bool) {
            l.j(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.x1.f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* compiled from: ViewCompat.java */
    class b extends f<CharSequence> {
        b(int i4, Class cls, int i5, int i6) {
            super(i4, cls, i5, i6);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.x1.f
        @androidx.annotation.x0(28)
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public CharSequence c(View view) {
            return l.b(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.x1.f
        @androidx.annotation.x0(28)
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, CharSequence charSequence) {
            l.h(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.x1.f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* compiled from: ViewCompat.java */
    class c extends f<CharSequence> {
        c(int i4, Class cls, int i5, int i6) {
            super(i4, cls, i5, i6);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.x1.f
        @androidx.annotation.x0(30)
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public CharSequence c(View view) {
            return n.b(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.x1.f
        @androidx.annotation.x0(30)
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, CharSequence charSequence) {
            n.f(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.x1.f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* compiled from: ViewCompat.java */
    class d extends f<Boolean> {
        d(int i4, Class cls, int i5) {
            super(i4, cls, 0, i5);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.x1.f
        @androidx.annotation.x0(28)
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean c(View view) {
            return Boolean.valueOf(l.c(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.x1.f
        @androidx.annotation.x0(28)
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, Boolean bool) {
            l.g(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.x1.f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* compiled from: ViewCompat.java */
    static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: b, reason: collision with root package name */
        private final WeakHashMap<View, Boolean> f27486b = new WeakHashMap<>();

        e() {
        }

        private void b(Map.Entry<View, Boolean> entry) {
            View key = entry.getKey();
            boolean booleanValue = entry.getValue().booleanValue();
            boolean z4 = key.isShown() && key.getWindowVisibility() == 0;
            if (booleanValue != z4) {
                x1.h1(key, z4 ? 16 : 32);
                entry.setValue(Boolean.valueOf(z4));
            }
        }

        private void c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        private void e(View view) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        void a(View view) {
            this.f27486b.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (view.isAttachedToWindow()) {
                c(view);
            }
        }

        void d(View view) {
            this.f27486b.remove(view);
            view.removeOnAttachStateChangeListener(this);
            e(view);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                Iterator<Map.Entry<View, Boolean>> it = this.f27486b.entrySet().iterator();
                while (it.hasNext()) {
                    b(it.next());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
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
        private final int f27487a;

        /* renamed from: b, reason: collision with root package name */
        private final Class<T> f27488b;

        /* renamed from: c, reason: collision with root package name */
        private final int f27489c;

        /* renamed from: d, reason: collision with root package name */
        private final int f27490d;

        f(int i4, Class<T> cls, int i5) {
            this(i4, cls, 0, i5);
        }

        private boolean b() {
            return Build.VERSION.SDK_INT >= this.f27489c;
        }

        boolean a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        abstract T c(View view);

        abstract void d(View view, T t4);

        T e(View view) {
            if (b()) {
                return c(view);
            }
            T t4 = (T) view.getTag(this.f27487a);
            if (this.f27488b.isInstance(t4)) {
                return t4;
            }
            return null;
        }

        void f(View view, T t4) {
            if (b()) {
                d(view, t4);
            } else if (g(e(view), t4)) {
                x1.C(view);
                view.setTag(this.f27487a, t4);
                x1.h1(view, this.f27490d);
            }
        }

        boolean g(T t4, T t5) {
            return !t5.equals(t4);
        }

        f(int i4, Class<T> cls, int i5, int i6) {
            this.f27487a = i4;
            this.f27488b = cls;
            this.f27490d = i5;
            this.f27489c = i6;
        }
    }

    /* compiled from: ViewCompat.java */
    @androidx.annotation.x0(20)
    static class g {
        private g() {
        }

        static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        static void c(View view) {
            view.requestApplyInsets();
        }
    }

    /* compiled from: ViewCompat.java */
    @androidx.annotation.x0(21)
    private static class h {

        /* compiled from: ViewCompat.java */
        class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a, reason: collision with root package name */
            j3 f27491a = null;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f27492b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ d1 f27493c;

            a(View view, d1 d1Var) {
                this.f27492b = view;
                this.f27493c = d1Var;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                j3 L = j3.L(windowInsets, view);
                int i4 = Build.VERSION.SDK_INT;
                if (i4 < 30) {
                    h.a(windowInsets, this.f27492b);
                    if (L.equals(this.f27491a)) {
                        return this.f27493c.a(view, L).J();
                    }
                }
                this.f27491a = L;
                j3 a5 = this.f27493c.a(view, L);
                if (i4 >= 30) {
                    return a5.J();
                }
                x1.B1(view);
                return a5.J();
            }
        }

        private h() {
        }

        static void a(@androidx.annotation.o0 WindowInsets windowInsets, @androidx.annotation.o0 View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(a.e.f93591r0);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        static j3 b(@androidx.annotation.o0 View view, @androidx.annotation.o0 j3 j3Var, @androidx.annotation.o0 Rect rect) {
            WindowInsets J = j3Var.J();
            if (J != null) {
                return j3.L(view.computeSystemWindowInsets(J, rect), view);
            }
            rect.setEmpty();
            return j3Var;
        }

        static boolean c(@androidx.annotation.o0 View view, float f4, float f5, boolean z4) {
            return view.dispatchNestedFling(f4, f5, z4);
        }

        static boolean d(@androidx.annotation.o0 View view, float f4, float f5) {
            return view.dispatchNestedPreFling(f4, f5);
        }

        static boolean e(View view, int i4, int i5, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i4, i5, iArr, iArr2);
        }

        static boolean f(View view, int i4, int i5, int i6, int i7, int[] iArr) {
            return view.dispatchNestedScroll(i4, i5, i6, i7, iArr);
        }

        static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        static float i(View view) {
            return view.getElevation();
        }

        @androidx.annotation.q0
        public static j3 j(@androidx.annotation.o0 View view) {
            return j3.a.a(view);
        }

        static String k(View view) {
            return view.getTransitionName();
        }

        static float l(View view) {
            return view.getTranslationZ();
        }

        static float m(@androidx.annotation.o0 View view) {
            return view.getZ();
        }

        static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        static void s(View view, float f4) {
            view.setElevation(f4);
        }

        static void t(View view, boolean z4) {
            view.setNestedScrollingEnabled(z4);
        }

        static void u(@androidx.annotation.o0 View view, @androidx.annotation.q0 d1 d1Var) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(a.e.f93575j0, d1Var);
            }
            if (d1Var == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(a.e.f93591r0));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, d1Var));
            }
        }

        static void v(View view, String str) {
            view.setTransitionName(str);
        }

        static void w(View view, float f4) {
            view.setTranslationZ(f4);
        }

        static void x(@androidx.annotation.o0 View view, float f4) {
            view.setZ(f4);
        }

        static boolean y(View view, int i4) {
            return view.startNestedScroll(i4);
        }

        static void z(View view) {
            view.stopNestedScroll();
        }
    }

    /* compiled from: ViewCompat.java */
    @androidx.annotation.x0(23)
    private static class i {
        private i() {
        }

        @androidx.annotation.q0
        public static j3 a(@androidx.annotation.o0 View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            j3 K = j3.K(rootWindowInsets);
            K.H(K);
            K.d(view.getRootView());
            return K;
        }

        static int b(@androidx.annotation.o0 View view) {
            return view.getScrollIndicators();
        }

        static void c(@androidx.annotation.o0 View view, int i4) {
            view.setScrollIndicators(i4);
        }

        static void d(@androidx.annotation.o0 View view, int i4, int i5) {
            view.setScrollIndicators(i4, i5);
        }
    }

    /* compiled from: ViewCompat.java */
    @androidx.annotation.x0(24)
    static class j {
        private j() {
        }

        static void a(@androidx.annotation.o0 View view) {
            view.cancelDragAndDrop();
        }

        static void b(View view) {
            view.dispatchFinishTemporaryDetach();
        }

        static void c(View view) {
            view.dispatchStartTemporaryDetach();
        }

        static void d(@androidx.annotation.o0 View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }

        static boolean e(@androidx.annotation.o0 View view, @androidx.annotation.q0 ClipData clipData, @androidx.annotation.o0 View.DragShadowBuilder dragShadowBuilder, @androidx.annotation.q0 Object obj, int i4) {
            return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i4);
        }

        static void f(@androidx.annotation.o0 View view, @androidx.annotation.o0 View.DragShadowBuilder dragShadowBuilder) {
            view.updateDragShadow(dragShadowBuilder);
        }
    }

    /* compiled from: ViewCompat.java */
    @androidx.annotation.x0(26)
    static class k {
        private k() {
        }

        static void a(@androidx.annotation.o0 View view, Collection<View> collection, int i4) {
            view.addKeyboardNavigationClusters(collection, i4);
        }

        public static AutofillId b(View view) {
            return view.getAutofillId();
        }

        static int c(View view) {
            return view.getImportantForAutofill();
        }

        static int d(@androidx.annotation.o0 View view) {
            return view.getNextClusterForwardId();
        }

        static boolean e(@androidx.annotation.o0 View view) {
            return view.hasExplicitFocusable();
        }

        static boolean f(@androidx.annotation.o0 View view) {
            return view.isFocusedByDefault();
        }

        static boolean g(View view) {
            return view.isImportantForAutofill();
        }

        static boolean h(@androidx.annotation.o0 View view) {
            return view.isKeyboardNavigationCluster();
        }

        static View i(@androidx.annotation.o0 View view, View view2, int i4) {
            return view.keyboardNavigationClusterSearch(view2, i4);
        }

        static boolean j(@androidx.annotation.o0 View view) {
            return view.restoreDefaultFocus();
        }

        static void k(@androidx.annotation.o0 View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        static void l(@androidx.annotation.o0 View view, boolean z4) {
            view.setFocusedByDefault(z4);
        }

        static void m(View view, int i4) {
            view.setImportantForAutofill(i4);
        }

        static void n(@androidx.annotation.o0 View view, boolean z4) {
            view.setKeyboardNavigationCluster(z4);
        }

        static void o(View view, int i4) {
            view.setNextClusterForwardId(i4);
        }

        static void p(@androidx.annotation.o0 View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* compiled from: ViewCompat.java */
    @androidx.annotation.x0(28)
    static class l {
        private l() {
        }

        static void a(@androidx.annotation.o0 View view, @androidx.annotation.o0 final u uVar) {
            int i4 = a.e.f93589q0;
            androidx.collection.a3 a3Var = (androidx.collection.a3) view.getTag(i4);
            if (a3Var == null) {
                a3Var = new androidx.collection.a3();
                view.setTag(i4, a3Var);
            }
            Objects.requireNonNull(uVar);
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener() { // from class: androidx.core.view.y1
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    return x1.u.this.onUnhandledKeyEvent(view2, keyEvent);
                }
            };
            a3Var.put(uVar, onUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        static CharSequence b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        static boolean c(View view) {
            return view.isAccessibilityHeading();
        }

        static boolean d(View view) {
            return view.isScreenReaderFocusable();
        }

        static void e(@androidx.annotation.o0 View view, @androidx.annotation.o0 u uVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            androidx.collection.a3 a3Var = (androidx.collection.a3) view.getTag(a.e.f93589q0);
            if (a3Var == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) a3Var.get(uVar)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        static <T> T f(View view, int i4) {
            return (T) view.requireViewById(i4);
        }

        static void g(View view, boolean z4) {
            view.setAccessibilityHeading(z4);
        }

        static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        public static void i(View view, g1.a aVar) {
            view.setAutofillId(aVar == null ? null : aVar.a());
        }

        static void j(View view, boolean z4) {
            view.setScreenReaderFocusable(z4);
        }
    }

    /* compiled from: ViewCompat.java */
    @androidx.annotation.x0(29)
    private static class m {
        private m() {
        }

        static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        static ContentCaptureSession b(View view) {
            return view.getContentCaptureSession();
        }

        static List<Rect> c(View view) {
            return view.getSystemGestureExclusionRects();
        }

        static void d(@androidx.annotation.o0 View view, @androidx.annotation.o0 Context context, @androidx.annotation.o0 int[] iArr, @androidx.annotation.q0 AttributeSet attributeSet, @androidx.annotation.o0 TypedArray typedArray, int i4, int i5) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i4, i5);
        }

        static void e(View view, androidx.core.view.contentcapture.a aVar) {
            view.setContentCaptureSession(aVar == null ? null : aVar.f());
        }

        static void f(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    /* compiled from: ViewCompat.java */
    @androidx.annotation.x0(30)
    private static class n {
        private n() {
        }

        static int a(View view) {
            return view.getImportantForContentCapture();
        }

        static CharSequence b(View view) {
            return view.getStateDescription();
        }

        @androidx.annotation.q0
        public static n4 c(@androidx.annotation.o0 View view) {
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return n4.l(windowInsetsController);
            }
            return null;
        }

        static boolean d(View view) {
            return view.isImportantForContentCapture();
        }

        static void e(View view, int i4) {
            view.setImportantForContentCapture(i4);
        }

        static void f(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* compiled from: ViewCompat.java */
    @androidx.annotation.x0(31)
    private static final class o {
        private o() {
        }

        @androidx.annotation.q0
        public static String[] a(@androidx.annotation.o0 View view) {
            return view.getReceiveContentMimeTypes();
        }

        @androidx.annotation.q0
        public static androidx.core.view.e b(@androidx.annotation.o0 View view, @androidx.annotation.o0 androidx.core.view.e eVar) {
            ContentInfo l4 = eVar.l();
            ContentInfo performReceiveContent = view.performReceiveContent(l4);
            if (performReceiveContent == null) {
                return null;
            }
            return performReceiveContent == l4 ? eVar : androidx.core.view.e.m(performReceiveContent);
        }

        public static void c(@androidx.annotation.o0 View view, @androidx.annotation.q0 String[] strArr, @androidx.annotation.q0 e1 e1Var) {
            if (e1Var == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new t(e1Var));
            }
        }
    }

    /* compiled from: ViewCompat.java */
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface p {
    }

    /* compiled from: ViewCompat.java */
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface q {
    }

    /* compiled from: ViewCompat.java */
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface r {
    }

    /* compiled from: ViewCompat.java */
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface s {
    }

    /* compiled from: ViewCompat.java */
    @androidx.annotation.x0(31)
    private static final class t implements OnReceiveContentListener {

        /* renamed from: a, reason: collision with root package name */
        @androidx.annotation.o0
        private final e1 f27494a;

        t(@androidx.annotation.o0 e1 e1Var) {
            this.f27494a = e1Var;
        }

        @androidx.annotation.q0
        public ContentInfo onReceiveContent(@androidx.annotation.o0 View view, @androidx.annotation.o0 ContentInfo contentInfo) {
            androidx.core.view.e m4 = androidx.core.view.e.m(contentInfo);
            androidx.core.view.e a5 = this.f27494a.a(view, m4);
            if (a5 == null) {
                return null;
            }
            return a5 == m4 ? contentInfo : a5.l();
        }
    }

    /* compiled from: ViewCompat.java */
    public interface u {
        boolean onUnhandledKeyEvent(@androidx.annotation.o0 View view, @androidx.annotation.o0 KeyEvent keyEvent);
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
    static class x {

        /* renamed from: d, reason: collision with root package name */
        private static final ArrayList<WeakReference<View>> f27495d = new ArrayList<>();

        /* renamed from: a, reason: collision with root package name */
        @androidx.annotation.q0
        private WeakHashMap<View, Boolean> f27496a = null;

        /* renamed from: b, reason: collision with root package name */
        private SparseArray<WeakReference<View>> f27497b = null;

        /* renamed from: c, reason: collision with root package name */
        private WeakReference<KeyEvent> f27498c = null;

        x() {
        }

        static x a(View view) {
            int i4 = a.e.f93587p0;
            x xVar = (x) view.getTag(i4);
            if (xVar != null) {
                return xVar;
            }
            x xVar2 = new x();
            view.setTag(i4, xVar2);
            return xVar2;
        }

        @androidx.annotation.q0
        private View c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f27496a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View c5 = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (c5 != null) {
                            return c5;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        private SparseArray<WeakReference<View>> d() {
            if (this.f27497b == null) {
                this.f27497b = new SparseArray<>();
            }
            return this.f27497b;
        }

        private boolean e(@androidx.annotation.o0 View view, @androidx.annotation.o0 KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(a.e.f93589q0);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((u) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        private void g() {
            WeakHashMap<View, Boolean> weakHashMap = this.f27496a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = f27495d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                try {
                    if (this.f27496a == null) {
                        this.f27496a = new WeakHashMap<>();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList<WeakReference<View>> arrayList2 = f27495d;
                        View view = arrayList2.get(size).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.f27496a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f27496a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        static void h(View view) {
            ArrayList<WeakReference<View>> arrayList = f27495d;
            synchronized (arrayList) {
                try {
                    Iterator<WeakReference<View>> it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (it.next().get() == view) {
                            return;
                        }
                    }
                    f27495d.add(new WeakReference<>(view));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        static void i(View view) {
            synchronized (f27495d) {
                int i4 = 0;
                while (true) {
                    try {
                        ArrayList<WeakReference<View>> arrayList = f27495d;
                        if (i4 >= arrayList.size()) {
                            return;
                        }
                        if (arrayList.get(i4).get() == view) {
                            arrayList.remove(i4);
                            return;
                        }
                        i4++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View c5 = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (c5 != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference<>(c5));
                }
            }
            return c5 != null;
        }

        boolean f(KeyEvent keyEvent) {
            WeakReference<View> weakReference;
            int indexOfKey;
            WeakReference<KeyEvent> weakReference2 = this.f27498c;
            if (weakReference2 != null && weakReference2.get() == keyEvent) {
                return false;
            }
            this.f27498c = new WeakReference<>(keyEvent);
            SparseArray<WeakReference<View>> d5 = d();
            if (keyEvent.getAction() != 1 || (indexOfKey = d5.indexOfKey(keyEvent.getKeyCode())) < 0) {
                weakReference = null;
            } else {
                weakReference = d5.valueAt(indexOfKey);
                d5.removeAt(indexOfKey);
            }
            if (weakReference == null) {
                weakReference = d5.get(keyEvent.getKeyCode());
            }
            if (weakReference == null) {
                return false;
            }
            View view = weakReference.get();
            if (view != null && view.isAttachedToWindow()) {
                e(view, keyEvent);
            }
            return true;
        }
    }

    @Deprecated
    protected x1() {
    }

    @androidx.annotation.l1
    static boolean A(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return x.a(view).f(keyEvent);
    }

    @androidx.annotation.q0
    public static String A0(@androidx.annotation.o0 View view) {
        return h.k(view);
    }

    public static void A1(@androidx.annotation.o0 View view, @androidx.annotation.o0 h0.a aVar, @androidx.annotation.q0 CharSequence charSequence, @androidx.annotation.q0 androidx.core.view.accessibility.o0 o0Var) {
        if (o0Var == null && charSequence == null) {
            x1(view, aVar.b());
        } else {
            d(view, aVar.a(charSequence, o0Var));
        }
    }

    @androidx.annotation.l1
    public static void A2(@androidx.annotation.o0 View view, @androidx.annotation.q0 CharSequence charSequence) {
        O2().f(view, charSequence);
    }

    public static void B(@androidx.annotation.o0 View view) {
        C(view);
    }

    @androidx.annotation.w0(expression = "view.getTranslationX()")
    @Deprecated
    public static float B0(View view) {
        return view.getTranslationX();
    }

    public static void B1(@androidx.annotation.o0 View view) {
        g.c(view);
    }

    public static void B2(@androidx.annotation.o0 View view, @androidx.annotation.o0 List<Rect> list) {
        if (Build.VERSION.SDK_INT >= 29) {
            m.f(view, list);
        }
    }

    static void C(@androidx.annotation.o0 View view) {
        androidx.core.view.a E2 = E(view);
        if (E2 == null) {
            E2 = new androidx.core.view.a();
        }
        H1(view, E2);
    }

    @androidx.annotation.w0(expression = "view.getTranslationY()")
    @Deprecated
    public static float C0(View view) {
        return view.getTranslationY();
    }

    @androidx.annotation.o0
    public static <T extends View> T C1(@androidx.annotation.o0 View view, @androidx.annotation.d0 int i4) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) l.f(view, i4);
        }
        T t4 = (T) view.findViewById(i4);
        if (t4 != null) {
            return t4;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this View");
    }

    public static void C2(@androidx.annotation.o0 View view, @androidx.annotation.q0 CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            k.p(view, charSequence);
        }
    }

    @Deprecated
    public static int D() {
        return View.generateViewId();
    }

    public static float D0(@androidx.annotation.o0 View view) {
        return h.l(view);
    }

    @Deprecated
    public static int D1(int i4, int i5, int i6) {
        return View.resolveSizeAndState(i4, i5, i6);
    }

    public static void D2(@androidx.annotation.o0 View view, @androidx.annotation.q0 String str) {
        h.v(view, str);
    }

    @androidx.annotation.q0
    public static androidx.core.view.a E(@androidx.annotation.o0 View view) {
        View.AccessibilityDelegate F2 = F(view);
        if (F2 == null) {
            return null;
        }
        return F2 instanceof a.C0435a ? ((a.C0435a) F2).f26918a : new androidx.core.view.a(F2);
    }

    @androidx.annotation.q0
    @Deprecated
    public static n4 E0(@androidx.annotation.o0 View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return n.c(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return new n4(window, view);
                }
                return null;
            }
        }
        return null;
    }

    public static boolean E1(@androidx.annotation.o0 View view) {
        return Build.VERSION.SDK_INT >= 26 ? k.j(view) : view.requestFocus();
    }

    @androidx.annotation.w0(expression = "view.setTranslationX(value)")
    @Deprecated
    public static void E2(View view, float f4) {
        view.setTranslationX(f4);
    }

    @androidx.annotation.q0
    private static View.AccessibilityDelegate F(@androidx.annotation.o0 View view) {
        return Build.VERSION.SDK_INT >= 29 ? m.a(view) : G(view);
    }

    @androidx.annotation.w0(expression = "view.getWindowSystemUiVisibility()")
    @Deprecated
    public static int F0(@androidx.annotation.o0 View view) {
        return view.getWindowSystemUiVisibility();
    }

    public static void F1(@androidx.annotation.o0 View view, @androidx.annotation.o0 @SuppressLint({"ContextFirst"}) Context context, @androidx.annotation.o0 int[] iArr, @androidx.annotation.q0 AttributeSet attributeSet, @androidx.annotation.o0 TypedArray typedArray, int i4, int i5) {
        if (Build.VERSION.SDK_INT >= 29) {
            m.d(view, context, iArr, attributeSet, typedArray, i4, i5);
        }
    }

    @androidx.annotation.w0(expression = "view.setTranslationY(value)")
    @Deprecated
    public static void F2(View view, float f4) {
        view.setTranslationY(f4);
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

    @androidx.annotation.w0(expression = "view.getX()")
    @Deprecated
    public static float G0(View view) {
        return view.getX();
    }

    private static f<Boolean> G1() {
        return new a(a.e.f93581m0, Boolean.class, 0, 28);
    }

    public static void G2(@androidx.annotation.o0 View view, float f4) {
        h.w(view, f4);
    }

    @androidx.annotation.w0(expression = "view.getAccessibilityLiveRegion()")
    @Deprecated
    public static int H(@androidx.annotation.o0 View view) {
        return view.getAccessibilityLiveRegion();
    }

    @androidx.annotation.w0(expression = "view.getY()")
    @Deprecated
    public static float H0(View view) {
        return view.getY();
    }

    public static void H1(@androidx.annotation.o0 View view, @androidx.annotation.q0 androidx.core.view.a aVar) {
        if (aVar == null && (F(view) instanceof a.C0435a)) {
            aVar = new androidx.core.view.a();
        }
        a2(view);
        view.setAccessibilityDelegate(aVar == null ? null : aVar.e());
    }

    public static void H2(@androidx.annotation.o0 View view, @androidx.annotation.q0 o2.b bVar) {
        o2.h(view, bVar);
    }

    @androidx.annotation.q0
    public static androidx.core.view.accessibility.m0 I(@androidx.annotation.o0 View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = view.getAccessibilityNodeProvider();
        if (accessibilityNodeProvider != null) {
            return new androidx.core.view.accessibility.m0(accessibilityNodeProvider);
        }
        return null;
    }

    public static float I0(@androidx.annotation.o0 View view) {
        return h.m(view);
    }

    @androidx.annotation.l1
    public static void I1(@androidx.annotation.o0 View view, boolean z4) {
        b().f(view, Boolean.valueOf(z4));
    }

    @androidx.annotation.w0(expression = "view.setX(value)")
    @Deprecated
    public static void I2(View view, float f4) {
        view.setX(f4);
    }

    @androidx.annotation.q0
    @androidx.annotation.l1
    public static CharSequence J(@androidx.annotation.o0 View view) {
        return o1().e(view);
    }

    public static boolean J0(@androidx.annotation.o0 View view) {
        return F(view) != null;
    }

    @androidx.annotation.w0(expression = "view.setAccessibilityLiveRegion(mode)")
    @Deprecated
    public static void J1(@androidx.annotation.o0 View view, int i4) {
        view.setAccessibilityLiveRegion(i4);
    }

    @androidx.annotation.w0(expression = "view.setY(value)")
    @Deprecated
    public static void J2(View view, float f4) {
        view.setY(f4);
    }

    private static List<h0.a> K(View view) {
        int i4 = a.e.f93567f0;
        ArrayList arrayList = (ArrayList) view.getTag(i4);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(i4, arrayList2);
        return arrayList2;
    }

    public static boolean K0(@androidx.annotation.o0 View view) {
        return Build.VERSION.SDK_INT >= 26 ? k.e(view) : view.hasFocusable();
    }

    @androidx.annotation.l1
    public static void K1(@androidx.annotation.o0 View view, @androidx.annotation.q0 CharSequence charSequence) {
        o1().f(view, charSequence);
        if (charSequence != null) {
            X.a(view);
        } else {
            X.d(view);
        }
    }

    public static void K2(@androidx.annotation.o0 View view, float f4) {
        h.x(view, f4);
    }

    @androidx.annotation.w0(expression = "view.getAlpha()")
    @Deprecated
    public static float L(View view) {
        return view.getAlpha();
    }

    public static boolean L0(@androidx.annotation.o0 View view) {
        return h.n(view);
    }

    @androidx.annotation.w0(expression = "view.setActivated(activated)")
    @Deprecated
    public static void L1(View view, boolean z4) {
        view.setActivated(z4);
    }

    public static boolean L2(@androidx.annotation.o0 View view, @androidx.annotation.q0 ClipData clipData, @androidx.annotation.o0 View.DragShadowBuilder dragShadowBuilder, @androidx.annotation.q0 Object obj, int i4) {
        return j.e(view, clipData, dragShadowBuilder, obj, i4);
    }

    @androidx.annotation.q0
    public static g1.a M(@androidx.annotation.o0 View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return g1.a.b(k.b(view));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean M0(@androidx.annotation.o0 View view, int i4) {
        if (view instanceof v0) {
            ((v0) view).hasNestedScrollingParent(i4);
            return false;
        }
        if (i4 == 0) {
            return h.n(view);
        }
        return false;
    }

    @androidx.annotation.w0(expression = "view.setAlpha(value)")
    @Deprecated
    public static void M1(View view, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f4) {
        view.setAlpha(f4);
    }

    public static boolean M2(@androidx.annotation.o0 View view, int i4) {
        return h.y(view, i4);
    }

    private static int N(View view, @androidx.annotation.o0 CharSequence charSequence) {
        List<h0.a> K2 = K(view);
        for (int i4 = 0; i4 < K2.size(); i4++) {
            if (TextUtils.equals(charSequence, K2.get(i4).c())) {
                return K2.get(i4).b();
            }
        }
        int i5 = -1;
        int i6 = 0;
        while (true) {
            int[] iArr = V;
            if (i6 >= iArr.length || i5 != -1) {
                break;
            }
            int i7 = iArr[i6];
            boolean z4 = true;
            for (int i10 = 0; i10 < K2.size(); i10++) {
                z4 &= K2.get(i10).b() != i7;
            }
            if (z4) {
                i5 = i7;
            }
            i6++;
        }
        return i5;
    }

    @androidx.annotation.w0(expression = "view.hasOnClickListeners()")
    @Deprecated
    public static boolean N0(@androidx.annotation.o0 View view) {
        return view.hasOnClickListeners();
    }

    public static void N1(@androidx.annotation.o0 View view, @androidx.annotation.q0 String... strArr) {
        if (Build.VERSION.SDK_INT >= 26) {
            k.k(view, strArr);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean N2(@androidx.annotation.o0 View view, int i4, int i5) {
        if (view instanceof v0) {
            return ((v0) view).startNestedScroll(i4, i5);
        }
        if (i5 == 0) {
            return h.y(view, i4);
        }
        return false;
    }

    @androidx.annotation.q0
    public static ColorStateList O(@androidx.annotation.o0 View view) {
        return h.g(view);
    }

    @androidx.annotation.w0(expression = "view.hasOverlappingRendering()")
    @Deprecated
    public static boolean O0(@androidx.annotation.o0 View view) {
        return view.hasOverlappingRendering();
    }

    public static void O1(@androidx.annotation.o0 View view, @androidx.annotation.q0 g1.a aVar) {
        if (Build.VERSION.SDK_INT >= 28) {
            l.i(view, aVar);
        }
    }

    private static f<CharSequence> O2() {
        return new c(a.e.f93583n0, CharSequence.class, 64, 30);
    }

    @androidx.annotation.q0
    public static PorterDuff.Mode P(@androidx.annotation.o0 View view) {
        return h.h(view);
    }

    @androidx.annotation.w0(expression = "view.hasTransientState()")
    @Deprecated
    public static boolean P0(@androidx.annotation.o0 View view) {
        return view.hasTransientState();
    }

    @androidx.annotation.w0(expression = "view.setBackground(background)")
    @Deprecated
    public static void P1(@androidx.annotation.o0 View view, @androidx.annotation.q0 Drawable drawable) {
        view.setBackground(drawable);
    }

    public static void P2(@androidx.annotation.o0 View view) {
        h.z(view);
    }

    @androidx.annotation.q0
    @androidx.annotation.w0(expression = "view.getClipBounds()")
    @Deprecated
    public static Rect Q(@androidx.annotation.o0 View view) {
        return view.getClipBounds();
    }

    @androidx.annotation.l1
    public static boolean Q0(@androidx.annotation.o0 View view) {
        Boolean e4 = b().e(view);
        return e4 != null && e4.booleanValue();
    }

    public static void Q1(@androidx.annotation.o0 View view, @androidx.annotation.q0 ColorStateList colorStateList) {
        h.q(view, colorStateList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void Q2(@androidx.annotation.o0 View view, int i4) {
        if (view instanceof v0) {
            ((v0) view).stopNestedScroll(i4);
        } else if (i4 == 0) {
            h.z(view);
        }
    }

    @androidx.annotation.q0
    public static androidx.core.view.contentcapture.a R(@androidx.annotation.o0 View view) {
        ContentCaptureSession b5;
        if (Build.VERSION.SDK_INT < 29 || (b5 = m.b(view)) == null) {
            return null;
        }
        return androidx.core.view.contentcapture.a.g(b5, view);
    }

    @androidx.annotation.w0(expression = "view.isAttachedToWindow()")
    @Deprecated
    public static boolean R0(@androidx.annotation.o0 View view) {
        return view.isAttachedToWindow();
    }

    public static void R1(@androidx.annotation.o0 View view, @androidx.annotation.q0 PorterDuff.Mode mode) {
        h.r(view, mode);
    }

    private static void R2(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    @androidx.annotation.q0
    @androidx.annotation.w0(expression = "view.getDisplay()")
    @Deprecated
    public static Display S(@androidx.annotation.o0 View view) {
        return view.getDisplay();
    }

    public static boolean S0(@androidx.annotation.o0 View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return k.f(view);
        }
        return false;
    }

    @SuppressLint({"BanUncheckedReflection"})
    @Deprecated
    public static void S1(ViewGroup viewGroup, boolean z4) {
        if (R == null) {
            try {
                R = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
            }
            R.setAccessible(true);
        }
        try {
            R.invoke(viewGroup, Boolean.valueOf(z4));
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
        }
    }

    public static void S2(@androidx.annotation.o0 View view, @androidx.annotation.o0 View.DragShadowBuilder dragShadowBuilder) {
        j.f(view, dragShadowBuilder);
    }

    public static float T(@androidx.annotation.o0 View view) {
        return h.i(view);
    }

    public static boolean T0(@androidx.annotation.o0 View view) {
        return h.o(view);
    }

    @androidx.annotation.w0(expression = "view.setClipBounds(clipBounds)")
    @Deprecated
    public static void T1(@androidx.annotation.o0 View view, @androidx.annotation.q0 Rect rect) {
        view.setClipBounds(rect);
    }

    private static Rect U() {
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

    public static boolean U0(@androidx.annotation.o0 View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return k.g(view);
        }
        return true;
    }

    public static void U1(@androidx.annotation.o0 View view, @androidx.annotation.q0 androidx.core.view.contentcapture.a aVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            m.e(view, aVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static f1 V(@androidx.annotation.o0 View view) {
        return view instanceof f1 ? (f1) view : W;
    }

    public static boolean V0(@androidx.annotation.o0 View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return n.d(view);
        }
        return false;
    }

    public static void V1(@androidx.annotation.o0 View view, float f4) {
        h.s(view, f4);
    }

    @androidx.annotation.w0(expression = "view.getFitsSystemWindows()")
    @Deprecated
    public static boolean W(@androidx.annotation.o0 View view) {
        return view.getFitsSystemWindows();
    }

    @androidx.annotation.w0(expression = "view.isInLayout()")
    @Deprecated
    public static boolean W0(@androidx.annotation.o0 View view) {
        return view.isInLayout();
    }

    @androidx.annotation.w0(expression = "view.setFitsSystemWindows(fitSystemWindows)")
    @Deprecated
    public static void W1(View view, boolean z4) {
        view.setFitsSystemWindows(z4);
    }

    @androidx.annotation.w0(expression = "view.getImportantForAccessibility()")
    @Deprecated
    public static int X(@androidx.annotation.o0 View view) {
        return view.getImportantForAccessibility();
    }

    public static boolean X0(@androidx.annotation.o0 View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return k.h(view);
        }
        return false;
    }

    public static void X1(@androidx.annotation.o0 View view, boolean z4) {
        if (Build.VERSION.SDK_INT >= 26) {
            k.l(view, z4);
        }
    }

    @SuppressLint({"InlinedApi"})
    public static int Y(@androidx.annotation.o0 View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return k.c(view);
        }
        return 0;
    }

    @androidx.annotation.w0(expression = "view.isLaidOut()")
    @Deprecated
    public static boolean Y0(@androidx.annotation.o0 View view) {
        return view.isLaidOut();
    }

    @androidx.annotation.w0(expression = "view.setHasTransientState(hasTransientState)")
    @Deprecated
    public static void Y1(@androidx.annotation.o0 View view, boolean z4) {
        view.setHasTransientState(z4);
    }

    public static int Z(@androidx.annotation.o0 View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return n.a(view);
        }
        return 0;
    }

    @androidx.annotation.w0(expression = "view.isLayoutDirectionResolved()")
    @Deprecated
    public static boolean Z0(@androidx.annotation.o0 View view) {
        return view.isLayoutDirectionResolved();
    }

    @androidx.annotation.l1
    @androidx.annotation.w0(expression = "view.setImportantForAccessibility(mode)")
    @Deprecated
    public static void Z1(@androidx.annotation.o0 View view, int i4) {
        view.setImportantForAccessibility(i4);
    }

    public static /* synthetic */ androidx.core.view.e a(androidx.core.view.e eVar) {
        return eVar;
    }

    @androidx.annotation.w0(expression = "view.getLabelFor()")
    @Deprecated
    public static int a0(@androidx.annotation.o0 View view) {
        return view.getLabelFor();
    }

    public static boolean a1(@androidx.annotation.o0 View view) {
        return h.p(view);
    }

    private static void a2(View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    private static f<Boolean> b() {
        return new d(a.e.f93571h0, Boolean.class, 0, 28);
    }

    @androidx.annotation.w0(expression = "view.getLayerType()")
    @Deprecated
    public static int b0(View view) {
        return view.getLayerType();
    }

    @androidx.annotation.w0(expression = "view.isOpaque()")
    @Deprecated
    public static boolean b1(View view) {
        return view.isOpaque();
    }

    public static void b2(@androidx.annotation.o0 View view, int i4) {
        if (Build.VERSION.SDK_INT >= 26) {
            k.m(view, i4);
        }
    }

    public static int c(@androidx.annotation.o0 View view, @androidx.annotation.o0 CharSequence charSequence, @androidx.annotation.o0 androidx.core.view.accessibility.o0 o0Var) {
        int N2 = N(view, charSequence);
        if (N2 != -1) {
            d(view, new h0.a(N2, charSequence, o0Var));
        }
        return N2;
    }

    @androidx.annotation.w0(expression = "view.getLayoutDirection()")
    @Deprecated
    public static int c0(@androidx.annotation.o0 View view) {
        return view.getLayoutDirection();
    }

    @androidx.annotation.w0(expression = "view.isPaddingRelative()")
    @Deprecated
    public static boolean c1(@androidx.annotation.o0 View view) {
        return view.isPaddingRelative();
    }

    public static void c2(@androidx.annotation.o0 View view, int i4) {
        if (Build.VERSION.SDK_INT >= 30) {
            n.e(view, i4);
        }
    }

    private static void d(@androidx.annotation.o0 View view, @androidx.annotation.o0 h0.a aVar) {
        C(view);
        y1(aVar.b(), view);
        K(view).add(aVar);
        h1(view, 0);
    }

    @androidx.annotation.q0
    @androidx.annotation.w0(expression = "view.getMatrix()")
    @Deprecated
    public static Matrix d0(View view) {
        return view.getMatrix();
    }

    @androidx.annotation.l1
    public static boolean d1(@androidx.annotation.o0 View view) {
        Boolean e4 = G1().e(view);
        return e4 != null && e4.booleanValue();
    }

    public static void d2(@androidx.annotation.o0 View view, boolean z4) {
        if (Build.VERSION.SDK_INT >= 26) {
            k.n(view, z4);
        }
    }

    public static void e(@androidx.annotation.o0 View view, @androidx.annotation.o0 Collection<View> collection, int i4) {
        if (Build.VERSION.SDK_INT >= 26) {
            k.a(view, collection, i4);
        }
    }

    @androidx.annotation.w0(expression = "view.getMeasuredHeightAndState()")
    @Deprecated
    public static int e0(View view) {
        return view.getMeasuredHeightAndState();
    }

    @androidx.annotation.w0(expression = "view.jumpDrawablesToCurrentState()")
    @Deprecated
    public static void e1(View view) {
        view.jumpDrawablesToCurrentState();
    }

    @androidx.annotation.w0(expression = "view.setLabelFor(labeledId)")
    @Deprecated
    public static void e2(@androidx.annotation.o0 View view, @androidx.annotation.d0 int i4) {
        view.setLabelFor(i4);
    }

    public static void f(@androidx.annotation.o0 View view, @androidx.annotation.o0 u uVar) {
        if (Build.VERSION.SDK_INT >= 28) {
            l.a(view, uVar);
            return;
        }
        int i4 = a.e.f93589q0;
        ArrayList arrayList = (ArrayList) view.getTag(i4);
        if (arrayList == null) {
            arrayList = new ArrayList();
            view.setTag(i4, arrayList);
        }
        arrayList.add(uVar);
        if (arrayList.size() == 1) {
            x.h(view);
        }
    }

    @androidx.annotation.w0(expression = "view.getMeasuredState()")
    @Deprecated
    public static int f0(View view) {
        return view.getMeasuredState();
    }

    @androidx.annotation.q0
    public static View f1(@androidx.annotation.o0 View view, @androidx.annotation.q0 View view2, int i4) {
        if (Build.VERSION.SDK_INT >= 26) {
            return k.i(view, view2, i4);
        }
        return null;
    }

    @androidx.annotation.w0(expression = "view.setLayerPaint(paint)")
    @Deprecated
    public static void f2(@androidx.annotation.o0 View view, @androidx.annotation.q0 Paint paint) {
        view.setLayerPaint(paint);
    }

    @androidx.annotation.o0
    @Deprecated
    public static i2 g(@androidx.annotation.o0 View view) {
        if (Q == null) {
            Q = new WeakHashMap<>();
        }
        i2 i2Var = Q.get(view);
        if (i2Var != null) {
            return i2Var;
        }
        i2 i2Var2 = new i2(view);
        Q.put(view, i2Var2);
        return i2Var2;
    }

    @androidx.annotation.w0(expression = "view.getMeasuredWidthAndState()")
    @Deprecated
    public static int g0(View view) {
        return view.getMeasuredWidthAndState();
    }

    private static /* synthetic */ androidx.core.view.e g1(androidx.core.view.e eVar) {
        return eVar;
    }

    @androidx.annotation.w0(expression = "view.setLayerType(layerType, paint)")
    @Deprecated
    public static void g2(View view, int i4, Paint paint) {
        view.setLayerType(i4, paint);
    }

    private static void h() {
        try {
            M = View.class.getDeclaredMethod("dispatchStartTemporaryDetach", null);
            N = View.class.getDeclaredMethod("dispatchFinishTemporaryDetach", null);
        } catch (NoSuchMethodException unused) {
        }
        O = true;
    }

    @androidx.annotation.w0(expression = "view.getMinimumHeight()")
    @Deprecated
    public static int h0(@androidx.annotation.o0 View view) {
        return view.getMinimumHeight();
    }

    static void h1(View view, int i4) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z4 = J(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z4) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z4 ? 32 : 2048);
                obtain.setContentChangeTypes(i4);
                if (z4) {
                    obtain.getText().add(J(view));
                    a2(view);
                }
                view.sendAccessibilityEventUnchecked(obtain);
                return;
            }
            if (i4 != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i4);
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
            obtain2.setContentChangeTypes(i4);
            obtain2.setSource(view);
            view.onPopulateAccessibilityEvent(obtain2);
            obtain2.getText().add(J(view));
            accessibilityManager.sendAccessibilityEvent(obtain2);
        }
    }

    @androidx.annotation.w0(expression = "view.setLayoutDirection(layoutDirection)")
    @Deprecated
    public static void h2(@androidx.annotation.o0 View view, int i4) {
        view.setLayoutDirection(i4);
    }

    @androidx.annotation.w0(expression = "view.canScrollHorizontally(direction)")
    @Deprecated
    public static boolean i(View view, int i4) {
        return view.canScrollHorizontally(i4);
    }

    @androidx.annotation.w0(expression = "view.getMinimumWidth()")
    @Deprecated
    public static int i0(@androidx.annotation.o0 View view) {
        return view.getMinimumWidth();
    }

    public static void i1(@androidx.annotation.o0 View view, int i4) {
        view.offsetLeftAndRight(i4);
    }

    public static void i2(@androidx.annotation.o0 View view, boolean z4) {
        h.t(view, z4);
    }

    @androidx.annotation.w0(expression = "view.canScrollVertically(direction)")
    @Deprecated
    public static boolean j(View view, int i4) {
        return view.canScrollVertically(i4);
    }

    public static int j0(@androidx.annotation.o0 View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return k.d(view);
        }
        return -1;
    }

    public static void j1(@androidx.annotation.o0 View view, int i4) {
        view.offsetTopAndBottom(i4);
    }

    public static void j2(@androidx.annotation.o0 View view, int i4) {
        if (Build.VERSION.SDK_INT >= 26) {
            k.o(view, i4);
        }
    }

    public static void k(@androidx.annotation.o0 View view) {
        j.a(view);
    }

    @androidx.annotation.q0
    public static String[] k0(@androidx.annotation.o0 View view) {
        return Build.VERSION.SDK_INT >= 31 ? o.a(view) : (String[]) view.getTag(a.e.f93579l0);
    }

    @androidx.annotation.o0
    public static j3 k1(@androidx.annotation.o0 View view, @androidx.annotation.o0 j3 j3Var) {
        WindowInsets J2 = j3Var.J();
        if (J2 != null) {
            WindowInsets b5 = g.b(view, J2);
            if (!b5.equals(J2)) {
                return j3.L(b5, view);
            }
        }
        return j3Var;
    }

    public static void k2(@androidx.annotation.o0 View view, @androidx.annotation.q0 d1 d1Var) {
        h.u(view, d1Var);
    }

    @Deprecated
    public static int l(int i4, int i5) {
        return View.combineMeasuredStates(i4, i5);
    }

    @androidx.annotation.w0(expression = "view.getOverScrollMode()")
    @Deprecated
    public static int l0(View view) {
        return view.getOverScrollMode();
    }

    @androidx.annotation.w0(expression = "v.onInitializeAccessibilityEvent(event)")
    @Deprecated
    public static void l1(View view, AccessibilityEvent accessibilityEvent) {
        view.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    public static void l2(@androidx.annotation.o0 View view, @androidx.annotation.q0 String[] strArr, @androidx.annotation.q0 e1 e1Var) {
        if (Build.VERSION.SDK_INT >= 31) {
            o.c(view, strArr, e1Var);
            return;
        }
        if (strArr == null || strArr.length == 0) {
            strArr = null;
        }
        boolean z4 = false;
        if (e1Var != null) {
            androidx.core.util.w.b(strArr != null, "When the listener is set, MIME types must also be set");
        }
        if (strArr != null) {
            int length = strArr.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    break;
                }
                if (strArr[i4].startsWith("*")) {
                    z4 = true;
                    break;
                }
                i4++;
            }
            androidx.core.util.w.b(!z4, "A MIME type set here must not start with *: " + Arrays.toString(strArr));
        }
        view.setTag(a.e.f93579l0, strArr);
        view.setTag(a.e.f93577k0, e1Var);
    }

    private static void m(View view, int i4) {
        view.offsetLeftAndRight(i4);
        if (view.getVisibility() == 0) {
            R2(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                R2((View) parent);
            }
        }
    }

    @androidx.annotation.u0
    @androidx.annotation.w0(expression = "view.getPaddingEnd()")
    @Deprecated
    public static int m0(@androidx.annotation.o0 View view) {
        return view.getPaddingEnd();
    }

    @androidx.annotation.w0(expression = "v.onInitializeAccessibilityNodeInfo(info.unwrap())")
    @Deprecated
    public static void m1(@androidx.annotation.o0 View view, @androidx.annotation.o0 androidx.core.view.accessibility.h0 h0Var) {
        view.onInitializeAccessibilityNodeInfo(h0Var.q2());
    }

    @androidx.annotation.w0(expression = "view.setOverScrollMode(overScrollMode)")
    @Deprecated
    public static void m2(View view, int i4) {
        view.setOverScrollMode(i4);
    }

    private static void n(View view, int i4) {
        view.offsetTopAndBottom(i4);
        if (view.getVisibility() == 0) {
            R2(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                R2((View) parent);
            }
        }
    }

    @androidx.annotation.u0
    @androidx.annotation.w0(expression = "view.getPaddingStart()")
    @Deprecated
    public static int n0(@androidx.annotation.o0 View view) {
        return view.getPaddingStart();
    }

    @androidx.annotation.w0(expression = "v.onPopulateAccessibilityEvent(event)")
    @Deprecated
    public static void n1(View view, AccessibilityEvent accessibilityEvent) {
        view.onPopulateAccessibilityEvent(accessibilityEvent);
    }

    @androidx.annotation.w0(expression = "view.setPaddingRelative(start, top, end, bottom)")
    @Deprecated
    public static void n2(@androidx.annotation.o0 View view, @androidx.annotation.u0 int i4, @androidx.annotation.u0 int i5, @androidx.annotation.u0 int i6, @androidx.annotation.u0 int i7) {
        view.setPaddingRelative(i4, i5, i6, i7);
    }

    @androidx.annotation.o0
    public static j3 o(@androidx.annotation.o0 View view, @androidx.annotation.o0 j3 j3Var, @androidx.annotation.o0 Rect rect) {
        return h.b(view, j3Var, rect);
    }

    @androidx.annotation.q0
    @androidx.annotation.w0(expression = "view.getParentForAccessibility()")
    @Deprecated
    public static ViewParent o0(@androidx.annotation.o0 View view) {
        return view.getParentForAccessibility();
    }

    private static f<CharSequence> o1() {
        return new b(a.e.f93573i0, CharSequence.class, 8, 28);
    }

    @androidx.annotation.w0(expression = "view.setPivotX(value)")
    @Deprecated
    public static void o2(View view, float f4) {
        view.setPivotX(f4);
    }

    @androidx.annotation.o0
    public static j3 p(@androidx.annotation.o0 View view, @androidx.annotation.o0 j3 j3Var) {
        WindowInsets J2 = j3Var.J();
        if (J2 != null) {
            WindowInsets a5 = g.a(view, J2);
            if (!a5.equals(J2)) {
                return j3.L(a5, view);
            }
        }
        return j3Var;
    }

    @androidx.annotation.w0(expression = "view.getPivotX()")
    @Deprecated
    public static float p0(View view) {
        return view.getPivotX();
    }

    @androidx.annotation.w0(expression = "view.performAccessibilityAction(action, arguments)")
    @Deprecated
    public static boolean p1(@androidx.annotation.o0 View view, int i4, @androidx.annotation.q0 Bundle bundle) {
        return view.performAccessibilityAction(i4, bundle);
    }

    @androidx.annotation.w0(expression = "view.setPivotY(value)")
    @Deprecated
    public static void p2(View view, float f4) {
        view.setPivotY(f4);
    }

    public static void q(@androidx.annotation.o0 View view) {
        j.b(view);
    }

    @androidx.annotation.w0(expression = "view.getPivotY()")
    @Deprecated
    public static float q0(View view) {
        return view.getPivotY();
    }

    public static boolean q1(@androidx.annotation.o0 View view, int i4) {
        int a5 = g0.a(i4);
        if (a5 == -1) {
            return false;
        }
        return view.performHapticFeedback(a5);
    }

    public static void q2(@androidx.annotation.o0 View view, @androidx.annotation.q0 h1 h1Var) {
        j.d(view, (PointerIcon) (h1Var != null ? h1Var.b() : null));
    }

    public static boolean r(@androidx.annotation.o0 View view, float f4, float f5, boolean z4) {
        return h.c(view, f4, f5, z4);
    }

    @androidx.annotation.q0
    public static j3 r0(@androidx.annotation.o0 View view) {
        return i.a(view);
    }

    public static boolean r1(@androidx.annotation.o0 View view, int i4, int i5) {
        int a5 = g0.a(i4);
        if (a5 == -1) {
            return false;
        }
        return view.performHapticFeedback(a5, i5);
    }

    @androidx.annotation.w0(expression = "view.setRotation(value)")
    @Deprecated
    public static void r2(View view, float f4) {
        view.setRotation(f4);
    }

    public static boolean s(@androidx.annotation.o0 View view, float f4, float f5) {
        return h.d(view, f4, f5);
    }

    @androidx.annotation.w0(expression = "view.getRotation()")
    @Deprecated
    public static float s0(View view) {
        return view.getRotation();
    }

    @androidx.annotation.q0
    public static androidx.core.view.e s1(@androidx.annotation.o0 View view, @androidx.annotation.o0 androidx.core.view.e eVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Objects.toString(eVar);
            view.getClass();
            view.getId();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return o.b(view, eVar);
        }
        e1 e1Var = (e1) view.getTag(a.e.f93577k0);
        if (e1Var == null) {
            return V(view).a(eVar);
        }
        androidx.core.view.e a5 = e1Var.a(view, eVar);
        if (a5 == null) {
            return null;
        }
        return V(view).a(a5);
    }

    @androidx.annotation.w0(expression = "view.setRotationX(value)")
    @Deprecated
    public static void s2(View view, float f4) {
        view.setRotationX(f4);
    }

    public static boolean t(@androidx.annotation.o0 View view, int i4, int i5, @androidx.annotation.q0 int[] iArr, @androidx.annotation.q0 int[] iArr2) {
        return h.e(view, i4, i5, iArr, iArr2);
    }

    @androidx.annotation.w0(expression = "view.getRotationX()")
    @Deprecated
    public static float t0(View view) {
        return view.getRotationX();
    }

    @androidx.annotation.w0(expression = "view.postInvalidateOnAnimation()")
    @Deprecated
    public static void t1(@androidx.annotation.o0 View view) {
        view.postInvalidateOnAnimation();
    }

    @androidx.annotation.w0(expression = "view.setRotationY(value)")
    @Deprecated
    public static void t2(View view, float f4) {
        view.setRotationY(f4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean u(@androidx.annotation.o0 View view, int i4, int i5, @androidx.annotation.q0 int[] iArr, @androidx.annotation.q0 int[] iArr2, int i6) {
        if (view instanceof v0) {
            return ((v0) view).dispatchNestedPreScroll(i4, i5, iArr, iArr2, i6);
        }
        if (i6 == 0) {
            return h.e(view, i4, i5, iArr, iArr2);
        }
        return false;
    }

    @androidx.annotation.w0(expression = "view.getRotationY()")
    @Deprecated
    public static float u0(View view) {
        return view.getRotationY();
    }

    @androidx.annotation.w0(expression = "view.postInvalidateOnAnimation(left, top, right, bottom)")
    @Deprecated
    public static void u1(@androidx.annotation.o0 View view, int i4, int i5, int i6, int i7) {
        view.postInvalidateOnAnimation(i4, i5, i6, i7);
    }

    @androidx.annotation.w0(expression = "view.setSaveFromParentEnabled(enabled)")
    @Deprecated
    public static void u2(View view, boolean z4) {
        view.setSaveFromParentEnabled(z4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void v(@androidx.annotation.o0 View view, int i4, int i5, int i6, int i7, @androidx.annotation.q0 int[] iArr, int i10, @androidx.annotation.o0 int[] iArr2) {
        if (view instanceof w0) {
            ((w0) view).dispatchNestedScroll(i4, i5, i6, i7, iArr, i10, iArr2);
        } else {
            x(view, i4, i5, i6, i7, iArr, i10);
        }
    }

    @androidx.annotation.w0(expression = "view.getScaleX()")
    @Deprecated
    public static float v0(View view) {
        return view.getScaleX();
    }

    @androidx.annotation.w0(expression = "view.postOnAnimation(action)")
    @Deprecated
    public static void v1(@androidx.annotation.o0 View view, @androidx.annotation.o0 Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    @androidx.annotation.w0(expression = "view.setScaleX(value)")
    @Deprecated
    public static void v2(View view, float f4) {
        view.setScaleX(f4);
    }

    public static boolean w(@androidx.annotation.o0 View view, int i4, int i5, int i6, int i7, @androidx.annotation.q0 int[] iArr) {
        return h.f(view, i4, i5, i6, i7, iArr);
    }

    @androidx.annotation.w0(expression = "view.getScaleY()")
    @Deprecated
    public static float w0(View view) {
        return view.getScaleY();
    }

    @androidx.annotation.w0(expression = "view.postOnAnimationDelayed(action, delayMillis)")
    @SuppressLint({"LambdaLast"})
    @Deprecated
    public static void w1(@androidx.annotation.o0 View view, @androidx.annotation.o0 Runnable runnable, long j4) {
        view.postOnAnimationDelayed(runnable, j4);
    }

    @androidx.annotation.w0(expression = "view.setScaleY(value)")
    @Deprecated
    public static void w2(View view, float f4) {
        view.setScaleY(f4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean x(@androidx.annotation.o0 View view, int i4, int i5, int i6, int i7, @androidx.annotation.q0 int[] iArr, int i10) {
        if (view instanceof v0) {
            return ((v0) view).dispatchNestedScroll(i4, i5, i6, i7, iArr, i10);
        }
        if (i10 == 0) {
            return h.f(view, i4, i5, i6, i7, iArr);
        }
        return false;
    }

    public static int x0(@androidx.annotation.o0 View view) {
        return i.b(view);
    }

    public static void x1(@androidx.annotation.o0 View view, int i4) {
        y1(i4, view);
        h1(view, 0);
    }

    @androidx.annotation.l1
    public static void x2(@androidx.annotation.o0 View view, boolean z4) {
        G1().f(view, Boolean.valueOf(z4));
    }

    public static void y(@androidx.annotation.o0 View view) {
        j.c(view);
    }

    @androidx.annotation.q0
    @androidx.annotation.l1
    public static CharSequence y0(@androidx.annotation.o0 View view) {
        return O2().e(view);
    }

    private static void y1(int i4, View view) {
        List<h0.a> K2 = K(view);
        for (int i5 = 0; i5 < K2.size(); i5++) {
            if (K2.get(i5).b() == i4) {
                K2.remove(i5);
                return;
            }
        }
    }

    public static void y2(@androidx.annotation.o0 View view, int i4) {
        i.c(view, i4);
    }

    @androidx.annotation.l1
    static boolean z(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return x.a(view).b(view, keyEvent);
    }

    @androidx.annotation.o0
    public static List<Rect> z0(@androidx.annotation.o0 View view) {
        return Build.VERSION.SDK_INT >= 29 ? m.c(view) : Collections.emptyList();
    }

    public static void z1(@androidx.annotation.o0 View view, @androidx.annotation.o0 u uVar) {
        if (Build.VERSION.SDK_INT >= 28) {
            l.e(view, uVar);
            return;
        }
        ArrayList arrayList = (ArrayList) view.getTag(a.e.f93589q0);
        if (arrayList != null) {
            arrayList.remove(uVar);
            if (arrayList.size() == 0) {
                x.i(view);
            }
        }
    }

    public static void z2(@androidx.annotation.o0 View view, int i4, int i5) {
        i.d(view, i4, i5);
    }
}
