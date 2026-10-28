package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.core.view.x1;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: RecyclerViewAccessibilityDelegate.java */
/* loaded from: classes3.dex */
public class b0 extends androidx.core.view.a {

    /* renamed from: e, reason: collision with root package name */
    final RecyclerView f33053e;

    /* renamed from: f, reason: collision with root package name */
    private final a f33054f;

    /* compiled from: RecyclerViewAccessibilityDelegate.java */
    public static class a extends androidx.core.view.a {

        /* renamed from: e, reason: collision with root package name */
        final b0 f33055e;

        /* renamed from: f, reason: collision with root package name */
        private Map<View, androidx.core.view.a> f33056f = new WeakHashMap();

        public a(@o0 b0 b0Var) {
            this.f33055e = b0Var;
        }

        @Override // androidx.core.view.a
        public boolean a(@o0 View view, @o0 AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f33056f.get(view);
            return aVar != null ? aVar.a(view, accessibilityEvent) : super.a(view, accessibilityEvent);
        }

        @Override // androidx.core.view.a
        @q0
        public androidx.core.view.accessibility.m0 b(@o0 View view) {
            androidx.core.view.a aVar = this.f33056f.get(view);
            return aVar != null ? aVar.b(view) : super.b(view);
        }

        @Override // androidx.core.view.a
        public void h(@o0 View view, @o0 AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f33056f.get(view);
            if (aVar != null) {
                aVar.h(view, accessibilityEvent);
            } else {
                super.h(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.a
        public void i(@o0 @SuppressLint({"InvalidNullabilityOverride"}) View view, @o0 @SuppressLint({"InvalidNullabilityOverride"}) androidx.core.view.accessibility.h0 h0Var) {
            if (this.f33055e.s() || this.f33055e.f33053e.getLayoutManager() == null) {
                super.i(view, h0Var);
                return;
            }
            this.f33055e.f33053e.getLayoutManager().onInitializeAccessibilityNodeInfoForItem(view, h0Var);
            androidx.core.view.a aVar = this.f33056f.get(view);
            if (aVar != null) {
                aVar.i(view, h0Var);
            } else {
                super.i(view, h0Var);
            }
        }

        @Override // androidx.core.view.a
        public void j(@o0 View view, @o0 AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f33056f.get(view);
            if (aVar != null) {
                aVar.j(view, accessibilityEvent);
            } else {
                super.j(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.a
        public boolean k(@o0 ViewGroup viewGroup, @o0 View view, @o0 AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f33056f.get(viewGroup);
            return aVar != null ? aVar.k(viewGroup, view, accessibilityEvent) : super.k(viewGroup, view, accessibilityEvent);
        }

        @Override // androidx.core.view.a
        public boolean m(@o0 @SuppressLint({"InvalidNullabilityOverride"}) View view, int i4, @q0 @SuppressLint({"InvalidNullabilityOverride"}) Bundle bundle) {
            if (this.f33055e.s() || this.f33055e.f33053e.getLayoutManager() == null) {
                return super.m(view, i4, bundle);
            }
            androidx.core.view.a aVar = this.f33056f.get(view);
            if (aVar != null) {
                if (aVar.m(view, i4, bundle)) {
                    return true;
                }
            } else if (super.m(view, i4, bundle)) {
                return true;
            }
            return this.f33055e.f33053e.getLayoutManager().performAccessibilityActionForItem(view, i4, bundle);
        }

        @Override // androidx.core.view.a
        public void p(@o0 View view, int i4) {
            androidx.core.view.a aVar = this.f33056f.get(view);
            if (aVar != null) {
                aVar.p(view, i4);
            } else {
                super.p(view, i4);
            }
        }

        @Override // androidx.core.view.a
        public void q(@o0 View view, @o0 AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f33056f.get(view);
            if (aVar != null) {
                aVar.q(view, accessibilityEvent);
            } else {
                super.q(view, accessibilityEvent);
            }
        }

        androidx.core.view.a r(View view) {
            return this.f33056f.remove(view);
        }

        void s(View view) {
            androidx.core.view.a E = x1.E(view);
            if (E == null || E == this) {
                return;
            }
            this.f33056f.put(view, E);
        }
    }

    public b0(@o0 RecyclerView recyclerView) {
        this.f33053e = recyclerView;
        androidx.core.view.a r4 = r();
        if (r4 == null || !(r4 instanceof a)) {
            this.f33054f = new a(this);
        } else {
            this.f33054f = (a) r4;
        }
    }

    @Override // androidx.core.view.a
    public void h(@o0 @SuppressLint({"InvalidNullabilityOverride"}) View view, @o0 @SuppressLint({"InvalidNullabilityOverride"}) AccessibilityEvent accessibilityEvent) {
        super.h(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || s()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().onInitializeAccessibilityEvent(accessibilityEvent);
        }
    }

    @Override // androidx.core.view.a
    public void i(@o0 @SuppressLint({"InvalidNullabilityOverride"}) View view, @o0 @SuppressLint({"InvalidNullabilityOverride"}) androidx.core.view.accessibility.h0 h0Var) {
        super.i(view, h0Var);
        if (s() || this.f33053e.getLayoutManager() == null) {
            return;
        }
        this.f33053e.getLayoutManager().onInitializeAccessibilityNodeInfo(h0Var);
    }

    @Override // androidx.core.view.a
    public boolean m(@o0 @SuppressLint({"InvalidNullabilityOverride"}) View view, int i4, @q0 @SuppressLint({"InvalidNullabilityOverride"}) Bundle bundle) {
        if (super.m(view, i4, bundle)) {
            return true;
        }
        if (s() || this.f33053e.getLayoutManager() == null) {
            return false;
        }
        return this.f33053e.getLayoutManager().performAccessibilityAction(i4, bundle);
    }

    @o0
    public androidx.core.view.a r() {
        return this.f33054f;
    }

    boolean s() {
        return this.f33053e.hasPendingAdapterUpdates();
    }
}
