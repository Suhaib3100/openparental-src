package androidx.core.view;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.c1;
import androidx.core.view.accessibility.g0;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import k.a;

/* compiled from: AccessibilityDelegateCompat.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    private static final View.AccessibilityDelegate f5301c = new View.AccessibilityDelegate();

    /* renamed from: a, reason: collision with root package name */
    private final View.AccessibilityDelegate f5302a;

    /* renamed from: b, reason: collision with root package name */
    private final View.AccessibilityDelegate f5303b;

    /* compiled from: AccessibilityDelegateCompat.java */
    /* renamed from: androidx.core.view.a$a, reason: collision with other inner class name */
    static final class C0053a extends View.AccessibilityDelegate {

        /* renamed from: a, reason: collision with root package name */
        final a f5304a;

        C0053a(a aVar) {
            this.f5304a = aVar;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f5304a.a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        @androidx.annotation.x0(16)
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            androidx.core.view.accessibility.k0 b6 = this.f5304a.b(view);
            if (b6 != null) {
                return (AccessibilityNodeProvider) b6.e();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f5304a.f(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            androidx.core.view.accessibility.g0 X1 = androidx.core.view.accessibility.g0.X1(accessibilityNodeInfo);
            X1.E1(y1.Z0(view));
            X1.k1(y1.N0(view));
            X1.y1(y1.J(view));
            X1.K1(y1.v0(view));
            this.f5304a.g(view, X1);
            X1.f(accessibilityNodeInfo.getText(), view);
            List<g0.a> c6 = a.c(view);
            for (int i5 = 0; i5 < c6.size(); i5++) {
                X1.b(c6.get(i5));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f5304a.h(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f5304a.i(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i5, Bundle bundle) {
            return this.f5304a.j(view, i5, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i5) {
            this.f5304a.l(view, i5);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f5304a.m(view, accessibilityEvent);
        }
    }

    /* compiled from: AccessibilityDelegateCompat.java */
    @androidx.annotation.x0(16)
    static class b {
        private b() {
        }

        @androidx.annotation.u
        static AccessibilityNodeProvider a(View.AccessibilityDelegate accessibilityDelegate, View view) {
            return accessibilityDelegate.getAccessibilityNodeProvider(view);
        }

        @androidx.annotation.u
        static boolean b(View.AccessibilityDelegate accessibilityDelegate, View view, int i5, Bundle bundle) {
            return accessibilityDelegate.performAccessibilityAction(view, i5, bundle);
        }
    }

    public a() {
        this(f5301c);
    }

    static List<g0.a> c(View view) {
        List<g0.a> list = (List) view.getTag(a.e.f22980d0);
        return list == null ? Collections.emptyList() : list;
    }

    private boolean e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] x5 = androidx.core.view.accessibility.g0.x(view.createAccessibilityNodeInfo().getText());
            for (int i5 = 0; x5 != null && i5 < x5.length; i5++) {
                if (clickableSpan.equals(x5[i5])) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean k(int i5, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(a.e.f22982e0);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i5)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!e(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    public boolean a(@androidx.annotation.o0 View view, @androidx.annotation.o0 AccessibilityEvent accessibilityEvent) {
        return this.f5302a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @androidx.annotation.q0
    public androidx.core.view.accessibility.k0 b(@androidx.annotation.o0 View view) {
        AccessibilityNodeProvider a6 = b.a(this.f5302a, view);
        if (a6 != null) {
            return new androidx.core.view.accessibility.k0(a6);
        }
        return null;
    }

    View.AccessibilityDelegate d() {
        return this.f5303b;
    }

    public void f(@androidx.annotation.o0 View view, @androidx.annotation.o0 AccessibilityEvent accessibilityEvent) {
        this.f5302a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void g(@androidx.annotation.o0 View view, @androidx.annotation.o0 androidx.core.view.accessibility.g0 g0Var) {
        this.f5302a.onInitializeAccessibilityNodeInfo(view, g0Var.W1());
    }

    public void h(@androidx.annotation.o0 View view, @androidx.annotation.o0 AccessibilityEvent accessibilityEvent) {
        this.f5302a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean i(@androidx.annotation.o0 ViewGroup viewGroup, @androidx.annotation.o0 View view, @androidx.annotation.o0 AccessibilityEvent accessibilityEvent) {
        return this.f5302a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean j(@androidx.annotation.o0 View view, int i5, @androidx.annotation.q0 Bundle bundle) {
        List<g0.a> c6 = c(view);
        boolean z5 = false;
        int i6 = 0;
        while (true) {
            if (i6 >= c6.size()) {
                break;
            }
            g0.a aVar = c6.get(i6);
            if (aVar.b() == i5) {
                z5 = aVar.d(view, bundle);
                break;
            }
            i6++;
        }
        if (!z5) {
            z5 = b.b(this.f5302a, view, i5, bundle);
        }
        return (z5 || i5 != a.e.f22973a || bundle == null) ? z5 : k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    public void l(@androidx.annotation.o0 View view, int i5) {
        this.f5302a.sendAccessibilityEvent(view, i5);
    }

    public void m(@androidx.annotation.o0 View view, @androidx.annotation.o0 AccessibilityEvent accessibilityEvent) {
        this.f5302a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public a(@androidx.annotation.o0 View.AccessibilityDelegate accessibilityDelegate) {
        this.f5302a = accessibilityDelegate;
        this.f5303b = new C0053a(this);
    }
}
