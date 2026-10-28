package androidx.core.view.accessibility;

import android.graphics.Rect;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityWindowInfo;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;

/* compiled from: AccessibilityWindowInfoCompat.java */
/* loaded from: classes.dex */
public class n0 {

    /* renamed from: b, reason: collision with root package name */
    private static final int f5413b = -1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f5414c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f5415d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f5416e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final int f5417f = 4;

    /* renamed from: g, reason: collision with root package name */
    public static final int f5418g = 5;

    /* renamed from: a, reason: collision with root package name */
    private final Object f5419a;

    /* compiled from: AccessibilityWindowInfoCompat.java */
    @x0(21)
    private static class a {
        private a() {
        }

        @androidx.annotation.u
        static void a(AccessibilityWindowInfo accessibilityWindowInfo, Rect rect) {
            accessibilityWindowInfo.getBoundsInScreen(rect);
        }

        @androidx.annotation.u
        static AccessibilityWindowInfo b(AccessibilityWindowInfo accessibilityWindowInfo, int i5) {
            return accessibilityWindowInfo.getChild(i5);
        }

        @androidx.annotation.u
        static int c(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getChildCount();
        }

        @androidx.annotation.u
        static int d(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getId();
        }

        @androidx.annotation.u
        static int e(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getLayer();
        }

        @androidx.annotation.u
        static AccessibilityWindowInfo f(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getParent();
        }

        @androidx.annotation.u
        static AccessibilityNodeInfo g(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getRoot();
        }

        @androidx.annotation.u
        static int h(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getType();
        }

        @androidx.annotation.u
        static boolean i(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isAccessibilityFocused();
        }

        @androidx.annotation.u
        static boolean j(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isActive();
        }

        @androidx.annotation.u
        static boolean k(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isFocused();
        }

        @androidx.annotation.u
        static AccessibilityWindowInfo l() {
            return AccessibilityWindowInfo.obtain();
        }

        @androidx.annotation.u
        static AccessibilityWindowInfo m(AccessibilityWindowInfo accessibilityWindowInfo) {
            return AccessibilityWindowInfo.obtain(accessibilityWindowInfo);
        }

        @androidx.annotation.u
        static void n(AccessibilityWindowInfo accessibilityWindowInfo) {
            accessibilityWindowInfo.recycle();
        }
    }

    /* compiled from: AccessibilityWindowInfoCompat.java */
    @x0(24)
    private static class b {
        private b() {
        }

        @androidx.annotation.u
        static AccessibilityNodeInfo a(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getAnchor();
        }

        @androidx.annotation.u
        static CharSequence b(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getTitle();
        }
    }

    private n0(Object obj) {
        this.f5419a = obj;
    }

    @q0
    public static n0 n() {
        return r(a.l());
    }

    @q0
    public static n0 o(@q0 n0 n0Var) {
        if (n0Var == null) {
            return null;
        }
        return r(a.m((AccessibilityWindowInfo) n0Var.f5419a));
    }

    private static String q(int i5) {
        return i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? "<UNKNOWN>" : "TYPE_ACCESSIBILITY_OVERLAY" : "TYPE_SYSTEM" : "TYPE_INPUT_METHOD" : "TYPE_APPLICATION";
    }

    static n0 r(Object obj) {
        if (obj != null) {
            return new n0(obj);
        }
        return null;
    }

    @q0
    public g0 a() {
        return g0.Y1(b.a((AccessibilityWindowInfo) this.f5419a));
    }

    public void b(@o0 Rect rect) {
        a.a((AccessibilityWindowInfo) this.f5419a, rect);
    }

    @q0
    public n0 c(int i5) {
        return r(a.b((AccessibilityWindowInfo) this.f5419a, i5));
    }

    public int d() {
        return a.c((AccessibilityWindowInfo) this.f5419a);
    }

    public int e() {
        return a.d((AccessibilityWindowInfo) this.f5419a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        Object obj2 = this.f5419a;
        return obj2 == null ? n0Var.f5419a == null : obj2.equals(n0Var.f5419a);
    }

    public int f() {
        return a.e((AccessibilityWindowInfo) this.f5419a);
    }

    @q0
    public n0 g() {
        return r(a.f((AccessibilityWindowInfo) this.f5419a));
    }

    @q0
    public g0 h() {
        return g0.Y1(a.g((AccessibilityWindowInfo) this.f5419a));
    }

    public int hashCode() {
        Object obj = this.f5419a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @q0
    public CharSequence i() {
        return b.b((AccessibilityWindowInfo) this.f5419a);
    }

    public int j() {
        return a.h((AccessibilityWindowInfo) this.f5419a);
    }

    public boolean k() {
        return a.i((AccessibilityWindowInfo) this.f5419a);
    }

    public boolean l() {
        return a.j((AccessibilityWindowInfo) this.f5419a);
    }

    public boolean m() {
        return a.k((AccessibilityWindowInfo) this.f5419a);
    }

    public void p() {
        a.n((AccessibilityWindowInfo) this.f5419a);
    }

    @o0
    public String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityWindowInfo[id=");
        Rect rect = new Rect();
        b(rect);
        sb.append(e());
        sb.append(", type=");
        sb.append(q(j()));
        sb.append(", layer=");
        sb.append(f());
        sb.append(", bounds=");
        sb.append(rect);
        sb.append(", focused=");
        sb.append(m());
        sb.append(", active=");
        sb.append(l());
        sb.append(", hasParent=");
        sb.append(g() != null);
        sb.append(", hasChildren=");
        sb.append(d() > 0);
        sb.append(']');
        return sb.toString();
    }
}
