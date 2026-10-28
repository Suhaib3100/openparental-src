package androidx.core.view.accessibility;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.w0;
import androidx.annotation.x0;
import java.util.List;

/* compiled from: AccessibilityManagerCompat.java */
/* loaded from: classes3.dex */
public final class c {

    /* compiled from: AccessibilityManagerCompat.java */
    @Deprecated
    public interface a {
        @Deprecated
        void onAccessibilityStateChanged(boolean z4);
    }

    /* compiled from: AccessibilityManagerCompat.java */
    @Deprecated
    public static abstract class b implements a {
    }

    /* compiled from: AccessibilityManagerCompat.java */
    /* renamed from: androidx.core.view.accessibility.c$c, reason: collision with other inner class name */
    private static class AccessibilityManagerAccessibilityStateChangeListenerC0437c implements AccessibilityManager.AccessibilityStateChangeListener {

        /* renamed from: b, reason: collision with root package name */
        a f26951b;

        AccessibilityManagerAccessibilityStateChangeListenerC0437c(@androidx.annotation.o0 a aVar) {
            this.f26951b = aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof AccessibilityManagerAccessibilityStateChangeListenerC0437c) {
                return this.f26951b.equals(((AccessibilityManagerAccessibilityStateChangeListenerC0437c) obj).f26951b);
            }
            return false;
        }

        public int hashCode() {
            return this.f26951b.hashCode();
        }

        @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
        public void onAccessibilityStateChanged(boolean z4) {
            this.f26951b.onAccessibilityStateChanged(z4);
        }
    }

    /* compiled from: AccessibilityManagerCompat.java */
    @x0(34)
    static class d {
        private d() {
        }

        static boolean a(AccessibilityManager accessibilityManager) {
            return accessibilityManager.isRequestFromAccessibilityTool();
        }
    }

    /* compiled from: AccessibilityManagerCompat.java */
    public interface e {
        void onTouchExplorationStateChanged(boolean z4);
    }

    /* compiled from: AccessibilityManagerCompat.java */
    private static final class f implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* renamed from: b, reason: collision with root package name */
        final e f26952b;

        f(@androidx.annotation.o0 e eVar) {
            this.f26952b = eVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof f) {
                return this.f26952b.equals(((f) obj).f26952b);
            }
            return false;
        }

        public int hashCode() {
            return this.f26952b.hashCode();
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z4) {
            this.f26952b.onTouchExplorationStateChanged(z4);
        }
    }

    private c() {
    }

    @Deprecated
    public static boolean a(AccessibilityManager accessibilityManager, a aVar) {
        if (aVar == null) {
            return false;
        }
        return accessibilityManager.addAccessibilityStateChangeListener(new AccessibilityManagerAccessibilityStateChangeListenerC0437c(aVar));
    }

    @w0(expression = "manager.addTouchExplorationStateChangeListener(listener)")
    @Deprecated
    public static boolean b(@androidx.annotation.o0 AccessibilityManager accessibilityManager, @androidx.annotation.o0 e eVar) {
        return accessibilityManager.addTouchExplorationStateChangeListener(new f(eVar));
    }

    @w0(expression = "manager.getEnabledAccessibilityServiceList(feedbackTypeFlags)")
    @Deprecated
    public static List<AccessibilityServiceInfo> c(AccessibilityManager accessibilityManager, int i4) {
        return accessibilityManager.getEnabledAccessibilityServiceList(i4);
    }

    @w0(expression = "manager.getInstalledAccessibilityServiceList()")
    @Deprecated
    public static List<AccessibilityServiceInfo> d(AccessibilityManager accessibilityManager) {
        return accessibilityManager.getInstalledAccessibilityServiceList();
    }

    public static boolean e(@androidx.annotation.o0 AccessibilityManager accessibilityManager) {
        if (Build.VERSION.SDK_INT >= 34) {
            return d.a(accessibilityManager);
        }
        return true;
    }

    @w0(expression = "manager.isTouchExplorationEnabled()")
    @Deprecated
    public static boolean f(AccessibilityManager accessibilityManager) {
        return accessibilityManager.isTouchExplorationEnabled();
    }

    @Deprecated
    public static boolean g(AccessibilityManager accessibilityManager, a aVar) {
        if (aVar == null) {
            return false;
        }
        return accessibilityManager.removeAccessibilityStateChangeListener(new AccessibilityManagerAccessibilityStateChangeListenerC0437c(aVar));
    }

    @w0(expression = "manager.removeTouchExplorationStateChangeListener(listener)")
    @Deprecated
    public static boolean h(@androidx.annotation.o0 AccessibilityManager accessibilityManager, @androidx.annotation.o0 e eVar) {
        return accessibilityManager.removeTouchExplorationStateChangeListener(new f(eVar));
    }
}
