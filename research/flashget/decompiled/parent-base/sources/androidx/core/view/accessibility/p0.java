package androidx.core.view.accessibility;

import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.os.LocaleList;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityWindowInfo;
import androidx.annotation.q0;
import androidx.annotation.x0;

/* compiled from: AccessibilityWindowInfoCompat.java */
/* loaded from: classes3.dex */
public class p0 {

    /* renamed from: b, reason: collision with root package name */
    private static final int f27061b = -1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f27062c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f27063d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f27064e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final int f27065f = 4;

    /* renamed from: g, reason: collision with root package name */
    public static final int f27066g = 5;

    /* renamed from: h, reason: collision with root package name */
    public static final int f27067h = 6;

    /* renamed from: a, reason: collision with root package name */
    private final Object f27068a;

    /* compiled from: AccessibilityWindowInfoCompat.java */
    @x0(21)
    private static class a {
        private a() {
        }

        static void a(AccessibilityWindowInfo accessibilityWindowInfo, Rect rect) {
            accessibilityWindowInfo.getBoundsInScreen(rect);
        }

        static AccessibilityWindowInfo b(AccessibilityWindowInfo accessibilityWindowInfo, int i4) {
            return accessibilityWindowInfo.getChild(i4);
        }

        static int c(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getChildCount();
        }

        static int d(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getId();
        }

        static int e(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getLayer();
        }

        static AccessibilityWindowInfo f(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getParent();
        }

        static AccessibilityNodeInfo g(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getRoot();
        }

        static int h(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getType();
        }

        static boolean i(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isAccessibilityFocused();
        }

        static boolean j(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isActive();
        }

        static boolean k(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isFocused();
        }

        static AccessibilityWindowInfo l() {
            return AccessibilityWindowInfo.obtain();
        }

        static AccessibilityWindowInfo m(AccessibilityWindowInfo accessibilityWindowInfo) {
            return AccessibilityWindowInfo.obtain(accessibilityWindowInfo);
        }
    }

    /* compiled from: AccessibilityWindowInfoCompat.java */
    @x0(24)
    private static class b {
        private b() {
        }

        static AccessibilityNodeInfo a(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getAnchor();
        }

        static CharSequence b(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getTitle();
        }
    }

    /* compiled from: AccessibilityWindowInfoCompat.java */
    @x0(26)
    private static class c {
        private c() {
        }

        static boolean a(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isInPictureInPictureMode();
        }
    }

    /* compiled from: AccessibilityWindowInfoCompat.java */
    @x0(30)
    private static class d {
        private d() {
        }

        static AccessibilityWindowInfo a() {
            return new AccessibilityWindowInfo();
        }
    }

    /* compiled from: AccessibilityWindowInfoCompat.java */
    @x0(33)
    private static class e {
        private e() {
        }

        static int a(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getDisplayId();
        }

        static void b(AccessibilityWindowInfo accessibilityWindowInfo, Region region) {
            accessibilityWindowInfo.getRegionInScreen(region);
        }

        public static h0 c(Object obj, int i4) {
            return h0.s2(((AccessibilityWindowInfo) obj).getRoot(i4));
        }
    }

    /* compiled from: AccessibilityWindowInfoCompat.java */
    @x0(34)
    private static class f {
        private f() {
        }

        static LocaleList a(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getLocales();
        }

        public static long b(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getTransitionTimeMillis();
        }
    }

    public p0() {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f27068a = d.a();
        } else {
            this.f27068a = null;
        }
    }

    @q0
    public static p0 t() {
        return y(AccessibilityWindowInfo.obtain());
    }

    @q0
    public static p0 u(@q0 p0 p0Var) {
        if (p0Var == null) {
            return null;
        }
        return y(AccessibilityWindowInfo.obtain((AccessibilityWindowInfo) p0Var.f27068a));
    }

    private static String w(int i4) {
        return i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? "<UNKNOWN>" : "TYPE_ACCESSIBILITY_OVERLAY" : "TYPE_SYSTEM" : "TYPE_INPUT_METHOD" : "TYPE_APPLICATION";
    }

    static p0 y(Object obj) {
        if (obj != null) {
            return new p0(obj);
        }
        return null;
    }

    @q0
    public h0 a() {
        return h0.s2(((AccessibilityWindowInfo) this.f27068a).getAnchor());
    }

    public void b(@androidx.annotation.o0 Rect rect) {
        ((AccessibilityWindowInfo) this.f27068a).getBoundsInScreen(rect);
    }

    @q0
    public p0 c(int i4) {
        return y(((AccessibilityWindowInfo) this.f27068a).getChild(i4));
    }

    public int d() {
        return ((AccessibilityWindowInfo) this.f27068a).getChildCount();
    }

    public int e() {
        if (Build.VERSION.SDK_INT >= 33) {
            return e.a((AccessibilityWindowInfo) this.f27068a);
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        Object obj2 = this.f27068a;
        return obj2 == null ? p0Var.f27068a == null : obj2.equals(p0Var.f27068a);
    }

    public int f() {
        return ((AccessibilityWindowInfo) this.f27068a).getId();
    }

    public int g() {
        return ((AccessibilityWindowInfo) this.f27068a).getLayer();
    }

    @androidx.annotation.o0
    public androidx.core.os.p h() {
        return Build.VERSION.SDK_INT >= 34 ? androidx.core.os.p.o(f.a((AccessibilityWindowInfo) this.f27068a)) : androidx.core.os.p.g();
    }

    public int hashCode() {
        Object obj = this.f27068a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @q0
    public p0 i() {
        return y(((AccessibilityWindowInfo) this.f27068a).getParent());
    }

    public void j(@androidx.annotation.o0 Region region) {
        if (Build.VERSION.SDK_INT >= 33) {
            e.b((AccessibilityWindowInfo) this.f27068a, region);
            return;
        }
        Rect rect = new Rect();
        ((AccessibilityWindowInfo) this.f27068a).getBoundsInScreen(rect);
        region.set(rect);
    }

    @q0
    public h0 k() {
        return h0.s2(((AccessibilityWindowInfo) this.f27068a).getRoot());
    }

    @q0
    public h0 l(int i4) {
        return Build.VERSION.SDK_INT >= 33 ? e.c(this.f27068a, i4) : k();
    }

    @q0
    public CharSequence m() {
        return ((AccessibilityWindowInfo) this.f27068a).getTitle();
    }

    public long n() {
        if (Build.VERSION.SDK_INT >= 34) {
            return f.b((AccessibilityWindowInfo) this.f27068a);
        }
        return 0L;
    }

    public int o() {
        return ((AccessibilityWindowInfo) this.f27068a).getType();
    }

    public boolean p() {
        return ((AccessibilityWindowInfo) this.f27068a).isAccessibilityFocused();
    }

    public boolean q() {
        return ((AccessibilityWindowInfo) this.f27068a).isActive();
    }

    public boolean r() {
        return ((AccessibilityWindowInfo) this.f27068a).isFocused();
    }

    public boolean s() {
        if (Build.VERSION.SDK_INT >= 26) {
            return c.a((AccessibilityWindowInfo) this.f27068a);
        }
        return false;
    }

    @androidx.annotation.o0
    public String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityWindowInfo[id=");
        Rect rect = new Rect();
        b(rect);
        sb.append(f());
        sb.append(", type=");
        sb.append(w(o()));
        sb.append(", layer=");
        sb.append(g());
        sb.append(", bounds=");
        sb.append(rect);
        sb.append(", focused=");
        sb.append(r());
        sb.append(", active=");
        sb.append(q());
        sb.append(", hasParent=");
        sb.append(i() != null);
        sb.append(", hasChildren=");
        sb.append(d() > 0);
        sb.append(", transitionTime=");
        sb.append(n());
        sb.append(", locales=");
        sb.append(h());
        sb.append(']');
        return sb.toString();
    }

    @Deprecated
    public void v() {
    }

    @q0
    public AccessibilityWindowInfo x() {
        return (AccessibilityWindowInfo) this.f27068a;
    }

    private p0(Object obj) {
        this.f27068a = obj;
    }
}
