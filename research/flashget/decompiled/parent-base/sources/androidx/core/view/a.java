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
import androidx.core.view.accessibility.h0;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import z0.a;

/* compiled from: AccessibilityDelegateCompat.java */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: d, reason: collision with root package name */
    private static final View.AccessibilityDelegate f26915d = new View.AccessibilityDelegate();

    /* renamed from: b, reason: collision with root package name */
    private final View.AccessibilityDelegate f26916b;

    /* renamed from: c, reason: collision with root package name */
    private final View.AccessibilityDelegate f26917c;

    /* compiled from: AccessibilityDelegateCompat.java */
    /* renamed from: androidx.core.view.a$a, reason: collision with other inner class name */
    static final class C0435a extends View.AccessibilityDelegate {

        /* renamed from: a, reason: collision with root package name */
        final a f26918a;

        C0435a(a aVar) {
            this.f26918a = aVar;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f26918a.a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            androidx.core.view.accessibility.m0 b5 = this.f26918a.b(view);
            if (b5 != null) {
                return (AccessibilityNodeProvider) b5.e();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f26918a.h(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            androidx.core.view.accessibility.h0 r22 = androidx.core.view.accessibility.h0.r2(accessibilityNodeInfo);
            r22.W1(x1.d1(view));
            r22.z1(x1.Q0(view));
            r22.O1(x1.J(view));
            r22.c2(x1.y0(view));
            this.f26918a.i(view, r22);
            r22.f(accessibilityNodeInfo.getText(), view);
            List<h0.a> d5 = a.d(view);
            for (int i4 = 0; i4 < d5.size(); i4++) {
                r22.b(d5.get(i4));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f26918a.j(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f26918a.k(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i4, Bundle bundle) {
            return this.f26918a.m(view, i4, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i4) {
            this.f26918a.p(view, i4);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f26918a.q(view, accessibilityEvent);
        }
    }

    public a() {
        this(f26915d);
    }

    static List<h0.a> d(View view) {
        List<h0.a> list = (List) view.getTag(a.e.f93567f0);
        return list == null ? Collections.emptyList() : list;
    }

    private boolean g(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] z4 = androidx.core.view.accessibility.h0.z(view.createAccessibilityNodeInfo().getText());
            for (int i4 = 0; z4 != null && i4 < z4.length; i4++) {
                if (clickableSpan.equals(z4[i4])) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean o(int i4, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(a.e.f93569g0);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i4)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!g(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    public boolean a(@androidx.annotation.o0 View view, @androidx.annotation.o0 AccessibilityEvent accessibilityEvent) {
        return this.f26916b.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @androidx.annotation.q0
    public androidx.core.view.accessibility.m0 b(@androidx.annotation.o0 View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f26916b.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new androidx.core.view.accessibility.m0(accessibilityNodeProvider);
        }
        return null;
    }

    View.AccessibilityDelegate e() {
        return this.f26917c;
    }

    public void h(@androidx.annotation.o0 View view, @androidx.annotation.o0 AccessibilityEvent accessibilityEvent) {
        this.f26916b.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void i(@androidx.annotation.o0 View view, @androidx.annotation.o0 androidx.core.view.accessibility.h0 h0Var) {
        this.f26916b.onInitializeAccessibilityNodeInfo(view, h0Var.q2());
    }

    public void j(@androidx.annotation.o0 View view, @androidx.annotation.o0 AccessibilityEvent accessibilityEvent) {
        this.f26916b.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean k(@androidx.annotation.o0 ViewGroup viewGroup, @androidx.annotation.o0 View view, @androidx.annotation.o0 AccessibilityEvent accessibilityEvent) {
        return this.f26916b.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean m(@androidx.annotation.o0 View view, int i4, @androidx.annotation.q0 Bundle bundle) {
        List<h0.a> d5 = d(view);
        boolean z4 = false;
        int i5 = 0;
        while (true) {
            if (i5 >= d5.size()) {
                break;
            }
            h0.a aVar = d5.get(i5);
            if (aVar.b() == i4) {
                z4 = aVar.d(view, bundle);
                break;
            }
            i5++;
        }
        if (!z4) {
            z4 = this.f26916b.performAccessibilityAction(view, i4, bundle);
        }
        return (z4 || i4 != a.e.f93556a || bundle == null) ? z4 : o(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    public void p(@androidx.annotation.o0 View view, int i4) {
        this.f26916b.sendAccessibilityEvent(view, i4);
    }

    public void q(@androidx.annotation.o0 View view, @androidx.annotation.o0 AccessibilityEvent accessibilityEvent) {
        this.f26916b.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public a(@androidx.annotation.o0 View.AccessibilityDelegate accessibilityDelegate) {
        this.f26916b = accessibilityDelegate;
        this.f26917c = new C0435a(this);
    }
}
