package androidx.core.view.accessibility;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.o0;
import androidx.annotation.x0;
import java.util.List;

/* compiled from: AccessibilityManagerCompat.java */
/* loaded from: classes.dex */
public final class c {

    /* compiled from: AccessibilityManagerCompat.java */
    @Deprecated
    public interface a {
        @Deprecated
        void onAccessibilityStateChanged(boolean z5);
    }

    /* compiled from: AccessibilityManagerCompat.java */
    @Deprecated
    /* loaded from: classes3.dex */
    public static abstract class b implements a {
    }

    /* compiled from: AccessibilityManagerCompat.java */
    /* renamed from: androidx.core.view.accessibility.c$c, reason: collision with other inner class name */
    private static class AccessibilityManagerAccessibilityStateChangeListenerC0055c implements AccessibilityManager.AccessibilityStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        a f5336a;

        AccessibilityManagerAccessibilityStateChangeListenerC0055c(@o0 a aVar) {
            this.f5336a = aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof AccessibilityManagerAccessibilityStateChangeListenerC0055c) {
                return this.f5336a.equals(((AccessibilityManagerAccessibilityStateChangeListenerC0055c) obj).f5336a);
            }
            return false;
        }

        public int hashCode() {
            return this.f5336a.hashCode();
        }

        @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
        public void onAccessibilityStateChanged(boolean z5) {
            this.f5336a.onAccessibilityStateChanged(z5);
        }
    }

    /* compiled from: AccessibilityManagerCompat.java */
    @x0(19)
    static class d {
        private d() {
        }

        @androidx.annotation.u
        static boolean a(AccessibilityManager accessibilityManager, e eVar) {
            return accessibilityManager.addTouchExplorationStateChangeListener(new f(eVar));
        }

        @androidx.annotation.u
        static boolean b(AccessibilityManager accessibilityManager, e eVar) {
            return accessibilityManager.removeTouchExplorationStateChangeListener(new f(eVar));
        }
    }

    /* compiled from: AccessibilityManagerCompat.java */
    public interface e {
        void onTouchExplorationStateChanged(boolean z5);
    }

    /* compiled from: AccessibilityManagerCompat.java */
    @x0(19)
    private static final class f implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        final e f5337a;

        f(@o0 e eVar) {
            this.f5337a = eVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof f) {
                return this.f5337a.equals(((f) obj).f5337a);
            }
            return false;
        }

        public int hashCode() {
            return this.f5337a.hashCode();
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z5) {
            this.f5337a.onTouchExplorationStateChanged(z5);
        }
    }

    private c() {
    }

    @Deprecated
    public static boolean a(AccessibilityManager accessibilityManager, a aVar) {
        if (aVar == null) {
            return false;
        }
        return accessibilityManager.addAccessibilityStateChangeListener(new AccessibilityManagerAccessibilityStateChangeListenerC0055c(aVar));
    }

    public static boolean b(@o0 AccessibilityManager accessibilityManager, @o0 e eVar) {
        return d.a(accessibilityManager, eVar);
    }

    @Deprecated
    public static List<AccessibilityServiceInfo> c(AccessibilityManager accessibilityManager, int i5) {
        return accessibilityManager.getEnabledAccessibilityServiceList(i5);
    }

    @Deprecated
    public static List<AccessibilityServiceInfo> d(AccessibilityManager accessibilityManager) {
        return accessibilityManager.getInstalledAccessibilityServiceList();
    }

    @Deprecated
    public static boolean e(AccessibilityManager accessibilityManager) {
        return accessibilityManager.isTouchExplorationEnabled();
    }

    @Deprecated
    public static boolean f(AccessibilityManager accessibilityManager, a aVar) {
        if (aVar == null) {
            return false;
        }
        return accessibilityManager.removeAccessibilityStateChangeListener(new AccessibilityManagerAccessibilityStateChangeListenerC0055c(aVar));
    }

    public static boolean g(@o0 AccessibilityManager accessibilityManager, @o0 e eVar) {
        return d.b(accessibilityManager, eVar);
    }
}
