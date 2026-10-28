package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: ViewGroupCompat.java */
/* loaded from: classes.dex */
public final class m3 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f5596a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f5597b = 1;

    /* compiled from: ViewGroupCompat.java */
    @androidx.annotation.x0(18)
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static int a(ViewGroup viewGroup) {
            return viewGroup.getLayoutMode();
        }

        @androidx.annotation.u
        static void b(ViewGroup viewGroup, int i5) {
            viewGroup.setLayoutMode(i5);
        }
    }

    /* compiled from: ViewGroupCompat.java */
    @androidx.annotation.x0(21)
    static class b {
        private b() {
        }

        @androidx.annotation.u
        static int a(ViewGroup viewGroup) {
            return viewGroup.getNestedScrollAxes();
        }

        @androidx.annotation.u
        static boolean b(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }

        @androidx.annotation.u
        static void c(ViewGroup viewGroup, boolean z5) {
            viewGroup.setTransitionGroup(z5);
        }
    }

    private m3() {
    }

    public static int a(@androidx.annotation.o0 ViewGroup viewGroup) {
        return a.a(viewGroup);
    }

    public static int b(@androidx.annotation.o0 ViewGroup viewGroup) {
        return b.a(viewGroup);
    }

    public static boolean c(@androidx.annotation.o0 ViewGroup viewGroup) {
        return b.b(viewGroup);
    }

    @Deprecated
    public static boolean d(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return viewGroup.onRequestSendAccessibilityEvent(view, accessibilityEvent);
    }

    public static void e(@androidx.annotation.o0 ViewGroup viewGroup, int i5) {
        a.b(viewGroup, i5);
    }

    @Deprecated
    public static void f(ViewGroup viewGroup, boolean z5) {
        viewGroup.setMotionEventSplittingEnabled(z5);
    }

    public static void g(@androidx.annotation.o0 ViewGroup viewGroup, boolean z5) {
        b.c(viewGroup, z5);
    }
}
