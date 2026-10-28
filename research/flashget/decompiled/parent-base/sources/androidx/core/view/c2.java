package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: ViewGroupCompat.java */
/* loaded from: classes3.dex */
public final class c2 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f27086a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f27087b = 1;

    /* compiled from: ViewGroupCompat.java */
    @androidx.annotation.x0(21)
    static class a {
        private a() {
        }

        static int a(ViewGroup viewGroup) {
            return viewGroup.getNestedScrollAxes();
        }

        static boolean b(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }

        static void c(ViewGroup viewGroup, boolean z4) {
            viewGroup.setTransitionGroup(z4);
        }
    }

    private c2() {
    }

    @androidx.annotation.w0(expression = "group.getLayoutMode()")
    @Deprecated
    public static int a(@androidx.annotation.o0 ViewGroup viewGroup) {
        return viewGroup.getLayoutMode();
    }

    public static int b(@androidx.annotation.o0 ViewGroup viewGroup) {
        return viewGroup.getNestedScrollAxes();
    }

    public static boolean c(@androidx.annotation.o0 ViewGroup viewGroup) {
        return viewGroup.isTransitionGroup();
    }

    @androidx.annotation.w0(expression = "group.onRequestSendAccessibilityEvent(child, event)")
    @Deprecated
    public static boolean d(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return viewGroup.onRequestSendAccessibilityEvent(view, accessibilityEvent);
    }

    @androidx.annotation.w0(expression = "group.setLayoutMode(mode)")
    @Deprecated
    public static void e(@androidx.annotation.o0 ViewGroup viewGroup, int i4) {
        viewGroup.setLayoutMode(i4);
    }

    @androidx.annotation.w0(expression = "group.setMotionEventSplittingEnabled(split)")
    @Deprecated
    public static void f(ViewGroup viewGroup, boolean z4) {
        viewGroup.setMotionEventSplittingEnabled(z4);
    }

    public static void g(@androidx.annotation.o0 ViewGroup viewGroup, boolean z4) {
        viewGroup.setTransitionGroup(z4);
    }
}
